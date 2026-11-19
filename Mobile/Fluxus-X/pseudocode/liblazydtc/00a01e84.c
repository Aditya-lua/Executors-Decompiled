/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01e84
 */

BIGNUM * BN_bin2bn(uchar *s,int len,BIGNUM *ret)

{
  bool bVar1;
  uint words;
  BIGNUM *pBVar2;
  uint uVar3;
  long lVar4;
  uint uVar5;
  ulong uVar6;
  int iVar7;
  BIGNUM *ptr;
  
  if (ret == (BIGNUM *)0x0) {
    ptr = (BIGNUM *)CRYPTO_zalloc(0x18,"crypto/bn/bn_lib.c",0xf7);
    if (ptr == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/bn/bn_lib.c",0xf8,"BN_new");
      ERR_set_error(3,0xc0100,0);
      return (BIGNUM *)0x0;
    }
    ptr->flags = 1;
    ret = ptr;
  }
  else {
    ptr = (BIGNUM *)0x0;
  }
  iVar7 = len;
  if (0 < len) {
    do {
      len = iVar7;
      if (*s != 0) goto LAB_00a01ed4;
      len = iVar7 + -1;
      s = s + 1;
      bVar1 = 0 < iVar7;
      iVar7 = len;
    } while (len != 0 && bVar1);
  }
  if (len == 0) {
    ret->top = 0;
    return ret;
  }
LAB_00a01ed4:
  uVar3 = len - 1U >> 3;
  words = uVar3 + 1;
  if ((ret->dmax <= (int)uVar3) && (pBVar2 = bn_expand2(ret,words), pBVar2 == (BIGNUM *)0x0)) {
    if (ptr != (BIGNUM *)0x0) {
      if (((uint)ptr->flags >> 1 & 1) == 0) {
        if (((uint)ptr->flags >> 3 & 1) == 0) {
          CRYPTO_free(ptr->d);
        }
        else {
          CRYPTO_secure_clear_free(ptr->d,(long)ptr->dmax << 3,"crypto/bn/bn_lib.c",0xcd);
        }
      }
      if ((ptr->flags & 1) == 0) {
        return (BIGNUM *)0x0;
      }
      CRYPTO_free(ptr);
    }
    return (BIGNUM *)0x0;
  }
  ret->top = words;
  ret->neg = 0;
  if (len != 0) {
    uVar6 = 0;
    uVar3 = len - 1U & 7;
    uVar5 = words;
    do {
      while( true ) {
        len = len + -1;
        uVar6 = (ulong)*s | uVar6 << 8;
        if (uVar3 == 0) break;
        uVar3 = uVar3 - 1;
        s = s + 1;
        if (len == 0) goto LAB_00a01f50;
      }
      uVar5 = uVar5 - 1;
      ret->d[uVar5] = uVar6;
      uVar3 = 7;
      uVar6 = 0;
      s = s + 1;
    } while (len != 0);
  }
LAB_00a01f50:
  lVar4 = (ulong)words - 1;
  do {
    if (ret->d[lVar4] != 0) break;
    lVar4 = lVar4 + -1;
  } while (1 < (int)lVar4 + 2);
  iVar7 = (int)lVar4 + 1;
  ret->top = iVar7;
  if (iVar7 == 0) {
    ret->neg = 0;
    return ret;
  }
  return ret;
}

