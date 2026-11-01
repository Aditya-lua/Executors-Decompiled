
/* WARNING: Removing unreachable block (ram,0x004c68cc) */
/* WARNING: Removing unreachable block (ram,0x004c68d4) */

void FUN_004c68a8(void)

{
  code *pcVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  undefined1 auVar7 [16];
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  long in_stack_000001a0;
  undefined8 in_stack_000001a8;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  ulong uStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  
  if (in_stack_000001a0 != 0) {
    func_0x00187bd4(in_stack_000001a8,in_stack_000001a0 << 2,4);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  auVar7 = __Unwind_Resume();
  uVar5 = auVar7._8_8_;
  plVar2 = auVar7._0_8_;
  lStack_a0 = *(long *)(uVar5 + 8);
  lStack_98 = lStack_a0 + *(long *)(uVar5 + 0x10) * 0x20;
  lStack_90 = 0;
  uStack_88 = uVar5;
  func_0x004cf834(&lStack_b8,&lStack_a0,&UNK_009e5910);
  lStack_a0 = 0;
  lStack_98 = 8;
  lStack_90 = 0;
  uVar3 = func_0x004d5c78(uVar5,&lStack_a0);
  if (lStack_a8 != 0) {
    lVar6 = 0;
    do {
      uStack_88 = uStack_88 & 0xffffffffffffff00;
      lStack_a0 = 0;
      lStack_98 = 8;
      lStack_90 = 0;
      func_0x004d5990(uVar5,*(undefined4 *)(lStack_b0 + lVar6),uVar3,&lStack_a0);
      lVar6 = lVar6 + 4;
    } while (lStack_a8 * 4 != lVar6);
  }
  if (lStack_b8 != 0) {
    func_0x00187bd4(lStack_b0,lStack_b8 << 2,4);
  }
  func_0x004d3ae4(&lStack_a0,uVar5,uVar3);
  func_0x004d5560(&lStack_68,uVar5,uVar3);
  if (lStack_68 == -0x8000000000000000) {
    func_0x004bcba8(&lStack_68);
    func_0x007a247c(&UNK_008a253a,0x38,&UNK_009e67b0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c6a84);
    (*pcVar1)();
  }
  lVar6 = lStack_58 + 1;
  lVar4 = lStack_60;
  while (lVar6 = lVar6 + -1, lVar6 != 0) {
    func_0x004caae8(lVar4);
    lVar4 = lVar4 + 0x108;
  }
  if (lStack_68 != 0) {
    func_0x00187bd4(lStack_60,lStack_68 * 0x108,8);
  }
  plVar2[1] = lStack_98;
  *plVar2 = lStack_a0;
  plVar2[3] = uStack_88;
  plVar2[2] = lStack_90;
  plVar2[5] = lStack_78;
  plVar2[4] = lStack_80;
  plVar2[6] = lStack_70;
  return;
}

