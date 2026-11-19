/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935f78
 */

undefined8 FUN_00935f78(long param_1)

{
  undefined8 uVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x138);
  while( true ) {
    if (plVar2 == (long *)0x0) {
      return 0xffffffffffffffff;
    }
    if ((int)plVar2[3] == 4) break;
    plVar2 = (long *)plVar2[1];
  }
                    /* WARNING: Could not recover jumptable at 0x00935fa4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*plVar2 + 0x28))();
  return uVar1;
}

