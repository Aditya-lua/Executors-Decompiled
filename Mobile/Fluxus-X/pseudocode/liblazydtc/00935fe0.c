/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935fe0
 */

undefined8 FUN_00935fe0(long param_1)

{
  undefined8 uVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x138);
  while( true ) {
    if (plVar2 == (long *)0x0) {
      return 0;
    }
    uVar1 = (**(code **)(*plVar2 + 0x40))(param_1,plVar2);
    if ((int)uVar1 != 0) break;
    plVar2 = (long *)plVar2[1];
  }
  return uVar1;
}

