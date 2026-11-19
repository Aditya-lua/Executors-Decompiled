/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b3f0
 */

void X509_CRL_set_default_method(undefined *param_1)

{
  PTR_DAT_00cc9d60 = &DAT_00cc9d38;
  if (param_1 != (undefined *)0x0) {
    PTR_DAT_00cc9d60 = param_1;
  }
  return;
}

