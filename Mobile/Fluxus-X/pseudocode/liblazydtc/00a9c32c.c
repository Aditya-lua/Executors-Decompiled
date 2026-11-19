/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c32c
 */

undefined4 WPACKET_reserve_bytes(long *param_1,ulong param_2,long *param_3)

{
  ulong uVar1;
  int iVar2;
  BUF_MEM *str;
  size_t len;
  long lVar3;
  ulong uVar4;
  
  if (param_2 == 0) {
    return 0;
  }
  if (param_1[5] == 0) {
    return 0;
  }
  if ((ulong)(param_1[4] - param_1[3]) < param_2) {
    return 0;
  }
  str = (BUF_MEM *)*param_1;
  if ((str != (BUF_MEM *)0x0) && (uVar4 = str->length, uVar4 - param_1[3] < param_2)) {
    uVar1 = param_2;
    if (param_2 <= uVar4) {
      uVar1 = uVar4;
    }
    if ((long)uVar1 < 0) {
      iVar2 = BUF_MEM_grow(str,0xffffffffffffffff);
      if (iVar2 == 0) {
        return 0;
      }
    }
    else {
      len = uVar1 * 2;
      if (len < 0x101) {
        len = 0x100;
      }
      iVar2 = BUF_MEM_grow(str,len);
      if (iVar2 == 0) {
        return 0;
      }
    }
  }
  if (param_3 == (long *)0x0) {
    return 1;
  }
  lVar3 = param_1[1];
  if (lVar3 == 0) {
    lVar3 = 0;
    if (*param_1 == 0) goto LAB_00a9c3ec;
    lVar3 = *(long *)(*param_1 + 8);
    if (lVar3 == 0) {
      lVar3 = 0;
      goto LAB_00a9c3ec;
    }
  }
  if ((*(byte *)(param_1 + 6) & 1) == 0) {
    lVar3 = lVar3 + param_1[2];
  }
  else {
    lVar3 = (lVar3 + param_1[4]) - param_1[2];
  }
LAB_00a9c3ec:
  *param_3 = lVar3;
  if (lVar3 == 0) {
    return 1;
  }
  if ((*(byte *)(param_1 + 6) & 1) == 0) {
    return 1;
  }
  *param_3 = lVar3 - param_2;
  return 1;
}

