/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b75d8
 */

COMP_METHOD * SSL_get_current_expansion(SSL *s)

{
  long lVar1;
  COMP_METHOD *pCVar2;
  
  lVar1._0_4_ = s[3].init_num;
  lVar1._4_4_ = s[3].init_off;
  if (lVar1 == 0) {
    return (COMP_METHOD *)0x0;
  }
  pCVar2 = (COMP_METHOD *)COMP_CTX_get_method();
  return pCVar2;
}

