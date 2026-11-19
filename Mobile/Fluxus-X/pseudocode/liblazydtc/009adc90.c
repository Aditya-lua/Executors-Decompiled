/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009adc90
 */

undefined8 ssl_cert_get_cert_store(long param_1,undefined8 *param_2,int param_3)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)(param_1 + 0x1d0);
  if (param_3 != 0) {
    puVar1 = (undefined8 *)(param_1 + 0x1c8);
  }
  *param_2 = *puVar1;
  return 1;
}

