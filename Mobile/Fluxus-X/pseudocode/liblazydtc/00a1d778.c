/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1d778
 */

bool FUN_00a1d778(int param_1,BIGNUM *param_2,int param_3,int param_4,int param_5,undefined4 param_6
                 ,undefined8 param_7)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  byte *s;
  BIGNUM *pBVar7;
  byte bVar8;
  uint uVar9;
  long lVar10;
  byte local_64 [4];
  
  uVar6 = ossl_bn_get_libctx(param_7);
  if (param_3 == 0) {
    if ((param_4 == -1) && (param_5 == 0)) {
      BN_zero_ex(param_2);
      return true;
    }
LAB_00a1d8e8:
    ERR_new();
    ERR_set_debug("crypto/bn/bn_rand.c",0x62,"bnrand");
    ERR_set_error(3,0x76,0);
    return false;
  }
  if ((param_3 < 0) || ((uVar9 = param_3 - 1, uVar9 == 0 && (0 < param_4)))) goto LAB_00a1d8e8;
  uVar2 = param_3 + 0xe;
  if (-1 < (int)(param_3 + 7U)) {
    uVar2 = param_3 + 7U;
  }
  lVar3 = (long)((ulong)uVar2 << 0x20) >> 0x23;
  uVar1 = param_3 + 6;
  if (-1 < (int)uVar9) {
    uVar1 = uVar9;
  }
  s = CRYPTO_malloc((int)uVar2 >> 3,"crypto/bn/bn_rand.c",0x2b);
  if (s == (byte *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_rand.c",0x2d,"bnrand");
    ERR_set_error(3,0xc0100,0);
    bVar4 = false;
    goto LAB_00a1d9e0;
  }
  if (param_1 == 0) {
    iVar5 = RAND_bytes_ex(uVar6,s,lVar3,param_6);
  }
  else {
    iVar5 = RAND_priv_bytes_ex(uVar6,s,lVar3,param_6);
  }
  if (iVar5 < 1) {
LAB_00a1d970:
    bVar4 = false;
    goto LAB_00a1d9e0;
  }
  if (param_1 == 1) {
    lVar10 = 0;
    do {
      iVar5 = RAND_bytes_ex(uVar6,local_64,1,param_6);
      if (iVar5 < 1) goto LAB_00a1d970;
      if ((lVar10 == 0) || (-1 < (char)local_64[0])) {
        bVar8 = 0;
        if (local_64[0] < 0x2a) goto LAB_00a1d88c;
        if (local_64[0] < 0x54) {
          bVar8 = 0xff;
          goto LAB_00a1d88c;
        }
      }
      else {
        bVar8 = s[lVar10 + -1];
LAB_00a1d88c:
        s[lVar10] = bVar8;
      }
      lVar10 = lVar10 + 1;
    } while (lVar10 < lVar3);
  }
  uVar9 = uVar9 - (uVar1 & 0xfffffff8);
  uVar1 = uVar9 + 1;
  if (param_4 < 0) {
    bVar8 = *s;
  }
  else {
    if (param_4 == 0) {
      bVar8 = *s;
      iVar5 = 1;
    }
    else {
      if (uVar9 == 0) {
        bVar8 = 1;
        *s = 1;
        s[1] = s[1] | 0x80;
        goto LAB_00a1d9ac;
      }
      bVar8 = *s;
      uVar9 = uVar9 - 1;
      iVar5 = 3;
    }
    bVar8 = bVar8 | (byte)(iVar5 << (ulong)(uVar9 & 0x1f));
    *s = bVar8;
  }
LAB_00a1d9ac:
  *s = bVar8 & ((byte)(0xff << (ulong)(uVar1 & 0x1f)) ^ 0xff);
  if (param_5 != 0) {
    s[lVar3 + -1] = s[lVar3 + -1] | 1;
  }
  pBVar7 = BN_bin2bn(s,(int)uVar2 >> 3,param_2);
  bVar4 = pBVar7 != (BIGNUM *)0x0;
LAB_00a1d9e0:
  CRYPTO_clear_free(s,lVar3,"crypto/bn/bn_rand.c",0x5d);
  return bVar4;
}

