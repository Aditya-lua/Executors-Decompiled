
void FUN_004da900(void)

{
  undefined8 *puVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long lVar3;
  
  while( true ) {
    puVar1 = unaff_x22 + 2;
    lVar3 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    lVar2 = *(long *)*unaff_x22;
    *(long *)*unaff_x22 = lVar2 + unaff_x20;
    LORelease();
    unaff_x22 = puVar1;
    unaff_x23 = lVar3;
    if (lVar2 == 1) {
      func_0x005d2ac4();
    }
  }
  if (*unaff_x21 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),*unaff_x21 << 4,8);
  return;
}

