
void FUN_005cddc0(long *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  
  lVar1 = *(long *)param_1[3];
  *(long *)param_1[3] = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2b20();
  }
  lVar1 = param_1[2];
  if (lVar1 != 0) {
    lVar3 = param_1[1] + 0x18;
    do {
      lVar1 = lVar1 + -1;
      lVar2 = **(long **)(lVar3 + -0x10);
      **(long **)(lVar3 + -0x10) = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4();
      }
      lVar3 = lVar3 + 0x10;
    } while (lVar1 != 0);
  }
  if (*param_1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_1[1],*param_1 << 4,8);
  return;
}

