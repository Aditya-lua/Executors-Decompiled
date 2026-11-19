/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009217c4
 */

undefined8 * curl_easy_nextheader(long param_1,byte param_2,int param_3,long param_4)

{
  int iVar1;
  byte bVar2;
  bool bVar3;
  int iVar4;
  long *plVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  long lVar10;
  undefined8 uVar11;
  
  if (*(int *)(param_1 + 0xcd0) < param_3) {
    return (undefined8 *)0x0;
  }
  iVar1 = *(int *)(param_1 + 0xcd0);
  if (param_3 != -1) {
    iVar1 = param_3;
  }
  if (param_4 == 0) {
    plVar5 = *(long **)(param_1 + 0x1208);
  }
  else {
    if (*(long *)(param_4 + 0x28) == 0) {
      return (undefined8 *)0x0;
    }
    plVar5 = *(long **)(*(long *)(param_4 + 0x28) + 0x10);
  }
  while( true ) {
    if (plVar5 == (long *)0x0) {
      return (undefined8 *)0x0;
    }
    lVar6 = *plVar5;
    bVar2 = *(byte *)(lVar6 + 0x2c);
    if (((bVar2 & param_2) != 0) && (*(int *)(lVar6 + 0x28) == iVar1)) break;
    plVar5 = (long *)plVar5[2];
  }
  plVar9 = *(long **)(param_1 + 0x1208);
  if (plVar9 == (long *)0x0) {
    lVar8 = 0;
    lVar10 = 0;
  }
  else {
    lVar8 = 0;
    lVar7 = 0;
    do {
      lVar10 = *plVar9;
      iVar4 = curl_strequal(*(undefined8 *)(lVar6 + 0x18),*(undefined8 *)(lVar10 + 0x18));
      if (((iVar4 != 0) && (*(int *)(lVar10 + 0x28) == iVar1)) &&
         ((*(byte *)(lVar10 + 0x2c) & param_2) != 0)) {
        lVar8 = lVar8 + 1;
      }
      bVar3 = plVar9 != plVar5;
      plVar9 = (long *)plVar9[2];
      lVar10 = lVar8 + -1;
      if (bVar3) {
        lVar10 = lVar7;
      }
      lVar7 = lVar10;
    } while (plVar9 != (long *)0x0);
    bVar2 = *(byte *)(lVar6 + 0x2c);
  }
  uVar11 = *(undefined8 *)(lVar6 + 0x18);
  *(undefined8 *)(param_1 + 0x1260) = *(undefined8 *)(lVar6 + 0x20);
  *(undefined8 *)(param_1 + 0x1258) = uVar11;
  *(long *)(param_1 + 0x1268) = lVar8;
  *(long *)(param_1 + 0x1270) = lVar10;
  *(uint *)(param_1 + 0x1278) = bVar2 | 0x8000000;
  *(long **)(param_1 + 0x1280) = plVar5;
  return (undefined8 *)(param_1 + 0x1258);
}

