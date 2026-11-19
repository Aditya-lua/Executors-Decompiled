/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69ba4
 */

int EVP_PBE_alg_add_type(int pbe_type,int pbe_nid,int cipher_nid,int md_nid,undefined1 *keygen)

{
  int iVar1;
  int *ptr;
  
  if (((DAT_00d21b40 != 0) || (DAT_00d21b40 = OPENSSL_sk_new(&LAB_00a69c90), DAT_00d21b40 != 0)) &&
     (ptr = (int *)CRYPTO_zalloc(0x20,"crypto/evp/evp_pbe.c",0xcb), ptr != (int *)0x0)) {
    *ptr = pbe_type;
    ptr[1] = pbe_nid;
    ptr[2] = cipher_nid;
    ptr[3] = md_nid;
    *(undefined1 **)(ptr + 4) = keygen;
    iVar1 = OPENSSL_sk_push(DAT_00d21b40,ptr);
    if (iVar1 != 0) {
      return 1;
    }
    CRYPTO_free(ptr);
  }
  ERR_new();
  ERR_set_debug("crypto/evp/evp_pbe.c",0xdb,"EVP_PBE_alg_add_type");
  ERR_set_error(6,0xc0100,0);
  return 0;
}

