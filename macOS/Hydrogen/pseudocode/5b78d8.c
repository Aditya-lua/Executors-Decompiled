
void FUN_005b78d8(void)

{
  bool in_CY;
  long in_x9;
  long in_x10;
  
  if (in_CY) {
    in_x9 = in_x10;
  }
                    /* WARNING: Could not recover jumptable at 0x005b78f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_005b78f8 + (ulong)*(ushort *)(&UNK_008aef8c + in_x9 * 2) * 4))();
  return;
}

