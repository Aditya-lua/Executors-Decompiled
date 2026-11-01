
/* WARNING: Removing unreachable block (ram,0x007abf64) */

undefined8 FUN_007abf54(void)

{
  ulong uVar1;
  undefined8 in_x9;
  undefined8 in_x10;
  long in_x11;
  undefined8 unaff_x19;
  undefined8 unaff_x22;
  undefined8 *unaff_x23;
  long in_stack_00000048;
  
  *unaff_x23 = unaff_x19;
  unaff_x23[1] = in_x9;
  unaff_x23[2] = in_x10;
  unaff_x23[3] = unaff_x22;
  uVar1 = in_stack_00000048 - 1U & -in_stack_00000048;
  func_0x00187bd4(in_x11 - uVar1,uVar1 + 8);
  return 0x8000000000000001;
}

