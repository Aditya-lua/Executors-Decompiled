/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0231c
 */

BIGNUM * BN_lebin2bn(long param_1,int param_2,BIGNUM *param_3)

{
  bool bVar1;
  uint words;
  int iVar2;
  BIGNUM *pBVar3;
  byte *pbVar4;
  byte *pbVar5;
  long lVar6;
  uint uVar7;
  uint uVar8;
  ulong uVar9;
  BIGNUM *ptr;
  
  if (param_3 == (BIGNUM *)0x0) {
    param_3 = (BIGNUM *)CRYPTO_zalloc(0x18,"crypto/bn/bn_lib.c",0xf7);
    if (param_3 == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/bn/bn_lib.c",0xf8,"BN_new");
      ERR_set_error(3,0xc0100,0);
      return (BIGNUM *)0x0;
    }
    param_3->flags = 1;
    ptr = param_3;
  }
  else {
    ptr = (BIGNUM *)0x0;
  }
  pbVar5 = (byte *)(param_1 + param_2);
  if (0 < param_2) {
    do {
      pbVar4 = pbVar5 + -1;
      if (*pbVar4 != 0) goto LAB_00a023a8;
      iVar2 = param_2 + -1;
      bVar1 = 0 < param_2;
      pbVar5 = pbVar4;
      param_2 = iVar2;
    } while (iVar2 != 0 && bVar1);
  }
  if (param_2 == 0) {
    param_3->top = 0;
    return param_3;
  }
LAB_00a023a8:
  uVar7 = param_2 - 1U >> 3;
  words = uVar7 + 1;
  if ((param_3->dmax <= (int)uVar7) && (pBVar3 = bn_expand2(param_3,words), pBVar3 == (BIGNUM *)0x0)
     ) {
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
  param_3->top = words;
  param_3->neg = 0;
  if (param_2 != 0) {
    uVar9 = 0;
    uVar7 = param_2 - 1U & 7;
    uVar8 = words;
    do {
      pbVar5 = pbVar5 + -1;
      param_2 = param_2 + -1;
      uVar9 = (ulong)*pbVar5 | uVar9 << 8;
      if (uVar7 == 0) {
        uVar8 = uVar8 - 1;
        param_3->d[uVar8] = uVar9;
        uVar7 = 7;
        uVar9 = 0;
      }
      else {
        uVar7 = uVar7 - 1;
      }
    } while (param_2 != 0);
  }
  lVar6 = (ulong)words - 1;
  do {
    if (param_3->d[lVar6] != 0) break;
    lVar6 = lVar6 + -1;
  } while (1 < (int)lVar6 + 2);
  iVar2 = (int)lVar6 + 1;
  param_3->top = iVar2;
  if (iVar2 == 0) {
    param_3->neg = 0;
    return param_3;
  }
  return param_3;
}

