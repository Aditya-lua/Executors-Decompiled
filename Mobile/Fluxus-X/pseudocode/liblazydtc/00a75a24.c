/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75a24
 */

int EVP_PKEY_meth_add0(EVP_PKEY_METHOD *pmeth)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((DAT_00d21b48 == 0) && (DAT_00d21b48 = OPENSSL_sk_new(&LAB_00a75ad4), DAT_00d21b48 == 0)) {
    ERR_new();
    uVar2 = 0x277;
  }
  else {
    iVar1 = OPENSSL_sk_push(DAT_00d21b48,pmeth);
    if (iVar1 != 0) {
      OPENSSL_sk_sort(DAT_00d21b48);
      return 1;
    }
    ERR_new();
    uVar2 = 0x27c;
  }
  ERR_set_debug("crypto/evp/pmeth_lib.c",uVar2,"EVP_PKEY_meth_add0");
  ERR_set_error(6,0xc0100,0);
  return 0;
}

