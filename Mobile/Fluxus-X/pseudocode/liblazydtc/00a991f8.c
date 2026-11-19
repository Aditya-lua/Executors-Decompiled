/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a991f8
 */

undefined8 ossl_err_load_EVP_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x300008f);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c6cbc8);
  }
  return 1;
}

