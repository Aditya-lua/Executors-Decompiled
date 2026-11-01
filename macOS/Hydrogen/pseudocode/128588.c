
uint FUN_00128588(float param_1)

{
  int iVar1;
  int iVar2;
  int iVar3;
  short sVar4;
  uint uVar5;
  bool bVar6;
  bool bVar7;
  int iVar8;
  long lVar9;
  ulong uVar10;
  undefined8 uVar11;
  uint uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  uint unaff_w19;
  undefined8 uVar15;
  int *unaff_x20;
  int unaff_w21;
  undefined8 uVar16;
  int iVar17;
  ulong unaff_x22;
  int *unaff_x23;
  uint uVar18;
  long unaff_x24;
  long unaff_x27;
  long unaff_x28;
  float fVar19;
  float unaff_s8;
  float unaff_s9;
  uint uStack000000000000001c;
  uint uStack0000000000000024;
  ulong in_stack_00000028;
  undefined1 *in_stack_00000030;
  long in_stack_00000038;
  byte *in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined4 uStack0000000000000058;
  float fStack000000000000005c;
  undefined8 uStack0000000000000060;
  float fStack0000000000000068;
  float fStack000000000000006c;
  
  unaff_x23[7] = -0x40800000;
  if ((*in_stack_00000040 & 1) != 0) {
    param_1 = *(float *)(in_stack_00000040 + 0x10);
    unaff_x23[7] = (int)param_1;
  }
  if (unaff_w21 != 0) {
    fVar19 = 1.0;
    if (1.0 < param_1) {
      fVar19 = param_1;
    }
    unaff_x23[5] = (int)fVar19;
  }
  unaff_x23[6] = (int)param_1;
  sVar4 = *(short *)((long)unaff_x20 + 0x76);
  *(short *)((long)unaff_x20 + 0x76) = sVar4 + 1;
  *(short *)(unaff_x23 + 9) = sVar4;
  iVar8 = *(int *)(&UNK_00003f58 + unaff_x27);
  if ((unaff_w19 & 1) == 0) {
    iVar1 = unaff_x20[10];
    iVar2 = unaff_x23[2];
    uStack0000000000000024 = unaff_x20[4];
    bVar7 = false;
    unaff_x23[1] = unaff_w19;
    unaff_x23[2] = iVar8;
  }
  else {
    bVar7 = (*(byte *)(unaff_x23 + 1) & 1) == 0;
    iVar1 = unaff_x20[10];
    iVar2 = unaff_x23[2];
    uStack0000000000000024 = unaff_x20[4];
    unaff_x23[1] = unaff_w19;
    unaff_x23[2] = iVar8;
  }
  if (unaff_x24 == 0) {
    iVar3 = unaff_x20[0x24];
    iVar17 = 0;
    if (iVar3 != 0) {
      iVar17 = iVar3 + -1;
    }
    unaff_x23[8] = iVar17;
    lVar9 = _strlen(in_stack_00000038);
    func_0x000ba48c(unaff_x20 + 0x24,in_stack_00000038,in_stack_00000038 + lVar9 + 1);
    unaff_x22 = unaff_x22 & 0xffffffff;
    unaff_w19 = in_stack_00000028._4_4_;
  }
  iVar1 = iVar1 + 1;
  iVar2 = iVar2 + 1;
  iVar17 = (int)unaff_x22;
  if ((unaff_w19 >> 0x15 & 1) == 0) {
    if ((((iVar2 < iVar8) && ((*(byte *)(unaff_x20 + 4) >> 1 & 1) != 0)) && (unaff_x20[7] == 0)) &&
       ((iVar8 <= iVar1 || (unaff_x20[6] == 0)))) {
      unaff_x20[7] = *unaff_x23;
    }
    if (((unaff_w19 >> 1 & 1) != 0) && (unaff_x20[6] != iVar17)) {
      unaff_x20[7] = *unaff_x23;
    }
  }
  if (unaff_x20[8] == iVar17) {
    uVar18 = 1;
    *(undefined1 *)(unaff_x20 + 0x1d) = 1;
  }
  else {
    uVar18 = 0;
    if ((unaff_x20[6] == 0) && (iVar1 < iVar8)) {
      if (*unaff_x20 == 1) {
        uVar18 = (uint)((*(byte *)(unaff_x20 + 4) & 2) == 0);
      }
      else {
        uVar18 = 0;
      }
    }
  }
  if (iVar8 <= iVar1) {
    unaff_w21 = 1;
  }
  if ((iVar2 < iVar8) && (unaff_w21 != 0)) {
    uStack0000000000000060 = 0;
    _fStack0000000000000068 = 0;
    func_0x000d0e24(&uStack0000000000000060,unaff_x22,0,8);
    uVar12 = 0;
    if ((unaff_w19 & 0x200000) == 0) {
      uVar12 = uVar18;
    }
    return uVar12;
  }
  if (unaff_x20[6] == iVar17) {
    unaff_x23[3] = *(int *)(&UNK_00003f58 + unaff_x27);
  }
  uVar12 = unaff_x23[1];
  uStack0000000000000060._0_4_ = (float)unaff_x23[4];
  fStack0000000000000068 = (float)unaff_x23[5];
  if ((uVar12 & 0xc0) == 0) {
    fVar19 = (float)(int)((float)uStack0000000000000060 - (float)unaff_x20[0x13]);
    uStack0000000000000060._0_4_ = (float)unaff_x20[0xb];
  }
  else {
    fVar19 = (float)unaff_x20[0xb];
  }
  uVar16 = *(undefined8 *)(unaff_x28 + 0x110);
  uStack0000000000000060._0_4_ = (float)uStack0000000000000060 + fVar19;
  uStack0000000000000060._4_4_ = (float)unaff_x20[0xc] + 0.0;
  *(float *)(unaff_x28 + 0x110) = (float)uStack0000000000000060;
  *(float *)(unaff_x28 + 0x114) = uStack0000000000000060._4_4_;
  fStack0000000000000068 = fStack0000000000000068 + (float)uStack0000000000000060;
  fStack000000000000006c = unaff_s8 + unaff_s9 * 2.0 + uStack0000000000000060._4_4_;
  if ((uVar12 & 0xc0) == 0) {
    fVar19 = (float)unaff_x20[0x17];
    if ((fVar19 <= (float)uStack0000000000000060) &&
       (fStack0000000000000068 <= (float)unaff_x20[0x18])) goto code_r0x001287d8;
    uStack0000000000000058 = (float)uStack0000000000000060;
    if ((float)uStack0000000000000060 < fVar19) {
      uStack0000000000000058 = fVar19;
    }
    fStack000000000000005c = uStack0000000000000060._4_4_ + -1.0;
    bVar6 = true;
    uStack0000000000000050._0_4_ = (float)unaff_x20[0x18];
    uStack0000000000000050._4_4_ = fStack000000000000006c;
    func_0x000cde90(&uStack0000000000000058,&uStack0000000000000050,1);
  }
  else {
code_r0x001287d8:
    bVar6 = false;
  }
  uVar15 = *(undefined8 *)(unaff_x28 + 0x128);
  uStack0000000000000058 = fStack0000000000000068 - (float)uStack0000000000000060;
  fStack000000000000005c = fStack000000000000006c - uStack0000000000000060._4_4_;
  func_0x000d0d0c(*(undefined4 *)(&UNK_00003928 + unaff_x27),&uStack0000000000000058);
  *(undefined8 *)(unaff_x28 + 0x128) = uVar15;
  uVar10 = func_0x000d0e24(&uStack0000000000000060,unaff_x22,0,0);
  if ((uVar10 & 1) == 0) {
    if (bVar6) {
      func_0x000cdeec();
    }
    *(undefined8 *)(unaff_x28 + 0x110) = uVar16;
    return uVar18;
  }
  uVar12 = 0x1010;
  if ((in_stack_00000028 & 0x20000000000000) != 0) {
    uVar12 = 0x1020;
  }
  if (in_stack_00000040[0x3c4] != 0) {
    uVar12 = uVar12 | 0x200;
  }
  uStack000000000000001c =
       func_0x0010b53c(&uStack0000000000000060,unaff_x22,&uStack0000000000000058,
                       &uStack0000000000000050,uVar12);
  if (((in_stack_00000028._4_4_ >> 0x15 & 1) == 0) && (uStack000000000000001c != 0)) {
    unaff_x20[7] = *unaff_x23;
  }
  if ((((((char)uStack0000000000000050 != '\0') && (iVar8 <= iVar2)) &&
       (iVar8 = func_0x000d7228(0xbf800000,0), iVar8 != 0)) &&
      ((in_stack_00000040[0x3c4] == 0 && ((*(byte *)(unaff_x20 + 4) & 1) != 0)))) &&
     (((*(float *)(unaff_x27 + 0xe8) < 0.0 &&
       (fVar19 = *(float *)(unaff_x27 + 0xe40), fVar19 < (float)uStack0000000000000060)) ||
      ((0.0 < *(float *)(unaff_x27 + 0xe8) &&
       (fVar19 = *(float *)(unaff_x27 + 0xe40), fStack0000000000000068 < fVar19)))))) {
    func_0x00128004(fVar19,*(undefined4 *)(unaff_x27 + 0xe44));
  }
  uVar15 = *(undefined8 *)(unaff_x28 + 0x2a8);
  if ((char)uStack0000000000000050 == '\0' && (char)uStack0000000000000058 == '\0') {
    if (uVar18 == 0) {
      uVar13 = 0x21;
      uVar14 = 0x24;
    }
    else {
      uVar13 = 0x23;
      uVar14 = 0x25;
    }
    if ((uStack0000000000000024 & 0x200000) != 0) {
      uVar14 = uVar13;
    }
  }
  else {
    uVar14 = 0x22;
  }
  uVar11 = func_0x000bba44(0x3f800000,uVar14);
  func_0x00128c4c(uVar15,&uStack0000000000000060,in_stack_00000028._4_4_,uVar11);
  func_0x000bd308(&uStack0000000000000060,unaff_x22,1);
  iVar8 = func_0x000c2648(0x20);
  if (iVar8 != 0) {
    uVar10 = func_0x000cfd38(1,0);
    if ((uVar10 & 1) == 0) {
      uVar10 = func_0x000d6f58(1);
      if (((in_stack_00000028._4_4_ >> 0x15 & 1) != 0) || ((uVar10 & 1) == 0)) goto LAB_001289f4;
    }
    else if ((in_stack_00000028._4_4_ >> 0x15 & 1) != 0) goto LAB_001289f4;
    unaff_x20[7] = *unaff_x23;
  }
LAB_001289f4:
  uVar12 = unaff_x20[4];
  if (in_stack_00000030 == (undefined1 *)0x0) {
    uVar11 = 0;
  }
  else {
    uVar11 = func_0x000d5210("#CLOSE",0,unaff_x22);
  }
  uVar5 = in_stack_00000028._4_4_ & 0xfffffffe;
  if (!bVar7) {
    uVar5 = in_stack_00000028._4_4_;
  }
  func_0x00128ffc(unaff_x20[0x20],unaff_x20[0x21],uVar15,&uStack0000000000000060,
                  uVar12 >> 1 & 4 | uVar5,in_stack_00000038,unaff_x22,uVar11,uVar18,
                  (long)&uStack0000000000000048 + 7);
  if ((in_stack_00000030 != (undefined1 *)0x0) && (uStack0000000000000048._7_1_ != '\0')) {
    *in_stack_00000030 = 0;
    if (((uint)unaff_x23[1] >> 0x15 & 1) == 0) {
      if ((unaff_x23[1] & 0x101U) == 0) {
        *(undefined1 *)(unaff_x23 + 10) = 1;
        if (unaff_x20[8] == *unaff_x23) {
          unaff_x23[2] = -1;
          unaff_x20[6] = 0;
          unaff_x20[7] = 0;
        }
      }
      else if (unaff_x20[8] != *unaff_x23) {
        unaff_x20[7] = *unaff_x23;
      }
    }
  }
  if (bVar6) {
    func_0x000cdeec();
  }
  *(undefined8 *)(unaff_x28 + 0x110) = uVar16;
  if ((((uStack0000000000000048._6_1_ != '\0') && (*(int *)(&UNK_00004050 + unaff_x27) == iVar17))
      && ((char)uStack0000000000000050 == '\0')) &&
     (((*(byte *)(unaff_x20 + 4) >> 5 & 1) == 0 && ((*(byte *)(unaff_x23 + 1) >> 4 & 1) == 0)))) {
    func_0x000bc0e8(in_stack_00000038,0);
    func_0x000d9148("%.*s");
  }
  if ((in_stack_00000028 & 0x20000000000000) != 0) {
    uVar18 = uStack000000000000001c;
  }
  return uVar18;
}

