
/* WARNING: Removing unreachable block (ram,0x004c4fc4) */
/* WARNING: Removing unreachable block (ram,0x004c490c) */

undefined8 FUN_004c4f54(long *param_1)

{
  long lVar1;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x28;
  ulong in_stack_00000038;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined1 uStack00000000000001f0;
  
  lVar1 = *param_1;
  *param_1 = lVar1 + unaff_x22;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(unaff_x21 + 0x48);
  }
  if ((0x19 < (ulong)unaff_x28[0xd]) || ((1L << (unaff_x28[0xd] & 0x3fU) & 0x2410000U) == 0)) {
    func_0x004bba74(&uStack00000000000001f0);
  }
  if (((in_stack_00000038 & 0x100000000) != 0) && (*unaff_x28 != 0)) {
    func_0x00187bd4(unaff_x28[1],*unaff_x28 << 2,4);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

