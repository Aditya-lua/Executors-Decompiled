/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a11bfc
 */

void conf_ssl_get_cmd(long param_1,long param_2,undefined8 *param_3,undefined8 *param_4)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)(param_1 + param_2 * 0x10);
  *param_3 = *puVar1;
  *param_4 = puVar1[1];
  return;
}

