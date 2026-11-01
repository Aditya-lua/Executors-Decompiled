
void FUN_0066e638(code *param_1)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  undefined4 uVar4;
  ulong *unaff_x19;
  undefined8 *unaff_x20;
  ulong *unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  undefined4 uStack0000000000000008;
  uint uStack000000000000000c;
  
  iVar3 = (*param_1)();
  uVar4 = uStack0000000000000008;
  if (iVar3 == 0) {
    uVar4 = 9;
  }
  *(undefined4 *)(unaff_x22 + 0x98) = uVar4;
  iVar3 = (**(code **)(*unaff_x23 + 0x10))();
  if ((iVar3 == 0) || (_uStack0000000000000008 < 0)) {
    uStack000000000000000c = (**(code **)(**(long **)(unaff_x22 + 0x90) + 0x48))();
  }
  *(uint *)(unaff_x22 + 0x9c) = uStack000000000000000c;
  *(undefined1 *)(unaff_x22 + 0xa0) = 0;
  uVar1 = (ulong)uStack000000000000000c;
  uVar2 = 0;
  if ((*(uint *)(unaff_x22 + 0x98) & 1) != 0) {
    uVar1 = 0;
    uVar2 = (ulong)uStack000000000000000c;
  }
  *unaff_x21 = uVar2;
  *unaff_x20 = 1;
  *unaff_x19 = uVar1;
  return;
}

