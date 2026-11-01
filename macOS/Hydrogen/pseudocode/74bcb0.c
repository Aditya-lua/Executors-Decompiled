
/* WARNING: Possible PIC construction at 0x0074bcbc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0074bcfc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0074bcc0) */
/* WARNING: Removing unreachable block (ram,0x0074bd00) */
/* WARNING: Removing unreachable block (ram,0x0074bc84) */
/* WARNING: Removing unreachable block (ram,0x0074bc60) */
/* WARNING: Removing unreachable block (ram,0x0074bd38) */
/* WARNING: Removing unreachable block (ram,0x0074bd60) */
/* WARNING: Removing unreachable block (ram,0x0074bd40) */
/* WARNING: Removing unreachable block (ram,0x0074bc64) */
/* WARNING: Removing unreachable block (ram,0x0074bc98) */
/* WARNING: Removing unreachable block (ram,0x0074bcc4) */
/* WARNING: Removing unreachable block (ram,0x0074bd08) */
/* WARNING: Removing unreachable block (ram,0x0074bd1c) */
/* WARNING: Removing unreachable block (ram,0x0074bcdc) */
/* WARNING: Removing unreachable block (ram,0x0074bce8) */
/* WARNING: Removing unreachable block (ram,0x0074bca4) */
/* WARNING: Removing unreachable block (ram,0x0074bd04) */
/* WARNING: Removing unreachable block (ram,0x0074bc68) */

undefined8 FUN_0074bcb0(undefined8 param_1,long *param_2)

{
  undefined8 uVar1;
  
  if (param_2 == (long *)0x0) {
    return 0x17;
  }
                    /* WARNING: Could not recover jumptable at 0x00773bf0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_2 + 0x18))();
  return uVar1;
}

