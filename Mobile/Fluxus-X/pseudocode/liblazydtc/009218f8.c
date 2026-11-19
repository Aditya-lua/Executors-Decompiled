/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009218f8
 */

undefined8 FUN_009218f8(long param_1,char *param_2,char param_3)

{
  byte *__dest;
  byte *pbVar1;
  byte bVar2;
  char *pcVar3;
  size_t sVar4;
  long lVar5;
  byte *pbVar7;
  byte *pbVar6;
  char *pcVar8;
  ulong __n;
  long lVar9;
  char cVar10;
  
  cVar10 = *param_2;
  if (cVar10 == '\n') {
    return 0;
  }
  if (cVar10 == '\r') {
    return 0;
  }
  pcVar3 = strchr(param_2,0xd);
  if ((pcVar3 == (char *)0x0) && (pcVar3 = strchr(param_2,10), pcVar3 == (char *)0x0)) {
    return 8;
  }
  __n = (long)pcVar3 - (long)param_2;
  if ((cVar10 == ' ') || (cVar10 == '\t')) {
    lVar9 = *(long *)(param_1 + 0x1288);
    if (lVar9 != 0) {
      pcVar3 = *(char **)(lVar9 + 0x20);
      sVar4 = strlen(pcVar3);
      for (; __n != 0; __n = __n - 1) {
        bVar2 = param_2[__n - 1];
        if (((bVar2 != 9) && (bVar2 != 0x20)) && (3 < bVar2 - 10)) {
          if (1 < __n) {
            pcVar8 = param_2;
            goto LAB_00921b90;
          }
          __n = 1;
          break;
        }
      }
      goto LAB_009219b8;
    }
    if (__n == 0) {
      return 8;
    }
    while ((cVar10 == ' ' || (cVar10 == '\t'))) {
      __n = __n - 1;
      if (__n == 0) {
        return 8;
      }
      param_2 = param_2 + 1;
      cVar10 = *param_2;
    }
  }
  lVar5 = (*(code *)PTR_calloc_00cc4690)(1,__n + 0x30);
  if (lVar5 == 0) {
    return 0x1b;
  }
  __dest = (byte *)(lVar5 + 0x2d);
  memcpy(__dest,param_2,__n);
  pbVar1 = __dest + __n;
  *pbVar1 = 0;
  pbVar6 = __dest;
  if (param_3 == '\x10') {
    if (*__dest != 0x3a) goto LAB_00921b54;
    pbVar6 = (byte *)(lVar5 + 0x2e);
  }
  do {
    pbVar7 = pbVar6;
    pbVar6 = pbVar7 + 1;
    bVar2 = *pbVar7;
  } while ((bVar2 == 0) != (bVar2 != 0x3a));
  if (bVar2 == 0) {
LAB_00921b54:
    (*(code *)PTR_free_00cc4678)(lVar5);
    return 0x2b;
  }
  *pbVar7 = 0;
  for (; (*pbVar6 == 0x20 || (*pbVar6 == 9)); pbVar6 = pbVar6 + 1) {
  }
  while ((pbVar1 = pbVar1 + -1, pbVar6 < pbVar1 &&
         (((bVar2 = *pbVar1, bVar2 == 9 || (bVar2 == 0x20)) || (bVar2 - 10 < 4))))) {
    *pbVar1 = 0;
  }
  *(byte **)(lVar5 + 0x18) = __dest;
  *(byte **)(lVar5 + 0x20) = pbVar6;
  *(char *)(lVar5 + 0x2c) = param_3;
  *(undefined4 *)(lVar5 + 0x28) = *(undefined4 *)(param_1 + 0xcd0);
  goto LAB_00921b34;
  while( true ) {
    param_2 = pcVar8 + 1;
    cVar10 = *param_2;
    if ((cVar10 != ' ') && (cVar10 != '\t')) goto LAB_00921bd8;
    __n = __n - 1;
    pcVar8 = param_2;
    if (__n < 2) break;
LAB_00921b90:
    if ((cVar10 != ' ') && (cVar10 != '\t')) {
LAB_00921bd8:
      param_2 = pcVar8;
      break;
    }
  }
LAB_009219b8:
  FUN_00925d80(param_1 + 0x1208,lVar9,0);
  lVar5 = FUN_009419a4(lVar9,pcVar3 + ((__n + sVar4) - (lVar9 + 0x2d)) + 0x32);
  if (lVar5 == 0) {
    return 0x1b;
  }
  *(long *)(lVar5 + 0x18) = lVar5 + 0x2d;
  *(char **)(lVar5 + 0x20) = pcVar3 + ((lVar5 + 0x2d) - (lVar9 + 0x2d));
  memcpy(pcVar3 + ((lVar5 + 0x2d) - (lVar9 + 0x2d)) + sVar4,param_2,__n);
  *(undefined1 *)(*(long *)(lVar5 + 0x20) + __n + sVar4) = 0;
LAB_00921b34:
  FUN_00925d10(param_1 + 0x1208,lVar5,lVar5);
  *(long *)(param_1 + 0x1288) = lVar5;
  return 0;
}

