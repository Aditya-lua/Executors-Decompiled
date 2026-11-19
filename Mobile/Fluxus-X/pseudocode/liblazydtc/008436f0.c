/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008436f0
 */

void FUN_008436f0(long param_1,locale *param_2,byte param_3,undefined4 param_4)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  
  puVar1 = operator_new(0x58);
  uVar2 = *(undefined8 *)(*(long *)(param_1 + 0x38) + 8);
  *puVar1 = &PTR_LAB_00c48c80;
  puVar1[1] = uVar2;
  std::__ndk1::locale::locale((locale *)(puVar1 + 2),param_2);
  uVar2 = *(undefined8 *)(param_2 + 8);
  uVar5 = *(undefined8 *)(param_2 + 0x20);
  uVar4 = *(undefined8 *)(param_2 + 0x18);
  lVar3 = *(long *)(param_2 + 0x30);
  uVar7 = *(undefined8 *)(param_2 + 0x30);
  uVar6 = *(undefined8 *)(param_2 + 0x28);
  puVar1[4] = *(undefined8 *)(param_2 + 0x10);
  puVar1[3] = uVar2;
  puVar1[6] = uVar5;
  puVar1[5] = uVar4;
  puVar1[8] = uVar7;
  puVar1[7] = uVar6;
  if (lVar3 != 0) {
    FUN_00c2bce0(1,lVar3 + 8);
  }
  uVar2 = *(undefined8 *)(param_2 + 0x38);
  lVar3 = *(long *)(param_1 + 0x38);
  *(undefined4 *)(puVar1 + 10) = param_4;
  *(byte *)((long)puVar1 + 0x54) = param_3 & 1;
  puVar1[9] = uVar2;
  *(undefined8 **)(lVar3 + 8) = puVar1;
  *(undefined8 **)(param_1 + 0x38) = puVar1;
  return;
}

