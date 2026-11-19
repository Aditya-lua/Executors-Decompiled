/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1d11c
 */

long X509_PUBKEY_get0(long param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_pubkey.c",0x1c4,"X509_PUBKEY_get0");
    uVar1 = 0xb;
    uVar2 = 0xc0102;
  }
  else {
    if (*(long *)(param_1 + 0x10) != 0) {
      return *(long *)(param_1 + 0x10);
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x_pubkey.c",0x1ca,"X509_PUBKEY_get0");
    uVar1 = 6;
    uVar2 = 0x72;
  }
  ERR_set_error(uVar1,uVar2,0);
  return 0;
}

