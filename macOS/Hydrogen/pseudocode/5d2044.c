
void FUN_005d2044(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  undefined8 *puVar4;
  long lVar5;
  
  __Unwind_Resume();
  plVar3 = (long *)func_0x007a2668();
  lVar1 = plVar3[1];
  lVar5 = plVar3[2];
  if (lVar5 != 0) {
    puVar4 = (undefined8 *)(lVar1 + 8);
    do {
      lVar2 = *(long *)*puVar4;
      *(long *)*puVar4 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4(puVar4);
      }
      puVar4 = puVar4 + 2;
      lVar5 = lVar5 + -1;
    } while (lVar5 != 0);
  }
  if (*plVar3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*plVar3 << 4,8);
  return;
}

