/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da290
 */

void ossl_statem_send_fatal(long param_1,int param_2)

{
  if ((*(int *)(param_1 + 100) == 0) || (*(int *)(param_1 + 0x48) != 1)) {
    *(undefined4 *)(param_1 + 100) = 1;
    *(undefined4 *)(param_1 + 0x48) = 1;
    if ((param_2 != -1) && (*(int *)(param_1 + 0x7c) != 1)) {
      ssl3_send_alert(param_1,2);
      return;
    }
  }
  return;
}

