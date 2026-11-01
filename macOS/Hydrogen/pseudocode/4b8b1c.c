
void FUN_004b8b1c(void)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long unaff_x19;
  ulong uVar5;
  
  plVar4 = *(long **)(unaff_x19 + 8);
  lVar2 = *plVar4;
  *plVar4 = lVar2 + -1;
  LORelease();
  if (lVar2 != 1) {
    return;
  }
  DataMemoryBarrier(2,1);
  lVar2 = *(long *)(unaff_x19 + 8);
  puVar1 = *(undefined8 **)(unaff_x19 + 0x10);
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

