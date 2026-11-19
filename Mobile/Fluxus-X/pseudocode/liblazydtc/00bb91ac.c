/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb91ac
 */

void FUN_00bb91ac(undefined1 (*param_1) [16],undefined1 (*param_2) [16],undefined1 (*param_3) [16],
                 int param_4,int param_5,uint param_6,int param_7)

{
  uint uVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [14];
  undefined1 auVar14 [16];
  undefined1 auVar15 [14];
  undefined1 auVar16 [16];
  undefined1 auVar17 [14];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined5 uVar20;
  undefined2 uVar21;
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [14];
  undefined1 auVar33 [14];
  undefined1 auVar34 [14];
  undefined8 uVar35;
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  long lVar39;
  undefined1 (*pauVar40) [16];
  undefined1 (*pauVar41) [16];
  ulong uVar42;
  undefined1 (*pauVar43) [16];
  undefined1 *puVar44;
  undefined4 *puVar45;
  undefined8 uVar46;
  ulong *puVar47;
  undefined8 uVar48;
  undefined4 uVar49;
  undefined4 uVar50;
  undefined4 uVar51;
  undefined4 uVar52;
  undefined4 uVar53;
  undefined4 uVar54;
  undefined4 uVar55;
  undefined4 uVar56;
  undefined1 uVar57;
  byte bVar58;
  undefined1 uVar59;
  byte bVar60;
  undefined1 uVar61;
  byte bVar62;
  undefined1 uVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  int iVar67;
  undefined3 uVar68;
  undefined4 uVar69;
  undefined7 uVar70;
  undefined1 auVar71 [12];
  undefined1 auVar72 [15];
  undefined1 auVar73 [16];
  undefined1 auVar74 [16];
  undefined1 auVar75 [16];
  undefined1 auVar76 [16];
  undefined1 auVar77 [16];
  undefined1 auVar78 [16];
  undefined1 auVar79 [16];
  undefined1 auVar80 [16];
  undefined1 auVar81 [16];
  undefined1 auVar82 [16];
  undefined1 auVar83 [16];
  undefined1 auVar84 [16];
  undefined1 auVar85 [12];
  undefined1 uVar90;
  undefined1 uVar91;
  undefined1 uVar92;
  undefined1 uVar93;
  undefined1 auVar86 [16];
  undefined1 auVar87 [16];
  undefined1 auVar88 [16];
  undefined1 auVar89 [16];
  undefined3 uVar94;
  undefined4 uVar95;
  undefined1 auVar96 [12];
  undefined1 auVar97 [12];
  byte bVar105;
  byte bVar106;
  undefined1 auVar98 [16];
  undefined1 auVar99 [16];
  undefined1 auVar100 [16];
  byte bVar103;
  byte bVar104;
  undefined1 auVar101 [16];
  undefined1 auVar102 [16];
  byte bVar118;
  undefined3 uVar107;
  undefined3 uVar108;
  undefined6 uVar109;
  undefined7 uVar110;
  undefined1 auVar111 [12];
  byte bVar120;
  byte bVar124;
  undefined1 auVar112 [15];
  undefined1 auVar114 [16];
  undefined1 auVar115 [16];
  undefined1 auVar113 [15];
  byte bVar119;
  byte bVar121;
  byte bVar122;
  byte bVar123;
  byte bVar125;
  undefined1 auVar116 [16];
  undefined1 auVar117 [16];
  undefined1 uVar128;
  undefined1 uVar129;
  undefined1 auVar126 [16];
  undefined1 auVar127 [16];
  undefined1 auVar130 [14];
  undefined1 auVar131 [15];
  undefined1 auVar132 [16];
  undefined1 auVar133 [16];
  undefined1 auVar134 [16];
  undefined3 uVar135;
  undefined6 uVar136;
  undefined7 uVar137;
  undefined1 auVar138 [12];
  undefined1 auVar139 [15];
  byte bVar149;
  undefined1 uVar150;
  byte bVar153;
  undefined1 auVar140 [16];
  undefined1 auVar141 [16];
  undefined1 auVar142 [16];
  undefined1 auVar143 [16];
  undefined1 auVar144 [16];
  byte bVar148;
  undefined1 uVar151;
  byte bVar152;
  undefined1 auVar145 [16];
  undefined1 auVar146 [16];
  undefined1 auVar147 [16];
  undefined1 uVar154;
  undefined1 uVar155;
  
  uVar1 = 1 << (ulong)(param_5 - param_4 & 0x1f);
  if (3 < (int)uVar1) {
    if (uVar1 != 4) {
      if (uVar1 != 8) goto LAB_00bb92b4;
      if (param_2 == param_3) {
        return;
      }
      uVar37 = (long)param_3 - (long)param_2;
      uVar1 = param_7 * 0x1000000 + param_4 * 0x10000;
      if ((uVar37 < 4) || ((param_1 < param_3 && (param_2 < param_1 + uVar37 * 2)))) {
        pauVar40 = param_1;
        pauVar41 = param_2;
      }
      else {
        uVar42 = CONCAT44(param_6,param_6) & 0xffff0000ffff;
        uVar38 = CONCAT44(param_6,param_6) & 0xffff0000ffff;
        uVar57 = (undefined1)uVar42;
        bVar58 = (byte)(uVar42 >> 8);
        uVar59 = (undefined1)(uVar42 >> 0x20);
        bVar60 = (byte)(uVar42 >> 0x28);
        uVar61 = (undefined1)uVar38;
        bVar62 = (byte)(uVar38 >> 8);
        uVar63 = (undefined1)(uVar38 >> 0x20);
        bVar64 = (byte)(uVar38 >> 0x28);
        bVar65 = (byte)(uVar1 >> 0x10);
        bVar66 = (byte)(uVar1 >> 0x18);
        if (uVar37 < 0x10) {
          uVar38 = 0;
        }
        else {
          uVar38 = uVar37 & 0xfffffffffffffff0;
          auVar114._8_8_ = 0xffffff0bffffff0a;
          auVar114._0_8_ = 0xffffff09ffffff08;
          auVar126._8_8_ = 0xffffff0fffffff0e;
          auVar126._0_8_ = 0xffffff0dffffff0c;
          iVar67 = -(uint)(param_7 == 1);
          auVar100._0_8_ = CONCAT44(iVar67,iVar67);
          auVar100._8_4_ = iVar67;
          auVar100._12_4_ = iVar67;
          uVar42 = uVar38;
          pauVar40 = param_1;
          pauVar41 = param_2;
          do {
            auVar28 = *pauVar41;
            auVar143._8_8_ = auVar100._8_8_;
            auVar143._0_8_ = auVar100._0_8_;
            uVar42 = uVar42 - 0x10;
            auVar132._8_4_ = 0xffffff02;
            auVar132._0_8_ = 0xffffff01ffffff00;
            auVar132._12_4_ = 0xffffff03;
            auVar132 = a64_TBL(ZEXT816(0),auVar28,auVar132);
            auVar133 = a64_TBL(ZEXT816(0),auVar28,auVar126);
            auVar144[1] = auVar132[0] | bVar58;
            auVar144[0] = uVar57;
            auVar144[2] = auVar132[1];
            auVar144[3] = auVar132[2];
            auVar144[4] = uVar59;
            auVar144[5] = auVar132[4] | bVar60;
            auVar144[6] = auVar132[5];
            auVar144[7] = auVar132[6];
            auVar144[8] = uVar61;
            auVar144[9] = auVar132[8] | bVar62;
            auVar144[10] = auVar132[9];
            auVar144[0xb] = auVar132[10];
            auVar144[0xc] = uVar63;
            auVar144[0xd] = auVar132[0xc] | bVar64;
            auVar144[0xe] = auVar132[0xd];
            auVar144[0xf] = auVar132[0xe];
            auVar144 = auVar144 ^ (auVar144 ^ auVar132) & auVar143;
            auVar127[8] = 6;
            auVar127._0_8_ = 0xffffff05ffffff04;
            auVar127[9] = 0xff;
            auVar127[10] = 0xff;
            auVar127[0xb] = 0xff;
            auVar127[0xc] = 7;
            auVar127[0xd] = 0xff;
            auVar127[0xe] = 0xff;
            auVar127[0xf] = 0xff;
            auVar132 = a64_TBL(ZEXT816(0),auVar28,auVar127);
            auVar127 = a64_TBL(ZEXT816(0),auVar28,auVar114);
            bVar118 = auVar144[2] | bVar65;
            uVar107 = CONCAT12(bVar118,auVar144._0_2_);
            bVar120 = auVar144[3] | bVar66;
            uVar150 = auVar144[4];
            uVar151 = auVar144[5];
            bVar122 = auVar144[6] | bVar65;
            uVar68 = CONCAT12(bVar122,auVar144._4_2_);
            bVar124 = auVar144[7] | bVar66;
            uVar69 = CONCAT13(auVar144[0xb] | bVar66,CONCAT12(auVar144[10] | bVar65,auVar144._8_2_))
            ;
            auVar30[1] = auVar132[0] | bVar58;
            auVar30[0] = uVar57;
            auVar30[2] = auVar132[1];
            auVar30[3] = auVar132[2];
            auVar30[4] = uVar59;
            auVar30[5] = auVar132[4] | bVar60;
            auVar30[6] = auVar132[5];
            auVar30[7] = auVar132[6];
            auVar30[8] = uVar61;
            auVar30[9] = auVar132[8] | bVar62;
            auVar30[10] = auVar132[9];
            auVar30[0xb] = auVar132[10];
            auVar30[0xc] = uVar63;
            auVar30[0xd] = auVar132[0xc] | bVar64;
            auVar30[0xe] = auVar132[0xd];
            auVar30[0xf] = auVar132[0xe];
            auVar132 = auVar132 ^ (auVar132 ^ auVar30) & ~auVar100;
            auVar31[1] = auVar127[0] | bVar58;
            auVar31[0] = uVar57;
            auVar31[2] = auVar127[1];
            auVar31[3] = auVar127[2];
            auVar31[4] = uVar59;
            auVar31[5] = auVar127[4] | bVar60;
            auVar31[6] = auVar127[5];
            auVar31[7] = auVar127[6];
            auVar31[8] = uVar61;
            auVar31[9] = auVar127[8] | bVar62;
            auVar31[10] = auVar127[9];
            auVar31[0xb] = auVar127[10];
            auVar31[0xc] = uVar63;
            auVar31[0xd] = auVar127[0xc] | bVar64;
            auVar31[0xe] = auVar127[0xd];
            auVar31[0xf] = auVar127[0xe];
            auVar127 = auVar127 ^ (auVar127 ^ auVar31) & ~auVar100;
            auVar28[1] = auVar133[0] | bVar58;
            auVar28[0] = uVar57;
            auVar28[2] = auVar133[1];
            auVar28[3] = auVar133[2];
            auVar28[4] = uVar59;
            auVar28[5] = auVar133[4] | bVar60;
            auVar28[6] = auVar133[5];
            auVar28[7] = auVar133[6];
            auVar28[8] = uVar61;
            auVar28[9] = auVar133[8] | bVar62;
            auVar28[10] = auVar133[9];
            auVar28[0xb] = auVar133[10];
            auVar28[0xc] = uVar63;
            auVar28[0xd] = auVar133[0xc] | bVar64;
            auVar28[0xe] = auVar133[0xd];
            auVar28[0xf] = auVar133[0xe];
            auVar133 = auVar133 ^ (auVar133 ^ auVar28) & ~auVar100;
            uVar49 = (undefined4)
                     (CONCAT17(auVar144[0xf] | bVar66,
                               CONCAT16(auVar144[0xe] | bVar65,
                                        CONCAT15(auVar144[0xd],CONCAT14(auVar144[0xc],uVar69)))) >>
                     0x20);
            uVar154 = auVar144[0];
            uVar155 = auVar144[1];
            bVar148 = auVar132[2] | bVar65;
            uVar135 = CONCAT12(bVar148,auVar132._0_2_);
            bVar149 = auVar132[3] | bVar66;
            uVar55 = CONCAT13(bVar149,uVar135);
            uVar136 = CONCAT15(auVar132[5],CONCAT14(auVar132[4],uVar55));
            bVar152 = auVar132[6] | bVar65;
            uVar137 = CONCAT16(bVar152,uVar136);
            bVar153 = auVar132[7] | bVar66;
            uVar46 = CONCAT17(bVar153,uVar137);
            auVar138._0_10_ = CONCAT19(auVar132[9],CONCAT18(auVar132[8],uVar46));
            auVar138[10] = auVar132[10] | bVar65;
            auVar138[0xb] = auVar132[0xb] | bVar66;
            auVar139[0xc] = auVar132[0xc];
            auVar139._0_12_ = auVar138;
            auVar139[0xd] = auVar132[0xd];
            auVar139[0xe] = auVar132[0xe] | bVar65;
            auVar145[0xf] = auVar132[0xf] | bVar66;
            auVar145._0_15_ = auVar139;
            bVar103 = auVar133[2] | bVar65;
            uVar94 = CONCAT12(bVar103,auVar133._0_2_);
            bVar104 = auVar133[3] | bVar66;
            uVar56 = CONCAT13(bVar104,uVar94);
            bVar105 = auVar133[6] | bVar65;
            uVar70 = CONCAT16(bVar105,CONCAT15(auVar133[5],CONCAT14(auVar133[4],uVar56)));
            bVar106 = auVar133[7] | bVar66;
            auVar96._0_8_ = CONCAT17(bVar106,uVar70);
            auVar96[8] = auVar133[8];
            auVar96[9] = auVar133[9];
            auVar96[10] = auVar133[10] | bVar65;
            auVar96[0xb] = auVar133[0xb] | bVar66;
            auVar101[0xc] = auVar133[0xc];
            auVar101._0_12_ = auVar96;
            auVar101[0xd] = auVar133[0xd];
            auVar101[0xe] = auVar133[0xe] | bVar65;
            auVar101[0xf] = auVar133[0xf] | bVar66;
            uVar52 = (undefined4)((ulong)uVar46 >> 0x20);
            uVar46 = CONCAT44(uVar49,uVar49);
            bVar119 = auVar127[2] | bVar65;
            uVar108 = CONCAT12(bVar119,auVar127._0_2_);
            bVar121 = auVar127[3] | bVar66;
            uVar95 = CONCAT13(bVar121,uVar108);
            uVar90 = auVar127[4];
            uVar91 = auVar127[5];
            uVar109 = CONCAT15(uVar91,CONCAT14(uVar90,uVar95));
            bVar123 = auVar127[6] | bVar65;
            uVar110 = CONCAT16(bVar123,uVar109);
            bVar125 = auVar127[7] | bVar66;
            uVar35 = CONCAT17(bVar125,uVar110);
            uVar92 = auVar127[8];
            uVar93 = auVar127[9];
            auVar111._0_10_ = CONCAT19(uVar93,CONCAT18(uVar92,uVar35));
            auVar111[10] = auVar127[10] | bVar65;
            auVar111[0xb] = auVar127[0xb] | bVar66;
            uVar128 = auVar127[0xc];
            auVar113[0xc] = uVar128;
            auVar113._0_12_ = auVar111;
            uVar129 = auVar127[0xd];
            auVar113[0xd] = uVar129;
            auVar113[0xe] = auVar127[0xe] | bVar65;
            auVar116[0xf] = auVar127[0xf] | bVar66;
            auVar116._0_15_ = auVar113;
            *(ulong *)*pauVar40 =
                 CONCAT17(bVar120,CONCAT16(bVar118,CONCAT15(uVar155,CONCAT14(uVar154,CONCAT13(
                                                  bVar120,uVar107)))));
            *(ulong *)(*pauVar40 + 8) =
                 CONCAT17(bVar120,CONCAT16(bVar118,CONCAT15(uVar155,CONCAT14(uVar154,CONCAT13(
                                                  bVar120,uVar107)))));
            *(ulong *)pauVar40[1] =
                 CONCAT17(bVar120,CONCAT16(bVar118,CONCAT15(uVar155,CONCAT14(uVar154,CONCAT13(
                                                  bVar120,CONCAT12(bVar118,auVar144._0_2_))))));
            *(ulong *)(pauVar40[1] + 8) =
                 CONCAT44(CONCAT13(bVar120,uVar107),CONCAT13(bVar120,uVar107));
            *(ulong *)pauVar40[2] =
                 CONCAT17(bVar124,CONCAT16(bVar122,CONCAT15(uVar151,CONCAT14(uVar150,CONCAT13(
                                                  bVar124,uVar68)))));
            *(ulong *)(pauVar40[2] + 8) =
                 CONCAT17(bVar124,CONCAT16(bVar122,CONCAT15(uVar151,CONCAT14(uVar150,CONCAT13(
                                                  bVar124,uVar68)))));
            *(ulong *)pauVar40[3] =
                 CONCAT17(bVar124,CONCAT16(bVar122,CONCAT15(uVar151,CONCAT14(uVar150,CONCAT13(
                                                  bVar124,CONCAT12(bVar122,auVar144._4_2_))))));
            *(ulong *)(pauVar40[3] + 8) =
                 CONCAT44(CONCAT13(bVar124,uVar68),CONCAT13(bVar124,uVar68));
            uVar50 = auVar138._8_4_;
            uVar49 = CONCAT13(bVar149,CONCAT12(bVar148,auVar132._0_2_));
            uVar53 = CONCAT13(bVar153,CONCAT12(bVar152,(short)((uint6)uVar136 >> 0x20)));
            uVar54 = (undefined4)((ulong)uVar35 >> 0x20);
            *(ulong *)pauVar40[4] = CONCAT44(uVar69,uVar69);
            *(ulong *)(pauVar40[4] + 8) = CONCAT44(uVar69,uVar69);
            *(ulong *)pauVar40[5] = CONCAT44(uVar69,uVar69);
            *(ulong *)(pauVar40[5] + 8) = CONCAT44(uVar69,uVar69);
            *(undefined8 *)pauVar40[6] = uVar46;
            *(undefined8 *)(pauVar40[6] + 8) = uVar46;
            *(undefined8 *)pauVar40[7] = uVar46;
            *(undefined8 *)(pauVar40[7] + 8) = uVar46;
            uVar51 = auVar96._8_4_;
            uVar68 = (undefined3)((uint7)uVar110 >> 0x20);
            uVar69 = CONCAT13(bVar125,uVar68);
            uVar35 = CONCAT44(auVar145._12_4_,auVar145._12_4_);
            uVar48 = CONCAT44(auVar101._12_4_,auVar101._12_4_);
            *(ulong *)pauVar40[8] =
                 CONCAT17(bVar149,CONCAT16(bVar148,CONCAT15(auVar132[1],
                                                            CONCAT14(auVar132[0],
                                                                     CONCAT13(bVar149,uVar135)))));
            *(ulong *)(pauVar40[8] + 8) = CONCAT44(uVar55,uVar55);
            *(ulong *)pauVar40[9] = CONCAT44(uVar49,uVar49);
            *(ulong *)(pauVar40[9] + 8) = CONCAT44(uVar55,uVar55);
            *(ulong *)pauVar40[10] =
                 CONCAT17(bVar153,CONCAT16(bVar152,CONCAT15(auVar132[5],
                                                            CONCAT14(auVar132[4],
                                                                     CONCAT13(bVar153,(int3)((uint7)
                                                  uVar137 >> 0x20))))));
            *(ulong *)(pauVar40[10] + 8) = CONCAT44(uVar52,uVar52);
            *(ulong *)pauVar40[0xb] = CONCAT44(uVar53,uVar53);
            *(ulong *)(pauVar40[0xb] + 8) = CONCAT44(uVar52,uVar52);
            uVar52 = auVar111._8_4_;
            uVar107 = (undefined3)((uint7)uVar70 >> 0x20);
            uVar49 = CONCAT13(bVar106,uVar107);
            uVar55 = (undefined4)((ulong)auVar96._0_8_ >> 0x20);
            uVar135 = CONCAT12(auVar138[10],(short)((unkuint10)auVar138._0_10_ >> 0x40));
            uVar53 = CONCAT13(auVar138[0xb],uVar135);
            uVar70 = CONCAT16(auVar138[10],CONCAT15(auVar132[9],CONCAT14(auVar132[8],uVar53)));
            uVar46 = CONCAT17(auVar138[0xb],uVar70);
            *(undefined8 *)pauVar40[0xc] = uVar46;
            *(ulong *)(pauVar40[0xc] + 8) = CONCAT44(uVar50,uVar50);
            *(ulong *)pauVar40[0xd] = CONCAT44(uVar50,uVar50);
            *(ulong *)(pauVar40[0xd] + 8) = CONCAT44(uVar50,uVar50);
            uVar53 = CONCAT13(auVar145[0xf],auVar139._12_3_);
            uVar70 = CONCAT16(auVar139[0xe],CONCAT15(auVar132[0xd],CONCAT14(auVar132[0xc],uVar53)));
            uVar46 = CONCAT17(auVar145[0xf],uVar70);
            *(undefined8 *)pauVar40[0xe] = uVar46;
            *(undefined8 *)(pauVar40[0xe] + 8) = uVar35;
            *(undefined8 *)pauVar40[0xf] = uVar35;
            *(undefined8 *)(pauVar40[0xf] + 8) = uVar35;
            uVar35 = CONCAT44(auVar116._12_4_,auVar116._12_4_);
            *(ulong *)pauVar40[0x10] = CONCAT44(CONCAT13(bVar121,uVar108),CONCAT13(bVar121,uVar108))
            ;
            *(ulong *)(pauVar40[0x10] + 8) = CONCAT44(uVar95,uVar95);
            *(ulong *)pauVar40[0x11] =
                 CONCAT17(bVar121,CONCAT16(bVar119,CONCAT15(auVar127[1],
                                                            CONCAT14(auVar127[0],
                                                                     CONCAT13(bVar121,uVar108)))));
            *(ulong *)(pauVar40[0x11] + 8) =
                 CONCAT17(bVar121,CONCAT16(bVar119,CONCAT15(auVar127[1],
                                                            CONCAT14(auVar127[0],
                                                                     CONCAT13(bVar121,CONCAT12(
                                                  bVar119,auVar127._0_2_))))));
            *(ulong *)pauVar40[0x12] = CONCAT44(uVar69,uVar69);
            *(ulong *)(pauVar40[0x12] + 8) = CONCAT44(uVar54,uVar54);
            *(ulong *)pauVar40[0x13] =
                 CONCAT17(bVar125,CONCAT16(bVar123,CONCAT15(uVar91,CONCAT14(uVar90,CONCAT13(bVar125,
                                                  uVar68)))));
            *(ulong *)(pauVar40[0x13] + 8) =
                 CONCAT17(bVar125,CONCAT16(bVar123,CONCAT15(uVar91,CONCAT14(uVar90,CONCAT13(bVar125,
                                                  CONCAT12(bVar123,(short)((uint6)uVar109 >> 0x20)))
                                                  ))));
            *(ulong *)pauVar40[0x14] = CONCAT44(uVar52,uVar52);
            *(ulong *)(pauVar40[0x14] + 8) = CONCAT44(uVar52,uVar52);
            uVar21 = (undefined2)((unkuint10)auVar111._0_10_ >> 0x40);
            uVar68 = CONCAT12(auVar111[10],uVar21);
            uVar69 = CONCAT13(auVar111[0xb],uVar68);
            uVar70 = CONCAT16(auVar111[10],CONCAT15(uVar93,CONCAT14(uVar92,uVar69)));
            uVar46 = CONCAT17(auVar111[0xb],uVar70);
            *(undefined8 *)pauVar40[0x15] = uVar46;
            uVar68 = CONCAT12(auVar111[10],uVar21);
            uVar69 = CONCAT13(auVar111[0xb],uVar68);
            uVar70 = CONCAT16(auVar111[10],CONCAT15(uVar93,CONCAT14(uVar92,uVar69)));
            uVar46 = CONCAT17(auVar111[0xb],uVar70);
            *(undefined8 *)(pauVar40[0x15] + 8) = uVar46;
            *(undefined8 *)pauVar40[0x16] = uVar35;
            *(undefined8 *)(pauVar40[0x16] + 8) = uVar35;
            uVar69 = CONCAT13(auVar116[0xf],auVar113._12_3_);
            uVar70 = CONCAT16(auVar113[0xe],CONCAT15(uVar129,CONCAT14(uVar128,uVar69)));
            uVar46 = CONCAT17(auVar116[0xf],uVar70);
            *(undefined8 *)pauVar40[0x17] = uVar46;
            uVar69 = CONCAT13(auVar116[0xf],auVar113._12_3_);
            uVar70 = CONCAT16(auVar113[0xe],CONCAT15(uVar129,CONCAT14(uVar128,uVar69)));
            uVar46 = CONCAT17(auVar116[0xf],uVar70);
            *(undefined8 *)(pauVar40[0x17] + 8) = uVar46;
            *(ulong *)pauVar40[0x18] =
                 CONCAT17(bVar104,CONCAT16(bVar103,CONCAT15(auVar133[1],
                                                            CONCAT14(auVar133[0],
                                                                     CONCAT13(bVar104,uVar94)))));
            *(ulong *)(pauVar40[0x18] + 8) = CONCAT44(uVar56,uVar56);
            *(ulong *)pauVar40[0x19] = CONCAT44(uVar56,uVar56);
            *(ulong *)(pauVar40[0x19] + 8) =
                 CONCAT44(CONCAT13(bVar104,uVar94),CONCAT13(bVar104,uVar94));
            *(ulong *)pauVar40[0x1a] =
                 CONCAT17(bVar106,CONCAT16(bVar105,CONCAT15(auVar133[5],
                                                            CONCAT14(auVar133[4],
                                                                     CONCAT13(bVar106,uVar107)))));
            *(ulong *)(pauVar40[0x1a] + 8) = CONCAT44(uVar55,uVar55);
            *(ulong *)pauVar40[0x1b] = CONCAT44(uVar55,uVar55);
            *(ulong *)(pauVar40[0x1b] + 8) = CONCAT44(uVar49,uVar49);
            *(ulong *)pauVar40[0x1c] = CONCAT44(uVar51,uVar51);
            *(ulong *)(pauVar40[0x1c] + 8) = CONCAT44(uVar51,uVar51);
            *(ulong *)pauVar40[0x1d] = CONCAT44(uVar51,uVar51);
            *(ulong *)(pauVar40[0x1d] + 8) = CONCAT44(uVar51,uVar51);
            *(undefined8 *)pauVar40[0x1e] = uVar48;
            *(undefined8 *)(pauVar40[0x1e] + 8) = uVar48;
            *(undefined8 *)pauVar40[0x1f] = uVar48;
            *(undefined8 *)(pauVar40[0x1f] + 8) = uVar48;
            pauVar40 = pauVar40 + 0x20;
            pauVar41 = pauVar41 + 1;
          } while (uVar42 != 0);
          if (uVar37 == uVar38) {
            return;
          }
          if ((uVar37 & 0xc) == 0) {
            pauVar40 = param_1 + uVar38 * 2;
            pauVar41 = (undefined1 (*) [16])(*param_2 + uVar38);
            goto LAB_00bb9284;
          }
        }
        uVar42 = uVar37 & 0xfffffffffffffffc;
        pauVar40 = param_1 + uVar42 * 2;
        pauVar41 = (undefined1 (*) [16])(*param_2 + uVar42);
        lVar39 = uVar38 - uVar42;
        iVar67 = -(uint)(param_7 == 1);
        puVar45 = (undefined4 *)(*param_2 + uVar38);
        pauVar43 = param_1 + uVar38 * 2;
        do {
          uVar69 = *puVar45;
          lVar39 = lVar39 + 4;
          bVar103 = (byte)((uint)uVar69 >> 8);
          bVar104 = (byte)((uint)uVar69 >> 0x10);
          bVar105 = (byte)((uint)uVar69 >> 0x18);
          auVar33._6_2_ = 0;
          auVar33._0_6_ =
               (uint6)CONCAT14(bVar103,(uint)CONCAT12(bVar103,(ushort)(byte)uVar69)) &
               0xffff0000ffff;
          auVar33[8] = bVar104;
          auVar33._9_3_ = 0;
          auVar33[0xc] = bVar105;
          auVar33[0xd] = 0;
          auVar76._14_2_ = 0;
          auVar76._0_14_ = auVar33;
          auVar17[1] = (byte)uVar69 | bVar58;
          auVar17[0] = uVar57;
          auVar17._2_2_ = 0;
          auVar17[4] = uVar59;
          auVar17[5] = bVar103 | bVar60;
          auVar17._6_2_ = 0;
          auVar17[8] = uVar61;
          auVar17[9] = bVar104 | bVar62;
          auVar17._10_2_ = 0;
          auVar17[0xc] = uVar63;
          auVar17[0xd] = bVar105 | bVar64;
          auVar133._14_2_ = 0;
          auVar133._0_14_ = auVar33 ^ auVar17;
          auVar9._4_4_ = iVar67;
          auVar9._0_4_ = iVar67;
          auVar9._8_4_ = iVar67;
          auVar9._12_4_ = iVar67;
          auVar76 = auVar76 ^ auVar133 & ~auVar9;
          uVar68 = CONCAT12(bVar65,auVar76._0_2_);
          uVar51 = CONCAT13(bVar66,uVar68);
          uVar70 = CONCAT16(bVar65,CONCAT15(auVar76[5],CONCAT14(auVar76[4],uVar51)));
          uVar46 = CONCAT17(bVar66,uVar70);
          auVar71._0_10_ = CONCAT19(auVar76[9],CONCAT18(auVar76[8],uVar46));
          auVar71[10] = auVar76[10] | bVar65;
          auVar71[0xb] = auVar76[0xb] | bVar66;
          auVar72[0xc] = auVar76[0xc];
          auVar72._0_12_ = auVar71;
          auVar72[0xd] = auVar76[0xd];
          auVar72[0xe] = auVar76[0xe] | bVar65;
          auVar77[0xf] = auVar76[0xf] | bVar66;
          auVar77._0_15_ = auVar72;
          uVar50 = (undefined4)((ulong)uVar46 >> 0x20);
          uVar53 = auVar71._8_4_;
          uVar69 = CONCAT13(bVar66,uVar68);
          uVar49 = CONCAT13(bVar66,(int3)((uint7)uVar70 >> 0x20));
          uVar35 = CONCAT44(auVar77._12_4_,auVar77._12_4_);
          *(ulong *)*pauVar43 = CONCAT44(uVar51,uVar51);
          *(ulong *)(*pauVar43 + 8) = CONCAT44(uVar51,uVar51);
          *(ulong *)pauVar43[1] = CONCAT44(uVar51,uVar51);
          *(ulong *)(pauVar43[1] + 8) = CONCAT44(uVar69,uVar69);
          *(ulong *)pauVar43[2] = CONCAT44(uVar50,uVar50);
          *(ulong *)(pauVar43[2] + 8) = CONCAT44(uVar50,uVar50);
          *(ulong *)pauVar43[3] = CONCAT44(uVar50,uVar50);
          *(ulong *)(pauVar43[3] + 8) = CONCAT44(uVar49,uVar49);
          uVar68 = CONCAT12(auVar71[10],(short)((unkuint10)auVar71._0_10_ >> 0x40));
          uVar69 = CONCAT13(auVar71[0xb],uVar68);
          uVar70 = CONCAT16(auVar71[10],CONCAT15(auVar76[9],CONCAT14(auVar76[8],uVar69)));
          uVar46 = CONCAT17(auVar71[0xb],uVar70);
          *(undefined8 *)pauVar43[4] = uVar46;
          *(ulong *)(pauVar43[4] + 8) = CONCAT44(uVar53,uVar53);
          *(ulong *)pauVar43[5] = CONCAT44(uVar53,uVar53);
          *(ulong *)(pauVar43[5] + 8) = CONCAT44(uVar53,uVar53);
          uVar69 = CONCAT13(auVar77[0xf],auVar72._12_3_);
          uVar20 = CONCAT14(auVar72[0xc],uVar69);
          uVar109 = CONCAT15(auVar72[0xd],uVar20);
          uVar70 = CONCAT16(auVar72[0xe],uVar109);
          uVar46 = CONCAT17(auVar77[0xf],uVar70);
          *(undefined8 *)pauVar43[6] = uVar46;
          *(undefined8 *)(pauVar43[6] + 8) = uVar35;
          *(undefined8 *)pauVar43[7] = uVar35;
          *(undefined8 *)(pauVar43[7] + 8) = uVar35;
          puVar45 = puVar45 + 1;
          pauVar43 = pauVar43 + 8;
        } while (lVar39 != 0);
        if (uVar37 == uVar42) {
          return;
        }
      }
LAB_00bb9284:
      do {
        puVar44 = *pauVar41;
        uVar2 = (uint)(byte)(*pauVar41)[0];
        if (param_7 != 1) {
          uVar2 = param_6 & 0xffff | (uint)(byte)(*pauVar41)[0] << 8;
        }
        uVar46 = CONCAT44(uVar2 | uVar1,uVar2 | uVar1);
        *(undefined8 *)*pauVar40 = uVar46;
        *(undefined8 *)(*pauVar40 + 8) = uVar46;
        *(undefined8 *)pauVar40[1] = uVar46;
        *(undefined8 *)(pauVar40[1] + 8) = uVar46;
        pauVar40 = pauVar40 + 2;
        pauVar41 = (undefined1 (*) [16])(puVar44 + 1);
      } while ((undefined1 (*) [16])(puVar44 + 1) != param_3);
      return;
    }
    if (param_2 == param_3) {
      return;
    }
    uVar37 = (long)param_3 - (long)param_2;
    uVar1 = param_7 * 0x1000000 + param_4 * 0x10000;
    if ((uVar37 < 8) || ((param_1 < param_3 && (param_2 < param_1 + uVar37)))) {
      pauVar40 = param_1;
      pauVar41 = param_2;
    }
    else {
      uVar42 = CONCAT44(param_6,param_6) & 0xffff0000ffff;
      uVar38 = CONCAT44(param_6,param_6) & 0xffff0000ffff;
      uVar57 = (undefined1)uVar42;
      bVar58 = (byte)(uVar42 >> 8);
      uVar59 = (undefined1)(uVar42 >> 0x20);
      bVar60 = (byte)(uVar42 >> 0x28);
      uVar61 = (undefined1)uVar38;
      bVar62 = (byte)(uVar38 >> 8);
      uVar63 = (undefined1)(uVar38 >> 0x20);
      bVar64 = (byte)(uVar38 >> 0x28);
      bVar65 = (byte)(uVar1 >> 0x10);
      bVar66 = (byte)(uVar1 >> 0x18);
      if (uVar37 < 0x10) {
        uVar38 = 0;
      }
      else {
        uVar38 = uVar37 & 0xfffffffffffffff0;
        auVar84._8_8_ = 0xffffff0bffffff0a;
        auVar84._0_8_ = 0xffffff09ffffff08;
        auVar89._8_8_ = 0xffffff0fffffff0e;
        auVar89._0_8_ = 0xffffff0dffffff0c;
        auVar80._0_4_ = -(uint)(param_7 == 1);
        auVar80._4_4_ = auVar80._0_4_;
        auVar80._8_4_ = auVar80._0_4_;
        auVar80._12_4_ = auVar80._0_4_;
        uVar42 = uVar38;
        pauVar40 = param_1;
        pauVar41 = param_2;
        do {
          auVar100 = *pauVar41;
          uVar42 = uVar42 - 0x10;
          auVar12._8_4_ = 0xffffff02;
          auVar12._0_8_ = 0xffffff01ffffff00;
          auVar12._12_4_ = 0xffffff03;
          auVar114 = a64_TBL(ZEXT816(0),auVar100,auVar12);
          auVar19[8] = 6;
          auVar19._0_8_ = 0xffffff05ffffff04;
          auVar19[9] = 0xff;
          auVar19[10] = 0xff;
          auVar19[0xb] = 0xff;
          auVar19[0xc] = 7;
          auVar19[0xd] = 0xff;
          auVar19[0xe] = 0xff;
          auVar19[0xf] = 0xff;
          auVar126 = a64_TBL(ZEXT816(0),auVar100,auVar19);
          auVar132 = a64_TBL(ZEXT816(0),auVar100,auVar84);
          auVar100 = a64_TBL(ZEXT816(0),auVar100,auVar89);
          auVar134[1] = auVar114[0] | bVar58;
          auVar134[0] = uVar57;
          auVar134[2] = auVar114[1];
          auVar134[3] = auVar114[2];
          auVar134[4] = uVar59;
          auVar134[5] = auVar114[4] | bVar60;
          auVar134[6] = auVar114[5];
          auVar134[7] = auVar114[6];
          auVar134[8] = uVar61;
          auVar134[9] = auVar114[8] | bVar62;
          auVar134[10] = auVar114[9];
          auVar134[0xb] = auVar114[10];
          auVar134[0xc] = uVar63;
          auVar134[0xd] = auVar114[0xc] | bVar64;
          auVar134[0xe] = auVar114[0xd];
          auVar134[0xf] = auVar114[0xe];
          auVar114 = auVar114 ^ (auVar114 ^ auVar134) & ~auVar80;
          auVar25[1] = auVar126[0] | bVar58;
          auVar25[0] = uVar57;
          auVar25[2] = auVar126[1];
          auVar25[3] = auVar126[2];
          auVar25[4] = uVar59;
          auVar25[5] = auVar126[4] | bVar60;
          auVar25[6] = auVar126[5];
          auVar25[7] = auVar126[6];
          auVar25[8] = uVar61;
          auVar25[9] = auVar126[8] | bVar62;
          auVar25[10] = auVar126[9];
          auVar25[0xb] = auVar126[10];
          auVar25[0xc] = uVar63;
          auVar25[0xd] = auVar126[0xc] | bVar64;
          auVar25[0xe] = auVar126[0xd];
          auVar25[0xf] = auVar126[0xe];
          auVar126 = auVar126 ^ (auVar126 ^ auVar25) & ~auVar80;
          auVar29[1] = auVar132[0] | bVar58;
          auVar29[0] = uVar57;
          auVar29[2] = auVar132[1];
          auVar29[3] = auVar132[2];
          auVar29[4] = uVar59;
          auVar29[5] = auVar132[4] | bVar60;
          auVar29[6] = auVar132[5];
          auVar29[7] = auVar132[6];
          auVar29[8] = uVar61;
          auVar29[9] = auVar132[8] | bVar62;
          auVar29[10] = auVar132[9];
          auVar29[0xb] = auVar132[10];
          auVar29[0xc] = uVar63;
          auVar29[0xd] = auVar132[0xc] | bVar64;
          auVar29[0xe] = auVar132[0xd];
          auVar29[0xf] = auVar132[0xe];
          auVar132 = auVar132 ^ (auVar132 ^ auVar29) & ~auVar80;
          uVar56 = CONCAT13(auVar114[3] | bVar66,CONCAT12(auVar114[2] | bVar65,auVar114._0_2_));
          uVar46 = CONCAT17(auVar114[7] | bVar66,
                            CONCAT16(auVar114[6] | bVar65,
                                     CONCAT15(auVar114[5],CONCAT14(auVar114[4],uVar56))));
          auVar130._0_10_ = CONCAT19(auVar114[9],CONCAT18(auVar114[8],uVar46));
          auVar130[10] = auVar114[10] | bVar65;
          auVar130[0xb] = auVar114[0xb] | bVar66;
          auVar130[0xc] = auVar114[0xc];
          auVar130[0xd] = auVar114[0xd];
          auVar131[0xe] = auVar114[0xe] | bVar65;
          auVar131._0_14_ = auVar130;
          bVar105 = auVar114[0xf] | bVar66;
          uVar94 = CONCAT12(auVar126[2] | bVar65,auVar126._0_2_);
          bVar103 = auVar126[3] | bVar66;
          uVar107 = CONCAT12(auVar126[6] | bVar65,auVar126._4_2_);
          bVar104 = auVar126[7] | bVar66;
          uVar55 = CONCAT13(auVar126[0xb] | bVar66,CONCAT12(auVar126[10] | bVar65,auVar126._8_2_));
          auVar26[1] = auVar100[0] | bVar58;
          auVar26[0] = uVar57;
          auVar26[2] = auVar100[1];
          auVar26[3] = auVar100[2];
          auVar26[4] = uVar59;
          auVar26[5] = auVar100[4] | bVar60;
          auVar26[6] = auVar100[5];
          auVar26[7] = auVar100[6];
          auVar26[8] = uVar61;
          auVar26[9] = auVar100[8] | bVar62;
          auVar26[10] = auVar100[9];
          auVar26[0xb] = auVar100[10];
          auVar26[0xc] = uVar63;
          auVar26[0xd] = auVar100[0xc] | bVar64;
          auVar26[0xe] = auVar100[0xd];
          auVar26[0xf] = auVar100[0xe];
          auVar100 = auVar100 ^ (auVar100 ^ auVar26) & ~auVar80;
          bVar106 = auVar132[2] | bVar65;
          uVar108 = CONCAT12(bVar106,auVar132._0_2_);
          bVar118 = auVar132[3] | bVar66;
          bVar119 = auVar132[6] | bVar65;
          uVar135 = CONCAT12(bVar119,auVar132._4_2_);
          bVar120 = auVar132[7] | bVar66;
          bVar121 = auVar132[10] | bVar65;
          bVar122 = auVar132[0xb] | bVar66;
          uVar90 = auVar132[0xc];
          uVar91 = auVar132[0xd];
          bVar123 = auVar132[0xe] | bVar65;
          bVar124 = auVar132[0xf] | bVar66;
          uVar54 = (undefined4)((ulong)uVar46 >> 0x20);
          uVar69 = (undefined4)
                   (CONCAT17(auVar126[0xf] | bVar66,
                             CONCAT16(auVar126[0xe] | bVar65,
                                      CONCAT15(auVar126[0xd],CONCAT14(auVar126[0xc],uVar55)))) >>
                   0x20);
          uVar95 = CONCAT13(auVar100[3] | bVar66,CONCAT12(auVar100[2] | bVar65,auVar100._0_2_));
          auVar97._0_8_ =
               CONCAT17(auVar100[7] | bVar66,
                        CONCAT16(auVar100[6] | bVar65,
                                 CONCAT15(auVar100[5],CONCAT14(auVar100[4],uVar95))));
          auVar97[8] = auVar100[8];
          auVar97[9] = auVar100[9];
          auVar97[10] = auVar100[10] | bVar65;
          auVar97[0xb] = auVar100[0xb] | bVar66;
          auVar102[0xc] = auVar100[0xc];
          auVar102._0_12_ = auVar97;
          auVar102[0xd] = auVar100[0xd];
          auVar102[0xe] = auVar100[0xe] | bVar65;
          auVar102[0xf] = auVar100[0xf] | bVar66;
          uVar21 = (undefined2)((unkuint10)auVar130._0_10_ >> 0x40);
          uVar68 = CONCAT12(auVar130[10],uVar21);
          uVar53 = CONCAT13(auVar130[0xb],uVar68);
          uVar50 = CONCAT13(bVar105,auVar131._12_3_);
          uVar52 = CONCAT13(bVar104,uVar107);
          uVar51 = CONCAT13(bVar103,uVar94);
          uVar35 = CONCAT44(uVar69,uVar69);
          uVar69 = CONCAT13(bVar103,uVar94);
          uVar49 = CONCAT13(bVar104,uVar107);
          *(ulong *)*pauVar40 = CONCAT44(uVar56,uVar56);
          *(ulong *)(*pauVar40 + 8) = CONCAT44(uVar56,uVar56);
          *(ulong *)pauVar40[1] = CONCAT44(uVar54,uVar54);
          *(ulong *)(pauVar40[1] + 8) = CONCAT44(uVar54,uVar54);
          uVar56 = (undefined4)((ulong)auVar97._0_8_ >> 0x20);
          uVar68 = CONCAT12(auVar130[10],uVar21);
          uVar54 = CONCAT13(auVar130[0xb],uVar68);
          uVar70 = CONCAT16(auVar130[10],CONCAT15(auVar114[9],CONCAT14(auVar114[8],uVar54)));
          uVar46 = CONCAT17(auVar130[0xb],uVar70);
          *(undefined8 *)pauVar40[2] = uVar46;
          *(ulong *)(pauVar40[2] + 8) = CONCAT44(uVar53,uVar53);
          uVar68 = CONCAT12(auVar131[0xe],auVar130._12_2_);
          uVar70 = CONCAT16(auVar131[0xe],
                            CONCAT15(auVar114[0xd],CONCAT14(auVar114[0xc],CONCAT13(bVar105,uVar68)))
                           );
          *(ulong *)pauVar40[3] = CONCAT17(bVar105,uVar70);
          *(ulong *)(pauVar40[3] + 8) = CONCAT44(uVar50,uVar50);
          *(ulong *)pauVar40[4] = CONCAT44(uVar69,uVar69);
          *(ulong *)(pauVar40[4] + 8) = CONCAT44(uVar51,uVar51);
          *(ulong *)pauVar40[5] = CONCAT44(uVar49,uVar49);
          *(ulong *)(pauVar40[5] + 8) = CONCAT44(uVar52,uVar52);
          uVar69 = auVar97._8_4_;
          *(ulong *)pauVar40[6] = CONCAT44(uVar55,uVar55);
          *(ulong *)(pauVar40[6] + 8) = CONCAT44(uVar55,uVar55);
          *(undefined8 *)pauVar40[7] = uVar35;
          *(undefined8 *)(pauVar40[7] + 8) = uVar35;
          *(ulong *)pauVar40[8] =
               CONCAT17(bVar118,CONCAT16(bVar106,CONCAT15(auVar132[1],
                                                          CONCAT14(auVar132[0],
                                                                   CONCAT13(bVar118,uVar108)))));
          *(ulong *)(pauVar40[8] + 8) =
               CONCAT17(bVar118,CONCAT16(bVar106,CONCAT15(auVar132[1],
                                                          CONCAT14(auVar132[0],
                                                                   CONCAT13(bVar118,uVar108)))));
          *(ulong *)pauVar40[9] =
               CONCAT17(bVar120,CONCAT16(bVar119,CONCAT15(auVar132[5],
                                                          CONCAT14(auVar132[4],
                                                                   CONCAT13(bVar120,uVar135)))));
          *(ulong *)(pauVar40[9] + 8) =
               CONCAT17(bVar120,CONCAT16(bVar119,CONCAT15(auVar132[5],
                                                          CONCAT14(auVar132[4],
                                                                   CONCAT13(bVar120,uVar135)))));
          uVar46 = CONCAT44(auVar102._12_4_,auVar102._12_4_);
          *(ulong *)pauVar40[10] =
               CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(auVar132[9],
                                                          CONCAT14(auVar132[8],
                                                                   CONCAT13(bVar122,CONCAT12(bVar121
                                                  ,auVar132._8_2_))))));
          *(ulong *)(pauVar40[10] + 8) =
               CONCAT17(bVar122,CONCAT16(bVar121,CONCAT15(auVar132[9],
                                                          CONCAT14(auVar132[8],
                                                                   CONCAT13(bVar122,CONCAT12(bVar121
                                                  ,auVar132._8_2_))))));
          uVar68 = (undefined3)(CONCAT13(bVar123,CONCAT12(uVar91,CONCAT11(uVar90,bVar122))) >> 8);
          *(ulong *)pauVar40[0xb] =
               CONCAT17(bVar124,CONCAT16(bVar123,CONCAT15(uVar91,CONCAT14(uVar90,CONCAT13(bVar124,
                                                  uVar68)))));
          *(ulong *)(pauVar40[0xb] + 8) =
               CONCAT17(bVar124,CONCAT16(bVar123,CONCAT15(uVar91,CONCAT14(uVar90,CONCAT13(bVar124,
                                                  uVar68)))));
          *(ulong *)pauVar40[0xc] = CONCAT44(uVar95,uVar95);
          *(ulong *)(pauVar40[0xc] + 8) = CONCAT44(uVar95,uVar95);
          *(ulong *)pauVar40[0xd] = CONCAT44(uVar56,uVar56);
          *(ulong *)(pauVar40[0xd] + 8) = CONCAT44(uVar56,uVar56);
          *(ulong *)pauVar40[0xe] = CONCAT44(uVar69,uVar69);
          *(ulong *)(pauVar40[0xe] + 8) = CONCAT44(uVar69,uVar69);
          *(undefined8 *)pauVar40[0xf] = uVar46;
          *(undefined8 *)(pauVar40[0xf] + 8) = uVar46;
          pauVar40 = pauVar40 + 0x10;
          pauVar41 = pauVar41 + 1;
        } while (uVar42 != 0);
        if (uVar37 == uVar38) {
          return;
        }
        if (((uint)uVar37 >> 3 & 1) == 0) {
          pauVar40 = param_1 + uVar38;
          pauVar41 = (undefined1 (*) [16])(*param_2 + uVar38);
          goto LAB_00bb9404;
        }
      }
      uVar42 = uVar37 & 0xfffffffffffffff8;
      pauVar40 = param_1 + uVar42;
      lVar39 = uVar38 - uVar42;
      iVar67 = -(uint)(param_7 == 1);
      auVar73._8_8_ = 0xffffff03ffffff02;
      auVar73._0_8_ = 0xffffff01ffffff00;
      pauVar41 = (undefined1 (*) [16])(*param_2 + uVar42);
      pauVar43 = param_1 + uVar38;
      puVar47 = (ulong *)(*param_2 + uVar38);
      do {
        auVar81._0_8_ = *puVar47;
        auVar81._8_8_ = 0;
        lVar39 = lVar39 + 8;
        auVar114 = a64_TBL(ZEXT816(0),auVar81,auVar73);
        auVar18[8] = 6;
        auVar18._0_8_ = 0xffffff05ffffff04;
        auVar18[9] = 0xff;
        auVar18[10] = 0xff;
        auVar18[0xb] = 0xff;
        auVar18[0xc] = 7;
        auVar18[0xd] = 0xff;
        auVar18[0xe] = 0xff;
        auVar18[0xf] = 0xff;
        auVar100 = a64_TBL(ZEXT816(0),auVar81,auVar18);
        auVar98[1] = auVar114[0] | bVar58;
        auVar98[0] = uVar57;
        auVar98[2] = auVar114[1];
        auVar98[3] = auVar114[2];
        auVar98[4] = uVar59;
        auVar98[5] = auVar114[4] | bVar60;
        auVar98[6] = auVar114[5];
        auVar98[7] = auVar114[6];
        auVar98[8] = uVar61;
        auVar98[9] = auVar114[8] | bVar62;
        auVar98[10] = auVar114[9];
        auVar98[0xb] = auVar114[10];
        auVar98[0xc] = uVar63;
        auVar98[0xd] = auVar114[0xc] | bVar64;
        auVar98[0xe] = auVar114[0xd];
        auVar98[0xf] = auVar114[0xe];
        auVar10._4_4_ = iVar67;
        auVar10._0_4_ = iVar67;
        auVar10._8_4_ = iVar67;
        auVar10._12_4_ = iVar67;
        auVar114 = auVar114 ^ (auVar114 ^ auVar98) & ~auVar10;
        auVar99[1] = auVar100[0] | bVar58;
        auVar99[0] = uVar57;
        auVar99[2] = auVar100[1];
        auVar99[3] = auVar100[2];
        auVar99[4] = uVar59;
        auVar99[5] = auVar100[4] | bVar60;
        auVar99[6] = auVar100[5];
        auVar99[7] = auVar100[6];
        auVar99[8] = uVar61;
        auVar99[9] = auVar100[8] | bVar62;
        auVar99[10] = auVar100[9];
        auVar99[0xb] = auVar100[10];
        auVar99[0xc] = uVar63;
        auVar99[0xd] = auVar100[0xc] | bVar64;
        auVar99[0xe] = auVar100[0xd];
        auVar99[0xf] = auVar100[0xe];
        auVar11._4_4_ = iVar67;
        auVar11._0_4_ = iVar67;
        auVar11._8_4_ = iVar67;
        auVar11._12_4_ = iVar67;
        auVar100 = auVar100 ^ (auVar100 ^ auVar99) & ~auVar11;
        uVar51 = CONCAT13(auVar114[3] | bVar66,CONCAT12(auVar114[2] | bVar65,auVar114._0_2_));
        uVar46 = CONCAT17(auVar114[7] | bVar66,
                          CONCAT16(auVar114[6] | bVar65,
                                   CONCAT15(auVar114[5],CONCAT14(auVar114[4],uVar51))));
        uVar90 = auVar114[8];
        uVar91 = auVar114[9];
        auVar112._0_10_ = CONCAT19(uVar91,CONCAT18(uVar90,uVar46));
        auVar112[10] = auVar114[10] | bVar65;
        auVar112[0xb] = auVar114[0xb] | bVar66;
        uVar92 = auVar114[0xc];
        auVar112[0xc] = uVar92;
        uVar93 = auVar114[0xd];
        auVar112[0xd] = uVar93;
        auVar112[0xe] = auVar114[0xe] | bVar65;
        bVar103 = auVar114[0xf] | bVar66;
        uVar69 = (undefined4)((ulong)uVar46 >> 0x20);
        uVar50 = CONCAT13(auVar100[3] | bVar66,CONCAT12(auVar100[2] | bVar65,auVar100._0_2_));
        auVar85._0_8_ =
             CONCAT17(auVar100[7] | bVar66,
                      CONCAT16(auVar100[6] | bVar65,
                               CONCAT15(auVar100[5],CONCAT14(auVar100[4],uVar50))));
        auVar85[8] = auVar100[8];
        auVar85[9] = auVar100[9];
        auVar85[10] = auVar100[10] | bVar65;
        auVar85[0xb] = auVar100[0xb] | bVar66;
        auVar86[0xc] = auVar100[0xc];
        auVar86._0_12_ = auVar85;
        auVar86[0xd] = auVar100[0xd];
        auVar86[0xe] = auVar100[0xe] | bVar65;
        auVar86[0xf] = auVar100[0xf] | bVar66;
        uVar53 = (undefined4)((ulong)auVar85._0_8_ >> 0x20);
        uVar49 = auVar85._8_4_;
        *(ulong *)*pauVar43 = CONCAT44(uVar51,uVar51);
        *(ulong *)(*pauVar43 + 8) = CONCAT44(uVar51,uVar51);
        *(ulong *)pauVar43[1] = CONCAT44(uVar69,uVar69);
        *(ulong *)(pauVar43[1] + 8) = CONCAT44(uVar69,uVar69);
        uVar21 = (undefined2)((unkuint10)auVar112._0_10_ >> 0x40);
        uVar68 = CONCAT12(auVar112[10],uVar21);
        uVar69 = CONCAT13(auVar112[0xb],uVar68);
        uVar70 = CONCAT16(auVar112[10],CONCAT15(uVar91,CONCAT14(uVar90,uVar69)));
        uVar46 = CONCAT17(auVar112[0xb],uVar70);
        *(undefined8 *)pauVar43[2] = uVar46;
        uVar68 = CONCAT12(auVar112[10],uVar21);
        uVar69 = CONCAT13(auVar112[0xb],uVar68);
        uVar70 = CONCAT16(auVar112[10],CONCAT15(uVar91,CONCAT14(uVar90,uVar69)));
        uVar46 = CONCAT17(auVar112[0xb],uVar70);
        *(undefined8 *)(pauVar43[2] + 8) = uVar46;
        uVar70 = CONCAT16(auVar112[0xe],
                          CONCAT15(uVar93,CONCAT14(uVar92,CONCAT13(bVar103,auVar112._12_3_))));
        *(ulong *)pauVar43[3] = CONCAT17(bVar103,uVar70);
        uVar70 = CONCAT16(auVar112[0xe],
                          CONCAT15(uVar93,CONCAT14(uVar92,CONCAT13(bVar103,auVar112._12_3_))));
        *(ulong *)(pauVar43[3] + 8) = CONCAT17(bVar103,uVar70);
        uVar46 = CONCAT44(auVar86._12_4_,auVar86._12_4_);
        *(ulong *)pauVar43[4] = CONCAT44(uVar50,uVar50);
        *(ulong *)(pauVar43[4] + 8) = CONCAT44(uVar50,uVar50);
        *(ulong *)pauVar43[5] = CONCAT44(uVar53,uVar53);
        *(ulong *)(pauVar43[5] + 8) = CONCAT44(uVar53,uVar53);
        *(ulong *)pauVar43[6] = CONCAT44(uVar49,uVar49);
        *(ulong *)(pauVar43[6] + 8) = CONCAT44(uVar49,uVar49);
        *(undefined8 *)pauVar43[7] = uVar46;
        *(undefined8 *)(pauVar43[7] + 8) = uVar46;
        pauVar43 = pauVar43 + 8;
        puVar47 = puVar47 + 1;
      } while (lVar39 != 0);
      if (uVar37 == uVar42) {
        return;
      }
    }
