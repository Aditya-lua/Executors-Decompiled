
/* WARNING: Possible PIC construction at 0x0053dbbc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053de08: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0053dbc0) */
/* WARNING: Removing unreachable block (ram,0x0053dbcc) */
/* WARNING: Removing unreachable block (ram,0x0053dbe4) */
/* WARNING: Removing unreachable block (ram,0x0053dc0c) */
/* WARNING: Removing unreachable block (ram,0x0053dbec) */
/* WARNING: Removing unreachable block (ram,0x0053dbd4) */
/* WARNING: Removing unreachable block (ram,0x0053de0c) */
/* WARNING: Removing unreachable block (ram,0x0053de14) */
/* WARNING: Removing unreachable block (ram,0x0053de20) */
/* WARNING: Removing unreachable block (ram,0x0053de2c) */
/* WARNING: Removing unreachable block (ram,0x0053de44) */
/* WARNING: Removing unreachable block (ram,0x0053de6c) */
/* WARNING: Removing unreachable block (ram,0x0053de4c) */
/* WARNING: Removing unreachable block (ram,0x0053de34) */

void FUN_0053cf38(void)

{
  bool in_ZR;
  ulong uVar1;
  long unaff_x19;
  undefined8 uVar2;
  
  if (!in_ZR) {
    uVar1 = *(ulong *)(unaff_x19 + 8) ^ 0x8000000000000000;
    if (1 < uVar1) {
      uVar1 = 2;
    }
    if (uVar1 != 0) {
      if (uVar1 == 1) {
        uVar2 = *(undefined8 *)(unaff_x19 + 0x28);
        func_0x0053ceac(uVar2);
      }
      else {
        uVar2 = *(undefined8 *)(unaff_x19 + 0x38);
        func_0x0053ceac(uVar2);
      }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(uVar2,0x40,8);
      return;
    }
  }
  return;
}

