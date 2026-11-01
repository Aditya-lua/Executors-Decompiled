
void FUN_0012f454(void)

{
  long lVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  int in_w8;
  uint uVar8;
  int iVar9;
  undefined4 *puVar10;
  long lVar11;
  int *piVar12;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  float fVar13;
  float fVar14;
  float fVar15;
  float fVar16;
  float fVar17;
  float fVar18;
  undefined8 uStack0000000000000008;
  
  if (in_w8 != 0) {
    func_0x0012fb30();
  }
  if (((((unaff_w21 >> 5 & 1) != 0) && (*(short *)(unaff_x19 + 0x20a) != -1)) &&
      (uVar5 = func_0x000cff18(), (uVar5 & 1) == 0)) && (iVar4 = func_0x000d6f58(1), iVar4 != 0)) {
    iVar4 = (int)*(short *)(unaff_x19 + 0x20a);
    puVar10 = *(undefined4 **)(&UNK_00004e18 + *unaff_x25);
    if (*(short *)(unaff_x19 + 0x20a) == -1) {
      iVar4 = puVar10[0x1d];
    }
    if ((*(byte *)(puVar10 + 1) & 7) != 0) {
      *(undefined1 *)((long)puVar10 + 0x23b) = 1;
      if (iVar4 == puVar10[0x1b]) {
        iVar4 = -1;
      }
      *(short *)(puVar10 + 0x89) = (short)iVar4;
      *(undefined2 *)((long)puVar10 + 0x7a) = *(undefined2 *)(puVar10 + 0x1e);
      uVar6 = func_0x000b89a8("##ContextMenu",0,*puVar10);
      func_0x000d94ec(uVar6,0);
    }
  }
  if (*(short *)(unaff_x19 + 0x78) == 0) {
    lVar11 = unaff_x19 + 0x1a8;
  }
  else {
    lVar11 = *(long *)(unaff_x19 + 0x1c8) + (long)(int)*(short *)(unaff_x19 + 0x78) * 0x18 + -0x18;
  }
  *(undefined8 *)(unaff_x20 + 0x140) = *(undefined8 *)(unaff_x24 + 0x50);
  *(undefined8 *)(unaff_x20 + 0x138) = *(undefined8 *)(unaff_x24 + 0x58);
  *(undefined8 *)(unaff_x20 + 0x128) = *(undefined8 *)(unaff_x24 + 0x60);
  fVar18 = *(float *)(unaff_x19 + 0x80);
  if (unaff_x20 == unaff_x22) {
    if ((unaff_w21 >> 0x11 & 1) == 0) {
      fVar13 = *(float *)(unaff_x19 + 0xfc);
      if (*(float *)(unaff_x19 + 0xfc) < fVar18) {
        fVar13 = fVar18;
      }
      *(float *)(unaff_x19 + 0x10c) = fVar13;
      *(float *)(unaff_x19 + 0xfc) = fVar13;
    }
  }
  else {
    *(float *)(unaff_x20 + 300) = fVar18;
  }
  fVar15 = *(float *)(unaff_x19 + 0xfc);
  fVar13 = *(float *)(unaff_x19 + 0x11c);
  if (*(float *)(unaff_x19 + 0x11c) < fVar15) {
    fVar13 = fVar15;
  }
  *(float *)(unaff_x19 + 0x11c) = fVar13;
  *(float *)(lVar11 + 4) = fVar15 - *(float *)(unaff_x19 + 0xf4);
  if ((*(uint *)(unaff_x19 + 4) >> 0x18 & 1) != 0) {
    fVar13 = *(float *)(*(long *)(unaff_x19 + 0x188) + 0x128);
    if (*(short *)(unaff_x19 + 0x21e) != -1) {
      fVar15 = 0.0;
      if ((*(uint *)(unaff_x19 + 4) & 0x400) != 0) {
        fVar15 = 1.0;
      }
      fVar15 = (*(float *)(*(long *)(unaff_x19 + 0x18) +
                           (long)(int)*(short *)(unaff_x19 + 0x21e) * 0x70 + 0x38) +
                *(float *)(unaff_x19 + 0xc0) + *(float *)(unaff_x19 + 0xbc)) - fVar15;
      if (fVar13 < fVar15) {
        fVar13 = fVar15;
      }
    }
    if ((*(short *)(unaff_x19 + 0x212) != -1) && (fVar13 < *(float *)(unaff_x19 + 0xe0))) {
      fVar13 = *(float *)(unaff_x19 + 0xe0);
    }
    *(float *)(*(long *)(unaff_x19 + 0x188) + 0x128) =
         fVar13 + *(float *)(*(long *)(unaff_x19 + 0x10) + 8);
  }
  if ((unaff_w21 >> 0x14 & 1) == 0) {
    func_0x000f0b24(*(undefined8 *)(unaff_x20 + 0x2a8));
  }
  lVar7 = *(long *)(unaff_x20 + 0x2a8);
  lVar11 = *(long *)(lVar7 + 0x60) + (long)*(int *)(lVar7 + 0x58) * 0x10;
  uVar6 = *(undefined8 *)(lVar11 + -0x10);
  *(undefined8 *)(unaff_x20 + 0x250) = *(undefined8 *)(lVar11 + -8);
  *(undefined8 *)(unaff_x20 + 0x248) = uVar6;
  if ((unaff_w21 & 0x780) != 0) {
    func_0x00130238();
    lVar7 = *(long *)(unaff_x20 + 0x2a8);
  }
  uVar6 = *(undefined8 *)(unaff_x19 + 0x1a0);
  func_0x000f69c4(uVar6,lVar7,0);
  if ((*(byte *)(unaff_x19 + 6) >> 4 & 1) == 0) {
    func_0x0013068c();
  }
  func_0x000ef6c0(uVar6,*(undefined8 *)(unaff_x20 + 0x2a8));
  if ((int)*(uint *)(unaff_x19 + 0x6c) < 1) {
    fVar13 = 0.0;
    fVar15 = 0.0;
    fVar14 = 0.0;
  }
  else {
    lVar11 = 0;
    uVar5 = 0;
    fVar14 = 0.0;
    fVar15 = 0.0;
    fVar13 = 0.0;
    do {
      if ((*(uint *)(*(long *)(unaff_x19 + 0x50) + (uVar5 >> 5 & 0x7ffffff) * 4) >>
           (ulong)((uint)uVar5 & 0x1f) & 1) != 0) {
        lVar7 = *(long *)(unaff_x19 + 0x18);
        uVar8 = *(uint *)(lVar7 + lVar11);
        if ((uVar8 & 0x30) == 0x10) {
          fVar17 = *(float *)(lVar7 + lVar11 + 0x10);
        }
        else {
          lVar1 = lVar7 + lVar11;
          fVar17 = *(float *)(lVar1 + 0x40);
          if (*(float *)(lVar1 + 0x40) < *(float *)(lVar1 + 0x44)) {
            fVar17 = *(float *)(lVar1 + 0x44);
          }
          fVar17 = fVar17 - *(float *)(lVar1 + 0x34);
          if (((uVar8 >> 0xd & 1) == 0) &&
             (fVar16 = *(float *)(lVar1 + 0x4c) - *(float *)(lVar1 + 0x34), fVar17 < fVar16)) {
            fVar17 = fVar16;
          }
          if ((((uVar8 >> 4 & 1) != 0) && (fVar16 = *(float *)(lVar7 + lVar11 + 0x1c), 0.0 < fVar16)
              ) && (((uVar8 & 0x20) == 0 & *(byte *)(unaff_x19 + 4)) == 0)) {
            fVar17 = fVar16;
          }
          if (fVar17 < *(float *)(unaff_x19 + 0xb8)) {
            fVar17 = *(float *)(unaff_x19 + 0xb8);
          }
        }
        bVar3 = (uVar8 & 0x10) != 0;
        fVar16 = fVar17;
        if (bVar3) {
          fVar16 = -0.0;
        }
        fVar15 = fVar15 + fVar16;
        fVar16 = -0.0;
        if (bVar3) {
          fVar16 = fVar17;
        }
        fVar14 = fVar14 + fVar16;
        if ((((uVar8 ^ 0xffffffff) & 0x28) == 0) &&
           (fVar17 = fVar17 / (*(float *)(lVar7 + lVar11 + 0x18) / *(float *)(unaff_x19 + 0xd8)),
           fVar13 < fVar17)) {
          fVar13 = fVar17;
        }
      }
      uVar5 = uVar5 + 1;
      lVar11 = lVar11 + 0x70;
    } while ((ulong)*(uint *)(unaff_x19 + 0x6c) * 0x70 != lVar11);
  }
  fVar17 = *(float *)(unaff_x19 + 0xc0);
  if (fVar15 < fVar13) {
    fVar15 = fVar13;
  }
  *(float *)(unaff_x19 + 0xd4) =
       fVar15 + fVar14 + (*(float *)(unaff_x19 + 0xc4) + *(float *)(unaff_x19 + 200)) *
                         (float)(*(short *)(unaff_x19 + 0x202) + -1) +
                         *(float *)(unaff_x19 + 0xbc) * 2.0 +
                         (float)(int)*(short *)(unaff_x19 + 0x202) * (fVar17 + fVar17);
  if ((unaff_x20 == unaff_x22) || ((*(uint *)(unaff_x19 + 4) >> 0x18 & 1) != 0)) {
    if ((*(short *)(unaff_x19 + 0x214) != -1) &&
       (((*(short *)(unaff_x19 + 0x212) == -1 && (*(char *)(unaff_x20 + 0xbc) != '\0')) &&
        (*(short *)(unaff_x19 + 0x7a) == *(short *)(unaff_x19 + 0x78))))) {
      fVar13 = *(float *)(unaff_x19 + 0xb8) + fVar17 * 2.0;
      fVar15 = *(float *)(*(long *)(unaff_x19 + 0x18) +
                          (long)(int)*(short *)(unaff_x19 + 0x214) * 0x70 + 0xc);
      if (*(float *)(unaff_x19 + 0x120) <= fVar15) {
        if (fVar15 <= *(float *)(unaff_x19 + 0x128)) goto code_r0x0012f7e8;
        fVar13 = fVar13 + (fVar15 - *(float *)(unaff_x20 + 0x28));
      }
      else {
        fVar13 = (fVar15 - *(float *)(unaff_x20 + 0x28)) - fVar13;
      }
      func_0x000d8bf4(fVar13,0x3f800000);
    }
  }
  else {
    *(undefined4 *)(unaff_x20 + 0x8c) = 0;
  }
code_r0x0012f7e8:
  if ((*(short *)(unaff_x19 + 0x212) != -1) &&
     (*(short *)(unaff_x19 + 0x78) == *(short *)(unaff_x19 + 0x7a))) {
    *(float *)(unaff_x19 + 0xdc) =
         (float)(int)(((((*(float *)(unaff_x23 + 0xe40) - *(float *)(&UNK_00004078 + unaff_x23)) +
                        4.0) - *(float *)(*(long *)(unaff_x19 + 0x18) +
                                          (long)(int)*(short *)(unaff_x19 + 0x212) * 0x70 + 8)) -
                      *(float *)(unaff_x19 + 0xc4)) + *(float *)(unaff_x19 + 0xc0) * -2.0);
  }
  bVar3 = false;
  if (*(int *)(&UNK_00004068 + unaff_x23) != 0) {
    bVar3 = *(char *)(unaff_x19 + 0x244) == '\0';
  }
  *(bool *)(unaff_x19 + 0x245) = bVar3;
  if (0 < *(short *)(unaff_x19 + 0x78)) {
    func_0x000d53d0();
  }
  func_0x000d53d0();
  fVar15 = *(float *)(unaff_x22 + 0x128);
  fVar13 = *(float *)(unaff_x22 + 300);
  uVar6 = *(undefined8 *)(unaff_x24 + 0x30);
  *(undefined8 *)(unaff_x20 + 0x230) = *(undefined8 *)(unaff_x24 + 0x38);
  *(undefined8 *)(unaff_x20 + 0x228) = uVar6;
  uVar6 = *(undefined8 *)(unaff_x24 + 0x40);
  *(undefined8 *)(unaff_x20 + 0x240) = *(undefined8 *)(unaff_x24 + 0x48);
  *(undefined8 *)(unaff_x20 + 0x238) = uVar6;
  *(undefined1 *)(unaff_x20 + 0xc3) = *(undefined1 *)(unaff_x19 + 0x249);
  *(undefined8 *)(unaff_x22 + 0x110) = *(undefined8 *)(unaff_x19 + 0xf0);
  *(undefined4 *)(unaff_x22 + 0x1cc) = *(undefined4 *)(unaff_x24 + 0x6c);
  *(undefined4 *)(unaff_x22 + 0x1d8) = *(undefined4 *)(unaff_x24 + 0x70);
  *(undefined4 *)(unaff_x22 + 0x158) = *(undefined4 *)(unaff_x24 + 0x68);
  if (unaff_x20 == unaff_x22) {
    uStack0000000000000008 =
         CONCAT44((float)((ulong)*(undefined8 *)(unaff_x19 + 0xf8) >> 0x20) -
                  (float)((ulong)*(undefined8 *)(unaff_x19 + 0xf0) >> 0x20),
                  (float)*(undefined8 *)(unaff_x19 + 0xf8) -
                  (float)*(undefined8 *)(unaff_x19 + 0xf0));
    func_0x000d0d0c(0xbf800000,&uStack0000000000000008);
    func_0x000d0e24(unaff_x19 + 0xf0,0,0,0);
    uVar8 = *(uint *)(unaff_x19 + 4);
    if ((uVar8 >> 0x10 & 1) == 0) goto code_r0x0012f8d0;
code_r0x0012f934:
    fVar14 = *(float *)(unaff_x19 + 0xf0) + *(float *)(unaff_x19 + 0xd4);
    if (fVar15 < fVar14) {
      fVar15 = fVar14;
    }
    *(float *)(unaff_x22 + 0x128) = fVar15;
    fVar15 = *(float *)(unaff_x24 + 0x10);
joined_r0x0012f954:
    if (0.0 < fVar15) goto code_r0x0012f958;
code_r0x0012f9d4:
    fVar14 = 0.0;
    if ((uVar8 >> 0x19 & 1) != 0) {
      fVar14 = *(float *)(unaff_x20 + 0xb8);
    }
    fVar15 = (fVar18 + fVar14) - fVar15;
    fVar14 = *(float *)(unaff_x22 + 0x134);
    if (*(float *)(unaff_x22 + 0x134) < fVar15) {
      fVar14 = fVar15;
    }
    *(float *)(unaff_x22 + 0x134) = fVar14;
    fVar15 = *(float *)(unaff_x19 + 0xfc);
    if (fVar18 <= *(float *)(unaff_x19 + 0xfc)) {
      fVar15 = fVar18;
    }
    if (fVar13 < fVar15) {
      fVar13 = fVar15;
    }
    *(float *)(unaff_x22 + 300) = fVar13;
    cVar2 = *(char *)(unaff_x19 + 0x23e);
  }
  else {
    func_0x000d0b80();
    uVar8 = *(uint *)(unaff_x19 + 4);
    if ((uVar8 >> 0x10 & 1) != 0) goto code_r0x0012f934;
code_r0x0012f8d0:
    if (*(float *)(unaff_x24 + 0xc) <= 0.0) {
      fVar14 = 0.0;
      if ((uVar8 >> 0x18 & 1) != 0) {
        fVar14 = *(float *)(unaff_x20 + 0xb4);
      }
      fVar16 = *(float *)(unaff_x19 + 0xf0) + *(float *)(unaff_x19 + 0xd4);
      fVar17 = (*(float *)(*(long *)(unaff_x19 + 0x10) + 8) + fVar14 + fVar16) -
               *(float *)(unaff_x24 + 0xc);
      fVar14 = *(float *)(unaff_x22 + 0x130);
      if (*(float *)(unaff_x22 + 0x130) < fVar17) {
        fVar14 = fVar17;
      }
      *(float *)(unaff_x22 + 0x130) = fVar14;
      fVar14 = *(float *)(unaff_x19 + 0xf8);
      if (fVar16 <= *(float *)(unaff_x19 + 0xf8)) {
        fVar14 = fVar16;
      }
      if (fVar15 < fVar14) {
        fVar15 = fVar14;
      }
      *(float *)(unaff_x22 + 0x128) = fVar15;
      fVar15 = *(float *)(unaff_x24 + 0x10);
      goto joined_r0x0012f954;
    }
    if (fVar15 < *(float *)(unaff_x19 + 0xf8)) {
      fVar15 = *(float *)(unaff_x19 + 0xf8);
    }
    *(float *)(unaff_x22 + 0x128) = fVar15;
    fVar15 = *(float *)(unaff_x24 + 0x10);
    if (fVar15 <= 0.0) goto code_r0x0012f9d4;
code_r0x0012f958:
    if (fVar13 < *(float *)(unaff_x19 + 0xfc)) {
      fVar13 = *(float *)(unaff_x19 + 0xfc);
    }
    *(float *)(unaff_x22 + 300) = fVar13;
    cVar2 = *(char *)(unaff_x19 + 0x23e);
  }
  if (cVar2 != '\0') {
    func_0x00130f88();
  }
  *(undefined1 *)(unaff_x19 + 0x238) = 0;
  iVar4 = *(int *)(&UNK_00004e24 + unaff_x23);
  *(int *)(&UNK_00004e24 + unaff_x23) = iVar4 + -1;
  if ((iVar4 < 2) || (lVar11 = *(long *)(&UNK_00004e30 + unaff_x23), lVar11 == 0)) {
    *(undefined8 *)(&UNK_00004e18 + unaff_x23) = 0;
  }
  else {
    piVar12 = (int *)(lVar11 + (ulong)(iVar4 - 2U) * 0x78);
    iVar9 = *piVar12;
    lVar7 = *(long *)(&UNK_00004e40 + unaff_x23);
    *(long *)(&UNK_00004e18 + unaff_x23) = lVar7 + (long)iVar9 * 0x250;
    if (lVar7 != 0) {
      lVar7 = lVar7 + (long)iVar9 * 0x250;
      *(int **)(lVar7 + 0x10) = piVar12;
      *(ulong *)(lVar7 + 0x1a0) = lVar11 + (ulong)(iVar4 - 2U) * 0x78 + 0x18;
      goto code_r0x0012fa8c;
    }
  }
  iVar9 = -1;
code_r0x0012fa8c:
  *(int *)(unaff_x22 + 0x1c0) = iVar9;
  func_0x000daf00();
  return;
}

