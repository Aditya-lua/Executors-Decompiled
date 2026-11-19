/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935d48
 */

undefined8 FUN_00935d48(long param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long *plVar3;
  
  puVar1 = (undefined8 *)(*(code *)PTR_calloc_00cc4690)(1,0x20);
  if (puVar1 == (undefined8 *)0x0) {
    (*(code *)PTR_free_00cc4678)();
    return 0x1b;
  }
  puVar1[2] = puVar1;
  *puVar1 = &PTR_s_cr_null_00c4faf8;
  *(undefined4 *)(puVar1 + 3) = 4;
  plVar3 = *(long **)(param_1 + 0x138);
  while (plVar3 != (long *)0x0) {
    *(long *)(param_1 + 0x138) = plVar3[1];
    (**(code **)(*plVar3 + 0x18))(param_1,plVar3);
    (*(code *)PTR_free_00cc4678)(plVar3);
    plVar3 = *(long **)(param_1 + 0x138);
  }
  uVar2 = FUN_00935924(param_1,puVar1);
  return uVar2;
}

