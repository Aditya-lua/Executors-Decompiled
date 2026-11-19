/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa09d0
 */

int BN_dec2bn(BIGNUM **a,char *str)

{
  int iVar1;
  bool bVar2;
  int iVar3;
  BIGNUM *pBVar4;
  BIGNUM *a_00;
  uint uVar5;
  ulong w;
  uint uVar6;
  ulong uVar7;
  
  if ((str != (char *)0x0) && (*str != '\0')) {
    bVar2 = *str == '-';
    if (bVar2) {
      str = str + 1;
    }
    uVar7 = 0;
    uVar5 = 0x3f;
    do {
      iVar3 = ossl_isdigit(str[uVar7]);
      if (iVar3 == 0) {
        uVar6 = (uint)uVar7;
        a_00 = (BIGNUM *)0x0;
        if (0x1ffffffe < uVar6 - 1) goto LAB_00aa0a88;
        if (a == (BIGNUM **)0x0) {
          return bVar2 + uVar6;
        }
        a_00 = *a;
        if (a_00 == (BIGNUM *)0x0) {
          a_00 = BN_new();
          if (a_00 == (BIGNUM *)0x0) {
            return 0;
          }
        }
        else {
          BN_zero_ex(a_00);
        }
        if ((0x1ffffff0 < uVar6) ||
           ((a_00->dmax < (int)(uVar5 >> 6) &&
            (pBVar4 = bn_expand2(a_00,uVar5 >> 6), pBVar4 == (BIGNUM *)0x0)))) goto LAB_00aa0a88;
        iVar3 = (int)((uVar7 & 0xffffffff) * 0xaf286bcb >> 0x20);
        iVar1 = (iVar3 + (uVar6 - iVar3 >> 1) >> 4) * 0x13 - uVar6;
        w = 0;
        uVar7 = uVar7 + 1;
        iVar3 = 0;
        if (iVar1 != 0) {
          iVar3 = iVar1 + 0x13;
        }
        goto LAB_00aa0b14;
      }
      uVar7 = uVar7 + 1;
      uVar5 = uVar5 + 4;
    } while (uVar7 >> 0x1d == 0);
    a_00 = (BIGNUM *)0x0;
LAB_00aa0a88:
    if (*a != (BIGNUM *)0x0) {
      return 0;
    }
    BN_free(a_00);
  }
  return 0;
LAB_00aa0b14:
  iVar3 = iVar3 + 1;
  w = ((ulong)(byte)*str + w * 10) - 0x30;
  if (iVar3 == 0x13) {
    iVar3 = BN_mul_word(a_00,10000000000000000000);
    if ((iVar3 == 0) || (iVar3 = BN_add_word(a_00,w), iVar3 == 0)) goto LAB_00aa0a88;
    w = 0;
    iVar3 = 0;
  }
  uVar5 = (int)uVar7 - 1;
  uVar7 = (ulong)uVar5;
  str = str + 1;
  if ((int)uVar5 < 2) {
    bn_correct_top(a_00);
    *a = a_00;
    if (a_00->top != 0) {
      a_00->neg = (uint)bVar2;
    }
    return bVar2 + uVar6;
  }
  goto LAB_00aa0b14;
}

