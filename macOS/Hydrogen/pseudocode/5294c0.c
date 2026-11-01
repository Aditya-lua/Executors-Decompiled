
long FUN_005294c0(long param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  undefined1 auVar10 [16];
  long in_stack_00000018;
  undefined1 uStack0000000000000078;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined1 uStack00000000000000c0;
  
  lVar4 = 8;
  func_0x00187bd4(param_2,param_1 << 4);
  func_0x0016b01c(&uStack00000000000000c0);
  if (in_stack_000000a8 != 0) {
    lVar4 = 8;
    func_0x00187bd4(in_stack_000000b0,in_stack_000000a8 << 4);
  }
  if (in_stack_00000090 != 0) {
    lVar4 = 8;
    func_0x00187bd4(in_stack_00000098,in_stack_00000090 << 4);
  }
  if (in_stack_00000018 == 0) {
    func_0x004ea740(&uStack0000000000000078);
  }
  auVar10 = __Unwind_Resume();
  plVar3 = auVar10._0_8_;
  lVar7 = plVar3[1];
  lVar1 = plVar3[2];
  if (lVar1 != 0) {
    lVar6 = 0;
    lVar8 = lVar1 * 0x28;
    plVar9 = (long *)(lVar7 + 0x20);
    do {
      if ((*plVar9 == lVar4) && (iVar2 = _memcmp(plVar9[-1],auVar10._8_8_,lVar4), iVar2 == 0)) {
        return lVar6;
      }
      lVar6 = lVar6 + 1;
      lVar8 = lVar8 + -0x28;
      plVar9 = plVar9 + 5;
    } while (lVar8 != 0);
  }
  if (lVar1 == *plVar3) {
    func_0x0050c744(plVar3,&UNK_009ea960);
    lVar7 = plVar3[1];
  }
  puVar5 = (undefined8 *)(lVar7 + lVar1 * 0x28);
  *puVar5 = 0;
  puVar5[1] = 8;
  puVar5[2] = 0;
  puVar5[3] = auVar10._8_8_;
  puVar5[4] = lVar4;
  plVar3[2] = lVar1 + 1;
  return lVar1;
}

