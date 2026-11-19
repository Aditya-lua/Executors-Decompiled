/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00934ad0
 */

undefined8 FUN_00934ad0(undefined8 *param_1,undefined4 param_2,undefined2 param_3)

{
  undefined4 *puVar1;
  int iVar2;
  byte bVar3;
  uint uVar4;
  void *__dest;
  
  uVar4 = *(uint *)(param_1 + 1);
  if (uVar4 < *(uint *)((long)param_1 + 0xc)) {
    __dest = (void *)*param_1;
  }
  else {
    iVar2 = *(uint *)((long)param_1 + 0xc) + 100;
    __dest = (void *)(*(code *)PTR_calloc_00cc4690)(iVar2,8);
    if (__dest == (void *)0x0) {
      return 0x1b;
    }
    memcpy(__dest,(void *)*param_1,(ulong)*(uint *)((long)param_1 + 0xc) << 3);
    bVar3 = *(byte *)(param_1 + 2);
    if ((bVar3 & 1) != 0) {
      (*(code *)PTR_free_00cc4678)(*param_1);
      bVar3 = *(byte *)(param_1 + 2);
    }
    uVar4 = *(uint *)(param_1 + 1);
    *param_1 = __dest;
    *(int *)((long)param_1 + 0xc) = iVar2;
    *(byte *)(param_1 + 2) = bVar3 | 1;
  }
  puVar1 = (undefined4 *)((long)__dest + (ulong)uVar4 * 8);
  *puVar1 = param_2;
  *(undefined2 *)(puVar1 + 1) = param_3;
  *(uint *)(param_1 + 1) = uVar4 + 1;
  return 0;
}

