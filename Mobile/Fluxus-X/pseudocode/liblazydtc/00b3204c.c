/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3204c
 */

undefined8 FUN_00b3204c(void)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    return 0;
  }
  uVar2 = CRYPTO_zalloc(0x70,"providers/implementations/digests/sha2_prov.c",0x4a);
  return uVar2;
}

