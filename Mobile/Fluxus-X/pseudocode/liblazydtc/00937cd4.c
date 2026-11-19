/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00937cd4
 */

undefined8 FUN_00937cd4(undefined8 *param_1,undefined8 *param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  
  (*(code *)PTR_free_00cc4678)(*param_1);
  *param_1 = 0;
  if (param_2 == (undefined8 *)0x0) {
    uVar2 = 0;
  }
  else if ((ulong)param_2[1] < 0x7a1201) {
    lVar1 = 0x18;
    if ((*(uint *)(param_2 + 2) & 1) != 0) {
      lVar1 = param_2[1] + 0x18;
    }
    puVar3 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(lVar1);
    if (puVar3 == (undefined8 *)0x0) {
      uVar2 = 0x1b;
    }
    else {
      puVar3[2] = param_2[2];
      uVar2 = *param_2;
      puVar3[1] = param_2[1];
      *puVar3 = uVar2;
      if ((*(byte *)(param_2 + 2) & 1) != 0) {
        *puVar3 = puVar3 + 3;
        memcpy(puVar3 + 3,(void *)*param_2,param_2[1]);
      }
      uVar2 = 0;
      *param_1 = puVar3;
    }
  }
  else {
    uVar2 = 0x2b;
  }
  return uVar2;
}

