/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0be8
 */

undefined8 SSL_COMP_set0_compression_methods(undefined8 param_1)

{
  undefined8 uVar1;
  
  uVar1 = DAT_00d218b8;
  DAT_00d218b8 = param_1;
  return uVar1;
}

