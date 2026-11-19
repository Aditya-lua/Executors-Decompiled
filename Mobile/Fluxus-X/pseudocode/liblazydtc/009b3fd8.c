/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3fd8
 */

void SSL_set_read_ahead(SSL *s,int yes)

{
  *(int *)&s[4].client_CA = yes;
  return;
}

