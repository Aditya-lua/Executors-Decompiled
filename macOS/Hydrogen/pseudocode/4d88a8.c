
/* WARNING: Possible PIC construction at 0x004d88d0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004d88d4) */
/* WARNING: Removing unreachable block (ram,0x004d88dc) */
/* WARNING: Removing unreachable block (ram,0x004d88e8) */
/* WARNING: Removing unreachable block (ram,0x004d88f4) */
/* WARNING: Removing unreachable block (ram,0x004d890c) */
/* WARNING: Removing unreachable block (ram,0x004d8934) */
/* WARNING: Removing unreachable block (ram,0x004d8914) */
/* WARNING: Removing unreachable block (ram,0x004d88fc) */

void FUN_004d88a8(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(param_1 + 0x30);
  func_0x004d7924(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

