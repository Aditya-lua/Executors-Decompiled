/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009244cc
 */

undefined8 * FUN_009244cc(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  long *plVar4;
  
  puVar1 = (undefined8 *)param_1[1];
  if ((puVar1 != (undefined8 *)0x0) && ((ulong)puVar1[3] < (ulong)puVar1[1])) {
    return puVar1;
  }
  puVar1 = (undefined8 *)param_1[2];
  if (puVar1 == (undefined8 *)0x0) {
    if (((ulong)param_1[5] <= (ulong)param_1[4]) && ((*(byte *)(param_1 + 7) & 1) == 0)) {
      return (undefined8 *)0x0;
    }
    puVar2 = (undefined8 *)param_1[3];
    if (puVar2 == (undefined8 *)0x0) {
      plVar4 = param_1 + 6;
      lVar3 = *plVar4;
    }
    else {
      puVar1 = (undefined8 *)*puVar2;
      if (puVar1 != (undefined8 *)0x0) {
        *puVar2 = *puVar1;
        puVar2[2] = puVar2[2] + -1;
        *puVar1 = 0;
        puVar1[2] = 0;
        puVar1[3] = 0;
        param_1[4] = param_1[4] + 1;
        puVar2 = (undefined8 *)param_1[1];
        goto joined_r0x00924570;
      }
      plVar4 = puVar2 + 1;
      lVar3 = *plVar4;
    }
    puVar1 = (undefined8 *)(*(code *)PTR_calloc_00cc4690)(1,lVar3 + 0x28);
    if (puVar1 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    puVar1[1] = *plVar4;
    param_1[4] = param_1[4] + 1;
    if (puVar1 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
  }
  else {
    param_1[2] = *puVar1;
    *puVar1 = 0;
    puVar1[2] = 0;
    puVar1[3] = 0;
  }
  puVar2 = (undefined8 *)param_1[1];
joined_r0x00924570:
  if (puVar2 == (undefined8 *)0x0) {
    *param_1 = puVar1;
  }
  else {
    *puVar2 = puVar1;
  }
  param_1[1] = puVar1;
  return puVar1;
}

