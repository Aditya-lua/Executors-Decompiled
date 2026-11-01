
/* WARNING: Removing unreachable block (ram,0x004c4fc4) */
/* WARNING: Removing unreachable block (ram,0x004c490c) */

undefined8 FUN_004c4ee8(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 *in_x9;
  long unaff_x29;
  ulong in_stack_00000038;
  undefined4 in_stack_00000070;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  long in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined1 uStack00000000000001f0;
  ulong in_stack_00000208;
  long *in_stack_00000450;
  long *in_stack_00000458;
  undefined1 auStack_7ffffffe [2147483646];
  
  *in_x9 = param_1;
  in_x9[1] = param_2;
  in_x9[2] = param_1;
  func_0x00584c34(unaff_x29 + -0xd0,in_stack_000000f8,in_stack_00000118._4_4_,
                  auStack_7ffffffe + 0x8000066e);
  func_0x004bb068(unaff_x29 + -0xd0);
  func_0x004bea24(in_stack_000000f8,in_stack_00000118._4_4_,1,in_stack_00000070);
  lVar1 = *in_stack_00000450;
  *in_stack_00000450 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(auStack_7ffffffe + 0x8000044e);
  }
  lVar1 = *in_stack_00000458;
  *in_stack_00000458 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(auStack_7ffffffe + 0x80000456);
  }
  if ((0x19 < in_stack_00000208) || ((1L << (in_stack_00000208 & 0x3f) & 0x2410000U) == 0)) {
    func_0x004bba74(&uStack00000000000001f0);
  }
  if (((in_stack_00000038 & 0x100000000) != 0) && (in_stack_000001a0 != 0)) {
    func_0x00187bd4(in_stack_000001a8,in_stack_000001a0 << 2,4);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

