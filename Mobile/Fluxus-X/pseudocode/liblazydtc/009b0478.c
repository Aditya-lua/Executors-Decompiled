/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0478
 */

char * OSSL_default_cipher_list(void)

{
  return "ALL:!COMPLEMENTOFDEFAULT:!eNULL";
}

