
void FUN_005538ac(long *param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  undefined8 *puVar4;
  long lVar5;
  
  lVar1 = param_1[1];
  lVar5 = param_1[2];
  if (lVar5 != 0) {
    puVar4 = (undefined8 *)(lVar1 + 8);
    do {
      lVar2 = *(long *)puVar4[-1];
      *(long *)puVar4[-1] = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4();
      }
      plVar3 = (long *)*puVar4;
      if (plVar3 != (long *)0x0) {
        lVar2 = *plVar3;
        *plVar3 = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          func_0x005d2ac4(puVar4);
        }
      }
      puVar4 = puVar4 + 2;
      lVar5 = lVar5 + -1;
    } while (lVar5 != 0);
  }
  if (*param_1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*param_1 << 4,8);
  return;
}

