
undefined8
FUN_002af84c(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined1 param_4 [16],
            undefined1 param_5 [16],undefined1 param_6 [16],undefined1 param_7 [16],
            undefined8 param_8,undefined8 param_9,long *param_10,long param_11)

{
  uint uVar1;
  char cVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  int iVar7;
  int iVar8;
  int iVar9;
  uint uVar10;
  undefined8 *puVar11;
  char *pcVar12;
  long *plVar13;
  undefined8 uVar14;
  uint uVar15;
  undefined8 uVar16;
  long lVar17;
  ulong *puVar18;
  ulong *in_x9;
  ulong in_x10;
  ulong *puVar19;
  ulong *in_x11;
  ulong uVar20;
  long lVar21;
  ulong uVar22;
  ulong uVar23;
  ulong in_x12;
  ulong uVar24;
  ulong in_x13;
  ulong in_x14;
  long unaff_x19;
  undefined4 *unaff_x20;
  uint uVar25;
  long unaff_x21;
  char *unaff_x22;
  int unaff_w23;
  undefined8 *unaff_x25;
  uint unaff_w26;
  uint uVar26;
  undefined4 uVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  undefined8 uVar64;
  byte bVar71;
  byte bVar72;
  byte bVar74;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  undefined8 uVar73;
  byte bVar80;
  ulong uVar81;
  ulong uVar82;
  ulong uVar83;
  ulong uVar84;
  ulong uVar85;
  ulong uVar86;
  ulong uVar87;
  ulong uVar88;
  undefined1 auVar89 [12];
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long *in_stack_00000028;
  undefined8 *in_stack_00000030;
  long *in_stack_00000038;
  long *in_stack_00000040;
  undefined8 uStack0000000000000048;
  
  uVar24 = param_7._8_8_;
  uVar23 = param_7._0_8_;
  uVar22 = param_6._8_8_;
  uVar20 = param_6._0_8_;
  uVar73 = param_5._8_8_;
  uVar64 = param_5._0_8_;
  uVar16 = param_4._8_8_;
  uVar14 = param_4._0_8_;
  bVar43 = param_2[0xf];
  bVar42 = param_2[0xe];
  bVar41 = param_2[0xd];
  bVar40 = param_2[0xc];
  bVar39 = param_2[0xb];
  bVar38 = param_2[10];
  bVar37 = param_2[9];
  bVar36 = param_2[8];
  bVar35 = param_2[7];
  bVar34 = param_2[6];
  bVar33 = param_2[5];
  bVar32 = param_2[4];
  bVar31 = param_2[3];
  bVar30 = param_2[2];
  bVar29 = param_2[1];
  bVar28 = param_2[0];
  uVar25 = (uint)unaff_x21;
code_r0x002af84c:
  puVar18 = in_x11 + 8;
  uVar82 = in_x11[1];
  uVar81 = *in_x11;
  uVar84 = in_x11[3];
  uVar83 = in_x11[2];
  auVar46[0] = (byte)uVar20 | param_3[0];
  auVar46[1] = (byte)(uVar20 >> 8) | param_3[1];
  auVar46[2] = (byte)(uVar20 >> 0x10) | param_3[2];
  auVar46[3] = (byte)(uVar20 >> 0x18) | param_3[3];
  auVar46[4] = (byte)(uVar20 >> 0x20) | param_3[4];
  auVar46[5] = (byte)(uVar20 >> 0x28) | param_3[5];
  auVar46[6] = (byte)(uVar20 >> 0x30) | param_3[6];
  auVar46[7] = (byte)(uVar20 >> 0x38) | param_3[7];
  auVar46[8] = (byte)uVar22 | param_3[8];
  auVar46[9] = (byte)(uVar22 >> 8) | param_3[9];
  auVar46[10] = (byte)(uVar22 >> 0x10) | param_3[10];
  auVar46[0xb] = (byte)(uVar22 >> 0x18) | param_3[0xb];
  auVar46[0xc] = (byte)(uVar22 >> 0x20) | param_3[0xc];
  auVar46[0xd] = (byte)(uVar22 >> 0x28) | param_3[0xd];
  auVar46[0xe] = (byte)(uVar22 >> 0x30) | param_3[0xe];
  auVar46[0xf] = (byte)(uVar22 >> 0x38) | param_3[0xf];
  bVar28 = (byte)uVar23 | bVar28;
  bVar29 = (byte)(uVar23 >> 8) | bVar29;
  bVar30 = (byte)(uVar23 >> 0x10) | bVar30;
  bVar31 = (byte)(uVar23 >> 0x18) | bVar31;
  bVar32 = (byte)(uVar23 >> 0x20) | bVar32;
  bVar33 = (byte)(uVar23 >> 0x28) | bVar33;
  bVar34 = (byte)(uVar23 >> 0x30) | bVar34;
  bVar35 = (byte)(uVar23 >> 0x38) | bVar35;
  bVar36 = (byte)uVar24 | bVar36;
  bVar37 = (byte)(uVar24 >> 8) | bVar37;
  bVar38 = (byte)(uVar24 >> 0x10) | bVar38;
  bVar39 = (byte)(uVar24 >> 0x18) | bVar39;
  bVar40 = (byte)(uVar24 >> 0x20) | bVar40;
  bVar41 = (byte)(uVar24 >> 0x28) | bVar41;
  bVar42 = (byte)(uVar24 >> 0x30) | bVar42;
  bVar43 = (byte)(uVar24 >> 0x38) | bVar43;
  bVar47 = (byte)uVar81 | (byte)uVar14;
  bVar48 = (byte)(uVar81 >> 8) | (byte)((ulong)uVar14 >> 8);
  bVar49 = (byte)(uVar81 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
  bVar50 = (byte)(uVar81 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
  bVar51 = (byte)(uVar81 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
  bVar52 = (byte)(uVar81 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
  bVar53 = (byte)(uVar81 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
  bVar54 = (byte)(uVar81 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
  uVar14 = CONCAT17(bVar54,CONCAT16(bVar53,CONCAT15(bVar52,CONCAT14(bVar51,CONCAT13(bVar50,CONCAT12(
                                                  bVar49,CONCAT11(bVar48,bVar47)))))));
  bVar55 = (byte)uVar82 | (byte)uVar16;
  bVar56 = (byte)(uVar82 >> 8) | (byte)((ulong)uVar16 >> 8);
  bVar57 = (byte)(uVar82 >> 0x10) | (byte)((ulong)uVar16 >> 0x10);
  bVar58 = (byte)(uVar82 >> 0x18) | (byte)((ulong)uVar16 >> 0x18);
  bVar59 = (byte)(uVar82 >> 0x20) | (byte)((ulong)uVar16 >> 0x20);
  bVar60 = (byte)(uVar82 >> 0x28) | (byte)((ulong)uVar16 >> 0x28);
  bVar61 = (byte)(uVar82 >> 0x30) | (byte)((ulong)uVar16 >> 0x30);
  bVar62 = (byte)(uVar82 >> 0x38) | (byte)((ulong)uVar16 >> 0x38);
  uVar16 = CONCAT17(bVar62,CONCAT16(bVar61,CONCAT15(bVar60,CONCAT14(bVar59,CONCAT13(bVar58,CONCAT12(
                                                  bVar57,CONCAT11(bVar56,bVar55)))))));
  bVar63 = (byte)uVar83 | (byte)uVar64;
  bVar65 = (byte)(uVar83 >> 8) | (byte)((ulong)uVar64 >> 8);
  bVar66 = (byte)(uVar83 >> 0x10) | (byte)((ulong)uVar64 >> 0x10);
  bVar67 = (byte)(uVar83 >> 0x18) | (byte)((ulong)uVar64 >> 0x18);
  bVar68 = (byte)(uVar83 >> 0x20) | (byte)((ulong)uVar64 >> 0x20);
  bVar69 = (byte)(uVar83 >> 0x28) | (byte)((ulong)uVar64 >> 0x28);
  bVar70 = (byte)(uVar83 >> 0x30) | (byte)((ulong)uVar64 >> 0x30);
  bVar71 = (byte)(uVar83 >> 0x38) | (byte)((ulong)uVar64 >> 0x38);
  uVar64 = CONCAT17(bVar71,CONCAT16(bVar70,CONCAT15(bVar69,CONCAT14(bVar68,CONCAT13(bVar67,CONCAT12(
                                                  bVar66,CONCAT11(bVar65,bVar63)))))));
  bVar72 = (byte)uVar84 | (byte)uVar73;
  bVar74 = (byte)(uVar84 >> 8) | (byte)((ulong)uVar73 >> 8);
  bVar75 = (byte)(uVar84 >> 0x10) | (byte)((ulong)uVar73 >> 0x10);
  bVar76 = (byte)(uVar84 >> 0x18) | (byte)((ulong)uVar73 >> 0x18);
  bVar77 = (byte)(uVar84 >> 0x20) | (byte)((ulong)uVar73 >> 0x20);
  bVar78 = (byte)(uVar84 >> 0x28) | (byte)((ulong)uVar73 >> 0x28);
  bVar79 = (byte)(uVar84 >> 0x30) | (byte)((ulong)uVar73 >> 0x30);
  bVar80 = (byte)(uVar84 >> 0x38) | (byte)((ulong)uVar73 >> 0x38);
  uVar73 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,CONCAT13(bVar76,CONCAT12(
                                                  bVar75,CONCAT11(bVar74,bVar72)))))));
  in_x14 = in_x14 - 8;
  if (in_x14 == 0) {
    bVar63 = bVar63 | bVar47 | bVar28 | auVar46[0];
    bVar65 = bVar65 | bVar48 | bVar29 | auVar46[1];
    bVar66 = bVar66 | bVar49 | bVar30 | auVar46[2];
    bVar67 = bVar67 | bVar50 | bVar31 | auVar46[3];
    bVar68 = bVar68 | bVar51 | bVar32 | auVar46[4];
    bVar69 = bVar69 | bVar52 | bVar33 | auVar46[5];
    bVar70 = bVar70 | bVar53 | bVar34 | auVar46[6];
    bVar71 = bVar71 | bVar54 | bVar35 | auVar46[7];
    bVar72 = bVar72 | bVar55 | bVar36 | auVar46[8];
    bVar74 = bVar74 | bVar56 | bVar37 | auVar46[9];
    bVar75 = bVar75 | bVar57 | bVar38 | auVar46[10];
    bVar76 = bVar76 | bVar58 | bVar39 | auVar46[0xb];
    bVar77 = bVar77 | bVar59 | bVar40 | auVar46[0xc];
    bVar78 = bVar78 | bVar60 | bVar41 | auVar46[0xd];
    bVar79 = bVar79 | bVar61 | bVar42 | auVar46[0xe];
    bVar80 = bVar80 | bVar62 | bVar43 | auVar46[0xf];
    auVar3[1] = bVar65;
    auVar3[0] = bVar63;
    auVar3[2] = bVar66;
    auVar3[3] = bVar67;
    auVar3[4] = bVar68;
    auVar3[5] = bVar69;
    auVar3[6] = bVar70;
    auVar3[7] = bVar71;
    auVar3[8] = bVar72;
    auVar3[9] = bVar74;
    auVar3[10] = bVar75;
    auVar3[0xb] = bVar76;
    auVar3[0xc] = bVar77;
    auVar3[0xd] = bVar78;
    auVar3[0xe] = bVar79;
    auVar3[0xf] = bVar80;
    auVar4[1] = bVar65;
    auVar4[0] = bVar63;
    auVar4[2] = bVar66;
    auVar4[3] = bVar67;
    auVar4[4] = bVar68;
    auVar4[5] = bVar69;
    auVar4[6] = bVar70;
    auVar4[7] = bVar71;
    auVar4[8] = bVar72;
    auVar4[9] = bVar74;
    auVar4[10] = bVar75;
    auVar4[0xb] = bVar76;
    auVar4[0xc] = bVar77;
    auVar4[0xd] = bVar78;
    auVar4[0xe] = bVar79;
    auVar4[0xf] = bVar80;
    auVar46 = NEON_ext(auVar3,auVar4,8,1);
    uVar20 = CONCAT17(bVar71 | auVar46[7],
                      CONCAT16(bVar70 | auVar46[6],
                               CONCAT15(bVar69 | auVar46[5],
                                        CONCAT14(bVar68 | auVar46[4],
                                                 CONCAT13(bVar67 | auVar46[3],
                                                          CONCAT12(bVar66 | auVar46[2],
                                                                   CONCAT11(bVar65 | auVar46[1],
                                                                            bVar63 | auVar46[0])))))
                              ));
    if (in_x12 == in_x13) goto LAB_002af8a0;
    do {
      lVar17 = param_1 - in_x10;
      puVar18 = in_x9 + in_x10;
      do {
        uVar20 = *puVar18 | uVar20;
        lVar17 = lVar17 + -1;
        puVar18 = puVar18 + 1;
      } while (lVar17 != 0);
LAB_002af8a0:
      do {
        if (uVar20 != 0) goto LAB_002af66c;
code_r0x002af8a4:
        uVar15 = (uint)param_11;
        uVar10 = (uint)param_10;
        if (unaff_x22 != (char *)0x0) {
          if (*unaff_x22 == '\x01') {
            pcVar12 = unaff_x22;
            iVar8 = (**(code **)(unaff_x22 + 0x10))(1,in_stack_00000010._4_4_ + -1);
            uVar10 = (uint)pcVar12;
            if (iVar8 != 0) goto LAB_002af8f4;
          }
          else if (*unaff_x22 == '\x02') {
            pcVar12 = unaff_x22;
            (**(code **)(unaff_x22 + 0x10))(1);
            uVar10 = (uint)pcVar12;
            goto LAB_002af8f4;
          }
          goto LAB_002afa70;
        }
LAB_002af8f4:
        iVar8 = in_stack_00000010._4_4_ + 1;
        if (in_stack_00000010._4_4_ == unaff_w23) {
          *unaff_x20 = 0;
          func_0x002a34e0(in_stack_00000020);
          cVar2 = *(char *)(unaff_x19 + 0x28);
joined_r0x002af91c:
          uVar14 = 1;
          goto joined_r0x002af91c;
        }
        iVar7 = func_0x0029afb8(in_stack_00000030,(long)*(int *)(unaff_x25 + 1));
        if (iVar7 == 0) goto LAB_002afa70;
        uVar14 = *unaff_x25;
        lVar17 = (long)*(int *)(unaff_x25 + 1);
        iVar7 = func_0x002afddc(*in_stack_00000030,2,uVar14,lVar17,&UNK_008310d0);
        uVar15 = (uint)lVar17;
        uVar10 = (uint)uVar14;
        if (iVar7 == 0) goto LAB_002afa70;
        *(undefined4 *)(in_stack_00000030 + 2) = 0;
        *(undefined4 *)(in_stack_00000030 + 1) = *(undefined4 *)(unaff_x25 + 1);
        puVar11 = in_stack_00000030;
        uVar15 = uVar25;
        iVar7 = func_0x002a7034(in_stack_00000008,&uStack0000000000000048);
        uVar10 = (uint)puVar11;
        if (iVar7 == 0) goto LAB_002afa70;
        uVar10 = (uint)uStack0000000000000048;
        iVar7 = func_0x0029ed38(in_stack_00000008,in_stack_00000008);
        if (iVar7 == 0) goto LAB_002afa70;
        uStack0000000000000048 = 1;
        if (*(int *)(in_stack_00000008 + 2) == 0) {
          uVar10 = (uint)&uStack0000000000000048;
          uVar15 = 1;
          iVar7 = func_0x0029d99c(*in_stack_00000008,(long)*(int *)(in_stack_00000008 + 1));
          if (0 < iVar7) {
            *unaff_x20 = 1;
            func_0x002a34e0(in_stack_00000020);
            cVar2 = *(char *)(unaff_x19 + 0x28);
            goto joined_r0x002af91c;
          }
        }
        param_10 = in_stack_00000028;
        param_11 = unaff_x21;
        iVar7 = func_0x002a27b4(in_stack_00000040,in_stack_00000030);
        uVar15 = (uint)param_11;
        uVar10 = (uint)param_10;
        if (iVar7 == 0) goto LAB_002afa70;
        in_stack_00000010._4_4_ = iVar8;
        if ((int)in_stack_00000040[2] != 0) {
LAB_002af66c:
          iVar8 = func_0x0029db84();
          uVar15 = (uint)param_11;
          uVar10 = (uint)param_10;
          if (iVar8 == 0) goto code_r0x002af8a4;
          if (1 < unaff_w26) {
            uVar26 = 1;
            do {
              uVar15 = (uint)param_11;
              uVar10 = (uint)param_10;
              if (in_stack_00000040 != in_stack_00000038) {
                iVar8 = func_0x0029afb8(in_stack_00000038,(long)(int)in_stack_00000040[1]);
                if (iVar8 == 0) goto LAB_002afa70;
                uVar27 = 0;
                if ((int)in_stack_00000040[1] != 0) {
                  _memcpy(*in_stack_00000038,*in_stack_00000040,(long)(int)in_stack_00000040[1] << 3
                         );
                  uVar27 = (undefined4)in_stack_00000040[1];
                }
                *(undefined4 *)(in_stack_00000038 + 1) = uVar27;
                *(int *)(in_stack_00000038 + 2) = (int)in_stack_00000040[2];
              }
              param_10 = in_stack_00000038;
              param_11 = unaff_x21;
              iVar8 = func_0x002a06a4(in_stack_00000040,in_stack_00000038);
              uVar15 = (uint)param_11;
              uVar10 = (uint)param_10;
              if (iVar8 == 0) goto LAB_002afa70;
              iVar8 = (int)in_stack_00000040[2];
              if (iVar8 == *(int *)(unaff_x25 + 2)) {
                param_10 = (long *)*unaff_x25;
                param_11 = (long)*(int *)(unaff_x25 + 1);
                iVar9 = func_0x0029d99c(*in_stack_00000040,(long)(int)in_stack_00000040[1]);
                iVar7 = -iVar9;
                if (iVar8 == 0) {
                  iVar7 = iVar9;
                }
                if (iVar7 == 0) goto code_r0x002af8a4;
              }
              uVar15 = (uint)param_11;
              uVar10 = (uint)param_10;
              if (iVar8 == 0) {
                uVar1 = *(uint *)(in_stack_00000040 + 1);
                if (uVar1 != 0) {
                  puVar18 = (ulong *)*in_stack_00000040;
                  uVar20 = *puVar18 ^ 1;
                  if (1 < (int)uVar1) {
                    if (uVar1 < 9) {
                      uVar22 = 1;
                    }
                    else {
                      uVar23 = (ulong)uVar1 - 1;
                      uVar24 = uVar23 & 0xfffffffffffffff8;
                      uVar22 = uVar24 | 1;
                      bVar28 = 0;
                      bVar29 = 0;
                      bVar30 = 0;
                      bVar31 = 0;
                      bVar32 = 0;
                      bVar33 = 0;
                      bVar34 = 0;
                      bVar35 = 0;
                      bVar36 = 0;
                      bVar37 = 0;
                      bVar38 = 0;
                      bVar39 = 0;
                      bVar40 = 0;
                      bVar41 = 0;
                      bVar42 = 0;
                      bVar43 = 0;
                      auVar44._8_8_ = 0;
                      auVar44._0_8_ = uVar20;
                      uVar14 = 0;
                      uVar16 = 0;
                      uVar64 = 0;
                      uVar73 = 0;
                      puVar19 = puVar18 + 5;
                      uVar20 = uVar24;
                      do {
                        uVar82 = puVar19[-3];
                        uVar81 = puVar19[-4];
                        uVar84 = puVar19[-1];
                        uVar83 = puVar19[-2];
                        uVar86 = puVar19[1];
                        uVar85 = *puVar19;
                        uVar88 = puVar19[3];
                        uVar87 = puVar19[2];
                        auVar45[0] = (byte)uVar81 | auVar44[0];
                        auVar45[1] = (byte)(uVar81 >> 8) | auVar44[1];
                        auVar45[2] = (byte)(uVar81 >> 0x10) | auVar44[2];
                        auVar45[3] = (byte)(uVar81 >> 0x18) | auVar44[3];
                        auVar45[4] = (byte)(uVar81 >> 0x20) | auVar44[4];
                        auVar45[5] = (byte)(uVar81 >> 0x28) | auVar44[5];
                        auVar45[6] = (byte)(uVar81 >> 0x30) | auVar44[6];
                        auVar45[7] = (byte)(uVar81 >> 0x38) | auVar44[7];
                        auVar45[8] = (byte)uVar82 | auVar44[8];
                        auVar45[9] = (byte)(uVar82 >> 8) | auVar44[9];
                        auVar45[10] = (byte)(uVar82 >> 0x10) | auVar44[10];
                        auVar45[0xb] = (byte)(uVar82 >> 0x18) | auVar44[0xb];
                        auVar45[0xc] = (byte)(uVar82 >> 0x20) | auVar44[0xc];
                        auVar45[0xd] = (byte)(uVar82 >> 0x28) | auVar44[0xd];
                        auVar45[0xe] = (byte)(uVar82 >> 0x30) | auVar44[0xe];
                        auVar45[0xf] = (byte)(uVar82 >> 0x38) | auVar44[0xf];
                        bVar28 = (byte)uVar83 | bVar28;
                        bVar29 = (byte)(uVar83 >> 8) | bVar29;
                        bVar30 = (byte)(uVar83 >> 0x10) | bVar30;
                        bVar31 = (byte)(uVar83 >> 0x18) | bVar31;
                        bVar32 = (byte)(uVar83 >> 0x20) | bVar32;
                        bVar33 = (byte)(uVar83 >> 0x28) | bVar33;
                        bVar34 = (byte)(uVar83 >> 0x30) | bVar34;
                        bVar35 = (byte)(uVar83 >> 0x38) | bVar35;
                        bVar36 = (byte)uVar84 | bVar36;
                        bVar37 = (byte)(uVar84 >> 8) | bVar37;
                        bVar38 = (byte)(uVar84 >> 0x10) | bVar38;
                        bVar39 = (byte)(uVar84 >> 0x18) | bVar39;
                        bVar40 = (byte)(uVar84 >> 0x20) | bVar40;
                        bVar41 = (byte)(uVar84 >> 0x28) | bVar41;
                        bVar42 = (byte)(uVar84 >> 0x30) | bVar42;
                        bVar43 = (byte)(uVar84 >> 0x38) | bVar43;
                        bVar47 = (byte)uVar85 | (byte)uVar14;
                        bVar48 = (byte)(uVar85 >> 8) | (byte)((ulong)uVar14 >> 8);
                        bVar49 = (byte)(uVar85 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
                        bVar50 = (byte)(uVar85 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
                        bVar51 = (byte)(uVar85 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
                        bVar52 = (byte)(uVar85 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
                        bVar53 = (byte)(uVar85 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
                        bVar54 = (byte)(uVar85 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
                        uVar14 = CONCAT17(bVar54,CONCAT16(bVar53,CONCAT15(bVar52,CONCAT14(bVar51,
                                                  CONCAT13(bVar50,CONCAT12(bVar49,CONCAT11(bVar48,
                                                  bVar47)))))));
                        bVar55 = (byte)uVar86 | (byte)uVar16;
                        bVar56 = (byte)(uVar86 >> 8) | (byte)((ulong)uVar16 >> 8);
                        bVar57 = (byte)(uVar86 >> 0x10) | (byte)((ulong)uVar16 >> 0x10);
                        bVar58 = (byte)(uVar86 >> 0x18) | (byte)((ulong)uVar16 >> 0x18);
                        bVar59 = (byte)(uVar86 >> 0x20) | (byte)((ulong)uVar16 >> 0x20);
                        bVar60 = (byte)(uVar86 >> 0x28) | (byte)((ulong)uVar16 >> 0x28);
                        bVar61 = (byte)(uVar86 >> 0x30) | (byte)((ulong)uVar16 >> 0x30);
                        bVar62 = (byte)(uVar86 >> 0x38) | (byte)((ulong)uVar16 >> 0x38);
                        uVar16 = CONCAT17(bVar62,CONCAT16(bVar61,CONCAT15(bVar60,CONCAT14(bVar59,
                                                  CONCAT13(bVar58,CONCAT12(bVar57,CONCAT11(bVar56,
                                                  bVar55)))))));
                        bVar63 = (byte)uVar87 | (byte)uVar64;
                        bVar65 = (byte)(uVar87 >> 8) | (byte)((ulong)uVar64 >> 8);
                        bVar66 = (byte)(uVar87 >> 0x10) | (byte)((ulong)uVar64 >> 0x10);
                        bVar67 = (byte)(uVar87 >> 0x18) | (byte)((ulong)uVar64 >> 0x18);
                        bVar68 = (byte)(uVar87 >> 0x20) | (byte)((ulong)uVar64 >> 0x20);
                        bVar69 = (byte)(uVar87 >> 0x28) | (byte)((ulong)uVar64 >> 0x28);
                        bVar70 = (byte)(uVar87 >> 0x30) | (byte)((ulong)uVar64 >> 0x30);
                        bVar71 = (byte)(uVar87 >> 0x38) | (byte)((ulong)uVar64 >> 0x38);
                        uVar64 = CONCAT17(bVar71,CONCAT16(bVar70,CONCAT15(bVar69,CONCAT14(bVar68,
                                                  CONCAT13(bVar67,CONCAT12(bVar66,CONCAT11(bVar65,
                                                  bVar63)))))));
                        bVar72 = (byte)uVar88 | (byte)uVar73;
                        bVar74 = (byte)(uVar88 >> 8) | (byte)((ulong)uVar73 >> 8);
                        bVar75 = (byte)(uVar88 >> 0x10) | (byte)((ulong)uVar73 >> 0x10);
                        bVar76 = (byte)(uVar88 >> 0x18) | (byte)((ulong)uVar73 >> 0x18);
                        bVar77 = (byte)(uVar88 >> 0x20) | (byte)((ulong)uVar73 >> 0x20);
                        bVar78 = (byte)(uVar88 >> 0x28) | (byte)((ulong)uVar73 >> 0x28);
                        bVar79 = (byte)(uVar88 >> 0x30) | (byte)((ulong)uVar73 >> 0x30);
                        bVar80 = (byte)(uVar88 >> 0x38) | (byte)((ulong)uVar73 >> 0x38);
                        uVar73 = CONCAT17(bVar80,CONCAT16(bVar79,CONCAT15(bVar78,CONCAT14(bVar77,
                                                  CONCAT13(bVar76,CONCAT12(bVar75,CONCAT11(bVar74,
                                                  bVar72)))))));
                        uVar20 = uVar20 - 8;
                        puVar19 = puVar19 + 8;
                        auVar44 = auVar45;
                      } while (uVar20 != 0);
                      bVar63 = bVar63 | bVar47 | bVar28 | auVar45[0];
                      bVar65 = bVar65 | bVar48 | bVar29 | auVar45[1];
                      bVar66 = bVar66 | bVar49 | bVar30 | auVar45[2];
                      bVar67 = bVar67 | bVar50 | bVar31 | auVar45[3];
                      bVar68 = bVar68 | bVar51 | bVar32 | auVar45[4];
                      bVar69 = bVar69 | bVar52 | bVar33 | auVar45[5];
                      bVar70 = bVar70 | bVar53 | bVar34 | auVar45[6];
                      bVar71 = bVar71 | bVar54 | bVar35 | auVar45[7];
                      bVar72 = bVar72 | bVar55 | bVar36 | auVar45[8];
                      bVar74 = bVar74 | bVar56 | bVar37 | auVar45[9];
                      bVar75 = bVar75 | bVar57 | bVar38 | auVar45[10];
                      bVar76 = bVar76 | bVar58 | bVar39 | auVar45[0xb];
                      bVar77 = bVar77 | bVar59 | bVar40 | auVar45[0xc];
                      bVar78 = bVar78 | bVar60 | bVar41 | auVar45[0xd];
                      bVar79 = bVar79 | bVar61 | bVar42 | auVar45[0xe];
                      bVar80 = bVar80 | bVar62 | bVar43 | auVar45[0xf];
                      auVar5[1] = bVar65;
                      auVar5[0] = bVar63;
                      auVar5[2] = bVar66;
                      auVar5[3] = bVar67;
                      auVar5[4] = bVar68;
                      auVar5[5] = bVar69;
                      auVar5[6] = bVar70;
                      auVar5[7] = bVar71;
                      auVar5[8] = bVar72;
                      auVar5[9] = bVar74;
                      auVar5[10] = bVar75;
                      auVar5[0xb] = bVar76;
                      auVar5[0xc] = bVar77;
                      auVar5[0xd] = bVar78;
                      auVar5[0xe] = bVar79;
                      auVar5[0xf] = bVar80;
                      auVar6[1] = bVar65;
                      auVar6[0] = bVar63;
                      auVar6[2] = bVar66;
                      auVar6[3] = bVar67;
                      auVar6[4] = bVar68;
                      auVar6[5] = bVar69;
                      auVar6[6] = bVar70;
                      auVar6[7] = bVar71;
                      auVar6[8] = bVar72;
                      auVar6[9] = bVar74;
                      auVar6[10] = bVar75;
                      auVar6[0xb] = bVar76;
                      auVar6[0xc] = bVar77;
                      auVar6[0xd] = bVar78;
                      auVar6[0xe] = bVar79;
                      auVar6[0xf] = bVar80;
                      auVar46 = NEON_ext(auVar5,auVar6,8,1);
                      uVar20 = CONCAT17(bVar71 | auVar46[7],
                                        CONCAT16(bVar70 | auVar46[6],
                                                 CONCAT15(bVar69 | auVar46[5],
                                                          CONCAT14(bVar68 | auVar46[4],
                                                                   CONCAT13(bVar67 | auVar46[3],
                                                                            CONCAT12(bVar66 | 
                                                  auVar46[2],
                                                  CONCAT11(bVar65 | auVar46[1],bVar63 | auVar46[0]))
                                                  )))));
                      if (uVar23 == uVar24) goto code_r0x002af7ec;
                    }
                    lVar17 = uVar1 - uVar22;
                    puVar18 = puVar18 + uVar22;
                    do {
                      uVar20 = *puVar18 | uVar20;
                      lVar17 = lVar17 + -1;
                      puVar18 = puVar18 + 1;
                    } while (lVar17 != 0);
                  }
code_r0x002af7ec:
                  if (uVar20 == 0) goto code_r0x002afa00;
                }
              }
              uVar26 = uVar26 + 1;
              if (unaff_w26 == uVar26) break;
            } while( true );
          }
          lVar17 = func_0x0029bd80(in_stack_00000038,in_stack_00000040);
          if (lVar17 == 0) {
LAB_002afa70:
            uVar14 = 0;
            func_0x002a34e0(in_stack_00000020);
            cVar2 = *(char *)(unaff_x19 + 0x28);
          }
          else {
            plVar13 = in_stack_00000038;
            uVar15 = uVar25;
            iVar8 = func_0x002a06a4(in_stack_00000040,in_stack_00000038);
            uVar10 = (uint)plVar13;
            if ((iVar8 == 0) ||
               ((iVar8 = func_0x0029dd44(in_stack_00000040), iVar8 == 0 &&
                (lVar17 = func_0x0029bd80(in_stack_00000038,in_stack_00000040), lVar17 == 0))))
            goto LAB_002afa70;
code_r0x002afa00:
            lVar17 = func_0x0029bd80(in_stack_00000018,in_stack_00000038);
            if ((lVar17 == 0) || (iVar8 = func_0x0029b490(in_stack_00000018,1), iVar8 == 0))
            goto LAB_002afa70;
            lVar17 = unaff_x19;
            uVar10 = uVar25;
            iVar8 = func_0x002a6fdc(in_stack_00000008,in_stack_00000018);
            uVar15 = (uint)lVar17;
            if (iVar8 == 0) goto LAB_002afa70;
            uVar14 = 1;
            iVar8 = func_0x0029dce0(in_stack_00000008,1);
            uVar27 = 1;
            if (iVar8 < 1) {
              uVar27 = 2;
            }
            *unaff_x20 = uVar27;
            func_0x002a34e0(in_stack_00000020);
            cVar2 = *(char *)(unaff_x19 + 0x28);
          }
joined_r0x002af91c:
          if (cVar2 != '\0') {
            return uVar14;
          }
          if (*(long *)(unaff_x19 + 0x10) != 0) {
            lVar17 = *(long *)(unaff_x19 + 0x10) + -1;
            *(long *)(unaff_x19 + 0x10) = lVar17;
            *(undefined8 *)(unaff_x19 + 0x20) =
                 *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar17 * 8);
            return uVar14;
          }
          auVar89 = func_0x0079db4c();
          iVar8 = auVar89._8_4_;
          plVar13 = auVar89._0_8_;
          if (plVar13 == (long *)0x0) {
            return 0;
          }
          if (uVar10 - 2 < 0xfffffffd) {
            uVar14 = 0x42;
            uVar16 = 0x82;
          }
          else if (uVar15 < 2) {
            if (iVar8 == 0) {
              *(undefined4 *)(plVar13 + 2) = 0;
              *(undefined4 *)(plVar13 + 1) = 0;
              return 1;
            }
            if (iVar8 < 0x7fffffc1) {
              uVar25 = iVar8 + 0x7e;
              if (-0x40 < iVar8) {
                uVar25 = iVar8 + 0x3f;
              }
              uVar1 = -(iVar8 - 1U);
              uVar26 = iVar8 - 1U & 0x3f;
              if (-1 < (int)uVar1) {
                uVar26 = -(uVar1 & 0x3f);
              }
              lVar17 = (long)((ulong)uVar25 << 0x20) >> 0x26;
              uVar14 = func_0x0029afb8(plVar13,lVar17);
              if ((int)uVar14 == 0) {
                return uVar14;
              }
              uVar20 = 0xffffffffffffffff;
              if ((int)uVar26 < 0x3f) {
                uVar20 = ~(-1L << ((ulong)(uVar26 + 1) & 0x3f));
              }
              func_0x002b0104(*plVar13,lVar17 << 3,&UNK_00831b38);
              puVar18 = (ulong *)*plVar13;
              lVar21 = (long)((int)uVar25 >> 6);
              lVar17 = lVar21 + -1;
              uVar20 = puVar18[lVar17] & uVar20;
              puVar18[lVar17] = uVar20;
              if (uVar10 != 0xffffffff) {
                if ((iVar8 < 2) || (uVar10 != 1)) {
                  uVar22 = 1L << ((ulong)uVar26 & 0x3f);
                }
                else {
                  if (uVar26 == 0) {
                    puVar18[lVar17] = uVar20 | 1;
                    puVar18[lVar21 + -2] = puVar18[lVar21 + -2] | 0x8000000000000000;
                    goto LAB_002afc68;
                  }
                  uVar22 = 3L << ((ulong)(uVar26 - 1) & 0x3f);
                }
                puVar18[lVar17] = uVar20 | uVar22;
              }
LAB_002afc68:
              if (uVar15 == 1) {
                *puVar18 = *puVar18 | 1;
              }
              *(undefined4 *)(plVar13 + 2) = 0;
              *(int *)(plVar13 + 1) = (int)uVar25 >> 6;
              return 1;
            }
            uVar14 = 0x66;
            uVar16 = 0x91;
          }
          else {
            uVar14 = 0x42;
            uVar16 = 0x87;
          }
          func_0x0028f83c(3,0,uVar14,"/aws-lc/crypto/fipsmodule/bn/random.c",uVar16);
          return 0;
        }
        uVar10 = *(uint *)(in_stack_00000040 + 1);
        param_1 = (ulong)uVar10;
        if (uVar10 == 0) goto LAB_002af66c;
        in_x9 = (ulong *)*in_stack_00000040;
        uVar20 = *in_x9 ^ 1;
      } while ((int)uVar10 < 2);
      if (8 < uVar10) goto code_r0x002af820;
      in_x10 = 1;
    } while( true );
  }
  goto LAB_002af848;
code_r0x002af820:
  in_x12 = param_1 - 1;
  in_x13 = in_x12 & 0xfffffffffffffff8;
  in_x10 = in_x13 | 1;
  bVar28 = 0;
  bVar29 = 0;
  bVar30 = 0;
  bVar31 = 0;
  bVar32 = 0;
  bVar33 = 0;
  bVar34 = 0;
  bVar35 = 0;
  bVar36 = 0;
  bVar37 = 0;
  bVar38 = 0;
  bVar39 = 0;
  bVar40 = 0;
  bVar41 = 0;
  bVar42 = 0;
  bVar43 = 0;
  auVar46._8_8_ = 0;
  auVar46._0_8_ = uVar20;
  puVar18 = in_x9 + 5;
  uVar14 = 0;
  uVar16 = 0;
  uVar64 = 0;
  uVar73 = 0;
  in_x14 = in_x13;
LAB_002af848:
  uVar22 = puVar18[-3];
  uVar20 = puVar18[-4];
  uVar24 = puVar18[-1];
  uVar23 = puVar18[-2];
  in_x11 = puVar18;
  param_3 = auVar46;
  goto code_r0x002af84c;
}

