
void FUN_00664730(void)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 *puVar3;
  long *unaff_x20;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  
  uVar2 = (**(code **)(*unaff_x20 + 0x88))();
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
  if (in_stack_00000010 <= in_stack_00000008) {
    in_stack_00000008 = in_stack_00000010;
  }
  if (in_stack_00000018 != 0) {
    if (in_stack_00000008 != 0) {
      do {
        *(undefined1 *)(in_stack_00000018 + -1 + in_stack_00000008) = 0;
        in_stack_00000008 = in_stack_00000008 - 1;
      } while (in_stack_00000008 != 0);
    }
    func_0x00611644();
  }
  return;
}

