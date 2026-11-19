/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9c08
 */

int ASN1_i2d_bio(undefined1 *i2d,BIO *out,uchar *x)

{
  int iVar1;
  int iVar2;
  void *data;
  int iVar3;
  void *local_38;
  
  iVar1 = (*(code *)i2d)(x,0);
  if (iVar1 < 1) {
    iVar1 = 0;
  }
  else {
    data = CRYPTO_malloc(iVar1,"crypto/asn1/a_i2d_fp.c",0x2c);
    if (data == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_i2d_fp.c",0x2e,"ASN1_i2d_bio");
      ERR_set_error(0xd,0xc0100,0);
      iVar1 = 0;
    }
    else {
      local_38 = data;
      (*(code *)i2d)(x,&local_38);
      iVar2 = BIO_write(out,data,iVar1);
      if (iVar1 != iVar2) {
        iVar3 = 0;
        do {
          if (iVar2 < 1) {
            iVar1 = 0;
            goto LAB_00ab9cfc;
          }
          iVar3 = iVar2 + iVar3;
          iVar1 = iVar1 - iVar2;
          iVar2 = BIO_write(out,(void *)((long)data + (long)iVar3),iVar1);
        } while (iVar1 != iVar2);
      }
      iVar1 = 1;
LAB_00ab9cfc:
      CRYPTO_free(data);
    }
  }
  return iVar1;
}

