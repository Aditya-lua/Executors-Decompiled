/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091fbe8
 */

undefined8 FUN_0091fbe8(char *param_1,long param_2,long *param_3)

{
  long lVar1;
  byte bVar2;
  byte bVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  byte *pbVar7;
  
  lVar6 = param_2 + -10;
  if (param_2 < 10) {
    return 2;
  }
  if (*param_1 != '\x1f') {
    return 1;
  }
  if (param_1[1] != -0x75) {
    return 1;
  }
  uVar4 = 1;
  if ((param_1[2] == '\b') && (bVar3 = param_1[3], (bVar3 & 0xe0) == 0)) {
    pbVar7 = (byte *)(param_1 + 10);
    lVar5 = lVar6;
    if ((bVar3 >> 2 & 1) != 0) {
      if (param_2 < 0xc) {
        return 2;
      }
      lVar1 = (ulong)*(ushort *)(param_1 + 10) + 2;
      lVar5 = lVar6 - lVar1;
      if (lVar6 < lVar1) {
        return 2;
      }
      pbVar7 = pbVar7 + lVar1;
    }
    bVar2 = bVar3 >> 3 & 1;
    while (bVar2 != 0) {
      if (lVar5 == 0) {
        return 2;
      }
      lVar5 = lVar5 + -1;
      bVar2 = *pbVar7;
      pbVar7 = pbVar7 + 1;
    }
    if ((bVar3 >> 4 & 1) == 0) {
LAB_0091fcd4:
      lVar6 = lVar5;
      if (((bVar3 >> 1 & 1) != 0) && (lVar6 = lVar5 + -2, lVar5 < 2)) {
        return 2;
      }
      uVar4 = 0;
      *param_3 = param_2 - lVar6;
    }
    else {
      if (lVar5 == 0) {
        return 2;
      }
      lVar5 = 1 - lVar5;
      uVar4 = 2;
      do {
        if (*pbVar7 == 0) {
          lVar5 = -lVar5;
          goto LAB_0091fcd4;
        }
        lVar5 = lVar5 + 1;
        pbVar7 = pbVar7 + 1;
      } while (lVar5 != 1);
    }
  }
  return uVar4;
}

