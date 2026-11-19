/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b802c
 */

void SSL_set_security_callback(long param_1,undefined8 param_2)

{
  *(undefined8 *)(*(long *)(param_1 + 0x898) + 0x1e8) = param_2;
  return;
}

