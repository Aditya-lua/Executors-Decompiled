/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00970478
 */

void FUN_00970478(void *param_1,size_t param_2,uchar *param_3)

{
  long lVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  EVP_MD *type;
  undefined8 uVar3;
  uint local_4c;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_4c = 0;
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    uVar3 = 0x1b;
  }
  else {
    type = EVP_sha256();
    iVar2 = EVP_DigestInit(ctx,type);
    if (iVar2 == 0) {
      EVP_MD_CTX_free(ctx);
      uVar3 = 2;
    }
    else {
      EVP_DigestUpdate(ctx,param_1,param_2);
      EVP_DigestFinal_ex(ctx,param_3,&local_4c);
      EVP_MD_CTX_free(ctx);
      uVar3 = 0;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

