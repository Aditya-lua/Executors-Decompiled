/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0cfe8
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_00c0cfe8(undefined8 *param_1)

{
  byte bVar1;
  bool bVar2;
  long lVar3;
  long lVar4;
  
  if ((*(byte *)(param_1 + 0x82) & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 0x7f);
  }
  else {
    operator_delete((void *)param_1[0x84],(param_1[0x82] & 0x3ffffffffffffffe) << 2);
    bVar1 = *(byte *)(param_1 + 0x7f);
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 0x7c);
  }
  else {
    operator_delete((void *)param_1[0x81],(param_1[0x7f] & 0x3ffffffffffffffe) << 2);
    bVar1 = *(byte *)(param_1 + 0x7c);
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 0x79);
  }
  else {
    operator_delete((void *)param_1[0x7e],(param_1[0x7c] & 0x3ffffffffffffffe) << 2);
    bVar1 = *(byte *)(param_1 + 0x79);
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 0x76);
  }
  else {
    operator_delete((void *)param_1[0x7b],(param_1[0x79] & 0x3ffffffffffffffe) << 2);
    bVar1 = *(byte *)(param_1 + 0x76);
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 0x73);
  }
  else {
    operator_delete((void *)param_1[0x78],(param_1[0x76] & 0x3ffffffffffffffe) << 2);
    bVar1 = *(byte *)(param_1 + 0x73);
  }
  if ((bVar1 & 1) != 0) {
    operator_delete((void *)param_1[0x75],(param_1[0x73] & 0x3ffffffffffffffe) << 2);
  }
  lVar3 = 0x240;
  do {
    if ((*(byte *)((long)param_1 + lVar3 + 0x140) & 1) != 0) {
      operator_delete(*(void **)((long)param_1 + lVar3 + 0x150),
                      (*(ulong *)((long)param_1 + lVar3 + 0x140) & 0x3ffffffffffffffe) << 2);
    }
    lVar3 = lVar3 + -0x18;
    lVar4 = 0;
  } while (lVar3 != 0);
  do {
    if ((*(byte *)((long)param_1 + lVar4 + 0x140) & 1) != 0) {
      operator_delete(*(void **)((long)param_1 + lVar4 + 0x150),
                      (*(ulong *)((long)param_1 + lVar4 + 0x140) & 0x3ffffffffffffffe) << 2);
    }
    bVar2 = lVar4 != -0x138;
    lVar4 = lVar4 + -0x18;
  } while (bVar2);
                    /* try { // try from 00c0d0a8 to 00c0d0ab has its CatchHandler @ 00c0d14c */
  freelocale((__locale_t)*param_1);
  return;
}

