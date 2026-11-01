
void FUN_004b8af8(long *param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  
  lVar4 = *param_1;
  if ((lVar4 != 2) && (func_0x005ec3ac(param_1,param_1[3]), lVar4 != 0)) {
    plVar3 = (long *)param_1[1];
    lVar4 = *plVar3;
    *plVar3 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      lVar4 = param_1[1];
      puVar1 = (undefined8 *)param_1[2];
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
  }
  return;
}

