/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00969a20
 */

void FUN_00969a20(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  
  plVar3 = *(long **)(param_1 + 0x10);
  lVar2 = plVar3[7];
  plVar3[7] = param_2;
  if (plVar3 == (long *)0x0) {
    lVar1 = 0;
  }
  else {
    (**(code **)(PTR_DAT_00cc4d08 + 0x80))(param_1);
    *(undefined4 *)(plVar3 + 10) = 0;
    if (plVar3[1] != *plVar3) {
      (*(code *)PTR_free_00cc4678)();
    }
    (*(code *)PTR_free_00cc4678)(plVar3[2]);
    (*(code *)PTR_free_00cc4678)(*plVar3);
    *(undefined4 *)(plVar3 + 3) = 0;
    plVar3[1] = 0;
    plVar3[2] = 0;
    *plVar3 = 0;
    lVar1 = *(long *)(param_1 + 0x10);
  }
  *(byte *)(param_1 + 0x24) = *(byte *)(param_1 + 0x24) & 0xfe;
  *(long *)(lVar1 + 0x38) = lVar2;
  lVar2 = *(long *)(param_1 + 0x10);
  if (lVar2 != 0) {
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar2 + 0x30));
    (*(code *)PTR_free_00cc4678)(lVar2);
  }
  *(undefined8 *)(param_1 + 0x10) = 0;
  return;
}

