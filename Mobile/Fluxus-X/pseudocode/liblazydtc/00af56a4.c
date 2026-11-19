/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af56a4
 */

int X509V3_EXT_add(X509V3_EXT_METHOD *ext)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((DAT_00d227d8 == 0) && (DAT_00d227d8 = OPENSSL_sk_new(&LAB_00af574c), DAT_00d227d8 == 0)) {
    ERR_new();
    uVar2 = 0x1d;
  }
  else {
    iVar1 = OPENSSL_sk_push(DAT_00d227d8,ext);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x21;
  }
  ERR_set_debug("crypto/x509/v3_lib.c",uVar2,"X509V3_EXT_add");
  ERR_set_error(0x22,0xc0100,0);
  return 0;
}

