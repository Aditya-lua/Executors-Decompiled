/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b32430
 */

undefined8 FUN_00b32430(void)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    return 0;
  }
  uVar2 = CRYPTO_zalloc(0xd8,"providers/implementations/digests/sha2_prov.c",0x59);
  return uVar2;
}

