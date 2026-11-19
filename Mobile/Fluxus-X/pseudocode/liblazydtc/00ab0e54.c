/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0e54
 */

undefined8 ossl_err_load_OCSP_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x13800065);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c7a948);
  }
  return 1;
}

