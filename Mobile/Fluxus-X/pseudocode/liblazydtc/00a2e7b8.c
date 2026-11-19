/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e7b8
 */

EC_KEY * EC_KEY_copy(EC_KEY *dst,EC_KEY *src)

{
  int iVar1;
  EC_GROUP *dst_00;
  EC_POINT *dst_01;
  BIGNUM *a;
  undefined8 uVar2;
  BIGNUM *pBVar3;
  code *pcVar4;
  long lVar5;
  
  if ((dst == (EC_KEY *)0x0) || (src == (EC_KEY *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x6c,"EC_KEY_copy");
    ERR_set_error(0x10,0xc0102,0);
  }
  else {
    if (*(long *)src != *(long *)dst) {
      pcVar4 = *(code **)(*(long *)dst + 0x18);
      if (pcVar4 != (code *)0x0) {
        (*pcVar4)(dst);
      }
      if ((*(long **)(dst + 0x18) != (long *)0x0) &&
         (pcVar4 = *(code **)(**(long **)(dst + 0x18) + 0x168), pcVar4 != (code *)0x0)) {
        (*pcVar4)(dst);
      }
      iVar1 = ENGINE_finish(*(ENGINE **)(dst + 8));
      if (iVar1 == 0) {
        return (EC_KEY *)0x0;
      }
      *(undefined8 *)(dst + 8) = 0;
    }
    *(undefined8 *)(dst + 0x58) = *(undefined8 *)(src + 0x58);
    if (*(long *)(src + 0x18) != 0) {
      EC_GROUP_free(*(EC_GROUP **)(dst + 0x18));
      dst_00 = (EC_GROUP *)
               ossl_ec_group_new_ex
                         (*(undefined8 *)(src + 0x58),*(undefined8 *)(src + 0x60),
                          **(undefined8 **)(src + 0x18));
      *(EC_GROUP **)(dst + 0x18) = dst_00;
      if (dst_00 == (EC_GROUP *)0x0) {
        return (EC_KEY *)0x0;
      }
      iVar1 = EC_GROUP_copy(dst_00,*(EC_GROUP **)(src + 0x18));
      if (iVar1 == 0) {
        return (EC_KEY *)0x0;
      }
      if (*(long *)(src + 0x20) != 0) {
        EC_POINT_free(*(EC_POINT **)(dst + 0x20));
        dst_01 = EC_POINT_new(*(EC_GROUP **)(src + 0x18));
        *(EC_POINT **)(dst + 0x20) = dst_01;
        if (dst_01 == (EC_POINT *)0x0) {
          return (EC_KEY *)0x0;
        }
        iVar1 = EC_POINT_copy(dst_01,*(EC_POINT **)(src + 0x20));
        if (iVar1 == 0) {
          return (EC_KEY *)0x0;
        }
      }
      pBVar3 = *(BIGNUM **)(src + 0x28);
      if (pBVar3 != (BIGNUM *)0x0) {
        a = *(BIGNUM **)(dst + 0x28);
        if (a == (BIGNUM *)0x0) {
          a = BN_new();
          *(BIGNUM **)(dst + 0x28) = a;
          if (a == (BIGNUM *)0x0) {
            return (EC_KEY *)0x0;
          }
          pBVar3 = *(BIGNUM **)(src + 0x28);
        }
        pBVar3 = BN_copy(a,pBVar3);
        if (pBVar3 == (BIGNUM *)0x0) {
          return (EC_KEY *)0x0;
        }
        if ((*(code **)(**(long **)(src + 0x18) + 0x160) != (code *)0x0) &&
           (iVar1 = (**(code **)(**(long **)(src + 0x18) + 0x160))(dst,src), iVar1 == 0)) {
          return (EC_KEY *)0x0;
        }
      }
    }
    *(undefined8 *)(dst + 0x30) = *(undefined8 *)(src + 0x30);
    *(undefined4 *)(dst + 0x10) = *(undefined4 *)(src + 0x10);
    *(undefined4 *)(dst + 0x3c) = *(undefined4 *)(src + 0x3c);
    iVar1 = CRYPTO_dup_ex_data(8,(CRYPTO_EX_DATA *)(dst + 0x40),(CRYPTO_EX_DATA *)(src + 0x40));
    if (iVar1 != 0) {
      lVar5 = *(long *)src;
      if (lVar5 != *(long *)dst) {
        uVar2 = 0;
        if (*(ENGINE **)(src + 8) != (ENGINE *)0x0) {
          iVar1 = ENGINE_init(*(ENGINE **)(src + 8));
          if (iVar1 == 0) {
            return (EC_KEY *)0x0;
          }
          lVar5 = *(long *)src;
          uVar2 = *(undefined8 *)(src + 8);
        }
        *(long *)dst = lVar5;
        *(undefined8 *)(dst + 8) = uVar2;
        lVar5 = *(long *)src;
      }
      if ((*(code **)(lVar5 + 0x20) == (code *)0x0) ||
         (iVar1 = (**(code **)(lVar5 + 0x20))(dst,src), iVar1 != 0)) {
        *(long *)(dst + 0x68) = *(long *)(dst + 0x68) + 1;
        return dst;
      }
    }
  }
  return (EC_KEY *)0x0;
}

