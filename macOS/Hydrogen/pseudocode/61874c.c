
void FUN_0061874c(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x19;
  long lVar5;
  long lVar6;
  char in_stack_00000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  ulong in_stack_00000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  
  _memcpy();
  lVar3 = *(long *)(unaff_x19 + 0x60);
  *(undefined8 *)(unaff_x19 + 0x38) = 0xffffffffffffffff;
  plVar1 = &lStack0000000000000008;
  if (in_stack_00000000 != '\0') {
    plVar1 = &lStack0000000000000030;
  }
  lVar5 = *plVar1;
  plVar1 = &lStack0000000000000010;
  if (in_stack_00000000 != '\0') {
    plVar1 = &lStack0000000000000028;
  }
  lVar6 = *plVar1;
  lVar2 = *(long *)(unaff_x19 + 0x68);
  if (lVar3 != lVar6) {
    if (lVar2 != 0) {
      if (lVar3 != 0) {
        do {
          *(undefined1 *)(lVar2 + -1 + lVar3) = 0;
          lVar3 = lVar3 + -1;
        } while (lVar3 != 0);
      }
      func_0x00611644();
    }
    if (lVar6 == 0) {
      *(long *)(unaff_x19 + 0x60) = 0;
      *(undefined8 *)(unaff_x19 + 0x68) = 0;
      goto code_r0x006187f0;
    }
    lVar2 = func_0x006115d0(lVar6);
  }
  *(long *)(unaff_x19 + 0x60) = lVar6;
  *(long *)(unaff_x19 + 0x68) = lVar2;
  *(undefined8 *)(unaff_x19 + 0x58) = 0xffffffffffffffff;
  if ((lVar5 != 0) && (lVar2 != 0)) {
    _memcpy(lVar2,lVar5,lVar6);
  }
code_r0x006187f0:
  *(undefined8 *)(unaff_x19 + 0x58) = 0xffffffffffffffff;
  *(undefined8 *)(unaff_x19 + 0x78) = 0;
  uVar4 = in_stack_00000020;
  if ((ulong)lStack0000000000000028 <= in_stack_00000020) {
    uVar4 = lStack0000000000000028;
  }
  if (lStack0000000000000030 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined1 *)(lStack0000000000000030 + -1 + uVar4) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  uVar4 = in_stack_00000058;
  if (in_stack_00000060 <= in_stack_00000058) {
    uVar4 = in_stack_00000060;
  }
  if (in_stack_00000068 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined1 *)(in_stack_00000068 + -1 + uVar4) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  return;
}

