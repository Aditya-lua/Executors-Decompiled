
void FUN_0007ca7c(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined1 *unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined4 uStack0000000000000030;
  undefined2 uStack0000000000000034;
  undefined2 uStack0000000000000036;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined4 in_stack_00000080;
  undefined1 uStack0000000000000088;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000b0;
  long in_stack_000000e0;
  long in_stack_000000e8;
  char cStack0000000000000100;
  char cStack0000000000000101;
  
  func_0x0008087c();
  if (unaff_w21 != 0) {
    iVar2 = func_0x0007d25c();
    *(int *)(unaff_x20 + 0x20) = iVar2;
    if (iVar2 != 0xf) {
      func_0x000801a4(&uStack00000000000000a0);
      in_stack_00000068 = *(undefined8 *)(unaff_x20 + 0x50);
      uStack0000000000000060 = *(undefined8 *)(unaff_x20 + 0x48);
      in_stack_00000070 = *(undefined8 *)(unaff_x20 + 0x58);
      in_stack_00000040._7_1_ = '\x05';
      uStack0000000000000030 = 0x756c6176;
      uStack0000000000000034 = 0x65;
      func_0x000804dc(&uStack0000000000000048);
      func_0x00080294(&uStack0000000000000078,0x65,&uStack0000000000000060,&uStack0000000000000048,0
                     );
      cStack0000000000000100 = '\x01';
      if (cStack0000000000000101 != '\0') {
        puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
        *puVar3 = &UNK_009b9460;
        *(undefined4 *)(puVar3 + 1) = in_stack_00000080;
        __ZNSt13runtime_errorC1ERKS_(puVar3 + 2,&uStack0000000000000088);
        *puVar3 = &UNK_009b95c8;
        puVar3[4] = in_stack_00000098;
        ___cxa_throw(puVar3,&UNK_009b95a0,&DAT_0008084c);
        goto code_r0x0007ce8c;
      }
      uStack0000000000000078 = &UNK_009b9460;
      __ZNSt13runtime_errorD1Ev(&uStack0000000000000088);
      __ZNSt9exceptionD2Ev(&uStack0000000000000078);
      if (in_stack_00000058._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000048);
      }
      if (in_stack_00000040._7_1_ < '\0') {
        __ZdlPv(CONCAT26(uStack0000000000000036,
                         CONCAT24(uStack0000000000000034,uStack0000000000000030)));
      }
      if (in_stack_000000b0._7_1_ < '\0') {
        __ZdlPv(uStack00000000000000a0);
      }
    }
  }
  if (cStack0000000000000100 != '\0') {
    *unaff_x19 = 9;
    uStack0000000000000008 = *(undefined8 *)(unaff_x19 + 8);
    *(undefined8 *)(unaff_x19 + 8) = 0;
    func_0x00078220(&uStack0000000000000008);
  }
  if (in_stack_000000e0 != 0) {
    in_stack_000000e8 = in_stack_000000e0;
    __ZdlPv();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  ___stack_chk_fail();
  puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
  *puVar3 = &UNK_009b9460;
  *(undefined4 *)(puVar3 + 1) = in_stack_00000080;
  __ZNSt13runtime_errorC1ERKS_(puVar3 + 2,&uStack0000000000000088);
  *puVar3 = &UNK_009b95c8;
  puVar3[4] = in_stack_00000098;
  ___cxa_throw(puVar3,&UNK_009b95a0,&DAT_0008084c);
code_r0x0007ce8c:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7ce90);
  (*pcVar1)();
}

