
uint * FUN_00596d20(undefined8 param_1,undefined8 param_2,dword *param_3)

{
  long *plVar1;
  long lVar2;
  uint uVar3;
  long *plVar4;
  uint *puVar5;
  long *plVar7;
  long *plVar6;
  uint *puVar8;
  long lVar9;
  long unaff_x19;
  
  if ((*(long *)(unaff_x19 + 0x20) != 0) && (*(long *)(unaff_x19 + 0x30) != 0)) {
    param_3 = &MACH_HEADER.cpusubtype;
    func_0x00187bd4(*(long *)(unaff_x19 + 0x20),*(long *)(unaff_x19 + 0x30) << 3);
  }
  plVar4 = (long *)__Unwind_Resume();
  plVar1 = (long *)plVar4[1];
  if ((long *)*plVar4 == plVar1) {
    return (uint *)0x0;
  }
  plVar6 = (long *)*plVar4;
  do {
    plVar7 = plVar6 + 8;
    if (*plVar6 == 10) {
      puVar8 = (uint *)plVar6[2];
      lVar2 = plVar6[3];
      lVar9 = lVar2 * 0x10;
      *(uint **)param_3 = puVar8;
      *(uint **)(param_3 + 2) = puVar8 + lVar2 * 4;
      puVar5 = puVar8 + -2;
      while (lVar9 != 0) {
        uVar3 = *puVar8;
        *(uint **)param_3 = puVar8 + 4;
        puVar5 = puVar5 + 4;
        lVar9 = lVar9 + -0x10;
        puVar8 = puVar8 + 4;
        if ((uVar3 & 1) != 0) {
          *plVar4 = (long)plVar7;
          return puVar5;
        }
      }
    }
    plVar6 = plVar7;
    if (plVar7 == plVar1) {
      *plVar4 = (long)plVar7;
      return (uint *)0x0;
    }
  } while( true );
}

