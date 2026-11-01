
void FUN_00493e0c(long param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  ulong uVar5;
  
  if (param_1 != 2 && param_1 != 0) {
    plVar4 = *(long **)(param_2 + 8);
    lVar2 = *plVar4;
    *plVar4 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      lVar2 = *(long *)(param_2 + 8);
      puVar1 = *(undefined8 **)(param_2 + 0x10);
      uVar5 = puVar1[2];
      if ((code *)*puVar1 != (code *)0x0) {
        (*(code *)*puVar1)(lVar2 + (uVar5 - 1 & 0xfffffffffffffff0) + 0x10);
      }
      if (lVar2 != -1) {
        lVar3 = *(long *)(lVar2 + 8);
        *(long *)(lVar2 + 8) = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          if (uVar5 < 9) {
            uVar5 = 8;
          }
          uVar5 = uVar5 + puVar1[1] + 0xf & -uVar5;
          if (uVar5 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)PTR__free_00a24e58)(lVar2,uVar5);
            return;
          }
        }
      }
      return;
    }
  }
  return;
}

