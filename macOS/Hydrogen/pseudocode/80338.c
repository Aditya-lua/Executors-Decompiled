
/* WARNING: Removing unreachable block (ram,0x000803ec) */

void FUN_00080338(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  undefined8 *unaff_x21;
  undefined8 uVar2;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000060;
  
  func_0x00084a8c(&uStack0000000000000050,&uStack0000000000000038,"parse error",unaff_x29 + -0x38,
                  ": ",&uStack0000000000000008);
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  if (in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000038);
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(in_stack_00000020);
  }
  uVar2 = *unaff_x21;
  puVar1 = uStack0000000000000050;
  if (-1 < in_stack_00000060._7_1_) {
    puVar1 = &uStack0000000000000050;
  }
  *unaff_x19 = &UNK_009b9460;
  *(undefined4 *)(unaff_x19 + 1) = unaff_w20;
  __ZNSt13runtime_errorC1EPKc(unaff_x19 + 2,puVar1);
  *unaff_x19 = &UNK_009b95c8;
  unaff_x19[4] = uVar2;
  if (in_stack_00000060._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000050);
    return;
  }
  return;
}

