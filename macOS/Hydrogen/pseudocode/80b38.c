
undefined8 FUN_00080b38(void)

{
  uint uVar1;
  code *pcVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  long unaff_x19;
  long unaff_x20;
  long unaff_x24;
  long unaff_x29;
  char cStack0000000000000017;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined4 in_stack_00000058;
  undefined1 uStack0000000000000060;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000088;
  
  uVar3 = func_0x0007d25c();
  *(undefined4 *)(unaff_x20 + 0x20) = uVar3;
  uVar1 = *(int *)(unaff_x20 + 0x20) - 1;
  if (uVar1 < 0xf) {
                    /* WARNING: Could not recover jumptable at 0x000808f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar4 = (*(code *)(&UNK_000808f4 + (ulong)*(ushort *)(unaff_x24 + (ulong)uVar1 * 2) * 4))();
    return uVar4;
  }
  func_0x000801a4(&uStack0000000000000078);
  in_stack_00000038 = *(undefined8 *)(unaff_x20 + 0x50);
  uStack0000000000000030 = *(undefined8 *)(unaff_x20 + 0x48);
  in_stack_00000040 = *(undefined8 *)(unaff_x20 + 0x58);
  cStack0000000000000017 = '\x05';
  func_0x000804dc(&uStack0000000000000018);
  func_0x00080294(&uStack0000000000000050,0x65,&uStack0000000000000030,&uStack0000000000000018,0);
  *(undefined1 *)(unaff_x19 + 0x28) = 1;
  if (*(char *)(unaff_x19 + 0x29) != '\0') {
    puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
    *puVar5 = &UNK_009b9460;
    *(undefined4 *)(puVar5 + 1) = in_stack_00000058;
    __ZNSt13runtime_errorC1ERKS_(puVar5 + 2,&uStack0000000000000060);
    *puVar5 = &UNK_009b95c8;
    puVar5[4] = in_stack_00000070;
    ___cxa_throw(puVar5,&UNK_009b95a0,&DAT_0008084c);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x81478);
    (*pcVar2)();
  }
  uStack0000000000000050 = &UNK_009b9460;
  __ZNSt13runtime_errorD1Ev(&uStack0000000000000060);
  __ZNSt9exceptionD2Ev(&uStack0000000000000050);
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000018);
  }
  if (cStack0000000000000017 < '\0') {
    __ZdlPv(0x65756c6176);
  }
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000078);
  }
  if (*(long *)(unaff_x29 + -0x70) != 0) {
    __ZdlPv();
  }
  return 0;
}

