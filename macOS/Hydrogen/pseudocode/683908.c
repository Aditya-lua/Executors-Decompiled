
void FUN_00683908(code *param_1)

{
  long lVar1;
  long unaff_x19;
  ulong uVar2;
  long unaff_x20;
  ulong uVar3;
  long *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x24;
  long unaff_x25;
  
  (*param_1)();
  (**(code **)(*unaff_x21 + 0xd0))();
  uVar3 = unaff_x20 + unaff_x25;
  uVar2 = unaff_x19 - unaff_x25;
  if (unaff_x24 <= uVar2) {
    if (uVar3 == unaff_x22) {
      (**(code **)(unaff_x21[1] + 0x50))();
                    /* WARNING: Could not recover jumptable at 0x00683a48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*unaff_x21 + 0xd0))();
      return;
    }
    if ((uVar3 & 3) == 0) {
      lVar1 = (**(code **)(*unaff_x21 + 0xd0))();
      uVar3 = uVar3 + (uVar2 - lVar1);
    }
    else {
      do {
        if (uVar3 != 0) {
          _memcpy();
        }
        (**(code **)(unaff_x21[1] + 0x50))();
        (**(code **)(*unaff_x21 + 0xd0))();
        uVar3 = uVar3 + unaff_x24;
        uVar2 = uVar2 - unaff_x24;
      } while (unaff_x24 <= uVar2);
    }
  }
  if ((uVar3 == 0) || (unaff_x22 == uVar3)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__memcpy_00a250b8)();
  return;
}

