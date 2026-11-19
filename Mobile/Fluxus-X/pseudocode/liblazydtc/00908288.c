/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908288
 */

undefined8 FUN_00908288(undefined8 param_1,long param_2,int param_3)

{
  undefined8 uVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_2 + (long)param_3 * 8 + 0x248);
  if (plVar2 == (long *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x009082a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*plVar2 + 0x68))(plVar2,param_1);
  return uVar1;
}

