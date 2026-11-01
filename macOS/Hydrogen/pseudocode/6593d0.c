
undefined8 FUN_006593d0(void)

{
  long *plVar1;
  long *plVar2;
  int iVar3;
  undefined8 uVar4;
  int in_w8;
  ulong uVar5;
  long in_x9;
  long *in_x10;
  long *in_x11;
  long lVar6;
  long *unaff_x26;
  long lVar7;
  long lStack0000000000000018;
  long in_stack_00000020;
  long lStack0000000000000040;
  char in_stack_00000048;
  long lStack0000000000000050;
  long lStack0000000000000058;
  ulong in_stack_00000068;
  long lStack0000000000000070;
  long lStack0000000000000078;
  
  plVar1 = (long *)(in_x9 + 0x10);
  if (in_w8 != 0) {
    plVar1 = (long *)(in_x9 + 0x28);
    in_x11 = in_x10;
  }
  lVar6 = *plVar1;
  if (lVar6 == 0) {
    lStack0000000000000040 = 0;
  }
  else {
    lVar7 = *in_x11;
    lStack0000000000000040 = func_0x006115d0(lVar6);
    if (lVar7 != 0 && lStack0000000000000040 != 0) {
      _memcpy(lStack0000000000000040,lVar7,lVar6);
    }
  }
  iVar3 = (**(code **)(*unaff_x26 + 0x10))();
  if (iVar3 == 0) {
    lStack0000000000000018 = 0;
  }
  else {
    plVar1 = &lStack0000000000000058;
    plVar2 = &lStack0000000000000050;
    if (in_stack_00000048 != '\0') {
      plVar1 = &lStack0000000000000070;
      plVar2 = &lStack0000000000000078;
    }
    lStack0000000000000018 = *plVar1;
    if (lStack0000000000000018 == 0) {
      in_stack_00000020 = 0;
    }
    else {
      lVar7 = *plVar2;
      in_stack_00000020 = func_0x006115d0(lStack0000000000000018);
      if ((lVar7 != 0) && (in_stack_00000020 != 0)) {
        _memcpy(in_stack_00000020,lVar7,lStack0000000000000018);
      }
    }
  }
  uVar4 = func_0x00646a30();
  if (in_stack_00000020 != 0) {
    if (lStack0000000000000018 != 0) {
      do {
        *(undefined1 *)(in_stack_00000020 + -1 + lStack0000000000000018) = 0;
        lStack0000000000000018 = lStack0000000000000018 + -1;
      } while (lStack0000000000000018 != 0);
    }
    func_0x00611644();
  }
  if (lStack0000000000000040 != 0) {
    if (lVar6 != 0) {
      do {
        *(undefined1 *)(lStack0000000000000040 + -1 + lVar6) = 0;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    func_0x00611644();
  }
  uVar5 = in_stack_00000068;
  if ((ulong)lStack0000000000000070 <= in_stack_00000068) {
    uVar5 = lStack0000000000000070;
  }
  if (lStack0000000000000078 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined1 *)(lStack0000000000000078 + -1 + uVar5) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  return uVar4;
}

