/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908258
 */

undefined8 FUN_00908258(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_2 + 0x248);
  if ((plVar2 == (long *)0x0) || ((*(byte *)(plVar2[3] + 0x3a0) >> 6 & 1) != 0)) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0090827c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*plVar2 + 0x60))(plVar2,param_1);
  return uVar1;
}

