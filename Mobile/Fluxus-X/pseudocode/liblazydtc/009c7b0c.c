/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7b0c
 */

void tls13_alert_code(int param_1)

{
  if ((param_1 == 0x6d) || (param_1 == 0x74)) {
    return;
  }
  tls1_alert_code();
  return;
}

