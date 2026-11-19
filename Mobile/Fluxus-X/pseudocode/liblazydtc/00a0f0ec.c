/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0f0ec
 */

/* WARNING: Removing unreachable block (ram,0x00a0f190) */
/* WARNING: Removing unreachable block (ram,0x00a0f22c) */

BIO * FUN_00a0f0ec(char *param_1,undefined8 *param_2)

{
  long lVar1;
  int iVar2;
  size_t sVar3;
  char *__s;
  size_t sVar4;
  char *filename;
  BIO *pBVar5;
  BIO *unaff_x23;
  
  sVar3 = strlen(param_1);
LAB_00a0f130:
  do {
    __s = (char *)OPENSSL_DIR_read(param_2,param_1);
    if (__s == (char *)0x0) goto LAB_00a0f278;
    sVar4 = strlen(__s);
    if (sVar4 < 6) {
      if (sVar4 != 5) goto LAB_00a0f130;
LAB_00a0f174:
      iVar2 = OPENSSL_strcasecmp(__s + (sVar4 - 4),&DAT_002b2090);
      if (iVar2 != 0) goto LAB_00a0f130;
    }
    else {
      iVar2 = OPENSSL_strcasecmp(__s + (sVar4 - 5),".conf");
      if (iVar2 != 0) goto LAB_00a0f174;
    }
    lVar1 = sVar3 + 2 + sVar4;
    filename = (char *)CRYPTO_zalloc(lVar1,"crypto/conf/conf_def.c",0x364);
    if (filename == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0x366,"get_next_file");
      ERR_set_error(0xe,0xc0100,0);
      iVar2 = 3;
      goto LAB_00a0f270;
    }
    if (*filename == '\0') {
      OPENSSL_strlcpy(filename,param_1,lVar1);
      OPENSSL_strlcat(filename,&DAT_002a91de,lVar1);
    }
    OPENSSL_strlcat(filename,__s,lVar1);
    pBVar5 = BIO_new_file(filename,"r");
    CRYPTO_free(filename);
    if (pBVar5 != (BIO *)0x0) {
      iVar2 = 1;
      unaff_x23 = pBVar5;
LAB_00a0f270:
      if (iVar2 == 3) {
LAB_00a0f278:
        OPENSSL_DIR_end(param_2);
        unaff_x23 = (BIO *)0x0;
        *param_2 = 0;
      }
      return unaff_x23;
    }
  } while( true );
}

