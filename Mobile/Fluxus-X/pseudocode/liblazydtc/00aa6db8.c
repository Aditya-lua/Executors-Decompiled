/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa6db8
 */

undefined4 ossl_md5_sha1_ctrl(MD5_CTX *param_1,int param_2,int param_3,void *param_4)

{
  SHA_CTX *c;
  int iVar1;
  uchar auStack_84 [20];
  uchar auStack_70 [16];
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  
  if (param_2 != 0x1d) {
    return 0xfffffffe;
  }
  if (param_1 != (MD5_CTX *)0x0) {
    if (param_3 != 0x30) {
      return 0;
    }
    iVar1 = MD5_Update(param_1,param_4,0x30);
    if (iVar1 == 0) {
      return 0;
    }
    c = (SHA_CTX *)(param_1 + 1);
    iVar1 = SHA1_Update(c,param_4,0x30);
    if (0 < iVar1) {
      local_40 = 0x3636363636363636;
      uStack_38 = 0x3636363636363636;
      local_50 = 0x3636363636363636;
      uStack_48 = 0x3636363636363636;
      local_60 = 0x3636363636363636;
      uStack_58 = 0x3636363636363636;
      iVar1 = MD5_Update(param_1,&local_60,0x30);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = MD5_Final(auStack_70,param_1);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = SHA1_Update(c,&local_60,0x28);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = SHA1_Final(auStack_84,c);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = MD5_Init(param_1);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = SHA1_Init(c);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = MD5_Update(param_1,param_4,0x30);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = SHA1_Update(c,param_4,0x30);
      if (0 < iVar1) {
        local_40 = 0x5c5c5c5c5c5c5c5c;
        uStack_38 = 0x5c5c5c5c5c5c5c5c;
        local_50 = 0x5c5c5c5c5c5c5c5c;
        uStack_48 = 0x5c5c5c5c5c5c5c5c;
        local_60 = 0x5c5c5c5c5c5c5c5c;
        uStack_58 = 0x5c5c5c5c5c5c5c5c;
        iVar1 = MD5_Update(param_1,&local_60,0x30);
        if (iVar1 == 0) {
          return 0;
        }
        iVar1 = MD5_Update(param_1,auStack_70,0x10);
        if (iVar1 == 0) {
          return 0;
        }
        iVar1 = SHA1_Update(c,&local_60,0x28);
        if (iVar1 == 0) {
          return 0;
        }
        iVar1 = SHA1_Update(c,auStack_84,0x14);
        if (iVar1 == 0) {
          return 0;
        }
        OPENSSL_cleanse(auStack_70,0x10);
        OPENSSL_cleanse(auStack_84,0x14);
        return 1;
      }
    }
  }
  return 0;
}

