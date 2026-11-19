/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3e374
 */

void ossl_ecx_key_allocate_privkey(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = CRYPTO_secure_zalloc(*(undefined8 *)(param_1 + 0x58),"crypto/ec/ecx_key.c",0x5f);
  *(undefined8 *)(param_1 + 0x50) = uVar1;
  return;
}

