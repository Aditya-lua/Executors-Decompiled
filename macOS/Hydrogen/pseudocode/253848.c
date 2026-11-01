
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00253848(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long *plVar4;
  code *pcVar5;
  undefined1 uVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long lVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000098;
  undefined8 uStack00000000000000b0;
  undefined8 uStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  undefined8 uStack00000000000000d8;
  undefined8 uStack0000000000000128;
  undefined8 uStack0000000000000138;
  undefined8 uStack0000000000000140;
  undefined8 in_stack_00000388;
  undefined7 in_stack_00000459;
  long in_stack_00000460;
  long in_stack_00000468;
  uint6 in_stack_000004aa;
  undefined1 auStack_7ffffffe [2147483646];
  
  uStack0000000000000098 = 0;
  uStack00000000000000b0 = 0;
  uStack00000000000000c0 = 0;
  uStack00000000000000c8 = 0;
  uStack00000000000000d0 = 0;
  uStack00000000000000d8 = 0;
  uStack0000000000000128 = 0;
  uStack0000000000000138 = 0;
  uStack0000000000000140 = 0;
  *(undefined4 *)(unaff_x22 + 0x339) = 0;
  uVar2 = _UNK_00826e90;
  if (((*(uint *)(param_1 + 0x10) & 1) == 0) ||
     ((undefined *)(*(long *)(unaff_x21 + 0x18) + -0x20) <= &UNK_00003fe5)) {
    func_0x00227128(*(long *)(unaff_x21 + 0x68) + 0x10);
    plVar4 = uStack0000000000000010;
    uVar6 = (**(code **)(uStack0000000000000010[0x15] + 0x20))
                      (uStack0000000000000010[0x14] +
                       (*(long *)(uStack0000000000000010[0x15] + 0x10) - 1U & 0xfffffffffffffff0) +
                       0x10);
    lVar1 = _UNK_00826e68;
    lVar8 = _UNK_00826e60;
    lVar12 = unaff_x19[1];
    lVar10 = *unaff_x19;
    lVar9 = unaff_x19[2];
    plVar7 = (long *)func_0x00187bd0(0x90,8);
    if (plVar7 == (long *)0x0) {
      func_0x007a1f18(8,0x90);
    }
    else {
      plVar7[0xd] = 0;
      plVar7[0xc] = 0;
      plVar7[0xf] = 0;
      plVar7[0xe] = 0;
      plVar7[0x11] = (ulong)in_stack_000004aa << 0x10;
      plVar7[0x10] = 0;
      plVar7[5] = 1;
      plVar7[4] = lVar1;
      plVar7[7] = CONCAT71(in_stack_00000459,uVar6);
      plVar7[6] = 0;
      plVar7[9] = in_stack_00000468;
      plVar7[8] = in_stack_00000460;
      plVar7[0xb] = 0;
      plVar7[10] = (long)plVar4;
      plVar7[1] = lVar12;
      *plVar7 = lVar10;
      plVar7[3] = lVar8;
      plVar7[2] = lVar9;
      uVar3 = _UNK_007fc118;
      uVar2 = _UNK_007fc110;
      _memcpy(auStack_7ffffffe + 0x8000041e,&uStack0000000000000018,0x340);
      lVar8 = func_0x00187bd0(0x280,8);
      if (lVar8 != 0) {
        unaff_x20[0x7c] = 0;
        unaff_x20[0x7b] = 0;
        unaff_x20[0x83] = in_stack_00000388;
        uVar11 = *(undefined8 *)(unaff_x22 + 0x340);
        uVar14 = *(undefined8 *)(unaff_x22 + 0x358);
        uVar13 = *(undefined8 *)(unaff_x22 + 0x350);
        unaff_x20[0x7e] = *(undefined8 *)(unaff_x22 + 0x348);
        unaff_x20[0x7d] = uVar11;
        unaff_x20[0x80] = uVar14;
        unaff_x20[0x7f] = uVar13;
        uVar11 = *(undefined8 *)(unaff_x22 + 0x360);
        unaff_x20[0x82] = *(undefined8 *)(unaff_x22 + 0x368);
        unaff_x20[0x81] = uVar11;
        _memcpy();
        unaff_x20[0x79] = 0x10;
        unaff_x20[0x7a] = lVar8;
        unaff_x20[0x68] = 2;
        unaff_x20[0x70] = 0;
        unaff_x20[0x71] = 1;
        unaff_x20[0x73] = uVar3;
        unaff_x20[0x72] = uVar2;
        unaff_x20[0x76] = 0x8000000000000001;
        *(undefined1 *)(unaff_x20 + 0x84) = 0;
        return;
      }
      func_0x007a1f00(8,0x280,&UNK_009c29a8);
    }
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x253b44);
    (*pcVar5)();
  }
  unaff_x20[1] = _UNK_00826e98;
  *unaff_x20 = uVar2;
  func_0x00245ec4(&uStack0000000000000018);
  lVar1 = unaff_x19[1];
  lVar8 = unaff_x19[2] + 1;
  lVar9 = lVar1;
  while (lVar8 = lVar8 + -1, lVar8 != 0) {
    func_0x0016abd8(lVar9);
    lVar9 = lVar9 + 0x28;
  }
  if (*unaff_x19 != 0) {
    func_0x00187bd4(lVar1,*unaff_x19 * 0x28,8);
  }
  lVar8 = *uStack0000000000000010;
  *uStack0000000000000010 = lVar8 + -1;
  LORelease();
  if (lVar8 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4(&uStack0000000000000010);
  }
  return;
}

