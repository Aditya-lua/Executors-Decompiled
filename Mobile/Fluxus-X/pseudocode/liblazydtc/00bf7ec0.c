/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf7ec0
 */

void FUN_00bf7ec0(undefined8 *param_1,undefined8 *param_2,long param_3,uint param_4)

{
  size_t __n;
  size_t sVar1;
  char *pcVar2;
  void *__s1;
  void *__s2;
  byte bVar3;
  byte bVar4;
  bool bVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  ulong uVar10;
  long lVar9;
  size_t sVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  *param_1 = &PTR_FUN_00cad530;
  param_1[1] = 0xffffffffffffffff;
  param_1[0x23] = 1;
  param_1[6] = 0;
  param_1[5] = 0;
  param_1[2] = param_1 + 5;
  param_1[8] = 0;
  param_1[7] = 0;
  param_1[10] = 0;
  param_1[9] = 0;
  param_1[0xc] = 0;
  param_1[0xb] = 0;
  param_1[0xe] = 0;
  param_1[0xd] = 0;
  param_1[0x10] = 0;
  param_1[0xf] = 0;
  param_1[0x12] = 0;
  param_1[0x11] = 0;
  param_1[0x14] = 0;
  param_1[0x13] = 0;
  param_1[0x16] = 0;
  param_1[0x15] = 0;
  param_1[0x18] = 0;
  param_1[0x17] = 0;
  param_1[0x1a] = 0;
  param_1[0x19] = 0;
  param_1[0x1c] = 0;
  param_1[0x1b] = 0;
  param_1[0x1e] = 0;
  param_1[0x1d] = 0;
  param_1[0x20] = 0;
  param_1[0x1f] = 0;
  param_1[0x22] = 0;
  param_1[0x21] = 0;
  param_1[3] = param_1 + 0x23;
  param_1[4] = param_1 + 0x23;
  bVar3 = *(byte *)(param_2 + 0x24);
  sVar11 = param_2[0x25];
  __n = (ulong)(bVar3 >> 1);
  if ((bVar3 & 1) != 0) {
    __n = sVar11;
  }
  if (__n == 1) {
    pcVar2 = (char *)((long)param_2 + 0x121);
    if ((bVar3 & 1) != 0) {
      pcVar2 = (char *)param_2[0x26];
    }
    if (*pcVar2 != '*') goto LAB_00bf7f8c;
  }
  else {
LAB_00bf7f8c:
    bVar4 = *(byte *)(param_3 + 0x120);
    sVar1 = (ulong)(bVar4 >> 1);
    if ((bVar4 & 1) != 0) {
      sVar1 = *(size_t *)(param_3 + 0x128);
    }
    if (sVar1 == 1) {
      pcVar2 = (char *)(param_3 + 0x121);
      if ((bVar4 & 1) != 0) {
        pcVar2 = *(char **)(param_3 + 0x130);
      }
      if (*pcVar2 == '*') goto LAB_00bf8008;
    }
    if (param_4 == 0) {
LAB_00bf8218:
      if ((bVar3 & 1) == 0) {
        uVar14 = param_2[0x25];
        uVar13 = param_2[0x24];
        param_1[0x26] = param_2[0x26];
        param_1[0x25] = uVar14;
        param_1[0x24] = uVar13;
      }
      else {
                    /* try { // try from 00bf8234 to 00bf824b has its CatchHandler @ 00bf8250 */
        FUN_007ff40c(param_1 + 0x24,param_2[0x26],sVar11);
      }
      goto LAB_00bf8014;
    }
    if (__n == sVar1) {
      __s1 = (void *)((long)param_2 + 0x121);
      if ((bVar3 & 1) != 0) {
        __s1 = (void *)param_2[0x26];
      }
      __s2 = (void *)(param_3 + 0x121);
      if ((bVar4 & 1) != 0) {
        __s2 = *(void **)(param_3 + 0x130);
      }
      iVar6 = memcmp(__s1,__s2,__n);
      if (iVar6 == 0) goto LAB_00bf8218;
    }
  }
LAB_00bf8008:
  *(undefined1 *)((long)param_1 + 0x122) = 0;
  *(undefined2 *)(param_1 + 0x24) = 0x2a02;
LAB_00bf8014:
  if (param_1 != param_2) {
                    /* try { // try from 00bf8028 to 00bf8033 has its CatchHandler @ 00bf8258 */
    FUN_00c0b578(param_1 + 2,param_2[2],param_2[3],(long)(param_2[3] - param_2[2]) >> 3);
  }
  lVar8 = param_1[2];
  lVar7 = param_1[3];
  if (lVar7 != lVar8) {
    uVar10 = 0;
    uVar12 = 1;
    do {
      lVar9 = *(long *)(lVar8 + uVar10 * 8);
      if (lVar9 != 0) {
        FUN_00c2bce0(1,lVar9 + 8);
        lVar8 = param_1[2];
        lVar7 = param_1[3];
      }
      bVar5 = uVar12 < (ulong)(lVar7 - lVar8 >> 3);
      uVar10 = uVar12;
      uVar12 = (ulong)((int)uVar12 + 1);
    } while (bVar5);
  }
  if ((param_4 >> 3 & 1) != 0) {
                    /* try { // try from 00bf8080 to 00bf81fb has its CatchHandler @ 00bf8260 */
    FUN_00bf8300(param_1,param_3);
    FUN_00bf8444(param_1,param_3);
  }
  if ((param_4 & 1) != 0) {
    FUN_00bf8588(param_1,param_3);
    FUN_00bf86cc(param_1,param_3);
    FUN_00bf8810(param_1,param_3);
    FUN_00bf8954(param_1,param_3);
    FUN_00bf8a98(param_1,param_3);
    FUN_00bf8bdc(param_1,param_3);
    FUN_00bf8d20(param_1,param_3);
    FUN_00bf8e64(param_1,param_3);
  }
  if ((param_4 >> 4 & 1) != 0) {
    FUN_00bf8fa8(param_1,param_3);
    FUN_00bf90ec(param_1,param_3);
    FUN_00bf9230(param_1,param_3);
    FUN_00bf9374(param_1,param_3);
    FUN_00bf94b8(param_1,param_3);
    FUN_00bf95fc(param_1,param_3);
    FUN_00bf9740(param_1,param_3);
    FUN_00bf9884(param_1,param_3);
  }
  if ((param_4 >> 1 & 1) != 0) {
    FUN_00bf99c8(param_1,param_3);
    FUN_00bf9b0c(param_1,param_3);
    FUN_00bf9c50(param_1,param_3);
    FUN_00bf9d94(param_1,param_3);
    FUN_00bf9ed8(param_1,param_3);
    FUN_00bfa01c(param_1,param_3);
  }
  if ((param_4 >> 2 & 1) != 0) {
    FUN_00bfa160(param_1,param_3);
    FUN_00bfa2a4(param_1,param_3);
    FUN_00bfa3e8(param_1,param_3);
    FUN_00bfa52c(param_1,param_3);
  }
  if ((param_4 >> 5 & 1) != 0) {
    FUN_00bfa670(param_1,param_3);
    FUN_00bfa7b4(param_1,param_3);
  }
  return;
}

