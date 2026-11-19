/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b534c8
 */

undefined8 * FUN_00b534c8(undefined8 *param_1)

{
  int iVar1;
  undefined8 *ptr;
  CMAC_CTX *out;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    uVar2 = *param_1;
    iVar1 = ossl_prov_is_running();
    if (iVar1 != 0) {
      ptr = (undefined8 *)CRYPTO_zalloc(0x28,"providers/implementations/macs/cmac_prov.c",0x3a);
      if (ptr != (undefined8 *)0x0) {
        out = CMAC_CTX_new();
        ptr[1] = out;
        if (out != (CMAC_CTX *)0x0) {
          *ptr = uVar2;
          iVar1 = CMAC_CTX_copy(out,(CMAC_CTX *)param_1[1]);
          if ((iVar1 != 0) && (iVar1 = ossl_prov_cipher_copy(ptr + 2,param_1 + 2), iVar1 != 0)) {
            return ptr;
          }
          CMAC_CTX_free((CMAC_CTX *)ptr[1]);
          ossl_prov_cipher_reset(ptr + 2);
        }
      }
      CRYPTO_free(ptr);
    }
  }
  return (undefined8 *)0x0;
}

