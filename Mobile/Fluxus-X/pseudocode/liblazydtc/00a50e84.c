/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a50e84
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int ENGINE_register_all_complete(void)

{
  ENGINE *e;
  
  e = ENGINE_get_first();
  if (e != (ENGINE *)0x0) {
    do {
      if (((byte)e[0x98] >> 3 & 1) == 0) {
        ENGINE_register_ciphers(e);
        ENGINE_register_digests(e);
        ENGINE_register_RSA(e);
        ENGINE_register_DSA(e);
        ENGINE_register_DH(e);
        ENGINE_register_EC(e);
        ENGINE_register_RAND(e);
        ENGINE_register_pkey_meths(e);
        ENGINE_register_pkey_asn1_meths(e);
      }
      e = ENGINE_get_next(e);
    } while (e != (ENGINE *)0x0);
  }
  return 1;
}

