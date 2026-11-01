
/* WARNING: Removing unreachable block (ram,0x000630d4) */

undefined8 FUN_00063064(void)

{
  int in_w8;
  ulong unaff_x20;
  undefined8 in_stack_00000000;
  undefined1 uStack000000000000000f;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  
  if (in_w8 < 0) {
    __ZdlPv();
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if ((unaff_x20 & 1) != 0) {
    uStack000000000000000f = 0;
    func_0x0005cc80(&uStack0000000000000018);
    if (in_stack_00000028._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000018);
      return 0;
    }
  }
  return 0;
}

