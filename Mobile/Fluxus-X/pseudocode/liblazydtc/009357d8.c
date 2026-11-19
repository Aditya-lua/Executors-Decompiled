/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009357d8
 */

undefined4 FUN_009357d8(long param_1,undefined8 param_2)

{
  byte bVar1;
  undefined4 uVar2;
  undefined8 *puVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  puVar3 = (undefined8 *)(*(code *)PTR_calloc_00cc4690)(1,0x48);
  if (puVar3 == (undefined8 *)0x0) {
    (*(code *)PTR_free_00cc4678)();
    uVar2 = 0x1b;
    if (param_1 == 0) {
      return 0x1b;
    }
    bVar1 = *(byte *)(param_1 + 0xa85);
  }
  else {
    puVar3[2] = puVar3;
    *puVar3 = &PTR_s_cr_in_00c4fa98;
    *(undefined4 *)(puVar3 + 3) = 4;
    uVar6 = *(undefined8 *)(param_1 + 0x1168);
    uVar5 = *(undefined8 *)(param_1 + 0x1160);
    puVar3[6] = param_2;
    puVar3[7] = 0;
    puVar3[5] = uVar6;
    puVar3[4] = uVar5;
    plVar4 = *(long **)(param_1 + 0x138);
    while (plVar4 != (long *)0x0) {
      *(long *)(param_1 + 0x138) = plVar4[1];
      (**(code **)(*plVar4 + 0x18))(param_1,plVar4);
      (*(code *)PTR_free_00cc4678)(plVar4);
      plVar4 = *(long **)(param_1 + 0x138);
    }
    uVar2 = FUN_00935924(param_1,puVar3);
    bVar1 = *(byte *)(param_1 + 0xa85);
  }
  if (((bVar1 >> 4 & 1) != 0) &&
     (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
      (0 < DAT_00cc46a0)))) {
    FUN_00904f80(param_1,"add fread reader, len=%ld -> %d",param_2,uVar2);
  }
  return uVar2;
}

