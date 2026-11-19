/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a03c
 */

undefined8 ossl_err_load_X509_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x580006e);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c81640);
  }
  return 1;
}

