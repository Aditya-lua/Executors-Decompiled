/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1338
 */

RSA * FUN_00ad1338(BIGNUM *param_1,long param_2)

{
  undefined4 uVar1;
  int iVar2;
  RSA *r;
  BIGNUM *pBVar3;
  RSA_METHOD *pRVar4;
  undefined8 uVar5;
  
  r = (RSA *)CRYPTO_zalloc(0xe0,"crypto/rsa/rsa_lib.c",0x4d);
  if (r == (RSA *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_lib.c",0x50,"rsa_new_intern");
    ERR_set_error(4,0xc0100,0);
    return (RSA *)0x0;
  }
  *(undefined4 *)&r->mt_blinding = 1;
  pBVar3 = (BIGNUM *)CRYPTO_THREAD_lock_new();
  r[1].e = pBVar3;
  if (pBVar3 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_lib.c",0x57,"rsa_new_intern");
    ERR_set_error(4,0xc0100,0);
    CRYPTO_free(r);
    return (RSA *)0x0;
  }
  r->version = param_2;
  pRVar4 = RSA_get_default_method();
  r->engine = (ENGINE *)pRVar4;
  *(uint *)((long)&r->mt_blinding + 4) = pRVar4->flags & 0xfffffbff;
  if (param_1 == (BIGNUM *)0x0) {
    param_1 = (BIGNUM *)ENGINE_get_default_RSA();
    r->n = param_1;
    if (param_1 != (BIGNUM *)0x0) goto LAB_00ad1440;
    pRVar4 = (RSA_METHOD *)r->engine;
LAB_00ad14a4:
    *(uint *)((long)&r->mt_blinding + 4) = pRVar4->flags & 0xfffffbff;
    iVar2 = CRYPTO_new_ex_data(9,r,(CRYPTO_EX_DATA *)&r->bignum_data);
    if (iVar2 == 0) goto LAB_00ad150c;
    if (*(code **)(r->engine + 0x38) == (code *)0x0) {
      return r;
    }
    iVar2 = (**(code **)(r->engine + 0x38))(r);
    if (iVar2 != 0) {
      return r;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_lib.c",0x7a,"rsa_new_intern");
    uVar1 = 0xc0105;
  }
  else {
    iVar2 = ENGINE_init((ENGINE *)param_1);
    if (iVar2 == 0) {
      ERR_new();
      uVar5 = 0x62;
    }
    else {
      r->n = param_1;
LAB_00ad1440:
      pRVar4 = ENGINE_get_RSA((ENGINE *)param_1);
      r->engine = (ENGINE *)pRVar4;
      if (pRVar4 != (RSA_METHOD *)0x0) goto LAB_00ad14a4;
      ERR_new();
      uVar5 = 0x6c;
    }
    ERR_set_debug("crypto/rsa/rsa_lib.c",uVar5,"rsa_new_intern");
    uVar1 = 0x80026;
  }
  ERR_set_error(4,uVar1,0);
LAB_00ad150c:
  RSA_free(r);
  return (RSA *)0x0;
}

