/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae93dc
 */

undefined8 ossl_err_load_OSSL_STORE_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x1600006b);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c7dcf0);
  }
  return 1;
}

