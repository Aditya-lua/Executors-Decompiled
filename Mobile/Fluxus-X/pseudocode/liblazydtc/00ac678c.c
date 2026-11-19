/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac678c
 */

int ossl_property_match_count(int *param_1,int *param_2)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  bool bVar5;
  int iVar6;
  ulong uVar7;
  int iVar8;
  int *__s1;
  long lVar9;
  ulong uVar10;
  
  iVar4 = *param_1;
  if (iVar4 < 1) {
    return 0;
  }
  lVar9 = 0;
  uVar10 = 0;
  iVar8 = 0;
LAB_00ac67cc:
  uVar7 = uVar10 & 0xffffffff;
  do {
    uVar10 = (ulong)(int)uVar7;
    __s1 = param_1 + (long)(int)uVar7 * 6 + 6;
    while (iVar2 = __s1[-2], iVar2 == 2) {
      uVar10 = uVar10 + 1;
      __s1 = __s1 + 6;
      if ((long)iVar4 <= (long)uVar10) {
        return iVar8;
      }
    }
    if (lVar9 < *param_2) {
      iVar3 = __s1[-4];
      iVar6 = param_2[lVar9 * 6 + 2];
      if (iVar3 != iVar6 && iVar6 <= iVar3) goto LAB_00ac68dc;
      if (iVar3 == iVar6) break;
    }
    if (__s1[-3] == 0) {
      if (iVar2 == 1) {
        if (*__s1 == 2) goto LAB_00ac6854;
        goto LAB_00ac686c;
      }
      if ((iVar2 != 0) || (*__s1 == 2)) goto LAB_00ac686c;
LAB_00ac6854:
      if ((*(byte *)(__s1 + -1) & 1) == 0) {
        return -1;
      }
    }
    else {
      if ((__s1[-3] != 2) || (iVar2 != 1)) goto LAB_00ac6854;
LAB_00ac686c:
      iVar8 = iVar8 + 1;
    }
    uVar1 = (int)uVar10 + 1;
    uVar7 = (ulong)uVar1;
    if (iVar4 <= (int)uVar1) {
      return iVar8;
    }
  } while( true );
  bVar5 = false;
  if (__s1[-3] == param_2[lVar9 * 6 + 3]) {
    iVar6 = memcmp(__s1,param_2 + lVar9 * 6 + 6,8);
    bVar5 = iVar6 == 0;
    if (iVar6 != 0 || iVar2 != 0) goto LAB_00ac68bc;
  }
  else {
LAB_00ac68bc:
    if ((iVar2 != 1) || (bVar5)) {
      if ((*(byte *)(__s1 + -1) & 1) == 0) {
        return -1;
      }
      goto LAB_00ac68d8;
    }
  }
  iVar8 = iVar8 + 1;
LAB_00ac68d8:
  uVar10 = (ulong)((int)uVar10 + 1);
LAB_00ac68dc:
  lVar9 = lVar9 + 1;
  if (iVar4 <= (int)uVar10) {
    return iVar8;
  }
  goto LAB_00ac67cc;
}

