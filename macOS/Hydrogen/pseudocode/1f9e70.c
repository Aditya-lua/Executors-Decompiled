
/* WARNING: Possible PIC construction at 0x001f9e90: Changing call to branch */

void FUN_001f9e70(long *param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  
  lVar1 = *param_1;
  *param_1 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
code_r0x00187bd4:
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)();
    return;
  }
  __Unwind_Resume();
  plVar3 = (long *)func_0x007a2668();
  lVar1 = *plVar3;
  uVar4 = *(undefined8 *)(lVar1 + 0x38);
  func_0x002d8de8(*(undefined8 *)(lVar1 + 0x10));
  func_0x002d8de8(uVar4);
  if (lVar1 != -1) {
    lVar2 = *(long *)(lVar1 + 8);
    *(long *)(lVar1 + 8) = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      goto code_r0x00187bd4;
    }
  }
  return;
}

