
undefined8 FUN_004c0cb8(long param_1)

{
  long in_stack_000001d0;
  undefined8 in_stack_000001d8;
  long in_stack_00000300;
  undefined8 in_stack_00000308;
  undefined1 auStack_7ffffffe [2147483646];
  
  if ((param_1 != 0x16) && (param_1 != 0x19)) {
    func_0x004bba74(auStack_7ffffffe + 0x8000052e);
  }
  if (in_stack_00000300 != 0) {
    func_0x00187bd4(in_stack_00000308,in_stack_00000300 << 2,4);
  }
  if (in_stack_000001d0 != 0) {
    func_0x00187bd4(in_stack_000001d8,in_stack_000001d0 << 2,4);
  }
  return 1;
}

