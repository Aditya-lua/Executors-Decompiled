
void FUN_005d830c(ulong param_1)

{
  long lVar1;
  undefined8 *unaff_x19;
  long lVar2;
  undefined8 *unaff_x21;
  
  lVar2 = 1 - (param_1 >> 3);
  do {
    lVar1 = *(long *)*unaff_x21;
    *(long *)*unaff_x21 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x21);
    }
    unaff_x21 = unaff_x21 + 1;
    lVar2 = lVar2 + 1;
  } while (lVar2 != 1);
  if (unaff_x19[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19,unaff_x19[2] << 3,8);
  return;
}

