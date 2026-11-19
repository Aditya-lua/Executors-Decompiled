/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935594
 */

undefined8 FUN_00935594(long param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  
  lVar2 = *(long *)(param_1 + 0x130);
  plVar3 = (long *)(param_1 + 0x130);
  if (lVar2 == 0) {
    uVar1 = FUN_00934ec4();
    if ((int)uVar1 != 0) {
      return uVar1;
    }
    lVar2 = *plVar3;
    if (lVar2 == 0) goto LAB_009355d0;
  }
  do {
    if (*(uint *)(param_2 + 0x18) <= *(uint *)(lVar2 + 0x18)) break;
    plVar3 = (long *)(lVar2 + 8);
    lVar2 = *plVar3;
  } while (lVar2 != 0);
LAB_009355d0:
  *(long *)(param_2 + 8) = lVar2;
  *plVar3 = param_2;
  return 0;
}

