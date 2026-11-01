
void FUN_001f9940(long param_1)

{
  undefined8 *puVar1;
  undefined1 in_ZR;
  long lVar2;
  long *plVar3;
  long lVar4;
  long in_x9;
  ulong uVar5;
  
  while( true ) {
    lVar4 = in_x9;
    if ((bool)in_ZR) {
      return;
    }
    while (lVar4 == -1) {
      InstructionSynchronizationBarrier();
      lVar4 = *(long *)(param_1 + 8);
    }
    if (lVar4 < 0) break;
    in_x9 = *(long *)(param_1 + 8);
    if (in_x9 == lVar4) {
      *(long *)(param_1 + 8) = lVar4 + 1;
    }
    in_ZR = in_x9 == lVar4;
  }
  plVar3 = (long *)func_0x0079b7bc(&UNK_009c5940,&UNK_009c5950);
  lVar4 = *plVar3;
  puVar1 = (undefined8 *)plVar3[1];
  uVar5 = puVar1[2];
  if ((code *)*puVar1 != (code *)0x0) {
    (*(code *)*puVar1)(lVar4 + (uVar5 - 1 & 0xfffffffffffffff0) + 0x10);
  }
  if (lVar4 != -1) {
    lVar2 = *(long *)(lVar4 + 8);
    *(long *)(lVar4 + 8) = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      if (uVar5 < 9) {
        uVar5 = 8;
      }
      uVar5 = uVar5 + puVar1[1] + 0xf & -uVar5;
      if (uVar5 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(lVar4,uVar5);
        return;
      }
    }
  }
  return;
}

