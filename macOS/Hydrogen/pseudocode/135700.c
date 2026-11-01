
void FUN_00135700(float param_1,float param_2,float param_3,float param_4,long param_5)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  float *pfVar5;
  long lVar6;
  int iVar7;
  int iVar8;
  long lVar9;
  long unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long *unaff_x23;
  float fVar10;
  undefined4 uVar11;
  float fVar12;
  float fVar13;
  ulong uVar14;
  ulong uVar15;
  float unaff_s8;
  
  fVar13 = unaff_s8 - param_1;
  if (unaff_s8 - param_1 < 0.0) {
    fVar13 = 0.0;
  }
  fVar10 = fVar13 + (*(float *)(unaff_x19 + 0x154) - unaff_s8);
  fVar12 = param_4 - fVar13;
  if (param_3 + param_2 <= param_4 - fVar13) {
    fVar12 = param_3 + param_2;
  }
  fVar12 = fVar12 - *(float *)(unaff_x19 + 0x28);
  fVar13 = fVar10 + 1.0;
  if (fVar12 < fVar13) {
    fVar12 = fVar13;
  }
  *(float *)(param_5 + 0x14) = fVar10;
  *(float *)(param_5 + 0x18) = fVar12;
  uVar11 = *(undefined4 *)(unaff_x19 + 0x114);
  *(undefined4 *)(param_5 + 0x1c) = uVar11;
  *(undefined4 *)(param_5 + 0x20) = uVar11;
  iVar7 = *(int *)(param_5 + 0x60);
  iVar8 = unaff_w21 + 1;
  if (iVar7 == 0 || iVar7 == iVar8) {
    *(bool *)(unaff_x20 + 8) = iVar7 == 0;
    if (iVar7 == 0) {
      iVar7 = *(int *)(unaff_x20 + 100);
      goto joined_r0x001358cc;
    }
  }
  else {
    iVar7 = *(int *)(unaff_x20 + 100);
    if (iVar7 < 0) {
      uVar3 = func_0x000b810c(0);
      if (*(long *)(unaff_x20 + 0x68) != 0) {
        _memcpy(uVar3,*(long *)(unaff_x20 + 0x68),(long)*(int *)(unaff_x20 + 0x60) * 0x1c);
        func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x68));
      }
      iVar7 = 0;
      *(undefined8 *)(unaff_x20 + 0x68) = uVar3;
      *(undefined4 *)(unaff_x20 + 100) = 0;
    }
    *(undefined4 *)(unaff_x20 + 0x60) = 0;
    *(undefined1 *)(unaff_x20 + 8) = 1;
