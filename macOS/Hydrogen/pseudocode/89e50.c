
void FUN_00089e50(long param_1)

{
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000012;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  
  uStack0000000000000008 = *(undefined8 *)(param_1 + 0xa4a);
  uStack0000000000000012 = 0;
  func_0x0008956c();
  if (in_stack_00000018 < 0) {
    __ZdlPv(uStack0000000000000008);
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
    return;
  }
  return;
}

