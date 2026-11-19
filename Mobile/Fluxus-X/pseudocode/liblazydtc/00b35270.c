/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b35270
 */

RSA * ossl_b2i_RSA_after_header(long *param_1,int param_2,int param_3)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  RSA *r;
  BIGNUM *a;
  BIGNUM *a_00;
  uint *puVar4;
  BIGNUM *a_01;
  BIGNUM *a_02;
  BIGNUM *a_03;
  long lVar5;
  BIGNUM *a_04;
  BIGNUM *a_05;
  BIGNUM *a_06;
  
  puVar4 = (uint *)*param_1;
  r = RSA_new();
  if (r == (RSA *)0x0) {
    a_00 = (BIGNUM *)0x0;
    a_02 = (BIGNUM *)0x0;
    a_01 = (BIGNUM *)0x0;
    a_03 = (BIGNUM *)0x0;
    a_04 = (BIGNUM *)0x0;
    a_05 = (BIGNUM *)0x0;
    a_06 = (BIGNUM *)0x0;
    a = (BIGNUM *)0x0;
    goto LAB_00b35374;
  }
  a = BN_new();
  if ((a == (BIGNUM *)0x0) || (iVar3 = BN_set_word(a,(ulong)*puVar4), iVar3 == 0)) {
    a_00 = (BIGNUM *)0x0;
LAB_00b35338:
    a_02 = (BIGNUM *)0x0;
LAB_00b3533c:
    a_01 = (BIGNUM *)0x0;
LAB_00b35340:
    a_03 = (BIGNUM *)0x0;
LAB_00b35344:
    a_04 = (BIGNUM *)0x0;
  }
  else {
    uVar1 = (ulong)(param_2 + 7U >> 3);
    puVar4 = puVar4 + 1;
    a_00 = (BIGNUM *)BN_lebin2bn(puVar4,uVar1,0);
    if (a_00 == (BIGNUM *)0x0) goto LAB_00b35338;
    lVar5 = (long)puVar4 + uVar1;
    if (param_3 != 0) {
      a_02 = (BIGNUM *)0x0;
LAB_00b35314:
      iVar3 = RSA_set0_key(r,a_00,a,a_02);
      if (iVar3 != 0) {
        *param_1 = lVar5;
        return r;
      }
      goto LAB_00b3533c;
    }
    uVar2 = (ulong)(param_2 + 0xfU >> 4);
    a_01 = (BIGNUM *)BN_lebin2bn(lVar5,uVar2,0);
    if (a_01 == (BIGNUM *)0x0) {
      a_02 = (BIGNUM *)0x0;
      goto LAB_00b35340;
    }
    a_03 = (BIGNUM *)BN_lebin2bn(lVar5 + uVar2,uVar2,0);
    if (a_03 == (BIGNUM *)0x0) {
      a_02 = (BIGNUM *)0x0;
      goto LAB_00b35344;
    }
    lVar5 = lVar5 + uVar2 + uVar2;
    a_04 = (BIGNUM *)BN_lebin2bn(lVar5,uVar2,0);
    if (a_04 != (BIGNUM *)0x0) {
      lVar5 = lVar5 + uVar2;
      a_05 = (BIGNUM *)BN_lebin2bn(lVar5,uVar2,0);
      if (a_05 == (BIGNUM *)0x0) {
        a_02 = (BIGNUM *)0x0;
        a_06 = (BIGNUM *)0x0;
        goto LAB_00b35374;
      }
      lVar5 = lVar5 + uVar2;
      a_06 = (BIGNUM *)BN_lebin2bn(lVar5,uVar2,0);
      if (a_06 == (BIGNUM *)0x0) {
        a_02 = (BIGNUM *)0x0;
        goto LAB_00b35374;
      }
      lVar5 = lVar5 + uVar2;
      a_02 = (BIGNUM *)BN_lebin2bn(lVar5,uVar1,0);
      if ((a_02 == (BIGNUM *)0x0) || (iVar3 = RSA_set0_factors(r,a_01,a_03), iVar3 == 0))
      goto LAB_00b35374;
      iVar3 = RSA_set0_crt_params(r,a_04,a_05,a_06);
      if (iVar3 == 0) {
        a_01 = (BIGNUM *)0x0;
        a_03 = (BIGNUM *)0x0;
        goto LAB_00b35374;
      }
      lVar5 = lVar5 + uVar1;
      goto LAB_00b35314;
    }
    a_02 = (BIGNUM *)0x0;
  }
  a_05 = (BIGNUM *)0x0;
  a_06 = (BIGNUM *)0x0;
LAB_00b35374:
  ERR_new();
  ERR_set_debug("crypto/pem/pvkfmt.c",0x1e8,"ossl_b2i_RSA_after_header");
  ERR_set_error(9,0xc0100,0);
  BN_free(a);
  BN_free(a_00);
  BN_free(a_01);
  BN_free(a_03);
  BN_free(a_04);
  BN_free(a_05);
  BN_free(a_06);
  BN_free(a_02);
  RSA_free(r);
  return (RSA *)0x0;
}

