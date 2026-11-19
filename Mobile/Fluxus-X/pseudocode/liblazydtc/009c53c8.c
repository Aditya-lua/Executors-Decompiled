/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c53c8
 */

undefined8 ssl_get_auto_dh(long param_1)

{
  int iVar1;
  int iVar2;
  BIGNUM *a;
  EVP_PKEY_CTX *ctx;
  long lVar3;
  long lVar4;
  undefined8 local_38;
  
  local_38 = 0;
  if (*(int *)(*(long *)(param_1 + 0x898) + 0x18) == 2) {
    iVar2 = 0x50;
  }
  else if ((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x20) & 0x14) == 0) {
    if (*(long *)(param_1 + 0x388) == 0) {
      return 0;
    }
    iVar2 = EVP_PKEY_get_security_bits(*(undefined8 *)(*(long *)(param_1 + 0x388) + 8));
  }
  else {
    iVar2 = 0x80;
    if (*(int *)(*(long *)(param_1 + 0x2e0) + 0x44) != 0x100) {
      iVar2 = 0x50;
    }
  }
  iVar1 = ssl_get_security_level_bits(param_1,0,0);
  if (iVar1 <= iVar2) {
    iVar1 = iVar2;
  }
  if (iVar1 < 0xc0) {
    if (0x97 < iVar1) {
      a = (BIGNUM *)BN_get_rfc3526_prime_4096(0);
      goto joined_r0x009c558c;
    }
    if (iVar1 < 0x80) {
      if (0x6f < iVar1) {
        a = (BIGNUM *)BN_get_rfc3526_prime_2048(0);
        goto joined_r0x009c558c;
      }
      a = (BIGNUM *)BN_get_rfc2409_prime_1024(0);
    }
    else {
      a = (BIGNUM *)BN_get_rfc3526_prime_3072(0);
    }
    if (a != (BIGNUM *)0x0) goto LAB_009c546c;
LAB_009c5518:
    ctx = (EVP_PKEY_CTX *)0x0;
LAB_009c551c:
    lVar3 = 0;
  }
  else {
    a = (BIGNUM *)BN_get_rfc3526_prime_8192(0);
joined_r0x009c558c:
    if (a == (BIGNUM *)0x0) goto LAB_009c5518;
LAB_009c546c:
    ctx = (EVP_PKEY_CTX *)
          EVP_PKEY_CTX_new_from_name
                    (**(undefined8 **)(param_1 + 0x9a8),&DAT_002a3a5a,
                     (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
    if ((ctx == (EVP_PKEY_CTX *)0x0) || (iVar2 = EVP_PKEY_fromdata_init(ctx), iVar2 != 1))
    goto LAB_009c551c;
    lVar3 = OSSL_PARAM_BLD_new();
    if ((lVar3 != 0) &&
       ((iVar2 = OSSL_PARAM_BLD_push_BN(lVar3,&DAT_002a38e7,a), iVar2 != 0 &&
        (iVar2 = OSSL_PARAM_BLD_push_uint(lVar3,&DAT_002d92e5,2), iVar2 != 0)))) {
      lVar4 = OSSL_PARAM_BLD_to_param(lVar3);
      if (lVar4 != 0) {
        EVP_PKEY_fromdata(ctx,&local_38,0x84,lVar4);
      }
      goto LAB_009c5524;
    }
  }
  lVar4 = 0;
LAB_009c5524:
  OSSL_PARAM_free(lVar4);
  OSSL_PARAM_BLD_free(lVar3);
  EVP_PKEY_CTX_free(ctx);
  BN_free(a);
  return local_38;
}

