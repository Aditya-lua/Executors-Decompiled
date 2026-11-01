
void FUN_00618778(long param_1)

{
  long *plVar1;
  long lVar2;
  int in_w9;
  long in_x10;
  long *in_x11;
  long unaff_x19;
  long lVar3;
  long lVar4;
  undefined8 unaff_x22;
  undefined8 *unaff_x23;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  
  plVar1 = (long *)(in_x10 + 8);
  if (in_w9 != 0) {
    plVar1 = in_x11;
  }
  lVar3 = *plVar1;
  plVar1 = (long *)(in_x10 + 0x10);
  if (in_w9 != 0) {
    plVar1 = (long *)(in_x10 + 0x28);
  }
  lVar4 = *plVar1;
  lVar2 = unaff_x23[1];
  if (param_1 != lVar4) {
    if (lVar2 != 0) {
      if (param_1 != 0) {
        do {
          *(undefined1 *)(lVar2 + -1 + param_1) = 0;
          param_1 = param_1 + -1;
        } while (param_1 != 0);
      }
      func_0x00611644();
    }
    if (lVar4 == 0) {
      *unaff_x23 = 0;
      unaff_x23[1] = 0;
      goto LAB_006187f0;
    }
    lVar2 = func_0x006115d0(lVar4);
  }
  *(long *)(unaff_x19 + 0x60) = lVar4;
  *(long *)(unaff_x19 + 0x68) = lVar2;
  *(undefined8 *)(unaff_x19 + 0x58) = unaff_x22;
  if ((lVar3 != 0) && (lVar2 != 0)) {
    _memcpy(lVar2,lVar3,lVar4);
  }
LAB_006187f0:
  *(undefined8 *)(unaff_x19 + 0x58) = 0xffffffffffffffff;
  *(undefined8 *)(unaff_x19 + 0x78) = 0;
  if (in_stack_00000028 <= in_stack_00000020) {
    in_stack_00000020 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (in_stack_00000020 != 0) {
      do {
        *(undefined1 *)(in_stack_00000030 + -1 + in_stack_00000020) = 0;
        in_stack_00000020 = in_stack_00000020 - 1;
      } while (in_stack_00000020 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000060 <= in_stack_00000058) {
    in_stack_00000058 = in_stack_00000060;
  }
  if (in_stack_00000068 != 0) {
    if (in_stack_00000058 != 0) {
      do {
        *(undefined1 *)(in_stack_00000068 + -1 + in_stack_00000058) = 0;
        in_stack_00000058 = in_stack_00000058 - 1;
      } while (in_stack_00000058 != 0);
    }
    func_0x00611644();
  }
  return;
}

