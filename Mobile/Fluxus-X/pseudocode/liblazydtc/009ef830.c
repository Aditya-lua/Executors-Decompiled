/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef830
 */

void * ASN1_dup(undefined1 *i2d,undefined1 *d2i,void *x)

{
  int iVar1;
  void *ptr;
  void *pvVar2;
  void *local_40;
  void *local_38;
  
  if ((x != (void *)0x0) && (iVar1 = (*(code *)i2d)(x,0), 0 < iVar1)) {
    ptr = CRYPTO_malloc(iVar1 + 10,"crypto/asn1/a_dup.c",0x1e);
    if (ptr != (void *)0x0) {
      local_38 = ptr;
      iVar1 = (*(code *)i2d)(x,&local_38);
      local_40 = ptr;
      pvVar2 = (void *)(*(code *)d2i)(0,&local_40,(long)iVar1);
      CRYPTO_free(ptr);
      return pvVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/a_dup.c",0x20,"ASN1_dup");
    ERR_set_error(0xd,0xc0100,0);
  }
  return (void *)0x0;
}

