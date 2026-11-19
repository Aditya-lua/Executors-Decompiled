/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa07d8
 */

int BN_hex2bn(BIGNUM **a,char *str)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  BIGNUM *pBVar5;
  uint uVar6;
  BIGNUM *a_00;
  long lVar7;
  uint uVar8;
  ulong uVar9;
  char *pcVar10;
  ulong uVar11;
  char *pcVar12;
  
  if ((str != (char *)0x0) && (*str != '\0')) {
    bVar1 = *str == '-';
    if (bVar1) {
      str = str + 1;
    }
    uVar9 = 0;
    uVar6 = 0x3f;
    do {
      iVar2 = ossl_ctype_check(str[uVar9],0x10);
      if (iVar2 == 0) {
        if (0x1ffffffe < (uint)(uVar9 - 1)) {
          return 0;
        }
        uVar8 = (uint)uVar9;
        iVar2 = bVar1 + uVar8;
        if (a == (BIGNUM **)0x0) {
          return iVar2;
        }
        a_00 = *a;
        if (a_00 == (BIGNUM *)0x0) {
          a_00 = BN_new();
          if (a_00 == (BIGNUM *)0x0) {
            return 0;
          }
        }
        else {
          iVar3 = BN_get_flags(a_00,2);
          if (iVar3 != 0) {
            ERR_new();
            ERR_set_debug("crypto/bn/bn_conv.c",0x9e,"BN_hex2bn");
            ERR_set_error(3,0x80106,0);
            return 0;
          }
          BN_zero_ex(a_00);
        }
        if ((0x1ffffff0 < uVar8) ||
           ((a_00->dmax < (int)(uVar6 >> 6) &&
            (pBVar5 = bn_expand2(a_00,uVar6 >> 6), pBVar5 == (BIGNUM *)0x0)))) {
          if (*a == (BIGNUM *)0x0) {
            BN_free(a_00);
            return 0;
          }
          return 0;
        }
        uVar6 = (uint)(uVar9 - 1 >> 4) & 0xfffffff;
        uVar11 = 0;
        uVar8 = ~uVar8;
        pcVar10 = str + uVar9 + 1;
        do {
          uVar4 = uVar8;
          if ((int)uVar8 < -0x10) {
            uVar4 = 0xffffffef;
          }
          lVar7 = (long)(int)-uVar4;
          uVar9 = 0;
          pcVar12 = pcVar10 + -lVar7;
          do {
            lVar7 = lVar7 + -1;
            uVar4 = OPENSSL_hexchar2int(*pcVar12);
            uVar9 = (ulong)(uVar4 & ((int)uVar4 >> 0x1f ^ 0xffffffffU)) | uVar9 << 4;
            pcVar12 = pcVar12 + 1;
          } while (1 < lVar7);
          uVar8 = uVar8 + 0x10;
          pcVar10 = pcVar10 + -0x10;
          a_00->d[uVar11] = uVar9;
          uVar11 = uVar11 + 1;
        } while (uVar11 != uVar6 + 1);
        a_00->top = uVar6 + 1;
        bn_correct_top(a_00);
        *a = a_00;
        if (a_00->top == 0) {
          return iVar2;
        }
        a_00->neg = (uint)bVar1;
        return iVar2;
      }
      uVar9 = uVar9 + 1;
      uVar6 = uVar6 + 4;
    } while (uVar9 >> 0x1d == 0);
  }
  return 0;
}

