/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0daf0..0xa0fdb8 (8904 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0daf0_1 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
    char field_8;
    char field_9;
    char field_a;
    char field_b;
    char field_c;
    char field_d;
    char field_e;
    char field_f;
    char field_10;
    char field_11;
    char field_12;
    char field_13;
    char field_14;
    char field_15;
    char field_16;
    char field_17;
    char field_18;
    char field_19;
    char field_1a;
    char field_1b;
    char field_1c;
    char field_1d;
    char field_1e;
    char field_1f;
} st_a0daf0_1;

typedef struct st_a0daf0_0 {
    unsigned int field_0;
    char field_4;
    char field_5;
    char field_6;
    unsigned int field_7;
    char field_b;
    char field_c;
    unsigned int field_d;
    char field_11;
    char field_12;
    char field_13;
    unsigned int field_14;
    char field_18;
    char field_19;
    unsigned int field_1a;
    char field_1e;
    char field_1f;
} st_a0daf0_0;

extern long long g_d3c8e3;
extern char g_10002b0;

long long sub_a0daf0(st_a0daf0_1 *a0, uint128_t *a1, st_a0daf0_0 *a2)
{
    uint128_t v66;  // w8
    unsigned long long v67;  // x9
    unsigned long v76;  // x0
    unsigned long v166;  // 4430
    unsigned long long v1066;  // x12
    unsigned long v1067;  // 4556
    unsigned long long v1068;  // x10
    unsigned long long v1069;  // x11
    unsigned long long v1070;  // 4557
    unsigned long long v1071;  // x14
    unsigned long long v1072;  // x13
    uint128_t v1074;  // x8
    uint128_t v1075;  // x13
    unsigned long long v167;  // x13
    uint128_t v1076;  // x10
    uint128_t v1077;  // x14
    uint128_t v1078;  // x9
    uint128_t v1079;  // x16
    unsigned long long v1080;  // x11
    uint128_t v1081;  // x0
    unsigned long long v1082;  // x2
    unsigned long long v1083;  // x4
    unsigned long long v1084;  // x5
    uint128_t v1085;  // x7
    unsigned long v168;  // x19
    uint128_t v1086;  // x20
    unsigned long long v1087;  // x2
    unsigned long v1088;  // 4319
    unsigned long long v1089;  // x13
    uint128_t v1090;  // x20
    unsigned long long v1091;  // x23
    uint128_t v1092;  // x25
    unsigned long long v1093;  // x0
    unsigned long v1094;  // 4356
    unsigned long long v1095;  // x24
    unsigned long long v169;  // x9
    unsigned long long v1096;  // x24
    unsigned long long v1097;  // x2
    unsigned long v1098;  // 4373
    unsigned long long v1099;  // x24
    unsigned long long v1100;  // x25
    unsigned long long v1101;  // x16
    unsigned long long v1102;  // x25
    unsigned long v1103;  // 4394
    unsigned long long v1104;  // x16
    unsigned long v1105;  // 4401
    unsigned long long v170;  // x15
    unsigned long long v1106;  // x5
    unsigned long long v1107;  // x0
    unsigned long v1108;  // 4416
    unsigned long long v1109;  // x17
    unsigned long long v1110;  // x1
    unsigned long long v1111;  // x4
    unsigned long long v1112;  // x13
    unsigned long v1113;  // 4430
    unsigned long long v1114;  // x3
    unsigned long v1115;  // 4437
    unsigned long v171;  // 4448
    unsigned long long v1116;  // x14
    unsigned long long v1117;  // x1
    unsigned long long v1118;  // 4450
    unsigned long long v1119;  // x15
    unsigned long long v1120;  // x15
    unsigned long long v1121;  // 4470
    uint128_t v1122;  // x10
    unsigned long long v1123;  // x14
    unsigned long long v1124;  // x10
    unsigned long v1125;  // 4484
    unsigned long long v172;  // x15
    unsigned long long v1126;  // x9
    unsigned long long v1127;  // x9
    unsigned long v1128;  // 4495
    unsigned long long v1129;  // x10
    unsigned long long v1130;  // x9
    unsigned long long v1131;  // 4508
    unsigned long long v1132;  // x13
    unsigned long long v1133;  // x10
    unsigned long long v1134;  // x9
    uint128_t v1135;  // x11
    unsigned long v173;  // 4455
    unsigned long long v1136;  // x12
    uint128_t v1137;  // x14
    unsigned long long v1138;  // x13
    unsigned long long m;  // w10
    unsigned long long v1140;  // w10
    unsigned long long v1141;  // x16
    unsigned long long v1142;  // x13
    uint128_t v1143;  // x0
    unsigned long long v1144;  // x2
    unsigned long long v1145;  // x4
    unsigned long long v174;  // x17
    unsigned long long v1146;  // x5
    uint128_t v1147;  // x7
    unsigned long long v1148;  // x2
    unsigned long v1149;  // 4155
    unsigned long long v1150;  // x14
    unsigned long long v1151;  // x19
    unsigned long long v1152;  // x20
    uint128_t v1153;  // x22
    unsigned long long v1154;  // x0
    unsigned long v1155;  // 4460
    unsigned long long v175;  // x9
    unsigned long long v1156;  // x21
    unsigned long long v1157;  // x21
    unsigned long long v1158;  // x2
    unsigned long v1159;  // 4462
    unsigned long long v1160;  // x21
    unsigned long long v1161;  // x20
    unsigned long long v1162;  // x16
    unsigned long v1163;  // 4464
    unsigned long long v1164;  // x16
    unsigned long v1165;  // 4465
    unsigned long v77;  // x10
    unsigned long long v176;  // 4468
    unsigned long long v1166;  // x19
    unsigned long long v1167;  // x0
    unsigned long v1168;  // 4467
    unsigned long long v1169;  // x17
    unsigned long long v1170;  // x1
    unsigned long long v1171;  // x7
    unsigned long long v1172;  // x4
    unsigned long v1173;  // 4468
    unsigned long long v1174;  // x6
    unsigned long long v1175;  // x4
    unsigned long long v177;  // x17
    unsigned long v1176;  // 4470
    unsigned long long v1177;  // x3
    unsigned long long v1178;  // x1
    unsigned long long v1179;  // 4471
    unsigned long long v1180;  // x15
    unsigned long long v1181;  // x15
    unsigned long long v1182;  // 4474
    unsigned long long v1183;  // x0
    unsigned long long v1184;  // x3
    unsigned long long v1185;  // x4
    unsigned long long v178;  // x10
    unsigned long long v1186;  // x3
    unsigned long v1187;  // 4479
    unsigned long long v1188;  // x12
    unsigned long long v1189;  // x12
    unsigned long v1190;  // 4481
    unsigned long long v1191;  // x9
    unsigned long long v1192;  // x11
    unsigned long long v1193;  // 4482
    unsigned long long v1194;  // x12
    unsigned long long v1195;  // x13
    unsigned long long v179;  // 4484
    uint128_t v1196;  // x8
    uint128_t v1197;  // x13
    uint128_t v1198;  // x10
    uint128_t v1199;  // x14
    uint128_t v1200;  // x9
    uint128_t v1201;  // x16
    unsigned long long v1202;  // x11
    uint128_t v1203;  // x0
    unsigned long long v1204;  // x2
    unsigned long long v1205;  // x4
    unsigned long long v180;  // x13
    unsigned long long v1206;  // x5
    uint128_t v1207;  // x7
    uint128_t v1208;  // x20
    unsigned long long v1209;  // x2
    unsigned long v1210;  // 4319
    unsigned long long v1211;  // x13
    uint128_t v1212;  // x20
    unsigned long long v1213;  // x23
    uint128_t v1214;  // x25
    unsigned long long v1215;  // x0
    unsigned long long v181;  // x15
    unsigned long v1216;  // 4356
    unsigned long long v1217;  // x24
    unsigned long long v1218;  // x24
    unsigned long long v1219;  // x2
    unsigned long v1220;  // 4373
    unsigned long long v1221;  // x24
    unsigned long long v1222;  // x25
    unsigned long long v1223;  // x16
    unsigned long long v1224;  // x25
    unsigned long v1225;  // 4394
    unsigned long v182;  // 4492
    unsigned long long v1226;  // x16
    unsigned long v1227;  // 4401
    unsigned long long v1228;  // x5
    unsigned long long v1229;  // x0
    unsigned long v1230;  // 4416
    unsigned long long v1231;  // x17
    unsigned long long v1232;  // x1
    unsigned long long v1233;  // x4
    unsigned long long v1234;  // x13
    unsigned long v1235;  // 4430
    unsigned long long v183;  // x12
    unsigned long long v1236;  // x3
    unsigned long v1237;  // 4437
    unsigned long long v1238;  // x14
    unsigned long long v1239;  // x1
    unsigned long long v1240;  // 4450
    unsigned long long v1241;  // x15
    unsigned long long v1242;  // x15
    unsigned long long v1243;  // 4470
    uint128_t v1244;  // x10
    unsigned long long v1245;  // x14
    unsigned long v184;  // 4499
    unsigned long long v1246;  // x10
    unsigned long v1247;  // 4484
    unsigned long long v1248;  // x9
    unsigned long long v1249;  // x9
    unsigned long v1250;  // 4495
    unsigned long long v1251;  // x10
    unsigned long long v1252;  // x9
    unsigned long long v1253;  // 4508
    unsigned long long v1254;  // x13
    unsigned long long v1255;  // x10
    unsigned long long v185;  // x14
    unsigned long long v1256;  // x9
    uint128_t v1257;  // x11
    unsigned long long v1258;  // x12
    uint128_t v1259;  // x14
    unsigned long long v1260;  // x13
    unsigned long long n;  // w10
    unsigned long long v1262;  // w10
    unsigned long long v1263;  // x16
    unsigned long long v1264;  // x13
    uint128_t v1265;  // x0
    unsigned long long v78;  // x22
    unsigned long long v186;  // x11
    unsigned long long v1266;  // x2
    unsigned long long v1267;  // x4
    unsigned long long v1268;  // x5
    uint128_t v1269;  // x7
    unsigned long long v1270;  // x2
    unsigned long v1271;  // 4155
    unsigned long long v1272;  // x14
    unsigned long long v1273;  // x19
    unsigned long long v1274;  // x20
    uint128_t v1275;  // x22
    unsigned long long v187;  // 4512
    unsigned long long v1276;  // x0
    unsigned long v1277;  // 4460
    unsigned long long v1278;  // x21
    unsigned long long v1279;  // x21
    unsigned long long v1280;  // x2
    unsigned long v1281;  // 4462
    unsigned long long v1282;  // x21
    unsigned long long v1283;  // x20
    unsigned long long v1284;  // x16
    unsigned long v1285;  // 4464
    unsigned long long v188;  // x12
    unsigned long long v1286;  // x16
    unsigned long v1287;  // 4465
    unsigned long long v1288;  // x19
    unsigned long long v1289;  // x0
    unsigned long v1290;  // 4467
    unsigned long long v1291;  // x17
    unsigned long long v1292;  // x1
    unsigned long long v1293;  // x7
    unsigned long long v1294;  // x4
    unsigned long v1295;  // 4468
    uint128_t v189;  // x6
    unsigned long long v1296;  // x6
    unsigned long long v1297;  // x4
    unsigned long v1298;  // 4470
    unsigned long long v1299;  // x3
    unsigned long long v1300;  // x1
    unsigned long long v1301;  // 4471
    unsigned long long v1302;  // x15
    unsigned long long v1303;  // x15
    unsigned long long v1304;  // 4474
    unsigned long long v1305;  // x0
    uint128_t v190;  // x19
    unsigned long long v1306;  // x3
    unsigned long long v1307;  // x4
    unsigned long long v1308;  // x3
    unsigned long v1309;  // 4479
    unsigned long long v1310;  // x12
    unsigned long long v1311;  // x12
    unsigned long v1312;  // 4481
    unsigned long long v1313;  // x9
    unsigned long long v1314;  // x11
    unsigned long long v1315;  // 4482
    unsigned long long v191;  // x16
    unsigned long long v1316;  // x12
    unsigned long long v1317;  // x13
    unsigned long long i0;  // w8
    unsigned long long v1319;  // w8
    unsigned long long v1320;  // x16
    unsigned long long v1321;  // x13
    uint128_t v1322;  // x0
    unsigned long long v1323;  // x2
    unsigned long long v1324;  // x4
    unsigned long long v1325;  // x5
    unsigned long long v192;  // x15
    uint128_t v1326;  // x7
    unsigned long long v1327;  // x2
    unsigned long v1328;  // 4531
    unsigned long long v1329;  // x14
    unsigned long long v1330;  // x19
    unsigned long long v1331;  // x20
    uint128_t v1332;  // x22
    unsigned long long v1333;  // x0
    unsigned long v1334;  // 4535
    unsigned long long v1335;  // x21
    unsigned long long v193;  // x0
    unsigned long long v1336;  // x21
    unsigned long long v1337;  // x2
    unsigned long v1338;  // 4537
    unsigned long long v1339;  // x21
    unsigned long long v1340;  // x20
    unsigned long long v1341;  // x16
    unsigned long v1342;  // 4539
    unsigned long long v1343;  // x16
    unsigned long v1344;  // 4540
    unsigned long long v1345;  // x19
    uint128_t v194;  // x2
    unsigned long long v1346;  // x0
    unsigned long v1347;  // 4542
    unsigned long long v1348;  // x17
    unsigned long long v1349;  // x1
    unsigned long long v1350;  // x7
    unsigned long long v1351;  // x4
    unsigned long v1352;  // 4543
    unsigned long long v1353;  // x6
    unsigned long long v1354;  // x4
    unsigned long v1355;  // 4545
    unsigned long long v195;  // x2
    unsigned long long v1356;  // x3
    unsigned long long v1357;  // x1
    unsigned long long v1358;  // 4546
    unsigned long long v1359;  // x15
    unsigned long long v1360;  // x15
    unsigned long long v1361;  // 4549
    unsigned long long v1362;  // x0
    unsigned long long v1363;  // x3
    unsigned long long v1364;  // x4
    unsigned long long v1365;  // x3
    unsigned long v79;  // x14
    unsigned long v196;  // 4550
    unsigned long v1366;  // 4554
    unsigned long long v1367;  // x12
    unsigned long long v1368;  // x12
    unsigned long v1369;  // 4556
    unsigned long long v1370;  // x10
    unsigned long long v1371;  // x11
    unsigned long long v1372;  // 4557
    unsigned long long v1373;  // x14
    unsigned long long v1374;  // x13
    unsigned long long v197;  // x0
    unsigned long long i1;  // w8
    unsigned long long v1377;  // w8
    unsigned long long v1378;  // x16
    unsigned long long v1379;  // x13
    uint128_t v1380;  // x0
    unsigned long long v1381;  // x2
    unsigned long long v1382;  // x4
    unsigned long long v1383;  // x5
    uint128_t v1384;  // x7
    unsigned long long v1385;  // x2
    unsigned long long v198;  // x1
    unsigned long v1386;  // 4531
    unsigned long long v1387;  // x14
    unsigned long long v1388;  // x19
    unsigned long long v1389;  // x20
    uint128_t v1390;  // x22
    unsigned long long v1391;  // x0
    unsigned long v1392;  // 4535
    unsigned long long v1393;  // x21
    unsigned long long v1394;  // x21
    unsigned long long v1395;  // x2
    uint128_t v199;  // x4
    unsigned long v1396;  // 4537
    unsigned long long v1397;  // x21
    unsigned long long v1398;  // x20
    unsigned long long v1399;  // x16
    unsigned long v1400;  // 4539
    unsigned long long v1401;  // x16
    unsigned long v1402;  // 4540
    unsigned long long v1403;  // x19
    unsigned long long v1404;  // x0
    unsigned long v1405;  // 4542
    unsigned long long v200;  // x15
    unsigned long long v1406;  // x17
    unsigned long long v1407;  // x1
    unsigned long long v1408;  // x7
    unsigned long long v1409;  // x4
    unsigned long v1410;  // 4543
    unsigned long long v1411;  // x6
    unsigned long long v1412;  // x4
    unsigned long v1413;  // 4545
    unsigned long long v1414;  // x3
    unsigned long long v1415;  // x1
    unsigned long v201;  // 4571
    unsigned long long v1416;  // 4546
    unsigned long long v1417;  // x15
    unsigned long long v1418;  // x15
    unsigned long long v1419;  // 4549
    unsigned long long v1420;  // x0
    unsigned long long v1421;  // x3
    unsigned long long v1422;  // x4
    unsigned long long v1423;  // x3
    unsigned long v1424;  // 4554
    unsigned long long v1425;  // x12
    unsigned long long v202;  // x4
    unsigned long long v1426;  // x12
    unsigned long v1427;  // 4556
    unsigned long long v1428;  // x10
    unsigned long long v1429;  // x11
    unsigned long long v1430;  // 4557
    unsigned long long v1431;  // x14
    unsigned long long v1432;  // x13
    unsigned long long v1434;  // x14
    unsigned long long v1435;  // x15
    unsigned long long v203;  // x14
    unsigned long long v1436;  // x10
    unsigned long long v1437;  // x9
    unsigned long long v1438;  // x8
    uint128_t v1439;  // w0
    unsigned long long v204;  // x5
    unsigned long long v205;  // x2
    unsigned long v80;  // x1
    unsigned long v206;  // 4592
    unsigned long long v207;  // x5
    uint128_t v208;  // x14
    unsigned long long v209;  // x6
    unsigned long long v210;  // x14
    unsigned long v211;  // 4617
    unsigned long long v212;  // x6
    unsigned long long v213;  // x14
    unsigned long v214;  // 4352
    unsigned long long v215;  // x6
    unsigned long long v81;  // x9
    unsigned long long v216;  // x6
    unsigned long v217;  // 4367
    unsigned long long v218;  // x3
    unsigned long long v219;  // x15
    unsigned long long v220;  // x17
    unsigned long long v221;  // x5
    unsigned long long v222;  // x17
    unsigned long v223;  // 4393
    uint128_t v224;  // x7
    unsigned long long v225;  // x17
    unsigned long long v82;  // x21
    unsigned long v226;  // 4408
    unsigned long long v227;  // x4
    unsigned long long v228;  // x15
    unsigned long long v229;  // 4421
    unsigned long long v230;  // x17
    unsigned long long v231;  // x17
    unsigned long long v232;  // 4437
    unsigned long long v233;  // x3
    unsigned long long v234;  // x4
    uint128_t v235;  // x5
    unsigned long long v83;  // x9
    unsigned long long v236;  // x4
    unsigned long v237;  // 4461
    unsigned long long v238;  // x5
    unsigned long long v239;  // x4
    unsigned long v240;  // 4479
    long long v241;  // x5
    unsigned long long v242;  // x0
    unsigned long long v243;  // x16
    unsigned long v244;  // x1
    unsigned long long v245;  // x2
    unsigned long long v84;  // x11
    unsigned long v246;  // x3
    unsigned long long v247;  // x4
    uint128_t v248;  // x21
    uint128_t v249;  // x26
    uint128_t v250;  // x28
    uint128_t v251;  // x25
    long long v252;  // x3
    long long v253;  // x6
    unsigned long long v254;  // x8
    unsigned long long v255;  // 4528
    unsigned long long v85;  // x23
    unsigned long long v256;  // x13
    uint128_t v257;  // x19
    long long v258;  // x22
    long long v259;  // x24
    uint128_t v260;  // x27
    uint128_t v261;  // x10
    unsigned long long v262;  // x11
    unsigned long long v263;  // x12
    unsigned long long v264;  // x14
    unsigned long long v265;  // x16
    unsigned long v68;  // x10
    unsigned long long v86;  // x19
    uint128_t v266;  // x0
    unsigned long long v267;  // x14
    unsigned long v268;  // 4344
    unsigned long long v269;  // x17
    long long v270;  // x1
    unsigned long long v271;  // x12
    unsigned long v272;  // 4364
    unsigned long long v273;  // x8
    unsigned long long v274;  // x8
    unsigned long long v275;  // x8
    unsigned int v87;  // w9
    unsigned long v276;  // 4381
    unsigned long long v277;  // x14
    unsigned long long v278;  // x1
    unsigned long long v279;  // x10
    unsigned long long v280;  // x2
    unsigned long v281;  // 4404
    unsigned long long v282;  // x17
    unsigned long long v283;  // x10
    unsigned long v284;  // 4419
    unsigned long long v285;  // x17
    unsigned long v88;  // x13
    unsigned long long v286;  // x12
    uint128_t v287;  // x16
    unsigned long long v288;  // x3
    unsigned long long v289;  // x11
    unsigned long v290;  // 4450
    unsigned long long v291;  // x14
    unsigned long long v292;  // x0
    unsigned long long v293;  // x11
    unsigned long long v294;  // x4
    unsigned long v295;  // 4473
    unsigned long v89;  // x15
    unsigned long long v296;  // x11
    unsigned long v297;  // 4480
    unsigned long long v298;  // x15
    unsigned long long v299;  // x13
    unsigned long long v300;  // x11
    unsigned long long v301;  // 4496
    unsigned long long v302;  // x9
    unsigned long long v303;  // x9
    long long v304;  // x12
    unsigned long long v305;  // 4514
    unsigned long v90;  // x16
    unsigned long long v306;  // x14
    unsigned long long v307;  // x12
    unsigned long v308;  // x27
    unsigned long long v309;  // x24
    unsigned long v310;  // x15
    unsigned long v311;  // x16
    unsigned long long v312;  // x23
    unsigned long long v313;  // x20
    unsigned long v314;  // x17
    unsigned long v315;  // x2
    unsigned long v91;  // x2
    unsigned long long v316;  // x19
    unsigned long v317;  // x4
    unsigned long long v318;  // x13
    unsigned long v319;  // 4559
    unsigned long long v320;  // x12
    unsigned long v321;  // 4566
    unsigned long long v322;  // x0
    unsigned long long v323;  // x12
    unsigned long long v324;  // 4579
    unsigned long long v325;  // x10
    unsigned long long v92;  // x17
    unsigned long long v326;  // x11
    unsigned long v327;  // x10
    unsigned long long v328;  // x12
    unsigned long long v329;  // x13
    unsigned long v330;  // x14
    unsigned long long v331;  // x15
    unsigned long v332;  // x16
    unsigned long long v333;  // x17
    unsigned long long v334;  // x9
    unsigned long long v335;  // x9
    unsigned long v93;  // x0
    unsigned long long v336;  // 4348
    unsigned long long v337;  // x8
    unsigned long long v338;  // x12
    unsigned long long v339;  // 4364
    unsigned long long v340;  // x8
    unsigned long long v341;  // x8
    unsigned long long v342;  // 4378
    unsigned long long v343;  // x10
    uint128_t v344;  // x22
    uint128_t v345;  // x16
    unsigned long long v94;  // x4
    uint128_t v346;  // x14
    unsigned long long v347;  // x15
    unsigned long long v348;  // x17
    unsigned long long v349;  // x1
    unsigned long long v350;  // x2
    uint128_t v351;  // x4
    unsigned long long v352;  // x1
    unsigned long v353;  // 4424
    unsigned long long v354;  // x3
    unsigned long long v355;  // x4
    unsigned long v95;  // x3
    uint128_t v356;  // x6
    unsigned long long v357;  // x17
    unsigned long v358;  // 4445
    unsigned long long v359;  // x5
    unsigned long long v360;  // x5
    unsigned long long v361;  // x1
    unsigned long v362;  // 4462
    unsigned long long v363;  // x5
    unsigned long long v364;  // x6
    unsigned long long v365;  // x14
    unsigned long v69;  // x9
    unsigned long v96;  // x5
    unsigned long v366;  // 4483
    unsigned long long v367;  // x6
    unsigned long long v368;  // x14
    unsigned long v369;  // 4498
    unsigned long long v370;  // x6
    unsigned long long v371;  // x17
    unsigned long v372;  // 4513
    unsigned long long v373;  // x5
    unsigned long long v374;  // x16
    unsigned long long v375;  // x6
    unsigned long long v97;  // x7
    unsigned long long v376;  // x16
    unsigned long v377;  // 4536
    uint128_t v378;  // x7
    unsigned long long v379;  // x16
    unsigned long v380;  // 4551
    unsigned long long v381;  // x2
    unsigned long long v382;  // x0
    unsigned long long v383;  // x16
    unsigned long long v384;  // 4567
    unsigned long long v385;  // x2
    unsigned long long v98;  // x11
    unsigned long long v386;  // x17
    unsigned long long v387;  // 4581
    unsigned long long v388;  // x4
    uint128_t v389;  // x5
    unsigned long long v390;  // x4
    unsigned long v391;  // 4602
    unsigned long long v392;  // x5
    unsigned long long v393;  // x4
    unsigned long v394;  // 4617
    unsigned long long v395;  // x15
    unsigned long long v99;  // x21
    unsigned long long v396;  // x0
    unsigned long long v397;  // x0
    unsigned long long v398;  // x1
    unsigned long long v399;  // x11
    unsigned long long v400;  // x12
    unsigned long long v401;  // x9
    unsigned long long v402;  // x10
    unsigned long long v403;  // x8
    unsigned long long v404;  // 4231
    unsigned long long v405;  // x8
    unsigned long v100;  // x12
    unsigned long long v406;  // 4128
    unsigned long v407;  // x8
    unsigned long v408;  // x9
    unsigned long v409;  // x11
    unsigned long v410;  // x12
    unsigned long v411;  // x13
    uint128_t v412;  // x14
    unsigned long long v413;  // x8
    unsigned long v414;  // x16
    unsigned long long v415;  // x0
    unsigned long long v101;  // x20
    unsigned long long v416;  // x2
    unsigned long long v417;  // x8
    unsigned long long v418;  // x4
    uint128_t v419;  // x14
    unsigned long v420;  // x7
    unsigned long long v421;  // x0
    unsigned long v422;  // 4334
    unsigned long long v423;  // x9
    unsigned long v424;  // x7
    unsigned long long v425;  // x21
    unsigned long v102;  // x14
    unsigned long long v426;  // x9
    unsigned long long v427;  // x23
    unsigned long v428;  // x25
    unsigned long long v429;  // x16
    unsigned long v430;  // 4379
    unsigned long long v431;  // x12
    unsigned long long v432;  // x12
    unsigned long long v433;  // x12
    unsigned long v434;  // 4396
    unsigned long v435;  // x24
    unsigned long v103;  // x6
    unsigned long long v436;  // x11
    unsigned long long v437;  // x23
    unsigned long long v438;  // x13
    unsigned long v439;  // 4421
    unsigned long long v440;  // x9
    unsigned long v441;  // 4428
    unsigned long long v442;  // x11
    unsigned long long v443;  // x11
    unsigned long long v444;  // x16
    unsigned long v445;  // 4446
    unsigned long v104;  // x22
    unsigned long long v446;  // x13
    unsigned long long v447;  // x15
    unsigned long v448;  // 4453
    unsigned long long v449;  // x14
    unsigned long v450;  // 4460
    unsigned long long v451;  // x15
    unsigned long long v452;  // x14
    unsigned long long v453;  // 4473
    unsigned long long v454;  // x10
    unsigned long long v455;  // x10
    unsigned long long v105;  // x25
    unsigned long long v456;  // 4489
    unsigned long long v457;  // x13
    unsigned long long v458;  // x15
    unsigned long v459;  // 4499
    unsigned long long v460;  // x8
    unsigned long v461;  // 4506
    unsigned long long v462;  // x15
    unsigned long long v463;  // x8
    unsigned long long v464;  // 4519
    unsigned long long v465;  // x11
    unsigned long v70;  // x12
    unsigned long long v106;  // x1
    unsigned long long v466;  // x9
    unsigned long long v467;  // x8
    uint128_t v468;  // x12
    unsigned long long v469;  // x11
    uint128_t v470;  // x10
    unsigned long long v471;  // x9
    unsigned long long v472;  // x14
    unsigned long long v473;  // x9
    uint128_t v474;  // x16
    unsigned long long v475;  // x0
    unsigned long v107;  // x26
    uint128_t v476;  // x2
    unsigned long long v477;  // x9
    unsigned long long v478;  // x4
    unsigned long long v479;  // x8
    uint128_t v480;  // x7
    unsigned long long v481;  // x10
    unsigned long long v482;  // x21
    uint128_t v483;  // x23
    unsigned long long v484;  // x10
    unsigned long long v485;  // x25
    unsigned long v108;  // x27
    uint128_t v486;  // x27
    unsigned long long v487;  // x12
    unsigned long long v488;  // x12
    unsigned long long v489;  // x12
    unsigned long v490;  // 4343
    unsigned long long v491;  // x12
    unsigned long v492;  // 4350
    unsigned long long v493;  // x17
    unsigned long long v494;  // x6
    unsigned long long v495;  // x11
    unsigned long long v109;  // x24
    unsigned long long v496;  // x25
    unsigned long long v497;  // x14
    unsigned long v498;  // 4375
    unsigned long long v499;  // x10
    unsigned long v500;  // 4382
    unsigned long long v501;  // x13
    unsigned long long v502;  // x11
    unsigned long long v503;  // x17
    unsigned long long v504;  // x8
    unsigned long v505;  // 4402
    uint128_t v110;  // x23
    unsigned long long v506;  // x8
    unsigned long v507;  // 4409
    unsigned long long v508;  // x8
    unsigned long v509;  // 4416
    unsigned long long v510;  // x17
    unsigned long long v511;  // x13
    unsigned long long v512;  // x11
    unsigned long v513;  // 4430
    unsigned long long v514;  // x11
    unsigned long v515;  // 4437
    unsigned long long v111;  // x28
    unsigned long long v516;  // x11
    unsigned long v517;  // 4444
    unsigned long long v518;  // x15
    unsigned long long v519;  // x9
    unsigned long v520;  // 4458
    unsigned long long v521;  // x9
    unsigned long v522;  // 4465
    unsigned long long v523;  // x9
    unsigned long v524;  // 4472
    unsigned long long v525;  // x12
    unsigned long long v112;  // x8
    unsigned long long v526;  // x13
    unsigned long long v527;  // x9
    unsigned long long v528;  // x8
    unsigned long long v529;  // x10
    uint128_t v530;  // x12
    unsigned long long v531;  // x11
    unsigned long long v532;  // x15
    unsigned long long v533;  // x11
    unsigned long long v534;  // x17
    unsigned long long v535;  // x1
    unsigned long long v113;  // x27
    unsigned long long v536;  // x2
    unsigned long long v537;  // x4
    uint128_t v538;  // x6
    unsigned long long v539;  // x13
    unsigned long long v540;  // x19
    unsigned long long v541;  // x21
    unsigned long long v542;  // x22
    unsigned long long v543;  // x22
    unsigned long long v544;  // x6
    unsigned long v545;  // 4570
    unsigned long long v114;  // x9
    unsigned long long v546;  // x17
    unsigned long v547;  // 4577
    unsigned long long v548;  // x16
    unsigned long long v549;  // x5
    unsigned long long v550;  // x6
    unsigned long long v551;  // x15
    unsigned long v552;  // 4594
    unsigned long long v553;  // x15
    unsigned long v554;  // 4601
    unsigned long long v555;  // x14
    unsigned long v115;  // x2
    unsigned long long v556;  // x16
    unsigned long long v557;  // x19
    unsigned long long v558;  // x1
    unsigned long v559;  // 4243
    unsigned long long v560;  // x1
    unsigned long v561;  // 4254
    unsigned long long v562;  // x16
    unsigned long v563;  // 4261
    unsigned long long v564;  // x0
    unsigned long long v565;  // x1
    unsigned long long v71;  // x20
    unsigned long long v116;  // x19
    unsigned long long v566;  // x4
    unsigned long long v567;  // x6
    unsigned long long v568;  // x14
    unsigned long long v569;  // x1
    unsigned long v570;  // 4287
    uint128_t v571;  // x3
    unsigned long long v572;  // x1
    unsigned long v573;  // 4302
    unsigned long long v574;  // x14
    unsigned long v575;  // 4309
    unsigned long v117;  // x11
    unsigned long long v576;  // x0
    unsigned long long v577;  // x2
    unsigned long long v578;  // x3
    unsigned long long v579;  // x2
    unsigned long v580;  // 4339
    unsigned long long v581;  // x10
    unsigned long long v582;  // x10
    unsigned long v583;  // 4354
    unsigned long long v584;  // x9
    unsigned long v585;  // 4361
    unsigned long v118;  // x13
    unsigned long long v586;  // x11
    unsigned long long v587;  // x8
    unsigned long v588;  // x9
    uint128_t v589;  // x10
    uint128_t v590;  // x8
    uint128_t v591;  // x11
    uint128_t v592;  // x13
    unsigned long v593;  // x14
    unsigned long long v594;  // x15
    uint128_t v595;  // x17
    unsigned long v119;  // x15
    unsigned long long v596;  // x1
    unsigned long long v597;  // x3
    unsigned long long v598;  // x15
    unsigned long long v599;  // x4
    long long v600;  // x5
    uint128_t v601;  // x13
    uint128_t v602;  // x7
    unsigned long long v603;  // x1
    unsigned long v604;  // 4343
    unsigned long long v605;  // x10
    unsigned long v120;  // x16
    long long v606;  // x6
    uint128_t v607;  // x7
    unsigned long long v608;  // x22
    unsigned long long v609;  // x23
    uint128_t v610;  // x25
    unsigned long long v611;  // x17
    unsigned long v612;  // 4384
    unsigned long long v613;  // x24
    unsigned long long v614;  // x24
    unsigned long long v615;  // x1
    unsigned long v121;  // x17
    unsigned long v616;  // 4401
    unsigned long long v617;  // x24
    unsigned long long v618;  // x23
    unsigned long long v619;  // x14
    unsigned long v620;  // 4418
    unsigned long long v621;  // x14
    unsigned long v622;  // 4425
    unsigned long long v623;  // x4
    unsigned long long v624;  // x17
    unsigned long v625;  // 4440
    unsigned long v122;  // x0
    unsigned long long v626;  // x16
    unsigned long long v627;  // x10
    unsigned long long v628;  // x11
    unsigned long long v629;  // x0
    unsigned long v630;  // 4454
    unsigned long long v631;  // x13
    unsigned long v632;  // 4465
    unsigned long long v633;  // x2
    unsigned long long v634;  // x11
    unsigned long long v635;  // 4478
    unsigned long v123;  // x3
    unsigned long long v636;  // x12
    uint128_t v637;  // x8
    unsigned long long v638;  // x12
    unsigned long long v639;  // 4498
    unsigned long long v640;  // x13
    unsigned long long v641;  // x8
    unsigned long v642;  // 4508
    unsigned long long v643;  // x8
    unsigned long v644;  // 4515
    unsigned long long v645;  // x9
    unsigned long v124;  // x20
    unsigned long long v646;  // x8
    unsigned long long v647;  // 4528
    unsigned long long v648;  // x11
    unsigned long long v649;  // x9
    uint128_t v650;  // x10
    uint128_t v651;  // x12
    uint128_t v652;  // x8
    uint128_t v653;  // x13
    uint128_t v654;  // x15
    uint128_t v655;  // x9
    unsigned long v125;  // x26
    unsigned long long v656;  // x10
    uint128_t v657;  // x17
    unsigned long long v658;  // x1
    unsigned long long v659;  // x3
    unsigned long long v660;  // x4
    uint128_t v661;  // x6
    uint128_t v662;  // x19
    unsigned long long v663;  // x1
    unsigned long v664;  // 4318
    unsigned long long v665;  // x12
    unsigned long v72;  // x13
    unsigned long v126;  // x4
    uint128_t v666;  // x19
    unsigned long long v667;  // x23
    uint128_t v668;  // x25
    unsigned long long v669;  // x17
    unsigned long v670;  // 4355
    unsigned long long v671;  // x24
    unsigned long long v672;  // x24
    unsigned long long v673;  // x1
    unsigned long v674;  // 4372
    unsigned long long v675;  // x24
    unsigned long v127;  // x8
    unsigned long long v676;  // x25
    unsigned long long v677;  // x15
    unsigned long long v678;  // x25
    unsigned long v679;  // 4393
    unsigned long long v680;  // x15
    unsigned long v681;  // 4400
    unsigned long long v682;  // x4
    unsigned long long v683;  // x17
    unsigned long v684;  // 4415
    unsigned long long v685;  // x16
    unsigned long v128;  // x24
    unsigned long long v686;  // x0
    unsigned long long v687;  // x3
    unsigned long long v688;  // x12
    unsigned long v689;  // 4429
    unsigned long long v690;  // x2
    unsigned long v691;  // 4436
    unsigned long long v692;  // x13
    unsigned long long v693;  // x0
    unsigned long long v694;  // 4449
    unsigned long long v695;  // x14
    unsigned long v129;  // x25
    unsigned long long v696;  // x14
    unsigned long long v697;  // 4469
    uint128_t v698;  // x8
    unsigned long long v699;  // x13
    unsigned long long v700;  // x8
    unsigned long v701;  // 4483
    unsigned long long v702;  // x9
    unsigned long long v703;  // x8
    unsigned long v704;  // 4494
    unsigned long long v705;  // x9
    unsigned long v130;  // x9
    unsigned long long v706;  // x8
    unsigned long long v707;  // 4507
    unsigned long long v708;  // x12
    unsigned long long v709;  // x9
    unsigned long long v710;  // x8
    uint128_t v711;  // x10
    unsigned long long v712;  // x11
    uint128_t v713;  // x13
    unsigned long long v714;  // x12
    unsigned long long i;  // w9
    unsigned long v131;  // x27
    unsigned long long v716;  // w9
    unsigned long long v717;  // x15
    unsigned long long v718;  // x12
    uint128_t v719;  // x17
    unsigned long long v720;  // x1
    unsigned long long v721;  // x3
    unsigned long long v722;  // x4
    uint128_t v723;  // x6
    unsigned long long v724;  // x1
    unsigned long v725;  // 4155
    uint128_t v132;  // x23
    unsigned long long v726;  // x13
    unsigned long long v727;  // x7
    unsigned long long v728;  // x19
    uint128_t v729;  // x22
    unsigned long long v730;  // x17
    unsigned long v731;  // 4455
    unsigned long long v732;  // x21
    unsigned long long v733;  // x21
    unsigned long long v734;  // x1
    unsigned long v735;  // 4457
    uint128_t v133;  // x22
    unsigned long long v736;  // x21
    unsigned long long v737;  // x19
    unsigned long long v738;  // x15
    unsigned long v739;  // 4459
    unsigned long long v740;  // x15
    unsigned long v741;  // 4460
    unsigned long long v742;  // x7
    unsigned long long v743;  // x17
    unsigned long v744;  // 4462
    unsigned long long v745;  // x16
    uint128_t v134;  // x21
    unsigned long long v746;  // x0
    unsigned long long v747;  // x6
    unsigned long long v748;  // x3
    unsigned long v749;  // 4463
    unsigned long long v750;  // x5
    unsigned long long v751;  // x3
    unsigned long v752;  // 4465
    unsigned long long v753;  // x2
    unsigned long long v754;  // x0
    unsigned long long v755;  // 4466
    unsigned long v135;  // x9
    unsigned long long v756;  // x14
    unsigned long long v757;  // x14
    unsigned long long v758;  // 4469
    unsigned long long v759;  // x17
    unsigned long long v760;  // x2
    unsigned long long v761;  // x3
    unsigned long long v762;  // x2
    unsigned long v763;  // 4474
    unsigned long long v764;  // x11
    unsigned long long v765;  // x11
    unsigned long long v73;  // x10
    unsigned long long v136;  // x10
    unsigned long v766;  // 4476
    unsigned long long v767;  // x8
    unsigned long long v768;  // x10
    unsigned long long v769;  // 4477
    unsigned long long v770;  // x11
    unsigned long long v771;  // x12
    uint128_t v772;  // x8
    uint128_t v773;  // x13
    uint128_t v774;  // x10
    uint128_t v775;  // x14
    unsigned long long v137;  // x14
    uint128_t v776;  // x9
    uint128_t v777;  // x16
    unsigned long long v778;  // x11
    uint128_t v779;  // x0
    unsigned long long v780;  // x2
    unsigned long long v781;  // x4
    unsigned long long v782;  // x5
    uint128_t v783;  // x7
    uint128_t v784;  // x20
    unsigned long long v785;  // x2
    unsigned long long v138;  // x16
    unsigned long v786;  // 4319
    unsigned long long v787;  // x13
    uint128_t v788;  // x20
    unsigned long long v789;  // x23
    uint128_t v790;  // x25
    unsigned long long v791;  // x0
    unsigned long v792;  // 4356
    unsigned long long v793;  // x24
    unsigned long long v794;  // x24
    unsigned long long v795;  // x2
    unsigned long long v139;  // x0
    unsigned long v796;  // 4373
    unsigned long long v797;  // x24
    unsigned long long v798;  // x25
    unsigned long long v799;  // x16
    unsigned long long v800;  // x25
    unsigned long v801;  // 4394
    unsigned long long v802;  // x16
    unsigned long v803;  // 4401
    unsigned long long v804;  // x5
    unsigned long long v805;  // x0
    unsigned long long v140;  // x12
    unsigned long v806;  // 4416
    unsigned long long v807;  // x17
    unsigned long long v808;  // x1
    unsigned long long v809;  // x4
    unsigned long long v810;  // x13
    unsigned long v811;  // 4430
    unsigned long long v812;  // x3
    unsigned long v813;  // 4437
    unsigned long long v814;  // x14
    unsigned long long v815;  // x1
    unsigned long long v141;  // x10
    unsigned long long v816;  // 4450
    unsigned long long v817;  // x15
    unsigned long long v818;  // x15
    unsigned long long v819;  // 4470
    uint128_t v820;  // x10
    unsigned long long v821;  // x14
    unsigned long long v822;  // x10
    unsigned long v823;  // 4484
    unsigned long long v824;  // x9
    unsigned long long v825;  // x9
    unsigned long v142;  // x2
    unsigned long v826;  // 4495
    unsigned long long v827;  // x10
    unsigned long long v828;  // x9
    unsigned long long v829;  // 4508
    unsigned long long v830;  // x13
    unsigned long long v831;  // x10
    unsigned long long v832;  // x9
    uint128_t v833;  // x11
    unsigned long long v834;  // x12
    uint128_t v835;  // x14
    unsigned long long v143;  // x16
    unsigned long long v836;  // x13
    unsigned long long j;  // w10
    unsigned long long v838;  // w10
    unsigned long long v839;  // x16
    unsigned long long v840;  // x13
    uint128_t v841;  // x0
    unsigned long long v842;  // x2
    unsigned long long v843;  // x4
    unsigned long long v844;  // x5
    uint128_t v845;  // x7
    unsigned long v144;  // 4321
    unsigned long long v846;  // x2
    unsigned long v847;  // 4155
    unsigned long long v848;  // x14
    unsigned long long v849;  // x19
    unsigned long long v850;  // x20
    uint128_t v851;  // x22
    unsigned long long v852;  // x0
    unsigned long v853;  // 4460
    unsigned long long v854;  // x21
    unsigned long long v855;  // x21
    unsigned long long v145;  // x1
    unsigned long long v856;  // x2
    unsigned long v857;  // 4462
    unsigned long long v858;  // x21
    unsigned long long v859;  // x20
    unsigned long long v860;  // x16
    unsigned long v861;  // 4464
    unsigned long long v862;  // x16
    unsigned long v863;  // 4465
    unsigned long long v864;  // x19
    unsigned long long v865;  // x0
    unsigned long v74;  // x15
    unsigned long v146;  // x3
    unsigned long v866;  // 4467
    unsigned long long v867;  // x17
    unsigned long long v868;  // x1
    unsigned long long v869;  // x7
    unsigned long long v870;  // x4
    unsigned long v871;  // 4468
    unsigned long long v872;  // x6
    unsigned long long v873;  // x4
    unsigned long v874;  // 4470
    unsigned long long v875;  // x3
    unsigned long long v147;  // x14
    unsigned long long v876;  // x1
    unsigned long long v877;  // 4471
    unsigned long long v878;  // x15
    unsigned long long v879;  // x15
    unsigned long long v880;  // 4474
    unsigned long long v881;  // x0
    unsigned long long v882;  // x3
    unsigned long long v883;  // x4
    unsigned long long v884;  // x3
    unsigned long v885;  // 4479
    unsigned long v148;  // 4340
    unsigned long long v886;  // x12
    unsigned long long v887;  // x12
    unsigned long v888;  // 4481
    unsigned long long v889;  // x9
    unsigned long long v890;  // x11
    unsigned long long v891;  // 4482
    unsigned long long v892;  // x12
    unsigned long long v893;  // x13
    uint128_t v894;  // x8
    uint128_t v895;  // x13
    unsigned long long v149;  // x2
    uint128_t v896;  // x10
    uint128_t v897;  // x14
    uint128_t v898;  // x9
    uint128_t v899;  // x16
    unsigned long long v900;  // x11
    uint128_t v901;  // x0
    unsigned long long v902;  // x2
    unsigned long long v903;  // x4
    unsigned long long v904;  // x5
    uint128_t v905;  // x7
    unsigned long long v150;  // x2
    uint128_t v906;  // x20
    unsigned long long v907;  // x2
    unsigned long v908;  // 4319
    unsigned long long v909;  // x13
    uint128_t v910;  // x20
    unsigned long long v911;  // x23
    uint128_t v912;  // x25
    unsigned long long v913;  // x0
    unsigned long v914;  // 4356
    unsigned long long v915;  // x24
    unsigned long long v151;  // x16
    unsigned long long v916;  // x24
    unsigned long long v917;  // x2
    unsigned long v918;  // 4373
    unsigned long long v919;  // x24
    unsigned long long v920;  // x25
    unsigned long long v921;  // x16
    unsigned long long v922;  // x25
    unsigned long v923;  // 4394
    unsigned long long v924;  // x16
    unsigned long v925;  // 4401
    unsigned long v152;  // 4357
    unsigned long long v926;  // x5
    unsigned long long v927;  // x0
    unsigned long v928;  // 4416
    unsigned long long v929;  // x17
    unsigned long long v930;  // x1
    unsigned long long v931;  // x4
    unsigned long long v932;  // x13
    unsigned long v933;  // 4430
    unsigned long long v934;  // x3
    unsigned long v935;  // 4437
    unsigned long long v153;  // x2
    unsigned long long v936;  // x14
    unsigned long long v937;  // x1
    unsigned long long v938;  // 4450
    unsigned long long v939;  // x15
    unsigned long long v940;  // x15
    unsigned long long v941;  // 4470
    uint128_t v942;  // x10
    unsigned long long v943;  // x14
    unsigned long long v944;  // x10
    unsigned long v945;  // 4484
    unsigned long long v154;  // x3
    unsigned long long v946;  // x9
    unsigned long long v947;  // x9
    unsigned long v948;  // 4495
    unsigned long long v949;  // x10
    unsigned long long v950;  // x9
    unsigned long long v951;  // 4508
    unsigned long long v952;  // x13
    unsigned long long v953;  // x10
    unsigned long long v954;  // x9
    uint128_t v955;  // x11
    unsigned long long v155;  // x9
    unsigned long long v956;  // x12
    uint128_t v957;  // x14
    unsigned long long v958;  // x13
    unsigned long long k;  // w10
    unsigned long long v960;  // w10
    unsigned long long v961;  // x16
    unsigned long long v962;  // x13
    uint128_t v963;  // x0
    unsigned long long v964;  // x2
    unsigned long long v965;  // x4
    unsigned long v75;  // x16
    unsigned long v156;  // x4
    unsigned long long v966;  // x5
    uint128_t v967;  // x7
    unsigned long long v968;  // x2
    unsigned long v969;  // 4155
    unsigned long long v970;  // x14
    unsigned long long v971;  // x19
    unsigned long long v972;  // x20
    uint128_t v973;  // x22
    unsigned long long v974;  // x0
    unsigned long v975;  // 4460
    unsigned long long v157;  // x5
    unsigned long long v976;  // x21
    unsigned long long v977;  // x21
    unsigned long long v978;  // x2
    unsigned long v979;  // 4462
    unsigned long long v980;  // x21
    unsigned long long v981;  // x20
    unsigned long long v982;  // x16
    unsigned long v983;  // 4464
    unsigned long long v984;  // x16
    unsigned long v985;  // 4465
    unsigned long v158;  // 4384
    unsigned long long v986;  // x19
    unsigned long long v987;  // x0
    unsigned long v988;  // 4467
    unsigned long long v989;  // x17
    unsigned long long v990;  // x1
    unsigned long long v991;  // x7
    unsigned long long v992;  // x4
    unsigned long v993;  // 4468
    unsigned long long v994;  // x6
    unsigned long long v995;  // x4
    unsigned long long v159;  // x8
    unsigned long v996;  // 4470
    unsigned long long v997;  // x3
    unsigned long long v998;  // x1
    unsigned long long v999;  // 4471
    unsigned long long v1000;  // x15
    unsigned long long v1001;  // x15
    unsigned long long v1002;  // 4474
    unsigned long long v1003;  // x0
    unsigned long long v1004;  // x3
    unsigned long long v1005;  // x4
    unsigned long long v160;  // x8
    unsigned long long v1006;  // x3
    unsigned long v1007;  // 4479
    unsigned long long v1008;  // x12
    unsigned long long v1009;  // x12
    unsigned long v1010;  // 4481
    unsigned long long v1011;  // x9
    unsigned long long v1012;  // x11
    unsigned long long v1013;  // 4482
    unsigned long long v1014;  // x12
    unsigned long long v1015;  // x13
    unsigned long v161;  // 4399
    unsigned long long l;  // w8
    unsigned long long v1017;  // w8
    unsigned long long v1018;  // x16
    unsigned long long v1019;  // x13
    uint128_t v1020;  // x0
    unsigned long long v1021;  // x2
    unsigned long long v1022;  // x4
    unsigned long long v1023;  // x5
    uint128_t v1024;  // x7
    unsigned long long v1025;  // x2
    unsigned long long v162;  // x10
    unsigned long v1026;  // 4531
    unsigned long long v1027;  // x14
    unsigned long long v1028;  // x19
    unsigned long long v1029;  // x20
    uint128_t v1030;  // x22
    unsigned long long v1031;  // x0
    unsigned long v1032;  // 4535
    unsigned long long v1033;  // x21
    unsigned long long v1034;  // x21
    unsigned long long v1035;  // x2
    unsigned long long v163;  // x10
    unsigned long v1036;  // 4537
    unsigned long long v1037;  // x21
    unsigned long long v1038;  // x20
    unsigned long long v1039;  // x16
    unsigned long v1040;  // 4539
    unsigned long long v1041;  // x16
    unsigned long v1042;  // 4540
    unsigned long long v1043;  // x19
    unsigned long long v1044;  // x0
    unsigned long v1045;  // 4542
    unsigned long long v164;  // x6
    unsigned long long v1046;  // x17
    unsigned long long v1047;  // x1
    unsigned long long v1048;  // x7
    unsigned long long v1049;  // x4
    unsigned long v1050;  // 4543
    unsigned long long v1051;  // x6
    unsigned long long v1052;  // x4
    unsigned long v1053;  // 4545
    unsigned long long v1054;  // x3
    unsigned long long v1055;  // x1
    unsigned long long v165;  // x5
    unsigned long long v1056;  // 4546
    unsigned long long v1057;  // x15
    unsigned long long v1058;  // x15
    unsigned long long v1059;  // 4549
    unsigned long long v1060;  // x0
    unsigned long long v1061;  // x3
    unsigned long long v1062;  // x4
    unsigned long long v1063;  // x3
    unsigned long v1064;  // 4554
    unsigned long long v1065;  // x12
    unsigned long long v0;  // [bp-0x288]
    unsigned long long v1;  // [bp-0x280]
    unsigned long long v2;  // [bp-0x278]
    unsigned long v3;  // [bp-0x270]
    unsigned long long v4;  // [bp-0x268]
    unsigned long v5;  // [bp-0x260], Other Possible Types: unsigned long long
    unsigned long v6;  // [bp-0x258], Other Possible Types: unsigned long long
    unsigned long v7;  // [bp-0x250], Other Possible Types: unsigned long long
    uint128_t v8;  // [bp-0x248]
    unsigned long long v9;  // [bp-0x240], Other Possible Types: uint128_t
    unsigned int v10;  // [bp-0x238]
    unsigned int v11;  // [bp-0x234]
    uint128_t v12;  // [bp-0x230], Other Possible Types: char
    uint128_t v13;  // [bp-0x220]
    char v14;  // [bp-0x211]
    unsigned long v15;  // [bp-0x208]
    unsigned long long v16;  // [bp-0x200], Other Possible Types: unsigned long
    unsigned long long v17;  // [bp-0x1f8], Other Possible Types: unsigned long
    unsigned long long v18;  // [bp-0x1f0], Other Possible Types: unsigned long
    unsigned long long v19;  // [bp-0x1e8], Other Possible Types: unsigned long
    unsigned long v20;  // [bp-0x1e0]
    unsigned long v21;  // [bp-0x1d8], Other Possible Types: unsigned long long
    unsigned long v22;  // [bp-0x1d0], Other Possible Types: unsigned long long
    unsigned long v23;  // [bp-0x1c8], Other Possible Types: unsigned long long
    unsigned long v24;  // [bp-0x1c0], Other Possible Types: unsigned long long
    unsigned long v25;  // [bp-0x1b8], Other Possible Types: unsigned long long
    uint128_t v26;  // [bp-0x1b0], Other Possible Types: uint128_t, unsigned long long
    unsigned long long v27;  // [bp-0x1a8]
    uint128_t v28;  // [bp-0x1a0], Other Possible Types: uint128_t, unsigned long
    unsigned long long v29;  // [bp-0x198]
    uint128_t v30;  // [bp-0x190], Other Possible Types: unsigned long
    unsigned long long v31;  // [bp-0x188]
    uint128_t v32;  // [bp-0x180], Other Possible Types: unsigned long long
    unsigned long long v33;  // [bp-0x178]
    uint128_t v34;  // [bp-0x170], Other Possible Types: unsigned long long
    unsigned long long v35;  // [bp-0x168]
    uint128_t v36;  // [bp-0x160], Other Possible Types: uint128_t
    uint128_t v37;  // [bp-0x150], Other Possible Types: uint128_t
    unsigned long v38;  // [bp-0x140]
    unsigned long long v39;  // [bp-0x138]
    unsigned long long v40;  // [bp-0x130]
    unsigned long long v41;  // [bp-0x128]
    unsigned long long v42;  // [bp-0x120]
    unsigned long v43;  // [bp-0x118]
    uint128_t v44;  // [bp-0x110]
    unsigned long long v45;  // [bp-0x108]
    uint128_t v46;  // [bp-0x100]
    unsigned long long v47;  // [bp-0xf8]
    unsigned long long v48;  // [bp-0xf0], Other Possible Types: unsigned long
    unsigned long long v49;  // [bp-0xe8], Other Possible Types: uint128_t
    unsigned long long v50;  // [bp-0xe0]
    unsigned long long v51;  // [bp-0xd8], Other Possible Types: uint128_t
    unsigned long long v52;  // [bp-0xd0]
    unsigned long v53;  // [bp-0xc8], Other Possible Types: unsigned long long
    uint128_t v54;  // [bp-0xc0]
    unsigned long long v55;  // [bp-0xb8]
    uint128_t v56;  // [bp-0xb0]
    unsigned long long v57;  // [bp-0xa8]
    unsigned long v58;  // [bp-0xa0]
    uint128_t v59;  // [bp-0x98]
    uint128_t v60;  // [bp-0x90]
    uint128_t v61;  // [bp-0x88]
    uint128_t v62;  // [bp-0x80]
    unsigned long v63;  // [bp-0x78]
    char *v64;  // [bp-0x10]
    char v65;  // [bp+0x0]

    v64 = &v65;
    v66 = 0;
    v63 = *(long long *)&g_10002b0;
    v12 = *a1;
    v13 = a1[1];
    v12 = *(char *)&v12 & 248;
    v67 = a2->field_0 | a2->field_4 * 0x100000000;
    v14 = 64 | (64 | *(char *)((void*)&v13 + 15) & 63) & 63;
    v68 = a2->field_5;
    v69 = a2->field_6;
    v70 = a2->field_b;
    v71 = (v67 | v68 * 0x10000000000) & 0xfff8000000000000 | ((v67 | v68 * 0x10000000000) & 0xfff8ffffffffffff | (v69 * 0x1000000000000 | v69 >> 16) & 0x7000000000000) & 0x7ffffffffffff;
    v72 = *((char *)&a2->field_7 + 3);
    v73 = v69 >> 3 | *(int *)&(&a2->field_6)[1] * 32;
    v74 = *((char *)&a2->field_d + 2);
    v75 = *((char *)&a2->field_d + 3);
    v76 = (char)a2->field_14;
    v77 = *((char *)&a2->field_14 + 1);
    v78 = (v73 | v72 * 0x2000000000) & 0xfff8000000000000 | ((v73 | v72 * 0x2000000000) & 0xfff81fffffffffff | (v70 * 0x200000000000 | v70 >> 19) & 0x7e00000000000) & 0x7ffffffffffff;
    v79 = (&a2->field_19)[1];
    v80 = (&a2->field_19)[2];
    v81 = v70 >> 6 | *(int *)&a2->field_c * 4 | *((char *)&a2->field_d + 1) * 0x400000000;
    v82 = (v81 | v74 * 0x40000000000) & 0xfff8000000000000 | ((v81 | v74 * 0x40000000000) & 0xfffbffffffffffff | (v75 * 0x4000000000000 | v75 >> 14) & 0x4000000000000) & 0x7ffffffffffff;
    v83 = v77 >> 4 | *(int *)((char *)&a2->field_14 + 2) * 16;
    v84 = v75 >> 1 | *(int *)&a2->field_11 * 128;
    v38 = v71;
    v39 = v78;
    v85 = (v84 | v76 * 0x8000000000) & 0xfff8000000000000 | ((v84 | v76 * 0x8000000000) & 0xfff87fffffffffff | (v77 * 0x800000000000 | v77 >> 0x11) & 0x7800000000000) & 0x7ffffffffffff;
    v40 = v82;
    v41 = v85;
    v86 = (v83 | v79 * 0x1000000000) & 0xfff8000000000000 | ((v83 | v79 * 0x1000000000) & 0xfff80fffffffffff | (v80 * 0x100000000000 | v80 >> 20) & 0x7f00000000000) & 0x7ffffffffffff;
    v42 = v86;
    v34 = 0;
    v35 = 1;
    v36 = 0;
    v37 = 0;
    v30 = 0;
    v32 = 0;
    v25 = 1;
    v87 = 254;
    v26 = 0;
    v28 = 0;
    do
    {
        v11 = v87;
        v88 = v36;
        v9 = v35;
        v10 = (&v12)[v87 >> 3] >> ((char)v11 & 7 & 31) & 1;
        v89 = *(unsigned long long *)((void*)&v36 + 8);
        v90 = v37;
        v91 = -(unsigned long long)(v10 ^ v66);
        v92 = (v9 ^ v71) & v91;
        v93 = *(unsigned long long *)((void*)&v37 + 8);
        v94 = (v88 ^ v78) & v91;
        v6 = v94 ^ v78;
        v7 = v92 ^ v71;
        v95 = v30;
        v96 = *(unsigned long long *)((void*)&v30 + 8);
        v97 = (v89 ^ v82) & v91;
        v98 = v86;
        v5 = v97 ^ v82;
        v99 = (v90 ^ v85) & v91;
        v100 = v99 ^ v85;
        v101 = (v25 ^ v95) & v91;
        v102 = v101 ^ v25;
        v103 = v32;
        v104 = *(unsigned long long *)((void*)&v32 + 8);
        v105 = ((unsigned long long)v26 ^ v96) & v91;
        v106 = v105 ^ (unsigned long long)v26;
        v107 = *(unsigned long long *)((void*)&v26 + 8);
        v108 = v28;
        v109 = (v107 ^ v103) & v91;
        v110 = v34;
        v20 = v7 + 0xfffffffffffda - v102;
        v21 = v6 - v106 + 0xffffffffffffe;
        v111 = v109 ^ v107;
        v112 = (v108 ^ v104) & v91;
        x30 = v112 ^ v108;
        v22 = v5 - v111 + 0xffffffffffffe;
        v23 = v100 - x30 + 0xffffffffffffe;
        v113 = (v93 ^ v98) & v91;
        v114 = (*(unsigned long long *)((void*)&v28 + 8) ^ v110) & v91;
        v115 = v113 ^ v98;
        v116 = v114 ^ *(unsigned long long *)((void*)&v28 + 8);
        v24 = v115 - v116 + 0xffffffffffffe;
        v25 = v102;
        v117 = v92 ^ v9;
        v118 = v94 ^ v88;
        v119 = v97 ^ v89;
        v120 = v99 ^ v90;
        v121 = v113 ^ v93;
        v26 = v106;
        v27 = v111;
        v28 = x30;
        v29 = v116;
        v122 = v101 ^ v95;
        v123 = v105 ^ v96;
        v124 = v117 + 0xfffffffffffda - v122;
        v125 = v118 - v123 + 0xffffffffffffe;
        v15 = v124;
        v16 = v125;
        v126 = v109 ^ v103;
        v127 = v112 ^ v104;
        v128 = v119 - v126 + 0xffffffffffffe;
        v129 = v120 - v127 + 0xffffffffffffe;
        v17 = v128;
        v18 = v129;
        v130 = v114 ^ v110;
        v131 = v121 - v130 + 0xffffffffffffe;
        v19 = v131;
        v132 = v123 + v118;
        v35 = v122 + v117;
        v36 = v132;
        v133 = v126 + v119;
        v134 = v127 + v120;
        *(uint128_t *)((char *)&v36 + 8) = v133;
        v37 = v134;
        v8 = v35;
        v9 = v130 + v121;
        *(uint128_t *)((char *)&v37 + 8) = v9;
        v30 = v102 + v7;
        v31 = v106 + v6;
        v32 = v111 + v5;
        v33 = x30 + v100;
        v34 = v116 + v115;
        sub_a11a14(&v25, &v20, &v35);
        sub_a11a14(&v30, &v30, &v15);
        v135 = v124 * v124;
        v136 = v124 * 2;
        v137 = v136 * v125;
        v138 = v136 * v128;
        v139 = v136 * v129;
        v140 = v136 * v131;
        v141 = 19 * v131;
        v142 = v125 * v125;
        v143 = v138 + v142;
        v144 = arm64g_calculate_flag_c(2, v138, v142, 0);
        v145 = 19 * v129;
        v146 = v129 * v145;
        v147 = v146 + v137;
        v148 = arm64g_calculate_flag_c(2, v146, v137, 0);
        v149 = v129 * 2;
        v150 = v149 * v141;
        v151 = v143 + v150;
        v152 = arm64g_calculate_flag_c(2, v143, v150, 0);
        v153 = v128 * 2;
        v154 = v153 * v145;
        v155 = v154 + v135;
        v156 = v131 * v141;
        v157 = v125 * 2;
        v158 = arm64g_calculate_flag_c(2, v154, v135, 0);
        v159 = v157 * v141;
        v160 = v155 + v159;
        v161 = arm64g_calculate_flag_c(2, v155, v159, 0);
        v162 = v153 * v141;
        v163 = v147 + v162;
        v164 = v157 * v129;
        v165 = v157 * v128;
        v166 = arm64g_calculate_flag_c(2, v147, v162, 0);
        v167 = (v145 * v129 >> 64) + (v125 * v136 >> 64) + v148 + (v141 * v153 >> 64) + v166;
        v168 = v128 * v128;
        v169 = ((v128 * v136 >> 64) + (v125 * v125 >> 64) + v144 + (v141 * v149 >> 64) + v152) * 0x2000 | v151 >> 0x33;
        v170 = v139 + v165;
        v171 = arm64g_calculate_flag_c(2, v139, v165, 0);
        v172 = v170 + v156;
        v173 = arm64g_calculate_flag_c(2, v170, v156, 0);
        v174 = (v129 * v136 >> 64) + (v128 * v157 >> 64) + v171 + (v141 * v131 >> 64) + v173;
        v175 = v172 + v169;
        v176 = arm64g_calculate_condition(50, v172, v169, 0);
        v177 = ((v145 * v153 >> 64) + (v124 * v124 >> 64) + v158 + (v141 * v157 >> 64) + v161) * 0x2000 | v160 >> 0x33;
        v178 = v163 + v177;
        v179 = arm64g_calculate_condition(50, v163, v177, 0);
        v180 = (v176 & 1 ? v174 : v174 + 1) * 0x2000 | v175 >> 0x33;
        v181 = v164 + v168;
        v182 = arm64g_calculate_flag_c(2, v164, v168, 0);
        v183 = v181 + v140;
        v184 = arm64g_calculate_flag_c(2, v181, v140, 0);
        v185 = (v129 * v157 >> 64) + (v128 * v128 >> 64) + v182 + (v131 * v136 >> 64) + v184;
        v186 = v183 + v180;
        v187 = arm64g_calculate_condition(50, v183, v180, 0);
        v188 = (v151 & 0x7ffffffffffff) + ((v179 & 1 ? v167 : v167 + 1) * 0x2000 | v178 >> 0x33);
        v189 = v8;
        v190 = v9;
        v191 = v189 * 2;
        v192 = v191 * v132;
        v193 = v191 * v133;
        v194 = v132 * v132;
        v195 = v193 + v194;
        v196 = arm64g_calculate_flag_c(2, v193, v194, 0);
        v197 = v132 * 2;
        v198 = 19 * v134;
        v199 = v134 * v198;
        v200 = v199 + v192;
        v201 = arm64g_calculate_flag_c(2, v199, v192, 0);
        v202 = 19 * v190;
        v203 = v134 * 2;
        v204 = v203 * v202;
        v205 = v195 + v204;
        v206 = arm64g_calculate_flag_c(2, v195, v204, 0);
        v207 = v133 * 2;
        v208 = v189 * v189;
        v209 = v207 * v198;
        v210 = v209 + v208;
        v211 = arm64g_calculate_flag_c(2, v209, v208, 0);
        v212 = v197 * v202;
        v213 = v210 + v212;
        v214 = arm64g_calculate_flag_c(2, v210, v212, 0);
        v215 = v207 * v202;
        v216 = v200 + v215;
        v217 = arm64g_calculate_flag_c(2, v200, v215, 0);
        v218 = (unsigned long long)(v198 * v134 >> 64) + (unsigned long long)(v132 * v191 >> 64) + v201 + (v202 * v207 >> 64) + v217;
        v219 = ((unsigned long long)(v133 * v191 >> 64) + (unsigned long long)(v132 * v132 >> 64) + v196 + (v202 * v203 >> 64) + v206) * 0x2000 | v205 >> 0x33;
        v220 = v191 * v134;
        v221 = v197 * v133;
        v222 = v220 + v221;
        v223 = arm64g_calculate_flag_c(2, v220, v221, 0);
        v224 = v190 * v202;
        v225 = v222 + v224;
        v226 = arm64g_calculate_flag_c(2, v222, v224, 0);
        v227 = (unsigned long long)(v134 * v191 >> 64) + (unsigned long long)(v133 * v197 >> 64) + v223 + (unsigned long long)(v202 * v190 >> 64) + v226;
        v228 = v225 + v219;
        v229 = arm64g_calculate_condition(50, v225, v219, 0);
        v230 = ((v198 * v207 >> 64) + (unsigned long long)(v189 * v189 >> 64) + v211 + (v202 * v197 >> 64) + v214) * 0x2000 | v213 >> 0x33;
        v231 = v216 + v230;
        v232 = arm64g_calculate_condition(50, v216, v230, 0);
        v233 = (v229 & 1 ? v227 : v227 + 1) * 0x2000 | v228 >> 0x33;
        v234 = v197 * v134;
        v235 = v133 * v133;
        v236 = v234 + v235;
        v237 = arm64g_calculate_flag_c(2, v234, v235, 0);
        v238 = v191 * v190;
        v239 = v236 + v238;
        v240 = arm64g_calculate_flag_c(2, v236, v238, 0);
        v241 = (unsigned long long)(v134 * v197 >> 64) + (unsigned long long)(v133 * v133 >> 64) + v237 + (unsigned long long)(v190 * v191 >> 64) + v240;
        v242 = v239 + v233;
        v243 = (v205 & 0x7ffffffffffff) + ((v232 & 1 ? v218 : v218 + 1) * 0x2000 | v231 >> 0x33);
        v244 = v25;
        v245 = v26;
        v246 = v30;
        v247 = v31;
        v9 = v246 + v244;
        v248 = v247 + v245;
        v249 = v32 + v27;
        v250 = v244 + 0xfffffffffffda - v246;
        v251 = v33 + v28;
        v252 = v27 - v32;
        v253 = v28 - v33;
        v254 = (v160 & 0x7ffffffffffff) + 19 * ((v187 & 1 ? v185 : v185 + 1) * 0x2000 | v186 >> 0x33);
        v255 = arm64g_calculate_condition(50, v239, v233, 0);
        v256 = (v213 & 0x7ffffffffffff) + 19 * ((v255 & 1 ? v241 : v241 + 1) * 0x2000 | v242 >> 0x33);
        v3 = v254 & 0x7ffffffffffff;
        v4 = (v178 & 0x7ffffffffffff) + (v254 >> 0x33);
        v20 = v3;
        v21 = v4;
        v7 = v186 & 0x7ffffffffffff;
        v8 = v34 + v29;
        v5 = v188 & 0x7ffffffffffff;
        v6 = (v175 & 0x7ffffffffffff) + (v188 >> 0x33);
        v22 = v5;
        v23 = v6;
        v24 = v7;
        v1 = (v228 & 0x7ffffffffffff) + (v243 >> 0x33);
        v2 = v242 & 0x7ffffffffffff;
        v0 = v243 & 0x7ffffffffffff;
        v15 = v256 & 0x7ffffffffffff;
        v16 = (v231 & 0x7ffffffffffff) + (v256 >> 0x33);
        v17 = v0;
        v18 = v1;
        v19 = v2;
        v257 = v245 - v247 + 0xffffffffffffe;
        v258 = v252 + 0xffffffffffffe;
        v259 = v253 + 0xffffffffffffe;
        v260 = v29 - v34 + 0xffffffffffffe;
        sub_a11a14(&v35, &v15, &v20, v252, 19, v241, v253, v8);
        v261 = v250 * v250;
        v262 = v250 * 2;
        v263 = v262 * v257;
        v264 = v262 * v258;
        v265 = 19 * v260;
        v266 = v257 * v257;
        v267 = v264 + v266;
        v268 = arm64g_calculate_flag_c(2, v264, v266, 0);
        v269 = 19 * v259;
        v270 = v259 * v269;
        v271 = v270 + v263;
        v272 = arm64g_calculate_flag_c(2, v270, v263, 0);
        v273 = v259 * 2;
        v274 = v273 * v265;
        v275 = v267 + v274;
        v276 = arm64g_calculate_flag_c(2, v267, v274, 0);
        v277 = v258 * 2;
        v278 = v277 * v269;
        v279 = v278 + v261;
        v280 = v257 * 2;
        v281 = arm64g_calculate_flag_c(2, v278, v261, 0);
        v282 = v280 * v265;
        v283 = v279 + v282;
        v284 = arm64g_calculate_flag_c(2, v279, v282, 0);
        v285 = v277 * v265;
        v286 = v271 + v285;
        v287 = v260 * v265;
        v288 = v262 * v260;
        v289 = v262 * v259;
        v290 = arm64g_calculate_flag_c(2, v271, v285, 0);
        v291 = (v269 * v259 >> 64) + (unsigned long long)(v257 * v262 >> 64) + v272 + (v265 * v277 >> 64) + v290;
        v292 = v280 * v258;
        v293 = v289 + v292;
        v294 = v280 * v259;
        v295 = arm64g_calculate_flag_c(2, v289, v292, 0);
        v296 = v293 + v287;
        v297 = arm64g_calculate_flag_c(2, v293, v287, 0);
        v298 = (v259 * v262 >> 64) + (v258 * v280 >> 64) + v295 + (unsigned long long)(v265 * v260 >> 64) + v297;
        v299 = ((v258 * v262 >> 64) + (unsigned long long)(v257 * v257 >> 64) + v268 + (v265 * v273 >> 64) + v276) * 0x2000 | v275 >> 0x33;
        v300 = v296 + v299;
        v301 = arm64g_calculate_condition(50, v296, v299, 0);
        v302 = ((v269 * v277 >> 64) + (unsigned long long)(v250 * v250 >> 64) + v281 + (v265 * v280 >> 64) + v284) * 0x2000 | v283 >> 0x33;
        v303 = v286 + v302;
        v304 = v258 * v258;
        v305 = arm64g_calculate_condition(50, v286, v302, 0);
        v306 = (v305 & 1 ? v291 : v291 + 1);
        v307 = v294 + v304;
        v308 = v3;
        v309 = v4;
        v310 = v15 + 0xfffffffffffda - v308;
        v311 = v16 - v309 + 0xffffffffffffe;
        v15 = v310;
        v16 = v311;
        v312 = v5;
        v313 = v6;
        v314 = v0 - v312 + 0xffffffffffffe;
        v315 = v1 - v313 + 0xffffffffffffe;
        v17 = v314;
        v18 = v315;
        v316 = v7;
        v317 = v2 - v316 + 0xffffffffffffe;
        v19 = v317;
        v318 = (v301 & 1 ? v298 : v298 + 1) * 0x2000 | v300 >> 0x33;
        v319 = arm64g_calculate_flag_c(2, v294, v304, 0);
        v320 = v307 + v288;
        v321 = arm64g_calculate_flag_c(2, v307, v288, 0);
        v322 = (v259 * v280 >> 64) + ((unsigned long long)(v258 * v258) >> 64) + v319 + (unsigned long long)(v260 * v262 >> 64) + v321;
        v323 = v320 + v318;
        v324 = arm64g_calculate_condition(50, v320, v318, 0);
        v325 = (v283 & 0x7ffffffffffff) + 19 * ((v324 & 1 ? v322 : v322 + 1) * 0x2000 | v323 >> 0x33);
        v30 = CONCAT((v303 & 0x7ffffffffffff) + (v325 >> 0x33), v325 & 0x7ffffffffffff);
        v32 = CONCAT((v300 & 0x7ffffffffffff) + ((v275 & 0x7ffffffffffff) + (v306 * 0x2000 | v303 >> 0x33) >> 0x33), (v275 & 0x7ffffffffffff) + (v306 * 0x2000 | v303 >> 0x33) & 0x7ffffffffffff);
        v34 = v323 & 0x7ffffffffffff;
        v326 = 121666 * v310;
        v327 = v311 * 121666 >> 64;
        v328 = 121666 * v311;
        v329 = 121666 * v314;
        v330 = v315 * 121666 >> 64;
        v331 = 121666 * v315;
        v332 = v317 * 121666 >> 64;
        v333 = 121666 * v317;
        v334 = (v314 * 121666 >> 64) * 0x2000 | v329 >> 0x33;
        v335 = v331 + v334;
        v336 = arm64g_calculate_condition(50, v331, v334, 0);
        v337 = (v310 * 121666 >> 64) * 0x2000 | v326 >> 0x33;
        v338 = v328 + v337;
        v339 = arm64g_calculate_condition(50, v328, v337, 0);
        v340 = (v336 & 1 ? v330 : v330 + 1) * 0x2000 | v335 >> 0x33;
        v341 = v340 + v333;
        v342 = arm64g_calculate_condition(50, v340, v333, 0);
        v343 = (v329 & 0x7fffffffffffe) + ((v339 & 1 ? v327 : v327 + 1) * 0x2000 | v338 >> 0x33);
        v344 = v8;
        v345 = v9;
        v346 = v345 * v345;
        v347 = v345 * 2;
        v348 = v347 * v248;
        v349 = v347 * v249;
        v350 = 19 * v344;
        v351 = v248 * v248;
        v352 = v349 + v351;
        v353 = arm64g_calculate_flag_c(2, v349, v351, 0);
        v354 = v248 * 2;
        v355 = 19 * v251;
        v356 = v251 * v355;
        v357 = v356 + v348;
        v358 = arm64g_calculate_flag_c(2, v356, v348, 0);
        v359 = v251 * 2;
        v360 = v359 * v350;
        v361 = v352 + v360;
        v362 = arm64g_calculate_flag_c(2, v352, v360, 0);
        v363 = v249 * 2;
        v364 = v363 * v355;
        v365 = v364 + v346;
        v366 = arm64g_calculate_flag_c(2, v364, v346, 0);
        v367 = v354 * v350;
        v368 = v365 + v367;
        v369 = arm64g_calculate_flag_c(2, v365, v367, 0);
        v370 = v363 * v350;
        v371 = v357 + v370;
        v372 = arm64g_calculate_flag_c(2, v357, v370, 0);
        v373 = (unsigned long long)(v355 * v251 >> 64) + (unsigned long long)(v248 * v347 >> 64) + v358 + (v350 * v363 >> 64) + v372;
        v374 = v347 * v251;
        v375 = v354 * v249;
        v376 = v374 + v375;
        v377 = arm64g_calculate_flag_c(2, v374, v375, 0);
        v378 = v344 * v350;
        v379 = v376 + v378;
        v380 = arm64g_calculate_flag_c(2, v376, v378, 0);
        v381 = (unsigned long long)(v251 * v347 >> 64) + (unsigned long long)(v249 * v354 >> 64) + v377 + (unsigned long long)(v350 * v344 >> 64) + v380;
        v382 = ((unsigned long long)(v249 * v347 >> 64) + (unsigned long long)(v248 * v248 >> 64) + v353 + (v350 * v359 >> 64) + v362) * 0x2000 | v361 >> 0x33;
        v383 = v379 + v382;
        v384 = arm64g_calculate_condition(50, v379, v382, 0);
        v385 = ((v355 * v363 >> 64) + (unsigned long long)(v345 * v345 >> 64) + v366 + (v350 * v354 >> 64) + v369) * 0x2000 | v368 >> 0x33;
        v386 = v371 + v385;
        v387 = arm64g_calculate_condition(50, v371, v385, 0);
        v388 = v354 * v251;
        v389 = v249 * v249;
        v390 = v388 + v389;
        v391 = arm64g_calculate_flag_c(2, v388, v389, 0);
        v392 = v347 * v344;
        v393 = v390 + v392;
        v394 = arm64g_calculate_flag_c(2, v390, v392, 0);
        v395 = (unsigned long long)(v251 * v354 >> 64) + (unsigned long long)(v249 * v249 >> 64) + v391 + (unsigned long long)(v344 * v347 >> 64) + v394;
        v396 = (v384 & 1 ? v381 : v381 + 1) * 0x2000 | v383 >> 0x33;
        v397 = v393 + v396;
        v398 = (v361 & 0x7ffffffffffff) + ((v387 & 1 ? v373 : v373 + 1) * 0x2000 | v386 >> 0x33);
        v399 = (v326 & 0x7fffffffffffe) + 19 * ((v342 & 1 ? v332 : v332 + 1) * 0x2000 | v341 >> 0x33);
        v400 = (v338 & 0x7ffffffffffff) + (v399 >> 0x33);
        v25 = v399 & 0x7ffffffffffff;
        v26 = _INSERT(CONCAT(v26, 0), 0, v400);
        v20 = v25 + v308;
        v21 = v400 + v309;
        v401 = (v335 & 0x7ffffffffffff) + (v343 >> 0x33);
        v402 = v343 & 0x7ffffffffffff;
        *(unsigned long long *)((char *)&v26 + 8) = v402;
        v28 = _INSERT(CONCAT(v28, 0), 0, v401);
        v22 = v402 + v312;
        v23 = v401 + v313;
        v403 = v341 & 0x7ffffffffffff;
        *(unsigned long long *)((char *)&v28 + 8) = v403;
        v24 = v403 + v316;
        v404 = arm64g_calculate_condition(50, v393, v396, 0);
        v405 = (v368 & 0x7ffffffffffff) + 19 * ((v404 & 1 ? v395 : v395 + 1) * 0x2000 | v397 >> 0x33);
        v86 = v397 & 0x7ffffffffffff;
        v85 = (v383 & 0x7ffffffffffff) + (v398 >> 0x33);
        v82 = v398 & 0x7ffffffffffff;
        v78 = (v386 & 0x7ffffffffffff) + (v405 >> 0x33);
        v71 = v405 & 0x7ffffffffffff;
        sub_a11a14(&v25, &v38, &v30);
        sub_a11a14(&v30, &v15, &v20);
        v87 = v11 - 1;
        v406 = arm64g_calculate_condition(0x11, v87, 1, 0);
        v66 = v10;
    } while (v406 & 1);
    v407 = v30;
    v408 = *(unsigned long long *)((void*)&v30 + 8);
    v409 = v32;
    v410 = *(unsigned long long *)((void*)&v32 + 8);
    v411 = v407 * v407;
    v412 = v34;
    v413 = v407 * 2;
    v414 = v408 * v413;
    v415 = v413 * v409;
    v416 = v413 * v410;
    v417 = v413 * v412;
    v418 = 19 * v412;
    v419 = v412 * v418;
    v420 = v408 * v408;
    v421 = v415 + v420;
    v422 = arm64g_calculate_flag_c(2, v415, v420, 0);
    v423 = v408 * 2;
    v424 = v409 * v423;
    v425 = v423 * v410;
    v426 = v423 * v418;
    v427 = 19 * v410;
    v428 = v410 * v427;
    v429 = v428 + v414;
    v430 = arm64g_calculate_flag_c(2, v428, v414, 0);
    v431 = v410 * 2;
    v432 = v431 * v418;
    v433 = v421 + v432;
    v434 = arm64g_calculate_flag_c(2, v421, v432, 0);
    v435 = v409 * v409;
    v436 = v409 * 2;
    v437 = v436 * v427;
    v438 = v437 + v411;
    v439 = arm64g_calculate_flag_c(2, v437, v411, 0);
    v440 = v438 + v426;
    v441 = arm64g_calculate_flag_c(2, v438, v426, 0);
    v442 = v436 * v418;
    v443 = v429 + v442;
    v444 = ((v409 * v413 >> 64) + (v408 * v408 >> 64) + v422 + (v418 * v431 >> 64) + v434) * 0x2000 | v433 >> 0x33;
    v445 = arm64g_calculate_flag_c(2, v429, v442, 0);
    v446 = (v427 * v410 >> 64) + (v413 * v408 >> 64) + v430 + (v418 * v436 >> 64) + v445;
    v447 = v416 + v424;
    v448 = arm64g_calculate_flag_c(2, v416, v424, 0);
    v449 = v447 + v419;
    v450 = arm64g_calculate_flag_c(2, v447, v419, 0);
    v451 = (v410 * v413 >> 64) + (v423 * v409 >> 64) + v448 + (unsigned long long)(v418 * v412 >> 64) + v450;
    v452 = v449 + v444;
    v453 = arm64g_calculate_condition(50, v449, v444, 0);
    v454 = ((v427 * v436 >> 64) + (v407 * v407 >> 64) + v439 + (v418 * v423 >> 64) + v441) * 0x2000 | v440 >> 0x33;
    v455 = v443 + v454;
    v456 = arm64g_calculate_condition(50, v443, v454, 0);
    v457 = (v453 & 1 ? v451 : v451 + 1) * 0x2000 | v452 >> 0x33;
    v458 = v425 + v435;
    v459 = arm64g_calculate_flag_c(2, v425, v435, 0);
    v460 = v458 + v417;
    v461 = arm64g_calculate_flag_c(2, v458, v417, 0);
    v462 = (v410 * v423 >> 64) + (v409 * v409 >> 64) + v459 + (unsigned long long)(v412 * v413 >> 64) + v461;
    v463 = v460 + v457;
    v464 = arm64g_calculate_condition(50, v460, v457, 0);
    v465 = (v433 & 0x7ffffffffffff) + ((v456 & 1 ? v446 : v446 + 1) * 0x2000 | v455 >> 0x33);
    v466 = (v440 & 0x7ffffffffffff) + 19 * ((v464 & 1 ? v462 : v462 + 1) * 0x2000 | v463 >> 0x33);
    v467 = v463 & 0x7ffffffffffff;
    v468 = (v452 & 0x7ffffffffffff) + (v465 >> 0x33);
    v469 = v465 & 0x7ffffffffffff;
    v470 = (v455 & 0x7ffffffffffff) + (v466 >> 0x33);
    v471 = v466 & 0x7ffffffffffff;
    v58 = v471;
    v59 = v470;
    v60 = v469;
    v61 = v468;
    v62 = v467;
    v472 = v471 * v471;
    v473 = v471 * 2;
    v474 = v470 * v473;
    v475 = v469 * v473;
    v476 = v468 * v473;
    v477 = v473 * v467;
    v478 = 19 * v467;
    v479 = v478 * v467;
    v480 = v470 * v470;
    v481 = v470 * 2;
    v482 = v469 * v481;
    v483 = v468 * v481;
    v484 = v478 * v481;
    v485 = 19 * v468;
    v486 = v468 * v485;
    v487 = v468 * 2;
    v488 = v487 * v478;
    v489 = v480 + v488;
    v490 = arm64g_calculate_flag_c(2, v480, v488, 0);
    v491 = v489 + v475;
    v492 = arm64g_calculate_flag_c(2, v489, v475, 0);
    v493 = (unsigned long long)(v470 * v470 >> 64) + (v478 * v487 >> 64) + v490 + (v473 * v469 >> 64) + v492;
    v494 = v469 * v469;
    v495 = v469 * 2;
    v496 = v495 * v485;
    v497 = v472 + v496;
    v498 = arm64g_calculate_flag_c(2, v472, v496, 0);
    v499 = v497 + v484;
    v500 = arm64g_calculate_flag_c(2, v497, v484, 0);
    v501 = (v471 * v471 >> 64) + (v485 * v495 >> 64) + v498 + (v481 * v478 >> 64) + v500;
    v502 = v495 * v478;
    v503 = v493 * 0x2000 | v491 >> 0x33;
    v504 = v476 + v479;
    v505 = arm64g_calculate_flag_c(2, v476, v479, 0);
    v506 = v504 + v482;
    v507 = arm64g_calculate_flag_c(2, v504, v482, 0);
    v508 = v506 + v503;
    v509 = arm64g_calculate_flag_c(2, v506, v503, 0);
    v510 = (unsigned long long)(v473 * v468 >> 64) + (v467 * v478 >> 64) + v505 + (v481 * v469 >> 64) + v507 + (v493 >> 0x33) + v509;
    v511 = v501 * 0x2000 | v499 >> 0x33;
    v512 = v502 + v486;
    v513 = arm64g_calculate_flag_c(2, v502, v486, 0);
    v514 = v512 + v474;
    v515 = arm64g_calculate_flag_c(2, v512, v474, 0);
    v516 = v514 + v511;
    v517 = arm64g_calculate_flag_c(2, v514, v511, 0);
    v518 = v510 * 0x2000 | v508 >> 0x33;
    v519 = v477 + v494;
    v520 = arm64g_calculate_flag_c(2, v477, v494, 0);
    v521 = v519 + v483;
    v522 = arm64g_calculate_flag_c(2, v519, v483, 0);
    v523 = v521 + v518;
    v524 = arm64g_calculate_flag_c(2, v521, v518, 0);
    v525 = (v491 & 0x7ffffffffffff) + (((v478 * v495 >> 64) + (unsigned long long)(v485 * v468 >> 64) + v513 + (unsigned long long)(v473 * v470 >> 64) + v515 + (v501 >> 0x33) + v517) * 0x2000 | v516 >> 0x33);
    v526 = (v499 & 0x7ffffffffffff) + 19 * (((v467 * v473 >> 64) + (v469 * v469 >> 64) + v520 + (unsigned long long)(v481 * v468 >> 64) + v522 + (v510 >> 0x33) + v524) * 0x2000 | v523 >> 0x33);
    v527 = v523 & 0x7ffffffffffff;
    v528 = (v508 & 0x7ffffffffffff) + (v525 >> 0x33);
    v529 = v525 & 0x7ffffffffffff;
    v530 = (v516 & 0x7ffffffffffff) + (v526 >> 0x33);
    v531 = v526 & 0x7ffffffffffff;
    v532 = v531 * v531;
    v533 = v531 * 2;
    v534 = v529 * v533;
    v535 = v528 * v533;
    v536 = 19 * v527;
    v537 = v536 * v527;
    v538 = v530 * v530;
    v539 = v530 * 2;
    v540 = v536 * v539;
    v541 = 19 * v528;
    v542 = v528 * 2;
    v543 = v536 * v542;
    v544 = v538 + v543;
    v545 = arm64g_calculate_flag_c(2, v538, v543, 0);
    v546 = v544 + v534;
    v547 = arm64g_calculate_flag_c(2, v544, v534, 0);
    v548 = (unsigned long long)(v530 * v530 >> 64) + (v542 * v536 >> 64) + v545 + (v533 * v529 >> 64) + v547;
    v549 = v529 * 2;
    v550 = v549 * v541;
    v551 = v532 + v550;
    v552 = arm64g_calculate_flag_c(2, v532, v550, 0);
    v553 = v551 + v540;
    v554 = arm64g_calculate_flag_c(2, v551, v540, 0);
    v555 = (v531 * v531 >> 64) + (v541 * v549 >> 64) + v552 + (v539 * v536 >> 64) + v554;
    v556 = v548 * 0x2000 | v546 >> 0x33;
    v557 = v529 * v539;
    v558 = v535 + v537;
    v559 = arm64g_calculate_flag_c(2, v535, v537, 0);
    v560 = v558 + v557;
    v561 = arm64g_calculate_flag_c(2, v558, v557, 0);
    v562 = v560 + v556;
    v563 = arm64g_calculate_flag_c(2, v560, v556, 0);
    v564 = (v533 * v528 >> 64) + (v527 * v536 >> 64) + v559 + (v539 * v529 >> 64) + v561 + (v548 >> 0x33) + v563;
    v565 = v528 * v541;
    v566 = v555 >> 0x33;
    v567 = v549 * v536;
    v568 = v555 * 0x2000 | v553 >> 0x33;
    v569 = v565 + v567;
    v570 = arm64g_calculate_flag_c(2, v565, v567, 0);
    v571 = v530 * v533;
    v572 = v569 + v571;
    v573 = arm64g_calculate_flag_c(2, v569, v571, 0);
    v574 = v572 + v568;
    v575 = arm64g_calculate_flag_c(2, v572, v568, 0);
    v576 = v564 * 0x2000 | v562 >> 0x33;
    v577 = v533 * v527;
    v578 = v529 * v529;
    v579 = v577 + v578;
    v580 = arm64g_calculate_flag_c(2, v577, v578, 0);
    v581 = v528 * v539;
    v582 = v579 + v581;
    v583 = arm64g_calculate_flag_c(2, v579, v581, 0);
    v584 = v582 + v576;
    v585 = arm64g_calculate_flag_c(2, v582, v576, 0);
    v586 = (v546 & 0x7ffffffffffff) + (((v541 * v528 >> 64) + (v536 * v549 >> 64) + v570 + (unsigned long long)(v533 * v530 >> 64) + v573 + v566 + v575) * 0x2000 | v574 >> 0x33);
    v587 = (v553 & 0x7ffffffffffff) + 19 * (((v527 * v533 >> 64) + (v529 * v529 >> 64) + v580 + (v539 * v528 >> 64) + v583 + (v564 >> 0x33) + v585) * 0x2000 | v584 >> 0x33);
    v53 = v587 & 0x7ffffffffffff;
    v54 = (v574 & 0x7ffffffffffff) + (v587 >> 0x33);
    v55 = v586 & 0x7ffffffffffff;
    v56 = (v562 & 0x7ffffffffffff) + (v586 >> 0x33);
    v57 = v584 & 0x7ffffffffffff;
    sub_a11a14(&v53, &v30, &v53, v578, v566);
    sub_a11a14(&v58, &v58, &v53);
    v588 = v58;
    v589 = v59;
    v590 = v60;
    v591 = v61;
    v592 = v62;
    v593 = v588 * v588;
    v594 = v588 * 2;
    v595 = v589 * v594;
    v596 = v594 * v590;
    v597 = v594 * v591;
    v598 = v594 * v592;
    v599 = 19 * v592;
    v600 = v599 * v592 >> 64;
    v601 = v592 * v599;
    v602 = v589 * v589;
    v603 = v596 + v602;
    v604 = arm64g_calculate_flag_c(2, v596, v602, 0);
    v605 = v589 * 2;
    v606 = v605 * v590 >> 64;
    v607 = v590 * v605;
    v608 = v605 * v599;
    v609 = 19 * v591;
    v610 = v591 * v609;
    v611 = v610 + v595;
    v612 = arm64g_calculate_flag_c(2, v610, v595, 0);
    v613 = v591 * 2;
    v614 = v613 * v599;
    v615 = v603 + v614;
    v616 = arm64g_calculate_flag_c(2, v603, v614, 0);
    v617 = v590 * 2;
    v618 = v617 * v609;
    v619 = v618 + v593;
    v620 = arm64g_calculate_flag_c(2, v618, v593, 0);
    v621 = v619 + v608;
    v622 = arm64g_calculate_flag_c(2, v619, v608, 0);
    v623 = v617 * v599;
    v624 = v611 + v623;
    v625 = arm64g_calculate_flag_c(2, v611, v623, 0);
    v626 = (unsigned long long)(v609 * v591 >> 64) + (unsigned long long)(v594 * v589 >> 64) + v612 + (v599 * v617 >> 64) + v625;
    v627 = v605 * v591;
    v628 = ((unsigned long long)(v590 * v594 >> 64) + (unsigned long long)(v589 * v589 >> 64) + v604 + (v599 * v613 >> 64) + v616) * 0x2000 | v615 >> 0x33;
    v629 = v597 + v607;
    v630 = arm64g_calculate_flag_c(2, v597, v607, 0);
    v631 = v629 + v601;
    v632 = arm64g_calculate_flag_c(2, v629, v601, 0);
    v633 = (unsigned long long)(v591 * v594 >> 64) + v606 + v630 + v600 + v632;
    v634 = v631 + v628;
    v635 = arm64g_calculate_condition(50, v631, v628, 0);
    v636 = ((v609 * v617 >> 64) + (v588 * v588 >> 64) + v620 + (v599 * v605 >> 64) + v622) * 0x2000 | v621 >> 0x33;
    v637 = v590 * v590;
    v638 = v624 + v636;
    v639 = arm64g_calculate_condition(50, v624, v636, 0);
    v640 = (v635 & 1 ? v633 : v633 + 1) * 0x2000 | v634 >> 0x33;
    v641 = v627 + v637;
    v642 = arm64g_calculate_flag_c(2, v627, v637, 0);
    v643 = v641 + v598;
    v644 = arm64g_calculate_flag_c(2, v641, v598, 0);
    v645 = (unsigned long long)(v591 * v605 >> 64) + (unsigned long long)(v590 * v590 >> 64) + v642 + (unsigned long long)(v592 * v594 >> 64) + v644;
    v646 = v643 + v640;
    v647 = arm64g_calculate_condition(50, v643, v640, 0);
    v648 = (v615 & 0x7ffffffffffff) + ((v639 & 1 ? v626 : v626 + 1) * 0x2000 | v638 >> 0x33);
    v649 = (v621 & 0x7ffffffffffff) + 19 * ((v647 & 1 ? v645 : v645 + 1) * 0x2000 | v646 >> 0x33);
    v48 = v649 & 0x7ffffffffffff;
    v49 = (v638 & 0x7ffffffffffff) + (v649 >> 0x33);
    v50 = v648 & 0x7ffffffffffff;
    v51 = (v634 & 0x7ffffffffffff) + (v648 >> 0x33);
    v52 = v646 & 0x7ffffffffffff;
    sub_a11a14(&v53, &v53, &v48, v597, v623, v600, v606, v607);
    v650 = v53;
    v651 = v54;
    v652 = v55;
    v653 = v56;
    v654 = v650 * v650;
    v655 = v57;
    v656 = v650 * 2;
    v657 = v651 * v656;
    v658 = v656 * v652;
    v659 = v656 * v653;
    v660 = 19 * v655;
    v661 = v655 * v660;
    v662 = v651 * v651;
    v663 = v658 + v662;
    v664 = arm64g_calculate_flag_c(2, v658, v662, 0);
    v665 = v651 * 2;
    v666 = v652 * v665;
    v667 = 19 * v653;
    v668 = v653 * v667;
    v669 = v668 + v657;
    v670 = arm64g_calculate_flag_c(2, v668, v657, 0);
    v671 = v653 * 2;
    v672 = v671 * v660;
    v673 = v663 + v672;
    v674 = arm64g_calculate_flag_c(2, v663, v672, 0);
    v675 = v652 * 2;
    v676 = v675 * v667;
    v677 = v676 + v654;
    v678 = v665 * v660;
    v679 = arm64g_calculate_flag_c(2, v676, v654, 0);
    v680 = v677 + v678;
    v681 = arm64g_calculate_flag_c(2, v677, v678, 0);
    v682 = v675 * v660;
    v683 = v669 + v682;
    v684 = arm64g_calculate_flag_c(2, v669, v682, 0);
    v685 = (unsigned long long)(v667 * v653 >> 64) + (unsigned long long)(v656 * v651 >> 64) + v670 + (v660 * v675 >> 64) + v684;
    v686 = ((unsigned long long)(v652 * v656 >> 64) + (unsigned long long)(v651 * v651 >> 64) + v664 + (v660 * v671 >> 64) + v674) * 0x2000 | v673 >> 0x33;
    v687 = v659 + v666;
    v688 = v665 * v653;
    v689 = arm64g_calculate_flag_c(2, v659, v666, 0);
    v690 = v687 + v661;
    v691 = arm64g_calculate_flag_c(2, v687, v661, 0);
    v692 = (unsigned long long)(v653 * v656 >> 64) + (unsigned long long)(v665 * v652 >> 64) + v689 + (unsigned long long)(v660 * v655 >> 64) + v691;
    v693 = v690 + v686;
    v694 = arm64g_calculate_condition(50, v690, v686, 0);
    v695 = ((v667 * v675 >> 64) + (unsigned long long)(v650 * v650 >> 64) + v679 + (v660 * v665 >> 64) + v681) * 0x2000 | v680 >> 0x33;
    v696 = v683 + v695;
    v697 = arm64g_calculate_condition(50, v683, v695, 0);
    v698 = v652 * v652;
    v699 = (v694 & 1 ? v692 : v692 + 1) * 0x2000 | v693 >> 0x33;
    v700 = v688 + v698;
    v701 = arm64g_calculate_flag_c(2, v688, v698, 0);
    v702 = v656 * v655;
    v703 = v700 + v702;
    v704 = arm64g_calculate_flag_c(2, v700, v702, 0);
    v705 = (unsigned long long)(v653 * v665 >> 64) + (unsigned long long)(v652 * v652 >> 64) + v701 + (unsigned long long)(v655 * v656 >> 64) + v704;
    v706 = v703 + v699;
    v707 = arm64g_calculate_condition(50, v703, v699, 0);
    v708 = (v673 & 0x7ffffffffffff) + ((v697 & 1 ? v685 : v685 + 1) * 0x2000 | v696 >> 0x33);
    v709 = (v680 & 0x7ffffffffffff) + 19 * ((v707 & 1 ? v705 : v705 + 1) * 0x2000 | v706 >> 0x33);
    v710 = v706 & 0x7ffffffffffff;
    v711 = (v693 & 0x7ffffffffffff) + (v708 >> 0x33);
    v712 = v708 & 0x7ffffffffffff;
    v713 = (v696 & 0x7ffffffffffff) + (v709 >> 0x33);
    v714 = v709 & 0x7ffffffffffff;
    i = 4;
    do
    {
        v716 = i;
        v717 = v714 * v714;
        v718 = v714 * 2;
        v719 = v713 * v718;
        v720 = v718 * v712;
        v721 = v718 * v711;
        v722 = 19 * v710;
        v723 = v713 * v713;
        v724 = v720 + v723;
        v725 = arm64g_calculate_flag_c(2, v720, v723, 0);
        v726 = v713 * 2;
        v727 = v726 * v722;
        v728 = 19 * v711;
        v729 = v711 * v728;
        v730 = v729 + v719;
        v731 = arm64g_calculate_flag_c(2, v729, v719, 0);
        v732 = v711 * 2;
        v733 = v732 * v722;
        v734 = v724 + v733;
        v735 = arm64g_calculate_flag_c(2, v724, v733, 0);
        v736 = v712 * 2;
        v737 = v736 * v728;
        v738 = v737 + v717;
        v739 = arm64g_calculate_flag_c(2, v737, v717, 0);
        v740 = v738 + v727;
        v741 = arm64g_calculate_flag_c(2, v738, v727, 0);
        v742 = v736 * v722;
        v743 = v730 + v742;
        v744 = arm64g_calculate_flag_c(2, v730, v742, 0);
        v745 = (unsigned long long)(v728 * v711 >> 64) + (unsigned long long)(v718 * v713 >> 64) + v731 + (v722 * v736 >> 64) + v744;
        v746 = ((v712 * v718 >> 64) + (unsigned long long)(v713 * v713 >> 64) + v725 + (v722 * v732 >> 64) + v735) * 0x2000 | v734 >> 0x33;
        v747 = v712 * v726;
        v748 = v721 + v747;
        v749 = arm64g_calculate_flag_c(2, v721, v747, 0);
        v750 = v710 * v722;
        v751 = v748 + v750;
        v752 = arm64g_calculate_flag_c(2, v748, v750, 0);
        v753 = (unsigned long long)(v711 * v718 >> 64) + (v726 * v712 >> 64) + v749 + (v722 * v710 >> 64) + v752;
        v754 = v751 + v746;
        v755 = arm64g_calculate_condition(50, v751, v746, 0);
        v756 = ((v728 * v736 >> 64) + (v714 * v714 >> 64) + v739 + (v722 * v726 >> 64) + v741) * 0x2000 | v740 >> 0x33;
        v757 = v743 + v756;
        v758 = arm64g_calculate_condition(50, v743, v756, 0);
        v759 = (v755 & 1 ? v753 : v753 + 1) * 0x2000 | v754 >> 0x33;
        v760 = v726 * v711;
        v761 = v712 * v712;
        v762 = v760 + v761;
        v763 = arm64g_calculate_flag_c(2, v760, v761, 0);
        v764 = v718 * v710;
        v765 = v762 + v764;
        v766 = arm64g_calculate_flag_c(2, v762, v764, 0);
        v767 = (unsigned long long)(v711 * v726 >> 64) + (v712 * v712 >> 64) + v763 + (v710 * v718 >> 64) + v766;
        v768 = v765 + v759;
        v769 = arm64g_calculate_condition(50, v765, v759, 0);
        v770 = (v734 & 0x7ffffffffffff) + ((v758 & 1 ? v745 : v745 + 1) * 0x2000 | v757 >> 0x33);
        v710 = v768 & 0x7ffffffffffff;
        v711 = (v754 & 0x7ffffffffffff) + (v770 >> 0x33);
        v712 = v770 & 0x7ffffffffffff;
        v771 = (v740 & 0x7ffffffffffff) + 19 * ((v769 & 1 ? v767 : v767 + 1) * 0x2000 | v768 >> 0x33);
        v713 = (v757 & 0x7ffffffffffff) + (v771 >> 0x33);
        v714 = v771 & 0x7ffffffffffff;
        i = v716 - 1;
    } while (i);
    v48 = v714;
    v49 = v713;
    v50 = v712;
    v51 = v711;
    v52 = v710;
    sub_a11a14(&v53, &v48, &v53);
    v772 = v53;
    v773 = v54;
    v774 = v55;
    v775 = v56;
    v776 = v57;
    v777 = v772 * v772;
    v778 = v772 * 2;
    v779 = v773 * v778;
    v780 = v778 * v774;
    v781 = v778 * v775;
    v782 = 19 * v776;
    v783 = v776 * v782;
    v784 = v773 * v773;
    v785 = v780 + v784;
    v786 = arm64g_calculate_flag_c(2, v780, v784, 0);
    v787 = v773 * 2;
    v788 = v774 * v787;
    v789 = 19 * v775;
    v790 = v775 * v789;
    v791 = v790 + v779;
    v792 = arm64g_calculate_flag_c(2, v790, v779, 0);
    v793 = v775 * 2;
    v794 = v793 * v782;
    v795 = v785 + v794;
    v796 = arm64g_calculate_flag_c(2, v785, v794, 0);
    v797 = v774 * 2;
    v798 = v797 * v789;
    v799 = v798 + v777;
    v800 = v787 * v782;
    v801 = arm64g_calculate_flag_c(2, v798, v777, 0);
    v802 = v799 + v800;
    v803 = arm64g_calculate_flag_c(2, v799, v800, 0);
    v804 = v797 * v782;
    v805 = v791 + v804;
    v806 = arm64g_calculate_flag_c(2, v791, v804, 0);
    v807 = (unsigned long long)(v789 * v775 >> 64) + (unsigned long long)(v778 * v773 >> 64) + v792 + (v782 * v797 >> 64) + v806;
    v808 = ((unsigned long long)(v774 * v778 >> 64) + (unsigned long long)(v773 * v773 >> 64) + v786 + (v782 * v793 >> 64) + v796) * 0x2000 | v795 >> 0x33;
    v809 = v781 + v788;
    v810 = v787 * v775;
    v811 = arm64g_calculate_flag_c(2, v781, v788, 0);
    v812 = v809 + v783;
    v813 = arm64g_calculate_flag_c(2, v809, v783, 0);
    v814 = (unsigned long long)(v775 * v778 >> 64) + (unsigned long long)(v787 * v774 >> 64) + v811 + (unsigned long long)(v782 * v776 >> 64) + v813;
    v815 = v812 + v808;
    v816 = arm64g_calculate_condition(50, v812, v808, 0);
    v817 = ((v789 * v797 >> 64) + (unsigned long long)(v772 * v772 >> 64) + v801 + (v782 * v787 >> 64) + v803) * 0x2000 | v802 >> 0x33;
    v818 = v805 + v817;
    v819 = arm64g_calculate_condition(50, v805, v817, 0);
    v820 = v774 * v774;
    v821 = (v816 & 1 ? v814 : v814 + 1) * 0x2000 | v815 >> 0x33;
    v822 = v810 + v820;
    v823 = arm64g_calculate_flag_c(2, v810, v820, 0);
    v824 = v778 * v776;
    v825 = v822 + v824;
    v826 = arm64g_calculate_flag_c(2, v822, v824, 0);
    v827 = (unsigned long long)(v775 * v787 >> 64) + (unsigned long long)(v774 * v774 >> 64) + v823 + (unsigned long long)(v776 * v778 >> 64) + v826;
    v828 = v825 + v821;
    v829 = arm64g_calculate_condition(50, v825, v821, 0);
    v830 = (v795 & 0x7ffffffffffff) + ((v819 & 1 ? v807 : v807 + 1) * 0x2000 | v818 >> 0x33);
    v831 = (v802 & 0x7ffffffffffff) + 19 * ((v829 & 1 ? v827 : v827 + 1) * 0x2000 | v828 >> 0x33);
    v832 = v828 & 0x7ffffffffffff;
    v833 = (v815 & 0x7ffffffffffff) + (v830 >> 0x33);
    v834 = v830 & 0x7ffffffffffff;
    v835 = (v818 & 0x7ffffffffffff) + (v831 >> 0x33);
    v836 = v831 & 0x7ffffffffffff;
    j = 9;
    do
    {
        v838 = j;
        v839 = v836 * v836;
        v840 = v836 * 2;
        v841 = v835 * v840;
        v842 = v840 * v834;
        v843 = v840 * v833;
        v844 = 19 * v832;
        v845 = v835 * v835;
        v846 = v842 + v845;
        v847 = arm64g_calculate_flag_c(2, v842, v845, 0);
        v848 = v835 * 2;
        v849 = v848 * v844;
        v850 = 19 * v833;
        v851 = v833 * v850;
        v852 = v851 + v841;
        v853 = arm64g_calculate_flag_c(2, v851, v841, 0);
        v854 = v833 * 2;
        v855 = v854 * v844;
        v856 = v846 + v855;
        v857 = arm64g_calculate_flag_c(2, v846, v855, 0);
        v858 = v834 * 2;
        v859 = v858 * v850;
        v860 = v859 + v839;
        v861 = arm64g_calculate_flag_c(2, v859, v839, 0);
        v862 = v860 + v849;
        v863 = arm64g_calculate_flag_c(2, v860, v849, 0);
        v864 = v858 * v844;
        v865 = v852 + v864;
        v866 = arm64g_calculate_flag_c(2, v852, v864, 0);
        v867 = (unsigned long long)(v850 * v833 >> 64) + (unsigned long long)(v840 * v835 >> 64) + v853 + (v844 * v858 >> 64) + v866;
        v868 = ((v834 * v840 >> 64) + (unsigned long long)(v835 * v835 >> 64) + v847 + (v844 * v854 >> 64) + v857) * 0x2000 | v856 >> 0x33;
        v869 = v834 * v848;
        v870 = v843 + v869;
        v871 = arm64g_calculate_flag_c(2, v843, v869, 0);
        v872 = v832 * v844;
        v873 = v870 + v872;
        v874 = arm64g_calculate_flag_c(2, v870, v872, 0);
        v875 = (unsigned long long)(v833 * v840 >> 64) + (v848 * v834 >> 64) + v871 + (v844 * v832 >> 64) + v874;
        v876 = v873 + v868;
        v877 = arm64g_calculate_condition(50, v873, v868, 0);
        v878 = ((v850 * v858 >> 64) + (v836 * v836 >> 64) + v861 + (v844 * v848 >> 64) + v863) * 0x2000 | v862 >> 0x33;
        v879 = v865 + v878;
        v880 = arm64g_calculate_condition(50, v865, v878, 0);
        v881 = (v877 & 1 ? v875 : v875 + 1) * 0x2000 | v876 >> 0x33;
        v882 = v848 * v833;
        v883 = v834 * v834;
        v884 = v882 + v883;
        v885 = arm64g_calculate_flag_c(2, v882, v883, 0);
        v886 = v840 * v832;
        v887 = v884 + v886;
        v888 = arm64g_calculate_flag_c(2, v884, v886, 0);
        v889 = (unsigned long long)(v833 * v848 >> 64) + (v834 * v834 >> 64) + v885 + (v832 * v840 >> 64) + v888;
        v890 = v887 + v881;
        v891 = arm64g_calculate_condition(50, v887, v881, 0);
        v892 = (v856 & 0x7ffffffffffff) + ((v880 & 1 ? v867 : v867 + 1) * 0x2000 | v879 >> 0x33);
        v832 = v890 & 0x7ffffffffffff;
        v833 = (v876 & 0x7ffffffffffff) + (v892 >> 0x33);
        v834 = v892 & 0x7ffffffffffff;
        v893 = (v862 & 0x7ffffffffffff) + 19 * ((v891 & 1 ? v889 : v889 + 1) * 0x2000 | v890 >> 0x33);
        v835 = (v879 & 0x7ffffffffffff) + (v893 >> 0x33);
        v836 = v893 & 0x7ffffffffffff;
        j = v838 - 1;
    } while (j);
    v48 = v836;
    v49 = v835;
    v50 = v834;
    v51 = v833;
    v52 = v832;
    sub_a11a14(&v48, &v48, &v53);
    v894 = v48;
    v895 = v49;
    v896 = v50;
    v897 = v51;
    v898 = v52;
    v899 = v894 * v894;
    v900 = v894 * 2;
    v901 = v895 * v900;
    v902 = v900 * v896;
    v903 = v900 * v897;
    v904 = 19 * v898;
    v905 = v898 * v904;
    v906 = v895 * v895;
    v907 = v902 + v906;
    v908 = arm64g_calculate_flag_c(2, v902, v906, 0);
    v909 = v895 * 2;
    v910 = v896 * v909;
    v911 = 19 * v897;
    v912 = v897 * v911;
    v913 = v912 + v901;
    v914 = arm64g_calculate_flag_c(2, v912, v901, 0);
    v915 = v897 * 2;
    v916 = v915 * v904;
    v917 = v907 + v916;
    v918 = arm64g_calculate_flag_c(2, v907, v916, 0);
    v919 = v896 * 2;
    v920 = v919 * v911;
    v921 = v920 + v899;
    v922 = v909 * v904;
    v923 = arm64g_calculate_flag_c(2, v920, v899, 0);
    v924 = v921 + v922;
    v925 = arm64g_calculate_flag_c(2, v921, v922, 0);
    v926 = v919 * v904;
    v927 = v913 + v926;
    v928 = arm64g_calculate_flag_c(2, v913, v926, 0);
    v929 = (unsigned long long)(v911 * v897 >> 64) + (unsigned long long)(v900 * v895 >> 64) + v914 + (v904 * v919 >> 64) + v928;
    v930 = ((unsigned long long)(v896 * v900 >> 64) + (unsigned long long)(v895 * v895 >> 64) + v908 + (v904 * v915 >> 64) + v918) * 0x2000 | v917 >> 0x33;
    v931 = v903 + v910;
    v932 = v909 * v897;
    v933 = arm64g_calculate_flag_c(2, v903, v910, 0);
    v934 = v931 + v905;
    v935 = arm64g_calculate_flag_c(2, v931, v905, 0);
    v936 = (unsigned long long)(v897 * v900 >> 64) + (unsigned long long)(v909 * v896 >> 64) + v933 + (unsigned long long)(v904 * v898 >> 64) + v935;
    v937 = v934 + v930;
    v938 = arm64g_calculate_condition(50, v934, v930, 0);
    v939 = ((v911 * v919 >> 64) + (unsigned long long)(v894 * v894 >> 64) + v923 + (v904 * v909 >> 64) + v925) * 0x2000 | v924 >> 0x33;
    v940 = v927 + v939;
    v941 = arm64g_calculate_condition(50, v927, v939, 0);
    v942 = v896 * v896;
    v943 = (v938 & 1 ? v936 : v936 + 1) * 0x2000 | v937 >> 0x33;
    v944 = v932 + v942;
    v945 = arm64g_calculate_flag_c(2, v932, v942, 0);
    v946 = v900 * v898;
    v947 = v944 + v946;
    v948 = arm64g_calculate_flag_c(2, v944, v946, 0);
    v949 = (unsigned long long)(v897 * v909 >> 64) + (unsigned long long)(v896 * v896 >> 64) + v945 + (unsigned long long)(v898 * v900 >> 64) + v948;
    v950 = v947 + v943;
    v951 = arm64g_calculate_condition(50, v947, v943, 0);
    v952 = (v917 & 0x7ffffffffffff) + ((v941 & 1 ? v929 : v929 + 1) * 0x2000 | v940 >> 0x33);
    v953 = (v924 & 0x7ffffffffffff) + 19 * ((v951 & 1 ? v949 : v949 + 1) * 0x2000 | v950 >> 0x33);
    v954 = v950 & 0x7ffffffffffff;
    v955 = (v937 & 0x7ffffffffffff) + (v952 >> 0x33);
    v956 = v952 & 0x7ffffffffffff;
    v957 = (v940 & 0x7ffffffffffff) + (v953 >> 0x33);
    v958 = v953 & 0x7ffffffffffff;
    k = 19;
    do
    {
        v960 = k;
        v961 = v958 * v958;
        v962 = v958 * 2;
        v963 = v957 * v962;
        v964 = v962 * v956;
        v965 = v962 * v955;
        v966 = 19 * v954;
        v967 = v957 * v957;
        v968 = v964 + v967;
        v969 = arm64g_calculate_flag_c(2, v964, v967, 0);
        v970 = v957 * 2;
        v971 = v970 * v966;
        v972 = 19 * v955;
        v973 = v955 * v972;
        v974 = v973 + v963;
        v975 = arm64g_calculate_flag_c(2, v973, v963, 0);
        v976 = v955 * 2;
        v977 = v976 * v966;
        v978 = v968 + v977;
        v979 = arm64g_calculate_flag_c(2, v968, v977, 0);
        v980 = v956 * 2;
        v981 = v980 * v972;
        v982 = v981 + v961;
        v983 = arm64g_calculate_flag_c(2, v981, v961, 0);
        v984 = v982 + v971;
        v985 = arm64g_calculate_flag_c(2, v982, v971, 0);
        v986 = v980 * v966;
        v987 = v974 + v986;
        v988 = arm64g_calculate_flag_c(2, v974, v986, 0);
        v989 = (unsigned long long)(v972 * v955 >> 64) + (unsigned long long)(v962 * v957 >> 64) + v975 + (v966 * v980 >> 64) + v988;
        v990 = ((v956 * v962 >> 64) + (unsigned long long)(v957 * v957 >> 64) + v969 + (v966 * v976 >> 64) + v979) * 0x2000 | v978 >> 0x33;
        v991 = v956 * v970;
        v992 = v965 + v991;
        v993 = arm64g_calculate_flag_c(2, v965, v991, 0);
        v994 = v954 * v966;
        v995 = v992 + v994;
        v996 = arm64g_calculate_flag_c(2, v992, v994, 0);
        v997 = (unsigned long long)(v955 * v962 >> 64) + (v970 * v956 >> 64) + v993 + (v966 * v954 >> 64) + v996;
        v998 = v995 + v990;
        v999 = arm64g_calculate_condition(50, v995, v990, 0);
        v1000 = ((v972 * v980 >> 64) + (v958 * v958 >> 64) + v983 + (v966 * v970 >> 64) + v985) * 0x2000 | v984 >> 0x33;
        v1001 = v987 + v1000;
        v1002 = arm64g_calculate_condition(50, v987, v1000, 0);
        v1003 = (v999 & 1 ? v997 : v997 + 1) * 0x2000 | v998 >> 0x33;
        v1004 = v970 * v955;
        v1005 = v956 * v956;
        v1006 = v1004 + v1005;
        v1007 = arm64g_calculate_flag_c(2, v1004, v1005, 0);
        v1008 = v962 * v954;
        v1009 = v1006 + v1008;
        v1010 = arm64g_calculate_flag_c(2, v1006, v1008, 0);
        v1011 = (unsigned long long)(v955 * v970 >> 64) + (v956 * v956 >> 64) + v1007 + (v954 * v962 >> 64) + v1010;
        v1012 = v1009 + v1003;
        v1013 = arm64g_calculate_condition(50, v1009, v1003, 0);
        v1014 = (v978 & 0x7ffffffffffff) + ((v1002 & 1 ? v989 : v989 + 1) * 0x2000 | v1001 >> 0x33);
        v954 = v1012 & 0x7ffffffffffff;
        v955 = (v998 & 0x7ffffffffffff) + (v1014 >> 0x33);
        v956 = v1014 & 0x7ffffffffffff;
        v1015 = (v984 & 0x7ffffffffffff) + 19 * ((v1013 & 1 ? v1011 : v1011 + 1) * 0x2000 | v1012 >> 0x33);
        v957 = (v1001 & 0x7ffffffffffff) + (v1015 >> 0x33);
        v958 = v1015 & 0x7ffffffffffff;
        k = v960 - 1;
    } while (k);
    v43 = v958;
    v44 = v957;
    v45 = v956;
    v46 = v955;
    v47 = v954;
    sub_a11a14(&v48, &v43, &v48);
    l = 10;
    do
    {
        v1017 = l;
        v1018 = v48 * v48;
        v1019 = v48 * 2;
        v1020 = v49 * v1019;
        v1021 = v1019 * v50;
        v1022 = v1019 * v51;
        v1023 = 19 * v52;
        v1024 = v49 * v49;
        v1025 = v1021 + v1024;
        v1026 = arm64g_calculate_flag_c(2, v1021, v1024, 0);
        v1027 = v49 * 2;
        v1028 = v1027 * v1023;
        v1029 = 19 * v51;
        v1030 = v51 * v1029;
        v1031 = v1030 + v1020;
        v1032 = arm64g_calculate_flag_c(2, v1030, v1020, 0);
        v1033 = v51 * 2;
        v1034 = v1033 * v1023;
        v1035 = v1025 + v1034;
        v1036 = arm64g_calculate_flag_c(2, v1025, v1034, 0);
        v1037 = v50 * 2;
        v1038 = v1037 * v1029;
        v1039 = v1038 + v1018;
        v1040 = arm64g_calculate_flag_c(2, v1038, v1018, 0);
        v1041 = v1039 + v1028;
        v1042 = arm64g_calculate_flag_c(2, v1039, v1028, 0);
        v1043 = v1037 * v1023;
        v1044 = v1031 + v1043;
        v1045 = arm64g_calculate_flag_c(2, v1031, v1043, 0);
        v1046 = (unsigned long long)(v1029 * v51 >> 64) + (unsigned long long)(v1019 * v49 >> 64) + v1032 + (v1023 * v1037 >> 64) + v1045;
        v1047 = ((v50 * v1019 >> 64) + (unsigned long long)(v49 * v49 >> 64) + v1026 + (v1023 * v1033 >> 64) + v1036) * 0x2000 | v1035 >> 0x33;
        v1048 = v50 * v1027;
        v1049 = v1022 + v1048;
        v1050 = arm64g_calculate_flag_c(2, v1022, v1048, 0);
        v1051 = v52 * v1023;
        v1052 = v1049 + v1051;
        v1053 = arm64g_calculate_flag_c(2, v1049, v1051, 0);
        v1054 = (unsigned long long)(v51 * v1019 >> 64) + (v1027 * v50 >> 64) + v1050 + (v1023 * v52 >> 64) + v1053;
        v1055 = v1052 + v1047;
        v1056 = arm64g_calculate_condition(50, v1052, v1047, 0);
        v1057 = ((v1029 * v1037 >> 64) + (v48 * v48 >> 64) + v1040 + (v1023 * v1027 >> 64) + v1042) * 0x2000 | v1041 >> 0x33;
        v1058 = v1044 + v1057;
        v1059 = arm64g_calculate_condition(50, v1044, v1057, 0);
        v1060 = (v1056 & 1 ? v1054 : v1054 + 1) * 0x2000 | v1055 >> 0x33;
        v1061 = v1027 * v51;
        v1062 = v50 * v50;
        v1063 = v1061 + v1062;
        v1064 = arm64g_calculate_flag_c(2, v1061, v1062, 0);
        v1065 = v1019 * v52;
        v1066 = v1063 + v1065;
        v1067 = arm64g_calculate_flag_c(2, v1063, v1065, 0);
        v1068 = (unsigned long long)(v51 * v1027 >> 64) + (v50 * v50 >> 64) + v1064 + (v52 * v1019 >> 64) + v1067;
        v1069 = v1066 + v1060;
        v1070 = arm64g_calculate_condition(50, v1066, v1060, 0);
        v1071 = (v1035 & 0x7ffffffffffff) + ((v1059 & 1 ? v1046 : v1046 + 1) * 0x2000 | v1058 >> 0x33);
        v52 = v1069 & 0x7ffffffffffff;
        v51 = (v1055 & 0x7ffffffffffff) + (v1071 >> 0x33);
        v50 = v1071 & 0x7ffffffffffff;
        v1072 = (v1041 & 0x7ffffffffffff) + 19 * ((v1070 & 1 ? v1068 : v1068 + 1) * 0x2000 | v1069 >> 0x33);
        v49 = (v1058 & 0x7ffffffffffff) + (v1072 >> 0x33);
        v48 = v1072 & 0x7ffffffffffff;
        l = v1017 - 1;
    } while (l);
    sub_a11a14(&v53, &v48, &v53);
    v1074 = v53;
    v1075 = v54;
    v1076 = v55;
    v1077 = v56;
    v1078 = v57;
    v1079 = v1074 * v1074;
    v1080 = v1074 * 2;
    v1081 = v1075 * v1080;
    v1082 = v1080 * v1076;
    v1083 = v1080 * v1077;
    v1084 = 19 * v1078;
    v1085 = v1078 * v1084;
    v1086 = v1075 * v1075;
    v1087 = v1082 + v1086;
    v1088 = arm64g_calculate_flag_c(2, v1082, v1086, 0);
    v1089 = v1075 * 2;
    v1090 = v1076 * v1089;
    v1091 = 19 * v1077;
    v1092 = v1077 * v1091;
    v1093 = v1092 + v1081;
    v1094 = arm64g_calculate_flag_c(2, v1092, v1081, 0);
    v1095 = v1077 * 2;
    v1096 = v1095 * v1084;
    v1097 = v1087 + v1096;
    v1098 = arm64g_calculate_flag_c(2, v1087, v1096, 0);
    v1099 = v1076 * 2;
    v1100 = v1099 * v1091;
    v1101 = v1100 + v1079;
    v1102 = v1089 * v1084;
    v1103 = arm64g_calculate_flag_c(2, v1100, v1079, 0);
    v1104 = v1101 + v1102;
    v1105 = arm64g_calculate_flag_c(2, v1101, v1102, 0);
    v1106 = v1099 * v1084;
    v1107 = v1093 + v1106;
    v1108 = arm64g_calculate_flag_c(2, v1093, v1106, 0);
    v1109 = (unsigned long long)(v1091 * v1077 >> 64) + (unsigned long long)(v1080 * v1075 >> 64) + v1094 + (v1084 * v1099 >> 64) + v1108;
    v1110 = ((unsigned long long)(v1076 * v1080 >> 64) + (unsigned long long)(v1075 * v1075 >> 64) + v1088 + (v1084 * v1095 >> 64) + v1098) * 0x2000 | v1097 >> 0x33;
    v1111 = v1083 + v1090;
    v1112 = v1089 * v1077;
    v1113 = arm64g_calculate_flag_c(2, v1083, v1090, 0);
    v1114 = v1111 + v1085;
    v1115 = arm64g_calculate_flag_c(2, v1111, v1085, 0);
    v1116 = (unsigned long long)(v1077 * v1080 >> 64) + (unsigned long long)(v1089 * v1076 >> 64) + v1113 + (unsigned long long)(v1084 * v1078 >> 64) + v1115;
    v1117 = v1114 + v1110;
    v1118 = arm64g_calculate_condition(50, v1114, v1110, 0);
    v1119 = ((v1091 * v1099 >> 64) + (unsigned long long)(v1074 * v1074 >> 64) + v1103 + (v1084 * v1089 >> 64) + v1105) * 0x2000 | v1104 >> 0x33;
    v1120 = v1107 + v1119;
    v1121 = arm64g_calculate_condition(50, v1107, v1119, 0);
    v1122 = v1076 * v1076;
    v1123 = (v1118 & 1 ? v1116 : v1116 + 1) * 0x2000 | v1117 >> 0x33;
    v1124 = v1112 + v1122;
    v1125 = arm64g_calculate_flag_c(2, v1112, v1122, 0);
    v1126 = v1080 * v1078;
    v1127 = v1124 + v1126;
    v1128 = arm64g_calculate_flag_c(2, v1124, v1126, 0);
    v1129 = (unsigned long long)(v1077 * v1089 >> 64) + (unsigned long long)(v1076 * v1076 >> 64) + v1125 + (unsigned long long)(v1078 * v1080 >> 64) + v1128;
    v1130 = v1127 + v1123;
    v1131 = arm64g_calculate_condition(50, v1127, v1123, 0);
    v1132 = (v1097 & 0x7ffffffffffff) + ((v1121 & 1 ? v1109 : v1109 + 1) * 0x2000 | v1120 >> 0x33);
    v1133 = (v1104 & 0x7ffffffffffff) + 19 * ((v1131 & 1 ? v1129 : v1129 + 1) * 0x2000 | v1130 >> 0x33);
    v1134 = v1130 & 0x7ffffffffffff;
    v1135 = (v1117 & 0x7ffffffffffff) + (v1132 >> 0x33);
    v1136 = v1132 & 0x7ffffffffffff;
    v1137 = (v1120 & 0x7ffffffffffff) + (v1133 >> 0x33);
    v1138 = v1133 & 0x7ffffffffffff;
    m = 49;
    do
    {
        v1140 = m;
        v1141 = v1138 * v1138;
        v1142 = v1138 * 2;
        v1143 = v1137 * v1142;
        v1144 = v1142 * v1136;
        v1145 = v1142 * v1135;
        v1146 = 19 * v1134;
        v1147 = v1137 * v1137;
        v1148 = v1144 + v1147;
        v1149 = arm64g_calculate_flag_c(2, v1144, v1147, 0);
        v1150 = v1137 * 2;
        v1151 = v1150 * v1146;
        v1152 = 19 * v1135;
        v1153 = v1135 * v1152;
        v1154 = v1153 + v1143;
        v1155 = arm64g_calculate_flag_c(2, v1153, v1143, 0);
        v1156 = v1135 * 2;
        v1157 = v1156 * v1146;
        v1158 = v1148 + v1157;
        v1159 = arm64g_calculate_flag_c(2, v1148, v1157, 0);
        v1160 = v1136 * 2;
        v1161 = v1160 * v1152;
        v1162 = v1161 + v1141;
        v1163 = arm64g_calculate_flag_c(2, v1161, v1141, 0);
        v1164 = v1162 + v1151;
        v1165 = arm64g_calculate_flag_c(2, v1162, v1151, 0);
        v1166 = v1160 * v1146;
        v1167 = v1154 + v1166;
        v1168 = arm64g_calculate_flag_c(2, v1154, v1166, 0);
        v1169 = (unsigned long long)(v1152 * v1135 >> 64) + (unsigned long long)(v1142 * v1137 >> 64) + v1155 + (v1146 * v1160 >> 64) + v1168;
        v1170 = ((v1136 * v1142 >> 64) + (unsigned long long)(v1137 * v1137 >> 64) + v1149 + (v1146 * v1156 >> 64) + v1159) * 0x2000 | v1158 >> 0x33;
        v1171 = v1136 * v1150;
        v1172 = v1145 + v1171;
        v1173 = arm64g_calculate_flag_c(2, v1145, v1171, 0);
        v1174 = v1134 * v1146;
        v1175 = v1172 + v1174;
        v1176 = arm64g_calculate_flag_c(2, v1172, v1174, 0);
        v1177 = (unsigned long long)(v1135 * v1142 >> 64) + (v1150 * v1136 >> 64) + v1173 + (v1146 * v1134 >> 64) + v1176;
        v1178 = v1175 + v1170;
        v1179 = arm64g_calculate_condition(50, v1175, v1170, 0);
        v1180 = ((v1152 * v1160 >> 64) + (v1138 * v1138 >> 64) + v1163 + (v1146 * v1150 >> 64) + v1165) * 0x2000 | v1164 >> 0x33;
        v1181 = v1167 + v1180;
        v1182 = arm64g_calculate_condition(50, v1167, v1180, 0);
        v1183 = (v1179 & 1 ? v1177 : v1177 + 1) * 0x2000 | v1178 >> 0x33;
        v1184 = v1150 * v1135;
        v1185 = v1136 * v1136;
        v1186 = v1184 + v1185;
        v1187 = arm64g_calculate_flag_c(2, v1184, v1185, 0);
        v1188 = v1142 * v1134;
        v1189 = v1186 + v1188;
        v1190 = arm64g_calculate_flag_c(2, v1186, v1188, 0);
        v1191 = (unsigned long long)(v1135 * v1150 >> 64) + (v1136 * v1136 >> 64) + v1187 + (v1134 * v1142 >> 64) + v1190;
        v1192 = v1189 + v1183;
        v1193 = arm64g_calculate_condition(50, v1189, v1183, 0);
        v1194 = (v1158 & 0x7ffffffffffff) + ((v1182 & 1 ? v1169 : v1169 + 1) * 0x2000 | v1181 >> 0x33);
        v1134 = v1192 & 0x7ffffffffffff;
        v1135 = (v1178 & 0x7ffffffffffff) + (v1194 >> 0x33);
        v1136 = v1194 & 0x7ffffffffffff;
        v1195 = (v1164 & 0x7ffffffffffff) + 19 * ((v1193 & 1 ? v1191 : v1191 + 1) * 0x2000 | v1192 >> 0x33);
        v1137 = (v1181 & 0x7ffffffffffff) + (v1195 >> 0x33);
        v1138 = v1195 & 0x7ffffffffffff;
        m = v1140 - 1;
    } while (m);
    v48 = v1138;
    v49 = v1137;
    v50 = v1136;
    v51 = v1135;
    v52 = v1134;
    sub_a11a14(&v48, &v48, &v53);
    v1196 = v48;
    v1197 = v49;
    v1198 = v50;
    v1199 = v51;
    v1200 = v52;
    v1201 = v1196 * v1196;
    v1202 = v1196 * 2;
    v1203 = v1197 * v1202;
    v1204 = v1202 * v1198;
    v1205 = v1202 * v1199;
    v1206 = 19 * v1200;
    v1207 = v1200 * v1206;
    v1208 = v1197 * v1197;
    v1209 = v1204 + v1208;
    v1210 = arm64g_calculate_flag_c(2, v1204, v1208, 0);
    v1211 = v1197 * 2;
    v1212 = v1198 * v1211;
    v1213 = 19 * v1199;
    v1214 = v1199 * v1213;
    v1215 = v1214 + v1203;
    v1216 = arm64g_calculate_flag_c(2, v1214, v1203, 0);
    v1217 = v1199 * 2;
    v1218 = v1217 * v1206;
    v1219 = v1209 + v1218;
    v1220 = arm64g_calculate_flag_c(2, v1209, v1218, 0);
    v1221 = v1198 * 2;
    v1222 = v1221 * v1213;
    v1223 = v1222 + v1201;
    v1224 = v1211 * v1206;
    v1225 = arm64g_calculate_flag_c(2, v1222, v1201, 0);
    v1226 = v1223 + v1224;
    v1227 = arm64g_calculate_flag_c(2, v1223, v1224, 0);
    v1228 = v1221 * v1206;
    v1229 = v1215 + v1228;
    v1230 = arm64g_calculate_flag_c(2, v1215, v1228, 0);
    v1231 = (unsigned long long)(v1213 * v1199 >> 64) + (unsigned long long)(v1202 * v1197 >> 64) + v1216 + (v1206 * v1221 >> 64) + v1230;
    v1232 = ((unsigned long long)(v1198 * v1202 >> 64) + (unsigned long long)(v1197 * v1197 >> 64) + v1210 + (v1206 * v1217 >> 64) + v1220) * 0x2000 | v1219 >> 0x33;
    v1233 = v1205 + v1212;
    v1234 = v1211 * v1199;
    v1235 = arm64g_calculate_flag_c(2, v1205, v1212, 0);
    v1236 = v1233 + v1207;
    v1237 = arm64g_calculate_flag_c(2, v1233, v1207, 0);
    v1238 = (unsigned long long)(v1199 * v1202 >> 64) + (unsigned long long)(v1211 * v1198 >> 64) + v1235 + (unsigned long long)(v1206 * v1200 >> 64) + v1237;
    v1239 = v1236 + v1232;
    v1240 = arm64g_calculate_condition(50, v1236, v1232, 0);
    v1241 = ((v1213 * v1221 >> 64) + (unsigned long long)(v1196 * v1196 >> 64) + v1225 + (v1206 * v1211 >> 64) + v1227) * 0x2000 | v1226 >> 0x33;
    v1242 = v1229 + v1241;
    v1243 = arm64g_calculate_condition(50, v1229, v1241, 0);
    v1244 = v1198 * v1198;
    v1245 = (v1240 & 1 ? v1238 : v1238 + 1) * 0x2000 | v1239 >> 0x33;
    v1246 = v1234 + v1244;
    v1247 = arm64g_calculate_flag_c(2, v1234, v1244, 0);
    v1248 = v1202 * v1200;
    v1249 = v1246 + v1248;
    v1250 = arm64g_calculate_flag_c(2, v1246, v1248, 0);
    v1251 = (unsigned long long)(v1199 * v1211 >> 64) + (unsigned long long)(v1198 * v1198 >> 64) + v1247 + (unsigned long long)(v1200 * v1202 >> 64) + v1250;
    v1252 = v1249 + v1245;
    v1253 = arm64g_calculate_condition(50, v1249, v1245, 0);
    v1254 = (v1219 & 0x7ffffffffffff) + ((v1243 & 1 ? v1231 : v1231 + 1) * 0x2000 | v1242 >> 0x33);
    v1255 = (v1226 & 0x7ffffffffffff) + 19 * ((v1253 & 1 ? v1251 : v1251 + 1) * 0x2000 | v1252 >> 0x33);
    v1256 = v1252 & 0x7ffffffffffff;
    v1257 = (v1239 & 0x7ffffffffffff) + (v1254 >> 0x33);
    v1258 = v1254 & 0x7ffffffffffff;
    v1259 = (v1242 & 0x7ffffffffffff) + (v1255 >> 0x33);
    v1260 = v1255 & 0x7ffffffffffff;
    n = 99;
    do
    {
        v1262 = n;
        v1263 = v1260 * v1260;
        v1264 = v1260 * 2;
        v1265 = v1259 * v1264;
        v1266 = v1264 * v1258;
        v1267 = v1264 * v1257;
        v1268 = 19 * v1256;
        v1269 = v1259 * v1259;
        v1270 = v1266 + v1269;
        v1271 = arm64g_calculate_flag_c(2, v1266, v1269, 0);
        v1272 = v1259 * 2;
        v1273 = v1272 * v1268;
        v1274 = 19 * v1257;
        v1275 = v1257 * v1274;
        v1276 = v1275 + v1265;
        v1277 = arm64g_calculate_flag_c(2, v1275, v1265, 0);
        v1278 = v1257 * 2;
        v1279 = v1278 * v1268;
        v1280 = v1270 + v1279;
        v1281 = arm64g_calculate_flag_c(2, v1270, v1279, 0);
        v1282 = v1258 * 2;
        v1283 = v1282 * v1274;
        v1284 = v1283 + v1263;
        v1285 = arm64g_calculate_flag_c(2, v1283, v1263, 0);
        v1286 = v1284 + v1273;
        v1287 = arm64g_calculate_flag_c(2, v1284, v1273, 0);
        v1288 = v1282 * v1268;
        v1289 = v1276 + v1288;
        v1290 = arm64g_calculate_flag_c(2, v1276, v1288, 0);
        v1291 = (unsigned long long)(v1274 * v1257 >> 64) + (unsigned long long)(v1264 * v1259 >> 64) + v1277 + (v1268 * v1282 >> 64) + v1290;
        v1292 = ((v1258 * v1264 >> 64) + (unsigned long long)(v1259 * v1259 >> 64) + v1271 + (v1268 * v1278 >> 64) + v1281) * 0x2000 | v1280 >> 0x33;
        v1293 = v1258 * v1272;
        v1294 = v1267 + v1293;
        v1295 = arm64g_calculate_flag_c(2, v1267, v1293, 0);
        v1296 = v1256 * v1268;
        v1297 = v1294 + v1296;
        v1298 = arm64g_calculate_flag_c(2, v1294, v1296, 0);
        v1299 = (unsigned long long)(v1257 * v1264 >> 64) + (v1272 * v1258 >> 64) + v1295 + (v1268 * v1256 >> 64) + v1298;
        v1300 = v1297 + v1292;
        v1301 = arm64g_calculate_condition(50, v1297, v1292, 0);
        v1302 = ((v1274 * v1282 >> 64) + (v1260 * v1260 >> 64) + v1285 + (v1268 * v1272 >> 64) + v1287) * 0x2000 | v1286 >> 0x33;
        v1303 = v1289 + v1302;
        v1304 = arm64g_calculate_condition(50, v1289, v1302, 0);
        v1305 = (v1301 & 1 ? v1299 : v1299 + 1) * 0x2000 | v1300 >> 0x33;
        v1306 = v1272 * v1257;
        v1307 = v1258 * v1258;
        v1308 = v1306 + v1307;
        v1309 = arm64g_calculate_flag_c(2, v1306, v1307, 0);
        v1310 = v1264 * v1256;
        v1311 = v1308 + v1310;
        v1312 = arm64g_calculate_flag_c(2, v1308, v1310, 0);
        v1313 = (unsigned long long)(v1257 * v1272 >> 64) + (v1258 * v1258 >> 64) + v1309 + (v1256 * v1264 >> 64) + v1312;
        v1314 = v1311 + v1305;
        v1315 = arm64g_calculate_condition(50, v1311, v1305, 0);
        v1316 = (v1280 & 0x7ffffffffffff) + ((v1304 & 1 ? v1291 : v1291 + 1) * 0x2000 | v1303 >> 0x33);
        v1256 = v1314 & 0x7ffffffffffff;
        v1257 = (v1300 & 0x7ffffffffffff) + (v1316 >> 0x33);
        v1258 = v1316 & 0x7ffffffffffff;
        v1317 = (v1286 & 0x7ffffffffffff) + 19 * ((v1315 & 1 ? v1313 : v1313 + 1) * 0x2000 | v1314 >> 0x33);
        v1259 = (v1303 & 0x7ffffffffffff) + (v1317 >> 0x33);
        v1260 = v1317 & 0x7ffffffffffff;
        n = v1262 - 1;
    } while (n);
    v43 = v1260;
    v44 = v1259;
    v45 = v1258;
    v46 = v1257;
    v47 = v1256;
    sub_a11a14(&v48, &v43, &v48);
    i0 = 50;
    do
    {
        v1319 = i0;
        v1320 = v48 * v48;
        v1321 = v48 * 2;
        v1322 = v49 * v1321;
        v1323 = v1321 * v50;
        v1324 = v1321 * v51;
        v1325 = 19 * v52;
        v1326 = v49 * v49;
        v1327 = v1323 + v1326;
        v1328 = arm64g_calculate_flag_c(2, v1323, v1326, 0);
        v1329 = v49 * 2;
        v1330 = v1329 * v1325;
        v1331 = 19 * v51;
        v1332 = v51 * v1331;
        v1333 = v1332 + v1322;
        v1334 = arm64g_calculate_flag_c(2, v1332, v1322, 0);
        v1335 = v51 * 2;
        v1336 = v1335 * v1325;
        v1337 = v1327 + v1336;
        v1338 = arm64g_calculate_flag_c(2, v1327, v1336, 0);
        v1339 = v50 * 2;
        v1340 = v1339 * v1331;
        v1341 = v1340 + v1320;
        v1342 = arm64g_calculate_flag_c(2, v1340, v1320, 0);
        v1343 = v1341 + v1330;
        v1344 = arm64g_calculate_flag_c(2, v1341, v1330, 0);
        v1345 = v1339 * v1325;
        v1346 = v1333 + v1345;
        v1347 = arm64g_calculate_flag_c(2, v1333, v1345, 0);
        v1348 = (unsigned long long)(v1331 * v51 >> 64) + (unsigned long long)(v1321 * v49 >> 64) + v1334 + (v1325 * v1339 >> 64) + v1347;
        v1349 = ((v50 * v1321 >> 64) + (unsigned long long)(v49 * v49 >> 64) + v1328 + (v1325 * v1335 >> 64) + v1338) * 0x2000 | v1337 >> 0x33;
        v1350 = v50 * v1329;
        v1351 = v1324 + v1350;
        v1352 = arm64g_calculate_flag_c(2, v1324, v1350, 0);
        v1353 = v52 * v1325;
        v1354 = v1351 + v1353;
        v1355 = arm64g_calculate_flag_c(2, v1351, v1353, 0);
        v1356 = (unsigned long long)(v51 * v1321 >> 64) + (v1329 * v50 >> 64) + v1352 + (v1325 * v52 >> 64) + v1355;
        v1357 = v1354 + v1349;
        v1358 = arm64g_calculate_condition(50, v1354, v1349, 0);
        v1359 = ((v1331 * v1339 >> 64) + (v48 * v48 >> 64) + v1342 + (v1325 * v1329 >> 64) + v1344) * 0x2000 | v1343 >> 0x33;
        v1360 = v1346 + v1359;
        v1361 = arm64g_calculate_condition(50, v1346, v1359, 0);
        v1362 = (v1358 & 1 ? v1356 : v1356 + 1) * 0x2000 | v1357 >> 0x33;
        v1363 = v1329 * v51;
        v1364 = v50 * v50;
        v1365 = v1363 + v1364;
        v1366 = arm64g_calculate_flag_c(2, v1363, v1364, 0);
        v1367 = v1321 * v52;
        v1368 = v1365 + v1367;
        v1369 = arm64g_calculate_flag_c(2, v1365, v1367, 0);
        v1370 = (unsigned long long)(v51 * v1329 >> 64) + (v50 * v50 >> 64) + v1366 + (v52 * v1321 >> 64) + v1369;
        v1371 = v1368 + v1362;
        v1372 = arm64g_calculate_condition(50, v1368, v1362, 0);
        v1373 = (v1337 & 0x7ffffffffffff) + ((v1361 & 1 ? v1348 : v1348 + 1) * 0x2000 | v1360 >> 0x33);
        v52 = v1371 & 0x7ffffffffffff;
        v51 = (v1357 & 0x7ffffffffffff) + (v1373 >> 0x33);
        v50 = v1373 & 0x7ffffffffffff;
        v1374 = (v1343 & 0x7ffffffffffff) + 19 * ((v1372 & 1 ? v1370 : v1370 + 1) * 0x2000 | v1371 >> 0x33);
        v49 = (v1360 & 0x7ffffffffffff) + (v1374 >> 0x33);
        v48 = v1374 & 0x7ffffffffffff;
        i0 = v1319 - 1;
    } while (i0);
    sub_a11a14(&v53, &v48, &v53);
    i1 = 5;
    do
    {
        v1377 = i1;
        v1378 = v53 * v53;
        v1379 = v53 * 2;
        v1380 = v54 * v1379;
        v1381 = v1379 * v55;
        v1382 = v1379 * v56;
        v1383 = 19 * v57;
        v1384 = v54 * v54;
        v1385 = v1381 + v1384;
        v1386 = arm64g_calculate_flag_c(2, v1381, v1384, 0);
        v1387 = v54 * 2;
        v1388 = v1387 * v1383;
        v1389 = 19 * v56;
        v1390 = v56 * v1389;
        v1391 = v1390 + v1380;
        v1392 = arm64g_calculate_flag_c(2, v1390, v1380, 0);
        v1393 = v56 * 2;
        v1394 = v1393 * v1383;
        v1395 = v1385 + v1394;
        v1396 = arm64g_calculate_flag_c(2, v1385, v1394, 0);
        v1397 = v55 * 2;
        v1398 = v1397 * v1389;
        v1399 = v1398 + v1378;
        v1400 = arm64g_calculate_flag_c(2, v1398, v1378, 0);
        v1401 = v1399 + v1388;
        v1402 = arm64g_calculate_flag_c(2, v1399, v1388, 0);
        v1403 = v1397 * v1383;
        v1404 = v1391 + v1403;
        v1405 = arm64g_calculate_flag_c(2, v1391, v1403, 0);
        v1406 = (unsigned long long)(v1389 * v56 >> 64) + (unsigned long long)(v1379 * v54 >> 64) + v1392 + (v1383 * v1397 >> 64) + v1405;
        v1407 = ((v55 * v1379 >> 64) + (unsigned long long)(v54 * v54 >> 64) + v1386 + (v1383 * v1393 >> 64) + v1396) * 0x2000 | v1395 >> 0x33;
        v1408 = v55 * v1387;
        v1409 = v1382 + v1408;
        v1410 = arm64g_calculate_flag_c(2, v1382, v1408, 0);
        v1411 = v57 * v1383;
        v1412 = v1409 + v1411;
        v1413 = arm64g_calculate_flag_c(2, v1409, v1411, 0);
        v1414 = (unsigned long long)(v56 * v1379 >> 64) + (v1387 * v55 >> 64) + v1410 + (v1383 * v57 >> 64) + v1413;
        v1415 = v1412 + v1407;
        v1416 = arm64g_calculate_condition(50, v1412, v1407, 0);
        v1417 = ((v1389 * v1397 >> 64) + (v53 * v53 >> 64) + v1400 + (v1383 * v1387 >> 64) + v1402) * 0x2000 | v1401 >> 0x33;
        v1418 = v1404 + v1417;
        v1419 = arm64g_calculate_condition(50, v1404, v1417, 0);
        v1420 = (v1416 & 1 ? v1414 : v1414 + 1) * 0x2000 | v1415 >> 0x33;
        v1421 = v1387 * v56;
        v1422 = v55 * v55;
        v1423 = v1421 + v1422;
        v1424 = arm64g_calculate_flag_c(2, v1421, v1422, 0);
        v1425 = v1379 * v57;
        v1426 = v1423 + v1425;
        v1427 = arm64g_calculate_flag_c(2, v1423, v1425, 0);
        v1428 = (unsigned long long)(v56 * v1387 >> 64) + (v55 * v55 >> 64) + v1424 + (v57 * v1379 >> 64) + v1427;
        v1429 = v1426 + v1420;
        v1430 = arm64g_calculate_condition(50, v1426, v1420, 0);
        v1431 = (v1395 & 0x7ffffffffffff) + ((v1419 & 1 ? v1406 : v1406 + 1) * 0x2000 | v1418 >> 0x33);
        v57 = v1429 & 0x7ffffffffffff;
        v56 = (v1415 & 0x7ffffffffffff) + (v1431 >> 0x33);
        v55 = v1431 & 0x7ffffffffffff;
        v1432 = (v1401 & 0x7ffffffffffff) + 19 * ((v1430 & 1 ? v1428 : v1428 + 1) * 0x2000 | v1429 >> 0x33);
        v54 = (v1418 & 0x7ffffffffffff) + (v1432 >> 0x33);
        v53 = v1432 & 0x7ffffffffffff;
        i1 = v1377 - 1;
    } while (i1);
    sub_a11a14(&v30, &v53, &v58);
    sub_a11a14(&v35, &v35, &v30);
    v1434 = v35 + (unsigned int)(*(unsigned long long *)((void*)&v37 + 8) + ((unsigned long long)v37 + (*(unsigned long long *)((void*)&v36 + 8) + ((unsigned long long)v36 + (v35 + 19 >> 0x33) >> 0x33) >> 0x33) >> 0x33) >> 0x33) * 19;
    v1435 = (unsigned long long)v36 + (v1434 >> 0x33);
    v1436 = *(unsigned long long *)((void*)&v36 + 8) + (v1435 >> 0x33);
    v1437 = (unsigned long long)v37 + (v1436 >> 0x33);
    v1438 = *(unsigned long long *)((void*)&v37 + 8) + (v1437 >> 0x33);
    a0->field_0 = v1434;
    a0->field_1 = v1434 >> 8;
    a0->field_2 = v1434 >> 16;
    a0->field_3 = v1434 >> 24;
    a0->field_4 = v1434 >> 32;
    a0->field_5 = v1434 >> 40;
    a0->field_6 = (char)(v1434 >> 48) & 7 | (char)(__ROL__((unsigned int)v1435, 3)) & 248;
    a0->field_7 = v1435 >> 5;
    a0->field_8 = v1435 >> 13;
    a0->field_9 = v1435 >> 21;
    a0->field_a = v1435 >> 29;
    a0->field_b = v1435 >> 37;
    a0->field_c = (char)(v1435 >> 45) & 63 | (char)(__ROL__((unsigned int)v1436, 6)) & 192;
    a0->field_d = v1436 >> 2;
    a0->field_e = v1436 >> 10;
    a0->field_f = v1436 >> 18;
    a0->field_10 = v1436 >> 26;
    a0->field_11 = v1436 >> 0x22;
    a0->field_12 = v1436 >> 42;
    a0->field_13 = (char)(v1436 >> 50) & 1 | (char)(__ROL__((unsigned int)v1437, 1)) & 254;
    a0->field_14 = v1437 >> 7;
    a0->field_15 = v1437 >> 15;
    a0->field_16 = v1437 >> 23;
    a0->field_17 = v1437 >> 31;
    a0->field_18 = v1437 >> 39;
    a0->field_19 = (char)(v1437 >> 47) & 15 | (char)(__ROL__((unsigned int)v1438, 4)) & 240;
    a0->field_1a = v1438 >> 4;
    a0->field_1b = v1438 >> 12;
    a0->field_1c = v1438 >> 20;
    a0->field_1d = v1438 >> 28;
    a0->field_1e = v1438 >> 36;
    a0->field_1f = ((char)v1438 * 0 | (char)(v1438 >> 44)) & 127;
    sub_a66ec0(&v12, 32);
    v1439 = (unsigned int)sub_a66f20(&g_d3c8e3, a0, 32);
    if (*(long long *)&g_10002b0 == v63)
        return v1439 != 0;
    ___stack_chk_fail(v1439 != 0);
}
