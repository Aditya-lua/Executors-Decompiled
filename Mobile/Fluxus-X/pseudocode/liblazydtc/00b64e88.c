/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64e88
 */

undefined8 ossl_err_load_PROV_strings(void)

{
  char *pcVar1;
  
  pcVar1 = ERR_reason_error_string(0x1c8000b8);
  if (pcVar1 == (char *)0x0) {
    ERR_load_strings_const(&DAT_00ca6368);
  }
  return 1;
}

