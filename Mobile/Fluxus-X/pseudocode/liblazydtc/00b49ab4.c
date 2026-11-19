/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b49ab4
 */

undefined8
FUN_00b49ab4(EVP_MD *param_1,void *param_2,ulong param_3,void *param_4,ulong param_5,int param_6,
            uchar *param_7,ulong param_8)

{
  int iVar1;
  int iVar2;
  EVP_MD_CTX *out;
  EVP_MD_CTX *ctx;
  ulong uVar3;
  long lVar4;
  undefined8 uVar5;
  uchar auStack_a4 [64];
  undefined4 local_64;
  
  if (0x40000000 < param_3) {
    return 0;
  }
  if (0x40000000 < param_5) {
    return 0;
  }
  if (param_8 - 1 >> 0x1e != 0) {
    return 0;
  }
  iVar1 = EVP_MD_get_size();
  if (iVar1 < 1) {
    return 0;
  }
  out = (EVP_MD_CTX *)EVP_MD_CTX_new();
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  uVar5 = 0;
  if ((out != (EVP_MD_CTX *)0x0) && (ctx != (EVP_MD_CTX *)0x0)) {
    iVar2 = EVP_DigestInit(ctx,param_1);
    if (iVar2 != 0) {
      local_64 = 0x1000000;
      iVar2 = EVP_MD_CTX_copy_ex(out,ctx);
      if (iVar2 != 0) {
        uVar3 = (ulong)iVar1;
        lVar4 = 2;
        do {
          if ((((param_6 == 0) && (iVar1 = EVP_DigestUpdate(out,&local_64,4), iVar1 == 0)) ||
              (iVar1 = EVP_DigestUpdate(out,param_2,param_3), iVar1 == 0)) ||
             (((param_6 != 0 && (iVar1 = EVP_DigestUpdate(out,&local_64,4), iVar1 == 0)) ||
              (iVar1 = EVP_DigestUpdate(out,param_4,param_5), iVar1 == 0)))) goto LAB_00b49c78;
          if (param_8 < uVar3) {
            iVar1 = EVP_DigestFinal_ex(out,auStack_a4,(uint *)0x0);
            if (iVar1 == 0) goto LAB_00b49c78;
            memcpy(param_7,auStack_a4,param_8);
LAB_00b49c70:
            uVar5 = 1;
            break;
          }
          iVar1 = EVP_DigestFinal_ex(out,param_7,(uint *)0x0);
          if (iVar1 == 0) goto LAB_00b49c78;
          if (uVar3 == param_8) goto LAB_00b49c70;
          param_7 = param_7 + uVar3;
          local_64 = CONCAT13((char)lVar4,
                              CONCAT12((char)((ulong)lVar4 >> 8),
                                       CONCAT11((char)((ulong)lVar4 >> 0x10),
                                                (char)((ulong)lVar4 >> 0x18))));
          iVar1 = EVP_MD_CTX_copy_ex(out,ctx);
          uVar5 = 0;
          lVar4 = lVar4 + 1;
          param_8 = param_8 - uVar3;
        } while (iVar1 != 0);
        goto LAB_00b49c7c;
      }
    }
LAB_00b49c78:
    uVar5 = 0;
  }
LAB_00b49c7c:
  EVP_MD_CTX_free(out);
  EVP_MD_CTX_free(ctx);
  OPENSSL_cleanse(auStack_a4,0x40);
  return uVar5;
}

