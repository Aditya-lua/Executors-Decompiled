/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907f88
 */

undefined8 FUN_00907f88(long param_1)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x20);
  plVar2 = *(long **)(lVar3 + 0x248);
  while( true ) {
    if (plVar2 == (long *)0x0) {
      plVar2 = *(long **)(lVar3 + 0x250);
      while( true ) {
        if (plVar2 == (long *)0x0) {
          return 0;
        }
        if ((*(code **)(*plVar2 + 0x58) != (code *)&LAB_00907bd4) &&
           (uVar1 = (**(code **)(*plVar2 + 0x58))(plVar2,param_1,5,0,0), (int)uVar1 != 0)) break;
        plVar2 = (long *)plVar2[1];
      }
      return uVar1;
    }
    if ((*(code **)(*plVar2 + 0x58) != (code *)&LAB_00907bd4) &&
       (uVar1 = (**(code **)(*plVar2 + 0x58))(plVar2,param_1,5,0,0), (int)uVar1 != 0)) break;
    plVar2 = (long *)plVar2[1];
  }
  return uVar1;
}

