/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0c67c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * CONF_get1_default_config_file(void)

{
  char *pcVar1;
  size_t sVar2;
  char *param0;
  
  pcVar1 = (char *)ossl_safe_getenv("OPENSSL_CONF");
  if (pcVar1 != (char *)0x0) {
    pcVar1 = CRYPTO_strdup(pcVar1,"crypto/conf/conf_mod.c",0x27e);
    return pcVar1;
  }
  pcVar1 = X509_get_default_cert_area();
  sVar2 = strlen(pcVar1);
  param0 = CRYPTO_malloc((int)(sVar2 + 0xd),"crypto/conf/conf_mod.c",0x285);
  if (param0 != (char *)0x0) {
    BIO_snprintf(param0,sVar2 + 0xd,"%s%s%s",pcVar1,"/","openssl.cnf");
  }
  return param0;
}

