/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf4c0
 */

int OBJ_add_sigid(int signid,int dig_id,int pkey_id)

{
  int iVar1;
  int *ptr;
  
  if ((DAT_00d22190 == 0) && (DAT_00d22190 = OPENSSL_sk_new(&LAB_00aaf5dc), DAT_00d22190 == 0)) {
    return 0;
  }
  if ((DAT_00d22198 == 0) && (DAT_00d22198 = OPENSSL_sk_new(&LAB_00aaf5f4), DAT_00d22198 == 0)) {
    return 0;
  }
  ptr = CRYPTO_malloc(0xc,"crypto/objects/obj_xref.c",0x6a);
  if (ptr == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/objects/obj_xref.c",0x6b,"OBJ_add_sigid");
    ERR_set_error(8,0xc0100,0);
  }
  else {
    *ptr = signid;
    ptr[1] = dig_id;
    ptr[2] = pkey_id;
    iVar1 = OPENSSL_sk_push(DAT_00d22190,ptr);
    if (iVar1 != 0) {
      iVar1 = OPENSSL_sk_push(DAT_00d22198,ptr);
      if (iVar1 == 0) {
        return 0;
      }
      OPENSSL_sk_sort(DAT_00d22190);
      OPENSSL_sk_sort(DAT_00d22198);
      return 1;
    }
    CRYPTO_free(ptr);
  }
  return 0;
}

