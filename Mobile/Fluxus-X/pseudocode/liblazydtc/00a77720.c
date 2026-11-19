/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77720
 */

int EVP_PKEY_CTX_ctrl_str(EVP_PKEY_CTX *ctx,char *type,char *value)

{
  int iVar1;
  size_t sVar2;
  
  ERR_set_mark();
  sVar2 = strlen(value);
  iVar1 = FUN_00a772a4(ctx,0xffffffff,0xffffffff,0xffffffff,type,value,sVar2 + 1);
  if (iVar1 == -2) {
    ERR_pop_to_mark();
  }
  else {
    ERR_clear_last_mark();
    if ((iVar1 < 1) || (*(int *)ctx == 0)) {
      return iVar1;
    }
  }
  iVar1 = FUN_00a777c0(ctx,type,value);
  return iVar1;
}

