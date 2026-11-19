/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5c9c
 */

SRTP_PROTECTION_PROFILE * SSL_get_selected_srtp_profile(SSL *s)

{
  return (SRTP_PROTECTION_PROFILE *)s[4].read_hash;
}

