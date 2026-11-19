/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a11b58
 */

undefined8 conf_ssl_get(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)(DAT_00d21968 + param_1 * 0x18);
  *param_2 = *puVar1;
  *param_3 = puVar1[2];
  return puVar1[1];
}

