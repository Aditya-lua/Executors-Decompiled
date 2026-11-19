/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b452cc
 */

undefined8
FUN_00b452cc(EVP_MD *param_1,void *param_2,int param_3,uchar *param_4,size_t param_5,long param_6,
            ulong param_7)

{
  size_t __n;
  ulong uVar1;
  int iVar2;
  HMAC_CTX *ctx;
  ulong len;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  uchar local_a4 [4];
  uchar auStack_a0 [64];
  
  iVar2 = EVP_MD_get_size();
  if (0 < iVar2) {
    len = (ulong)iVar2;
    uVar1 = 0;
    if (len != 0) {
      uVar1 = param_7 / len;
    }
    if (param_7 != uVar1 * len) {
      uVar1 = uVar1 + 1;
    }
    if (param_6 != 0) {
      if (0xff < uVar1) {
        return 0;
      }
      ctx = (HMAC_CTX *)HMAC_CTX_new();
      if (ctx != (HMAC_CTX *)0x0) {
        iVar2 = HMAC_Init_ex(ctx,param_2,param_3,param_1,(ENGINE *)0x0);
        if (iVar2 == 0) {
LAB_00b45428:
          uVar4 = 0;
        }
        else {
          if (uVar1 != 0) {
            lVar3 = 0;
            uVar5 = 1;
            do {
              local_a4[0] = (uchar)uVar5;
              if ((((1 < (uint)uVar5) &&
                   ((iVar2 = HMAC_Init_ex(ctx,(void *)0x0,0,(EVP_MD *)0x0,(ENGINE *)0x0), iVar2 == 0
                    || (iVar2 = HMAC_Update(ctx,auStack_a0,len), iVar2 == 0)))) ||
                  (iVar2 = HMAC_Update(ctx,param_4,param_5), iVar2 == 0)) ||
                 ((iVar2 = HMAC_Update(ctx,local_a4,1), iVar2 == 0 ||
                  (iVar2 = HMAC_Final(ctx,auStack_a0,(uint *)0x0), iVar2 == 0)))) goto LAB_00b45428;
              __n = param_7 - lVar3;
              if (len <= param_7 - lVar3) {
                __n = len;
              }
              memcpy((void *)(param_6 + lVar3),auStack_a0,__n);
              uVar5 = (ulong)((uint)uVar5 + 1);
              lVar3 = __n + lVar3;
            } while (uVar5 <= uVar1);
          }
          uVar4 = 1;
        }
        OPENSSL_cleanse(auStack_a0,0x40);
        HMAC_CTX_free(ctx);
        return uVar4;
      }
    }
  }
  return 0;
}

