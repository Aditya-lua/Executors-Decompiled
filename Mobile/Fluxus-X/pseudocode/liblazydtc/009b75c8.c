/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b75c8
 */

COMP_METHOD * SSL_get_current_compression(SSL *s)

{
  COMP_METHOD *pCVar1;
  
  if (s[3].init_msg == (void *)0x0) {
    return (COMP_METHOD *)0x0;
  }
  pCVar1 = (COMP_METHOD *)COMP_CTX_get_method();
  return pCVar1;
}

