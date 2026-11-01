
void FUN_0020cac8(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined8 *extraout_x8;
  long lVar5;
  long lVar6;
  undefined1 uStack0000000000000008;
  long *plStack_28;
  
  DataMemoryBarrier(2,1);
  func_0x001fa698(&uStack0000000000000008);
  __Unwind_Resume();
  uVar3 = func_0x007a2668();
  puVar4 = (undefined8 *)func_0x00226f90();
  lVar2 = *(long *)*puVar4;
  *(long *)*puVar4 = lVar2 + 1;
  if (lVar2 < 0) {
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x20cb7c);
    (*pcVar1)();
  }
  *extraout_x8 = 0;
  extraout_x8[1] = 8;
  plStack_28 = (long *)*puVar4;
  lVar2 = plStack_28[8];
  lVar6 = plStack_28[0xb];
  lVar5 = plStack_28[10];
  extraout_x8[5] = plStack_28[9];
  extraout_x8[4] = lVar2;
  extraout_x8[7] = lVar6;
  extraout_x8[6] = lVar5;
  extraout_x8[2] = 0;
  extraout_x8[3] = uVar3;
  *(undefined2 *)(extraout_x8 + 8) = 0x101;
  *(undefined1 *)((long)extraout_x8 + 0x42) = 1;
  lVar2 = *plStack_28;
  *plStack_28 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9f08(&plStack_28);
  }
  return;
}

