
void FUN_0012df34(float param_1,float param_2)

{
  float *pfVar1;
  char cVar2;
  short sVar3;
  short sVar4;
  short sVar5;
  bool bVar6;
  bool bVar7;
  bool bVar8;
  int iVar9;
  undefined8 uVar10;
  uint uVar11;
  int iVar12;
  uint *puVar13;
  undefined2 uVar14;
  long lVar15;
  float *pfVar16;
  int in_w8;
  long lVar17;
  ulong uVar18;
  int iVar19;
  int iVar20;
  long lVar21;
  ulong in_x11;
  long lVar22;
  undefined4 *unaff_x19;
  long lVar23;
  ulong uVar24;
  undefined4 *puVar25;
  int *unaff_x24;
  bool bVar26;
  long unaff_x27;
  uint unaff_w28;
  float fVar27;
  float fVar28;
  float fVar29;
  float fVar30;
  float fVar31;
  float fVar32;
  float fVar33;
  float fVar34;
  float fVar35;
  float unaff_s15;
  float fVar36;
  float fVar37;
  float fVar38;
  float in_stack_00000018;
  float fStack000000000000001c;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000024;
  float fStack000000000000002c;
  
  if ((1.0 <= param_2 && 0 < in_w8) && (0.0 < param_1)) {
    lVar17 = *(long *)(unaff_x19 + 0x12);
    do {
      if ((*(uint *)(lVar17 + (in_x11 >> 5 & 0x7ffffff) * 4) >> (ulong)((uint)in_x11 & 0x1f) & 1) !=
          0) {
        iVar19 = (int)*(short *)(*(long *)(unaff_x19 + 10) + in_x11 * 2);
        if ((*(byte *)(*(long *)(unaff_x19 + 6) + (long)iVar19 * 0x70) >> 3 & 1) != 0) {
          lVar21 = *(long *)(unaff_x19 + 6) + (long)iVar19 * 0x70;
          *(float *)(lVar21 + 0x10) = *(float *)(lVar21 + 0x10) + 1.0;
          *(float *)(lVar21 + 4) = *(float *)(lVar21 + 4) + 1.0;
          param_2 = param_2 + -1.0;
        }
      }
      bVar26 = 0 < (long)in_x11;
      in_x11 = in_x11 - 1;
    } while (1.0 <= param_2 && bVar26);
  }
  if (*(short *)(unaff_x19 + 0x1e) == 0) {
    puVar25 = unaff_x19 + 0x6a;
  }
  else {
    puVar25 = (undefined4 *)
              (*(long *)(unaff_x19 + 0x72) + (long)(int)*(short *)(unaff_x19 + 0x1e) * 0x18 + -0x18)
    ;
  }
  puVar25[4] = puVar25[5];
  puVar25[5] = 0xffffffff;
  *(undefined4 *)((long)unaff_x19 + 0x20a) = 0xffffffff;
  _uStack0000000000000020 = unaff_x19[0x3c];
  uStack0000000000000024 = *(undefined8 *)(unaff_x19 + 0x3d);
  fVar29 = (float)uStack0000000000000024 + (float)puVar25[1];
  fStack000000000000002c = (float)unaff_x19[0x3f];
  if ((float)unaff_x19[0x3f] < fVar29) {
    fStack000000000000002c = fVar29;
  }
  iVar19 = *unaff_x24;
  *unaff_x24 = 0;
  iVar9 = func_0x000c2878(&uStack0000000000000020,0,0);
  *unaff_x24 = iVar19;
  fVar29 = *(float *)(unaff_x27 + 0xe40);
  if (0.0 < (float)unaff_x19[0x3a]) {
    fVar28 = *(float *)(unaff_x27 + 0xe44);
    if (((float)unaff_x19[0x3d] <= fVar28) &&
       (fVar27 = (float)unaff_x19[0x3a] + (float)unaff_x19[0x3d], fVar28 <= fVar27)) {
      fVar29 = fVar29 + (float)(int)((fVar27 - fVar28) * (float)unaff_x19[0x3b]);
    }
  }
  bVar26 = 0 < *(short *)(unaff_x19 + 0x8b);
  fVar28 = unaff_s15;
  if (0 < *(short *)(unaff_x19 + 0x8b)) {
    fVar28 = (float)unaff_x19[0x3c];
  }
  fVar33 = (float)unaff_x19[0x2f];
  fVar31 = (float)unaff_x19[0x31];
  fVar27 = (float)unaff_x19[0x48];
  fVar34 = (float)unaff_x19[0x49];
  fVar32 = (float)unaff_x19[0x4a];
  fVar35 = (float)unaff_x19[0x4b];
  uVar11 = unaff_x19[0x1b] + 0x1f >> 5;
  fStack000000000000001c = unaff_s15;
  _bzero(*(undefined8 *)(unaff_x19 + 0x16),
         -(ulong)(uVar11 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar11 << 2);
  iVar19 = unaff_x19[0x1b];
  if (iVar19 < 1) {
LAB_0012e508:
    uVar14 = (undefined2)iVar19;
    lVar17 = *(long *)(unaff_x19 + 6);
    *(undefined2 *)(lVar17 + (long)(int)*(short *)(unaff_x19 + 0x87) * 0x70 + 0x67) = 1;
  }
  else {
    uVar18 = 0;
    bVar6 = false;
    iVar20 = 0;
    fVar31 = (fVar28 + fVar33) - fVar31;
    lVar17 = *(long *)(unaff_x19 + 10);
    lVar21 = *(long *)(unaff_x19 + 6);
    sVar3 = *(short *)(unaff_x19 + 0x8a);
    lVar22 = *(long *)(unaff_x19 + 0x12);
    fVar28 = fVar35;
    if (in_stack_00000018 <= fVar35) {
      fVar28 = in_stack_00000018;
    }
    fVar33 = fVar34;
    if (fVar34 <= in_stack_00000018) {
      fVar33 = fVar28;
    }
    fVar28 = (float)NEON_fminnm(fVar35,0x7f7fffff);
    if (fVar34 <= 3.4028235e+38) {
      fVar34 = fVar28;
    }
    do {
      while( true ) {
        sVar5 = *(short *)(lVar17 + uVar18 * 2);
        iVar12 = (int)sVar5;
        puVar13 = (uint *)(lVar21 + (long)iVar12 * 0x70);
        *(bool *)((long)puVar13 + 0x6a) = 0 < sVar3;
        if (bVar26) {
          if (iVar20 == *(short *)(unaff_x19 + 0x8b)) {
            bVar26 = false;
            fVar31 = fVar31 + (fStack000000000000001c - (float)unaff_x19[0x3c]);
          }
          else {
            bVar26 = true;
          }
        }
        else {
          bVar26 = false;
        }
        *puVar13 = *puVar13 & 0xf0ffffff;
        lVar15 = lVar21 + (long)iVar12 * 0x70;
        pfVar1 = (float *)(lVar15 + 0x20);
        uVar11 = (uint)sVar5;
        if ((*(uint *)(lVar22 + (uVar18 >> 5 & 0x7ffffff) * 4) >> (ulong)((uint)uVar18 & 0x1f) & 1)
            == 0) break;
        iVar19 = 0;
        if (*pfVar1 <= fVar29) {
          iVar19 = iVar9;
        }
        pfVar16 = (float *)(lVar21 + (long)iVar12 * 0x70 + 0x28);
        fVar28 = *pfVar16;
        bVar7 = false;
        if ((iVar19 == 1) && (bVar7 = false, !NAN(fVar29) && !NAN(fVar28))) {
          bVar7 = fVar29 < fVar28;
        }
        if (bVar7) {
          *(short *)((long)unaff_x19 + 0x20a) = sVar5;
        }
        *(float *)(lVar21 + (long)iVar12 * 0x70 + 8) = fVar31;
        fVar28 = (float)unaff_x19[0x2e];
        fVar37 = (float)unaff_x19[0x30];
        fVar36 = (float)unaff_x19[0x31];
        fVar38 = (float)unaff_x19[0x32];
        fVar35 = fVar28 + fVar37 * 2.0 + fVar36 + fVar38;
        if (((uint)unaff_x19[1] >> 0x18 & 1) == 0) {
          if (((uint)unaff_x19[1] >> 0x12 & 1) == 0) {
            fVar35 = (((((float)unaff_x19[0x46] -
                        fVar35 * (float)((int)*(short *)((long)unaff_x19 + 0x202) +
                                        (int)(short)~*(ushort *)
                                                      (lVar21 + (long)(int)uVar11 * 0x70 + 0x54))) -
                       fVar31) - fVar38) + fVar37 * -2.0) - (float)unaff_x19[0x2f];
          }
          else {
code_r0x0012e2c4:
            fVar35 = 3.4028235e+38;
          }
        }
        else {
          sVar4 = *(short *)(lVar21 + (long)(int)uVar11 * 0x70 + 0x52);
          if (*(short *)((long)unaff_x19 + 0x22a) <= sVar4) goto code_r0x0012e2c4;
          fVar35 = (((((float)unaff_x19[0x4a] -
                      fVar35 * (float)((int)*(short *)((long)unaff_x19 + 0x22a) - (int)sVar4)) -
                     fVar31) - (float)unaff_x19[0x2f]) - fVar37) - fVar38;
        }
        lVar23 = lVar21 + (long)(int)uVar11 * 0x70;
        fVar30 = *(float *)(lVar23 + 4);
        if (fVar35 <= *(float *)(lVar23 + 4)) {
          fVar30 = fVar35;
        }
        fVar35 = *(float *)(lVar23 + 0x10);
        if (fVar28 <= *(float *)(lVar23 + 0x10)) {
          fVar35 = fVar28;
        }
        if (fVar30 < fVar35) {
          fVar30 = fVar35;
        }
        *(float *)(lVar23 + 4) = fVar30;
        fVar35 = fVar38 + fVar36 + fVar31 + fVar30 + fVar37 * 2.0;
        *(float *)(lVar23 + 0xc) = fVar35;
        fVar36 = fVar31 + fVar37 + fVar36;
        *(float *)(lVar23 + 0x34) = fVar36;
        *(float *)(lVar23 + 0x38) = (fVar35 - fVar37) - fVar38;
        *(float *)(lVar23 + 0x3c) = (float)(int)(fVar30 * 0.65);
        fVar28 = fVar32;
        if (fVar31 <= fVar32) {
          fVar28 = fVar31;
        }
        fVar37 = fVar27;
        if (fVar27 <= fVar31) {
          fVar37 = fVar28;
        }
        *pfVar1 = fVar37;
        *(float *)(lVar15 + 0x24) = fVar33;
        fVar28 = fVar32;
        if (fVar35 <= fVar32) {
          fVar28 = fVar35;
        }
        fVar38 = fVar27;
        if (fVar27 <= fVar35) {
          fVar38 = fVar28;
        }
        *pfVar16 = fVar38;
        *(float *)(lVar23 + 0x2c) = fVar34;
        *(bool *)(lVar23 + 0x65) = fVar37 < fVar38;
        *(undefined1 *)(lVar23 + 0x66) = 1;
        iVar19 = (int)sVar5;
        bVar7 = bVar6;
        if (fVar38 <= fVar37) {
          if (*(char *)(lVar21 + (long)(int)uVar11 * 0x70 + 0x6b) == '\0') {
            bVar8 = *(char *)(lVar21 + (long)(int)uVar11 * 0x70 + 0x6c) != '\0';
            lVar15 = lVar21 + (long)(int)uVar11 * 0x70;
            *(bool *)(lVar15 + 0x67) = bVar8;
            cVar2 = *(char *)(lVar15 + 0x62);
            goto joined_r0x0012e3fc;
          }
          bVar8 = true;
          lVar15 = lVar21 + (long)(int)uVar11 * 0x70;
          *(undefined1 *)(lVar15 + 0x67) = 1;
          if (*(char *)(lVar15 + 0x62) != '\0') goto LAB_0012e3c4;
LAB_0012e400:
          *(undefined1 *)(lVar21 + (long)(int)uVar11 * 0x70 + 0x68) = 1;
          bVar8 = (bool)(bVar8 ^ 1);
        }
        else {
          bVar8 = true;
          uVar24 = -(ulong)((uint)(iVar19 >> 5) >> 0x1f) & 0xfffffffc00000000 |
                   (ulong)(uint)(iVar19 >> 5) << 2;
          *(uint *)(*(long *)(unaff_x19 + 0x16) + uVar24) =
               *(uint *)(*(long *)(unaff_x19 + 0x16) + uVar24) | 1 << (ulong)(uVar11 & 0x1f);
          lVar15 = lVar21 + (long)iVar19 * 0x70;
          *(undefined1 *)(lVar15 + 0x67) = 1;
          cVar2 = *(char *)(lVar15 + 0x62);
joined_r0x0012e3fc:
          if (cVar2 == '\0') goto LAB_0012e400;
LAB_0012e3c4:
          cVar2 = *(char *)((long)unaff_x19 + 0x249);
          *(char *)(lVar21 + (long)(int)uVar11 * 0x70 + 0x68) = cVar2;
          bVar8 = (bool)(bVar8 ^ 1);
          if (cVar2 == '\0') {
            bVar7 = true;
          }
        }
        if (!bVar8) {
          bVar6 = bVar7;
        }
        uVar11 = 0x3000000;
        if (fVar38 <= fVar37) {
          uVar11 = 0x1000000;
        }
        uVar11 = *puVar13 | uVar11;
        *puVar13 = uVar11;
        if (*(short *)(lVar21 + (long)iVar19 * 0x70 + 0x5a) != -1) {
          uVar11 = uVar11 | 0x4000000;
          *puVar13 = uVar11;
        }
        if (*(short *)((long)unaff_x19 + 0x20a) == sVar5) {
          *puVar13 = uVar11 | 0x8000000;
          lVar15 = lVar21 + (long)iVar19 * 0x70;
          *(ulong *)(lVar15 + 0x48) = CONCAT44(fVar36,fVar36);
          *(ulong *)(lVar15 + 0x40) = CONCAT44(fVar36,fVar36);
          if (*(char *)((long)unaff_x19 + 0x249) == '\0') goto LAB_0012e4d0;
LAB_0012e464:
          sVar5 = *(short *)(unaff_x19 + 0x8b);
        }
        else {
          lVar15 = lVar21 + (long)iVar19 * 0x70;
          *(ulong *)(lVar15 + 0x48) = CONCAT44(fVar36,fVar36);
          *(ulong *)(lVar15 + 0x40) = CONCAT44(fVar36,fVar36);
          if (*(char *)((long)unaff_x19 + 0x249) != '\0') goto LAB_0012e464;
LAB_0012e4d0:
          lVar15 = lVar21 + (long)iVar19 * 0x70;
          *(byte *)(lVar15 + 0x6b) = *(byte *)(lVar15 + 0x6b) >> 1;
          *(byte *)(lVar15 + 0x6c) = *(byte *)(lVar15 + 0x6c) >> 1;
          sVar5 = *(short *)(unaff_x19 + 0x8b);
        }
        if (iVar20 < sVar5) {
          fVar35 = fVar35 + 1.0;
          fVar28 = fVar32;
          if (fVar35 <= fVar32) {
            fVar28 = fVar35;
          }
          if (fVar27 <= fVar35) {
            fVar27 = fVar28;
          }
        }
        fVar31 = fVar31 + fVar30 + (float)unaff_x19[0x31] + (float)unaff_x19[0x32] +
                          (float)unaff_x19[0x30] * 2.0;
        iVar20 = iVar20 + 1;
        iVar19 = unaff_x19[0x1b];
        uVar18 = uVar18 + 1;
        if ((long)iVar19 <= (long)uVar18) goto LAB_0012e4fc;
      }
      lVar23 = lVar21 + (long)(int)uVar11 * 0x70;
      *(float *)(lVar23 + 0x34) = fVar31;
      *(ulong *)(lVar23 + 8) = CONCAT44(fVar31,fVar31);
      *(undefined4 *)(lVar23 + 4) = 0;
      fVar28 = fVar32;
      if (fVar31 <= fVar32) {
        fVar28 = fVar31;
      }
      fVar35 = fVar27;
      if (fVar27 <= fVar31) {
        fVar35 = fVar28;
      }
      *pfVar1 = fVar35;
      *(float *)(lVar15 + 0x24) = fVar33;
      *(float *)(lVar23 + 0x28) = fVar35;
      *(float *)(lVar23 + 0x2c) = fVar34;
      *(undefined4 *)(lVar23 + 0x65) = 0x1000000;
      *(undefined4 *)(lVar23 + 0x3c) = 0x3f800000;
      uVar18 = uVar18 + 1;
    } while ((long)uVar18 < (long)iVar19);
LAB_0012e4fc:
    uVar14 = (undefined2)iVar19;
    if (!bVar6) goto LAB_0012e508;
    lVar17 = *(long *)(unaff_x19 + 6);
  }
  fVar27 = *(float *)(lVar17 + (long)(int)*(short *)((long)unaff_x19 + 0x21e) * 0x70 + 0x28);
  fVar28 = (float)unaff_x19[0x44];
  if ((float)unaff_x19[0x44] < fVar27) {
    fVar28 = fVar27;
  }
  if (((iVar9 != 0) && (*(short *)((long)unaff_x19 + 0x20a) == -1)) && (fVar28 <= fVar29)) {
    *(undefined2 *)((long)unaff_x19 + 0x20a) = uVar14;
  }
  uVar11 = unaff_x19[1];
  if ((unaff_w28 & 1) == 0 && (uVar11 & 1) != 0) {
    uVar11 = uVar11 & 0xfffffffe;
    unaff_x19[1] = uVar11;
  }
  *(bool *)(unaff_x19 + 0x91) = unaff_x24[1] != 0;
  if (*(short *)((long)unaff_x19 + 0x222) != -1) {
    uVar11 = uVar11 & 0xfffeffff;
    unaff_x19[1] = uVar11;
  }
  if ((uVar11 >> 0x10 & 1) != 0) {
    unaff_x19[0x46] = fVar28;
    unaff_x19[0x3e] = fVar28;
    fVar29 = (float)unaff_x19[0x4a];
    if (fVar28 <= (float)unaff_x19[0x4a]) {
      fVar29 = fVar28;
    }
    unaff_x19[0x4a] = fVar29;
  }
  lVar17 = *(long *)(unaff_x19 + 0x62);
  uVar10 = *(undefined8 *)(unaff_x19 + 0x44);
  *(undefined8 *)(lVar17 + 0x240) = *(undefined8 *)(unaff_x19 + 0x46);
  *(undefined8 *)(lVar17 + 0x238) = uVar10;
  unaff_x19[0x2b] = unaff_x19[0x48];
  unaff_x19[0x2c] = unaff_x19[0x4a];
  if (((uint)unaff_x19[1] >> 0x11 & 1) == 0) {
    lVar17 = *(long *)(unaff_x19 + 0x62);
    fVar28 = 0.0;
    if (((uint)unaff_x19[1] >> 0x19 & 1) == 0) {
      fVar28 = (float)unaff_x19[0x3f];
    }
    fVar29 = *(float *)(lVar17 + 0x264);
    if (*(float *)(lVar17 + 0x264) < fVar28) {
      fVar29 = fVar28;
    }
  }
  else {
    lVar17 = *(long *)(unaff_x19 + 0x62);
    fVar29 = (float)unaff_x19[0x3f];
  }
  fVar29 = fVar29 - *(float *)(&UNK_00003948 + unaff_x27);
  fVar28 = *(float *)(lVar17 + 0x234);
  if (fVar29 <= *(float *)(lVar17 + 0x234)) {
    fVar28 = fVar29;
  }
  fVar27 = *(float *)(lVar17 + 0x22c);
  if (*(float *)(lVar17 + 0x22c) <= fVar29) {
    fVar27 = fVar28;
  }
  *(float *)(lVar17 + 0x234) = fVar27;
  func_0x0012eab4();
  if ((*(byte *)(unaff_x19 + 1) & 1) != 0) {
    func_0x0012ec24();
  }
  puVar25[2] = 0;
  *(undefined1 *)((long)unaff_x19 + 0x236) = 1;
  *(undefined1 *)((long)unaff_x19 + 0x23a) = 0;
  *(undefined2 *)((long)unaff_x19 + 0x20e) = 0xffff;
  if (((*(char *)((long)unaff_x19 + 0x23b) == '\0') || (*(short *)(unaff_x19 + 0x89) == -1)) ||
     (*(short *)((long)unaff_x19 + 0x7a) != *(short *)(unaff_x19 + 0x1e))) {
    if ((*(byte *)((long)unaff_x19 + 7) >> 4 & 1) != 0) {
      sVar3 = *(short *)((long)unaff_x19 + 0x20a);
      if (((sVar3 != -1) && (unaff_x19[0x1b] != (int)sVar3)) &&
         ((*(short *)(unaff_x19 + 0x83) == -1 &&
          (((*unaff_x24 == 0 || (*(char *)((long)unaff_x19 + 0x245) != '\0')) ||
           ((char)unaff_x24[0x33a] != '\0')))))) {
        *(short *)((long)unaff_x19 + 0x20e) = sVar3;
      }
    }
    if (((*(char *)((long)unaff_x19 + 0x23b) != '\0') && (*(char *)(unaff_x19 + 0x8f) == '\0')) &&
       (*(short *)(unaff_x19 + 0x1e) == *(short *)((long)unaff_x19 + 0x7a))) goto LAB_0012e6f4;
  }
  else {
    *(short *)((long)unaff_x19 + 0x20e) = *(short *)(unaff_x19 + 0x89);
    if (*(char *)(unaff_x19 + 0x8f) == '\0') {
LAB_0012e6f4:
      uVar10 = func_0x000b89a8("##ContextMenu",0,*unaff_x19);
      uVar18 = func_0x000d9b0c(uVar10,0x141);
      if ((uVar18 & 1) == 0) {
        *(undefined1 *)((long)unaff_x19 + 0x23b) = 0;
        cVar2 = *(char *)((long)unaff_x19 + 0x239);
        goto joined_r0x0012e728;
      }
      func_0x0012ef34();
      func_0x000d9c4c();
    }
  }
  cVar2 = *(char *)((long)unaff_x19 + 0x239);
joined_r0x0012e728:
  if ((cVar2 != '\0') && ((*(byte *)(unaff_x19 + 1) >> 3 & 1) != 0)) {
    func_0x0012f22c();
  }
  lVar17 = *(long *)(unaff_x19 + 0x62);
  if (0 < (short)*(ushort *)((long)unaff_x19 + 0x22a)) {
    *(float *)(lVar17 + 0x78) =
         *(float *)(*(long *)(unaff_x19 + 6) +
                    (long)(int)*(short *)(*(long *)(unaff_x19 + 10) +
                                         (ulong)(*(ushort *)((long)unaff_x19 + 0x22a) - 1) * 2) *
                    0x70 + 0xc) - (float)unaff_x19[0x3c];
  }
  if (0 < *(short *)((long)unaff_x19 + 0x226)) {
    *(undefined4 *)(lVar17 + 0x7c) = puVar25[3];
  }
  puVar25[3] = 0;
  if ((*(byte *)((long)unaff_x19 + 6) >> 4 & 1) == 0) {
    func_0x000f0930(*(undefined8 *)(lVar17 + 0x2a8),lVar17 + 0x248,lVar17 + 0x250,0);
  }
  else {
    func_0x000f69c4(*(undefined8 *)(unaff_x19 + 0x68),*(undefined8 *)(lVar17 + 0x2a8),2);
  }
  return;
}

