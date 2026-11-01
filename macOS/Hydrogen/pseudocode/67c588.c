
undefined8 FUN_0067c588(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  undefined4 uStack0000000000000008;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000088;
  
  func_0x00614fa8(&uStack0000000000000050);
  func_0x00614fa8(&uStack0000000000000050,(long)&uStack0000000000000000 + 4,2,0,0xffffffff);
  func_0x00614fa8(&uStack0000000000000050,&uStack0000000000000008,2,0,0xffffffff);
  func_0x00612a40(&uStack0000000000000050);
  uVar2 = __Znwm(0xa0);
  func_0x006551a8(uVar2,in_stack_00000028._4_4_,(undefined4)uStack0000000000000000,
                  uStack0000000000000000._4_4_,uStack0000000000000008,0);
  func_0x00613f64(&uStack0000000000000050);
  func_0x00612a40(&uStack0000000000000088);
  func_0x00612a40(unaff_x29 + -0x70);
  if (in_stack_00000038 != 0) {
    __ZdlPv();
  }
  func_0x00613f64(&uStack0000000000000088);
  func_0x00613f64(unaff_x29 + -0x70);
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
    ___stack_chk_fail();
    puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar3 + 1) = 1;
    puVar3[2] = 0x6f63656420524542;
    puVar3[3] = 0x726f727265206564;
    *(undefined1 *)(puVar3 + 4) = 0;
    *(undefined1 *)((long)puVar3 + 0x27) = 0x10;
    *puVar3 = &UNK_009f60b8;
    ___cxa_throw(puVar3,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x67c738);
    (*pcVar1)();
  }
  return uVar2;
}

