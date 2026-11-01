
void FUN_000f286c(undefined1 param_1 [16],float param_2)

{
  int iVar1;
  long lVar2;
  int iVar3;
  uint uVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  int unaff_w23;
  int unaff_w24;
  float fVar5;
  float fVar6;
  float fVar7;
  undefined4 unaff_s8;
  undefined4 unaff_s9;
  undefined8 uVar8;
  float unaff_s10;
  undefined8 in_stack_00000000;
  
  fVar6 = (float)___sincosf_stret(unaff_s9);
  uVar8 = *unaff_x20;
  fVar7 = (float)in_stack_00000000;
  fVar5 = param_2 * fVar7;
  iVar3 = *(int *)(unaff_x19 + 0x78);
  if (iVar3 == unaff_w23) {
    if (unaff_w23 == 0) {
      uVar4 = 8;
    }
    else {
      iVar3 = unaff_w23;
      if (unaff_w23 < 0) {
        iVar3 = unaff_w23 + 1;
      }
      uVar4 = unaff_w23 + (iVar3 >> 1);
    }
    if ((int)uVar4 <= (int)(unaff_w23 + 1U)) {
      uVar4 = unaff_w23 + 1U;
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
       CONCAT44((float)((ulong)uVar8 >> 0x20) + fVar6 * fVar7,(float)uVar8 + fVar5);
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  if (0 < unaff_w24) {
    func_0x000f1da4(in_stack_00000000);
  }
  if (1e-05 <= unaff_s10) {
    fVar5 = (float)___sincosf_stret(unaff_s8);
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
         CONCAT44((float)((ulong)uVar8 >> 0x20) + fVar5 * fVar7,(float)uVar8 + param_2 * fVar7);
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  return;
}

