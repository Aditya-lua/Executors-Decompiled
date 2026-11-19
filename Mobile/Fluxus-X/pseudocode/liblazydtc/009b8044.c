/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8044
 */

void SSL_set0_security_ex_data(long param_1,undefined8 param_2)

{
  *(undefined8 *)(*(long *)(param_1 + 0x898) + 0x1f8) = param_2;
  return;
}

