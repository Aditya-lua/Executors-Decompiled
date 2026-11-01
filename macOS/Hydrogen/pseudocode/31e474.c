
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0031e474(code *param_1,undefined8 param_2)

{
  int iVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  int iVar5;
  int iVar6;
  undefined8 uVar7;
  long lVar8;
  ulong *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong *puVar13;
  ulong uVar14;
  long unaff_x19;
  char *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x23;
  ulong uVar15;
  long *unaff_x26;
  undefined8 *unaff_x27;
  ulong unaff_x28;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  undefined1 auVar32 [16];
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  undefined8 uVar42;
  byte bVar49;
  byte bVar50;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  undefined8 uVar51;
  byte bVar58;
  byte bVar59;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  undefined8 uVar60;
  byte bVar67;
  ulong uVar68;
  ulong uVar69;
  ulong uVar70;
  ulong uVar71;
  ulong uVar72;
  ulong uVar73;
  ulong uVar74;
  undefined1 auVar75 [16];
  int iStack0000000000000010;
  int iStack0000000000000014;
  undefined8 *in_stack_00000018;
  int iStack0000000000000020;
  undefined8 uStack0000000000000028;
  int aiStack_23c [11];
  undefined8 uStack_210;
  undefined2 uStack_208;
  undefined5 uStack_200;
  undefined3 uStack_1fb;
  undefined5 uStack_1f8;
  undefined8 uStack_1f0;
  undefined6 uStack_1e8;
  undefined2 uStack_1e2;
  undefined6 uStack_1e0;
  undefined1 auStack_1d8 [64];
  long lStack_198;
  undefined1 **ppuStack_190;
  undefined8 uStack_188;
  undefined1 auStack_178 [32];
  long lStack_158;
  undefined1 *puStack_150;
  undefined8 uStack_148;
  undefined1 auStack_140 [64];
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_30;
  long lStack_28;
  ulong uStack_20;
  undefined1 auStack_6 [6];
  
code_r0x0031e474:
  (*param_1)(param_2);
code_r0x0031e47c:
  iVar6 = 1;
code_r0x0031e480:
  uVar7 = 0;
  unaff_x28 = (ulong)((int)unaff_x28 + 1);
  if ((iVar6 != 0) && (uVar7 = func_0x002afac4(), (int)uVar7 != 0)) {
    do {
      if (unaff_x20 != (char *)0x0) {
        if (*unaff_x20 == '\x01') {
          uVar7 = (**(code **)(unaff_x20 + 0x10))(0,unaff_x28);
          if ((int)uVar7 == 0) break;
        }
        else {
          if (*unaff_x20 != '\x02') goto code_r0x0031e490;
          (**(code **)(unaff_x20 + 0x10))(0,unaff_x28);
        }
      }
      if (unaff_x23 == 0) {
code_r0x0031e270:
        iVar6 = iStack0000000000000020;
        if ((_iStack0000000000000020 & 0x100000000) == 0) {
          iVar1 = (int)unaff_x26[2];
          if (iVar1 != *(int *)(in_stack_00000018 + 2)) {
            if (iVar1 != 0) goto code_r0x0031e1b4;
            goto code_r0x0031e28c;
          }
          iVar5 = func_0x0029d99c(*unaff_x26,(long)(int)unaff_x26[1],*in_stack_00000018,
                                  (long)*(int *)(in_stack_00000018 + 1));
          iVar6 = -iVar5;
          if (iVar1 == 0) {
            iVar6 = iVar5;
          }
        }
        if (0 < iVar6) goto code_r0x0031e28c;
      }
      else {
        uVar7 = func_0x002ab730();
        if ((int)uVar7 == 0) break;
        iVar6 = *(int *)(unaff_x27 + 2);
        if (iVar6 == *(int *)(unaff_x21 + 2)) {
          iVar5 = func_0x0029d99c(*unaff_x27,(long)*(int *)(unaff_x27 + 1),*unaff_x21,
                                  (long)*(int *)(unaff_x21 + 1));
          iVar1 = -iVar5;
          if (iVar6 == 0) {
            iVar1 = iVar5;
          }
          if (0 < iVar1) goto code_r0x0031e270;
        }
        else if (iVar6 == 0) goto code_r0x0031e270;
      }
code_r0x0031e1b4:
      uVar7 = func_0x002afac4();
      unaff_x28 = (ulong)((int)unaff_x28 + 1);
      if ((int)uVar7 == 0) break;
    } while( true );
  }
  goto LAB_0031e494;
code_r0x0031e28c:
  uVar14 = 0x400;
  if ((int)unaff_x26[1] < 0x11) {
    uVar14 = 0x200;
  }
  iVar6 = func_0x002a18a8();
  if (iVar6 == 0) {
    uVar15 = 3;
code_r0x0031e2f4:
    uVar2 = *(uint *)(unaff_x26 + 1);
    if (uVar2 != 0) {
      puVar9 = (ulong *)*unaff_x26;
      uVar15 = *puVar9 ^ uVar15;
      if (1 < (int)uVar2) {
        if (uVar2 < 9) {
          uVar10 = 1;
        }
        else {
          uVar11 = (ulong)uVar2 - 1;
          uVar12 = uVar11 & 0xfffffffffffffff8;
          uVar10 = uVar12 | 1;
          bVar16 = 0;
          bVar17 = 0;
          bVar18 = 0;
          bVar19 = 0;
          bVar20 = 0;
          bVar21 = 0;
          bVar22 = 0;
          bVar23 = 0;
          bVar24 = 0;
          bVar25 = 0;
          bVar26 = 0;
          bVar27 = 0;
          bVar28 = 0;
          bVar29 = 0;
          bVar30 = 0;
          bVar31 = 0;
          auVar75._8_8_ = 0;
          auVar75._0_8_ = uVar15;
          uVar7 = 0;
          uVar42 = 0;
          uVar51 = 0;
          uVar60 = 0;
          puVar13 = puVar9 + 5;
          uVar14 = uVar12;
          do {
            uVar68 = puVar13[-3];
            uVar15 = puVar13[-4];
            uVar70 = puVar13[-1];
            uVar69 = puVar13[-2];
            uVar72 = puVar13[1];
            uVar71 = *puVar13;
            uVar74 = puVar13[3];
            uVar73 = puVar13[2];
            auVar32[0] = (byte)uVar15 | auVar75[0];
            auVar32[1] = (byte)(uVar15 >> 8) | auVar75[1];
            auVar32[2] = (byte)(uVar15 >> 0x10) | auVar75[2];
            auVar32[3] = (byte)(uVar15 >> 0x18) | auVar75[3];
            auVar32[4] = (byte)(uVar15 >> 0x20) | auVar75[4];
            auVar32[5] = (byte)(uVar15 >> 0x28) | auVar75[5];
            auVar32[6] = (byte)(uVar15 >> 0x30) | auVar75[6];
            auVar32[7] = (byte)(uVar15 >> 0x38) | auVar75[7];
            auVar32[8] = (byte)uVar68 | auVar75[8];
            auVar32[9] = (byte)(uVar68 >> 8) | auVar75[9];
            auVar32[10] = (byte)(uVar68 >> 0x10) | auVar75[10];
            auVar32[0xb] = (byte)(uVar68 >> 0x18) | auVar75[0xb];
            auVar32[0xc] = (byte)(uVar68 >> 0x20) | auVar75[0xc];
            auVar32[0xd] = (byte)(uVar68 >> 0x28) | auVar75[0xd];
            auVar32[0xe] = (byte)(uVar68 >> 0x30) | auVar75[0xe];
            auVar32[0xf] = (byte)(uVar68 >> 0x38) | auVar75[0xf];
            bVar16 = (byte)uVar69 | bVar16;
            bVar17 = (byte)(uVar69 >> 8) | bVar17;
            bVar18 = (byte)(uVar69 >> 0x10) | bVar18;
            bVar19 = (byte)(uVar69 >> 0x18) | bVar19;
            bVar20 = (byte)(uVar69 >> 0x20) | bVar20;
            bVar21 = (byte)(uVar69 >> 0x28) | bVar21;
            bVar22 = (byte)(uVar69 >> 0x30) | bVar22;
            bVar23 = (byte)(uVar69 >> 0x38) | bVar23;
            bVar24 = (byte)uVar70 | bVar24;
            bVar25 = (byte)(uVar70 >> 8) | bVar25;
            bVar26 = (byte)(uVar70 >> 0x10) | bVar26;
            bVar27 = (byte)(uVar70 >> 0x18) | bVar27;
            bVar28 = (byte)(uVar70 >> 0x20) | bVar28;
            bVar29 = (byte)(uVar70 >> 0x28) | bVar29;
            bVar30 = (byte)(uVar70 >> 0x30) | bVar30;
            bVar31 = (byte)(uVar70 >> 0x38) | bVar31;
            bVar33 = (byte)uVar71 | (byte)uVar7;
            bVar34 = (byte)(uVar71 >> 8) | (byte)((ulong)uVar7 >> 8);
            bVar35 = (byte)(uVar71 >> 0x10) | (byte)((ulong)uVar7 >> 0x10);
            bVar36 = (byte)(uVar71 >> 0x18) | (byte)((ulong)uVar7 >> 0x18);
            bVar37 = (byte)(uVar71 >> 0x20) | (byte)((ulong)uVar7 >> 0x20);
            bVar38 = (byte)(uVar71 >> 0x28) | (byte)((ulong)uVar7 >> 0x28);
            bVar39 = (byte)(uVar71 >> 0x30) | (byte)((ulong)uVar7 >> 0x30);
            bVar40 = (byte)(uVar71 >> 0x38) | (byte)((ulong)uVar7 >> 0x38);
            uVar7 = CONCAT17(bVar40,CONCAT16(bVar39,CONCAT15(bVar38,CONCAT14(bVar37,CONCAT13(bVar36,
                                                  CONCAT12(bVar35,CONCAT11(bVar34,bVar33)))))));
            bVar41 = (byte)uVar72 | (byte)uVar42;
            bVar43 = (byte)(uVar72 >> 8) | (byte)((ulong)uVar42 >> 8);
            bVar44 = (byte)(uVar72 >> 0x10) | (byte)((ulong)uVar42 >> 0x10);
            bVar45 = (byte)(uVar72 >> 0x18) | (byte)((ulong)uVar42 >> 0x18);
            bVar46 = (byte)(uVar72 >> 0x20) | (byte)((ulong)uVar42 >> 0x20);
            bVar47 = (byte)(uVar72 >> 0x28) | (byte)((ulong)uVar42 >> 0x28);
            bVar48 = (byte)(uVar72 >> 0x30) | (byte)((ulong)uVar42 >> 0x30);
            bVar49 = (byte)(uVar72 >> 0x38) | (byte)((ulong)uVar42 >> 0x38);
            uVar42 = CONCAT17(bVar49,CONCAT16(bVar48,CONCAT15(bVar47,CONCAT14(bVar46,CONCAT13(bVar45
                                                  ,CONCAT12(bVar44,CONCAT11(bVar43,bVar41)))))));
            bVar50 = (byte)uVar73 | (byte)uVar51;
            bVar52 = (byte)(uVar73 >> 8) | (byte)((ulong)uVar51 >> 8);
            bVar53 = (byte)(uVar73 >> 0x10) | (byte)((ulong)uVar51 >> 0x10);
            bVar54 = (byte)(uVar73 >> 0x18) | (byte)((ulong)uVar51 >> 0x18);
            bVar55 = (byte)(uVar73 >> 0x20) | (byte)((ulong)uVar51 >> 0x20);
            bVar56 = (byte)(uVar73 >> 0x28) | (byte)((ulong)uVar51 >> 0x28);
            bVar57 = (byte)(uVar73 >> 0x30) | (byte)((ulong)uVar51 >> 0x30);
            bVar58 = (byte)(uVar73 >> 0x38) | (byte)((ulong)uVar51 >> 0x38);
            uVar51 = CONCAT17(bVar58,CONCAT16(bVar57,CONCAT15(bVar56,CONCAT14(bVar55,CONCAT13(bVar54
                                                  ,CONCAT12(bVar53,CONCAT11(bVar52,bVar50)))))));
            bVar59 = (byte)uVar74 | (byte)uVar60;
            bVar61 = (byte)(uVar74 >> 8) | (byte)((ulong)uVar60 >> 8);
            bVar62 = (byte)(uVar74 >> 0x10) | (byte)((ulong)uVar60 >> 0x10);
            bVar63 = (byte)(uVar74 >> 0x18) | (byte)((ulong)uVar60 >> 0x18);
            bVar64 = (byte)(uVar74 >> 0x20) | (byte)((ulong)uVar60 >> 0x20);
            bVar65 = (byte)(uVar74 >> 0x28) | (byte)((ulong)uVar60 >> 0x28);
            bVar66 = (byte)(uVar74 >> 0x30) | (byte)((ulong)uVar60 >> 0x30);
            bVar67 = (byte)(uVar74 >> 0x38) | (byte)((ulong)uVar60 >> 0x38);
            uVar60 = CONCAT17(bVar67,CONCAT16(bVar66,CONCAT15(bVar65,CONCAT14(bVar64,CONCAT13(bVar63
                                                  ,CONCAT12(bVar62,CONCAT11(bVar61,bVar59)))))));
            uVar14 = uVar14 - 8;
            puVar13 = puVar13 + 8;
            auVar75 = auVar32;
          } while (uVar14 != 0);
          bVar50 = bVar50 | bVar33 | bVar16 | auVar32[0];
          bVar52 = bVar52 | bVar34 | bVar17 | auVar32[1];
          bVar53 = bVar53 | bVar35 | bVar18 | auVar32[2];
          bVar54 = bVar54 | bVar36 | bVar19 | auVar32[3];
          bVar55 = bVar55 | bVar37 | bVar20 | auVar32[4];
          bVar56 = bVar56 | bVar38 | bVar21 | auVar32[5];
          bVar57 = bVar57 | bVar39 | bVar22 | auVar32[6];
          bVar58 = bVar58 | bVar40 | bVar23 | auVar32[7];
          bVar59 = bVar59 | bVar41 | bVar24 | auVar32[8];
          bVar61 = bVar61 | bVar43 | bVar25 | auVar32[9];
          bVar62 = bVar62 | bVar44 | bVar26 | auVar32[10];
          bVar63 = bVar63 | bVar45 | bVar27 | auVar32[0xb];
          bVar64 = bVar64 | bVar46 | bVar28 | auVar32[0xc];
          bVar65 = bVar65 | bVar47 | bVar29 | auVar32[0xd];
          bVar66 = bVar66 | bVar48 | bVar30 | auVar32[0xe];
          bVar67 = bVar67 | bVar49 | bVar31 | auVar32[0xf];
          auVar3[1] = bVar52;
          auVar3[0] = bVar50;
          auVar3[2] = bVar53;
          auVar3[3] = bVar54;
          auVar3[4] = bVar55;
          auVar3[5] = bVar56;
          auVar3[6] = bVar57;
          auVar3[7] = bVar58;
          auVar3[8] = bVar59;
          auVar3[9] = bVar61;
          auVar3[10] = bVar62;
          auVar3[0xb] = bVar63;
          auVar3[0xc] = bVar64;
          auVar3[0xd] = bVar65;
          auVar3[0xe] = bVar66;
          auVar3[0xf] = bVar67;
          auVar4[1] = bVar52;
          auVar4[0] = bVar50;
          auVar4[2] = bVar53;
          auVar4[3] = bVar54;
          auVar4[4] = bVar55;
          auVar4[5] = bVar56;
          auVar4[6] = bVar57;
          auVar4[7] = bVar58;
          auVar4[8] = bVar59;
          auVar4[9] = bVar61;
          auVar4[10] = bVar62;
          auVar4[0xb] = bVar63;
          auVar4[0xc] = bVar64;
          auVar4[0xd] = bVar65;
          auVar4[0xe] = bVar66;
          auVar4[0xf] = bVar67;
          auVar75 = NEON_ext(auVar3,auVar4,8,1);
          uVar15 = CONCAT17(bVar58 | auVar75[7],
                            CONCAT16(bVar57 | auVar75[6],
                                     CONCAT15(bVar56 | auVar75[5],
                                              CONCAT14(bVar55 | auVar75[4],
                                                       CONCAT13(bVar54 | auVar75[3],
                                                                CONCAT12(bVar53 | auVar75[2],
                                                                         CONCAT11(bVar52 | auVar75[1
                                                  ],bVar50 | auVar75[0])))))));
          if (uVar11 == uVar12) goto code_r0x0031e3a0;
        }
        lVar8 = uVar2 - uVar10;
        puVar9 = puVar9 + uVar10;
        do {
          uVar15 = *puVar9 | uVar15;
          lVar8 = lVar8 + -1;
          puVar9 = puVar9 + 1;
        } while (lVar8 != 0);
      }
    }
code_r0x0031e3a0:
    if ((uVar15 == 0) && ((int)unaff_x26[2] == 0)) goto code_r0x0031e3ac;
  }
  else {
    uVar10 = 2;
    do {
      uVar11 = uVar10;
      if (uVar14 == uVar11) goto code_r0x0031e3ac;
      uVar15 = (ulong)*(ushort *)(&UNK_00831e50 + uVar11 * 2);
      iVar6 = func_0x002a18a8();
      uVar10 = uVar11 + 1;
    } while (iVar6 != 0);
    if (uVar11 < uVar14) goto code_r0x0031e2f4;
code_r0x0031e3ac:
    func_0x00373e9c(0xa29210,&DAT_0029be70);
    iVar6 = func_0x0029b6ec();
    if ((iVar6 == 0) || (iVar6 = func_0x002a7d54((long)&uStack0000000000000028 + 4), iVar6 == 0))
    goto code_r0x0031e490;
    if (uStack0000000000000028._4_4_ != 0) {
      iVar6 = func_0x002ae678(&uStack0000000000000028);
      if (iVar6 == 0) goto code_r0x0031e490;
      if ((int)uStack0000000000000028 != 0) {
        uVar7 = 1;
        goto LAB_0031e494;
      }
    }
  }
  if (iStack0000000000000014 == iStack0000000000000010) goto code_r0x0031e4bc;
  iStack0000000000000014 = iStack0000000000000014 + 1;
  if (unaff_x20 == (char *)0x0) goto code_r0x0031e47c;
  if (*unaff_x20 == '\x02') {
    param_1 = *(code **)(unaff_x20 + 0x10);
    param_2 = 2;
    goto code_r0x0031e474;
  }
  if (*unaff_x20 == '\x01') {
    iVar6 = (**(code **)(unaff_x20 + 0x10))(2);
    goto code_r0x0031e480;
  }
code_r0x0031e490:
  uVar7 = 0;
  goto LAB_0031e494;
code_r0x0031e4bc:
  func_0x0028f83c(4,0,0x8d,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3d3);
  uVar7 = 0;
LAB_0031e494:
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar8 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar8;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar8 * 8);
    return;
  }
  func_0x0079db4c(uVar7);
  func_0x0079fba4();
  func_0x0079fbcc();
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_f8 = _UNK_0082fad8;
  uStack_100 = _UNK_0082fad0;
  uStack_e8 = _UNK_0082fae8;
  uStack_f0 = _UNK_0082fae0;
  uStack_d8 = _UNK_0082faf8;
  uStack_e0 = _UNK_0082faf0;
  uStack_c8 = _UNK_0082fb08;
  uStack_d0 = _UNK_0082fb00;
  uStack_c0 = 0;
  uStack_b8 = 0;
  uStack_30 = _UNK_0080be58;
  uStack_20 = unaff_x28;
  func_0x002b603c(&uStack_100,&UNK_00878171,0x10);
  func_0x00300ef8(auStack_140,uStack_30._4_4_,&uStack_100);
  func_0x0036e464(&uStack_100,0xd8);
  func_0x002fd75c(&UNK_00878181,auStack_140,0x40,"SHA-512 KAT");
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return;
  }
  ___stack_chk_fail();
  uStack_148 = 0x31e5c8;
  lStack_158 = *(long *)PTR____stack_chk_guard_009b01e8;
  puStack_150 = auStack_6 + -10;
  func_0x002eafd4(&UNK_008781c1,0x10,auStack_178);
  func_0x002fd75c(&UNK_008781d1,auStack_178,0x20,"SHA3-256 KAT");
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_158) {
    return;
  }
  ___stack_chk_fail();
  uStack_188 = 0x31e63c;
  lStack_198 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_1e0 = 0xb0b0b0b0b0b;
  uStack_1f0 = 0xb0b0b0b0b0b0b0b;
  uStack_1e8 = 0xb0b0b0b0b0b;
  uStack_1e2 = 0xb0b;
  uStack_200 = _UNK_008781f1;
  uStack_1fb = _UNK_008781f6;
  uStack_1f8 = _UNK_008781f9;
  uStack_210 = _UNK_008781fe;
  uStack_208 = 0xf9f8;
  ppuStack_190 = &puStack_150;
  func_0x00373e9c(0xa296c8,&DAT_002c21e4);
  lVar8 = func_0x002dd408(0xa3a728,&uStack_200,0xd,&uStack_1f0,0x16,auStack_1d8,aiStack_23c);
  if (lVar8 == 0) {
    func_0x0028f83c(0x1f,0,0x1c,"/aws-lc/crypto/fipsmodule/hkdf/hkdf.c",0x49);
  }
  else {
    if (iRam0000000000a3a72c != aiStack_23c[0]) {
      func_0x0079eb04();
      goto code_r0x0031e76c;
    }
    func_0x002dd0c0(aiStack_23c,0x2a,0xa3a728,auStack_1d8,aiStack_23c[0],&uStack_210,10);
  }
  func_0x002fd75c(&UNK_00878208,aiStack_23c,0x2a,"HKDF-SHA-256 KAT");
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_198) {
    return;
  }
code_r0x0031e76c:
  auVar75 = ___stack_chk_fail();
                    /* WARNING: Could not recover jumptable at 0x007b2f8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____assert_rtn_00a24af8)(auVar75._0_8_,auVar75._8_8_,0xe5);
  return;
}

