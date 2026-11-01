
void FUN_000f26bc(float param_1,float param_2)

{
  int iVar1;
  char in_NG;
  char in_OV;
  long lVar2;
  int in_w8;
  int iVar3;
  uint uVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  uint unaff_w23;
  int unaff_w24;
  float fVar5;
  float fVar6;
  float fVar7;
  undefined4 unaff_s8;
  undefined8 uVar8;
  undefined4 unaff_s9;
  float unaff_s10;
  float unaff_s11;
  undefined8 in_stack_00000000;
  
  if (in_NG == in_OV) {
    in_w8 = in_w8 + 1;
  }
  if (param_1 <= unaff_s11) {
    in_w8 = in_w8 + 1;
  }
  uVar4 = in_w8 + 1;
  fVar5 = (float)in_stack_00000000;
  if ((int)unaff_w23 < (int)uVar4) {
    uVar8 = func_0x000b810c(-(ulong)(uVar4 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar4 << 3);
    if (*(long *)(unaff_x19 + 0x80) != 0) {
      _memcpy(uVar8,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
    }
    *(undefined8 *)(unaff_x19 + 0x80) = uVar8;
    *(uint *)(unaff_x19 + 0x7c) = uVar4;
    unaff_w23 = uVar4;
  }
  if (1e-05 <= unaff_s11) {
    fVar7 = (float)___sincosf_stret(unaff_s9);
    uVar8 = *unaff_x20;
    fVar6 = param_2 * fVar5;
    uVar4 = *(uint *)(unaff_x19 + 0x78);
    if (uVar4 == unaff_w23) {
      if (unaff_w23 == 0) {
        uVar4 = 8;
      }
      else {
        uVar4 = unaff_w23;
        if ((int)unaff_w23 < 0) {
          uVar4 = unaff_w23 + 1;
        }
        uVar4 = unaff_w23 + ((int)uVar4 >> 1);
      }
      if ((int)uVar4 <= (int)(unaff_w23 + 1)) {
        uVar4 = unaff_w23 + 1;
      }
      lVar2 = func_0x000b810c(-(ulong)(uVar4 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar4 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar2,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar2;
      *(uint *)(unaff_x19 + 0x7c) = uVar4;
      uVar4 = *(uint *)(unaff_x19 + 0x78);
    }
    else {
      lVar2 = *(long *)(unaff_x19 + 0x80);
    }
    *(ulong *)(lVar2 + (long)(int)uVar4 * 8) =
         CONCAT44((float)((ulong)uVar8 >> 0x20) + fVar7 * fVar5,(float)uVar8 + fVar6);
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  if (0 < unaff_w24) {
    func_0x000f1da4(in_stack_00000000);
  }
  if (1e-05 <= unaff_s10) {
    fVar6 = (float)___sincosf_stret(unaff_s8);
    uVar8 = *unaff_x20;
    iVar3 = *(int *)(unaff_x19 + 0x78);
    if (iVar3 == *(int *)(unaff_x19 + 0x7c)) {
      if (iVar3 == 0) {
        uVar4 = 8;
      }
      else {
        iVar1 = iVar3;
        if (iVar3 < 0) {
          iVar1 = iVar3 + 1;
        }
        uVar4 = iVar3 + (iVar1 >> 1);
      }
      if ((int)uVar4 <= (int)(iVar3 + 1U)) {
        uVar4 = iVar3 + 1U;
      }
      lVar2 = func_0x000b810c(-(ulong)(uVar4 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar4 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar2,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar2;
      *(uint *)(unaff_x19 + 0x7c) = uVar4;
      iVar3 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar2 = *(long *)(unaff_x19 + 0x80);
    }
    *(ulong *)(lVar2 + (long)iVar3 * 8) =
         CONCAT44((float)((ulong)uVar8 >> 0x20) + fVar6 * fVar5,(float)uVar8 + param_2 * fVar5);
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  return;
}

