/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009280cc
 */

long FUN_009280cc(long param_1)

{
  char cVar1;
  int iVar2;
  long lVar3;
  size_t sVar4;
  char *pcVar5;
  long lVar6;
  long lVar7;
  undefined8 *puVar8;
  long lVar9;
  
  if (*(int *)(param_1 + 0x10) == 4) {
    if (*(long *)(param_1 + 0x38) == 0) {
      lVar6 = 0;
    }
    else {
      lVar7 = *(long *)(*(long *)(param_1 + 0x38) + 8);
      if (lVar7 == 0) {
        lVar6 = 0x34;
      }
      else {
        lVar6 = 0x34;
        do {
          lVar3 = FUN_009280cc(lVar7);
          lVar7 = *(long *)(lVar7 + 8);
          lVar9 = lVar3;
          if (-1 < lVar3) {
            lVar9 = lVar6;
          }
          lVar6 = (lVar3 + 0x34U & (lVar9 >> 0x3f ^ 0xffffffffffffffffU)) + lVar9;
        } while (lVar7 != 0);
      }
    }
    *(long *)(param_1 + 0x70) = lVar6;
    lVar7 = *(long *)(param_1 + 0x90);
  }
  else {
    lVar6 = *(long *)(param_1 + 0x70);
    lVar7 = *(long *)(param_1 + 0x90);
  }
  if (lVar7 != 0) {
    lVar6 = (**(code **)(lVar7 + 0x10))(param_1);
  }
  if (lVar6 < 0) {
    return lVar6;
  }
  if ((*(byte *)(param_1 + 0x14) >> 1 & 1) != 0) {
    return lVar6;
  }
  puVar8 = *(undefined8 **)(param_1 + 0x48);
  if (puVar8 == (undefined8 *)0x0) {
    lVar7 = 0;
    puVar8 = *(undefined8 **)(param_1 + 0x50);
  }
  else {
    lVar7 = 0;
    do {
      sVar4 = strlen((char *)*puVar8);
      puVar8 = (undefined8 *)puVar8[1];
      lVar7 = lVar7 + sVar4 + 2;
    } while (puVar8 != (undefined8 *)0x0);
    puVar8 = *(undefined8 **)(param_1 + 0x50);
  }
  if (puVar8 == (undefined8 *)0x0) {
    lVar9 = 0;
  }
  else {
    lVar9 = 0;
    do {
      while( true ) {
        iVar2 = curl_strnequal(*puVar8,"Content-Type",0xc);
        pcVar5 = (char *)*puVar8;
        if ((iVar2 == 0) || (pcVar5[0xc] != ':')) break;
        pcVar5 = pcVar5 + 0xd;
        do {
          cVar1 = *pcVar5;
          pcVar5 = pcVar5 + 1;
        } while (cVar1 == ' ');
        puVar8 = (undefined8 *)puVar8[1];
        if (puVar8 == (undefined8 *)0x0) goto LAB_00928214;
      }
      sVar4 = strlen(pcVar5);
      lVar9 = lVar9 + sVar4 + 2;
      puVar8 = (undefined8 *)puVar8[1];
    } while (puVar8 != (undefined8 *)0x0);
  }
LAB_00928214:
  return lVar6 + lVar7 + lVar9 + 2;
}

