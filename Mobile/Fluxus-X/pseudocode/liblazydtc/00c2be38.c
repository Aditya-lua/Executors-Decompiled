/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2be38
 */

/* WARNING: Removing unreachable block (ram,0x00c2be98) */
/* WARNING: Removing unreachable block (ram,0x00c2bea8) */
/* WARNING: Removing unreachable block (ram,0x00c2beb0) */
/* WARNING: Removing unreachable block (ram,0x00c2bed8) */
/* WARNING: Removing unreachable block (ram,0x00c2bedc) */
/* WARNING: Removing unreachable block (ram,0x00c2befc) */
/* WARNING: Removing unreachable block (ram,0x00c2bf1c) */
/* WARNING: Removing unreachable block (ram,0x00c2bf24) */
/* WARNING: Removing unreachable block (ram,0x00c2bf40) */
/* WARNING: Removing unreachable block (ram,0x00c2bf50) */
/* WARNING: Removing unreachable block (ram,0x00c2bf60) */
/* WARNING: Removing unreachable block (ram,0x00c2bec4) */
/* WARNING: Removing unreachable block (ram,0x00c2c038) */
/* WARNING: Removing unreachable block (ram,0x00c2c03c) */

undefined8 FUN_00c2be38(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  undefined4 uVar3;
  undefined1 auStack_a8 [24];
  code *local_90;
  long local_48;
  
  FUN_00c2c354(param_2,param_1);
  iVar1 = FUN_00c2c578(param_2);
  if (iVar1 != 0) {
    do {
      if (iVar1 < 0) {
        return 2;
      }
      FUN_00c2c3fc(param_2,0xfffffffe,&local_48);
      iVar1 = FUN_00c2c58c(param_2,auStack_a8);
      if (iVar1 != 0) {
        return 2;
      }
      if (local_90 != (code *)0x0) {
        uVar3 = 6;
        if (local_48 != param_3[3]) {
          uVar3 = 2;
        }
        iVar1 = (*local_90)(1,uVar3,*param_3,param_3,param_2);
        if (iVar1 != 8) {
          if (iVar1 == 7) {
            uVar2 = FUN_00c2c344(param_2);
            UNRECOVERED_JUMPTABLE = (code *)FUN_00c2c334();
                    /* WARNING: Could not recover jumptable at 0x00c2c064. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            uVar2 = (*UNRECOVERED_JUMPTABLE)(uVar2);
            return uVar2;
          }
          return 2;
        }
        if (local_48 == param_3[3]) {
          fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","unwind_phase2",
                  "during phase1 personality function said it would stop here, but now in phase2 it did not stop here"
                 );
          fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
          abort();
        }
      }
      iVar1 = FUN_00c2c578(param_2);
    } while (iVar1 != 0);
  }
  return 5;
}

