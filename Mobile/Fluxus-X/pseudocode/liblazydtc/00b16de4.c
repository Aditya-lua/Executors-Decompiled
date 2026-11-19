/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16de4
 */

int ASN1_digest(undefined1 *i2d,EVP_MD *type,char *data,uchar *md,uint *len)

{
  undefined4 uVar1;
  int iVar2;
  void *data_00;
  void *local_48;
  
  iVar2 = (*(code *)i2d)(data,0);
  if (iVar2 < 1) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_digest.c",0x24,"ASN1_digest");
    uVar1 = 0xc0103;
  }
  else {
    data_00 = CRYPTO_malloc(iVar2,"crypto/asn1/a_digest.c",0x27);
    if (data_00 != (void *)0x0) {
      local_48 = data_00;
      (*(code *)i2d)(data,&local_48);
      iVar2 = EVP_Digest(data_00,(long)iVar2,md,len,type,(ENGINE *)0x0);
      if (iVar2 == 0) {
        CRYPTO_free(data_00);
        return 0;
      }
      CRYPTO_free(data_00);
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/a_digest.c",0x28,"ASN1_digest");
    uVar1 = 0xc0100;
  }
  ERR_set_error(0xd,uVar1,0);
  return 0;
}

