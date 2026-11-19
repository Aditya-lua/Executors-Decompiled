/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1be00
 */

int X509_NAME_print(BIO *bp,X509_NAME *name,int obase)

{
  int iVar1;
  int iVar2;
  char *ptr;
  char cVar3;
  char *data;
  char *pcVar4;
  
  ptr = X509_NAME_oneline(name,(char *)0x0,0);
  iVar1 = 0;
  if (ptr != (char *)0x0) {
    if (*ptr != '\0') {
      data = ptr + 1;
      pcVar4 = data;
LAB_00b1be48:
      do {
        cVar3 = *pcVar4;
        if (cVar3 == '/') {
          iVar1 = ossl_isupper(pcVar4[1]);
          if ((iVar1 == 0) ||
             ((pcVar4[2] != '=' && ((iVar1 = ossl_isupper(), iVar1 == 0 || (pcVar4[3] != '=')))))) {
            cVar3 = *pcVar4;
            goto LAB_00b1be84;
          }
        }
        else {
LAB_00b1be84:
          if (cVar3 != '\0') {
            pcVar4 = pcVar4 + 1;
            if (cVar3 == '\0') break;
            goto LAB_00b1be48;
          }
        }
        iVar1 = (int)pcVar4 - (int)data;
        iVar2 = BIO_write(bp,data,iVar1);
        if (iVar2 != iVar1) {
LAB_00b1bf0c:
          ERR_new();
          ERR_set_debug("crypto/x509/x_name.c",0x219,"X509_NAME_print");
          ERR_set_error(0xb,0x80007,0);
          CRYPTO_free(ptr);
          return 0;
        }
        if (*pcVar4 == '\0') break;
        iVar1 = BIO_write(bp,&DAT_002a715d,2);
        if (iVar1 != 2) goto LAB_00b1bf0c;
        cVar3 = *pcVar4;
        data = pcVar4 + 1;
        pcVar4 = data;
      } while (cVar3 != '\0');
    }
    CRYPTO_free(ptr);
    iVar1 = 1;
  }
  return iVar1;
}

