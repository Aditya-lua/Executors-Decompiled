
void FUN_0012e338(float param_1,float param_2,undefined4 param_3,undefined4 param_4,float param_5,
                 float param_6,float param_7,float param_8,undefined1 param_9,uint param_10,
                 uint param_11,uint param_12,uint *param_13,uint param_14,float *param_15,
                 float *param_16)

{
  int iVar1;
  char cVar2;
  short sVar3;
  ushort uVar4;
  bool bVar5;
  undefined8 uVar6;
  int iVar7;
  int iVar8;
  long lVar9;
  uint uVar10;
  long lVar11;
  uint in_w8;
  ulong in_x9;
  int in_w10;
  long in_x11;
  long in_x12;
  undefined1 in_w13;
  long in_x14;
  int in_w15;
  undefined4 in_w16;
  float in_w17;
  undefined4 *unaff_x19;
  int unaff_w20;
  long unaff_x21;
  ulong uVar12;
  long unaff_x23;
  int *unaff_x24;
  ulong unaff_x25;
  long unaff_x27;
  uint unaff_w28;
  float fVar13;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float in_s16;
  float fVar14;
  float fVar15;
  float in_s17;
  float fVar16;
  float in_s18;
  float fVar17;
  float in_s22;
  
  do {
    fVar13 = unaff_s10;
    if (unaff_s10 <= param_1) {
      fVar13 = in_s18;
    }
    *param_15 = fVar13;
    param_15[1] = param_2;
    fVar14 = unaff_s11;
    if (in_s16 <= unaff_s11) {
      fVar14 = in_s16;
    }
    fVar15 = unaff_s10;
    if (unaff_s10 <= in_s16) {
      fVar15 = fVar14;
    }
    *param_16 = fVar15;
    *(undefined4 *)(unaff_x21 + 0x2c) = param_3;
    *(bool *)(unaff_x21 + 0x65) = fVar13 < fVar15;
    *(undefined1 *)(unaff_x21 + 0x66) = param_9;
    uVar10 = in_w8;
    if (fVar15 <= fVar13) {
      if (*(char *)(in_x12 + (long)(int)param_12 * (long)in_w15 + 0x6b) == '\0') {
        bVar5 = *(char *)(in_x12 + (long)(int)param_12 * (long)in_w15 + 0x6c) != '\0';
        lVar11 = in_x12 + (long)(int)param_12 * (long)in_w15;
        *(bool *)(lVar11 + 0x67) = bVar5;
        cVar2 = *(char *)(lVar11 + 0x62);
        goto joined_r0x0012e3fc;
      }
      bVar5 = true;
      lVar11 = in_x12 + (long)(int)param_12 * (long)in_w15;
      *(undefined1 *)(lVar11 + 0x67) = 1;
      if (*(char *)(lVar11 + 0x62) != '\0') goto LAB_0012e3c4;
LAB_0012e400:
      *(undefined1 *)(in_x12 + (long)(int)param_12 * (long)in_w15 + 0x68) = param_9;
      bVar5 = (bool)(bVar5 ^ 1);
    }
    else {
      bVar5 = true;
      uVar12 = -(ulong)((uint)((int)param_12 >> 5) >> 0x1f) & 0xfffffffc00000000 |
               (ulong)(uint)((int)param_12 >> 5) << 2;
      *(uint *)(*(long *)(unaff_x19 + 0x16) + uVar12) =
           *(uint *)(*(long *)(unaff_x19 + 0x16) + uVar12) | 1 << (ulong)(param_12 & 0x1f);
      lVar11 = in_x12 + (long)(int)param_12 * (long)in_w15;
      *(undefined1 *)(lVar11 + 0x67) = 1;
      cVar2 = *(char *)(lVar11 + 0x62);
joined_r0x0012e3fc:
      if (cVar2 == '\0') goto LAB_0012e400;
LAB_0012e3c4:
      cVar2 = *(char *)((long)unaff_x19 + 0x249);
      *(char *)(in_x12 + (long)(int)param_12 * (long)in_w15 + 0x68) = cVar2;
      bVar5 = (bool)(bVar5 ^ 1);
      if (cVar2 == '\0') {
        uVar10 = 1;
      }
    }
    if (!bVar5) {
      in_w8 = uVar10;
    }
    uVar10 = param_11;
    if (fVar15 <= fVar13) {
      uVar10 = param_10;
    }
    uVar10 = *param_13 | uVar10;
    *param_13 = uVar10;
    if (*(short *)(in_x12 + (long)(int)param_12 * (long)in_w15 + 0x5a) != -1) {
      uVar10 = uVar10 | 0x4000000;
      *param_13 = uVar10;
    }
    if (*(ushort *)((long)unaff_x19 + 0x20a) == param_14) {
      *param_13 = uVar10 | 0x8000000;
      lVar11 = in_x12 + (long)(int)param_12 * (long)in_w15;
      *(ulong *)(lVar11 + 0x48) = CONCAT44(in_s17,in_s17);
      *(ulong *)(lVar11 + 0x40) = CONCAT44(in_s17,in_s17);
      if (*(char *)((long)unaff_x19 + 0x249) == '\0') goto LAB_0012e4d0;
LAB_0012e464:
      sVar3 = *(short *)(unaff_x19 + 0x8b);
    }
    else {
      lVar11 = in_x12 + (long)(int)param_12 * (long)in_w15;
      *(ulong *)(lVar11 + 0x48) = CONCAT44(in_s17,in_s17);
      *(ulong *)(lVar11 + 0x40) = CONCAT44(in_s17,in_s17);
      if (*(char *)((long)unaff_x19 + 0x249) != '\0') goto LAB_0012e464;
LAB_0012e4d0:
      lVar11 = in_x12 + (long)(int)param_12 * (long)in_w15;
      *(byte *)(lVar11 + 0x6b) = *(byte *)(lVar11 + 0x6b) >> 1;
      *(byte *)(lVar11 + 0x6c) = *(byte *)(lVar11 + 0x6c) >> 1;
      sVar3 = *(short *)(unaff_x19 + 0x8b);
    }
    if (in_w10 < sVar3) {
      fVar14 = in_s16 + param_7;
      fVar13 = unaff_s11;
      if (fVar14 <= unaff_s11) {
        fVar13 = fVar14;
      }
      if (unaff_s10 <= fVar14) {
        unaff_s10 = fVar13;
      }
    }
    param_1 = param_1 + param_8 + (float)unaff_x19[0x31] + (float)unaff_x19[0x32] +
                        param_5 * (float)unaff_x19[0x30];
    in_w10 = in_w10 + 1;
    iVar1 = unaff_x19[0x1b];
    in_x9 = in_x9 + 1;
    if ((long)iVar1 <= (long)in_x9) break;
    while( true ) {
      uVar4 = *(ushort *)(in_x11 + in_x9 * 2);
      param_12 = (uint)(short)uVar4;
      iVar7 = (int)(short)uVar4;
      param_13 = (uint *)(in_x12 + (long)iVar7 * (long)in_w15);
      *(undefined1 *)((long)param_13 + 0x6a) = in_w13;
      if ((unaff_x25 & 1) == 0) {
        unaff_x25 = 0;
      }
      else if (in_w10 == *(short *)(unaff_x19 + 0x8b)) {
        unaff_x25 = 0;
        param_1 = param_1 + (in_s22 - (float)unaff_x19[0x3c]);
      }
      else {
        unaff_x25 = 1;
      }
      *param_13 = *param_13 & 0xf0ffffff;
      lVar11 = in_x12 + (long)iVar7 * (long)in_w15;
      param_15 = (float *)(lVar11 + 0x20);
      iVar8 = (int)(short)uVar4;
      if ((*(uint *)(in_x14 + (in_x9 >> 5 & 0x7ffffff) * 4) >> (ulong)((uint)in_x9 & 0x1f) & 1) != 0
         ) break;
      lVar9 = in_x12 + (long)iVar8 * (long)in_w15;
      *(float *)(lVar9 + 0x34) = param_1;
      *(ulong *)(lVar9 + 8) = CONCAT44(param_1,param_1);
      *(undefined4 *)(lVar9 + 4) = 0;
      fVar13 = unaff_s11;
      if (param_1 <= unaff_s11) {
        fVar13 = param_1;
      }
      fVar14 = unaff_s10;
      if (unaff_s10 <= param_1) {
        fVar14 = fVar13;
      }
      *param_15 = fVar14;
      *(float *)(lVar11 + 0x24) = param_2;
      *(float *)(lVar9 + 0x28) = fVar14;
      *(undefined4 *)(lVar9 + 0x2c) = param_3;
      *(undefined4 *)(lVar9 + 0x65) = param_4;
      *(undefined4 *)(lVar9 + 0x3c) = in_w16;
      in_x9 = in_x9 + 1;
      if ((long)iVar1 <= (long)in_x9) goto LAB_0012e4fc;
    }
    param_14 = (uint)uVar4;
    iVar1 = 0;
    if (*param_15 <= unaff_s9) {
      iVar1 = unaff_w20;
    }
    param_16 = (float *)(in_x12 + (long)iVar7 * (long)in_w15 + 0x28);
    bVar5 = false;
    if ((iVar1 == 1) && (bVar5 = false, !NAN(unaff_s9) && !NAN(*param_16))) {
      bVar5 = unaff_s9 < *param_16;
    }
    if (bVar5) {
      *(ushort *)((long)unaff_x19 + 0x20a) = uVar4;
    }
    *(float *)(in_x12 + (long)iVar7 * (long)in_w15 + 8) = param_1;
    fVar13 = (float)unaff_x19[0x2e];
    fVar16 = (float)unaff_x19[0x30];
    fVar15 = (float)unaff_x19[0x31];
    fVar17 = (float)unaff_x19[0x32];
    fVar14 = fVar13 + param_5 * fVar16 + fVar15 + fVar17;
    if (((uint)unaff_x19[1] >> 0x18 & 1) == 0) {
      if (((uint)unaff_x19[1] >> 0x12 & 1) == 0) {
        fVar14 = (((((float)unaff_x19[0x46] -
                    fVar14 * (float)((int)*(short *)((long)unaff_x19 + 0x202) +
                                    (int)(short)~*(ushort *)
                                                  (in_x12 + (long)iVar8 * (long)in_w15 + 0x54))) -
                   param_1) - fVar17) + param_6 * fVar16) - (float)unaff_x19[0x2f];
      }
      else {
code_r0x0012e2c4:
        fVar14 = 3.4028235e+38;
      }
    }
    else {
      sVar3 = *(short *)(in_x12 + (long)iVar8 * (long)in_w15 + 0x52);
      if (*(short *)((long)unaff_x19 + 0x22a) <= sVar3) goto code_r0x0012e2c4;
      fVar14 = (((((float)unaff_x19[0x4a] -
                  fVar14 * (float)((int)*(short *)((long)unaff_x19 + 0x22a) - (int)sVar3)) - param_1
                 ) - (float)unaff_x19[0x2f]) - fVar16) - fVar17;
    }
    unaff_x21 = in_x12 + (long)iVar8 * (long)in_w15;
    param_8 = *(float *)(unaff_x21 + 4);
    if (fVar14 <= *(float *)(unaff_x21 + 4)) {
      param_8 = fVar14;
    }
    fVar14 = *(float *)(unaff_x21 + 0x10);
    if (fVar13 <= *(float *)(unaff_x21 + 0x10)) {
      fVar14 = fVar13;
    }
    if (param_8 < fVar14) {
      param_8 = fVar14;
    }
    *(float *)(unaff_x21 + 4) = param_8;
    in_s16 = fVar17 + fVar15 + param_1 + param_8 + param_5 * fVar16;
    *(float *)(unaff_x21 + 0xc) = in_s16;
    in_s17 = param_1 + fVar16 + fVar15;
    *(float *)(unaff_x21 + 0x34) = in_s17;
    *(float *)(unaff_x21 + 0x38) = (in_s16 - fVar16) - fVar17;
    *(float *)(unaff_x21 + 0x3c) = (float)(int)(param_8 * in_w17);
    in_s18 = unaff_s11;
    if (param_1 <= unaff_s11) {
      in_s18 = param_1;
    }
  } while( true );
LAB_0012e4fc:
  if ((in_w8 & 1) == 0) {
    lVar11 = *(long *)(unaff_x19 + 6);
    *(undefined2 *)(lVar11 + (long)(int)*(short *)(unaff_x19 + 0x87) * 0x70 + 0x67) = 1;
  }
  else {
    lVar11 = *(long *)(unaff_x19 + 6);
  }
  fVar14 = *(float *)(lVar11 + (long)(int)*(short *)((long)unaff_x19 + 0x21e) * 0x70 + 0x28);
  fVar13 = (float)unaff_x19[0x44];
  if ((float)unaff_x19[0x44] < fVar14) {
    fVar13 = fVar14;
  }
  if (((unaff_w20 != 0) && (*(short *)((long)unaff_x19 + 0x20a) == -1)) && (fVar13 <= unaff_s9)) {
    *(short *)((long)unaff_x19 + 0x20a) = (short)iVar1;
  }
  uVar10 = unaff_x19[1];
  if ((unaff_w28 & 1) == 0 && (uVar10 & 1) != 0) {
    uVar10 = uVar10 & 0xfffffffe;
    unaff_x19[1] = uVar10;
  }
  *(bool *)(unaff_x19 + 0x91) = unaff_x24[1] != 0;
  if (*(short *)((long)unaff_x19 + 0x222) != -1) {
    uVar10 = uVar10 & 0xfffeffff;
    unaff_x19[1] = uVar10;
  }
  if ((uVar10 >> 0x10 & 1) != 0) {
    unaff_x19[0x46] = fVar13;
    unaff_x19[0x3e] = fVar13;
    fVar14 = (float)unaff_x19[0x4a];
    if (fVar13 <= (float)unaff_x19[0x4a]) {
      fVar14 = fVar13;
    }
    unaff_x19[0x4a] = fVar14;
  }
  lVar11 = *(long *)(unaff_x19 + 0x62);
  uVar6 = *(undefined8 *)(unaff_x19 + 0x44);
  *(undefined8 *)(lVar11 + 0x240) = *(undefined8 *)(unaff_x19 + 0x46);
  *(undefined8 *)(lVar11 + 0x238) = uVar6;
  unaff_x19[0x2b] = unaff_x19[0x48];
  unaff_x19[0x2c] = unaff_x19[0x4a];
  if (((uint)unaff_x19[1] >> 0x11 & 1) == 0) {
    lVar11 = *(long *)(unaff_x19 + 0x62);
    fVar14 = 0.0;
    if (((uint)unaff_x19[1] >> 0x19 & 1) == 0) {
      fVar14 = (float)unaff_x19[0x3f];
    }
    fVar13 = *(float *)(lVar11 + 0x264);
    if (*(float *)(lVar11 + 0x264) < fVar14) {
      fVar13 = fVar14;
    }
  }
  else {
    lVar11 = *(long *)(unaff_x19 + 0x62);
    fVar13 = (float)unaff_x19[0x3f];
  }
  fVar13 = fVar13 - *(float *)(&UNK_00003948 + unaff_x27);
  fVar14 = *(float *)(lVar11 + 0x234);
  if (fVar13 <= *(float *)(lVar11 + 0x234)) {
    fVar14 = fVar13;
  }
  fVar15 = *(float *)(lVar11 + 0x22c);
  if (*(float *)(lVar11 + 0x22c) <= fVar13) {
    fVar15 = fVar14;
  }
  *(float *)(lVar11 + 0x234) = fVar15;
  func_0x0012eab4();
  if ((*(byte *)(unaff_x19 + 1) & 1) != 0) {
    func_0x0012ec24();
  }
  *(undefined4 *)(unaff_x23 + 8) = 0;
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
      uVar6 = func_0x000b89a8("##ContextMenu",0,*unaff_x19);
      uVar12 = func_0x000d9b0c(uVar6,0x141);
      if ((uVar12 & 1) == 0) {
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
  lVar11 = *(long *)(unaff_x19 + 0x62);
  if (0 < (short)*(ushort *)((long)unaff_x19 + 0x22a)) {
    *(float *)(lVar11 + 0x78) =
         *(float *)(*(long *)(unaff_x19 + 6) +
                    (long)(int)*(short *)(*(long *)(unaff_x19 + 10) +
                                         (ulong)(*(ushort *)((long)unaff_x19 + 0x22a) - 1) * 2) *
                    0x70 + 0xc) - (float)unaff_x19[0x3c];
  }
  if (0 < *(short *)((long)unaff_x19 + 0x226)) {
    *(undefined4 *)(lVar11 + 0x7c) = *(undefined4 *)(unaff_x23 + 0xc);
  }
  *(undefined4 *)(unaff_x23 + 0xc) = 0;
  if ((*(byte *)((long)unaff_x19 + 6) >> 4 & 1) == 0) {
    func_0x000f0930(*(undefined8 *)(lVar11 + 0x2a8),lVar11 + 0x248,lVar11 + 0x250,0);
  }
  else {
    func_0x000f69c4(*(undefined8 *)(unaff_x19 + 0x68),*(undefined8 *)(lVar11 + 0x2a8),2);
  }
  return;
}

