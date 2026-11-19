/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009306fc
 */

void FUN_009306fc(long param_1,long *param_2)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  char *pcVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  
  lVar8 = *(long *)(param_1 + 0x1320);
  plVar7 = *(long **)(lVar8 + 0x30);
  lVar6 = *plVar7;
  lVar4 = FUN_00904974(param_2 + 0x13);
  *param_2 = lVar4 + *(long *)(lVar6 + 0x28);
  lVar1 = 0;
  if (*(long *)(lVar6 + 0x38) != 0) {
    lVar1 = lVar4 + *(long *)(lVar6 + 0x38);
  }
  param_2[10] = lVar1;
  lVar1 = 0;
  if (*(long *)(lVar6 + 0x48) != 0) {
    lVar1 = lVar4 + *(long *)(lVar6 + 0x48);
  }
  param_2[8] = lVar1;
  lVar1 = 0;
  if (*(long *)(lVar6 + 0x50) != 0) {
    lVar1 = lVar4 + *(long *)(lVar6 + 0x50);
  }
  param_2[0xb] = lVar1;
  param_2[7] = lVar4 + *(long *)(lVar6 + 0x40);
  lVar1 = 0;
  if (*(long *)(lVar6 + 0x30) != 0) {
    lVar1 = lVar4 + *(long *)(lVar6 + 0x30);
  }
  param_2[9] = lVar1;
  pcVar2 = (code *)&LAB_009308ac;
  if (*(code **)(param_1 + 0x9f8) != (code *)0x0) {
    pcVar2 = *(code **)(param_1 + 0x9f8);
  }
  FUN_0092f198(param_1,1);
  iVar3 = (*pcVar2)(*(undefined8 *)(param_1 + 0xa00),*(undefined8 *)(lVar8 + 8),*param_2);
  if (iVar3 == 0) {
    if (((int)param_2[1] == 2) && ((char *)param_2[0xb] != (char *)0x0)) {
      pcVar5 = strstr((char *)param_2[0xb]," -> ");
      FUN_0092f198(param_1,0);
      if (pcVar5 != (char *)0x0) goto LAB_009307d4;
    }
    else {
      FUN_0092f198(param_1,0);
    }
    FUN_00925d10(lVar8 + 0x10,param_2,param_2 + 0x10);
  }
  else {
    FUN_0092f198(param_1,0);
LAB_009307d4:
    FUN_00930868(param_2);
  }
  *(undefined8 *)(*plVar7 + 0x10) = 0;
  return;
}

