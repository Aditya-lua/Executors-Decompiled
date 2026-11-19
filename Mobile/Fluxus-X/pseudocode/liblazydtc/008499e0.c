/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008499e0
 */

void FUN_008499e0(long param_1,undefined8 param_2,undefined8 param_3,long param_4,undefined4 param_5
                 ,undefined4 param_6,byte param_7)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  long lVar6;
  
  puVar2 = operator_new(0x10);
  lVar6 = *(long *)(param_1 + 0x38);
  uVar5 = *(undefined8 *)(lVar6 + 8);
  *puVar2 = &PTR_LAB_00c48b00;
  puVar2[1] = uVar5;
  *(undefined8 *)(lVar6 + 8) = 0;
                    /* try { // try from 00849a40 to 00849a47 has its CatchHandler @ 00849ae0 */
  puVar3 = operator_new(0x38);
  uVar5 = *(undefined8 *)(param_4 + 8);
  puVar3[2] = puVar2;
  puVar3[3] = param_2;
  iVar1 = *(int *)(param_1 + 0x20);
  puVar3[4] = param_3;
  *(int *)(puVar3 + 5) = iVar1;
  *(undefined4 *)((long)puVar3 + 0x2c) = param_5;
  *puVar3 = &PTR_LAB_00c48f98;
  puVar3[1] = uVar5;
  *(undefined4 *)(puVar3 + 6) = param_6;
  *(byte *)((long)puVar3 + 0x34) = param_7 & 1;
  *(undefined8 *)(param_4 + 8) = 0;
                    /* try { // try from 00849a80 to 00849a87 has its CatchHandler @ 00849acc */
  puVar4 = operator_new(0x10);
  *(undefined8 **)(param_1 + 0x38) = puVar2;
  puVar4[1] = puVar3;
  *(undefined8 **)(lVar6 + 8) = puVar4;
  *puVar4 = &PTR_LAB_00c49028;
  *(undefined8 **)(param_4 + 8) = puVar3;
  *(int *)(param_1 + 0x20) = iVar1 + 1;
  return;
}