LAB_00bb9404:
    do {
      puVar44 = *pauVar41;
      uVar2 = (uint)(byte)(*pauVar41)[0];
      if (param_7 != 1) {
        uVar2 = param_6 & 0xffff | (uint)(byte)(*pauVar41)[0] << 8;
      }
      uVar46 = CONCAT44(uVar2 | uVar1,uVar2 | uVar1);
      *(undefined8 *)*pauVar40 = uVar46;
      *(undefined8 *)(*pauVar40 + 8) = uVar46;
      pauVar40 = pauVar40 + 1;
      pauVar41 = (undefined1 (*) [16])(puVar44 + 1);
    } while ((undefined1 (*) [16])(puVar44 + 1) != param_3);
    return;
  }
  if (uVar1 != 1) {
    if (uVar1 != 2) {
LAB_00bb92b4:
      if (param_2 == param_3) {
        return;
      }
      uVar42 = (ulong)uVar1 * 4 - 0x20;
      uVar37 = (uVar42 >> 5) + 1;
      uVar38 = uVar37 & 0xffffffffffffffc;
      do {
        uVar2 = (uint)(byte)(*param_2)[0];
        if (param_7 != 1) {
          uVar2 = param_6 & 0xffff | (uint)(byte)(*param_2)[0] << 8;
        }
        uVar2 = uVar2 | param_7 * 0x1000000 + param_4 * 0x10000;
        uVar46 = CONCAT44(uVar2,uVar2);
        pauVar40 = param_1;
        if (uVar42 < 0x60) {
LAB_00bb934c:
          do {
            *(undefined8 *)*pauVar40 = uVar46;
            *(undefined8 *)(*pauVar40 + 8) = uVar46;
            *(undefined8 *)pauVar40[1] = uVar46;
            *(undefined8 *)(pauVar40[1] + 8) = uVar46;
            pauVar40 = pauVar40 + 2;
          } while (pauVar40 != (undefined1 (*) [16])(*param_1 + (ulong)uVar1 * 4));
        }
        else {
          pauVar40 = param_1 + uVar38 * 2;
          pauVar41 = param_1 + 4;
          uVar36 = uVar38;
          do {
            *(undefined8 *)(pauVar41[-4] + 8) = uVar46;
            *(undefined8 *)pauVar41[-4] = uVar46;
            *(undefined8 *)(pauVar41[-3] + 8) = uVar46;
            *(undefined8 *)pauVar41[-3] = uVar46;
            uVar36 = uVar36 - 4;
            *(undefined8 *)(pauVar41[-2] + 8) = uVar46;
            *(undefined8 *)pauVar41[-2] = uVar46;
            *(undefined8 *)(pauVar41[-1] + 8) = uVar46;
            *(undefined8 *)pauVar41[-1] = uVar46;
            *(undefined8 *)(*pauVar41 + 8) = uVar46;
            *(undefined8 *)*pauVar41 = uVar46;
            *(undefined8 *)(pauVar41[1] + 8) = uVar46;
            *(undefined8 *)pauVar41[1] = uVar46;
            *(undefined8 *)(pauVar41[2] + 8) = uVar46;
            *(undefined8 *)pauVar41[2] = uVar46;
            *(undefined8 *)(pauVar41[3] + 8) = uVar46;
            *(undefined8 *)pauVar41[3] = uVar46;
            pauVar41 = pauVar41 + 8;
          } while (uVar36 != 0);
          if (uVar37 != uVar38) goto LAB_00bb934c;
        }
        param_2 = (undefined1 (*) [16])(*param_2 + 1);
        param_1 = pauVar40;
        if (param_2 == param_3) {
          return;
        }
      } while( true );
    }
    if (param_2 == param_3) {
      return;
    }
    uVar37 = (long)param_3 - (long)param_2;
    uVar1 = param_7 * 0x1000000 + param_4 * 0x10000;
    if ((uVar37 < 4) ||
       ((param_1 < param_3 && (param_2 < (undefined1 (*) [16])((long)param_1 + uVar37 * 8))))) {
      pauVar40 = param_1;
      pauVar41 = param_2;
    }
    else {
      uVar42 = CONCAT44(param_6,param_6) & 0xffff0000ffff;
      uVar38 = CONCAT44(param_6,param_6) & 0xffff0000ffff;
      uVar57 = (undefined1)uVar42;
      bVar58 = (byte)(uVar42 >> 8);
      uVar59 = (undefined1)(uVar42 >> 0x20);
      bVar60 = (byte)(uVar42 >> 0x28);
      uVar61 = (undefined1)uVar38;
      bVar62 = (byte)(uVar38 >> 8);
      uVar63 = (undefined1)(uVar38 >> 0x20);
      bVar64 = (byte)(uVar38 >> 0x28);
      bVar65 = (byte)(uVar1 >> 0x10);
      bVar66 = (byte)(uVar1 >> 0x18);
      if (uVar37 < 0x10) {
        uVar38 = 0;
      }
      else {
        uVar38 = uVar37 & 0xfffffffffffffff0;
        auVar82._8_8_ = 0xffffff0bffffff0a;
        auVar82._0_8_ = 0xffffff09ffffff08;
        auVar87._8_8_ = 0xffffff0fffffff0e;
        auVar87._0_8_ = 0xffffff0dffffff0c;
        auVar74._0_4_ = -(uint)(param_7 == 1);
        auVar74._4_4_ = auVar74._0_4_;
        auVar74._8_4_ = auVar74._0_4_;
        auVar74._12_4_ = auVar74._0_4_;
        uVar42 = uVar38;
        pauVar40 = param_1;
        pauVar41 = param_2;
        do {
          auVar100 = *pauVar41;
          uVar42 = uVar42 - 0x10;
          auVar114 = a64_TBL(ZEXT816(0),auVar100,auVar82);
          auVar14[8] = 6;
          auVar14._0_8_ = 0xffffff05ffffff04;
          auVar14[9] = 0xff;
          auVar14[10] = 0xff;
          auVar14[0xb] = 0xff;
          auVar14[0xc] = 7;
          auVar14[0xd] = 0xff;
          auVar14[0xe] = 0xff;
          auVar14[0xf] = 0xff;
          auVar126 = a64_TBL(ZEXT816(0),auVar100,auVar14);
          auVar6._8_4_ = 0xffffff02;
          auVar6._0_8_ = 0xffffff01ffffff00;
          auVar6._12_4_ = 0xffffff03;
          auVar132 = a64_TBL(ZEXT816(0),auVar100,auVar6);
          auVar100 = a64_TBL(ZEXT816(0),auVar100,auVar87);
          auVar140[1] = auVar114[0] | bVar58;
          auVar140[0] = uVar57;
          auVar140[2] = auVar114[1];
          auVar140[3] = auVar114[2];
          auVar140[4] = uVar59;
          auVar140[5] = auVar114[4] | bVar60;
          auVar140[6] = auVar114[5];
          auVar140[7] = auVar114[6];
          auVar140[8] = uVar61;
          auVar140[9] = auVar114[8] | bVar62;
          auVar140[10] = auVar114[9];
          auVar140[0xb] = auVar114[10];
          auVar140[0xc] = uVar63;
          auVar140[0xd] = auVar114[0xc] | bVar64;
          auVar140[0xe] = auVar114[0xd];
          auVar140[0xf] = auVar114[0xe];
          auVar114 = auVar114 ^ (auVar114 ^ auVar140) & ~auVar74;
          auVar141[1] = auVar132[0] | bVar58;
          auVar141[0] = uVar57;
          auVar141[2] = auVar132[1];
          auVar141[3] = auVar132[2];
          auVar141[4] = uVar59;
          auVar141[5] = auVar132[4] | bVar60;
          auVar141[6] = auVar132[5];
          auVar141[7] = auVar132[6];
          auVar141[8] = uVar61;
          auVar141[9] = auVar132[8] | bVar62;
          auVar141[10] = auVar132[9];
          auVar141[0xb] = auVar132[10];
          auVar141[0xc] = uVar63;
          auVar141[0xd] = auVar132[0xc] | bVar64;
          auVar141[0xe] = auVar132[0xd];
          auVar141[0xf] = auVar132[0xe];
          auVar22[1] = auVar126[0] | bVar58;
          auVar22[0] = uVar57;
          auVar22[2] = auVar126[1];
          auVar22[3] = auVar126[2];
          auVar22[4] = uVar59;
          auVar22[5] = auVar126[4] | bVar60;
          auVar22[6] = auVar126[5];
          auVar22[7] = auVar126[6];
          auVar22[8] = uVar61;
          auVar22[9] = auVar126[8] | bVar62;
          auVar22[10] = auVar126[9];
          auVar22[0xb] = auVar126[10];
          auVar22[0xc] = uVar63;
          auVar22[0xd] = auVar126[0xc] | bVar64;
          auVar22[0xe] = auVar126[0xd];
          auVar22[0xf] = auVar126[0xe];
          auVar126 = auVar126 ^ (auVar126 ^ auVar22) & ~auVar74;
          auVar132 = auVar132 ^ (auVar132 ^ auVar141) & ~auVar74;
          auVar23[1] = auVar100[0] | bVar58;
          auVar23[0] = uVar57;
          auVar23[2] = auVar100[1];
          auVar23[3] = auVar100[2];
          auVar23[4] = uVar59;
          auVar23[5] = auVar100[4] | bVar60;
          auVar23[6] = auVar100[5];
          auVar23[7] = auVar100[6];
          auVar23[8] = uVar61;
          auVar23[9] = auVar100[8] | bVar62;
          auVar23[10] = auVar100[9];
          auVar23[0xb] = auVar100[10];
          auVar23[0xc] = uVar63;
          auVar23[0xd] = auVar100[0xc] | bVar64;
          auVar23[0xe] = auVar100[0xd];
          auVar23[0xf] = auVar100[0xe];
          auVar100 = auVar100 ^ (auVar100 ^ auVar23) & ~auVar74;
          auVar142._0_8_ =
               CONCAT17(auVar114[0xb] | bVar66,
                        CONCAT16(auVar114[10] | bVar65,
                                 CONCAT15(auVar114[9],
                                          CONCAT14(auVar114[8],
                                                   CONCAT13(auVar114[0xb] | bVar66,
                                                            CONCAT12(auVar114[10] | bVar65,
                                                                     auVar114._8_2_))))));
          auVar142[8] = auVar114[0xc];
          auVar142[9] = auVar114[0xd];
          auVar142[10] = auVar114[0xe] | bVar65;
          auVar142[0xb] = auVar114[0xf] | bVar66;
          auVar142[0xc] = auVar142[8];
          auVar142[0xd] = auVar142[9];
          auVar142[0xe] = auVar114[0xe] | bVar65;
          auVar142[0xf] = auVar114[0xf] | bVar66;
          auVar115._0_8_ =
               CONCAT17(auVar114[3] | bVar66,
                        CONCAT16(auVar114[2] | bVar65,
                                 CONCAT15(auVar114[1],
                                          CONCAT14(auVar114[0],
                                                   CONCAT13(auVar114[3] | bVar66,
                                                            CONCAT12(auVar114[2] | bVar65,
                                                                     auVar114._0_2_))))));
          auVar115[8] = auVar114[4];
          auVar115[9] = auVar114[5];
          auVar115[10] = auVar114[6] | bVar65;
          auVar115[0xb] = auVar114[7] | bVar66;
          auVar115[0xc] = auVar115[8];
          auVar115[0xd] = auVar115[9];
          auVar115[0xe] = auVar114[6] | bVar65;
          auVar115[0xf] = auVar114[7] | bVar66;
          *(long *)(pauVar40[4] + 8) = auVar115._8_8_;
          *(undefined8 *)pauVar40[4] = auVar115._0_8_;
          *(long *)(pauVar40[5] + 8) = auVar142._8_8_;
          *(undefined8 *)pauVar40[5] = auVar142._0_8_;
          pauVar40[2][8] = auVar126[4];
          pauVar40[2][9] = auVar126[5];
          pauVar40[2][10] = auVar126[6] | bVar65;
          pauVar40[2][0xb] = auVar126[7] | bVar66;
          pauVar40[2][0xc] = auVar126[4];
          pauVar40[2][0xd] = auVar126[5];
          pauVar40[2][0xe] = auVar126[6] | bVar65;
          pauVar40[2][0xf] = auVar126[7] | bVar66;
          pauVar40[2][0] = auVar126[0];
          pauVar40[2][1] = auVar126[1];
          pauVar40[2][2] = auVar126[2] | bVar65;
          pauVar40[2][3] = auVar126[3] | bVar66;
          pauVar40[2][4] = auVar126[0];
          pauVar40[2][5] = auVar126[1];
          pauVar40[2][6] = auVar126[2] | bVar65;
          pauVar40[2][7] = auVar126[3] | bVar66;
          *(ulong *)(pauVar40[3] + 8) =
               CONCAT17(auVar126[0xf] | bVar66,
                        CONCAT16(auVar126[0xe] | bVar65,
                                 CONCAT15(auVar126[0xd],
                                          CONCAT14(auVar126[0xc],
                                                   CONCAT13(auVar126[0xf] | bVar66,
                                                            CONCAT12(auVar126[0xe] | bVar65,
                                                                     auVar126._12_2_))))));
          *(ulong *)pauVar40[3] =
               CONCAT17(auVar126[0xb] | bVar66,
                        CONCAT16(auVar126[10] | bVar65,
                                 CONCAT15(auVar126[9],
                                          CONCAT14(auVar126[8],
                                                   CONCAT13(auVar126[0xb] | bVar66,
                                                            CONCAT12(auVar126[10] | bVar65,
                                                                     auVar126._8_2_))))));
          (*pauVar40)[8] = auVar132[4];
          (*pauVar40)[9] = auVar132[5];
          (*pauVar40)[10] = auVar132[6] | bVar65;
          (*pauVar40)[0xb] = auVar132[7] | bVar66;
          (*pauVar40)[0xc] = auVar132[4];
          (*pauVar40)[0xd] = auVar132[5];
          (*pauVar40)[0xe] = auVar132[6] | bVar65;
          (*pauVar40)[0xf] = auVar132[7] | bVar66;
          (*pauVar40)[0] = auVar132[0];
          (*pauVar40)[1] = auVar132[1];
          (*pauVar40)[2] = auVar132[2] | bVar65;
          (*pauVar40)[3] = auVar132[3] | bVar66;
          (*pauVar40)[4] = auVar132[0];
          (*pauVar40)[5] = auVar132[1];
          (*pauVar40)[6] = auVar132[2] | bVar65;
          (*pauVar40)[7] = auVar132[3] | bVar66;
          pauVar40[1][8] = auVar132[0xc];
          pauVar40[1][9] = auVar132[0xd];
          pauVar40[1][10] = auVar132[0xe] | bVar65;
          pauVar40[1][0xb] = auVar132[0xf] | bVar66;
          pauVar40[1][0xc] = auVar132[0xc];
          pauVar40[1][0xd] = auVar132[0xd];
          pauVar40[1][0xe] = auVar132[0xe] | bVar65;
          pauVar40[1][0xf] = auVar132[0xf] | bVar66;
          pauVar40[1][0] = auVar132[8];
          pauVar40[1][1] = auVar132[9];
          pauVar40[1][2] = auVar132[10] | bVar65;
          pauVar40[1][3] = auVar132[0xb] | bVar66;
          pauVar40[1][4] = auVar132[8];
          pauVar40[1][5] = auVar132[9];
          pauVar40[1][6] = auVar132[10] | bVar65;
          pauVar40[1][7] = auVar132[0xb] | bVar66;
          pauVar40[6][8] = auVar100[4];
          pauVar40[6][9] = auVar100[5];
          pauVar40[6][10] = auVar100[6] | bVar65;
          pauVar40[6][0xb] = auVar100[7] | bVar66;
          pauVar40[6][0xc] = auVar100[4];
          pauVar40[6][0xd] = auVar100[5];
          pauVar40[6][0xe] = auVar100[6] | bVar65;
          pauVar40[6][0xf] = auVar100[7] | bVar66;
          pauVar40[6][0] = auVar100[0];
          pauVar40[6][1] = auVar100[1];
          pauVar40[6][2] = auVar100[2] | bVar65;
          pauVar40[6][3] = auVar100[3] | bVar66;
          pauVar40[6][4] = auVar100[0];
          pauVar40[6][5] = auVar100[1];
          pauVar40[6][6] = auVar100[2] | bVar65;
          pauVar40[6][7] = auVar100[3] | bVar66;
          pauVar40[7][8] = auVar100[0xc];
          pauVar40[7][9] = auVar100[0xd];
          pauVar40[7][10] = auVar100[0xe] | bVar65;
          pauVar40[7][0xb] = auVar100[0xf] | bVar66;
          pauVar40[7][0xc] = auVar100[0xc];
          pauVar40[7][0xd] = auVar100[0xd];
          pauVar40[7][0xe] = auVar100[0xe] | bVar65;
          pauVar40[7][0xf] = auVar100[0xf] | bVar66;
          pauVar40[7][0] = auVar100[8];
          pauVar40[7][1] = auVar100[9];
          pauVar40[7][2] = auVar100[10] | bVar65;
          pauVar40[7][3] = auVar100[0xb] | bVar66;
          pauVar40[7][4] = auVar100[8];
          pauVar40[7][5] = auVar100[9];
          pauVar40[7][6] = auVar100[10] | bVar65;
          pauVar40[7][7] = auVar100[0xb] | bVar66;
          pauVar40 = pauVar40 + 8;
          pauVar41 = pauVar41 + 1;
        } while (uVar42 != 0);
        if (uVar37 == uVar38) {
          return;
        }
        if ((uVar37 & 0xc) == 0) {
          pauVar40 = (undefined1 (*) [16])(*param_1 + uVar38 * 8);
          pauVar41 = (undefined1 (*) [16])(*param_2 + uVar38);
          goto LAB_00bb9214;
        }
      }
      uVar42 = uVar37 & 0xfffffffffffffffc;
      pauVar40 = (undefined1 (*) [16])(*param_1 + uVar42 * 8);
      pauVar41 = (undefined1 (*) [16])(*param_2 + uVar42);
      lVar39 = uVar38 - uVar42;
      iVar67 = -(uint)(param_7 == 1);
      puVar44 = *param_1 + uVar38 * 8;
      puVar45 = (undefined4 *)(*param_2 + uVar38);
      do {
        uVar69 = *puVar45;
        lVar39 = lVar39 + 4;
        bVar103 = (byte)((uint)uVar69 >> 8);
        bVar104 = (byte)((uint)uVar69 >> 0x10);
        bVar105 = (byte)((uint)uVar69 >> 0x18);
        auVar32._6_2_ = 0;
        auVar32._0_6_ =
             (uint6)CONCAT14(bVar103,(uint)CONCAT12(bVar103,(ushort)(byte)uVar69)) & 0xffff0000ffff;
        auVar32[8] = bVar104;
        auVar32._9_3_ = 0;
        auVar32[0xc] = bVar105;
        auVar32[0xd] = 0;
        auVar75._14_2_ = 0;
        auVar75._0_14_ = auVar32;
        auVar13[1] = (byte)uVar69 | bVar58;
        auVar13[0] = uVar57;
        auVar13._2_2_ = 0;
        auVar13[4] = uVar59;
        auVar13[5] = bVar103 | bVar60;
        auVar13._6_2_ = 0;
        auVar13[8] = uVar61;
        auVar13[9] = bVar104 | bVar62;
        auVar13._10_2_ = 0;
        auVar13[0xc] = uVar63;
        auVar13[0xd] = bVar105 | bVar64;
        auVar3._14_2_ = 0;
        auVar3._0_14_ = auVar32 ^ auVar13;
        auVar5._4_4_ = iVar67;
        auVar5._0_4_ = iVar67;
        auVar5._8_4_ = iVar67;
        auVar5._12_4_ = iVar67;
        auVar75 = auVar75 ^ auVar3 & ~auVar5;
        puVar44[8] = auVar75[4];
        puVar44[9] = auVar75[5];
        puVar44[10] = bVar65;
        puVar44[0xb] = bVar66;
        puVar44[0xc] = auVar75[4];
        puVar44[0xd] = auVar75[5];
        puVar44[0xe] = bVar65;
        puVar44[0xf] = bVar66;
        *puVar44 = auVar75[0];
        puVar44[1] = auVar75[1];
        puVar44[2] = bVar65;
        puVar44[3] = bVar66;
        puVar44[4] = auVar75[0];
        puVar44[5] = auVar75[1];
        puVar44[6] = bVar65;
        puVar44[7] = bVar66;
        *(ulong *)(puVar44 + 0x18) =
             CONCAT17(auVar75[0xf] | bVar66,
                      CONCAT16(auVar75[0xe] | bVar65,
                               CONCAT15(auVar75[0xd],
                                        CONCAT14(auVar75[0xc],
                                                 CONCAT13(auVar75[0xf] | bVar66,
                                                          CONCAT12(auVar75[0xe] | bVar65,
                                                                   auVar75._12_2_))))));
        *(ulong *)(puVar44 + 0x10) =
             CONCAT17(auVar75[0xb] | bVar66,
                      CONCAT16(auVar75[10] | bVar65,
                               CONCAT15(auVar75[9],
                                        CONCAT14(auVar75[8],
                                                 CONCAT13(auVar75[0xb] | bVar66,
                                                          CONCAT12(auVar75[10] | bVar65,
                                                                   auVar75._8_2_))))));
        puVar44 = puVar44 + 0x20;
        puVar45 = puVar45 + 1;
      } while (lVar39 != 0);
      if (uVar37 == uVar42) {
        return;
      }
    }
LAB_00bb9214:
    do {
      puVar44 = *pauVar41;
      uVar2 = (uint)(byte)(*pauVar41)[0];
      if (param_7 != 1) {
        uVar2 = param_6 & 0xffff | (uint)(byte)(*pauVar41)[0] << 8;
      }
      *(uint *)*pauVar40 = uVar2 | uVar1;
      *(uint *)(*pauVar40 + 4) = uVar2 | uVar1;
      pauVar40 = (undefined1 (*) [16])(*pauVar40 + 8);
      pauVar41 = (undefined1 (*) [16])(puVar44 + 1);
    } while ((undefined1 (*) [16])(puVar44 + 1) != param_3);
    return;
  }
  if (param_2 == param_3) {
    return;
  }
  uVar37 = (long)param_3 - (long)param_2;
  uVar1 = param_7 * 0x1000000 + param_4 * 0x10000;
  if ((uVar37 < 4) ||
     ((param_1 < param_3 && (param_2 < (undefined1 (*) [16])((long)param_1 + uVar37 * 4))))) {
    pauVar40 = param_1;
    pauVar41 = param_2;
  }
  else {
    uVar42 = CONCAT44(param_6,param_6) & 0xffff0000ffff;
    uVar38 = CONCAT44(param_6,param_6) & 0xffff0000ffff;
    uVar57 = (undefined1)uVar42;
    bVar58 = (byte)(uVar42 >> 8);
    uVar59 = (undefined1)(uVar42 >> 0x20);
    bVar60 = (byte)(uVar42 >> 0x28);
    uVar61 = (undefined1)uVar38;
    bVar62 = (byte)(uVar38 >> 8);
    uVar63 = (undefined1)(uVar38 >> 0x20);
    bVar64 = (byte)(uVar38 >> 0x28);
    bVar65 = (byte)(uVar1 >> 0x10);
    bVar66 = (byte)(uVar1 >> 0x18);
    if (uVar37 < 0x10) {
      uVar38 = 0;
    }
    else {
      uVar38 = uVar37 & 0xfffffffffffffff0;
      auVar83._8_8_ = 0xffffff07ffffff06;
      auVar83._0_8_ = 0xffffff05ffffff04;
      auVar88._8_8_ = 0xffffff03ffffff02;
      auVar88._0_8_ = 0xffffff01ffffff00;
      auVar78._0_4_ = -(uint)(param_7 == 1);
      auVar78._4_4_ = auVar78._0_4_;
      auVar78._8_4_ = auVar78._0_4_;
      auVar78._12_4_ = auVar78._0_4_;
      uVar42 = uVar38;
      pauVar40 = param_1;
      pauVar41 = param_2;
      do {
        auVar100 = *pauVar41;
        uVar42 = uVar42 - 0x10;
        auVar8._8_4_ = 0xffffff0e;
        auVar8._0_8_ = 0xffffff0dffffff0c;
        auVar8._12_4_ = 0xffffff0f;
        auVar114 = a64_TBL(ZEXT816(0),auVar100,auVar8);
        auVar16[8] = 10;
        auVar16._0_8_ = 0xffffff09ffffff08;
        auVar16[9] = 0xff;
        auVar16[10] = 0xff;
        auVar16[0xb] = 0xff;
        auVar16[0xc] = 0xb;
        auVar16[0xd] = 0xff;
        auVar16[0xe] = 0xff;
        auVar16[0xf] = 0xff;
        auVar126 = a64_TBL(ZEXT816(0),auVar100,auVar16);
        auVar132 = a64_TBL(ZEXT816(0),auVar100,auVar83);
        auVar100 = a64_TBL(ZEXT816(0),auVar100,auVar88);
        auVar146[1] = auVar114[0] | bVar58;
        auVar146[0] = uVar57;
        auVar146[2] = auVar114[1];
        auVar146[3] = auVar114[2];
        auVar146[4] = uVar59;
        auVar146[5] = auVar114[4] | bVar60;
        auVar146[6] = auVar114[5];
        auVar146[7] = auVar114[6];
        auVar146[8] = uVar61;
        auVar146[9] = auVar114[8] | bVar62;
        auVar146[10] = auVar114[9];
        auVar146[0xb] = auVar114[10];
        auVar146[0xc] = uVar63;
        auVar146[0xd] = auVar114[0xc] | bVar64;
        auVar146[0xe] = auVar114[0xd];
        auVar146[0xf] = auVar114[0xe];
        auVar114 = auVar114 ^ (auVar114 ^ auVar146) & ~auVar78;
        auVar147[1] = auVar100[0] | bVar58;
        auVar147[0] = uVar57;
        auVar147[2] = auVar100[1];
        auVar147[3] = auVar100[2];
        auVar147[4] = uVar59;
        auVar147[5] = auVar100[4] | bVar60;
        auVar147[6] = auVar100[5];
        auVar147[7] = auVar100[6];
        auVar147[8] = uVar61;
        auVar147[9] = auVar100[8] | bVar62;
        auVar147[10] = auVar100[9];
        auVar147[0xb] = auVar100[10];
        auVar147[0xc] = uVar63;
        auVar147[0xd] = auVar100[0xc] | bVar64;
        auVar147[0xe] = auVar100[0xd];
        auVar147[0xf] = auVar100[0xe];
        auVar24[1] = auVar126[0] | bVar58;
        auVar24[0] = uVar57;
        auVar24[2] = auVar126[1];
        auVar24[3] = auVar126[2];
        auVar24[4] = uVar59;
        auVar24[5] = auVar126[4] | bVar60;
        auVar24[6] = auVar126[5];
        auVar24[7] = auVar126[6];
        auVar24[8] = uVar61;
        auVar24[9] = auVar126[8] | bVar62;
        auVar24[10] = auVar126[9];
        auVar24[0xb] = auVar126[10];
        auVar24[0xc] = uVar63;
        auVar24[0xd] = auVar126[0xc] | bVar64;
        auVar24[0xe] = auVar126[0xd];
        auVar24[0xf] = auVar126[0xe];
        auVar126 = auVar126 ^ (auVar126 ^ auVar24) & ~auVar78;
        auVar27[1] = auVar132[0] | bVar58;
        auVar27[0] = uVar57;
        auVar27[2] = auVar132[1];
        auVar27[3] = auVar132[2];
        auVar27[4] = uVar59;
        auVar27[5] = auVar132[4] | bVar60;
        auVar27[6] = auVar132[5];
        auVar27[7] = auVar132[6];
        auVar27[8] = uVar61;
        auVar27[9] = auVar132[8] | bVar62;
        auVar27[10] = auVar132[9];
        auVar27[0xb] = auVar132[10];
        auVar27[0xc] = uVar63;
        auVar27[0xd] = auVar132[0xc] | bVar64;
        auVar27[0xe] = auVar132[0xd];
        auVar27[0xf] = auVar132[0xe];
        auVar132 = auVar132 ^ (auVar132 ^ auVar27) & ~auVar78;
        auVar100 = auVar100 ^ (auVar100 ^ auVar147) & ~auVar78;
        auVar117._0_8_ =
             CONCAT17(auVar114[7] | bVar66,
                      CONCAT16(auVar114[6] | bVar65,
                               CONCAT15(auVar114[5],
                                        CONCAT14(auVar114[4],
                                                 CONCAT13(auVar114[3] | bVar66,
                                                          CONCAT12(auVar114[2] | bVar65,
                                                                   auVar114._0_2_))))));
        auVar117[8] = auVar114[8];
        auVar117[9] = auVar114[9];
        auVar117[10] = auVar114[10] | bVar65;
        auVar117[0xb] = auVar114[0xb] | bVar66;
        auVar117[0xc] = auVar114[0xc];
        auVar117[0xd] = auVar114[0xd];
        auVar117[0xe] = auVar114[0xe] | bVar65;
        auVar117[0xf] = auVar114[0xf] | bVar66;
        pauVar40[2][8] = auVar126[8];
        pauVar40[2][9] = auVar126[9];
        pauVar40[2][10] = auVar126[10] | bVar65;
        pauVar40[2][0xb] = auVar126[0xb] | bVar66;
        pauVar40[2][0xc] = auVar126[0xc];
        pauVar40[2][0xd] = auVar126[0xd];
        pauVar40[2][0xe] = auVar126[0xe] | bVar65;
        pauVar40[2][0xf] = auVar126[0xf] | bVar66;
        pauVar40[2][0] = auVar126[0];
        pauVar40[2][1] = auVar126[1];
        pauVar40[2][2] = auVar126[2] | bVar65;
        pauVar40[2][3] = auVar126[3] | bVar66;
        pauVar40[2][4] = auVar126[4];
        pauVar40[2][5] = auVar126[5];
        pauVar40[2][6] = auVar126[6] | bVar65;
        pauVar40[2][7] = auVar126[7] | bVar66;
        *(long *)(pauVar40[3] + 8) = auVar117._8_8_;
        *(undefined8 *)pauVar40[3] = auVar117._0_8_;
        (*pauVar40)[8] = auVar100[8];
        (*pauVar40)[9] = auVar100[9];
        (*pauVar40)[10] = auVar100[10] | bVar65;
        (*pauVar40)[0xb] = auVar100[0xb] | bVar66;
        (*pauVar40)[0xc] = auVar100[0xc];
        (*pauVar40)[0xd] = auVar100[0xd];
        (*pauVar40)[0xe] = auVar100[0xe] | bVar65;
        (*pauVar40)[0xf] = auVar100[0xf] | bVar66;
        (*pauVar40)[0] = auVar100[0];
        (*pauVar40)[1] = auVar100[1];
        (*pauVar40)[2] = auVar100[2] | bVar65;
        (*pauVar40)[3] = auVar100[3] | bVar66;
        (*pauVar40)[4] = auVar100[4];
        (*pauVar40)[5] = auVar100[5];
        (*pauVar40)[6] = auVar100[6] | bVar65;
        (*pauVar40)[7] = auVar100[7] | bVar66;
        pauVar40[1][8] = auVar132[8];
        pauVar40[1][9] = auVar132[9];
        pauVar40[1][10] = auVar132[10] | bVar65;
        pauVar40[1][0xb] = auVar132[0xb] | bVar66;
        pauVar40[1][0xc] = auVar132[0xc];
        pauVar40[1][0xd] = auVar132[0xd];
        pauVar40[1][0xe] = auVar132[0xe] | bVar65;
        pauVar40[1][0xf] = auVar132[0xf] | bVar66;
        pauVar40[1][0] = auVar132[0];
        pauVar40[1][1] = auVar132[1];
        pauVar40[1][2] = auVar132[2] | bVar65;
        pauVar40[1][3] = auVar132[3] | bVar66;
        pauVar40[1][4] = auVar132[4];
        pauVar40[1][5] = auVar132[5];
        pauVar40[1][6] = auVar132[6] | bVar65;
        pauVar40[1][7] = auVar132[7] | bVar66;
        pauVar40 = pauVar40 + 4;
        pauVar41 = pauVar41 + 1;
      } while (uVar42 != 0);
      if (uVar37 == uVar38) {
        return;
      }
      if ((uVar37 & 0xc) == 0) {
        pauVar40 = (undefined1 (*) [16])(*param_1 + uVar38 * 4);
        pauVar41 = (undefined1 (*) [16])(*param_2 + uVar38);
        goto LAB_00bb93a4;
      }
    }
    uVar42 = uVar37 & 0xfffffffffffffffc;
    pauVar40 = (undefined1 (*) [16])(*param_1 + uVar42 * 4);
    pauVar41 = (undefined1 (*) [16])(*param_2 + uVar42);
    lVar39 = uVar38 - uVar42;
    iVar67 = -(uint)(param_7 == 1);
    puVar44 = *param_1 + uVar38 * 4;
    puVar45 = (undefined4 *)(*param_2 + uVar38);
    do {
      uVar69 = *puVar45;
      lVar39 = lVar39 + 4;
      bVar103 = (byte)((uint)uVar69 >> 8);
      bVar104 = (byte)((uint)uVar69 >> 0x10);
      bVar105 = (byte)((uint)uVar69 >> 0x18);
      auVar34._6_2_ = 0;
      auVar34._0_6_ =
           (uint6)CONCAT14(bVar103,(uint)CONCAT12(bVar103,(ushort)(byte)uVar69)) & 0xffff0000ffff;
      auVar34[8] = bVar104;
      auVar34._9_3_ = 0;
      auVar34[0xc] = bVar105;
      auVar34[0xd] = 0;
      auVar79._14_2_ = 0;
      auVar79._0_14_ = auVar34;
      auVar15[1] = (byte)uVar69 | bVar58;
      auVar15[0] = uVar57;
      auVar15._2_2_ = 0;
      auVar15[4] = uVar59;
      auVar15[5] = bVar103 | bVar60;
      auVar15._6_2_ = 0;
      auVar15[8] = uVar61;
      auVar15[9] = bVar104 | bVar62;
      auVar15._10_2_ = 0;
      auVar15[0xc] = uVar63;
      auVar15[0xd] = bVar105 | bVar64;
      auVar4._14_2_ = 0;
      auVar4._0_14_ = auVar34 ^ auVar15;
      auVar7._4_4_ = iVar67;
      auVar7._0_4_ = iVar67;
      auVar7._8_4_ = iVar67;
      auVar7._12_4_ = iVar67;
      auVar79 = auVar79 ^ auVar4 & ~auVar7;
      puVar44[8] = auVar79[8];
      puVar44[9] = auVar79[9];
      puVar44[10] = auVar79[10] | bVar65;
      puVar44[0xb] = auVar79[0xb] | bVar66;
      puVar44[0xc] = auVar79[0xc];
      puVar44[0xd] = auVar79[0xd];
      puVar44[0xe] = auVar79[0xe] | bVar65;
      puVar44[0xf] = auVar79[0xf] | bVar66;
      *puVar44 = auVar79[0];
      puVar44[1] = auVar79[1];
      puVar44[2] = bVar65;
      puVar44[3] = bVar66;
      puVar44[4] = auVar79[4];
      puVar44[5] = auVar79[5];
      puVar44[6] = bVar65;
      puVar44[7] = bVar66;
      puVar44 = puVar44 + 0x10;
      puVar45 = puVar45 + 1;
    } while (lVar39 != 0);
    if (uVar37 == uVar42) {
      return;
    }
  }
LAB_00bb93a4:
  do {
    puVar44 = *pauVar41;
    uVar2 = (uint)(byte)(*pauVar41)[0];
    if (param_7 != 1) {
      uVar2 = param_6 & 0xffff | (uint)(byte)(*pauVar41)[0] << 8;
    }
    *(uint *)*pauVar40 = uVar2 | uVar1;
    pauVar40 = (undefined1 (*) [16])(*pauVar40 + 4);
    pauVar41 = (undefined1 (*) [16])(puVar44 + 1);
  } while ((undefined1 (*) [16])(puVar44 + 1) != param_3);
  return;
}

