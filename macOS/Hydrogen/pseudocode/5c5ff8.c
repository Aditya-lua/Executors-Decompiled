
void FUN_005c5ff8(long param_1,undefined8 param_2,long param_3)

{
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long in_stack_00000000;
  long in_stack_00000010;
  
  while( true ) {
    if (param_3 != 0) {
      func_0x00187bd4(*(undefined8 *)(param_1 + 0x220),param_3,1);
    }
    func_0x005c6384(unaff_x22 + unaff_x23 * unaff_x20);
    func_0x005c6f60();
    if (in_stack_00000000 == 0) break;
    param_1 = in_stack_00000000 + in_stack_00000010 * unaff_x21;
    param_3 = *(long *)(param_1 + 0x218);
    unaff_x22 = in_stack_00000000;
    unaff_x23 = in_stack_00000010;
  }
  return;
}

