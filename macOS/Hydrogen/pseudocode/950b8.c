
undefined8 FUN_000950b8(undefined8 param_1,undefined8 param_2,uint *param_3,int *param_4)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  uint uVar5;
  long *unaff_x19;
  uint unaff_w20;
  uint uVar6;
  uint unaff_w22;
  ulong unaff_x24;
  long unaff_x26;
  
  iVar4 = *param_4;
  uVar1 = *param_3;
  uVar5 = *(uint *)(unaff_x19 + 1);
  uVar6 = *(uint *)((long)unaff_x19 + 0xc);
  if (uVar6 < uVar5 + 4) {
    do {
      uVar6 = uVar6 << 1;
    } while (uVar6 < uVar5 + 4);
    lVar2 = _realloc(*unaff_x19,uVar6);
    *unaff_x19 = lVar2;
    if (lVar2 == 0) {
      uVar3 = 0x100;
      iVar4 = 0;
      goto code_r0x00095134;
    }
    *(uint *)((long)unaff_x19 + 0xc) = uVar6;
    uVar5 = *(uint *)(unaff_x19 + 1);
  }
  else {
    lVar2 = *unaff_x19;
  }
  uVar3 = 0;
  *(uint *)(lVar2 + (ulong)uVar5) =
       uVar1 | iVar4 << 5 | ((uint)(unaff_x26 >> (unaff_x24 & 0x3f)) & 0xfff) << 10 |
       unaff_w20 | unaff_w22;
  iVar4 = (int)unaff_x19[1] + 4;
code_r0x00095134:
  *(int *)(unaff_x19 + 1) = iVar4;
  return uVar3;
}

