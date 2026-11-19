/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907984
 */

void FUN_00907984(long param_1,undefined8 param_2)

{
  byte bVar1;
  long lVar2;
  long *plVar3;
  long *plVar4;
  
  lVar2 = *(long *)(param_1 + 0x20);
  plVar3 = *(long **)(lVar2 + 0x248);
  do {
    plVar4 = plVar3;
    if (plVar4 == (long *)0x0) goto LAB_009079fc;
    bVar1 = *(byte *)((long)plVar4 + 0x24);
  } while ((((bVar1 & 1) == 0) && (plVar3 = (long *)plVar4[1], plVar3 != (long *)0x0)) &&
          ((*(byte *)((long)plVar3 + 0x24) & 1) == 0));
  while ((bVar1 >> 1 & 1) != 0) {
    plVar4 = (long *)plVar4[1];
    if (plVar4 == (long *)0x0) goto LAB_009079fc;
    bVar1 = *(byte *)((long)plVar4 + 0x24);
  }
  do {
    (**(code **)(*plVar4 + 0x38))(plVar4,param_1,param_2);
    plVar4 = (long *)plVar4[1];
  } while (plVar4 != (long *)0x0);
  lVar2 = *(long *)(param_1 + 0x20);
LAB_009079fc:
  plVar3 = *(long **)(lVar2 + 0x250);
  do {
    plVar4 = plVar3;
    if (plVar4 == (long *)0x0) {
      return;
    }
    bVar1 = *(byte *)((long)plVar4 + 0x24);
  } while ((((bVar1 & 1) == 0) && (plVar3 = (long *)plVar4[1], plVar3 != (long *)0x0)) &&
          ((*(byte *)((long)plVar3 + 0x24) & 1) == 0));
  while( true ) {
    if ((bVar1 >> 1 & 1) == 0) {
      do {
        (**(code **)(*plVar4 + 0x38))(plVar4,param_1,param_2);
        plVar4 = (long *)plVar4[1];
      } while (plVar4 != (long *)0x0);
      return;
    }
    plVar4 = (long *)plVar4[1];
    if (plVar4 == (long *)0x0) break;
    bVar1 = *(byte *)((long)plVar4 + 0x24);
  }
  return;
}

