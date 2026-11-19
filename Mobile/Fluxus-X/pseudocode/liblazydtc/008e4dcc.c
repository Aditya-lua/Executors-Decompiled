/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4dcc
 */

void log_switch_to_file(char *param_1)

{
  DAT_00d1fee4 = 1;
  DAT_00d1fee8 = strdup(param_1);
  DAT_00d1fef0 = fopen(DAT_00d1fee8,"a+");
  return;
}

