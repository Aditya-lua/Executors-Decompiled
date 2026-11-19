/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008422f0
 */

void FUN_008422f0(long param_1,char *param_2,char *param_3)

{
  char *pcVar1;
  char *pcVar2;
  undefined8 *puVar3;
  char *pcVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  long lVar10;
  
  lVar10 = *(long *)(param_1 + 0x38);
  pcVar2 = param_2;
  do {
    pcVar4 = pcVar2;
    pcVar2 = (char *)FUN_00842ccc(param_1,pcVar4,param_3);
  } while (pcVar2 != pcVar4);
  if (pcVar4 == param_2) {
    puVar3 = operator_new(0x10);
    lVar7 = *(long *)(param_1 + 0x38);
    *(undefined8 **)(param_1 + 0x38) = puVar3;
    uVar9 = *(undefined8 *)(lVar7 + 8);
    *puVar3 = &PTR_LAB_00c48b00;
    puVar3[1] = uVar9;
    *(undefined8 **)(lVar7 + 8) = puVar3;
  }
  while ((pcVar4 != param_3 && (*pcVar2 == '|'))) {
    lVar7 = *(long *)(param_1 + 0x38);
    pcVar1 = pcVar2 + 1;
    pcVar2 = pcVar1;
    do {
      pcVar4 = pcVar2;
      pcVar2 = (char *)FUN_00842ccc(param_1,pcVar4,param_3);
    } while (pcVar2 != pcVar4);
    if (pcVar4 == pcVar1) {
      puVar3 = operator_new(0x10);
      lVar6 = *(long *)(param_1 + 0x38);
      *(undefined8 **)(param_1 + 0x38) = puVar3;
      *puVar3 = &PTR_LAB_00c48b00;
      puVar3[1] = *(undefined8 *)(lVar6 + 8);
      *(undefined8 **)(lVar6 + 8) = puVar3;
    }
    else {
      puVar3 = *(undefined8 **)(param_1 + 0x38);
    }
    puVar5 = operator_new(0x18);
    uVar9 = *(undefined8 *)(lVar7 + 8);
    uVar8 = *(undefined8 *)(lVar10 + 8);
    *puVar5 = &PTR_LAB_00c49070;
    puVar5[1] = uVar8;
    puVar5[2] = uVar9;
    *(undefined8 **)(lVar10 + 8) = puVar5;
    *(undefined8 *)(lVar7 + 8) = 0;
    puVar5 = operator_new(0x10);
    uVar9 = puVar3[1];
    *puVar5 = &PTR_LAB_00c48b00;
    puVar5[1] = uVar9;
    *(undefined8 **)(lVar7 + 8) = puVar5;
    puVar3[1] = 0;
    puVar5 = operator_new(0x10);
    uVar9 = *(undefined8 *)(lVar7 + 8);
    *puVar5 = &PTR_LAB_00c490b8;
    puVar5[1] = uVar9;
    puVar3[1] = puVar5;
    *(undefined8 *)(param_1 + 0x38) = *(undefined8 *)(lVar7 + 8);
  }
  return;
}

