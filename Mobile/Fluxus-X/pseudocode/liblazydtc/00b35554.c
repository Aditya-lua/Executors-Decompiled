/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b35554
 */

DSA * ossl_b2i_DSA_after_header(long *param_1,int param_2,int param_3)

{
  ulong uVar1;
  int iVar2;
  DSA *r;
  BIGNUM *m;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *r_00;
  long lVar3;
  BIGNUM *p;
  BN_CTX *ctx;
  
  lVar3 = *param_1;
  r = DSA_new();
  if (r == (DSA *)0x0) {
    m = (BIGNUM *)0x0;
LAB_00b35648:
    a = (BIGNUM *)0x0;
LAB_00b3564c:
    a_00 = (BIGNUM *)0x0;
LAB_00b35650:
    p = (BIGNUM *)0x0;
LAB_00b35654:
    r_00 = (BIGNUM *)0x0;
  }
  else {
    uVar1 = (ulong)(param_2 + 7U >> 3);
    m = (BIGNUM *)BN_lebin2bn(lVar3,uVar1,0);
    if (m == (BIGNUM *)0x0) goto LAB_00b35648;
    lVar3 = lVar3 + uVar1;
    a = (BIGNUM *)BN_lebin2bn(lVar3,0x14,0);
    if (a == (BIGNUM *)0x0) goto LAB_00b3564c;
    lVar3 = lVar3 + 0x14;
    a_00 = (BIGNUM *)BN_lebin2bn(lVar3,uVar1,0);
    if (a_00 == (BIGNUM *)0x0) goto LAB_00b35650;
    lVar3 = lVar3 + uVar1;
    if (param_3 == 0) {
      p = (BIGNUM *)BN_lebin2bn(lVar3,0x14,0);
      if (p != (BIGNUM *)0x0) {
        BN_set_flags(p,4);
        r_00 = BN_new();
        if (r_00 != (BIGNUM *)0x0) {
          ctx = BN_CTX_new();
          if ((ctx == (BN_CTX *)0x0) || (iVar2 = BN_mod_exp(r_00,a_00,p,m,ctx), iVar2 == 0))
          goto LAB_00b3565c;
          lVar3 = lVar3 + 0x14;
          BN_CTX_free(ctx);
          goto LAB_00b35610;
        }
        goto LAB_00b35658;
      }
      goto LAB_00b35654;
    }
    r_00 = (BIGNUM *)BN_lebin2bn(lVar3,uVar1,0);
    p = (BIGNUM *)0x0;
    if (r_00 != (BIGNUM *)0x0) {
      lVar3 = lVar3 + uVar1;
LAB_00b35610:
      iVar2 = DSA_set0_pqg(r,m,a,a_00);
      if (iVar2 != 0) {
        iVar2 = DSA_set0_key(r,r_00,p);
        if (iVar2 != 0) {
          *param_1 = lVar3;
          return r;
        }
        m = (BIGNUM *)0x0;
        a = (BIGNUM *)0x0;
        a_00 = (BIGNUM *)0x0;
      }
    }
  }
LAB_00b35658:
  ctx = (BN_CTX *)0x0;
LAB_00b3565c:
  ERR_new();
  ERR_set_debug("crypto/pem/pvkfmt.c",0x1ad,"ossl_b2i_DSA_after_header");
  ERR_set_error(9,0xc0100,0);
  DSA_free(r);
  BN_free(m);
  BN_free(a);
  BN_free(a_00);
  BN_free(r_00);
  BN_free(p);
  BN_CTX_free(ctx);
  return (DSA *)0x0;
}

