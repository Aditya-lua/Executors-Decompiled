/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32710
 */

long SSL_CTX_ctrl(SSL_CTX *ctx,int cmd,long larg,void *parg)

{
  long lVar1;
  
  lVar1 = SSL_CTX_ctrl(ctx,cmd,larg,parg);
  return lVar1;
}

