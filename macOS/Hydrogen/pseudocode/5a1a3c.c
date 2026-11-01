
/* WARNING: Removing unreachable block (ram,0x005a1a7c) */
/* WARNING: Removing unreachable block (ram,0x005a1a84) */

void FUN_005a1a3c(undefined8 param_1)

{
  undefined8 *unaff_x19;
  long unaff_x24;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  long in_stack_00000038;
  long in_stack_00000058;
  
  if (in_stack_00000058 != 0) {
    func_0x00187bd4(param_1,in_stack_00000058 << 3,8);
  }
  if (((unaff_x24 != 0) && (in_stack_00000028 != 0)) && (in_stack_00000038 != 0)) {
    func_0x00187bd4(in_stack_00000028,in_stack_00000038 << 3,8);
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

