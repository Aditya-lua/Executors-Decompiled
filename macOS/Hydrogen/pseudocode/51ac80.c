
void FUN_0051ac80(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  lVar1 = *(long *)(unaff_x20 + 0x50);
  if ((-0x7fffffffffffffff < lVar1) && (lVar1 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x58),lVar1,1);
  }
  *(undefined8 *)(unaff_x20 + 0x58) = in_stack_00000010;
  *(long *)(unaff_x20 + 0x50) = in_stack_00000008;
  *(undefined8 *)(unaff_x20 + 0x60) = in_stack_00000018;
  return;
}

