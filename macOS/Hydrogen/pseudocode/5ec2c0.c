
void __ZN12tracing_core10dispatcher8Dispatch9downgrade17h904c2ed893634167E
               (undefined8 *param_1,int *param_2)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  int *piVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  
  if (*param_2 != 1) {
    uVar6 = 0;
    lVar5 = *(long *)(param_2 + 2);
LAB_005ec31c:
    uVar8 = *(undefined8 *)(param_2 + 4);
    *param_1 = uVar6;
    param_1[1] = lVar5;
    param_1[2] = uVar8;
    return;
  }
  lVar5 = *(long *)(param_2 + 2);
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
        goto LAB_005ec31c;
      }
    }
    InstructionSynchronizationBarrier();
  } while( true );
}

