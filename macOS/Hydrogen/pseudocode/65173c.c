
void FUN_0065173c(long param_1)

{
  long lVar1;
  ulong uVar2;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long in_stack_00000008;
  long in_stack_00000018;
  
  while( true ) {
    *(undefined8 *)(param_1 + -0x30) = unaff_x22;
    lVar1 = *(long *)(param_1 + -0x10);
    uVar2 = *(ulong *)(param_1 + -0x20);
    if (*(ulong *)(param_1 + -0x18) <= *(ulong *)(param_1 + -0x20)) {
      uVar2 = *(ulong *)(param_1 + -0x18);
    }
    if (lVar1 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    func_0x0064f6d0(unaff_x20);
    if (in_stack_00000018 == unaff_x21) break;
    unaff_x20 = in_stack_00000018 + -0xa0;
    param_1 = in_stack_00000018;
    in_stack_00000018 = unaff_x20;
  }
  if (in_stack_00000008 != 0) {
    __ZdlPv();
  }
  return;
}

