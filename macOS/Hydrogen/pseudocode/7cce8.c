
void FUN_0007cce8(undefined8 param_1)

{
  code *pcVar1;
  undefined8 *puVar2;
  long unaff_x29;
  undefined8 uStack0000000000000028;
  undefined4 in_stack_00000080;
  undefined1 uStack0000000000000088;
  undefined8 in_stack_00000098;
  undefined1 uStack00000000000000d8;
  
  uStack0000000000000028 = param_1;
  func_0x00078220();
  func_0x00084f3c(&uStack00000000000000d8);
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
    ___stack_chk_fail();
    puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
    *puVar2 = &UNK_009b9460;
    *(undefined4 *)(puVar2 + 1) = in_stack_00000080;
    __ZNSt13runtime_errorC1ERKS_(puVar2 + 2,&uStack0000000000000088);
    *puVar2 = &UNK_009b95c8;
    puVar2[4] = in_stack_00000098;
    ___cxa_throw(puVar2,&UNK_009b95a0,&DAT_0008084c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x7ce90);
    (*pcVar1)();
  }
  return;
}

