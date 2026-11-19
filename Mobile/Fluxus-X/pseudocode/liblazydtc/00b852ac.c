/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b852ac
 */

ulong mbedtls_asn1_write_len(long *param_1,long param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  
  if ((int)(param_3 >> 0x20) != 0) {
    return 0xffffff9c;
  }
  uVar1 = 1;
  if (0x7f < (uint)param_3) {
    uVar2 = param_3 & 0xffffffff;
    do {
      uVar2 = uVar2 >> 8;
      uVar1 = (ulong)((int)uVar1 + 1);
    } while (uVar2 != 0);
  }
  lVar3 = *param_1;
  if (lVar3 - param_2 < (long)uVar1) {
    return 0xffffff94;
  }
  *param_1 = lVar3 + -1;
  *(char *)(lVar3 + -1) = (char)param_3;
  for (uVar2 = (ulong)((uint)param_3 >> 8); uVar2 != 0; uVar2 = uVar2 >> 8) {
    lVar3 = *param_1;
    *param_1 = lVar3 + -1;
    *(char *)(lVar3 + -1) = (char)uVar2;
  }
  if (1 < (uint)uVar1) {
    lVar3 = *param_1;
    *param_1 = lVar3 + -1;
    *(char *)(lVar3 + -1) = (char)uVar1 + '\x7f';
  }
  return uVar1;
}

