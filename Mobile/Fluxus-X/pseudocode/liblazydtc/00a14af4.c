/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14af4
 */

int SCT_CTX_verify(long *param_1,int *param_2)

{
  size_t *psVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  undefined8 uVar3;
  void *d;
  size_t cnt;
  undefined1 local_3c;
  undefined1 local_3b;
  undefined1 local_3a;
  undefined1 local_39;
  undefined1 local_38;
  undefined1 local_37;
  undefined1 local_36;
  undefined1 local_35;
  undefined1 local_34;
  undefined1 local_33;
  undefined1 local_32;
  undefined1 local_31;
  
  iVar2 = SCT_is_complete(param_2);
  if ((((iVar2 == 0) || (*param_1 == 0)) || (param_2[0x16] == -1)) ||
     ((param_2[0x16] == 1 && (param_1[3] == 0)))) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_vfy.c",0x68,"SCT_CTX_verify");
    uVar3 = 0x6a;
LAB_00a14b94:
    ERR_set_error(0x32,uVar3,0);
    return 0;
  }
  if (*param_2 != 0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_vfy.c",0x6c,"SCT_CTX_verify");
    uVar3 = 0x73;
    goto LAB_00a14b94;
  }
  if ((*(size_t *)(param_2 + 8) != param_1[2]) ||
     (iVar2 = memcmp(*(void **)(param_2 + 6),(void *)param_1[1],*(size_t *)(param_2 + 8)),
     iVar2 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_vfy.c",0x71,"SCT_CTX_verify");
    uVar3 = 0x72;
    goto LAB_00a14b94;
  }
  if ((ulong)param_1[9] < *(ulong *)(param_2 + 10)) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_vfy.c",0x75,"SCT_CTX_verify");
    uVar3 = 0x74;
    goto LAB_00a14b94;
  }
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if ((((ctx != (EVP_MD_CTX *)0x0) &&
       (iVar2 = EVP_DigestVerifyInit_ex(ctx,0,"SHA2-256",param_1[10],param_1[0xb],*param_1,0),
       iVar2 != 0)) && (iVar2 = param_2[0x16], iVar2 != -1)) && ((iVar2 != 1 || (param_1[3] != 0))))
  {
    local_3b = 0;
    local_3c = (undefined1)*param_2;
    uVar3 = *(undefined8 *)(param_2 + 10);
    local_31 = (undefined1)iVar2;
    local_3a = (undefined1)((ulong)uVar3 >> 0x38);
    local_39 = (undefined1)((ulong)uVar3 >> 0x30);
    local_38 = (undefined1)((ulong)uVar3 >> 0x28);
    local_37 = (undefined1)((ulong)uVar3 >> 0x20);
    local_36 = (undefined1)((ulong)uVar3 >> 0x18);
    local_35 = (undefined1)((ulong)uVar3 >> 0x10);
    local_34 = (undefined1)((ulong)uVar3 >> 8);
    local_33 = (undefined1)uVar3;
    local_32 = (undefined1)((uint)iVar2 >> 8);
    iVar2 = EVP_DigestUpdate(ctx,&local_3c,0xc);
    if (iVar2 != 0) {
      if (param_2[0x16] == 0) {
        psVar1 = (size_t *)(param_1 + 6);
        d = (void *)param_1[5];
      }
      else {
        iVar2 = EVP_DigestUpdate(ctx,(void *)param_1[3],param_1[4]);
        if (iVar2 == 0) goto LAB_00a14dec;
        psVar1 = (size_t *)(param_1 + 8);
        d = (void *)param_1[7];
      }
      if (d != (void *)0x0) {
        cnt = *psVar1;
        local_3c = (undefined1)(cnt >> 0x10);
        local_3b = (undefined1)(cnt >> 8);
        local_3a = (undefined1)cnt;
        iVar2 = EVP_DigestUpdate(ctx,&local_3c,3);
        if ((iVar2 != 0) && (iVar2 = EVP_DigestUpdate(ctx,d,cnt), iVar2 != 0)) {
          local_3c = (undefined1)((ulong)*(undefined8 *)(param_2 + 0xe) >> 8);
          local_3b = (undefined1)*(undefined8 *)(param_2 + 0xe);
          iVar2 = EVP_DigestUpdate(ctx,&local_3c,2);
          if ((iVar2 != 0) &&
             ((*(size_t *)(param_2 + 0xe) == 0 ||
              (iVar2 = EVP_DigestUpdate(ctx,*(void **)(param_2 + 0xc),*(size_t *)(param_2 + 0xe)),
              iVar2 != 0)))) {
            iVar2 = EVP_DigestVerifyFinal
                              (ctx,*(uchar **)(param_2 + 0x12),*(size_t *)(param_2 + 0x14));
            if (iVar2 == 0) {
              ERR_new();
              ERR_set_debug("crypto/ct/ct_vfy.c",0x88,"SCT_CTX_verify");
              ERR_set_error(0x32,0x6b,0);
            }
            goto LAB_00a14df0;
          }
        }
      }
    }
  }
LAB_00a14dec:
  iVar2 = 0;
LAB_00a14df0:
  EVP_MD_CTX_free(ctx);
  return iVar2;
}

