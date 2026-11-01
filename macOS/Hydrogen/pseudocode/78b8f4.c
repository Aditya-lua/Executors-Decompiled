
undefined4 FUN_0078b8f4(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined4 uVar4;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  
  uVar2 = func_0x00740a58();
  lVar3 = _strchr(uVar2,0x25);
  uVar4 = 0;
  if (lVar3 != 0) {
    iVar1 = func_0x00742734(uVar2,0);
    if (iVar1 == 0) {
      func_0x007406b0(param_1);
      iVar1 = func_0x0074075c(param_1,in_stack_00000000,in_stack_00000008);
      (*pcRam0000000000a2b5f0)(in_stack_00000000);
      if (iVar1 == 0) {
        return 0;
      }
      uVar4 = 0x1f;
      if (iVar1 != 100) {
        uVar4 = 7;
      }
      return uVar4;
    }
    uVar4 = 0x15;
  }
  return uVar4;
}