joined_r0x001358cc:
    if (iVar7 <= unaff_w21) {
      uVar3 = func_0x000b810c((long)iVar8 * 0x1c);
      if (*(long *)(unaff_x20 + 0x68) != 0) {
        _memcpy(uVar3,*(long *)(unaff_x20 + 0x68),(long)*(int *)(unaff_x20 + 0x60) * 0x1c);
        func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x68));
      }
      *(undefined8 *)(unaff_x20 + 0x68) = uVar3;
      *(int *)(unaff_x20 + 100) = iVar8;
    }
    if (unaff_w21 < 0) goto LAB_001359e0;
    iVar7 = 0;
    iVar8 = *(int *)(unaff_x20 + 0x60);
    do {
      if (iVar8 == *(int *)(unaff_x20 + 100)) {
        iVar1 = iVar8;
        if (iVar8 < 0) {
          iVar1 = iVar8 + 1;
        }
        iVar2 = 8;
        if (iVar8 != 0) {
          iVar2 = iVar8 + (iVar1 >> 1);
        }
        if (iVar2 <= iVar8 + 1) {
          iVar2 = iVar8 + 1;
        }
        lVar4 = func_0x000b810c((long)iVar2 * 0x1c);
        if (*(long *)(unaff_x20 + 0x68) != 0) {
          _memcpy(lVar4,*(long *)(unaff_x20 + 0x68),(long)*(int *)(unaff_x20 + 0x60) * 0x1c);
          func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x68));
        }
        *(long *)(unaff_x20 + 0x68) = lVar4;
        *(int *)(unaff_x20 + 100) = iVar2;
        iVar8 = *(int *)(unaff_x20 + 0x60);
      }
      else {
        lVar4 = *(long *)(unaff_x20 + 0x68);
      }
      pfVar5 = (float *)(lVar4 + (long)iVar8 * 0x1c);
      *pfVar5 = (float)iVar7 / (float)unaff_w21;
      pfVar5[1] = 0.0;
      pfVar5[2] = 0.0;
      pfVar5[5] = 0.0;
      pfVar5[6] = 0.0;
      pfVar5[3] = 0.0;
      pfVar5[4] = 0.0;
      iVar8 = *(int *)(unaff_x20 + 0x60) + 1;
      *(int *)(unaff_x20 + 0x60) = iVar8;
      iVar7 = iVar7 + 1;
    } while (unaff_w21 + 1 != iVar7);
  }
  if (0 < unaff_w21) {
    lVar4 = *(long *)(unaff_x20 + 0x68);
    lVar6 = *(long *)(*(long *)(*unaff_x23 + 0x4000) + 0x1b8);
    iVar8 = 0;
    do {
      if (lVar6 == 0) {
        fVar13 = 0.0;
        fVar12 = 0.0;
      }
      else {
        fVar12 = *(float *)(lVar6 + 0x14);
        fVar10 = *(float *)(lVar6 + 0x18) - fVar12;
        fVar13 = fVar12 + *(float *)(*(long *)(lVar6 + 0x68) + (long)iVar8 * 0x1c) * fVar10;
        fVar12 = fVar12 + *(float *)(*(long *)(lVar6 + 0x68) + (long)(iVar8 + 1) * 0x1c) * fVar10;
      }
      iVar7 = iVar8 + 1;
      fVar13 = (float)(int)(*(float *)(unaff_x19 + 0x28) + fVar13 + 0.5);
      fVar12 = (float)(int)(*(float *)(unaff_x19 + 0x28) + fVar12 + -1.0 + 0.5);
      lVar9 = lVar4 + (long)iVar8 * 0x1c;
      *(float *)(lVar9 + 0xc) = fVar13;
      *(undefined4 *)(lVar9 + 0x10) = 0xff7fffff;
      *(float *)(lVar9 + 0x14) = fVar12;
      *(undefined4 *)(lVar9 + 0x18) = 0x7f7fffff;
      uVar14 = *(ulong *)(unaff_x19 + 0x250);
      uVar15 = *(ulong *)(unaff_x19 + 0x248);
      uVar14 = uVar14 ^ (uVar14 ^ CONCAT44(0xff7fffff,fVar13)) &
                        ~CONCAT44(-(uint)((float)(uVar14 >> 0x20) < -3.4028235e+38),
                                  -(uint)((float)uVar14 < fVar13));
      *(ulong *)(lVar9 + 0xc) =
           uVar14 ^ (uVar14 ^ uVar15) &
                    CONCAT44(-(uint)(-3.4028235e+38 < (float)(uVar15 >> 0x20)),
                             -(uint)(fVar13 < (float)uVar15));
      uVar14 = *(ulong *)(unaff_x19 + 0x250);
      uVar15 = *(ulong *)(unaff_x19 + 0x248);
      uVar14 = uVar14 ^ (uVar14 ^ CONCAT44(0x7f7fffff,fVar12)) &
                        ~CONCAT44(-(uint)((float)(uVar14 >> 0x20) < 3.4028235e+38),
                                  -(uint)((float)uVar14 < fVar12));
      *(ulong *)(lVar9 + 0x14) =
           uVar14 ^ (uVar14 ^ uVar15) &
                    CONCAT44(-(uint)(3.4028235e+38 < (float)(uVar15 >> 0x20)),
                             -(uint)(fVar12 < (float)uVar15));
      iVar8 = iVar7;
    } while (iVar7 < unaff_w21);
  }
LAB_001359e0:
  if (1 < *(int *)(unaff_x20 + 0x10)) {
    func_0x000f681c(unaff_x20 + 0x70,*(undefined8 *)(unaff_x19 + 0x2a8),
                    *(int *)(unaff_x20 + 0x10) + 1);
    func_0x000f69c4(unaff_x20 + 0x70,*(undefined8 *)(unaff_x19 + 0x2a8),1);
    lVar4 = *(long *)(*(long *)(*(long *)(*unaff_x23 + 0x4000) + 0x1b8) + 0x68);
    func_0x000cde90(lVar4 + 0xc,lVar4 + 0x14,0);
  }
  lVar4 = *(long *)(*(long *)(*unaff_x23 + 0x4000) + 0x1b8);
  fVar12 = 0.0;
  fVar13 = 0.0;
  if (lVar4 != 0) {
    iVar8 = *(int *)(unaff_x20 + 0xc);
    iVar7 = iVar8;
    if (iVar8 < 0) {
      iVar7 = *(int *)(lVar4 + 0xc);
    }
    fVar13 = *(float *)(lVar4 + 0x14);
    fVar10 = *(float *)(lVar4 + 0x18) - fVar13;
    if (iVar8 < -1) {
      iVar8 = *(int *)(lVar4 + 0xc);
    }
    else {
      iVar8 = iVar8 + 1;
    }
    fVar12 = fVar13 + *(float *)(*(long *)(lVar4 + 0x68) + (long)iVar7 * 0x1c) * fVar10;
    fVar13 = fVar13 + *(float *)(*(long *)(lVar4 + 0x68) + (long)iVar8 * 0x1c) * fVar10;
  }
  func_0x000d86b8((fVar13 - fVar12) * 0.65);
  fVar12 = unaff_s8 - *(float *)(unaff_x19 + 0x58);
  if (fVar12 < 0.0) {
    fVar12 = 0.0;
  }
  *(float *)(unaff_x19 + 0x158) = fVar12;
  *(float *)(unaff_x19 + 0x110) =
       (float)(int)(fVar12 + *(float *)(unaff_x19 + 0x28) + *(float *)(unaff_x19 + 0x154));
  *(float *)(unaff_x19 + 0x230) = (fVar13 + *(float *)(unaff_x19 + 0x28)) - unaff_s8;
  *(undefined4 *)(unaff_x19 + 0x234) = *(undefined4 *)(unaff_x19 + 0x264);
  return;
}

