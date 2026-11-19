/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b55820
 */

void * FUN_00b55820(void *param_1)

{
  int iVar1;
  void *__dest;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    __dest = (void *)0x0;
  }
  else {
    __dest = CRYPTO_malloc(0x108,"providers/implementations/macs/poly1305_prov.c",0x44);
    if (__dest != (void *)0x0) {
      memcpy(__dest,param_1,0x108);
    }
  }
  return __dest;
}

