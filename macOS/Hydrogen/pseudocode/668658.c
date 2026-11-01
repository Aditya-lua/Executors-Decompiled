
void FUN_00668658(ulong param_1,long param_2)

{
  long lVar1;
  undefined1 in_CY;
  ulong in_x9;
  long lVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  long *plVar3;
  long unaff_x21;
  undefined8 in_stack_00000060;
  long *in_stack_00000078;
  long *in_stack_00000080;
  long *in_stack_00000090;
  long *in_stack_00000098;
  long *in_stack_000000a8;
  long *in_stack_000000b0;
  undefined8 uStack00000000000000c0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  undefined1 uStack00000000000000f0;
  
  while( true ) {
    if ((bool)in_CY) {
      param_1 = in_x9;
    }
    if (param_2 != 0) {
      if (param_1 != 0) {
        do {
          *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
          param_1 = param_1 - 1;
        } while (param_1 != 0);
      }
      func_0x00611644();
    }
    lVar2 = unaff_x19 + -0xa0;
    func_0x0064f6d0(lVar2);
    if (lVar2 == unaff_x21) break;
    *(undefined8 *)(unaff_x19 + -0xd0) = unaff_x20;
    in_x9 = *(ulong *)(unaff_x19 + -0xb8);
    param_2 = *(long *)(unaff_x19 + -0xb0);
    param_1 = *(ulong *)(unaff_x19 + -0xc0);
    in_CY = in_x9 <= param_1;
    unaff_x19 = lVar2;
  }
  __ZdlPv(in_stack_00000060);
  if (in_stack_00000078 != (long *)0x0) {
    if (in_stack_00000080 != in_stack_00000078) {
      do {
        plVar3 = in_stack_00000080 + -3;
        if (*plVar3 != 0) {
          in_stack_00000080[-2] = *plVar3;
          __ZdlPv();
        }
        in_stack_00000080 = plVar3;
      } while (plVar3 != in_stack_00000078);
    }
    __ZdlPv(in_stack_00000078);
  }
  if (in_stack_00000090 != (long *)0x0) {
    while (in_stack_00000098 != in_stack_00000090) {
      in_stack_00000098 = in_stack_00000098 + -3;
      if (*in_stack_00000098 != 0) {
        __ZdlPv();
      }
    }
    __ZdlPv(in_stack_00000090);
  }
  if (in_stack_000000a8 != (long *)0x0) {
    if (in_stack_000000b0 != in_stack_000000a8) {
      do {
        plVar3 = in_stack_000000b0 + -3;
        if (*plVar3 != 0) {
          in_stack_000000b0[-2] = *plVar3;
          __ZdlPv();
        }
        in_stack_000000b0 = plVar3;
      } while (plVar3 != in_stack_000000a8);
    }
    __ZdlPv(in_stack_000000a8);
  }
  if (uStack00000000000000c0 != 0) {
    func_0x0064b344(&uStack00000000000000c0);
    __ZdlPv(uStack00000000000000c0);
  }
  lVar1 = in_stack_000000d8;
  lVar2 = in_stack_000000e0;
  if (in_stack_000000d8 != 0) {
    for (; lVar2 != lVar1; lVar2 = func_0x00669d7c(lVar2 + -0x90)) {
    }
    __ZdlPv(in_stack_000000d8);
  }
  func_0x0066a1ec(&uStack00000000000000f0);
  return;
}

