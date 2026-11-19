/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be2f4
 */

int SSL_CTX_remove_session(SSL_CTX *param_1,SSL_SESSION *c)

{
  int iVar1;
  
  iVar1 = FUN_009be2fc((int)param_1,c,1);
  return iVar1;
}

