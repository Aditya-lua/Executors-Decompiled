/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05ad4
 */

void X509V3_conf_free(CONF_VALUE *val)

{
  if (val == (CONF_VALUE *)0x0) {
    return;
  }
  CRYPTO_free(val->name);
  CRYPTO_free(val->value);
  CRYPTO_free(val->section);
  CRYPTO_free(val);
  return;
}

