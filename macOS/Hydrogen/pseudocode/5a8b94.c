
void FUN_005a8b94(long param_1)

{
  long lVar1;
  long in_x9;
  long unaff_x19;
  long *unaff_x21;
  long lVar2;
  
  lVar2 = in_x9 + 0x18;
  do {
    param_1 = param_1 + -1;
    lVar1 = **(long **)(lVar2 + -0x10);
    **(long **)(lVar2 + -0x10) = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4();
    }
    lVar2 = lVar2 + 0x10;
  } while (param_1 != 0);
  if (*unaff_x21 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),*unaff_x21 << 4,8);
  return;
}

