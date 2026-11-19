/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab7ea0
 */

void * PEM_ASN1_read_bio(undefined1 *d2i,char *name,BIO *bp,void **x,undefined1 *cb,void *u)

{
  int iVar1;
  void *pvVar2;
  long local_38;
  uchar *local_30;
  uchar *local_28;
  
  local_30 = (uchar *)0x0;
  local_28 = (uchar *)0x0;
  iVar1 = PEM_bytes_read_bio(&local_30,&local_38,(char **)0x0,name,bp,cb,u);
  if (iVar1 == 0) {
    pvVar2 = (void *)0x0;
  }
  else {
    local_28 = local_30;
    pvVar2 = (void *)(*(code *)d2i)(x,&local_28,local_38);
    if (pvVar2 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pem/pem_oth.c",0x21,"PEM_ASN1_read_bio");
      ERR_set_error(9,0x8000d,0);
    }
    CRYPTO_free(local_30);
  }
  return pvVar2;
}

