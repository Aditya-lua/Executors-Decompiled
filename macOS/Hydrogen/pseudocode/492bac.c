
void FUN_00492bac(void)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  undefined8 *puVar3;
  
  if (*(long *)(unaff_x19 + 0xa8) != 0) {
    puVar3 = *(undefined8 **)(unaff_x19 + 0xa0);
    lVar2 = 1 - *(long *)(unaff_x19 + 0xa8);
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
  if (*(long *)(unaff_x19 + 0x98) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)
            (*(undefined8 *)(unaff_x19 + 0xa0),*(long *)(unaff_x19 + 0x98) << 3,8);
  return;
}

