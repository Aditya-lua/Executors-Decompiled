
undefined8 FUN_0073e8bc(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 in_stack_00000018;
  
  if (0 < *(int *)(param_1 + 8)) {
    func_0x0073cab8();
  }
  lVar1 = func_0x0073ea0c("default");
  if (lVar1 == 0) {
    uVar2 = 0x1b;
  }
  else {
    uVar2 = func_0x0073eae4();
    if ((int)uVar2 == 0) {
      func_0x00783e98();
    }
    else {
      func_0x0073c9e4();
    }
  }
  (*pcRam0000000000a2b5f0)(lVar1);
  (*pcRam0000000000a2b5f0)(in_stack_00000018);
  return uVar2;
}

