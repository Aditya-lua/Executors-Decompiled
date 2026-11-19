/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7c244
 */

int EVP_PKEY_verify(EVP_PKEY_CTX *ctx,uchar *sig,size_t siglen,uchar *tbs,size_t tbslen)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  if (ctx == (EVP_PKEY_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/signature.c",0x2ae,"EVP_PKEY_verify");
    uVar2 = 0xc0102;
  }
  else {
    if (*(int *)ctx == 0x20) {
      if (*(long *)(ctx + 0x30) == 0) {
        if ((*(long *)(ctx + 0x78) != 0) &&
           (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(ctx + 0x78) + 0x58),
           UNRECOVERED_JUMPTABLE != (code *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x00a7c2f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          iVar1 = (*UNRECOVERED_JUMPTABLE)();
          return iVar1;
        }
        ERR_new();
        uVar2 = 0x2c5;
      }
      else {
        if (*(code **)(*(long *)(ctx + 0x28) + 0x50) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a7c278. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          iVar1 = (**(code **)(*(long *)(ctx + 0x28) + 0x50))(*(long *)(ctx + 0x30));
          return iVar1;
        }
        ERR_new();
        uVar2 = 699;
      }
      ERR_set_debug("crypto/evp/signature.c",uVar2,"EVP_PKEY_verify");
      ERR_set_error(6,0x96,0);
      return -2;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/signature.c",0x2b3,"EVP_PKEY_verify");
    uVar2 = 0x97;
  }
  ERR_set_error(6,uVar2,0);
  return -1;
}

