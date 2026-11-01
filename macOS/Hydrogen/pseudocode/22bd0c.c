
/* WARNING: Possible PIC construction at 0x0022bd80: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0022c090: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0022c474: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0022bfac: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0022bd84) */
/* WARNING: Removing unreachable block (ram,0x0022be18) */
/* WARNING: Removing unreachable block (ram,0x0022bfb4) */
/* WARNING: Removing unreachable block (ram,0x0022bfdc) */
/* WARNING: Removing unreachable block (ram,0x0022be74) */
/* WARNING: Removing unreachable block (ram,0x0022bfa0) */
/* WARNING: Removing unreachable block (ram,0x0022bdc8) */
/* WARNING: Removing unreachable block (ram,0x0022c028) */
/* WARNING: Removing unreachable block (ram,0x0022c07c) */
/* WARNING: Removing unreachable block (ram,0x0022c094) */
/* WARNING: Removing unreachable block (ram,0x0022c244) */
/* WARNING: Removing unreachable block (ram,0x0022c2a8) */
/* WARNING: Removing unreachable block (ram,0x0022c300) */
/* WARNING: Removing unreachable block (ram,0x0022c454) */
/* WARNING: Removing unreachable block (ram,0x0022c478) */
/* WARNING: Removing unreachable block (ram,0x0022c5e8) */
/* WARNING: Removing unreachable block (ram,0x0022c568) */
/* WARNING: Removing unreachable block (ram,0x0022c46c) */
/* WARNING: Removing unreachable block (ram,0x0022c310) */
/* WARNING: Removing unreachable block (ram,0x0022c5f8) */
/* WARNING: Removing unreachable block (ram,0x0022c604) */
/* WARNING: Removing unreachable block (ram,0x0022c400) */
/* WARNING: Removing unreachable block (ram,0x0022c5bc) */
/* WARNING: Removing unreachable block (ram,0x0022c0ec) */
/* WARNING: Removing unreachable block (ram,0x0022c230) */
/* WARNING: Removing unreachable block (ram,0x0022c0fc) */
/* WARNING: Removing unreachable block (ram,0x0022c084) */
/* WARNING: Removing unreachable block (ram,0x0022bde4) */
/* WARNING: Removing unreachable block (ram,0x0022bfb0) */
/* WARNING: Removing unreachable block (ram,0x0022c008) */

void FUN_0022bd0c(undefined8 param_1)

{
  undefined8 extraout_x1;
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000020;
  
  func_0x0022200c(&uStack0000000000000020);
  __Unwind_Resume(param_1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000010,extraout_x1,1);
  return;
}

