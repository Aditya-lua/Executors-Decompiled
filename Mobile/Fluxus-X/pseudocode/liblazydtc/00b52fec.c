/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b52fec
 */

void * FUN_00b52fec(void *param_1)

{
  int iVar1;
  void *__dest;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    __dest = (void *)0x0;
  }
  else {
    __dest = (void *)CRYPTO_zalloc(0xc0,"providers/implementations/macs/blake2_mac_impl.c",0x41);
    if (__dest != (void *)0x0) {
      memcpy(__dest,param_1,0xc0);
    }
  }
  return __dest;
}

