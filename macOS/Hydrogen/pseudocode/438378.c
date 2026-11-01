
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00438378(void)

{
  undefined8 uVar1;
  code *pcVar2;
  code *pcVar3;
  long *plVar4;
  undefined8 *puVar5;
  long lVar6;
  ulong *puVar7;
  long lVar8;
  long extraout_x8;
  long extraout_x8_00;
  undefined8 extraout_x8_01;
  undefined8 extraout_x8_02;
  long extraout_x9;
  code *extraout_x10;
  long *plStack_38;
  
  __Unwind_Resume();
  pcVar3 = pcRam0000000000a2bc88;
  plVar4 = (long *)(*pcRam0000000000a2bc88)(0xa2bc88);
  lVar8 = *plVar4;
  while( true ) {
    if (lVar8 != 0) {
      func_0x007a2334(&UNK_009dc320);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x438404);
      (*pcVar3)();
    }
    puVar5 = (undefined8 *)(*pcVar3)(0xa2bc88);
    *puVar5 = 0xffffffffffffffff;
    if (puVar5[3] == 0) break;
    plVar4 = (long *)(*pcVar3)(puVar5[3] + -1,0xa2bc88);
    plVar4[3] = extraout_x8;
    puVar5 = (undefined8 *)(plVar4[2] + extraout_x8 * 0x10);
    uVar1 = *puVar5;
    pcVar2 = (code *)puVar5[1];
    *plVar4 = 0;
    (*pcVar2)(uVar1);
    lVar8 = *plVar4;
  }
  lVar6 = (*pcVar3)(0xa2bc88);
  lVar8 = 0;
  if (*(long *)(lVar6 + 8) != 0) {
    plVar4 = (long *)(*pcVar3)(0xa2bc88);
    func_0x00187bd4(plVar4[2],extraout_x8_00 << 4,8);
    lVar8 = *plVar4 + 1;
  }
  puVar5 = (undefined8 *)(*pcVar3)(lVar8,0xa2bc88);
  puVar5[2] = 8;
  puVar5[3] = 0;
  *puVar5 = extraout_x8_01;
  puVar5[1] = 0;
  puVar7 = (ulong *)(*___ZN3std6thread7current7CURRENT17h01073c2742dba4edE)
                              (&__ZN3std6thread7current7CURRENT17h01073c2742dba4edE);
  if (2 < *puVar7) {
    puVar5 = (undefined8 *)(*extraout_x10)(extraout_x8_02);
    *puVar5 = 2;
    plStack_38 = (long *)(extraout_x9 + -0x10);
    lVar8 = *plStack_38;
    *plStack_38 = lVar8 + -1;
    LORelease();
    if (lVar8 == 1) {
      DataMemoryBarrier(2,1);
      func_0x00403874(&plStack_38);
    }
  }
  return;
}

