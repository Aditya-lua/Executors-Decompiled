/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05c0c
 */

char * FUN_00b05c0c(BIGNUM *param_1)

{
  long lVar1;
  int iVar2;
  char *pcVar3;
  size_t sVar4;
  char *pcVar5;
  char *pcVar6;
  
  iVar2 = BN_num_bits(param_1);
  if (iVar2 < 0x80) {
    pcVar3 = BN_bn2dec(param_1);
    return pcVar3;
  }
  pcVar3 = BN_bn2hex(param_1);
  if (pcVar3 == (char *)0x0) {
    pcVar5 = (char *)0x0;
  }
  else {
    sVar4 = strlen(pcVar3);
    lVar1 = sVar4 + 3;
    pcVar5 = CRYPTO_malloc((int)lVar1,"crypto/x509/v3_utl.c",0x93);
    if (pcVar5 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_utl.c",0x95,"bignum_to_string");
      ERR_set_error(0x22,0xc0100,0);
      CRYPTO_free(pcVar3);
      pcVar5 = (char *)0x0;
    }
    else {
      if (*pcVar3 == '-') {
        OPENSSL_strlcpy(pcVar5,&DAT_002aab2c,lVar1);
        pcVar6 = pcVar3 + 1;
      }
      else {
        OPENSSL_strlcpy(pcVar5,&DAT_002b9b6c,lVar1);
        pcVar6 = pcVar3;
      }
      OPENSSL_strlcat(pcVar5,pcVar6,lVar1);
      CRYPTO_free(pcVar3);
    }
  }
  return pcVar5;
}

