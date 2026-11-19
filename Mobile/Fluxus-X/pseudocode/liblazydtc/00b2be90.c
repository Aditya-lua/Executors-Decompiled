/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2be90
 */

undefined8 FUN_00b2be90(void)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    return 0;
  }
  uVar2 = CRYPTO_zalloc(0x18,"providers/implementations/ciphers/cipher_null.c",0x1e);
  return uVar2;
}

