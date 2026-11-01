
/* WARNING: Removing unreachable block (ram,0x00083858) */

void FUN_000837e8(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  
  func_0x00079304();
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  puVar1 = uStack0000000000000038;
  if (-1 < in_stack_00000048._7_1_) {
    puVar1 = &uStack0000000000000038;
  }
  *unaff_x19 = &UNK_009b9460;
  *(undefined4 *)(unaff_x19 + 1) = unaff_w20;
  __ZNSt13runtime_errorC1EPKc(unaff_x19 + 2,puVar1);
  *unaff_x19 = &UNK_009b9438;
  if (in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000038);
    return;
  }
  return;
}

