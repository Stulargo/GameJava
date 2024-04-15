public class Hero {
    String name;
    int health;
    int exp;
    int mana;
    int abilityPower;
    int attackPower;
    int movementSpeed;
    int lifeSteal;

    Level level;

    public Hero(String name, Level level) {
        this.name = name;
        this.level = level;
        this.setLevel(level);
    }

    public enum Level {
        LEVEL_1(120, 150, 30, 20, 15, 12, 35),
        LEVEL_2(135, 200, 35, 25, 18, 14, 40),
        LEVEL_3(150, 260, 40, 30, 22, 16, 45),
        LEVEL_4(170, 340, 45, 35, 25, 18, 50),
        LEVEL_5(190, 430, 50, 40, 28, 20, 55),
        LEVEL_6(210, 550, 55, 45, 32, 22, 60),
        LEVEL_7(230, 680, 60, 50, 36, 24, 65),
        LEVEL_8(250, 820, 65, 55, 40, 26, 70),
        LEVEL_9(275, 980, 70, 60, 45, 28, 75),
        LEVEL_10(300, 1150, 75, 65, 50, 30, 80),
        LEVEL_11(320, 1320, 80, 70, 55, 32, 85),
        LEVEL_12(340, 1500, 85, 75, 60, 34, 90),
        LEVEL_13(360, 1690, 90, 80, 65, 36, 95),
        LEVEL_14(380, 1890, 95, 85, 70, 38, 100),
        LEVEL_15(400, 2100, 100, 90, 75, 40, 105),
        LEVEL_16(420, 2320, 105, 95, 80, 42, 110),
        LEVEL_17(440, 2550, 110, 100, 85, 44, 115),
        LEVEL_18(460, 2790, 115, 105, 90, 46, 120),
        LEVEL_19(480, 3040, 120, 110, 95, 48, 125),
        LEVEL_20(500, 3300, 125, 115, 100, 50, 130),
        LEVEL_21(520, 3570, 130, 120, 105, 52, 135),
        LEVEL_22(540, 3850, 135, 125, 110, 54, 140),
        LEVEL_23(560, 4140, 140, 130, 115, 56, 145),
        LEVEL_24(580, 4440, 145, 135, 120, 58, 150),
        LEVEL_25(600, 4750, 150, 140, 125, 60, 155),
        LEVEL_26(620, 5070, 155, 145, 130, 62, 160),
        LEVEL_27(640, 5400, 160, 150, 135, 64, 165),
        LEVEL_28(660, 5740, 165, 155, 140, 66, 170),
        LEVEL_29(680, 6090, 170, 160, 145, 68, 175),
        LEVEL_30(700, 6450, 175, 165, 150, 70, 180),
        LEVEL_31(720, 6820, 180, 170, 155, 72, 185),
        LEVEL_32(740, 7200, 185, 175, 160, 74, 190),
        LEVEL_33(760, 7590, 190, 180, 165, 76, 195),
        LEVEL_34(780, 7990, 195, 185, 170, 78, 200),
        LEVEL_35(800, 8400, 200, 190, 175, 80, 205),
        LEVEL_36(820, 8820, 205, 195, 180, 82, 210),
        LEVEL_37(840, 9250, 210, 200, 185, 84, 215),
        LEVEL_38(860, 9690, 215, 205, 190, 86, 220),
        LEVEL_39(880, 10140, 220, 210, 195, 88, 225),
        LEVEL_40(900, 10500, 225, 215, 200, 90, 230),
        LEVEL_41(920, 10870, 230, 220, 205, 92, 235),
        LEVEL_42(940, 11250, 235, 225, 210, 94, 240),
        LEVEL_43(960, 11640, 240, 230, 215, 96, 245),
        LEVEL_44(980, 12040, 245, 235, 220, 98, 250),
        LEVEL_45(1000, 12450, 250, 240, 225, 100, 255),
        LEVEL_46(1020, 12870, 255, 245, 230, 102, 260),
        LEVEL_47(1040, 13300, 260, 250, 235, 104, 265),
        LEVEL_48(1060, 13740, 265, 255, 240, 106, 270),
        LEVEL_49(1080, 14190, 270, 260, 245, 108, 275),
        LEVEL_50(1100, 14650, 275, 265, 250, 110, 280),
        LEVEL_51(1120, 15120, 280, 270, 255, 112, 285),
        LEVEL_52(1140, 15600, 285, 275, 260, 114, 290),
        LEVEL_53(1160, 16090, 290, 280, 265, 116, 295),
        LEVEL_54(1180, 16590, 295, 285, 270, 118, 300),
        LEVEL_55(1200, 17100, 300, 290, 275, 120, 305),
        LEVEL_56(1220, 17620, 305, 295, 280, 122, 310),
        LEVEL_57(1240, 18150, 310, 300, 285, 124, 315),
        LEVEL_58(1260, 18690, 315, 305, 290, 126, 320),
        LEVEL_59(1280, 19240, 320, 310, 295, 128, 325),
        LEVEL_60(1300, 19800, 325, 315, 300, 130, 330),
        LEVEL_61(1320, 20370, 330, 320, 305, 132, 335),
        LEVEL_62(1340, 20950, 335, 325, 310, 134, 340),
        LEVEL_63(1360, 21540, 340, 330, 315, 136, 345),
        LEVEL_64(1380, 22140, 345, 335, 320, 138, 350),
        LEVEL_65(1400, 22750, 350, 340, 325, 140, 355),
        LEVEL_66(1420, 23370, 355, 345, 330, 142, 360),
        LEVEL_67(1440, 24000, 360, 350, 335, 144, 365),
        LEVEL_68(1460, 24640, 365, 355, 340, 146, 370),
        LEVEL_69(1480, 25290, 370, 360, 345, 148, 375),
        LEVEL_70(1500, 25950, 375, 365, 350, 150, 380),
        LEVEL_71(1520, 26620, 380, 370, 355, 152, 385),
        LEVEL_72(1540, 27300, 385, 375, 360, 154, 390),
        LEVEL_73(1560, 27990, 390, 380, 365, 156, 395),
        LEVEL_74(1580, 28690, 395, 385, 370, 158, 400),
        LEVEL_75(1600, 29400, 400, 390, 375, 160, 405),
        LEVEL_76(1620, 30120, 405, 395, 380, 162, 410),
        LEVEL_77(1640, 30850, 410, 400, 385, 164, 415),
        LEVEL_78(1660, 31590, 415, 405, 390, 166, 420),
        LEVEL_79(1680, 32340, 420, 410, 395, 168, 425),
        LEVEL_80(1700, 33100, 425, 415, 400, 170, 430),
        LEVEL_81(1720, 33870, 430, 420, 405, 172, 435),
        LEVEL_82(1740, 34650, 435, 425, 410, 174, 440),
        LEVEL_83(1760, 35440, 440, 430, 415, 176, 445),
        LEVEL_84(1780, 36240, 445, 435, 420, 178, 450),
        LEVEL_85(1800, 37050, 450, 440, 425, 180, 455),
        LEVEL_86(1820, 37870, 455, 445, 430, 182, 460),
        LEVEL_87(1840, 38700, 460, 450, 435, 184, 465),
        LEVEL_88(1860, 39540, 465, 455, 440, 186, 470),
        LEVEL_89(1880, 40390, 470, 460, 445, 188, 475),
        LEVEL_90(1900, 41250, 475, 465, 450, 190, 480),
        LEVEL_91(1920, 42120, 480, 470, 455, 192, 485),
        LEVEL_92(1940, 43000, 485, 475, 460, 194, 490),
        LEVEL_93(1960, 43890, 490, 480, 465, 196, 495),
        LEVEL_94(1980, 44790, 495, 485, 470, 198, 500),
        LEVEL_95(2000, 45700, 500, 490, 475, 200, 505),
        LEVEL_96(2020, 46620, 505, 495, 480, 202, 510),
        LEVEL_97(2040, 47550, 510, 500, 485, 204, 515),
        LEVEL_98(2060, 48490, 515, 505, 490, 206, 520),
        LEVEL_99(2080, 49440, 520, 510, 495, 208, 525),
        LEVEL_100(2100, 50400, 525, 515, 500, 210, 530),
        LEVEL_101(2120, 51370, 530, 520, 505, 212, 535),
        LEVEL_102(2140, 52350, 535, 525, 510, 214, 540),
        LEVEL_103(2160, 53340, 540, 530, 515, 216, 545),
        LEVEL_104(2180, 54340, 545, 535, 520, 218, 550),
        LEVEL_105(2200, 55350, 550, 540, 525, 220, 555),
        LEVEL_106(2220, 56370, 555, 545, 530, 222, 560),
        LEVEL_107(2240, 57400, 560, 550, 535, 224, 565),
        LEVEL_108(2260, 58440, 565, 555, 540, 226, 570),
        LEVEL_109(2280, 59490, 570, 560, 545, 228, 575),
        LEVEL_110(2300, 60550, 575, 565, 550, 230, 580),
        LEVEL_111(2320, 61620, 580, 570, 555, 232, 585),
        LEVEL_112(2340, 62700, 585, 575, 560, 234, 590),
        LEVEL_113(2360, 63790, 590, 580, 565, 236, 595),
        LEVEL_114(2380, 64890, 595, 585, 570, 238, 600),
        LEVEL_115(2400, 66000, 600, 590, 575, 240, 605),
        LEVEL_116(2420, 67120, 605, 595, 580, 242, 610),
        LEVEL_117(2440, 68250, 610, 600, 585, 244, 615),
        LEVEL_118(2460, 69390, 615, 605, 590, 246, 620),
        LEVEL_119(2480, 70540, 620, 610, 595, 248, 625),
        LEVEL_120(2500, 71700, 625, 615, 600, 250, 630),
        LEVEL_121(2520, 72870, 630, 620, 605, 252, 635),
        LEVEL_122(2540, 74050, 635, 625, 610, 254, 640),
        LEVEL_123(2560, 75240, 640, 630, 615, 256, 645),
        LEVEL_124(2580, 76440, 645, 635, 620, 258, 650),
        LEVEL_125(2600, 77650, 650, 640, 625, 260, 655),
        LEVEL_126(2620, 78870, 655, 645, 630, 262, 660),
        LEVEL_127(2640, 80100, 660, 650, 635, 264, 665),
        LEVEL_128(2660, 81340, 665, 655, 640, 266, 670),
        LEVEL_129(2680, 82590, 670, 660, 645, 268, 675),
        LEVEL_130(2700, 83850, 675, 665, 650, 270, 680),
        LEVEL_131(2720, 85120, 680, 670, 655, 272, 685),
        LEVEL_132(2740, 86400, 685, 675, 660, 274, 690),
        LEVEL_133(2760, 87690, 690, 680, 665, 276, 695),
        LEVEL_134(2780, 88990, 695, 685, 670, 278, 700),
        LEVEL_135(2800, 90300, 700, 690, 675, 280, 705),
        LEVEL_136(2820, 91620, 705, 695, 680, 282, 710),
        LEVEL_137(2840, 92950, 710, 700, 685, 284, 715),
        LEVEL_138(2860, 94390, 715, 705, 690, 286, 720),
        LEVEL_139(2880, 95840, 720, 710, 695, 288, 725),
        LEVEL_140(2900, 97300, 725, 715, 700, 290, 730),
        LEVEL_141(2920, 98770, 730, 720, 705, 292, 735),
        LEVEL_142(2940, 100250, 735, 725, 710, 294, 740),
        LEVEL_143(2960, 101740, 740, 730, 715, 296, 745),
        LEVEL_144(2980, 103240, 745, 735, 720, 298, 750),
        LEVEL_145(3000, 104750, 750, 740, 725, 300, 755),
        LEVEL_146(3020, 106270, 755, 745, 730, 302, 760),
        LEVEL_147(3040, 107800, 760, 750, 735, 304, 765),
        LEVEL_148(3060, 109340, 765, 755, 740, 306, 770),
        LEVEL_149(3080, 110890, 770, 760, 745, 308, 775),
        LEVEL_150(3100, 112450, 775, 765, 750, 310, 780),
        LEVEL_151(3120, 114020, 780, 770, 755, 312, 785),
        LEVEL_152(3140, 115600, 785, 775, 760, 314, 790),
        LEVEL_153(3160, 117190, 790, 780, 765, 316, 795),
        LEVEL_154(3180, 118790, 795, 785, 770, 318, 800),
        LEVEL_155(3200, 120400, 800, 790, 775, 320, 805),
        LEVEL_156(3220, 122020, 805, 795, 780, 322, 810),
        LEVEL_157(3240, 123650, 810, 800, 785, 324, 815),
        LEVEL_158(3260, 125290, 815, 805, 790, 326, 820),
        LEVEL_159(3280, 126940, 820, 810, 795, 328, 825),
        LEVEL_160(3300, 128600, 825, 815, 800, 330, 830),
        LEVEL_161(3320, 130270, 830, 820, 805, 332, 835),
        LEVEL_162(3340, 131950, 835, 825, 810, 334, 840),
        LEVEL_163(3360, 133640, 840, 830, 815, 336, 845),
        LEVEL_164(3380, 135340, 845, 835, 820, 338, 850),
        LEVEL_165(3400, 137050, 850, 840, 825, 340, 855),
        LEVEL_166(3420, 138770, 855, 845, 830, 342, 860),
        LEVEL_167(3440, 140500, 860, 850, 835, 344, 865),
        LEVEL_168(3460, 142240, 865, 855, 840, 346, 870),
        LEVEL_169(3480, 143990, 870, 860, 845, 348, 875),
        LEVEL_170(3500, 145750, 875, 865, 850, 350, 880),
        LEVEL_171(3520, 147520, 880, 870, 855, 352, 885),
        LEVEL_172(3540, 149300, 885, 875, 860, 354, 890),
        LEVEL_173(3560, 151090, 890, 880, 865, 356, 895),
        LEVEL_174(3580, 152890, 895, 885, 870, 358, 900),
        LEVEL_175(3600, 154700, 900, 890, 875, 360, 905),
        LEVEL_176(3620, 156520, 905, 895, 880, 362, 910),
        LEVEL_177(3640, 158350, 910, 900, 885, 364, 915),
        LEVEL_178(3660, 160190, 915, 905, 890, 366, 920),
        LEVEL_179(3680, 162040, 920, 910, 895, 368, 925),
        LEVEL_180(3700, 163900, 925, 915, 900, 370, 930),
        LEVEL_181(3720, 165770, 930, 920, 905, 372, 935),
        LEVEL_182(3740, 167650, 935, 925, 910, 374, 940),
        LEVEL_183(3760, 169540, 940, 930, 915, 376, 945),
        LEVEL_184(3780, 171440, 945, 935, 920, 378, 950),
        LEVEL_185(3800, 173350, 950, 940, 925, 380, 955),
        LEVEL_186(3820, 175270, 955, 945, 930, 382, 960),
        LEVEL_187(3840, 177200, 960, 950, 935, 384, 965),
        LEVEL_188(3860, 179140, 965, 955, 940, 386, 970),
        LEVEL_189(3880, 181090, 970, 960, 945, 388, 975),
        LEVEL_190(3900, 183050, 975, 965, 950, 390, 980),
        LEVEL_191(3920, 185020, 980, 970, 955, 392, 985),
        LEVEL_192(3940, 187000, 985, 975, 960, 394, 990),
        LEVEL_193(3960, 188990, 990, 980, 965, 396, 995),
        LEVEL_194(3980, 190990, 995, 985, 970, 398, 1000),
        LEVEL_195(4000, 193000, 1000, 990, 975, 400, 1005),
        LEVEL_196(4020, 195020, 1005, 995, 980, 402, 1010),
        LEVEL_197(4040, 197050, 1010, 1000, 985, 404, 1015),
        LEVEL_198(4060, 199090, 1015, 1005, 990, 406, 1020),
        LEVEL_199(4080, 201140, 1020, 1010, 995, 408, 1025),
        LEVEL_200(4100, 203200, 1025, 1015, 1000, 410, 1030),
        LEVEL_201(4120, 205270, 1030, 1020, 1005, 412, 1035),
        LEVEL_202(4140, 207350, 1035, 1025, 1010, 414, 1040),
        LEVEL_203(4160, 209440, 1040, 1030, 1015, 416, 1045),
        LEVEL_204(4180, 211540, 1045, 1035, 1020, 418, 1050),
        LEVEL_205(4200, 213650, 1050, 1040, 1025, 420, 1055),
        LEVEL_206(4220, 215770, 1055, 1045, 1030, 422, 1060),
        LEVEL_207(4240, 217900, 1060, 1050, 1035, 424, 1065),
        LEVEL_208(4260, 220040, 1065, 1055, 1040, 426, 1070),
        LEVEL_209(4280, 222190, 1070, 1060, 1045, 428, 1075),
        LEVEL_210(4300, 224350, 1075, 1065, 1050, 430, 1080),
        LEVEL_211(4320, 226520, 1080, 1070, 1055, 432, 1085),
        LEVEL_212(4340, 228700, 1085, 1075, 1060, 434, 1090),
        LEVEL_213(4360, 230890, 1090, 1080, 1065, 436, 1095),
        LEVEL_214(4380, 233090, 1095, 1085, 1070, 438, 1100),
        LEVEL_215(4400, 235300, 1100, 1090, 1075, 440, 1105),
        LEVEL_216(4420, 237520, 1105, 1095, 1080, 442, 1110),
        LEVEL_217(4440, 239750, 1110, 1100, 1085, 444, 1115),
        LEVEL_218(4460, 241990, 1115, 1105, 1090, 446, 1120),
        LEVEL_219(4480, 244240, 1120, 1110, 1095, 448, 1125),
        LEVEL_220(4500, 246500, 1125, 1115, 1100, 450, 1130),
        LEVEL_221(4520, 248770, 1130, 1120, 1105, 452, 1135),
        LEVEL_222(4540, 251050, 1135, 1125, 1110, 454, 1140),
        LEVEL_223(4560, 253340, 1140, 1130, 1115, 456, 1145),
        LEVEL_224(4580, 255640, 1145, 1135, 1120, 458, 1150),
        LEVEL_225(4600, 257950, 1150, 1140, 1125, 460, 1155),
        LEVEL_226(4620, 260270, 1155, 1145, 1130, 462, 1160),
        LEVEL_227(4640, 262600, 1160, 1150, 1135, 464, 1165),
        LEVEL_228(4660, 264940, 1165, 1155, 1140, 466, 1170),
        LEVEL_229(4680, 267290, 1170, 1160, 1145, 468, 1175),
        LEVEL_230(4700, 269650, 1175, 1165, 1150, 470, 1180),
        LEVEL_231(4720, 272020, 1180, 1170, 1155, 472, 1185),
        LEVEL_232(4740, 274400, 1185, 1175, 1160, 474, 1190),
        LEVEL_233(4760, 276790, 1190, 1180, 1165, 476, 1195),
        LEVEL_234(4780, 279190, 1195, 1185, 1170, 478, 1200),
        LEVEL_235(4800, 281600, 1200, 1190, 1175, 480, 1205),
        LEVEL_236(4820, 284020, 1205, 1195, 1180, 482, 1210),
        LEVEL_237(4840, 286450, 1210, 1200, 1185, 484, 1215),
        LEVEL_238(4860, 288890, 1215, 1205, 1190, 486, 1220),
        LEVEL_239(4880, 291340, 1220, 1210, 1195, 488, 1225),
        LEVEL_240(4900, 293800, 1225, 1215, 1200, 490, 1230),
        LEVEL_241(4920, 296270, 1230, 1220, 1205, 492, 1235),
        LEVEL_242(4940, 298750, 1235, 1225, 1210, 494, 1240),
        LEVEL_243(4960, 301240, 1240, 1230, 1215, 496, 1245),
        LEVEL_244(4980, 303740, 1245, 1235, 1220, 498, 1250),
        LEVEL_245(5000, 306250, 1250, 1240, 1225, 500, 1255),
        LEVEL_246(5020, 308770, 1255, 1245, 1230, 502, 1260),
        LEVEL_247(5040, 311300, 1260, 1250, 1235, 504, 1265),
        LEVEL_248(5060, 313840, 1265, 1255, 1240, 506, 1270),
        LEVEL_249(5080, 316390, 1270, 1260, 1245, 508, 1275),
        LEVEL_250(5100, 318950, 1275, 1265, 1250, 510, 1280),
        LEVEL_251(5120, 321520, 1280, 1270, 1255, 512, 1285),
        LEVEL_252(5140, 324100, 1285, 1275, 1260, 514, 1290),
        LEVEL_253(5160, 326690, 1290, 1280, 1265, 516, 1295),
        LEVEL_254(5180, 329290, 1295, 1285, 1270, 518, 1300),
        LEVEL_255(5200, 331900, 1300, 1290, 1275, 520, 1305),
        LEVEL_256(5220, 334520, 1305, 1295, 1280, 522, 1310),
        LEVEL_257(5240, 337150, 1310, 1300, 1285, 524, 1315),
        LEVEL_258(5260, 339790, 1315, 1305, 1290, 526, 1320),
        LEVEL_259(5280, 342440, 1320, 1310, 1295, 528, 1325),
        LEVEL_260(5300, 345100, 1325, 1315, 1300, 530, 1330),
        LEVEL_261(5320, 347770, 1330, 1320, 1305, 532, 1335),
        LEVEL_262(5340, 350450, 1335, 1325, 1310, 534, 1340),
        LEVEL_263(5360, 353140, 1340, 1330, 1315, 536, 1345),
        LEVEL_264(5380, 355840, 1345, 1335, 1320, 538, 1350),
        LEVEL_265(5400, 358550, 1350, 1340, 1325, 540, 1355),
        LEVEL_266(5420, 361270, 1355, 1345, 1330, 542, 1360),
        LEVEL_267(5440, 364000, 1360, 1350, 1335, 544, 1365),
        LEVEL_268(5460, 366740, 1365, 1355, 1340, 546, 1370),
        LEVEL_269(5480, 369490, 1370, 1360, 1345, 548, 1375),
        LEVEL_270(5500, 372250, 1375, 1365, 1350, 550, 1380),
        LEVEL_271(5520, 375020, 1380, 1370, 1355, 552, 1385),
        LEVEL_272(5540, 377800, 1385, 1375, 1360, 554, 1390),
        LEVEL_273(5560, 380590, 1390, 1380, 1365, 556, 1395),
        LEVEL_274(5580, 383390, 1395, 1385, 1370, 558, 1400),
        LEVEL_275(5600, 386200, 1400, 1390, 1375, 560, 1405),
        LEVEL_276(5620, 389020, 1405, 1395, 1380, 562, 1410),
        LEVEL_277(5640, 391850, 1410, 1400, 1385, 564, 1415),
        LEVEL_278(5660, 394690, 1415, 1405, 1390, 566, 1420),
        LEVEL_279(5680, 397540, 1420, 1410, 1395, 568, 1425),
        LEVEL_280(5700, 400400, 1425, 1415, 1400, 570, 1430),
        LEVEL_281(5720, 403270, 1430, 1420, 1405, 572, 1435),
        LEVEL_282(5740, 406150, 1435, 1425, 1410, 574, 1440),
        LEVEL_283(5760, 409040, 1440, 1430, 1415, 576, 1445),
        LEVEL_284(5780, 411940, 1445, 1435, 1420, 578, 1450),
        LEVEL_285(5800, 414850, 1450, 1440, 1425, 580, 1455),
        LEVEL_286(5820, 417770, 1455, 1445, 1430, 582, 1460),
        LEVEL_287(5840, 420700, 1460, 1450, 1435, 584, 1465),
        LEVEL_288(5860, 423640, 1465, 1455, 1440, 586, 1470),
        LEVEL_289(5880, 426590, 1470, 1460, 1445, 588, 1475),
        LEVEL_290(5900, 429550, 1475, 1465, 1450, 590, 1480),
        LEVEL_291(5920, 432520, 1480, 1470, 1455, 592, 1485),
        LEVEL_292(5940, 435500, 1485, 1475, 1460, 594, 1490),
        LEVEL_293(5960, 438490, 1490, 1480, 1465, 596, 1495),
        LEVEL_294(5980, 441490, 1495, 1485, 1470, 598, 1500),
        LEVEL_295(6000, 444500, 1500, 1490, 1475, 600, 1505),
        LEVEL_296(6020, 447520, 1505, 1495, 1480, 602, 1510),
        LEVEL_297(6040, 450550, 1510, 1500, 1485, 604, 1515),
        LEVEL_298(6060, 453590, 1515, 1505, 1490, 606, 1520),
        LEVEL_299(6080, 456640, 1520, 1510, 1495, 608, 1525),
        LEVEL_300(6100, 459700, 1525, 1515, 1500, 610, 1530),
        LEVEL_301(6120, 462770, 1530, 1520, 1505, 612, 1535),
        LEVEL_302(6140, 465850, 1535, 1525, 1510, 614, 1540),
        LEVEL_303(6160, 468940, 1540, 1530, 1515, 616, 1545),
        LEVEL_304(6180, 472040, 1545, 1535, 1520, 618, 1550),
        LEVEL_305(6200, 475150, 1550, 1540, 1525, 620, 1555),
        LEVEL_306(6220, 478270, 1555, 1545, 1530, 622, 1560),
        LEVEL_307(6240, 481400, 1560, 1550, 1535, 624, 1565),
        LEVEL_308(6260, 484540, 1565, 1555, 1540, 626, 1570),
        LEVEL_309(6280, 487690, 1570, 1560, 1545, 628, 1575),
        LEVEL_310(6300, 490850, 1575, 1565, 1550, 630, 1580),
        LEVEL_311(6320, 494020, 1580, 1570, 1555, 632, 1585),
        LEVEL_312(6340, 497200, 1585, 1575, 1560, 634, 1590),
        LEVEL_313(6360, 500390, 1590, 1580, 1565, 636, 1595),
        LEVEL_314(6380, 503590, 1595, 1585, 1570, 638, 1600),
        LEVEL_315(6400, 506800, 1600, 1590, 1575, 640, 1605),
        LEVEL_316(6420, 510020, 1605, 1595, 1580, 642, 1610),
        LEVEL_317(6440, 513250, 1610, 1600, 1585, 644, 1615),
        LEVEL_318(6460, 516490, 1615, 1605, 1590, 646, 1620),
        LEVEL_319(6480, 519740, 1620, 1610, 1595, 648, 1625),
        LEVEL_320(6500, 523000, 1625, 1615, 1600, 650, 1630),
        LEVEL_321(6520, 526270, 1630, 1620, 1605, 652, 1635),
        LEVEL_322(6540, 529550, 1635, 1625, 1610, 654, 1640),
        LEVEL_323(6560, 532840, 1640, 1630, 1615, 656, 1645),
        LEVEL_324(6580, 536140, 1645, 1635, 1620, 658, 1650),
        LEVEL_325(6600, 539450, 1650, 1640, 1625, 660, 1655),
        LEVEL_326(6620, 542770, 1655, 1645, 1630, 662, 1660),
        LEVEL_327(6640, 546100, 1660, 1650, 1635, 664, 1665),
        LEVEL_328(6660, 549440, 1665, 1655, 1640, 666, 1670),
        LEVEL_329(6680, 552790, 1670, 1660, 1645, 668, 1675),
        LEVEL_330(6700, 556150, 1675, 1665, 1650, 670, 1680),
        LEVEL_331(6720, 559520, 1680, 1670, 1655, 672, 1685),
        LEVEL_332(6740, 562900, 1685, 1675, 1660, 674, 1690),
        LEVEL_333(6760, 566290, 1690, 1680, 1665, 676, 1695),
        LEVEL_334(6780, 569690, 1695, 1685, 1670, 678, 1700),
        LEVEL_335(6800, 573100, 1700, 1690, 1675, 680, 1705),
        LEVEL_336(6820, 576520, 1705, 1695, 1680, 682, 1710),
        LEVEL_337(6840, 579950, 1710, 1700, 1685, 684, 1715),
        LEVEL_338(6860, 583390, 1715, 1705, 1690, 686, 1720),
        LEVEL_339(6880, 586840, 1720, 1710, 1695, 688, 1725),
        LEVEL_340(6900, 590300, 1725, 1715, 1700, 690, 1730),
        LEVEL_341(6920, 593770, 1730, 1720, 1705, 692, 1735),
        LEVEL_342(6940, 597250, 1735, 1725, 1710, 694, 1740),
        LEVEL_343(6960, 600740, 1740, 1730, 1715, 696, 1745),
        LEVEL_344(6980, 604240, 1745, 1735, 1720, 698, 1750),
        LEVEL_345(7000, 607750, 1750, 1740, 1725, 700, 1755),
        LEVEL_346(7020, 611270, 1755, 1745, 1730, 702, 1760),
        LEVEL_347(7040, 614800, 1760, 1750, 1735, 704, 1765),
        LEVEL_348(7060, 618340, 1765, 1755, 1740, 706, 1770),
        LEVEL_349(7080, 621890, 1770, 1760, 1745, 708, 1775),
        LEVEL_350(7100, 625450, 1775, 1765, 1750, 710, 1780),
        LEVEL_351(7120, 629020, 1780, 1770, 1755, 712, 1785),
        LEVEL_352(7140, 632600, 1785, 1775, 1760, 714, 1790),
        LEVEL_353(7160, 636190, 1790, 1780, 1765, 716, 1795),
        LEVEL_354(7180, 639790, 1795, 1785, 1770, 718, 1800),
        LEVEL_355(7200, 643400, 1800, 1790, 1775, 720, 1805),
        LEVEL_356(7220, 647020, 1805, 1795, 1780, 722, 1810),
        LEVEL_357(7240, 650650, 1810, 1800, 1785, 724, 1815),
        LEVEL_358(7260, 654290, 1815, 1805, 1790, 726, 1820),
        LEVEL_359(7280, 657940, 1820, 1810, 1795, 728, 1825),
        LEVEL_360(7300, 661600, 1825, 1815, 1800, 730, 1830),
        LEVEL_361(7320, 665270, 1830, 1820, 1805, 732, 1835),
        LEVEL_362(7340, 668950, 1835, 1825, 1810, 734, 1840),
        LEVEL_363(7360, 672640, 1840, 1830, 1815, 736, 1845),
        LEVEL_364(7380, 676340, 1845, 1835, 1820, 738, 1850),
        LEVEL_365(7400, 680050, 1850, 1840, 1825, 740, 1855),
        LEVEL_366(7420, 683770, 1855, 1845, 1830, 742, 1860),
        LEVEL_367(7440, 687500, 1860, 1850, 1835, 744, 1865),
        LEVEL_368(7460, 691240, 1865, 1855, 1840, 746, 1870),
        LEVEL_369(7480, 694990, 1870, 1860, 1845, 748, 1875),
        LEVEL_370(7500, 698750, 1875, 1865, 1850, 750, 1880),
        LEVEL_371(7520, 702520, 1880, 1870, 1855, 752, 1885),
        LEVEL_372(7540, 706300, 1885, 1875, 1860, 754, 1890),
        LEVEL_373(7560, 710090, 1890, 1880, 1865, 756, 1895),
        LEVEL_374(7580, 713890, 1895, 1885, 1870, 758, 1900),
        LEVEL_375(7600, 717700, 1900, 1890, 1875, 760, 1905),
        LEVEL_376(7620, 721520, 1905, 1895, 1880, 762, 1910),
        LEVEL_377(7640, 725350, 1910, 1900, 1885, 764, 1915),
        LEVEL_378(7660, 729190, 1915, 1905, 1890, 766, 1920),
        LEVEL_379(7680, 733040, 1920, 1910, 1895, 768, 1925),
        LEVEL_380(7700, 736900, 1925, 1915, 1900, 770, 1930),
        LEVEL_381(7720, 740770, 1930, 1920, 1905, 772, 1935),
        LEVEL_382(7740, 744650, 1935, 1925, 1910, 774, 1940),
        LEVEL_383(7760, 748540, 1940, 1930, 1915, 776, 1945),
        LEVEL_384(7780, 752440, 1945, 1935, 1920, 778, 1950),
        LEVEL_385(7800, 756350, 1950, 1940, 1925, 780, 1955),
        LEVEL_386(7820, 760270, 1955, 1945, 1930, 782, 1960),
        LEVEL_387(7840, 764200, 1960, 1950, 1935, 784, 1965),
        LEVEL_388(7860, 768140, 1965, 1955, 1940, 786, 1970),
        LEVEL_389(7880, 772090, 1970, 1960, 1945, 788, 1975),
        LEVEL_390(7900, 776050, 1975, 1965, 1950, 790, 1980),
        LEVEL_391(7920, 780020, 1980, 1970, 1955, 792, 1985),
        LEVEL_392(7940, 784000, 1985, 1975, 1960, 794, 1990),
        LEVEL_393(7960, 788990, 1990, 1980, 1965, 796, 1995),
        LEVEL_394(7980, 792990, 1995, 1985, 1970, 798, 2000),
        LEVEL_395(8000, 797000, 2000, 1990, 1975, 800, 2005),
        LEVEL_396(8020, 801020, 2005, 1995, 1980, 802, 2010),
        LEVEL_397(8040, 805050, 2010, 2000, 1985, 804, 2015),
        LEVEL_398(8060, 809090, 2015, 2005, 1990, 806, 2020),
        LEVEL_399(8080, 813140, 2020, 2010, 1995, 808, 2025),
        LEVEL_400(8100, 817200, 2025, 2015, 2000, 810, 2030),
        LEVEL_401(8120, 821270, 2030, 2020, 2005, 812, 2035),
        LEVEL_402(8140, 825350, 2035, 2025, 2010, 814, 2040),
        LEVEL_403(8160, 829440, 2040, 2030, 2015, 816, 2045),
        LEVEL_404(8180, 833540, 2045, 2035, 2020, 818, 2050),
        LEVEL_405(8200, 837650, 2050, 2040, 2025, 820, 2055),
        LEVEL_406(8220, 841770, 2055, 2045, 2030, 822, 2060),
        LEVEL_407(8240, 845900, 2060, 2050, 2035, 824, 2065),
        LEVEL_408(8260, 850040, 2065, 2055, 2040, 826, 2070),
        LEVEL_409(8280, 854190, 2070, 2060, 2045, 828, 2075),
        LEVEL_410(8300, 858350, 2075, 2065, 2050, 830, 2080),
        LEVEL_411(8320, 862520, 2080, 2070, 2055, 832, 2085),
        LEVEL_412(8340, 866700, 2085, 2075, 2060, 834, 2090),
        LEVEL_413(8360, 870890, 2090, 2080, 2065, 836, 2095),
        LEVEL_414(8380, 875090, 2095, 2085, 2070, 838, 2100),
        LEVEL_415(8400, 879300, 2100, 2090, 2075, 840, 2105),
        LEVEL_416(8420, 883520, 2105, 2095, 2080, 842, 2110),
        LEVEL_417(8440, 887750, 2110, 2100, 2085, 844, 2115),
        LEVEL_418(8460, 891990, 2115, 2105, 2090, 846, 2120),
        LEVEL_419(8480, 896240, 2120, 2110, 2095, 848, 2125),
        LEVEL_420(8500, 900500, 2125, 2115, 2100, 850, 2130),
        LEVEL_421(8520, 904770, 2130, 2120, 2105, 852, 2135),
        LEVEL_422(8540, 909050, 2135, 2125, 2110, 854, 2140),
        LEVEL_423(8560, 913340, 2140, 2130, 2115, 856, 2145),
        LEVEL_424(8580, 917640, 2145, 2135, 2120, 858, 2150),
        LEVEL_425(8600, 921950, 2150, 2140, 2125, 860, 2155),
        LEVEL_426(8620, 926270, 2155, 2145, 2130, 862, 2160),
        LEVEL_427(8640, 930600, 2160, 2150, 2135, 864, 2165),
        LEVEL_428(8660, 934940, 2165, 2155, 2140, 866, 2170),
        LEVEL_429(8680, 939290, 2170, 2160, 2145, 868, 2175),
        LEVEL_430(8700, 943650, 2175, 2165, 2150, 870, 2180),
        LEVEL_431(8720, 948020, 2180, 2170, 2155, 872, 2185),
        LEVEL_432(8740, 952400, 2185, 2175, 2160, 874, 2190),
        LEVEL_433(8760, 956790, 2190, 2180, 2165, 876, 2195),
        LEVEL_434(8780, 961190, 2195, 2185, 2170, 878, 2200),
        LEVEL_435(8800, 965600, 2200, 2190, 2175, 880, 2205),
        LEVEL_436(8820, 970020, 2205, 2195, 2180, 882, 2210),
        LEVEL_437(8840, 974450, 2210, 2200, 2185, 884, 2215),
        LEVEL_438(8860, 978890, 2215, 2205, 2190, 886, 2220),
        LEVEL_439(8880, 983340, 2220, 2210, 2195, 888, 2225),
        LEVEL_440(8900, 987800, 2225, 2215, 2200, 890, 2230),
        LEVEL_441(8920, 992270, 2230, 2220, 2205, 892, 2235),
        LEVEL_442(8940, 996750, 2235, 2225, 2210, 894, 2240),
        LEVEL_443(8960, 1000240, 2240, 2230, 2215, 896, 2245),
        LEVEL_444(8980, 1003740, 2245, 2235, 2220, 898, 2250),
        LEVEL_445(9000, 1007250, 2250, 2240, 2225, 900, 2255),
        LEVEL_446(9020, 1010770, 2255, 2245, 2230, 902, 2260),
        LEVEL_447(9040, 1014300, 2260, 2250, 2235, 904, 2265),
        LEVEL_448(9060, 1017840, 2265, 2255, 2240, 906, 2270),
        LEVEL_449(9080, 1021390, 2270, 2260, 2245, 908, 2275),
        LEVEL_450(9100, 1024950, 2275, 2265, 2250, 910, 2280),
        LEVEL_451(9120, 1028520, 2280, 2270, 2255, 912, 2285),
        LEVEL_452(9140, 1032100, 2285, 2275, 2260, 914, 2290),
        LEVEL_453(9160, 1035690, 2290, 2280, 2265, 916, 2295),
        LEVEL_454(9180, 1039290, 2295, 2285, 2270, 918, 2300),
        LEVEL_455(9200, 1042900, 2300, 2290, 2275, 920, 2305),
        LEVEL_456(9220, 1046520, 2305, 2295, 2280, 922, 2310),
        LEVEL_457(9240, 1050150, 2310, 2300, 2285, 924, 2315),
        LEVEL_458(9260, 1053790, 2315, 2305, 2290, 926, 2320),
        LEVEL_459(9280, 1057440, 2320, 2310, 2295, 928, 2325),
        LEVEL_460(9300, 1061100, 2325, 2315, 2300, 930, 2330),
        LEVEL_461(9320, 1064770, 2330, 2320, 2305, 932, 2335),
        LEVEL_462(9340, 1068450, 2335, 2325, 2310, 934, 2340),
        LEVEL_463(9360, 1072140, 2340, 2330, 2315, 936, 2345),
        LEVEL_464(9380, 1075840, 2345, 2335, 2320, 938, 2350),
        LEVEL_465(9400, 1079550, 2350, 2340, 2325, 940, 2355),
        LEVEL_466(9420, 1083270, 2355, 2345, 2330, 942, 2360),
        LEVEL_467(9440, 1087000, 2360, 2350, 2335, 944, 2365),
        LEVEL_468(9460, 1090740, 2365, 2355, 2340, 946, 2370),
        LEVEL_469(9480, 1094490, 2370, 2360, 2345, 948, 2375),
        LEVEL_470(9500, 1098250, 2375, 2365, 2350, 950, 2380),
        LEVEL_471(9520, 1102020, 2380, 2370, 2355, 952, 2385),
        LEVEL_472(9540, 1105800, 2385, 2375, 2360, 954, 2390),
        LEVEL_473(9560, 1109590, 2390, 2380, 2365, 956, 2395),
        LEVEL_474(9580, 1113390, 2395, 2385, 2370, 958, 2400),
        LEVEL_475(9600, 1117200, 2400, 2390, 2375, 960, 2405),
        LEVEL_476(9620, 1121020, 2405, 2395, 2380, 962, 2410),
        LEVEL_477(9640, 1124850, 2410, 2400, 2385, 964, 2415),
        LEVEL_478(9660, 1128690, 2415, 2405, 2390, 966, 2420),
        LEVEL_479(9680, 1132540, 2420, 2410, 2395, 968, 2425),
        LEVEL_480(9700, 1136400, 2425, 2415, 2400, 970, 2430),
        LEVEL_481(9720, 1140270, 2430, 2420, 2405, 972, 2435),
        LEVEL_482(9740, 1144150, 2435, 2425, 2410, 974, 2440),
        LEVEL_483(9760, 1148040, 2440, 2430, 2415, 976, 2445),
        LEVEL_484(9780, 1151940, 2445, 2435, 2420, 978, 2450),
        LEVEL_485(9800, 1155850, 2450, 2440, 2425, 980, 2455),
        LEVEL_486(9820, 1159770, 2455, 2445, 2430, 982, 2460),
        LEVEL_487(9840, 1163700, 2460, 2450, 2435, 984, 2465),
        LEVEL_488(9860, 1167640, 2465, 2455, 2440, 986, 2470),
        LEVEL_489(9880, 1171590, 2470, 2460, 2445, 988, 2475),
        LEVEL_490(9900, 1175550, 2475, 2465, 2450, 990, 2480),
        LEVEL_491(9920, 1179520, 2480, 2470, 2455, 992, 2485),
        LEVEL_492(9940, 1183500, 2485, 2475, 2460, 994, 2490),
        LEVEL_493(9960, 1187490, 2490, 2480, 2465, 996, 2495),
        LEVEL_494(9980, 1191490, 2495, 2485, 2470, 998, 2500),
        LEVEL_495(10000, 1195500, 2500, 2490, 2475, 1000, 2505),
        LEVEL_496(10020, 1199520, 2505, 2495, 2480, 1002, 2510),
        LEVEL_497(10040, 1203550, 2510, 2500, 2485, 1004, 2515),
        LEVEL_498(10060, 1207590, 2515, 2505, 2490, 1006, 2520),
        LEVEL_499(10080, 1211640, 2520, 2510, 2495, 1008, 2525),
        LEVEL_500(10100, 1215700, 2525, 2515, 2500, 1010, 2530);
;
        int health;
        int exp;
        int mana;
        int abilityPower;
        int attackPower;
        int movementSpeed;
        int lifeSteal;

        Level(int health, int exp, int mana, int abilityPower, int attackPower, int movementSpeed, int lifeSteal) {
            this.health = health;
            this.exp = exp;
            this.mana = mana;
            this.abilityPower = abilityPower;
            this.attackPower = attackPower;
            this.movementSpeed = movementSpeed;
            this.lifeSteal = lifeSteal;
        }
    }

    public void setLevel(Level level) {
        this.health = level.health;
        this.exp = level.exp;
        this.mana = level.mana;
        this.abilityPower = level.abilityPower;
        this.attackPower = level.attackPower;
        this.movementSpeed = level.movementSpeed;
        this.lifeSteal = level.lifeSteal;
        this.level = level;
    }

    public void playerDied() {
        System.out.println("Game Over!");
    }

    public void showStats() {
        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println(this.level);
        System.out.println("Health: " + health);
        System.out.println("Experience: " + exp);
        System.out.println("Mana: " + mana);
        System.out.println("Ability Power: " + abilityPower);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Movement Speed: " + movementSpeed);
        System.out.println("Life Steal: " + lifeSteal);
        System.out.println("------------------------");
    }

    public void levelUp() {
        System.out.println("You leveled up!");
        level = Level.values()[level.ordinal() + 1];
        setLevel(level);
        this.showStats();
    }

    public void increaseHealth(int amount) {
        health += amount;
        System.out.println("Your health increased by " + amount + "!");
        System.out.println("Current Health: " + health);

    }
}
