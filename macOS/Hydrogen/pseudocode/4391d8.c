
void FUN_004391d8(void)

{
  long lVar1;
  long *unaff_x28;
  undefined8 in_stack_000000b0;
  long in_stack_00000138;
  undefined8 in_stack_00000140;
  long *in_stack_00000148;
  undefined8 in_stack_00000270;
  undefined8 in_stack_00000278;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x003f73ec(in_stack_00000140);
  lVar1 = *unaff_x28;
  *unaff_x28 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403ad4(auStack_7ffffffe + 0x80000246);
  }
  func_0x003f55f4(auStack_7ffffffe + 0x8000024e);
  func_0x003f56c4(in_stack_00000270,in_stack_00000278);
  if ((in_stack_00000138 == -0x8000000000000000) && (*in_stack_00000148 != -0x8000000000000000)) {
    func_0x003f73ec(in_stack_00000148);
  }
  func_0x003f73ec(in_stack_000000b0);
  return;
}

