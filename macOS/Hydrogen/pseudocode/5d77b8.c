
void FUN_005d77b8(undefined8 param_1,undefined8 *param_2,undefined8 *param_3)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  
  param_3[1] = param_1;
  *(undefined8 *)*param_3 = param_1;
  puVar3 = (undefined8 *)param_2[1];
  if (param_2[3] - (long)puVar3 != 0) {
    lVar2 = 1 - ((ulong)(param_2[3] - (long)puVar3) >> 3);
    do {
      lVar1 = *(long *)*puVar3;
      *(long *)*puVar3 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(puVar3);
      }
      puVar3 = puVar3 + 1;
      lVar2 = lVar2 + 1;
    } while (lVar2 != 1);
  }
  if (param_2[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*param_2,param_2[2] << 3,8);
  return;
}

