
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_002af660(undefined8 param_1,undefined8 param_2,long *param_3,long param_4)

{
  int iVar1;
  uint uVar2;
  char cVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
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
  ulong uVar19;
  ulong *puVar20;
  long lVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  long unaff_x19;
  undefined4 *unaff_x20;
  uint uVar25;
  long unaff_x21;
  char *unaff_x22;
  int unaff_w23;
  long *unaff_x24;
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
  undefined1 auVar47 [16];
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
  byte bVar64;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  undefined8 uVar65;
  byte bVar72;
  byte bVar73;
  byte bVar75;
  byte bVar76;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  undefined8 uVar74;
  byte bVar81;
  ulong uVar82;
  ulong uVar83;
  ulong uVar84;
  ulong uVar85;
  ulong uVar86;
  ulong uVar87;
  ulong uVar88;
  ulong uVar89;
  undefined1 auVar90 [12];
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long *in_stack_00000028;
  undefined8 *in_stack_00000030;
  long *in_stack_00000038;
  long *in_stack_00000040;
  undefined8 uStack0000000000000048;
  
  uVar25 = (uint)unaff_x21;
  do {
    uVar15 = (uint)param_4;
    uVar10 = (uint)param_3;
    if ((int)unaff_x24[2] != 0) {
LAB_002af66c:
      iVar8 = func_0x0029db84();
      uVar15 = (uint)param_4;
      uVar10 = (uint)param_3;
      if (iVar8 == 0) goto LAB_002af8a4;
      if (1 < unaff_w26) {
        uVar26 = 1;
        do {
          uVar15 = (uint)param_4;
          uVar10 = (uint)param_3;
          if (in_stack_00000040 != in_stack_00000038) {
            iVar8 = func_0x0029afb8(in_stack_00000038,(long)(int)in_stack_00000040[1]);
            if (iVar8 == 0) goto LAB_002afa70;
            uVar27 = 0;
            if ((int)in_stack_00000040[1] != 0) {
              _memcpy(*in_stack_00000038,*in_stack_00000040,(long)(int)in_stack_00000040[1] << 3);
              uVar27 = (undefined4)in_stack_00000040[1];
            }
            *(undefined4 *)(in_stack_00000038 + 1) = uVar27;
            *(int *)(in_stack_00000038 + 2) = (int)in_stack_00000040[2];
          }
          param_3 = in_stack_00000038;
          param_4 = unaff_x21;
          iVar8 = func_0x002a06a4(in_stack_00000040,in_stack_00000038);
          uVar15 = (uint)param_4;
          uVar10 = (uint)param_3;
          if (iVar8 == 0) goto LAB_002afa70;
          iVar8 = (int)in_stack_00000040[2];
          if (iVar8 == *(int *)(unaff_x25 + 2)) {
            param_3 = (long *)*unaff_x25;
            param_4 = (long)*(int *)(unaff_x25 + 1);
            iVar9 = func_0x0029d99c(*in_stack_00000040,(long)(int)in_stack_00000040[1]);
            uVar15 = (uint)param_4;
            uVar10 = (uint)param_3;
            iVar1 = -iVar9;
            if (iVar8 == 0) {
              iVar1 = iVar9;
            }
            if (iVar1 == 0) goto LAB_002af8a4;
          }
          uVar15 = (uint)param_4;
          uVar10 = (uint)param_3;
          if (iVar8 == 0) {
            uVar2 = *(uint *)(in_stack_00000040 + 1);
            if (uVar2 != 0) {
              puVar18 = (ulong *)*in_stack_00000040;
              uVar19 = *puVar18 ^ 1;
              if (1 < (int)uVar2) {
                if (uVar2 < 9) {
                  uVar22 = 1;
                }
                else {
                  uVar23 = (ulong)uVar2 - 1;
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
                  auVar44._0_8_ = uVar19;
                  uVar14 = 0;
                  uVar16 = 0;
                  uVar65 = 0;
                  uVar74 = 0;
                  puVar20 = puVar18 + 5;
                  uVar19 = uVar24;
                  do {
                    uVar83 = puVar20[-3];
                    uVar82 = puVar20[-4];
                    uVar85 = puVar20[-1];
                    uVar84 = puVar20[-2];
                    uVar87 = puVar20[1];
                    uVar86 = *puVar20;
                    uVar89 = puVar20[3];
                    uVar88 = puVar20[2];
                    auVar45[0] = (byte)uVar82 | auVar44[0];
                    auVar45[1] = (byte)(uVar82 >> 8) | auVar44[1];
                    auVar45[2] = (byte)(uVar82 >> 0x10) | auVar44[2];
                    auVar45[3] = (byte)(uVar82 >> 0x18) | auVar44[3];
                    auVar45[4] = (byte)(uVar82 >> 0x20) | auVar44[4];
                    auVar45[5] = (byte)(uVar82 >> 0x28) | auVar44[5];
                    auVar45[6] = (byte)(uVar82 >> 0x30) | auVar44[6];
                    auVar45[7] = (byte)(uVar82 >> 0x38) | auVar44[7];
                    auVar45[8] = (byte)uVar83 | auVar44[8];
                    auVar45[9] = (byte)(uVar83 >> 8) | auVar44[9];
                    auVar45[10] = (byte)(uVar83 >> 0x10) | auVar44[10];
                    auVar45[0xb] = (byte)(uVar83 >> 0x18) | auVar44[0xb];
                    auVar45[0xc] = (byte)(uVar83 >> 0x20) | auVar44[0xc];
                    auVar45[0xd] = (byte)(uVar83 >> 0x28) | auVar44[0xd];
                    auVar45[0xe] = (byte)(uVar83 >> 0x30) | auVar44[0xe];
                    auVar45[0xf] = (byte)(uVar83 >> 0x38) | auVar44[0xf];
                    bVar28 = (byte)uVar84 | bVar28;
                    bVar29 = (byte)(uVar84 >> 8) | bVar29;
                    bVar30 = (byte)(uVar84 >> 0x10) | bVar30;
                    bVar31 = (byte)(uVar84 >> 0x18) | bVar31;
                    bVar32 = (byte)(uVar84 >> 0x20) | bVar32;
                    bVar33 = (byte)(uVar84 >> 0x28) | bVar33;
                    bVar34 = (byte)(uVar84 >> 0x30) | bVar34;
                    bVar35 = (byte)(uVar84 >> 0x38) | bVar35;
                    bVar36 = (byte)uVar85 | bVar36;
                    bVar37 = (byte)(uVar85 >> 8) | bVar37;
                    bVar38 = (byte)(uVar85 >> 0x10) | bVar38;
                    bVar39 = (byte)(uVar85 >> 0x18) | bVar39;
                    bVar40 = (byte)(uVar85 >> 0x20) | bVar40;
                    bVar41 = (byte)(uVar85 >> 0x28) | bVar41;
                    bVar42 = (byte)(uVar85 >> 0x30) | bVar42;
                    bVar43 = (byte)(uVar85 >> 0x38) | bVar43;
                    bVar48 = (byte)uVar86 | (byte)uVar14;
                    bVar49 = (byte)(uVar86 >> 8) | (byte)((ulong)uVar14 >> 8);
                    bVar50 = (byte)(uVar86 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
                    bVar51 = (byte)(uVar86 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
                    bVar52 = (byte)(uVar86 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
                    bVar53 = (byte)(uVar86 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
                    bVar54 = (byte)(uVar86 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
                    bVar55 = (byte)(uVar86 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
                    uVar14 = CONCAT17(bVar55,CONCAT16(bVar54,CONCAT15(bVar53,CONCAT14(bVar52,
                                                  CONCAT13(bVar51,CONCAT12(bVar50,CONCAT11(bVar49,
                                                  bVar48)))))));
                    bVar56 = (byte)uVar87 | (byte)uVar16;
                    bVar57 = (byte)(uVar87 >> 8) | (byte)((ulong)uVar16 >> 8);
                    bVar58 = (byte)(uVar87 >> 0x10) | (byte)((ulong)uVar16 >> 0x10);
                    bVar59 = (byte)(uVar87 >> 0x18) | (byte)((ulong)uVar16 >> 0x18);
                    bVar60 = (byte)(uVar87 >> 0x20) | (byte)((ulong)uVar16 >> 0x20);
                    bVar61 = (byte)(uVar87 >> 0x28) | (byte)((ulong)uVar16 >> 0x28);
                    bVar62 = (byte)(uVar87 >> 0x30) | (byte)((ulong)uVar16 >> 0x30);
                    bVar63 = (byte)(uVar87 >> 0x38) | (byte)((ulong)uVar16 >> 0x38);
                    uVar16 = CONCAT17(bVar63,CONCAT16(bVar62,CONCAT15(bVar61,CONCAT14(bVar60,
                                                  CONCAT13(bVar59,CONCAT12(bVar58,CONCAT11(bVar57,
                                                  bVar56)))))));
                    bVar64 = (byte)uVar88 | (byte)uVar65;
                    bVar66 = (byte)(uVar88 >> 8) | (byte)((ulong)uVar65 >> 8);
                    bVar67 = (byte)(uVar88 >> 0x10) | (byte)((ulong)uVar65 >> 0x10);
                    bVar68 = (byte)(uVar88 >> 0x18) | (byte)((ulong)uVar65 >> 0x18);
                    bVar69 = (byte)(uVar88 >> 0x20) | (byte)((ulong)uVar65 >> 0x20);
                    bVar70 = (byte)(uVar88 >> 0x28) | (byte)((ulong)uVar65 >> 0x28);
                    bVar71 = (byte)(uVar88 >> 0x30) | (byte)((ulong)uVar65 >> 0x30);
                    bVar72 = (byte)(uVar88 >> 0x38) | (byte)((ulong)uVar65 >> 0x38);
                    uVar65 = CONCAT17(bVar72,CONCAT16(bVar71,CONCAT15(bVar70,CONCAT14(bVar69,
                                                  CONCAT13(bVar68,CONCAT12(bVar67,CONCAT11(bVar66,
                                                  bVar64)))))));
                    bVar73 = (byte)uVar89 | (byte)uVar74;
                    bVar75 = (byte)(uVar89 >> 8) | (byte)((ulong)uVar74 >> 8);
                    bVar76 = (byte)(uVar89 >> 0x10) | (byte)((ulong)uVar74 >> 0x10);
                    bVar77 = (byte)(uVar89 >> 0x18) | (byte)((ulong)uVar74 >> 0x18);
                    bVar78 = (byte)(uVar89 >> 0x20) | (byte)((ulong)uVar74 >> 0x20);
                    bVar79 = (byte)(uVar89 >> 0x28) | (byte)((ulong)uVar74 >> 0x28);
                    bVar80 = (byte)(uVar89 >> 0x30) | (byte)((ulong)uVar74 >> 0x30);
                    bVar81 = (byte)(uVar89 >> 0x38) | (byte)((ulong)uVar74 >> 0x38);
                    uVar74 = CONCAT17(bVar81,CONCAT16(bVar80,CONCAT15(bVar79,CONCAT14(bVar78,
                                                  CONCAT13(bVar77,CONCAT12(bVar76,CONCAT11(bVar75,
                                                  bVar73)))))));
                    uVar19 = uVar19 - 8;
                    puVar20 = puVar20 + 8;
                    auVar44 = auVar45;
                  } while (uVar19 != 0);
                  bVar64 = bVar64 | bVar48 | bVar28 | auVar45[0];
                  bVar66 = bVar66 | bVar49 | bVar29 | auVar45[1];
                  bVar67 = bVar67 | bVar50 | bVar30 | auVar45[2];
                  bVar68 = bVar68 | bVar51 | bVar31 | auVar45[3];
                  bVar69 = bVar69 | bVar52 | bVar32 | auVar45[4];
                  bVar70 = bVar70 | bVar53 | bVar33 | auVar45[5];
                  bVar71 = bVar71 | bVar54 | bVar34 | auVar45[6];
                  bVar72 = bVar72 | bVar55 | bVar35 | auVar45[7];
                  bVar73 = bVar73 | bVar56 | bVar36 | auVar45[8];
                  bVar75 = bVar75 | bVar57 | bVar37 | auVar45[9];
                  bVar76 = bVar76 | bVar58 | bVar38 | auVar45[10];
                  bVar77 = bVar77 | bVar59 | bVar39 | auVar45[0xb];
                  bVar78 = bVar78 | bVar60 | bVar40 | auVar45[0xc];
                  bVar79 = bVar79 | bVar61 | bVar41 | auVar45[0xd];
                  bVar80 = bVar80 | bVar62 | bVar42 | auVar45[0xe];
                  bVar81 = bVar81 | bVar63 | bVar43 | auVar45[0xf];
                  auVar4[1] = bVar66;
                  auVar4[0] = bVar64;
                  auVar4[2] = bVar67;
                  auVar4[3] = bVar68;
                  auVar4[4] = bVar69;
                  auVar4[5] = bVar70;
                  auVar4[6] = bVar71;
                  auVar4[7] = bVar72;
                  auVar4[8] = bVar73;
                  auVar4[9] = bVar75;
                  auVar4[10] = bVar76;
                  auVar4[0xb] = bVar77;
                  auVar4[0xc] = bVar78;
                  auVar4[0xd] = bVar79;
                  auVar4[0xe] = bVar80;
                  auVar4[0xf] = bVar81;
                  auVar5[1] = bVar66;
                  auVar5[0] = bVar64;
                  auVar5[2] = bVar67;
                  auVar5[3] = bVar68;
                  auVar5[4] = bVar69;
                  auVar5[5] = bVar70;
                  auVar5[6] = bVar71;
                  auVar5[7] = bVar72;
                  auVar5[8] = bVar73;
                  auVar5[9] = bVar75;
                  auVar5[10] = bVar76;
                  auVar5[0xb] = bVar77;
                  auVar5[0xc] = bVar78;
                  auVar5[0xd] = bVar79;
                  auVar5[0xe] = bVar80;
                  auVar5[0xf] = bVar81;
                  auVar46 = NEON_ext(auVar4,auVar5,8,1);
                  uVar19 = CONCAT17(bVar72 | auVar46[7],
                                    CONCAT16(bVar71 | auVar46[6],
                                             CONCAT15(bVar70 | auVar46[5],
                                                      CONCAT14(bVar69 | auVar46[4],
                                                               CONCAT13(bVar68 | auVar46[3],
                                                                        CONCAT12(bVar67 | auVar46[2]
                                                                                 ,CONCAT11(bVar66 | 
                                                  auVar46[1],bVar64 | auVar46[0])))))));
                  if (uVar23 == uVar24) goto LAB_002af7ec;
                }
                lVar17 = uVar2 - uVar22;
                puVar18 = puVar18 + uVar22;
                do {
                  uVar19 = *puVar18 | uVar19;
                  lVar17 = lVar17 + -1;
                  puVar18 = puVar18 + 1;
                } while (lVar17 != 0);
              }
LAB_002af7ec:
              if (uVar19 == 0) goto LAB_002afa00;
            }
          }
          uVar26 = uVar26 + 1;
          if (unaff_w26 == uVar26) break;
        } while( true );
      }
      lVar17 = func_0x0029bd80(in_stack_00000038,in_stack_00000040);
      if (lVar17 != 0) {
        plVar13 = in_stack_00000038;
        uVar15 = uVar25;
        iVar8 = func_0x002a06a4(in_stack_00000040,in_stack_00000038);
        uVar10 = (uint)plVar13;
        if ((iVar8 != 0) &&
           ((iVar8 = func_0x0029dd44(in_stack_00000040), iVar8 != 0 ||
            (lVar17 = func_0x0029bd80(in_stack_00000038,in_stack_00000040), lVar17 != 0)))) {
LAB_002afa00:
          lVar17 = func_0x0029bd80(in_stack_00000018,in_stack_00000038);
          if ((lVar17 != 0) && (iVar8 = func_0x0029b490(in_stack_00000018,1), iVar8 != 0)) {
            lVar17 = unaff_x19;
            uVar10 = uVar25;
            iVar8 = func_0x002a6fdc(in_stack_00000008,in_stack_00000018);
            uVar15 = (uint)lVar17;
            if (iVar8 != 0) {
              iVar8 = func_0x0029dce0(in_stack_00000008,1);
              uVar27 = 1;
              if (iVar8 < 1) {
                uVar27 = 2;
              }
              *unaff_x20 = uVar27;
              func_0x002a34e0(in_stack_00000020);
              cVar3 = *(char *)(unaff_x19 + 0x28);
joined_r0x002afa68:
              uVar14 = 1;
              goto joined_r0x002afa68;
            }
          }
        }
      }
      break;
    }
    uVar26 = *(uint *)(unaff_x24 + 1);
    if (uVar26 == 0) goto LAB_002af66c;
    puVar18 = (ulong *)*unaff_x24;
    uVar19 = *puVar18 ^ 1;
    if (1 < (int)uVar26) {
      if (uVar26 < 9) {
        uVar22 = 1;
      }
      else {
        uVar23 = (ulong)uVar26 - 1;
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
        auVar46._8_8_ = 0;
        auVar46._0_8_ = uVar19;
        uVar14 = 0;
        uVar16 = 0;
        uVar65 = 0;
        uVar74 = 0;
        puVar20 = puVar18 + 5;
        uVar19 = uVar24;
        do {
          uVar83 = puVar20[-3];
          uVar82 = puVar20[-4];
          uVar85 = puVar20[-1];
          uVar84 = puVar20[-2];
          uVar87 = puVar20[1];
          uVar86 = *puVar20;
          uVar89 = puVar20[3];
          uVar88 = puVar20[2];
          auVar47[0] = (byte)uVar82 | auVar46[0];
          auVar47[1] = (byte)(uVar82 >> 8) | auVar46[1];
          auVar47[2] = (byte)(uVar82 >> 0x10) | auVar46[2];
          auVar47[3] = (byte)(uVar82 >> 0x18) | auVar46[3];
          auVar47[4] = (byte)(uVar82 >> 0x20) | auVar46[4];
          auVar47[5] = (byte)(uVar82 >> 0x28) | auVar46[5];
          auVar47[6] = (byte)(uVar82 >> 0x30) | auVar46[6];
          auVar47[7] = (byte)(uVar82 >> 0x38) | auVar46[7];
          auVar47[8] = (byte)uVar83 | auVar46[8];
          auVar47[9] = (byte)(uVar83 >> 8) | auVar46[9];
          auVar47[10] = (byte)(uVar83 >> 0x10) | auVar46[10];
          auVar47[0xb] = (byte)(uVar83 >> 0x18) | auVar46[0xb];
          auVar47[0xc] = (byte)(uVar83 >> 0x20) | auVar46[0xc];
          auVar47[0xd] = (byte)(uVar83 >> 0x28) | auVar46[0xd];
          auVar47[0xe] = (byte)(uVar83 >> 0x30) | auVar46[0xe];
          auVar47[0xf] = (byte)(uVar83 >> 0x38) | auVar46[0xf];
          bVar28 = (byte)uVar84 | bVar28;
          bVar29 = (byte)(uVar84 >> 8) | bVar29;
          bVar30 = (byte)(uVar84 >> 0x10) | bVar30;
          bVar31 = (byte)(uVar84 >> 0x18) | bVar31;
          bVar32 = (byte)(uVar84 >> 0x20) | bVar32;
          bVar33 = (byte)(uVar84 >> 0x28) | bVar33;
          bVar34 = (byte)(uVar84 >> 0x30) | bVar34;
          bVar35 = (byte)(uVar84 >> 0x38) | bVar35;
          bVar36 = (byte)uVar85 | bVar36;
          bVar37 = (byte)(uVar85 >> 8) | bVar37;
          bVar38 = (byte)(uVar85 >> 0x10) | bVar38;
          bVar39 = (byte)(uVar85 >> 0x18) | bVar39;
          bVar40 = (byte)(uVar85 >> 0x20) | bVar40;
          bVar41 = (byte)(uVar85 >> 0x28) | bVar41;
          bVar42 = (byte)(uVar85 >> 0x30) | bVar42;
          bVar43 = (byte)(uVar85 >> 0x38) | bVar43;
          bVar48 = (byte)uVar86 | (byte)uVar14;
          bVar49 = (byte)(uVar86 >> 8) | (byte)((ulong)uVar14 >> 8);
          bVar50 = (byte)(uVar86 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
          bVar51 = (byte)(uVar86 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
          bVar52 = (byte)(uVar86 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
          bVar53 = (byte)(uVar86 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
          bVar54 = (byte)(uVar86 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
          bVar55 = (byte)(uVar86 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
          uVar14 = CONCAT17(bVar55,CONCAT16(bVar54,CONCAT15(bVar53,CONCAT14(bVar52,CONCAT13(bVar51,
                                                  CONCAT12(bVar50,CONCAT11(bVar49,bVar48)))))));
          bVar56 = (byte)uVar87 | (byte)uVar16;
          bVar57 = (byte)(uVar87 >> 8) | (byte)((ulong)uVar16 >> 8);
          bVar58 = (byte)(uVar87 >> 0x10) | (byte)((ulong)uVar16 >> 0x10);
          bVar59 = (byte)(uVar87 >> 0x18) | (byte)((ulong)uVar16 >> 0x18);
          bVar60 = (byte)(uVar87 >> 0x20) | (byte)((ulong)uVar16 >> 0x20);
          bVar61 = (byte)(uVar87 >> 0x28) | (byte)((ulong)uVar16 >> 0x28);
          bVar62 = (byte)(uVar87 >> 0x30) | (byte)((ulong)uVar16 >> 0x30);
          bVar63 = (byte)(uVar87 >> 0x38) | (byte)((ulong)uVar16 >> 0x38);
          uVar16 = CONCAT17(bVar63,CONCAT16(bVar62,CONCAT15(bVar61,CONCAT14(bVar60,CONCAT13(bVar59,
                                                  CONCAT12(bVar58,CONCAT11(bVar57,bVar56)))))));
          bVar64 = (byte)uVar88 | (byte)uVar65;
          bVar66 = (byte)(uVar88 >> 8) | (byte)((ulong)uVar65 >> 8);
          bVar67 = (byte)(uVar88 >> 0x10) | (byte)((ulong)uVar65 >> 0x10);
          bVar68 = (byte)(uVar88 >> 0x18) | (byte)((ulong)uVar65 >> 0x18);
          bVar69 = (byte)(uVar88 >> 0x20) | (byte)((ulong)uVar65 >> 0x20);
          bVar70 = (byte)(uVar88 >> 0x28) | (byte)((ulong)uVar65 >> 0x28);
          bVar71 = (byte)(uVar88 >> 0x30) | (byte)((ulong)uVar65 >> 0x30);
          bVar72 = (byte)(uVar88 >> 0x38) | (byte)((ulong)uVar65 >> 0x38);
          uVar65 = CONCAT17(bVar72,CONCAT16(bVar71,CONCAT15(bVar70,CONCAT14(bVar69,CONCAT13(bVar68,
                                                  CONCAT12(bVar67,CONCAT11(bVar66,bVar64)))))));
          bVar73 = (byte)uVar89 | (byte)uVar74;
          bVar75 = (byte)(uVar89 >> 8) | (byte)((ulong)uVar74 >> 8);
          bVar76 = (byte)(uVar89 >> 0x10) | (byte)((ulong)uVar74 >> 0x10);
          bVar77 = (byte)(uVar89 >> 0x18) | (byte)((ulong)uVar74 >> 0x18);
          bVar78 = (byte)(uVar89 >> 0x20) | (byte)((ulong)uVar74 >> 0x20);
          bVar79 = (byte)(uVar89 >> 0x28) | (byte)((ulong)uVar74 >> 0x28);
          bVar80 = (byte)(uVar89 >> 0x30) | (byte)((ulong)uVar74 >> 0x30);
          bVar81 = (byte)(uVar89 >> 0x38) | (byte)((ulong)uVar74 >> 0x38);
          uVar74 = CONCAT17(bVar81,CONCAT16(bVar80,CONCAT15(bVar79,CONCAT14(bVar78,CONCAT13(bVar77,
                                                  CONCAT12(bVar76,CONCAT11(bVar75,bVar73)))))));
          uVar19 = uVar19 - 8;
          puVar20 = puVar20 + 8;
          auVar46 = auVar47;
        } while (uVar19 != 0);
        bVar64 = bVar64 | bVar48 | bVar28 | auVar47[0];
        bVar66 = bVar66 | bVar49 | bVar29 | auVar47[1];
        bVar67 = bVar67 | bVar50 | bVar30 | auVar47[2];
        bVar68 = bVar68 | bVar51 | bVar31 | auVar47[3];
        bVar69 = bVar69 | bVar52 | bVar32 | auVar47[4];
        bVar70 = bVar70 | bVar53 | bVar33 | auVar47[5];
        bVar71 = bVar71 | bVar54 | bVar34 | auVar47[6];
        bVar72 = bVar72 | bVar55 | bVar35 | auVar47[7];
        bVar73 = bVar73 | bVar56 | bVar36 | auVar47[8];
        bVar75 = bVar75 | bVar57 | bVar37 | auVar47[9];
        bVar76 = bVar76 | bVar58 | bVar38 | auVar47[10];
        bVar77 = bVar77 | bVar59 | bVar39 | auVar47[0xb];
        bVar78 = bVar78 | bVar60 | bVar40 | auVar47[0xc];
        bVar79 = bVar79 | bVar61 | bVar41 | auVar47[0xd];
        bVar80 = bVar80 | bVar62 | bVar42 | auVar47[0xe];
        bVar81 = bVar81 | bVar63 | bVar43 | auVar47[0xf];
        auVar6[1] = bVar66;
        auVar6[0] = bVar64;
        auVar6[2] = bVar67;
        auVar6[3] = bVar68;
        auVar6[4] = bVar69;
        auVar6[5] = bVar70;
        auVar6[6] = bVar71;
        auVar6[7] = bVar72;
        auVar6[8] = bVar73;
        auVar6[9] = bVar75;
        auVar6[10] = bVar76;
        auVar6[0xb] = bVar77;
        auVar6[0xc] = bVar78;
        auVar6[0xd] = bVar79;
        auVar6[0xe] = bVar80;
        auVar6[0xf] = bVar81;
        auVar7[1] = bVar66;
        auVar7[0] = bVar64;
        auVar7[2] = bVar67;
        auVar7[3] = bVar68;
        auVar7[4] = bVar69;
        auVar7[5] = bVar70;
        auVar7[6] = bVar71;
        auVar7[7] = bVar72;
        auVar7[8] = bVar73;
        auVar7[9] = bVar75;
        auVar7[10] = bVar76;
        auVar7[0xb] = bVar77;
        auVar7[0xc] = bVar78;
        auVar7[0xd] = bVar79;
        auVar7[0xe] = bVar80;
        auVar7[0xf] = bVar81;
        auVar46 = NEON_ext(auVar6,auVar7,8,1);
        uVar19 = CONCAT17(bVar72 | auVar46[7],
                          CONCAT16(bVar71 | auVar46[6],
                                   CONCAT15(bVar70 | auVar46[5],
                                            CONCAT14(bVar69 | auVar46[4],
                                                     CONCAT13(bVar68 | auVar46[3],
                                                              CONCAT12(bVar67 | auVar46[2],
                                                                       CONCAT11(bVar66 | auVar46[1],
                                                                                bVar64 | auVar46[0])
                                                                      ))))));
        if (uVar23 == uVar24) goto LAB_002af8a0;
      }
      lVar17 = uVar26 - uVar22;
      puVar18 = puVar18 + uVar22;
      do {
        uVar19 = *puVar18 | uVar19;
        lVar17 = lVar17 + -1;
        puVar18 = puVar18 + 1;
      } while (lVar17 != 0);
    }
LAB_002af8a0:
    if (uVar19 != 0) goto LAB_002af66c;
LAB_002af8a4:
    if (unaff_x22 != (char *)0x0) {
      if (*unaff_x22 == '\x01') {
        pcVar12 = unaff_x22;
        iVar8 = (**(code **)(unaff_x22 + 0x10))(1,in_stack_00000010._4_4_ + -1);
        uVar10 = (uint)pcVar12;
        if (iVar8 == 0) break;
      }
      else {
        if (*unaff_x22 != '\x02') break;
        pcVar12 = unaff_x22;
        (**(code **)(unaff_x22 + 0x10))(1);
        uVar10 = (uint)pcVar12;
      }
    }
    if (in_stack_00000010._4_4_ == unaff_w23) {
      *unaff_x20 = 0;
      func_0x002a34e0(in_stack_00000020);
      cVar3 = *(char *)(unaff_x19 + 0x28);
      goto joined_r0x002afa68;
    }
    iVar8 = func_0x0029afb8(in_stack_00000030,(long)*(int *)(unaff_x25 + 1));
    if (iVar8 == 0) break;
    uVar14 = *unaff_x25;
    lVar17 = (long)*(int *)(unaff_x25 + 1);
    iVar8 = func_0x002afddc(*in_stack_00000030,2,uVar14,lVar17,&UNK_008310d0);
    uVar15 = (uint)lVar17;
    uVar10 = (uint)uVar14;
    if (iVar8 == 0) break;
    *(undefined4 *)(in_stack_00000030 + 2) = 0;
    *(undefined4 *)(in_stack_00000030 + 1) = *(undefined4 *)(unaff_x25 + 1);
    puVar11 = in_stack_00000030;
    uVar15 = uVar25;
    iVar8 = func_0x002a7034(in_stack_00000008,&uStack0000000000000048);
    uVar10 = (uint)puVar11;
    if (iVar8 == 0) break;
    uVar10 = (uint)uStack0000000000000048;
    iVar8 = func_0x0029ed38(in_stack_00000008,in_stack_00000008);
    if (iVar8 == 0) break;
    uStack0000000000000048 = 1;
    if (*(int *)(in_stack_00000008 + 2) == 0) {
      uVar10 = (uint)&uStack0000000000000048;
      uVar15 = 1;
      iVar8 = func_0x0029d99c(*in_stack_00000008,(long)*(int *)(in_stack_00000008 + 1));
      if (0 < iVar8) {
        *unaff_x20 = 1;
        func_0x002a34e0(in_stack_00000020);
        cVar3 = *(char *)(unaff_x19 + 0x28);
        goto joined_r0x002afa68;
      }
    }
    param_3 = in_stack_00000028;
    param_4 = unaff_x21;
    iVar8 = func_0x002a27b4(in_stack_00000040,in_stack_00000030);
    uVar15 = (uint)param_4;
    uVar10 = (uint)param_3;
    unaff_x24 = in_stack_00000040;
    in_stack_00000010._4_4_ = in_stack_00000010._4_4_ + 1;
  } while (iVar8 != 0);
LAB_002afa70:
  uVar14 = 0;
  func_0x002a34e0(in_stack_00000020);
  cVar3 = *(char *)(unaff_x19 + 0x28);
joined_r0x002afa68:
  if (cVar3 != '\0') {
    return uVar14;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar17 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar17;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar17 * 8);
    return uVar14;
  }
  auVar90 = func_0x0079db4c();
  iVar8 = auVar90._8_4_;
  plVar13 = auVar90._0_8_;
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
      uVar2 = -(iVar8 - 1U);
      uVar26 = iVar8 - 1U & 0x3f;
      if (-1 < (int)uVar2) {
        uVar26 = -(uVar2 & 0x3f);
      }
      lVar17 = (long)((ulong)uVar25 << 0x20) >> 0x26;
      uVar14 = func_0x0029afb8(plVar13,lVar17);
      if ((int)uVar14 == 0) {
        return uVar14;
      }
      uVar19 = 0xffffffffffffffff;
      if ((int)uVar26 < 0x3f) {
        uVar19 = ~(-1L << ((ulong)(uVar26 + 1) & 0x3f));
      }
      func_0x002b0104(*plVar13,lVar17 << 3,&UNK_00831b38);
      puVar18 = (ulong *)*plVar13;
      lVar21 = (long)((int)uVar25 >> 6);
      lVar17 = lVar21 + -1;
      uVar19 = puVar18[lVar17] & uVar19;
      puVar18[lVar17] = uVar19;
      if (uVar10 != 0xffffffff) {
        if ((iVar8 < 2) || (uVar10 != 1)) {
          uVar22 = 1L << ((ulong)uVar26 & 0x3f);
        }
        else {
          if (uVar26 == 0) {
            puVar18[lVar17] = uVar19 | 1;
            puVar18[lVar21 + -2] = puVar18[lVar21 + -2] | 0x8000000000000000;
            goto code_r0x002afc68;
          }
          uVar22 = 3L << ((ulong)(uVar26 - 1) & 0x3f);
        }
        puVar18[lVar17] = uVar19 | uVar22;
      }
code_r0x002afc68:
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

