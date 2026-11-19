/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2c90
 */

undefined8 psa_driver_wrapper_export_public_key(long param_1)

{
  undefined8 uVar1;
  
  if (*(uint *)(param_1 + 4) < 0x100) {
    uVar1 = psa_export_public_key_internal();
    return uVar1;
  }
  return 0xffffff79;
}

