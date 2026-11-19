/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009078cc
 */

undefined8 FUN_009078cc(long param_1,int param_2)

{
  long *plVar1;
  undefined8 uVar2;
  
  plVar1 = *(long **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x248);
  while( true ) {
    if (plVar1 == (long *)0x0) {
      return 0;
    }
    if ((*(byte *)((long)plVar1 + 0x24) & 1) != 0) break;
    plVar1 = (long *)plVar1[1];
  }
                    /* WARNING: Could not recover jumptable at 0x00907904. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (**(code **)(*plVar1 + 0x40))(plVar1,param_1);
  return uVar2;
}

