/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7550
 */

evp_pkey_st * SSL_get_privatekey(SSL *ssl)

{
  if (ssl[3].d1 == (dtls1_state_st *)0x0) {
    return (evp_pkey_st *)0x0;
  }
  return *(evp_pkey_st **)(*(long *)ssl[3].d1 + 8);
}

