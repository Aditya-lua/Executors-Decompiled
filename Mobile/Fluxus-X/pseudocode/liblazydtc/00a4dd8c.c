/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4dd8c
 */

undefined8 OSSL_DECODER_INSTANCE_get_decoder(undefined8 *param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != (undefined8 *)0x0) {
    uVar1 = *param_1;
  }
  return uVar1;
}

