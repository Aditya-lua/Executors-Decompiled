/* 7ff70c942050 FUN_7ff70c942050 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c942050(void)

{
  undefined8 uVar1;
  
  if (DAT_7ff70cc1ac70 != '\0') {
    return 1;
  }
  DAT_7ff70cc1ac70 = 1;
                    /* WARNING: Could not recover jumptable at 0x7ff70c94206d. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(_DAT_7ff70cbec7c0 + 0x20))();
  return uVar1;
}


