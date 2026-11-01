
void FUN_005927ec(long param_1)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  while( true ) {
    if (param_1 == 1) {
      func_0x005d2ac4();
    }
    lVar1 = *(long *)*unaff_x20;
    *(long *)*unaff_x20 = lVar1 + unaff_x21;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x20);
    }
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) break;
    param_1 = *(long *)unaff_x20[1];
    *(long *)unaff_x20[1] = param_1 + unaff_x21;
    LORelease();
    unaff_x20 = unaff_x20 + 2;
  }
  if (unaff_x19[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19,unaff_x19[2] << 4,8);
  return;
}

