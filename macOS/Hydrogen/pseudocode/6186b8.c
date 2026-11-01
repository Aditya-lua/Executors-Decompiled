
void FUN_006186b8(code *param_1)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  long lVar4;
  long lVar5;
  long lVar6;
  char in_stack_00000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  ulong in_stack_00000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  char in_stack_00000038;
  long lStack0000000000000040;
  long lStack0000000000000048;
  ulong in_stack_00000058;
  long lStack0000000000000060;
  long lStack0000000000000068;
  
  (*param_1)();
  plVar1 = &lStack0000000000000040;
  if (in_stack_00000038 != '\0') {
    plVar1 = &lStack0000000000000068;
  }
  lVar4 = *plVar1;
  plVar1 = &lStack0000000000000048;
  if (in_stack_00000038 != '\0') {
    plVar1 = &lStack0000000000000060;
  }
  lVar6 = *plVar1;
  lVar5 = *(long *)(unaff_x19 + 0x40);
  lVar2 = *(long *)(unaff_x19 + 0x48);
  if (lVar5 == lVar6) {
code_r0x00618734:
    *(long *)(unaff_x19 + 0x40) = lVar6;
    *(long *)(unaff_x19 + 0x48) = lVar2;
    *(undefined8 *)(unaff_x19 + 0x38) = 0xffffffffffffffff;
    if ((lVar4 != 0) && (lVar2 != 0)) {
      _memcpy(lVar2,lVar4,lVar6);
    }
  }
  else {
    if (lVar2 != 0) {
      if (lVar5 != 0) {
        do {
          *(undefined1 *)(lVar2 + -1 + lVar5) = 0;
          lVar5 = lVar5 + -1;
        } while (lVar5 != 0);
      }
      func_0x00611644();
    }
    if (lVar6 != 0) {
      lVar2 = func_0x006115d0(lVar6);
      goto code_r0x00618734;
    }
    *(long *)(unaff_x19 + 0x40) = 0;
    *(undefined8 *)(unaff_x19 + 0x48) = 0;
  }
  lVar4 = *(long *)(unaff_x19 + 0x60);
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
  if (lVar4 != lVar6) {
    if (lVar2 != 0) {
      if (lVar4 != 0) {
        do {
          *(undefined1 *)(lVar2 + -1 + lVar4) = 0;
          lVar4 = lVar4 + -1;
        } while (lVar4 != 0);
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
  uVar3 = in_stack_00000020;
  if ((ulong)lStack0000000000000028 <= in_stack_00000020) {
    uVar3 = lStack0000000000000028;
  }
  if (lStack0000000000000030 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined1 *)(lStack0000000000000030 + -1 + uVar3) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  uVar3 = in_stack_00000058;
  if ((ulong)lStack0000000000000060 <= in_stack_00000058) {
    uVar3 = lStack0000000000000060;
  }
  if (lStack0000000000000068 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined1 *)(lStack0000000000000068 + -1 + uVar3) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  return;
}

