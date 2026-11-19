/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4dda4
 */

undefined8 OSSL_DECODER_INSTANCE_get_input_structure(long param_1,uint *param_2)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != 0) {
    *param_2 = *(byte *)(param_1 + 0x20) & 1;
    uVar1 = *(undefined8 *)(param_1 + 0x18);
  }
  return uVar1;
}

