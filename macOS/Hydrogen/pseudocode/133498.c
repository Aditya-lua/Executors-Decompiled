
void FUN_00133498(undefined4 param_1)

{
  int *piVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  short sVar7;
  uint uVar8;
  bool bVar9;
  bool bVar10;
  char in_NG;
  char in_OV;
  int iVar11;
  undefined8 uVar12;
  long lVar13;
  ulong extraout_x1;
  long lVar14;
  int *piVar15;
  undefined4 uVar16;
  ulong uVar17;
  int iVar18;
  long *unaff_x21;
  long unaff_x22;
  char *pcVar19;
  long unaff_x26;
  float fVar20;
  float fVar21;
  float fVar22;
  float fVar23;
  float fVar24;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  undefined4 unaff_s11;
  float fVar25;
  float unaff_s13;
  undefined4 uStack0000000000000008;
  undefined4 uStack000000000000000c;
  float in_stack_00000018;
  int iStack000000000000001c;
  long in_stack_00000020;
  undefined4 uStack0000000000000060;
  undefined4 uStack0000000000000064;
  undefined4 in_stack_00000068;
  float fStack000000000000006c;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  float fStack0000000000000088;
  long in_stack_00000090;
  
  if (in_NG != in_OV) {
    unaff_s11 = param_1;
  }
  lVar14 = *(long *)(&UNK_00004e18 + *unaff_x21);
  if (*(float *)(lVar14 + 0x7c) <= *(float *)(lVar14 + 300)) {
    *(undefined4 *)(lVar14 + 0x9c) = 0;
  }
  func_0x000cde90();
  func_0x000bba44(0x3e800000,0x2a);
  func_0x000f3bb0(0);
  uStack0000000000000070 = CONCAT44(*(undefined4 *)(unaff_x26 + 0x134),unaff_s11);
  func_0x000cde90(&uStack0000000000000070,unaff_x26 + 0x138,1);
  uStack0000000000000060 = *(undefined4 *)(unaff_x26 + 0x110);
  uStack0000000000000064 = *(undefined4 *)(unaff_x26 + 0x134);
  in_stack_00000068 = *(undefined4 *)(unaff_x26 + 0x118);
  fStack000000000000006c = unaff_s10 + *(float *)(in_stack_00000020 + 0x114);
  uVar12 = func_0x000d53ec("##AngledHeaders");
  func_0x0010b53c(&uStack0000000000000060,uVar12,0,0,0);
  func_0x000c36b4(uVar12);
  if (*(short *)(unaff_x26 + 0x78) == 0) {
    lVar14 = unaff_x26 + 0x1a8;
    sVar7 = *(short *)(unaff_x26 + 0x20e);
  }
  else {
    lVar14 = *(long *)(unaff_x26 + 0x1c8) + (long)(int)*(short *)(unaff_x26 + 0x78) * 0x18 + -0x18;
    sVar7 = *(short *)(unaff_x26 + 0x20e);
  }
  iStack000000000000001c = (int)sVar7;
  if ((iStack000000000000001c == -1) &&
     ((((iStack000000000000001c = (int)*(short *)(unaff_x26 + 0x20a), iStack000000000000001c == -1
        || (*(int *)(lVar14 + 0x10) != 0)) || (*(short *)(unaff_x26 + 0x20c) != -1)) ||
      (((*(int *)(&UNK_00004064 + unaff_x22) != 0 &&
        (*(int *)(&UNK_00004064 + unaff_x22) != (int)uVar12)) &&
       ((*(char *)(unaff_x26 + 0x245) == '\0' && ((&UNK_00004d4c)[unaff_x22] == '\0')))))))) {
    iStack000000000000001c = -1;
  }
  iVar18 = *(int *)(unaff_x26 + 0x6c);
  fVar22 = 0.0;
  if (0 < iVar18) {
    fVar20 = unaff_s10 / -in_stack_00000018;
    fVar25 = unaff_s13 * fVar20;
    bVar10 = true;
    do {
      bVar9 = bVar10;
      if (0 < iVar18) {
        uVar17 = 0;
        do {
          if ((*(uint *)(*(long *)(unaff_x26 + 0x48) + (uVar17 >> 5 & 0x7ffffff) * 4) >>
               (ulong)((uint)uVar17 & 0x1f) & 1) != 0) {
            sVar7 = *(short *)(*(long *)(unaff_x26 + 0x28) + uVar17 * 2);
            if ((*(byte *)(*(long *)(unaff_x26 + 0x18) + (long)(int)sVar7 * 0x70 + 2) >> 2 & 1) != 0
               ) {
              lVar14 = *(long *)(unaff_x26 + 0x18) + (long)(int)sVar7 * 0x70;
              fVar21 = *(float *)(lVar14 + 0xc);
              uStack0000000000000070 = CONCAT44(fStack000000000000006c,fVar21);
              fVar24 = *(float *)(lVar14 + 8);
              in_stack_00000078 = CONCAT44(fStack000000000000006c,fVar24);
              fVar23 = in_stack_00000018 * fVar20 + fStack000000000000006c;
              in_stack_00000080 = CONCAT44(fVar23,fVar25 + fVar24);
              _fStack0000000000000088 = CONCAT44(fVar23,fVar25 + fVar21);
              iVar18 = (int)sVar7;
              if (bVar9) {
                func_0x000bba44(0x3f800000,0x2a);
                func_0x000f40b8();
                if (iStack000000000000001c == iVar18) {
                  func_0x000bba44(0x3f800000,0x18);
                  func_0x000f40b8();
                }
                if (fVar22 < fStack0000000000000088) {
                  fVar22 = fStack0000000000000088;
                }
                if ((*(char *)(unaff_x26 + 0x236) == '\0') &&
                   (pcVar19 = "", *(short *)(unaff_x26 + 0x206) <= iVar18)) {
code_r0x001337ec:
                  fVar21 = *(float *)(unaff_x26 + 0x88);
                }
                else {
                  lVar14 = (long)*(short *)(*(long *)(unaff_x26 + 0x18) + (long)iVar18 * 0x70 + 0x50
                                           );
                  if (lVar14 != -1) {
                    pcVar19 = (char *)(*(long *)(unaff_x26 + 0x198) + lVar14);
                    goto code_r0x001337ec;
                  }
                  pcVar19 = "";
                  fVar21 = *(float *)(unaff_x26 + 0x88);
                }
                fVar24 = 0.0;
                if (0.0 <= unaff_s8) {
                  fVar24 = *(float *)(unaff_x26 + 0xc0);
                }
                fVar21 = *(float *)(in_stack_00000020 + 0x248) +
                         unaff_s9 + fVar21 * -in_stack_00000018 + fVar24;
                func_0x000bc968(0xbf800000,pcVar19,0,1);
                func_0x000bcb14(fVar21,fVar21);
                func_0x000f7254(uStack000000000000000c,uStack0000000000000008);
              }
              else {
                if (*(short *)(unaff_x26 + 0x212) == sVar7) {
                  uVar16 = 0x1c;
                  if (*(short *)(unaff_x26 + 0x7a) == *(short *)(unaff_x26 + 0x78)) {
                    uVar16 = 0x1d;
                  }
                  else if (*(short *)(unaff_x26 + 0x20c) != sVar7) goto code_r0x001338f8;
code_r0x001338d4:
                  func_0x000bba44(0x3f800000,uVar16);
                }
                else if (*(short *)(unaff_x26 + 0x20c) == sVar7) {
                  uVar16 = 0x1c;
                  goto code_r0x001338d4;
                }
code_r0x001338f8:
                func_0x000f397c(0x3f800000);
              }
              iVar18 = *(int *)(unaff_x26 + 0x6c);
            }
          }
          uVar17 = uVar17 + 1;
        } while ((long)uVar17 < (long)iVar18);
      }
      bVar10 = false;
    } while (bVar9);
  }
  func_0x000cdeec();
  func_0x000cdeec();
  fVar22 = fVar22 - *(float *)(*(long *)(unaff_x26 + 0x18) +
                               (long)(int)*(short *)(unaff_x26 + 0x21e) * 0x70 + 0xc);
  fVar20 = 0.0;
  if (0.0 < fVar22) {
    fVar20 = fVar22;
  }
  *(float *)(*(long *)(unaff_x26 + 0x10) + 8) = fVar20;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000090) {
    return;
  }
  iVar11 = ___stack_chk_fail();
  lVar14 = lRam0000000000a334c0;
  piVar1 = (int *)(&UNK_00005f90 + lRam0000000000a334c0);
  iVar2 = (int)extraout_x1 * 0x10 + 0x18;
  iVar5 = *piVar1;
  iVar6 = *(int *)(&UNK_00005f94 + lRam0000000000a334c0);
  iVar18 = iVar5 + iVar2;
  if (iVar6 < iVar18) {
    iVar3 = iVar6;
    if (iVar6 < 0) {
      iVar3 = iVar6 + 1;
    }
    iVar4 = 8;
    if (iVar6 != 0) {
      iVar4 = iVar6 + (iVar3 >> 1);
    }
    if (iVar4 <= iVar18) {
      iVar4 = iVar18;
    }
    lVar13 = func_0x000b810c((long)iVar4);
    if (*(long *)(&UNK_00005f98 + lVar14) != 0) {
      _memcpy(lVar13,*(long *)(&UNK_00005f98 + lVar14),(long)*piVar1);
      func_0x000b83d4(*(undefined8 *)(&UNK_00005f98 + lVar14));
    }
    *(long *)(&UNK_00005f98 + lVar14) = lVar13;
    *(int *)(&UNK_00005f94 + lVar14) = iVar4;
  }
  else {
    lVar13 = *(long *)(&UNK_00005f98 + lRam0000000000a334c0);
  }
  *piVar1 = iVar18;
  piVar1 = (int *)(lVar13 + iVar5);
  *piVar1 = iVar2;
  piVar1[1] = 0;
  piVar1[2] = 0;
  piVar1[3] = 0;
  piVar1[4] = 0;
  piVar1[5] = 0;
  if (0 < (int)extraout_x1) {
    piVar15 = piVar1 + 6;
    uVar17 = extraout_x1;
    do {
      piVar15[0] = 0;
      piVar15[1] = 0;
      piVar15[2] = -1;
      *(undefined2 *)(piVar15 + 3) = 0xffff;
      *(byte *)((long)piVar15 + 0xe) = *(byte *)((long)piVar15 + 0xe) & 0xf0 | 4;
      piVar15 = piVar15 + 4;
      uVar8 = (int)uVar17 - 1;
      uVar17 = (ulong)uVar8;
    } while (uVar8 != 0);
  }
  piVar1[1] = iVar11;
  *(short *)(piVar1 + 4) = (short)extraout_x1;
  *(short *)((long)piVar1 + 0x12) = (short)extraout_x1;
  *(undefined1 *)(piVar1 + 5) = 1;
  return;
}

