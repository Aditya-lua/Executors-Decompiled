
void FUN_0047a46c(void)

{
  long *plVar1;
  long unaff_x19;
  long *unaff_x21;
  long unaff_x23;
  
  while( true ) {
    plVar1 = unaff_x21 + 0x10;
    func_0x00488078(unaff_x21 + 8);
    if (unaff_x23 == 0) break;
    if (*plVar1 != 0xc) {
      func_0x00488078(plVar1);
    }
    unaff_x23 = unaff_x23 + -1;
    unaff_x21 = plVar1;
  }
  if (*(long *)(unaff_x19 + 8) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),*(long *)(unaff_x19 + 8) << 7,8);
  return;
}

