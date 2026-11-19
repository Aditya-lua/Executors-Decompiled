/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b501c
 */

void FUN_008b501c(undefined8 param_1,long param_2,uint param_3)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  
  plVar1 = (long *)(param_2 + 0x10);
  lVar2 = *plVar1;
  *(long *)(*(long *)(param_2 + 0x18) + 0x10) = lVar2;
  *(undefined8 *)(lVar2 + 0x18) = *(undefined8 *)(param_2 + 0x18);
  if ((param_3 & 1) == 0) {
    lVar3 = (*(long **)(param_2 + 8))[1];
    lVar2 = **(long **)(param_2 + 8);
    *(long **)(param_2 + 8) = plVar1;
    *(long *)(param_2 + 0x18) = lVar3;
    *plVar1 = lVar2;
    FUN_008b63c4();
    return;
  }
  return;
}

