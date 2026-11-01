
void FUN_004daa88(void)

{
  undefined1 in_ZR;
  long unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  
  while( true ) {
    if (!(bool)in_ZR) {
      func_0x004ca6d8(unaff_x21);
    }
    unaff_x22 = unaff_x22 + -1;
    func_0x004ca6d8(unaff_x21 + 8);
    if (unaff_x22 == 0) break;
    in_ZR = unaff_x21[0x10] == 0xc;
    unaff_x21 = unaff_x21 + 0x10;
  }
  if (*(long *)(unaff_x19 + 8) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),*(long *)(unaff_x19 + 8) << 7,8);
  return;
}

