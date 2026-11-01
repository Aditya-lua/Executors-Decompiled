
undefined8 FUN_00095188(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  int iVar5;
  uint uVar6;
  ulong uVar7;
  uint uVar8;
  long *unaff_x19;
  long unaff_x20;
  uint *unaff_x21;
  uint uVar9;
  ulong unaff_x22;
  
  if (param_4 == 0) {
    return param_1;
  }
  uVar2 = *unaff_x21;
  uVar6 = *(uint *)(unaff_x19 + 1);
  uVar8 = *(uint *)((long)unaff_x19 + 0xc);
  if (uVar8 < uVar6 + 4) {
    do {
      uVar8 = uVar8 << 1;
    } while (uVar8 < uVar6 + 4);
    lVar3 = _realloc(*unaff_x19,uVar8);
    *unaff_x19 = lVar3;
    if (lVar3 != 0) {
      *(uint *)((long)unaff_x19 + 0xc) = uVar8;
      uVar6 = *(uint *)(unaff_x19 + 1);
      goto code_r0x000951d0;
    }
LAB_0009527c:
    iVar5 = 0;
    uVar4 = 0x100;
  }
  else {
    lVar3 = *unaff_x19;
code_r0x000951d0:
    uVar7 = unaff_x20 - (unaff_x22 & 0xfffffffffffff000);
    *(uint *)(lVar3 + (ulong)uVar6) =
         uVar2 | 0x90000000 | (uint)(uVar7 >> 9) & 0xffffe0 | ((uint)(uVar7 >> 0xc) & 3) << 0x1d;
    lVar3 = unaff_x19[1];
    uVar9 = *(uint *)((long)unaff_x19 + 0xc);
    uVar6 = (int)lVar3 + 4;
    *(uint *)(unaff_x19 + 1) = uVar6;
    uVar2 = *unaff_x21;
    uVar8 = 0x91000000;
    if (unaff_x21[1] != 0x40) {
      uVar8 = 0x11000000;
    }
    uVar1 = (int)lVar3 + 8;
    if (uVar9 < uVar1) {
      do {
        uVar9 = uVar9 << 1;
      } while (uVar9 < uVar1);
      lVar3 = _realloc(*unaff_x19,uVar9);
      *unaff_x19 = lVar3;
      if (lVar3 == 0) goto LAB_0009527c;
      *(uint *)((long)unaff_x19 + 0xc) = uVar9;
      uVar6 = *(uint *)(unaff_x19 + 1);
    }
    else {
      lVar3 = *unaff_x19;
    }
    uVar4 = 0;
    *(uint *)(lVar3 + (ulong)uVar6) = uVar8 | ((uint)unaff_x20 & 0xfff) << 10 | uVar2 << 5 | uVar2;
    iVar5 = (int)unaff_x19[1] + 4;
  }
  *(int *)(unaff_x19 + 1) = iVar5;
  return uVar4;
}

