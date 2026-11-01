
long FUN_004ee278(void)

{
  undefined8 uVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 unaff_x24;
  undefined8 uVar6;
  undefined8 in_stack_000000c8;
  long in_stack_000000e8;
  long in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined1 uStack0000000000000120;
  ulong in_stack_000001d0;
  undefined8 in_stack_000001d8;
  long in_stack_000001e0;
  long in_stack_000002d8;
  long in_stack_000002e0;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00538438(&uStack0000000000000120);
  lVar4 = in_stack_000001e0;
  uVar1 = in_stack_000001d8;
  if (in_stack_000001e0 < 0) {
    uVar6 = 0;
LAB_004ee648:
    func_0x007a1f00(uVar6,lVar4,&UNK_009e80a0);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4ee660);
    (*pcVar2)();
  }
  if (in_stack_000001e0 == 0) {
    lVar3 = 1;
    in_stack_000000c8 = unaff_x24;
  }
  else {
    uVar6 = 1;
    lVar3 = func_0x00187bd0(in_stack_000001e0,1);
    if (lVar3 == 0) goto LAB_004ee648;
  }
  _memcpy(lVar3,uVar1,lVar4);
  func_0x00525e7c(auStack_7ffffffe + 0x8000024e);
  func_0x00525f7c(auStack_7ffffffe + 0x8000034e,auStack_7ffffffe + 0x8000024e,8,0);
  lVar4 = func_0x0051d650();
  if ((in_stack_000001d0 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(uVar1,in_stack_000001d0,1);
  }
  if ((in_stack_00000100 != -0x8000000000000000) && (in_stack_00000100 != 0)) {
    func_0x00187bd4(in_stack_00000108,in_stack_00000100,1);
  }
  if (lVar4 == 0) {
    lVar4 = func_0x004f15d8(in_stack_000000e8,in_stack_000000c8);
    if ((lVar4 == 0) && (lVar4 = func_0x004f2ac4(in_stack_000000e8,in_stack_000000c8), lVar4 == 0))
    {
      func_0x005053c0(auStack_7ffffffe + 0x800002ce,*(undefined8 *)(in_stack_000000e8 + 0x10));
      lVar4 = func_0x00521aa8(auStack_7ffffffe + 0x800002ce,in_stack_000000c8);
      if (in_stack_000002e0 != 0) {
        puVar5 = (undefined8 *)(in_stack_000002d8 + 8);
        do {
          if (puVar5[-1] != 0) {
            func_0x00187bd4(*puVar5,puVar5[-1] << 3,8);
          }
          puVar5 = puVar5 + 5;
          in_stack_000002e0 = in_stack_000002e0 + -1;
        } while (in_stack_000002e0 != 0);
      }
      func_0x00187bd4(in_stack_000002d8,0,8);
    }
  }
  else if ((((*(byte *)(*(long *)(in_stack_000000e8 + 0x10) + 700) & 1) != 0) ||
           ((*(byte *)(*(long *)(in_stack_000000e8 + 0x10) + 0x2c0) & 1) != 0)) &&
          (lVar3 = func_0x004f2ac4(in_stack_000000e8,in_stack_000000c8), lVar3 != 0)) {
    func_0x004e9f14();
  }
  return lVar4;
}

