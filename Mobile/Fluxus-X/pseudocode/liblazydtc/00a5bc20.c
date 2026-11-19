/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5bc20
 */

bool FUN_00a5bc20(EVP_CIPHER_CTX *param_1,void *param_2,uint *param_3,void *param_4,uint param_5)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  undefined8 uVar5;
  EVP_CIPHER *pEVar6;
  long lVar7;
  ulong uVar8;
  
  iVar2 = EVP_CIPHER_CTX_test_flags(param_1,0x2000);
  uVar3 = param_5;
  if (iVar2 != 0) {
    iVar2 = param_5 + 0xe;
    if (-1 < (int)(param_5 + 7)) {
      iVar2 = param_5 + 7;
    }
    uVar3 = iVar2 >> 3;
  }
  pEVar6 = param_1->cipher;
  uVar1 = pEVar6->block_size;
  if ((*(byte *)((long)&pEVar6->flags + 2) >> 4 & 1) == 0) {
    if ((int)param_5 < 1) {
      *param_3 = 0;
      return param_5 == 0;
    }
    iVar2 = param_1->buf_len;
    lVar7 = (long)iVar2;
    uVar8 = ((long)param_2 + lVar7) - (long)param_4;
    if ((((int)uVar3 < 1) || ((void *)((long)param_2 + lVar7) == param_4)) ||
       ((ulong)(long)(int)uVar3 <= uVar8 && uVar8 <= (ulong)-(long)(int)uVar3)) {
      if ((iVar2 == 0) && ((param_1->block_mask & param_5) == 0)) {
        iVar2 = (*pEVar6->cleanup)(param_1);
        if (iVar2 == 0) {
          *param_3 = 0;
          return false;
        }
        *param_3 = param_5;
        return true;
      }
      if (0x20 < (int)uVar1) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: bl <= (int)sizeof(ctx->buf)","crypto/evp/evp_enc.c",0x25b);
      }
      if (iVar2 == 0) {
        uVar3 = 0;
LAB_00a5bea4:
        uVar1 = param_5 & uVar1 - 1;
        iVar2 = param_5 - uVar1;
        *param_3 = uVar3;
        if (0 < iVar2) {
          iVar4 = (*param_1->cipher->cleanup)(param_1);
          if (iVar4 == 0) {
            return false;
          }
          *param_3 = *param_3 + iVar2;
        }
        if (uVar1 != 0) {
          memcpy(param_1->buf,(void *)((long)param_4 + (long)iVar2),(long)(int)uVar1);
        }
        param_1->buf_len = uVar1;
        return true;
      }
      iVar2 = uVar1 - iVar2;
      if ((int)param_5 < iVar2) {
        memcpy(param_1->buf + lVar7,param_4,(long)(int)param_5);
        param_1->buf_len = param_1->buf_len + param_5;
        *param_3 = 0;
        return true;
      }
      param_5 = param_5 - iVar2;
      if ((int)(param_5 & -uVar1) <= (int)(0x7fffffff - uVar1)) {
        memcpy(param_1->buf + lVar7,param_4,(long)iVar2);
        iVar4 = (*param_1->cipher->cleanup)(param_1);
        if (iVar4 == 0) {
          return false;
        }
        param_4 = (void *)((long)param_4 + (long)iVar2);
        uVar3 = uVar1;
        goto LAB_00a5bea4;
      }
      ERR_new();
      ERR_set_debug("crypto/evp/evp_enc.c",0x26d,"evp_EncryptDecryptUpdate");
      uVar5 = 0xca;
      goto LAB_00a5bd3c;
    }
    ERR_new();
    uVar5 = 0x24d;
  }
  else {
    if (uVar1 != 1) {
LAB_00a5bd48:
      uVar3 = (*pEVar6->cleanup)(param_1);
      if ((int)uVar3 < 0) {
        return false;
      }
      *param_3 = uVar3;
      return true;
    }
    if (((param_2 == param_4) || ((int)uVar3 < 1)) ||
       ((ulong)(long)(int)uVar3 <= (ulong)((long)param_2 - (long)param_4) &&
        (ulong)((long)param_2 - (long)param_4) <= (ulong)-(long)(int)uVar3)) goto LAB_00a5bd48;
    ERR_new();
    uVar5 = 0x23c;
  }
  ERR_set_debug("crypto/evp/evp_enc.c",uVar5,"evp_EncryptDecryptUpdate");
  uVar5 = 0xa2;
LAB_00a5bd3c:
  ERR_set_error(6,uVar5,0);
  return false;
}

