
undefined8 FUN_0073e7c8(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 in_stack_00000018;
  
  lVar1 = func_0x00740a58();
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

