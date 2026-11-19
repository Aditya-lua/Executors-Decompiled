/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3059c
 */

int EC_GROUP_copy(EC_GROUP *dst,EC_GROUP *src)

{
  int iVar1;
  BN_MONT_CTX *pBVar2;
  BIGNUM *pBVar3;
  void *__dest;
  undefined8 uVar4;
  BN_MONT_CTX *from;
  EC_POINT *src_00;
  code *pcVar5;
  EC_POINT *dst_00;
  EC_GROUP *pEVar6;
  
  if (*(long *)(*(long *)dst + 0x20) == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0xa3,"EC_GROUP_copy");
    uVar4 = 0xc0101;
    goto LAB_00a3061c;
  }
  if (*(long *)dst != *(long *)src) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0xa7,"EC_GROUP_copy");
    uVar4 = 0x65;
    goto LAB_00a3061c;
  }
  if (dst == src) {
    return 1;
  }
  *(undefined8 *)(dst + 0xa8) = *(undefined8 *)(src + 0xa8);
  *(undefined4 *)(dst + 0x20) = *(undefined4 *)(src + 0x20);
  *(undefined4 *)(dst + 0x98) = *(undefined4 *)(src + 0x98);
  if (*(int *)(src + 0x98) == 0) {
    uVar4 = 0;
LAB_00a30684:
    *(undefined8 *)(dst + 0xa0) = uVar4;
  }
  else if (*(int *)(src + 0x98) == 5) {
    uVar4 = EC_ec_pre_comp_dup(*(undefined8 *)(src + 0xa0));
    goto LAB_00a30684;
  }
  from = *(BN_MONT_CTX **)(src + 0x90);
  pBVar2 = *(BN_MONT_CTX **)(dst + 0x90);
  if (from == (BN_MONT_CTX *)0x0) {
    BN_MONT_CTX_free(pBVar2);
    *(undefined8 *)(dst + 0x90) = 0;
  }
  else {
    if (pBVar2 == (BN_MONT_CTX *)0x0) {
      pBVar2 = BN_MONT_CTX_new();
      *(BN_MONT_CTX **)(dst + 0x90) = pBVar2;
      if (pBVar2 == (BN_MONT_CTX *)0x0) {
        return 0;
      }
      from = *(BN_MONT_CTX **)(src + 0x90);
    }
    pBVar2 = BN_MONT_CTX_copy(pBVar2,from);
    if (pBVar2 == (BN_MONT_CTX *)0x0) {
      return 0;
    }
  }
  src_00 = *(EC_POINT **)(src + 8);
  dst_00 = *(EC_POINT **)(dst + 8);
  if (src_00 == (EC_POINT *)0x0) {
    if (dst_00 != (EC_POINT *)0x0) {
      pcVar5 = *(code **)(*(long *)dst_00 + 0x60);
      if ((pcVar5 != (code *)0x0) ||
         (pcVar5 = *(code **)(*(long *)dst_00 + 0x58), pcVar5 != (code *)0x0)) {
        (*pcVar5)(dst_00);
      }
      CRYPTO_clear_free(dst_00,0x30,"crypto/ec/ec_lib.c",0x2fc);
    }
    *(undefined8 *)(dst + 8) = 0;
  }
  else {
    if (dst_00 == (EC_POINT *)0x0) {
      dst_00 = EC_POINT_new(dst);
      *(EC_POINT **)(dst + 8) = dst_00;
      if (dst_00 == (EC_POINT *)0x0) {
        return 0;
      }
      src_00 = *(EC_POINT **)(src + 8);
    }
    iVar1 = EC_POINT_copy(dst_00,src_00);
    if (iVar1 == 0) {
      return 0;
    }
  }
  if ((**(byte **)src >> 1 & 1) == 0) {
    pBVar3 = BN_copy(*(BIGNUM **)(dst + 0x10),*(BIGNUM **)(src + 0x10));
    if (pBVar3 == (BIGNUM *)0x0) {
      return 0;
    }
    pBVar3 = BN_copy(*(BIGNUM **)(dst + 0x18),*(BIGNUM **)(src + 0x18));
    if (pBVar3 == (BIGNUM *)0x0) {
      return 0;
    }
  }
  pEVar6 = dst + 0x30;
  *(undefined4 *)(dst + 0x2c) = *(undefined4 *)(src + 0x2c);
  *(undefined8 *)(dst + 0x24) = *(undefined8 *)(src + 0x24);
  if (*(long *)(src + 0x30) == 0) {
    CRYPTO_free(*(void **)pEVar6);
    *(undefined8 *)pEVar6 = 0;
    *(undefined8 *)(dst + 0x38) = 0;
  }
  else {
    CRYPTO_free(*(void **)pEVar6);
    __dest = CRYPTO_malloc((int)*(undefined8 *)(src + 0x38),"crypto/ec/ec_lib.c",0xf9);
    *(void **)pEVar6 = __dest;
    if (__dest == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0xfa,"EC_GROUP_copy");
      uVar4 = 0xc0100;
LAB_00a3061c:
      ERR_set_error(0x10,uVar4,0);
      return 0;
    }
    memcpy(__dest,*(void **)(src + 0x30),*(size_t *)(src + 0x38));
    *(undefined8 *)(dst + 0x38) = *(undefined8 *)(src + 0x38);
  }
                    /* WARNING: Could not recover jumptable at 0x00a307ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(*(long *)dst + 0x20))(dst,src);
  return iVar1;
}

