package com.example;

import com.boulder.autowars.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Utils Tests")
public class UtilsTest {

    @Test
    @DisplayName("Test loadJson()")
    void testLoadJson() {
        Assertions.assertEquals("[\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"WAUBVAFB4BN838575\",\n" +
                "    \"make\": \"Acura\",\n" +
                "    \"model\": \"TL\",\n" +
                "    \"color\": \"Turquoise\",\n" +
                "    \"year\": 2000,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 77622,\n" +
                "    \"price\": 73791.16,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-04-04T08:43:30Z\",\n" +
                "      \"lastInsured\": \"2018-06-07T12:35:52Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"WVGAV7AX4BW279085\",\n" +
                "    \"make\": \"Land Rover\",\n" +
                "    \"model\": \"Discovery\",\n" +
                "    \"color\": \"Turquoise\",\n" +
                "    \"year\": 1996,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 50055,\n" +
                "    \"price\": 64389.78,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-10-06T15:09:48Z\",\n" +
                "      \"lastInsured\": \"2018-05-15T13:28:07Z\"\n" +
                "    },\n" +
                "    \"fuel\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"JN1AJ0HP3AM005192\",\n" +
                "    \"make\": \"BMW\",\n" +
                "    \"model\": \"Z4 M\",\n" +
                "    \"color\": \"Purple\",\n" +
                "    \"year\": 2006,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 30047,\n" +
                "    \"price\": 55959.26,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-10-13T14:53:49Z\",\n" +
                "      \"lastInsured\": \"2018-09-09T17:40:46Z\"\n" +
                "    },\n" +
                "    \"fuel\": 10\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"1GYS3MKJ8FR924133\",\n" +
                "    \"make\": \"Toyota\",\n" +
                "    \"model\": \"Camry\",\n" +
                "    \"color\": \"Violet\",\n" +
                "    \"year\": 2002,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 213,\n" +
                "    \"price\": 45137.45,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-06-02T14:47:48Z\",\n" +
                "      \"lastInsured\": \"2018-09-05T16:15:19Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"YV4960DL4A2198997\",\n" +
                "    \"make\": \"Lotus\",\n" +
                "    \"model\": \"Elan\",\n" +
                "    \"color\": \"Yellow\",\n" +
                "    \"year\": 1992,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 87064,\n" +
                "    \"price\": 18049.83,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-10-31T20:00:41Z\",\n" +
                "      \"lastInsured\": \"2019-02-02T05:25:21Z\"\n" +
                "    },\n" +
                "    \"fuel\": 13\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"WBAEU334X3P495522\",\n" +
                "    \"make\": \"Land Rover\",\n" +
                "    \"model\": \"Range Rover\",\n" +
                "    \"color\": \"Puce\",\n" +
                "    \"year\": 2001,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 38782,\n" +
                "    \"price\": 10663.14,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2019-03-04T13:50:10Z\",\n" +
                "      \"lastInsured\": \"2018-06-22T14:17:14Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"1J4NF1FB1AD124348\",\n" +
                "    \"make\": \"Maserati\",\n" +
                "    \"model\": \"Coupe\",\n" +
                "    \"color\": \"Yellow\",\n" +
                "    \"year\": 2005,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 95715,\n" +
                "    \"price\": 38690.04,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-07-09T15:06:05Z\",\n" +
                "      \"lastInsured\": \"2018-11-28T20:45:33Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"5FPYK1F51EB826748\",\n" +
                "    \"make\": \"Ford\",\n" +
                "    \"model\": \"Aerostar\",\n" +
                "    \"color\": \"Purple\",\n" +
                "    \"year\": 1987,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 86765,\n" +
                "    \"price\": 32367.73,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-02-16T14:17:10Z\",\n" +
                "      \"lastInsured\": \"2018-02-16T15:59:03Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"WAURVAFD7CN810027\",\n" +
                "    \"make\": \"Dodge\",\n" +
                "    \"model\": \"Ram Van 2500\",\n" +
                "    \"color\": \"Purple\",\n" +
                "    \"year\": 2002,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 89956,\n" +
                "    \"price\": 49671.0,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2019-03-18T19:15:45Z\",\n" +
                "      \"lastInsured\": \"2018-03-10T08:25:08Z\"\n" +
                "    },\n" +
                "    \"fuel\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"WAUAFAFL3FN071955\",\n" +
                "    \"make\": \"Chevrolet\",\n" +
                "    \"model\": \"Impala\",\n" +
                "    \"color\": \"Green\",\n" +
                "    \"year\": 2006,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 6713,\n" +
                "    \"price\": 23162.96,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-12-03T11:15:30Z\",\n" +
                "      \"lastInsured\": \"2018-09-21T21:31:31Z\"\n" +
                "    },\n" +
                "    \"fuel\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"19XFA1F3XBE171847\",\n" +
                "    \"make\": \"Dodge\",\n" +
                "    \"model\": \"Viper\",\n" +
                "    \"color\": \"Purple\",\n" +
                "    \"year\": 1992,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 96320,\n" +
                "    \"price\": 16323.13,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-03-28T22:47:49Z\",\n" +
                "      \"lastInsured\": \"2018-06-30T23:05:44Z\"\n" +
                "    },\n" +
                "    \"fuel\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"WDDGF5EB6AF150719\",\n" +
                "    \"make\": \"Mitsubishi\",\n" +
                "    \"model\": \"Pajero\",\n" +
                "    \"color\": \"Goldenrod\",\n" +
                "    \"year\": 1998,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 69993,\n" +
                "    \"price\": 13750.73,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-02-12T04:35:37Z\",\n" +
                "      \"lastInsured\": \"2018-04-18T12:52:30Z\"\n" +
                "    },\n" +
                "    \"fuel\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"WA1CGAFE7BD870366\",\n" +
                "    \"make\": \"Mazda\",\n" +
                "    \"model\": \"Mazda3\",\n" +
                "    \"color\": \"Indigo\",\n" +
                "    \"year\": 2011,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 18056,\n" +
                "    \"price\": 52958.07,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-01-16T06:08:26Z\",\n" +
                "      \"lastInsured\": \"2018-05-05T04:42:47Z\"\n" +
                "    },\n" +
                "    \"fuel\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"3GYFNEE36FS245229\",\n" +
                "    \"make\": \"MINI\",\n" +
                "    \"model\": \"Cooper Countryman\",\n" +
                "    \"color\": \"Fuscia\",\n" +
                "    \"year\": 2011,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 27544,\n" +
                "    \"price\": 63497.35,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-03-14T00:19:33Z\",\n" +
                "      \"lastInsured\": \"2018-07-03T10:32:56Z\"\n" +
                "    },\n" +
                "    \"fuel\": 12\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"KMHEC4A48FA330909\",\n" +
                "    \"make\": \"BMW\",\n" +
                "    \"model\": \"745\",\n" +
                "    \"color\": \"Puce\",\n" +
                "    \"year\": 2002,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 51437,\n" +
                "    \"price\": 7473.24,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-03-17T15:37:16Z\",\n" +
                "      \"lastInsured\": \"2018-05-04T20:34:36Z\"\n" +
                "    },\n" +
                "    \"fuel\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"SCFBF04B88G209848\",\n" +
                "    \"make\": \"Honda\",\n" +
                "    \"model\": \"Accord\",\n" +
                "    \"color\": \"Khaki\",\n" +
                "    \"year\": 1994,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 39888,\n" +
                "    \"price\": 45102.01,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2019-02-13T22:53:45Z\",\n" +
                "      \"lastInsured\": \"2018-07-18T09:42:50Z\"\n" +
                "    },\n" +
                "    \"fuel\": 10\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"JN1AZ4EH0CM395796\",\n" +
                "    \"make\": \"Dodge\",\n" +
                "    \"model\": \"Dakota Club\",\n" +
                "    \"color\": \"Yellow\",\n" +
                "    \"year\": 1995,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 43696,\n" +
                "    \"price\": 33781.33,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-02-01T16:22:33Z\",\n" +
                "      \"lastInsured\": \"2018-08-06T22:51:49Z\"\n" +
                "    },\n" +
                "    \"fuel\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"1G6AA5RA5E0080125\",\n" +
                "    \"make\": \"Dodge\",\n" +
                "    \"model\": \"Neon\",\n" +
                "    \"color\": \"Fuscia\",\n" +
                "    \"year\": 2002,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 23633,\n" +
                "    \"price\": 72555.09,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2019-02-27T07:33:41Z\",\n" +
                "      \"lastInsured\": \"2018-05-06T16:34:30Z\"\n" +
                "    },\n" +
                "    \"fuel\": 13\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"KNAGG4A82A5491176\",\n" +
                "    \"make\": \"Mercury\",\n" +
                "    \"model\": \"Cougar\",\n" +
                "    \"color\": \"Red\",\n" +
                "    \"year\": 1999,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 48487,\n" +
                "    \"price\": 76404.62,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2019-01-21T18:09:22Z\",\n" +
                "      \"lastInsured\": \"2018-05-13T13:01:34Z\"\n" +
                "    },\n" +
                "    \"fuel\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"1GYS3DEF1DR763287\",\n" +
                "    \"make\": \"Chevrolet\",\n" +
                "    \"model\": \"Impala SS\",\n" +
                "    \"color\": \"Maroon\",\n" +
                "    \"year\": 1995,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 74286,\n" +
                "    \"price\": 36605.59,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-08-02T16:25:47Z\",\n" +
                "      \"lastInsured\": \"2018-12-03T18:47:00Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"1D7RB1CP6BS379793\",\n" +
                "    \"make\": \"Isuzu\",\n" +
                "    \"model\": \"Ascender\",\n" +
                "    \"color\": \"Aquamarine\",\n" +
                "    \"year\": 2006,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 64588,\n" +
                "    \"price\": 44744.33,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-08-08T06:12:40Z\",\n" +
                "      \"lastInsured\": \"2019-01-13T04:21:18Z\"\n" +
                "    },\n" +
                "    \"fuel\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"3D7JB1EPXBG784489\",\n" +
                "    \"make\": \"Ford\",\n" +
                "    \"model\": \"Explorer Sport Trac\",\n" +
                "    \"color\": \"Indigo\",\n" +
                "    \"year\": 2007,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 77802,\n" +
                "    \"price\": 55926.29,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-12-05T04:18:08Z\",\n" +
                "      \"lastInsured\": \"2019-01-27T22:55:37Z\"\n" +
                "    },\n" +
                "    \"fuel\": 12\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"SCBBB7ZH8BC578906\",\n" +
                "    \"make\": \"Audi\",\n" +
                "    \"model\": \"A6\",\n" +
                "    \"color\": \"Pink\",\n" +
                "    \"year\": 2009,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 14957,\n" +
                "    \"price\": 25685.47,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-10-04T18:03:41Z\",\n" +
                "      \"lastInsured\": \"2018-06-21T11:13:33Z\"\n" +
                "    },\n" +
                "    \"fuel\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"1G6DX67D870065684\",\n" +
                "    \"make\": \"Toyota\",\n" +
                "    \"model\": \"Corolla\",\n" +
                "    \"color\": \"Violet\",\n" +
                "    \"year\": 1998,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 26309,\n" +
                "    \"price\": 64367.16,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-05-11T13:07:23Z\",\n" +
                "      \"lastInsured\": \"2019-02-23T15:53:56Z\"\n" +
                "    },\n" +
                "    \"fuel\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"2C4RDGBG4CR243318\",\n" +
                "    \"make\": \"Lexus\",\n" +
                "    \"model\": \"GS\",\n" +
                "    \"color\": \"Red\",\n" +
                "    \"year\": 1997,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 77803,\n" +
                "    \"price\": 86467.18,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-03-19T09:42:32Z\",\n" +
                "      \"lastInsured\": \"2018-01-17T06:19:32Z\"\n" +
                "    },\n" +
                "    \"fuel\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"3C3CFFCR0ET625585\",\n" +
                "    \"make\": \"Honda\",\n" +
                "    \"model\": \"del Sol\",\n" +
                "    \"color\": \"Mauv\",\n" +
                "    \"year\": 1996,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 32571,\n" +
                "    \"price\": 74054.38,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-10-19T00:06:01Z\",\n" +
                "      \"lastInsured\": \"2018-01-09T12:53:08Z\"\n" +
                "    },\n" +
                "    \"fuel\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"3C6JD6BP8CG179210\",\n" +
                "    \"make\": \"Jeep\",\n" +
                "    \"model\": \"Grand Cherokee\",\n" +
                "    \"color\": \"Puce\",\n" +
                "    \"year\": 1997,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 75408,\n" +
                "    \"price\": 48001.09,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-06-23T06:31:43Z\",\n" +
                "      \"lastInsured\": \"2018-07-29T16:19:33Z\"\n" +
                "    },\n" +
                "    \"fuel\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"JM1DE1HY5B0035980\",\n" +
                "    \"make\": \"Austin\",\n" +
                "    \"model\": \"Mini Cooper S\",\n" +
                "    \"color\": \"Goldenrod\",\n" +
                "    \"year\": 1963,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 68464,\n" +
                "    \"price\": 32690.44,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2019-02-20T03:36:26Z\",\n" +
                "      \"lastInsured\": \"2018-08-29T09:35:14Z\"\n" +
                "    },\n" +
                "    \"fuel\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"1G4HD572X8U338730\",\n" +
                "    \"make\": \"GMC\",\n" +
                "    \"model\": \"Safari\",\n" +
                "    \"color\": \"Blue\",\n" +
                "    \"year\": 1999,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 72659,\n" +
                "    \"price\": 48313.06,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-07-09T21:38:40Z\",\n" +
                "      \"lastInsured\": \"2018-07-08T16:01:47Z\"\n" +
                "    },\n" +
                "    \"fuel\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"WAUHF78P28A711598\",\n" +
                "    \"make\": \"Mercury\",\n" +
                "    \"model\": \"Mariner\",\n" +
                "    \"color\": \"Pink\",\n" +
                "    \"year\": 2007,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 22979,\n" +
                "    \"price\": 55367.2,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-11-08T09:34:23Z\",\n" +
                "      \"lastInsured\": \"2019-03-19T13:26:21Z\"\n" +
                "    },\n" +
                "    \"fuel\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"WBA3N3C54EK879986\",\n" +
                "    \"make\": \"Volvo\",\n" +
                "    \"model\": \"V40\",\n" +
                "    \"color\": \"Yellow\",\n" +
                "    \"year\": 2001,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 94206,\n" +
                "    \"price\": 87080.56,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-09-30T13:54:42Z\",\n" +
                "      \"lastInsured\": \"2018-05-28T16:05:05Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"3VW8S7AT5FM108258\",\n" +
                "    \"make\": \"Honda\",\n" +
                "    \"model\": \"Civic\",\n" +
                "    \"color\": \"Crimson\",\n" +
                "    \"year\": 2007,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 13518,\n" +
                "    \"price\": 59598.5,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-04-28T12:28:24Z\",\n" +
                "      \"lastInsured\": \"2018-11-30T23:57:01Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"TRUTC28N261818970\",\n" +
                "    \"make\": \"Chevrolet\",\n" +
                "    \"model\": \"Astro\",\n" +
                "    \"color\": \"Indigo\",\n" +
                "    \"year\": 2003,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 34845,\n" +
                "    \"price\": 22453.56,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-08-01T10:49:00Z\",\n" +
                "      \"lastInsured\": \"2018-09-28T02:26:56Z\"\n" +
                "    },\n" +
                "    \"fuel\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"SALFR2BN6BH714684\",\n" +
                "    \"make\": \"BMW\",\n" +
                "    \"model\": \"3 Series\",\n" +
                "    \"color\": \"Yellow\",\n" +
                "    \"year\": 2011,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 75172,\n" +
                "    \"price\": 83048.12,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-07-06T22:42:56Z\",\n" +
                "      \"lastInsured\": \"2019-03-07T21:55:09Z\"\n" +
                "    },\n" +
                "    \"fuel\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"1GT01ZCG1EF257862\",\n" +
                "    \"make\": \"Mazda\",\n" +
                "    \"model\": \"CX-9\",\n" +
                "    \"color\": \"Aquamarine\",\n" +
                "    \"year\": 2011,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 57796,\n" +
                "    \"price\": 59351.64,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-11-14T10:32:52Z\",\n" +
                "      \"lastInsured\": \"2018-02-19T22:47:04Z\"\n" +
                "    },\n" +
                "    \"fuel\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"5UMDU93597L863157\",\n" +
                "    \"make\": \"Suzuki\",\n" +
                "    \"model\": \"SJ\",\n" +
                "    \"color\": \"Yellow\",\n" +
                "    \"year\": 1986,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 2497,\n" +
                "    \"price\": 41063.4,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-08-20T08:07:24Z\",\n" +
                "      \"lastInsured\": \"2018-07-14T17:30:33Z\"\n" +
                "    },\n" +
                "    \"fuel\": 13\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"1B3CC5FB1AN728037\",\n" +
                "    \"make\": \"Chevrolet\",\n" +
                "    \"model\": \"Tahoe\",\n" +
                "    \"color\": \"Purple\",\n" +
                "    \"year\": 2004,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 51267,\n" +
                "    \"price\": 11889.78,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2019-02-24T15:00:57Z\",\n" +
                "      \"lastInsured\": \"2018-12-28T07:43:22Z\"\n" +
                "    },\n" +
                "    \"fuel\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"1FMCU5K3XAK397446\",\n" +
                "    \"make\": \"Ford\",\n" +
                "    \"model\": \"Escort\",\n" +
                "    \"color\": \"Blue\",\n" +
                "    \"year\": 2000,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 54651,\n" +
                "    \"price\": 17932.05,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-02-01T11:16:20Z\",\n" +
                "      \"lastInsured\": \"2018-12-23T10:27:49Z\"\n" +
                "    },\n" +
                "    \"fuel\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"JN8BS1MW5DM155525\",\n" +
                "    \"make\": \"Cadillac\",\n" +
                "    \"model\": \"Escalade\",\n" +
                "    \"color\": \"Aquamarine\",\n" +
                "    \"year\": 1999,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 74214,\n" +
                "    \"price\": 42880.21,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-09-20T05:50:38Z\",\n" +
                "      \"lastInsured\": \"2018-01-14T07:37:41Z\"\n" +
                "    },\n" +
                "    \"fuel\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"2C3CDXJG2CH546194\",\n" +
                "    \"make\": \"Mercedes-Benz\",\n" +
                "    \"model\": \"S-Class\",\n" +
                "    \"color\": \"Red\",\n" +
                "    \"year\": 1988,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 42037,\n" +
                "    \"price\": 15778.29,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-12-31T23:08:17Z\",\n" +
                "      \"lastInsured\": \"2018-12-06T19:45:14Z\"\n" +
                "    },\n" +
                "    \"fuel\": 12\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"WVGBF7A96AD125006\",\n" +
                "    \"make\": \"Daihatsu\",\n" +
                "    \"model\": \"Charade\",\n" +
                "    \"color\": \"Mauv\",\n" +
                "    \"year\": 1992,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 40440,\n" +
                "    \"price\": 12303.06,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-09-07T15:31:17Z\",\n" +
                "      \"lastInsured\": \"2019-03-17T08:57:17Z\"\n" +
                "    },\n" +
                "    \"fuel\": 12\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"car\",\n" +
                "    \"vin\": \"WAUWGAFC9DN583915\",\n" +
                "    \"make\": \"Audi\",\n" +
                "    \"model\": \"TT\",\n" +
                "    \"color\": \"Aquamarine\",\n" +
                "    \"year\": 2012,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 49649,\n" +
                "    \"price\": 73581.77,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-06-14T10:09:35Z\",\n" +
                "      \"lastInsured\": \"2018-01-07T04:59:59Z\"\n" +
                "    },\n" +
                "    \"fuel\": 13\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"JHMFA3F25BS376703\",\n" +
                "    \"make\": \"Jeep\",\n" +
                "    \"model\": \"Grand Cherokee\",\n" +
                "    \"color\": \"Blue\",\n" +
                "    \"year\": 2008,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 5956,\n" +
                "    \"price\": 75419.91,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-09-13T23:40:26Z\",\n" +
                "      \"lastInsured\": \"2018-07-27T07:53:48Z\"\n" +
                "    },\n" +
                "    \"fuel\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"1FTFW1E85AK308605\",\n" +
                "    \"make\": \"Suzuki\",\n" +
                "    \"model\": \"Grand Vitara\",\n" +
                "    \"color\": \"Yellow\",\n" +
                "    \"year\": 2001,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 90355,\n" +
                "    \"price\": 68274.35,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-07-06T05:19:50Z\",\n" +
                "      \"lastInsured\": \"2018-05-30T04:42:01Z\"\n" +
                "    },\n" +
                "    \"fuel\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"truck\",\n" +
                "    \"vin\": \"1FTEX1CM1DK603567\",\n" +
                "    \"make\": \"Honda\",\n" +
                "    \"model\": \"Accord\",\n" +
                "    \"color\": \"Purple\",\n" +
                "    \"year\": 1988,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 38202,\n" +
                "    \"price\": 52032.91,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-12-09T13:00:23Z\",\n" +
                "      \"lastInsured\": \"2018-05-22T04:13:41Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"TRUSX28N021599582\",\n" +
                "    \"make\": \"Dodge\",\n" +
                "    \"model\": \"Ram Van 3500\",\n" +
                "    \"color\": \"Crimson\",\n" +
                "    \"year\": 1995,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 35838,\n" +
                "    \"price\": 11893.56,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2019-03-16T22:03:45Z\",\n" +
                "      \"lastInsured\": \"2018-07-05T20:17:18Z\"\n" +
                "    },\n" +
                "    \"fuel\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"1GYEK63N52R802367\",\n" +
                "    \"make\": \"Chevrolet\",\n" +
                "    \"model\": \"Silverado 1500\",\n" +
                "    \"color\": \"Indigo\",\n" +
                "    \"year\": 1999,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 56423,\n" +
                "    \"price\": 26557.23,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-03-13T04:20:49Z\",\n" +
                "      \"lastInsured\": \"2018-02-05T10:10:18Z\"\n" +
                "    },\n" +
                "    \"fuel\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"WBAVB17506N234221\",\n" +
                "    \"make\": \"Volkswagen\",\n" +
                "    \"model\": \"Golf\",\n" +
                "    \"color\": \"Indigo\",\n" +
                "    \"year\": 1992,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 94079,\n" +
                "    \"price\": 39008.48,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": true,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-03-02T18:23:40Z\",\n" +
                "      \"lastInsured\": \"2019-02-23T15:45:54Z\"\n" +
                "    },\n" +
                "    \"fuel\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"motorcycle\",\n" +
                "    \"vin\": \"JM3TB2BA1E0894601\",\n" +
                "    \"make\": \"Kia\",\n" +
                "    \"model\": \"Spectra\",\n" +
                "    \"color\": \"Puce\",\n" +
                "    \"year\": 2008,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 33461,\n" +
                "    \"price\": 11572.71,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-04-05T03:42:59Z\",\n" +
                "      \"lastInsured\": \"2018-07-02T05:36:35Z\"\n" +
                "    },\n" +
                "    \"fuel\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"type\": \"ev\",\n" +
                "    \"vin\": \"WA1EY74L39D411839\",\n" +
                "    \"make\": \"Ford\",\n" +
                "    \"model\": \"Freestar\",\n" +
                "    \"color\": \"Turquoise\",\n" +
                "    \"year\": 2007,\n" +
                "    \"wheels\": 0,\n" +
                "    \"mileage\": 80019,\n" +
                "    \"price\": 50633.63,\n" +
                "    \"description\": 0,\n" +
                "    \"costToDealership\": 0,\n" +
                "    \"clean\": false,\n" +
                "    \"maintenanceAndInsurance\": {\n" +
                "      \"lastServiced\": \"2018-12-03T17:25:48Z\",\n" +
                "      \"lastInsured\": \"2018-06-01T01:49:17Z\"\n" +
                "    },\n" +
                "    \"fuel\": 15\n" +
                "  }\n" +
                "]", com.boulder.autowars.Utils.loadJson());
    }
}
