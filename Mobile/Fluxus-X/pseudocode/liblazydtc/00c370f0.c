/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c370f0
 */

int EVP_PKEY_CTX_ctrl(EVP_PKEY_CTX *ctx,int keytype,int optype,int cmd,int p1,void *p2)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_CTX_ctrl(ctx,keytype,optype,cmd,p1,p2);
  return iVar1;
}

