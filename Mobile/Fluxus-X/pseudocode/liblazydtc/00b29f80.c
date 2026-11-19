/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b29f80
 */

void ossl_chacha20_initctx(undefined8 param_1)

{
  undefined8 uVar1;
  
  uVar1 = ossl_prov_cipher_hw_chacha20(0x100);
  ossl_cipher_generic_initkey(param_1,0x100,8,0x80,0,2,uVar1,0);
  return;
}

