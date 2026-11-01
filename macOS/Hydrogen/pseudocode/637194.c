
void FUN_00637194(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 unaff_x21;
  long unaff_x29;
  undefined1 auVar4 [16];
  long lStack00000000000000a0;
  ulong in_stack_000000b0;
  ulong in_stack_000000b8;
  long in_stack_000000c0;
  undefined1 uStack0000000000000108;
  undefined1 auStack_90 [24];
  undefined1 auStack_78 [24];
  undefined1 auStack_60 [24];
  undefined1 auStack_48 [24];
  
  lStack00000000000000a0 = param_1 + 0x10;
  if (in_stack_000000b8 <= in_stack_000000b0) {
    in_stack_000000b0 = in_stack_000000b8;
  }
  if (in_stack_000000c0 != 0) {
    if (in_stack_000000b0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000c0 + -8 + in_stack_000000b0 * 8) = 0;
        in_stack_000000b0 = in_stack_000000b0 - 1;
      } while (in_stack_000000b0 != 0);
    }
    func_0x00611644();
  }
  func_0x00653f88(&uStack0000000000000108);
  *(undefined8 *)(unaff_x29 + -0x50) = unaff_x21;
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    *(long *)(unaff_x29 + -0x40) = *(long *)(unaff_x29 + -0x48);
    __ZdlPv();
  }
  auVar4 = __Unwind_Resume();
  uVar2 = (**(code **)(*auVar4._0_8_ + 0x10))(auVar4._0_8_,param_4,&UNK_00a0c1f0);
  if ((uVar2 & 1) == 0) {
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(auStack_90,auVar4._8_8_);
    func_0x0003a638(auStack_78,auStack_90,": missing required parameter \'");
    func_0x0003a638(auStack_60,auStack_78,param_4);
    func_0x0003a638(auStack_48,auStack_60,"\'");
    func_0x0002703c(uVar3,auStack_48);
    ___cxa_throw(uVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x637300);
    (*pcVar1)();
  }
  return;
}

