/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bee48
 */

undefined8 SSL_SESSION_get0_ticket_appdata(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  *param_2 = *(undefined8 *)(param_1 + 0x378);
  *param_3 = *(undefined8 *)(param_1 + 0x380);
  return 1;
}

