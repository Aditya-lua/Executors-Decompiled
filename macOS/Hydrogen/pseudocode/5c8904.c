
undefined * thunk_FUN_005c892c(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *puVar4;
  long lVar5;
  uint uVar6;
  undefined8 unaff_x19;
  undefined1 auVar7 [16];
  ulong in_stack_00000060;
  undefined8 in_stack_00000068;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  
  if (in_stack_00000090 != 0) {
    func_0x00187bd4(in_stack_00000098,in_stack_00000090,1);
    unaff_x19 = __Unwind_Resume();
    if ((in_stack_00000060 | 0x8000000000000000) != 0x8000000000000000) goto LAB_005c8974;
  }
  do {
    unaff_x19 = __Unwind_Resume(unaff_x19);
  } while (in_stack_00000060 == 0);
LAB_005c8974:
  func_0x00187bd4(in_stack_00000068,in_stack_00000060,1);
  auVar7 = __Unwind_Resume(unaff_x19);
  lVar1 = *auVar7._0_8_;
  if (lVar1 == 0) {
LAB_005c8a10:
    return &UNK_008b5850;
  }
  lVar2 = auVar7._0_8_[1];
  do {
    puVar4 = (undefined8 *)(lVar1 + 0x58);
    lVar5 = (ulong)*(ushort *)(lVar1 + 0xba) << 3;
    uVar3 = 0xffffffffffffffff;
    do {
      if (lVar5 == 0) {
        uVar3 = (ulong)*(ushort *)(lVar1 + 0xba);
        goto LAB_005c89ec;
      }
      uVar6 = (uint)(*auVar7._8_8_ != *(ulong *)puVar4[-10]);
      if (*auVar7._8_8_ < *(ulong *)puVar4[-10]) {
        uVar6 = 0xffffffff;
      }
      puVar4 = puVar4 + 1;
      lVar5 = lVar5 + -8;
      uVar3 = uVar3 + 1;
    } while (uVar6 == 1);
    if ((uVar6 & 0xff) == 0) {
      return (undefined *)*puVar4;
    }
LAB_005c89ec:
    if (lVar2 == 0) goto LAB_005c8a10;
    lVar1 = *(long *)(lVar1 + uVar3 * 8 + 0xc0);
    lVar2 = lVar2 + -1;
  } while( true );
}

