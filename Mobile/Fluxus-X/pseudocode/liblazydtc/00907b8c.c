/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907b8c
 */

void FUN_00907b8c(long param_1,int param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined4 *param_5)

{
  long *plVar1;
  
  plVar1 = *(long **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x248);
  if (plVar1 == (long *)0x0) {
    *param_3 = *(undefined8 *)(*(long *)(param_1 + 0x20) + 0x50);
    *param_4 = *(undefined8 *)(*(long *)(param_1 + 0x20) + 0x58);
    *param_5 = *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x560);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00907bac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x30))(plVar1,param_1);
  return;
}

