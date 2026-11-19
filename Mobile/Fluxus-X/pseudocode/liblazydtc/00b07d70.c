/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b07d70
 */

undefined8 ossl_err_load_X509V3_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x11000076);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00c811f0);
  }
  return 1;
}

