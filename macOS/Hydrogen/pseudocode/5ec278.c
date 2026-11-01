
void FUN_005ec278(void)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  long *plVar4;
  int *piVar5;
  undefined8 *extraout_x8;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 uVar9;
  code *unaff_x22;
  undefined1 auVar10 [16];
  
  plVar4 = (long *)(*unaff_x22)();
  *plVar4 = *plVar4 + -1;
  auVar10 = (*unaff_x22)();
  *(undefined1 *)(auVar10._0_8_ + 0x20) = 1;
  __Unwind_Resume(auVar10._8_8_);
  auVar10 = (*unaff_x22)();
  *(undefined1 *)(auVar10._0_8_ + 0x20) = 1;
  piVar5 = (int *)__Unwind_Resume(auVar10._8_8_);
  if (*piVar5 != 1) {
    uVar7 = 0;
    lVar6 = *(long *)(piVar5 + 2);
LAB_005ec31c:
    uVar9 = *(undefined8 *)(piVar5 + 4);
    *extraout_x8 = uVar7;
    extraout_x8[1] = lVar6;
    extraout_x8[2] = uVar9;
    return;
  }
  lVar6 = *(long *)(piVar5 + 2);
  uVar7 = 1;
  do {
    lVar8 = *(long *)(lVar6 + 8);
    while (lVar8 != -1) {
      if (lVar8 < 0) {
        piVar5 = (int *)func_0x007b1070(&UNK_009f3bc0,&UNK_009f3bd0);
        lVar6 = *(long *)(piVar5 + 2);
        if (*piVar5 == 1) {
          lVar6 = lVar6 + (*(long *)(*(long *)(piVar5 + 4) + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
          ;
        }
                    /* WARNING: Could not recover jumptable at 0x005ec374. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (**(code **)(*(long *)(piVar5 + 4) + 0x60))(lVar6);
        return;
      }
      lVar1 = lVar8 + 1;
      lVar2 = *(long *)(lVar6 + 8);
      bVar3 = lVar2 == lVar8;
      lVar8 = lVar2;
      if (bVar3) {
        *(long *)(lVar6 + 8) = lVar1;
        goto LAB_005ec31c;
      }
    }
    InstructionSynchronizationBarrier();
  } while( true );
}

