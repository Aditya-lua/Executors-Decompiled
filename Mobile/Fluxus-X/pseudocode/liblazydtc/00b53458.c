/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53458
 */

undefined8 * FUN_00b53458(undefined8 param_1)

{
  int iVar1;
  undefined8 *ptr;
  CMAC_CTX *pCVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    ptr = (undefined8 *)CRYPTO_zalloc(0x28,"providers/implementations/macs/cmac_prov.c",0x3a);
    if (ptr != (undefined8 *)0x0) {
      pCVar2 = CMAC_CTX_new();
      ptr[1] = pCVar2;
      if (pCVar2 != (CMAC_CTX *)0x0) {
        *ptr = param_1;
        return ptr;
      }
    }
    CRYPTO_free(ptr);
  }
  return (undefined8 *)0x0;
}

