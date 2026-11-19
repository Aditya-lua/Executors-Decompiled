/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ce14
 */

int X509_TRUST_set(int *t,int trust)

{
  int iVar1;
  int local_48 [10];
  
  if (trust - 1U < 8) {
LAB_00b0ce38:
    iVar1 = 1;
    *t = trust;
  }
  else {
    if (DAT_00d227e8 != 0) {
      local_48[0] = trust;
      iVar1 = OPENSSL_sk_find(DAT_00d227e8,local_48);
      if ((-1 < iVar1) && (-1 < iVar1 + 8)) goto LAB_00b0ce38;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x509_trust.c",0x74,"X509_TRUST_set");
    ERR_set_error(0xb,0x7b,0);
    iVar1 = 0;
  }
  return iVar1;
}

