
/* WARNING: Possible PIC construction at 0x00276a08: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00276a0c) */
/* WARNING: Removing unreachable block (ram,0x00276a9c) */
/* WARNING: Removing unreachable block (ram,0x00276a68) */
/* WARNING: Removing unreachable block (ram,0x00276a6c) */
/* WARNING: Removing unreachable block (ram,0x00276a7c) */

void FUN_002769f8(long param_1)

{
  undefined1 in_ZR;
  long unaff_x19;
  long unaff_x20;
  
  while (!(bool)in_ZR) {
    *(undefined1 *)(unaff_x19 + param_1) = 0;
    param_1 = param_1 + 1;
    in_ZR = unaff_x20 == param_1;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

