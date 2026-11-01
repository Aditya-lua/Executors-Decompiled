
void FUN_005ec2a0(void)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  int *piVar4;
  undefined8 *extraout_x8;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  code *unaff_x22;
  undefined1 auVar9 [16];
  
  __Unwind_Resume();
  auVar9 = (*unaff_x22)();
  *(undefined1 *)(auVar9._0_8_ + 0x20) = 1;
  piVar4 = (int *)__Unwind_Resume(auVar9._8_8_);
  if (*piVar4 != 1) {
    uVar6 = 0;
    lVar5 = *(long *)(piVar4 + 2);
code_r0x005ec31c:
    uVar8 = *(undefined8 *)(piVar4 + 4);
    *extraout_x8 = uVar6;
    extraout_x8[1] = lVar5;
    extraout_x8[2] = uVar8;
    return;
  }
  lVar5 = *(long *)(piVar4 + 2);
  uVar6 = 1;
  do {
    lVar7 = *(long *)(lVar5 + 8);
    while (lVar7 != -1) {
      if (lVar7 < 0) {
        piVar4 = (int *)func_0x007b1070(&UNK_009f3bc0,&UNK_009f3bd0);
        lVar5 = *(long *)(piVar4 + 2);
        if (*piVar4 == 1) {
          lVar5 = lVar5 + (*(long *)(*(long *)(piVar4 + 4) + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
          ;
        }
                    /* WARNING: Could not recover jumptable at 0x005ec374. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (**(code **)(*(long *)(piVar4 + 4) + 0x60))(lVar5);
        return;
      }
      lVar1 = lVar7 + 1;
      lVar2 = *(long *)(lVar5 + 8);
      bVar3 = lVar2 == lVar7;
      lVar7 = lVar2;
      if (bVar3) {
        *(long *)(lVar5 + 8) = lVar1;
        goto code_r0x005ec31c;
      }
    }
    InstructionSynchronizationBarrier();
  } while( true );
}

