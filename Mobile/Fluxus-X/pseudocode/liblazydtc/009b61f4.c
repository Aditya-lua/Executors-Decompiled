/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b61f4
 */

undefined8 SSL_export_keying_material_early(int *param_1)

{
  undefined8 uVar1;
  
  if (*param_1 == 0x304) {
    uVar1 = tls13_export_keying_material_early();
    return uVar1;
  }
  return 0;
}

