
undefined8 FUN_00095704(int param_1)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  long unaff_x19;
  uint uVar4;
  undefined8 unaff_x20;
  long *unaff_x21;
  long in_stack_00000008;
  
  if (param_1 != 0) goto LAB_000957a8;
  uVar1 = *(uint *)(unaff_x19 + 0x18);
  uVar4 = *(uint *)(unaff_x19 + 0x1c);
  if (uVar4 < uVar1 + 4) {
    do {
      uVar4 = uVar4 << 1;
    } while (uVar4 < uVar1 + 4);
    lVar2 = _realloc(*unaff_x21,uVar4);
    *unaff_x21 = lVar2;
    if (lVar2 != 0) {
      *(uint *)(unaff_x19 + 0x1c) = uVar4;
      uVar1 = *(uint *)(unaff_x19 + 0x18);
      goto code_r0x00095780;
    }
    iVar3 = 0;
    unaff_x20 = 0x100;
  }
  else {
    lVar2 = *unaff_x21;
code_r0x00095780:
    unaff_x20 = 0;
    *(undefined4 *)(lVar2 + (ulong)uVar1) = 0xd61f0220;
    iVar3 = *(int *)(unaff_x19 + 0x18) + 4;
  }
  *(int *)(unaff_x19 + 0x18) = iVar3;
LAB_000957a8:
  if (((int)unaff_x20 == 0) || (in_stack_00000008 == 0)) {
    return unaff_x20;
  }
  _free();
  return unaff_x20;
}

