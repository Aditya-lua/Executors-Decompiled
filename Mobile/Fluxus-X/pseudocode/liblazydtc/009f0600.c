/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0600
 */

int EVP_PKEY_asn1_add0(EVP_PKEY_ASN1_METHOD *ameth)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 local_170 [80];
  
  memset(local_170,0,0x140);
  if (*(long *)(ameth + 0x10) == 0) {
    if ((*(ulong *)(ameth + 8) & 1) != 0) goto LAB_009f0634;
  }
  else if ((*(ulong *)(ameth + 8) & 1) == 0) {
LAB_009f0634:
    if ((DAT_00d218e0 == 0) && (DAT_00d218e0 = OPENSSL_sk_new(&LAB_009f06fc), DAT_00d218e0 == 0)) {
      return 0;
    }
    local_170[0] = *(undefined4 *)ameth;
    iVar1 = OPENSSL_sk_find(DAT_00d218e0,local_170);
    if (iVar1 < 0) {
      iVar1 = OPENSSL_sk_push(DAT_00d218e0,ameth);
      if (iVar1 == 0) {
        return 0;
      }
      OPENSSL_sk_sort(DAT_00d218e0);
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/ameth_lib.c",0xab,"EVP_PKEY_asn1_add0");
    uVar2 = 0xb3;
    goto LAB_009f06bc;
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/ameth_lib.c",0x9e,"EVP_PKEY_asn1_add0");
  uVar2 = 0x80106;
LAB_009f06bc:
  ERR_set_error(6,uVar2,0);
  return 0;
}

