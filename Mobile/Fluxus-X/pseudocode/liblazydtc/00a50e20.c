/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a50e20
 */

int ENGINE_register_complete(ENGINE *e)

{
  ENGINE_register_ciphers(e);
  ENGINE_register_digests(e);
  ENGINE_register_RSA(e);
  ENGINE_register_DSA(e);
  ENGINE_register_DH(e);
  ENGINE_register_EC(e);
  ENGINE_register_RAND(e);
  ENGINE_register_pkey_meths(e);
  ENGINE_register_pkey_asn1_meths(e);
  return 1;
}

