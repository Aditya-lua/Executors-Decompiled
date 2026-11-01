
void FUN_00181234(long *param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  long in_x9;
  long *unaff_x19;
  ulong uVar4;
  
  lVar2 = *param_1;
  *param_1 = lVar2 + in_x9;
  LORelease();
  if (lVar2 != 1) {
    return;
  }
  DataMemoryBarrier(2,1);
  lVar2 = *unaff_x19;
  puVar1 = (undefined8 *)unaff_x19[1];
  uVar4 = puVar1[2];
  if ((code *)*puVar1 != (code *)0x0) {
    (*(code *)*puVar1)(lVar2 + (uVar4 - 1 & 0xfffffffffffffff0) + 0x10);
  }
  if (lVar2 != -1) {
    lVar3 = *(long *)(lVar2 + 8);
    *(long *)(lVar2 + 8) = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      DataMemoryBarrier(2,1);
      if (uVar4 < 9) {
        uVar4 = 8;
      }
      uVar4 = uVar4 + puVar1[1] + 0xf & -uVar4;
      if (uVar4 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(lVar2,uVar4);
        return;
      }
    }
  }
  return;
}

