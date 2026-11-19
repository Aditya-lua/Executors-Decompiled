/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1b404
 */

int BN_exp(BIGNUM *r,BIGNUM *a,BIGNUM *p,BN_CTX *ctx)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BIGNUM *pBVar4;
  BIGNUM *a_00;
  BIGNUM *pBVar5;
  
  iVar1 = BN_get_flags(p,4);
  if ((iVar1 != 0) || (iVar1 = BN_get_flags(a,4), iVar1 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp.c",0x39,"BN_exp");
    ERR_set_error(3,0xc0101,0);
    return 0;
  }
  BN_CTX_start(ctx);
  if ((r == a) || (pBVar4 = r, r == p)) {
    pBVar4 = BN_CTX_get(ctx);
  }
  a_00 = BN_CTX_get(ctx);
  if (pBVar4 != (BIGNUM *)0x0) {
    iVar1 = 0;
    if (a_00 == (BIGNUM *)0x0) goto LAB_00a1b5a0;
    pBVar5 = BN_copy(a_00,a);
    if (pBVar5 != (BIGNUM *)0x0) {
      iVar1 = BN_num_bits(p);
      iVar2 = BN_is_odd(p);
      if (iVar2 == 0) {
        iVar2 = BN_set_word(pBVar4,1);
        if (iVar2 != 0) goto LAB_00a1b528;
      }
      else {
        pBVar5 = BN_copy(pBVar4,a);
        if (pBVar5 != (BIGNUM *)0x0) {
LAB_00a1b528:
          if (1 < iVar1) {
            iVar2 = 1;
            do {
              iVar3 = BN_sqr(a_00,a_00,ctx);
              if ((iVar3 == 0) ||
                 ((iVar3 = BN_is_bit_set(p,iVar2), iVar3 != 0 &&
                  (iVar3 = BN_mul(pBVar4,pBVar4,a_00,ctx), iVar3 == 0)))) goto LAB_00a1b59c;
              iVar2 = iVar2 + 1;
            } while (iVar2 < iVar1);
          }
          if ((pBVar4 == r) || (pBVar4 = BN_copy(r,pBVar4), pBVar4 != (BIGNUM *)0x0)) {
            iVar1 = 1;
            goto LAB_00a1b5a0;
          }
        }
      }
    }
  }
LAB_00a1b59c:
  iVar1 = 0;
LAB_00a1b5a0:
  BN_CTX_end(ctx);
  return iVar1;
}

