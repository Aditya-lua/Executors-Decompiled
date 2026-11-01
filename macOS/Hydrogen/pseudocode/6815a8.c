
void FUN_006815a8(void)

{
  bool in_CY;
  long lVar1;
  ulong unaff_x19;
  ulong unaff_x20;
  long *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  
  if (in_CY) {
    if (unaff_x20 == unaff_x22) {
      (**(code **)(*unaff_x21 + 0x50))();
                    /* WARNING: Could not recover jumptable at 0x00681718. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*unaff_x21 + 0xb8))();
      return;
    }
    if ((unaff_x20 & 7) == 0) {
      lVar1 = (**(code **)(*unaff_x21 + 0xb8))();
      unaff_x20 = unaff_x20 + (unaff_x19 - lVar1);
    }
    else {
      do {
        if (unaff_x20 != 0) {
          _memcpy();
        }
        (**(code **)(*unaff_x21 + 0x50))();
        (**(code **)(*unaff_x21 + 0xb8))();
        unaff_x20 = unaff_x20 + unaff_x23;
        unaff_x19 = unaff_x19 - unaff_x23;
      } while (unaff_x23 <= unaff_x19);
    }
  }
  if ((unaff_x20 == 0) || (unaff_x22 == unaff_x20)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__memcpy_00a250b8)();
  return;
}

