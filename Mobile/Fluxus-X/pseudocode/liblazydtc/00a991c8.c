/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a991c8
 */

undefined8 ossl_err_load_ESS_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x1b00006b);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c6cb28);
  }
  return 1;
}

