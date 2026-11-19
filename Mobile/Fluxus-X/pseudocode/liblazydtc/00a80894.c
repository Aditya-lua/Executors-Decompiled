/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80894
 */

bool ossl_decode_der_integer(long *param_1,BIGNUM *param_2)

{
  char cVar1;
  byte bVar2;
  BIGNUM *pBVar3;
  ulong uVar4;
  uchar *s;
  char *pcVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  
  lVar6 = param_1[1];
  if (lVar6 == 0) {
    return false;
  }
  pcVar5 = (char *)*param_1;
  cVar1 = *pcVar5;
  *param_1 = (long)(pcVar5 + 1);
  param_1[1] = lVar6 + -1;
  if (cVar1 != '\x02') {
    return false;
  }
  if (lVar6 + -1 == 0) {
    return false;
  }
  bVar2 = pcVar5[1];
  s = (uchar *)(pcVar5 + 2);
  uVar8 = lVar6 - 2;
  uVar4 = (ulong)bVar2;
  *param_1 = (long)s;
  param_1[1] = uVar8;
  if ((char)bVar2 < '\0') {
    if (bVar2 == 0x82) {
      if (uVar8 < 2) {
        return false;
      }
      uVar4 = (ulong)CONCAT11(pcVar5[2],pcVar5[3]);
      lVar7 = (lVar6 - 4U) - uVar4;
      if (lVar6 - 4U < uVar4) {
        return false;
      }
      s = (uchar *)(pcVar5 + 4);
    }
    else {
      if (bVar2 != 0x81) {
        return false;
      }
      if (uVar8 == 0) {
        return false;
      }
      uVar4 = (ulong)(byte)pcVar5[2];
      lVar7 = (lVar6 - 3U) - uVar4;
      if (lVar6 - 3U < uVar4) {
        return false;
      }
      s = (uchar *)(pcVar5 + 3);
    }
  }
  else {
    lVar7 = uVar8 - uVar4;
    if (uVar8 < uVar4) {
      return false;
    }
  }
  *param_1 = (long)(s + uVar4);
  param_1[1] = lVar7;
  if (uVar4 == 0) {
    return false;
  }
  if ((char)*s < '\0') {
    return false;
  }
  if (((uVar4 == 1) || (*s != '\0')) || ((char)s[1] < '\0')) {
    pBVar3 = BN_bin2bn(s,(int)uVar4,param_2);
    return pBVar3 != (BIGNUM *)0x0;
  }
  return false;
}

