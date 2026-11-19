/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02734
 */

int X509_PURPOSE_set(int *p,int purpose)

{
  int iVar1;
  int local_50 [12];
  
  if (purpose - 1U < 9) {
LAB_00b02774:
    iVar1 = 1;
    *p = purpose;
  }
  else {
    if (DAT_00d227e0 != 0) {
      local_50[0] = purpose;
      iVar1 = OPENSSL_sk_find(DAT_00d227e0,local_50);
      if (-1 < iVar1) goto LAB_00b02774;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_purp.c",0x65,"X509_PURPOSE_set");
    ERR_set_error(0x22,0x92,0);
    iVar1 = 0;
  }
  return iVar1;
}

