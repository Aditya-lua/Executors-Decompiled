
uint FUN_001283d4(undefined1 *param_1,undefined1 param_2 [16],float param_3)

{
  int iVar1;
  short sVar2;
  bool bVar3;
  bool in_ZR;
  bool bVar4;
  int iVar5;
  ulong uVar6;
  undefined8 uVar7;
  uint uVar8;
  undefined4 uVar9;
  undefined8 *puVar10;
  undefined4 uVar11;
  long lVar12;
  long lVar13;
  uint uVar14;
  undefined8 uVar15;
  uint *unaff_x20;
  uint unaff_w21;
  undefined8 uVar16;
  uint uVar17;
  uint uVar18;
  ulong unaff_x22;
  long unaff_x23;
  uint *puVar19;
  uint uVar20;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x27;
  long unaff_x28;
  float fVar21;
  float fVar22;
  float fVar23;
  uint uStack000000000000001c;
  uint uStack0000000000000024;
  uint uStack000000000000002c;
  undefined1 *puStack0000000000000030;
  long in_stack_00000038;
  byte *in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined4 uStack0000000000000058;
  float fStack000000000000005c;
  undefined8 uStack0000000000000060;
  float fStack0000000000000068;
  float fStack000000000000006c;
  
  uStack000000000000002c = unaff_w21 | 0x100000;
  if (!in_ZR || unaff_x23 != 0) {
    uStack000000000000002c = unaff_w21;
  }
  uVar14 = *unaff_x20;
  uVar17 = (uint)unaff_x22;
  puStack0000000000000030 = param_1;
  if ((uVar17 != 0) && (0 < (int)uVar14)) {
    lVar13 = 0;
    lVar12 = *(long *)(unaff_x20 + 2);
    do {
      if (*(uint *)(lVar12 + lVar13) == uVar17) {
        bVar3 = false;
        puVar19 = (uint *)(lVar12 + lVar13);
        goto LAB_0012850c;
      }
      lVar13 = lVar13 + 0x2c;
    } while ((ulong)uVar14 * 0x2c != lVar13);
  }
  if (uVar14 == unaff_x20[1]) {
    uVar18 = uVar14;
    if ((int)uVar14 < 0) {
      uVar18 = uVar14 + 1;
    }
    uVar20 = 8;
    if (uVar14 != 0) {
      uVar20 = uVar14 + ((int)uVar18 >> 1);
    }
    if ((int)uVar20 <= (int)(uVar14 + 1)) {
      uVar20 = uVar14 + 1;
    }
    lVar13 = func_0x000b810c((long)(int)uVar20 * 0x2c);
    if (*(long *)(unaff_x20 + 2) != 0) {
      _memcpy(lVar13,*(long *)(unaff_x20 + 2),(long)(int)*unaff_x20 * 0x2c);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
    }
    *(long *)(unaff_x20 + 2) = lVar13;
    unaff_x20[1] = uVar20;
    uVar14 = *unaff_x20;
  }
  else {
    lVar13 = *(long *)(unaff_x20 + 2);
  }
  puVar10 = (undefined8 *)(lVar13 + (long)(int)uVar14 * 0x2c);
  *puVar10 = 0;
  puVar10[1] = 0xffffffffffffffff;
  puVar10[2] = 0;
  puVar10[3] = 0xbf80000000000000;
  puVar10[4] = 0xffffffffffffffff;
  *(undefined4 *)(puVar10 + 5) = 0;
  uVar14 = *unaff_x20;
  *unaff_x20 = uVar14 + 1;
  lVar12 = *(long *)(unaff_x20 + 2);
  puVar19 = (uint *)(lVar12 + (long)(int)uVar14 * 0x2c);
  *puVar19 = uVar17;
  bVar3 = true;
  *(undefined1 *)((long)unaff_x20 + 0x75) = 1;
LAB_0012850c:
  uVar14 = uStack000000000000002c;
  *(short *)(unaff_x20 + 0x1e) = (short)((uint)((int)puVar19 - (int)lVar12) >> 2) * -0x745d;
  lVar13 = *unaff_x25;
  fVar21 = (float)func_0x000bc968(0xbf800000,in_stack_00000038,0,1);
  if ((puStack0000000000000030 != (undefined1 *)0x0) || (fVar22 = 1.0, (uVar14 & 1) != 0)) {
    fVar22 = *(float *)(&UNK_0000393c + lVar13) + *(float *)(&UNK_00003d38 + lVar13);
  }
  fVar23 = *(float *)(&UNK_00003928 + lVar13);
  fVar21 = fVar21 + *(float *)(&UNK_00003924 + lVar13) + *(float *)(&UNK_00003924 + lVar13) + fVar22
  ;
  if (*(float *)(&UNK_00003d38 + *unaff_x25) * 20.0 <= fVar21) {
    fVar21 = *(float *)(&UNK_00003d38 + *unaff_x25) * 20.0;
  }
  puVar19[7] = 0xbf800000;
  if ((*in_stack_00000040 & 1) != 0) {
    fVar21 = *(float *)(in_stack_00000040 + 0x10);
    puVar19[7] = (uint)fVar21;
  }
  if (bVar3) {
    fVar22 = 1.0;
    if (1.0 < fVar21) {
      fVar22 = fVar21;
    }
    puVar19[5] = (uint)fVar22;
  }
  puVar19[6] = (uint)fVar21;
  sVar2 = *(short *)((long)unaff_x20 + 0x76);
  *(short *)((long)unaff_x20 + 0x76) = sVar2 + 1;
  *(short *)(puVar19 + 9) = sVar2;
  uVar17 = *(uint *)(&UNK_00003f58 + unaff_x27);
  if ((uVar14 & 1) == 0) {
    uVar18 = unaff_x20[10];
    uVar20 = puVar19[2];
    uStack0000000000000024 = unaff_x20[4];
    bVar4 = false;
    puVar19[1] = uVar14;
    puVar19[2] = uVar17;
  }
  else {
    bVar4 = (puVar19[1] & 1) == 0;
    uVar18 = unaff_x20[10];
    uVar20 = puVar19[2];
    uStack0000000000000024 = unaff_x20[4];
    puVar19[1] = uVar14;
    puVar19[2] = uVar17;
  }
  if (unaff_x24 == 0) {
    uVar8 = unaff_x20[0x24];
    uVar14 = 0;
    if (uVar8 != 0) {
      uVar14 = uVar8 - 1;
    }
    puVar19[8] = uVar14;
    lVar13 = _strlen(in_stack_00000038);
    uVar14 = uStack000000000000002c;
    func_0x000ba48c(unaff_x20 + 0x24,in_stack_00000038,in_stack_00000038 + lVar13 + 1);
    unaff_x22 = unaff_x22 & 0xffffffff;
  }
  iVar5 = uVar18 + 1;
  iVar1 = uVar20 + 1;
  uVar18 = (uint)unaff_x22;
  if ((uVar14 >> 0x15 & 1) == 0) {
    if ((((iVar1 < (int)uVar17) && (((byte)unaff_x20[4] >> 1 & 1) != 0)) && (unaff_x20[7] == 0)) &&
       (((int)uVar17 <= iVar5 || (unaff_x20[6] == 0)))) {
      unaff_x20[7] = *puVar19;
    }
    if (((uVar14 >> 1 & 1) != 0) && (unaff_x20[6] != uVar18)) {
      unaff_x20[7] = *puVar19;
    }
  }
  if (unaff_x20[8] == uVar18) {
    uVar20 = 1;
    *(undefined1 *)(unaff_x20 + 0x1d) = 1;
  }
  else {
    uVar20 = 0;
    if ((unaff_x20[6] == 0) && (iVar5 < (int)uVar17)) {
      if (*unaff_x20 == 1) {
        uVar20 = (uint)((unaff_x20[4] & 2) == 0);
      }
      else {
        uVar20 = 0;
      }
    }
  }
  if ((int)uVar17 <= iVar5) {
    bVar3 = true;
  }
  if ((iVar1 < (int)uVar17) && (bVar3)) {
    uStack0000000000000060 = 0;
    _fStack0000000000000068 = 0;
    func_0x000d0e24(&uStack0000000000000060,unaff_x22,0,8);
    uVar17 = 0;
    if ((uVar14 & 0x200000) == 0) {
      uVar17 = uVar20;
    }
    return uVar17;
  }
  if (unaff_x20[6] == uVar18) {
    puVar19[3] = *(uint *)(&UNK_00003f58 + unaff_x27);
  }
  uVar14 = puVar19[1];
  uStack0000000000000060._0_4_ = (float)puVar19[4];
  fStack0000000000000068 = (float)puVar19[5];
  if ((uVar14 & 0xc0) == 0) {
    fVar21 = (float)(int)((float)uStack0000000000000060 - (float)unaff_x20[0x13]);
    uStack0000000000000060._0_4_ = (float)unaff_x20[0xb];
  }
  else {
    fVar21 = (float)unaff_x20[0xb];
  }
  uVar16 = *(undefined8 *)(unaff_x28 + 0x110);
  uStack0000000000000060._0_4_ = (float)uStack0000000000000060 + fVar21;
  uStack0000000000000060._4_4_ = (float)unaff_x20[0xc] + 0.0;
  *(float *)(unaff_x28 + 0x110) = (float)uStack0000000000000060;
  *(float *)(unaff_x28 + 0x114) = uStack0000000000000060._4_4_;
  fStack0000000000000068 = fStack0000000000000068 + (float)uStack0000000000000060;
  fStack000000000000006c = param_3 + fVar23 * 2.0 + uStack0000000000000060._4_4_;
  if ((uVar14 & 0xc0) == 0) {
    fVar21 = (float)unaff_x20[0x17];
    if ((fVar21 <= (float)uStack0000000000000060) &&
       (fStack0000000000000068 <= (float)unaff_x20[0x18])) goto code_r0x001287d8;
    uStack0000000000000058 = (float)uStack0000000000000060;
    if ((float)uStack0000000000000060 < fVar21) {
      uStack0000000000000058 = fVar21;
    }
    fStack000000000000005c = uStack0000000000000060._4_4_ + -1.0;
    bVar3 = true;
    uStack0000000000000050._0_4_ = (float)unaff_x20[0x18];
    uStack0000000000000050._4_4_ = fStack000000000000006c;
    func_0x000cde90(&uStack0000000000000058,&uStack0000000000000050,1);
  }
  else {
code_r0x001287d8:
    bVar3 = false;
  }
  uVar15 = *(undefined8 *)(unaff_x28 + 0x128);
  uStack0000000000000058 = fStack0000000000000068 - (float)uStack0000000000000060;
  fStack000000000000005c = fStack000000000000006c - uStack0000000000000060._4_4_;
  func_0x000d0d0c(*(undefined4 *)(&UNK_00003928 + unaff_x27),&uStack0000000000000058);
  *(undefined8 *)(unaff_x28 + 0x128) = uVar15;
  uVar6 = func_0x000d0e24(&uStack0000000000000060,unaff_x22,0,0);
  uVar14 = uStack000000000000002c;
  if ((uVar6 & 1) == 0) {
    if (bVar3) {
      func_0x000cdeec();
    }
    *(undefined8 *)(unaff_x28 + 0x110) = uVar16;
    return uVar20;
  }
  uVar8 = 0x1010;
  if ((uStack000000000000002c & 0x200000) != 0) {
    uVar8 = 0x1020;
  }
  if (in_stack_00000040[0x3c4] != 0) {
    uVar8 = uVar8 | 0x200;
  }
  uStack000000000000001c =
       func_0x0010b53c(&uStack0000000000000060,unaff_x22,&uStack0000000000000058,
                       &uStack0000000000000050,uVar8);
  if (((uVar14 >> 0x15 & 1) == 0) && (uStack000000000000001c != 0)) {
    unaff_x20[7] = *puVar19;
  }
  if ((((((char)uStack0000000000000050 != '\0') && ((int)uVar17 <= iVar1)) &&
       (iVar5 = func_0x000d7228(0xbf800000,0), iVar5 != 0)) &&
      ((in_stack_00000040[0x3c4] == 0 && ((unaff_x20[4] & 1) != 0)))) &&
     (((*(float *)(unaff_x27 + 0xe8) < 0.0 &&
       (fVar21 = *(float *)(unaff_x27 + 0xe40), fVar21 < (float)uStack0000000000000060)) ||
      ((0.0 < *(float *)(unaff_x27 + 0xe8) &&
       (fVar21 = *(float *)(unaff_x27 + 0xe40), fStack0000000000000068 < fVar21)))))) {
    func_0x00128004(fVar21,*(undefined4 *)(unaff_x27 + 0xe44));
  }
  uVar15 = *(undefined8 *)(unaff_x28 + 0x2a8);
  if ((char)uStack0000000000000050 == '\0' && (char)uStack0000000000000058 == '\0') {
    if (uVar20 == 0) {
      uVar9 = 0x21;
      uVar11 = 0x24;
    }
    else {
      uVar9 = 0x23;
      uVar11 = 0x25;
    }
    if ((uStack0000000000000024 & 0x200000) != 0) {
      uVar11 = uVar9;
    }
  }
  else {
    uVar11 = 0x22;
  }
  uVar7 = func_0x000bba44(0x3f800000,uVar11);
  func_0x00128c4c(uVar15,&uStack0000000000000060,uVar14,uVar7);
  func_0x000bd308(&uStack0000000000000060,unaff_x22,1);
  iVar5 = func_0x000c2648(0x20);
  if (iVar5 != 0) {
    uVar6 = func_0x000cfd38(1,0);
    if ((uVar6 & 1) == 0) {
      uVar6 = func_0x000d6f58(1);
      if (((uVar14 >> 0x15 & 1) != 0) || ((uVar6 & 1) == 0)) goto LAB_001289f4;
    }
    else if ((uVar14 >> 0x15 & 1) != 0) goto LAB_001289f4;
    unaff_x20[7] = *puVar19;
  }
LAB_001289f4:
  uVar17 = unaff_x20[4];
  if (puStack0000000000000030 == (undefined1 *)0x0) {
    uVar7 = 0;
  }
  else {
    uVar7 = func_0x000d5210("#CLOSE",0,unaff_x22);
  }
  uVar8 = uVar14 & 0xfffffffe;
  if (!bVar4) {
    uVar8 = uVar14;
  }
  func_0x00128ffc(unaff_x20[0x20],unaff_x20[0x21],uVar15,&uStack0000000000000060,
                  uVar17 >> 1 & 4 | uVar8,in_stack_00000038,unaff_x22,uVar7,uVar20,
                  (long)&uStack0000000000000048 + 7);
  if ((puStack0000000000000030 != (undefined1 *)0x0) && (uStack0000000000000048._7_1_ != '\0')) {
    *puStack0000000000000030 = 0;
    if ((puVar19[1] >> 0x15 & 1) == 0) {
      if ((puVar19[1] & 0x101) == 0) {
        *(undefined1 *)(puVar19 + 10) = 1;
        if (unaff_x20[8] == *puVar19) {
          puVar19[2] = 0xffffffff;
          unaff_x20[6] = 0;
          unaff_x20[7] = 0;
        }
      }
      else if (unaff_x20[8] != *puVar19) {
        unaff_x20[7] = *puVar19;
      }
    }
  }
  if (bVar3) {
    func_0x000cdeec();
  }
  *(undefined8 *)(unaff_x28 + 0x110) = uVar16;
  if ((((uStack0000000000000048._6_1_ != '\0') && (*(uint *)(&UNK_00004050 + unaff_x27) == uVar18))
      && ((char)uStack0000000000000050 == '\0')) &&
     ((((byte)unaff_x20[4] >> 5 & 1) == 0 && (((byte)puVar19[1] >> 4 & 1) == 0)))) {
    func_0x000bc0e8(in_stack_00000038,0);
    func_0x000d9148("%.*s");
  }
  if ((uStack000000000000002c & 0x200000) != 0) {
    uVar20 = uStack000000000000001c;
  }
  return uVar20;
}

