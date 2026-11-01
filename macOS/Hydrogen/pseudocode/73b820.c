
undefined8 FUN_0073b820(void)

{
  int iVar1;
  undefined8 uVar2;
  ushort uVar3;
  long unaff_x19;
  long unaff_x20;
  long in_stack_00000008;
  
  uVar2 = _strncmp();
  if ((int)uVar2 == 0) {
    uVar3 = 0xffdf;
  }
  else {
    iVar1 = func_0x0073ada4();
    if (iVar1 == 0) {
      return 3;
    }
    if (in_stack_00000008 != unaff_x20) {
      return 3;
    }
    uVar2 = 0;
    uVar3 = *(ushort *)(unaff_x19 + 0x1a) | (ushort)iVar1;
  }
  *(ushort *)(unaff_x19 + 0x1a) = uVar3;
  return uVar2;
}

