/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b1748
 */

undefined8 ossl_err_load_SSL_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0xa000123);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c55530);
  }
  return 1;
}

