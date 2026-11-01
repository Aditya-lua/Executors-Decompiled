
/* WARNING: Removing unreachable block (ram,0x00082c90) */
/* WARNING: Removing unreachable block (ram,0x00082d20) */

void FUN_00082c60(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  
  __ZNSt3__19to_stringEi();
  func_0x00079404(&uStack0000000000000020,"[json.exception.",&uStack0000000000000008,
                  unaff_x29 + -0x21,unaff_x29 + -0x40,"] ");
  *(undefined1 *)(unaff_x29 + -0x29) = 0;
  *(undefined1 *)(unaff_x29 + -0x40) = 0;
  func_0x00079304(&uStack0000000000000038,&uStack0000000000000020,unaff_x29 + -0x40);
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000020);
  }
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  puVar1 = uStack0000000000000038;
  if (-1 < in_stack_00000048._7_1_) {
    puVar1 = &uStack0000000000000038;
  }
  *unaff_x19 = &UNK_009b9460;
  *(undefined4 *)(unaff_x19 + 1) = unaff_w20;
  __ZNSt13runtime_errorC1EPKc(unaff_x19 + 2,puVar1);
  *unaff_x19 = &UNK_009b9548;
  if (in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000038);
    return;
  }
  return;
}

