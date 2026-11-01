
undefined8 FUN_004ff070(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined1 in_stack_00000058;
  
  func_0x00523f08(&uStack0000000000000010);
  uVar2 = in_stack_00000018;
  lVar1 = uStack0000000000000010;
  uStack0000000000000040 = uStack0000000000000010;
  in_stack_00000048 = in_stack_00000018;
  in_stack_00000050 = in_stack_00000020;
  in_stack_00000058 = 0;
  uVar3 = func_0x0051e748(&uStack0000000000000040);
  if (lVar1 != 0) {
    func_0x00187bd4(uVar2,lVar1,1);
  }
  return uVar3;
}

