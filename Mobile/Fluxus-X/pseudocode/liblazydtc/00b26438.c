/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b26438
 */

int ossl_siv128_encrypt(long param_1,uchar *param_2,uchar *param_3,int param_4)

{
  int iVar1;
  EVP_CIPHER_CTX *ctx;
  undefined8 local_50;
  uint uStack_48;
  uint uStack_44;
  int local_34;
  
  if (*(int *)(param_1 + 0x3c) != 0) {
    *(int *)(param_1 + 0x3c) = *(int *)(param_1 + 0x3c) + -1;
    iVar1 = FUN_00b2650c(param_1,&local_50,param_2);
    if (iVar1 != 0) {
      *(ulong *)(param_1 + 0x18) = CONCAT44(uStack_44,uStack_48);
      *(undefined8 *)(param_1 + 0x10) = local_50;
      uStack_48 = uStack_48 & 0xffffff7f;
      uStack_44 = uStack_44 & 0xffffff7f;
      ctx = *(EVP_CIPHER_CTX **)(param_1 + 0x20);
      local_34 = param_4;
      iVar1 = EVP_CipherInit_ex(ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,(uchar *)&local_50,
                                1);
      if ((iVar1 != 0) &&
         (iVar1 = EVP_EncryptUpdate(ctx,param_3,&local_34,param_2,param_4), iVar1 != 0)) {
        *(undefined4 *)(param_1 + 0x38) = 0;
        return param_4;
      }
    }
  }
  return 0;
}

