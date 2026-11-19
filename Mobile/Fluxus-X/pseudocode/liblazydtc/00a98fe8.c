/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98fe8
 */

undefined8 ossl_err_load_COMP_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x14800063);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c6ba18);
  }
  return 1;
}

