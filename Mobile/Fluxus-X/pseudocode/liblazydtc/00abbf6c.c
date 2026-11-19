/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abbf6c
 */

int PKCS12_verify_mac(PKCS12 *p12,char *pass,int passlen)

{
  int iVar1;
  uint uVar2;
  void *b;
  undefined8 uVar3;
  ASN1_STRING *local_68;
  undefined1 auStack_60 [64];
  uint local_14;
  
  if (p12->mac == (PKCS12_MAC_DATA *)0x0) {
    ERR_new(p12,pass,passlen);
    ERR_set_debug("crypto/pkcs12/p12_mutl.c",0xc0,"PKCS12_verify_mac");
    uVar3 = 0x6c;
  }
  else {
    iVar1 = FUN_00abbc20();
    if (iVar1 != 0) {
      X509_SIG_get0(p12->mac->dinfo,0,&local_68);
      uVar2 = ASN1_STRING_length(local_68);
      if (local_14 == uVar2) {
        b = (void *)ASN1_STRING_get0_data(local_68);
        iVar1 = CRYPTO_memcmp(auStack_60,b,(ulong)local_14);
        return (uint)(iVar1 == 0);
      }
      return 0;
    }
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_mutl.c",0xc4,"PKCS12_verify_mac");
    uVar3 = 0x6d;
  }
  ERR_set_error(0x23,uVar3,0);
  return 0;
}

