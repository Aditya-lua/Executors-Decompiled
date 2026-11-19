/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a763fc
 */

int EVP_PKEY_CTX_ctrl(EVP_PKEY_CTX *ctx,int keytype,int optype,int cmd,int p1,void *p2)

{
  int iVar1;
  
  if (ctx == (EVP_PKEY_CTX *)0x0) {
    ERR_new(0,keytype,optype,cmd,p1);
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x583,"EVP_PKEY_CTX_ctrl");
    ERR_set_error(6,0x93,0);
    return -2;
  }
  ERR_set_mark();
  iVar1 = FUN_00a772a4(ctx,keytype,optype,cmd,0,p2,(long)p1);
  if (iVar1 == -2) {
    ERR_pop_to_mark();
  }
  else {
    ERR_clear_last_mark();
    if (iVar1 < 1) {
      return iVar1;
    }
    if (*(int *)ctx == 0) {
      return iVar1;
    }
  }
  iVar1 = FUN_00a77554(ctx,keytype,optype,cmd,p1,p2);
  return iVar1;
}

