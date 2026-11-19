/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fe7b8
 */

undefined8
FUN_009fe7b8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            ulong param_5,uint param_6,int param_7,uint param_8,uint param_9)

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  char *pcVar4;
  char cVar5;
  ulong uVar6;
  long lVar7;
  size_t sVar8;
  undefined8 uVar9;
  long lVar10;
  uint uVar11;
  ulong uVar12;
  ulong uVar13;
  int iVar14;
  char *__s;
  uint uVar15;
  undefined4 local_80;
  char local_7c [28];
  
  if ((param_9 >> 6 & 1) == 0) {
    if ((long)param_5 < 0) {
      param_5 = -param_5;
      iVar14 = 0x2d;
    }
    else if ((param_9 >> 1 & 1) == 0) {
      iVar14 = (param_9 & 4) << 3;
    }
    else {
      iVar14 = 0x2b;
    }
  }
  else {
    iVar14 = 0;
  }
  __s = "";
  if ((param_9 >> 3 & 1) != 0) {
    pcVar4 = "0";
    if (param_6 != 8) {
      pcVar4 = "";
    }
    __s = "0x";
    if (param_6 != 0x10) {
      __s = pcVar4;
    }
  }
  uVar12 = 0;
  param_8 = param_8 & ((int)param_8 >> 0x1f ^ 0xffffffffU);
  uVar13 = (ulong)param_6;
  pcVar4 = "0123456789abcdef";
  if ((param_9 & 0x20) != 0) {
    pcVar4 = "0123456789ABCDEF";
  }
  do {
    uVar6 = 0;
    if (uVar13 != 0) {
      uVar6 = param_5 / uVar13;
    }
    local_7c[uVar12] = pcVar4[param_5 - uVar6 * uVar13];
    uVar12 = uVar12 + 1;
  } while ((uVar13 <= param_5) && (param_5 = uVar6, uVar12 < 0x1a));
  uVar11 = (uint)uVar12;
  uVar3 = uVar11 - 1;
  if (uVar11 != 0x1a) {
    uVar3 = uVar11;
  }
  uVar11 = uVar3;
  if ((int)uVar3 <= (int)param_8) {
    uVar11 = param_8;
  }
  local_7c[uVar3] = '\0';
  local_80 = param_7;
  sVar8 = strlen(__s);
  uVar2 = param_8 - uVar3 & ((int)(param_8 - uVar3) >> 0x1f ^ 0xffffffffU);
  uVar11 = ((local_80 - (uint)(iVar14 != 0)) - uVar11) - (int)sVar8;
  uVar11 = uVar11 & ((int)uVar11 >> 0x1f ^ 0xffffffffU);
  uVar15 = uVar11;
  if ((int)uVar11 <= (int)uVar2) {
    uVar15 = uVar2;
  }
  if ((param_9 & 0x10) != 0) {
    uVar11 = 0;
    uVar2 = uVar15;
  }
  uVar15 = -uVar11;
  if ((param_9 & 1) == 0) {
    uVar15 = uVar11;
  }
  uVar11 = uVar15;
  if (0 < (int)uVar15) {
    do {
      uVar9 = FUN_009fe654(param_1,param_2,param_3,param_4,0x20);
      if ((int)uVar9 == 0) {
        return uVar9;
      }
      uVar15 = uVar11 - 1;
      bVar1 = 0 < (int)uVar11;
      uVar11 = uVar15;
    } while (uVar15 != 0 && bVar1);
  }
  if ((iVar14 != 0) && (uVar9 = FUN_009fe654(param_1,param_2,param_3,param_4), (int)uVar9 == 0)) {
    return uVar9;
  }
  cVar5 = *__s;
  while (cVar5 != '\0') {
    __s = __s + 1;
    uVar9 = FUN_009fe654(param_1,param_2,param_3,param_4,cVar5);
    if ((int)uVar9 == 0) {
      return uVar9;
    }
    cVar5 = *__s;
  }
  if (0 < (int)uVar2) {
    iVar14 = uVar2 + 1;
    do {
      uVar9 = FUN_009fe654(param_1,param_2,param_3,param_4,0x30);
      if ((int)uVar9 == 0) {
        return uVar9;
      }
      iVar14 = iVar14 + -1;
    } while (1 < iVar14);
  }
  lVar10 = (long)(int)uVar3;
  do {
    if (lVar10 < 1) {
      if (-1 < (int)uVar15) {
        return 1;
      }
      iVar14 = uVar15 - 1;
      do {
        uVar9 = FUN_009fe654(param_1,param_2,param_3,param_4,0x20);
        if ((int)uVar9 == 0) {
          return uVar9;
        }
        iVar14 = iVar14 + 1;
      } while (iVar14 < -1);
      return 1;
    }
    lVar7 = lVar10 + -1;
    lVar10 = lVar10 + -1;
    uVar9 = FUN_009fe654(param_1,param_2,param_3,param_4,local_7c[lVar7]);
  } while ((int)uVar9 != 0);
  return uVar9;
}

