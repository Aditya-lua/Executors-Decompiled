/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1eea4
 */

DH * FUN_00a1eea4(ENGINE *param_1,BIGNUM *param_2)

{
  undefined4 uVar1;
  int iVar2;
  DH *dh;
  long lVar3;
  DH_METHOD *pDVar4;
  undefined8 uVar5;
  code *pcVar6;
  
  dh = (DH *)CRYPTO_zalloc(0xd0,"crypto/dh/dh_lib.c",0x4c);
  if (dh == (DH *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dh/dh_lib.c",0x4f,"dh_new_intern");
    ERR_set_error(5,0xc0100,0);
    return (DH *)0x0;
  }
  dh[1].pad = 1;
  lVar3 = CRYPTO_THREAD_lock_new();
  *(long *)&dh[1].flags = lVar3;
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/dh/dh_lib.c",0x56,"dh_new_intern");
    ERR_set_error(5,0xc0100,0);
    CRYPTO_free(dh);
    return (DH *)0x0;
  }
  dh[1].pub_key = param_2;
  pDVar4 = DH_get_default_method();
  dh[1].priv_key = (BIGNUM *)pDVar4;
  *(int *)&dh->meth = pDVar4->flags;
  if (param_1 == (ENGINE *)0x0) {
    param_1 = ENGINE_get_default_DH();
    dh[1].length = (long)param_1;
    if (param_1 != (ENGINE *)0x0) goto LAB_00a1efa8;
    pDVar4 = (DH_METHOD *)dh[1].priv_key;
LAB_00a1f00c:
    *(int *)&dh->meth = pDVar4->flags;
    iVar2 = CRYPTO_new_ex_data(6,dh,(CRYPTO_EX_DATA *)&dh[1].p);
    if (iVar2 == 0) goto LAB_00a1f078;
    ossl_ffc_params_init(&dh->p);
    pcVar6 = *(code **)&dh[1].priv_key[1].top;
    if (pcVar6 == (code *)0x0) {
      return dh;
    }
    iVar2 = (*pcVar6)(dh);
    if (iVar2 != 0) {
      return dh;
    }
    ERR_new();
    ERR_set_debug("crypto/dh/dh_lib.c",0x7a,"dh_new_intern");
    uVar1 = 0xc0105;
  }
  else {
    iVar2 = ENGINE_init(param_1);
    if (iVar2 == 0) {
      ERR_new();
      uVar5 = 0x61;
    }
    else {
      dh[1].length = (long)param_1;
LAB_00a1efa8:
      pDVar4 = ENGINE_get_DH(param_1);
      dh[1].priv_key = (BIGNUM *)pDVar4;
      if (pDVar4 != (DH_METHOD *)0x0) goto LAB_00a1f00c;
      ERR_new();
      uVar5 = 0x6a;
    }
    ERR_set_debug("crypto/dh/dh_lib.c",uVar5,"dh_new_intern");
    uVar1 = 0x80026;
  }
  ERR_set_error(5,uVar1,0);
LAB_00a1f078:
  DH_free(dh);
  return (DH *)0x0;
}

