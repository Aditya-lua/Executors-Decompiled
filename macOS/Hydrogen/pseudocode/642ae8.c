
void FUN_00642ae8(long param_1,long param_2)

{
  code *pcVar1;
  bool in_CY;
  undefined8 *puVar2;
  long in_x9;
  long *unaff_x19;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  undefined1 uStack00000000000000d0;
  
  if (in_CY) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  func_0x00612ba4(&uStack00000000000000d0);
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined1 *)(in_stack_00000020 + -1 + in_stack_00000010) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  func_0x00612a40(unaff_x29 + -0x70);
  (**(code **)(*unaff_x19 + 0x28))();
  if (in_stack_00000040 <= in_stack_00000038) {
    in_stack_00000038 = in_stack_00000040;
  }
  if (in_stack_00000048 != 0) {
    if (in_stack_00000038 != 0) {
      do {
        *(undefined8 *)(in_stack_00000048 + -8 + in_stack_00000038 * 8) = 0;
        in_stack_00000038 = in_stack_00000038 - 1;
      } while (in_stack_00000038 != 0);
    }
    func_0x00611644();
  }
  func_0x00612ba4(unaff_x29 + -0xa8);
  func_0x00613f64(unaff_x29 + -0x70);
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
    ___stack_chk_fail();
    puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar2 + 1) = 1;
    puVar2[2] = 0x6f63656420524542;
    puVar2[3] = 0x726f727265206564;
    *(undefined1 *)(puVar2 + 4) = 0;
    *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
    *puVar2 = &UNK_009f60b8;
    ___cxa_throw(puVar2,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x642d00);
    (*pcVar1)();
  }
  return;
}

