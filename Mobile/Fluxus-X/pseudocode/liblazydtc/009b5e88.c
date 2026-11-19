/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5e88
 */

int SSL_get_servername_type(SSL *s)

{
  char *pcVar1;
  
  pcVar1 = SSL_get_servername(s,0);
  return -(uint)(pcVar1 == (char *)0x0);
}

