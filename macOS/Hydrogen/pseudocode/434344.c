
undefined8 FUN_00434344(void)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  
  do {
    uVar2 = func_0x0046a9ac();
    if ((uVar2 & 1) != 0) {
      return 1;
    }
    func_0x0046daac(&uStack0000000000000010);
    if (uStack0000000000000010 == 0) {
      return 0;
    }
    if (in_stack_00000028 == 0) {
      uVar3 = func_0x0046adc0(uStack0000000000000010,in_stack_00000018);
      return uVar3;
    }
    iVar1 = func_0x0046920c();
  } while (iVar1 == 0);
  return 1;
}

