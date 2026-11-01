
/* WARNING: Removing unreachable block (ram,0x00030db0) */
/* WARNING: Removing unreachable block (ram,0x00030dc4) */

undefined8 FUN_00030d3c(void)

{
  undefined8 unaff_x20;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  long lStack0000000000000010;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  long in_stack_00000050;
  
  uStack0000000000000040 = 0;
  uStack0000000000000008 = *(undefined8 *)(unaff_x29 + -0x40);
  uStack0000000000000000 = *(undefined8 *)(unaff_x29 + -0x48);
  lStack0000000000000010 = *(long *)(unaff_x29 + -0x38);
  *(undefined8 *)(unaff_x29 + -0x48) = 0;
  *(undefined8 *)(unaff_x29 + -0x40) = 0;
  *(undefined8 *)(unaff_x29 + -0x38) = 0;
  func_0x00031798();
  if (lStack0000000000000010 < 0) {
    __ZdlPv(uStack0000000000000000);
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  return unaff_x20;
}

