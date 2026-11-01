
void FUN_00664660(void)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *extraout_x8;
  long *unaff_x21;
  undefined1 auVar4 [16];
  long in_stack_00000038;
  undefined1 auStack_40 [8];
  ulong uStack_38;
  ulong uStack_30;
  long lStack_28;
  
  func_0x005edf2c();
  (**(code **)(*unaff_x21 + 0x98))();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000038) {
    return;
  }
  ___stack_chk_fail();
  auVar4 = __Unwind_Resume();
  uStack_30 = 0;
  lStack_28 = 0;
  uStack_38 = 0xffffffffffffffff;
  func_0x00611c60(auVar4._8_8_,auStack_40);
  *extraout_x8 = &UNK_00a09a70;
  func_0x00675af8(extraout_x8 + 1);
  func_0x00675af8(extraout_x8 + 5);
  *(undefined1 *)(extraout_x8 + 9) = 1;
  uVar2 = (**(code **)(*auVar4._0_8_ + 0x88))(auVar4._0_8_,extraout_x8,lStack_28,uStack_30);
  if ((uVar2 & 1) == 0) {
    puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar3 + 1) = 1;
    puVar3[2] = 0x6f63656420524542;
    puVar3[3] = 0x726f727265206564;
    *(undefined1 *)(puVar3 + 4) = 0;
    *(undefined1 *)((long)puVar3 + 0x27) = 0x10;
    *puVar3 = &UNK_009f60b8;
    ___cxa_throw(puVar3,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6647ec);
    (*pcVar1)();
  }
  uVar2 = uStack_38;
  if (uStack_30 <= uStack_38) {
    uVar2 = uStack_30;
  }
  if (lStack_28 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lStack_28 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

