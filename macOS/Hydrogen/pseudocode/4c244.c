
undefined8 FUN_0004c244(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 in_stack_00000078;
  long in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_000000a0;
  undefined8 in_stack_000000a8;
  long in_stack_000000b8;
  
  iVar1 = func_0x00700e1c();
  if (iVar1 == 0) {
    uVar2 = 1;
  }
  else {
    func_0x006e383c();
    func_0x006e1ee0();
    uVar2 = 2;
  }
  if (in_stack_00000088 < 0) {
    __ZdlPv(in_stack_00000078);
  }
  if (in_stack_000000a0 < 0) {
    __ZdlPv(in_stack_00000090);
  }
  if (in_stack_000000b8 < 0) {
    __ZdlPv(in_stack_000000a8);
  }
  return uVar2;
}

