/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be948
 */

void SSL_SESSION_get0_ticket(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  *param_3 = *(undefined8 *)(param_1 + 0x340);
  if (param_2 != (undefined8 *)0x0) {
    *param_2 = *(undefined8 *)(param_1 + 0x338);
  }
  return;
}

