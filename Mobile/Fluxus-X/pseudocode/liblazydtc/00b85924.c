/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b85924
 */

int mbedtls_asn1_write_int(long *param_1,long param_2,int param_3)

{
  bool bVar1;
  ulong uVar2;
  uint uVar3;
  long lVar4;
  char *pcVar5;
  ulong uVar6;
  
  uVar6 = 1;
  do {
    uVar2 = uVar6;
    lVar4 = *param_1;
    if (lVar4 - param_2 < 1) {
      return -0x6c;
    }
    *param_1 = lVar4 + -1;
    *(char *)(lVar4 + -1) = (char)param_3;
    bVar1 = 0xff < param_3;
    uVar6 = uVar2 + 1;
    param_3 = param_3 >> 8;
  } while (bVar1);
  pcVar5 = (char *)*param_1;
  if (*pcVar5 < '\0') {
    if ((long)pcVar5 - param_2 < 1) {
      return -0x6c;
    }
    *param_1 = (long)(pcVar5 + -1);
    pcVar5[-1] = '\0';
    uVar2 = uVar2 + 1;
  }
  if (uVar2 >> 0x20 != 0) {
    return -100;
  }
  uVar3 = 1;
  if (0x7f < uVar2) {
    uVar6 = uVar2;
    do {
      uVar6 = uVar6 >> 8;
      uVar3 = uVar3 + 1;
    } while (uVar6 != 0);
  }
  lVar4 = *param_1;
  if (lVar4 - param_2 < (long)(ulong)uVar3) {
    return -0x6c;
  }
  *param_1 = lVar4 + -1;
  *(char *)(lVar4 + -1) = (char)uVar2;
  uVar6 = uVar2;
  while (uVar6 >> 8 != 0) {
    lVar4 = *param_1;
    *param_1 = lVar4 + -1;
    *(char *)(lVar4 + -1) = (char)(uVar6 >> 8);
    uVar6 = uVar6 >> 8;
  }
  if (1 < uVar3) {
    lVar4 = *param_1;
    *param_1 = lVar4 + -1;
    *(char *)(lVar4 + -1) = (char)uVar3 + '\x7f';
  }
  lVar4 = *param_1;
  if (lVar4 - param_2 < 1) {
    return -0x6c;
  }
  *param_1 = lVar4 + -1;
  *(undefined1 *)(lVar4 + -1) = 2;
  return (int)uVar2 + uVar3 + 1;
}

