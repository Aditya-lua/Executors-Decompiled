
void FUN_005bb754(undefined8 *param_1)

{
  long lVar1;
  long lVar2;
  undefined8 in_x9;
  long *unaff_x19;
  long lVar3;
  long lVar4;
  
  param_1[1] = in_x9;
  param_1[2] = 0x29;
  *param_1 = 0x8000000000000000;
  lVar1 = unaff_x19[1];
  if (unaff_x19[2] != 0) {
    lVar3 = 0;
    lVar4 = 1 - unaff_x19[2];
    do {
      lVar2 = **(long **)(lVar1 + lVar3);
      **(long **)(lVar1 + lVar3) = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4(lVar1 + lVar3);
      }
      lVar3 = lVar3 + 8;
      lVar4 = lVar4 + 1;
    } while (lVar4 != 1);
  }
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*unaff_x19 << 3,8);
  return;
}

