
void FUN_004f980c(void)

{
  long in_stack_000001f8;
  undefined8 in_stack_00000208;
  long in_stack_00000220;
  undefined8 in_stack_00000228;
  long in_stack_00000238;
  undefined8 in_stack_00000240;
  long in_stack_00000250;
  undefined8 in_stack_00000258;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00500404(auStack_7ffffffe + 0x8000026e);
  func_0x005045fc(auStack_7ffffffe + 0x8000026e);
  func_0x004fbef8(in_stack_00000208,auStack_7ffffffe + 0x8000026e,auStack_7ffffffe + 0x8000026d);
  func_0x004f5ae4(auStack_7ffffffe + 0x8000026e);
  if ((in_stack_000001f8 == 0) && (in_stack_00000250 != 0)) {
    func_0x00187bd4(in_stack_00000258,in_stack_00000250 << 4,8);
  }
  if (in_stack_00000238 != 0) {
    func_0x00187bd4(in_stack_00000240,in_stack_00000238 << 3,8);
  }
  if (in_stack_00000220 != 0) {
    func_0x00187bd4(in_stack_00000228,in_stack_00000220 << 3,8);
  }
  return;
}

