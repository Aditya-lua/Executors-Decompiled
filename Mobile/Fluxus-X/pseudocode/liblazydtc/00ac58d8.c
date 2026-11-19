/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac58d8
 */

undefined8 ossl_err_load_PROP_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x1b800064);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c7c6a0);
  }
  return 1;
}

