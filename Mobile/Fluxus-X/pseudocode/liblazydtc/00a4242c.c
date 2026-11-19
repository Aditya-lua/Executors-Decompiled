/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4242c
 */

undefined8
ossl_ed25519_public_from_private(undefined8 param_1,long param_2,void *param_3,undefined8 param_4)

{
  int iVar1;
  EVP_MD *type;
  undefined8 uVar2;
  undefined1 auStack_1a8 [40];
  undefined1 auStack_180 [40];
  undefined1 auStack_158 [80];
  byte local_108 [31];
  byte local_e9;
  undefined1 auStack_c8 [40];
  undefined1 auStack_a0 [40];
  undefined1 auStack_78 [40];
  char local_50 [32];
  
  type = (EVP_MD *)EVP_MD_fetch(param_1,"SHA512",param_4);
  uVar2 = 0;
  if (type != (EVP_MD *)0x0) {
    iVar1 = EVP_Digest(param_3,0x20,local_108,(uint *)0x0,type,(ENGINE *)0x0);
    EVP_MD_free(type);
    if (iVar1 == 0) {
      OPENSSL_cleanse(local_108,0x40);
      uVar2 = 0;
    }
    else {
      local_108[0] = local_108[0] & 0xf8;
      local_e9 = local_e9 & 0x3f | 0x40;
      FUN_00a3fd34(auStack_1a8,local_108);
      FUN_00a44a70(auStack_78,auStack_158);
      FUN_00a44e38(auStack_a0,auStack_1a8,auStack_78);
      FUN_00a44e38(auStack_c8,auStack_180,auStack_78);
      FUN_00a45158(param_2,auStack_c8);
      FUN_00a45158(local_50,auStack_a0);
      *(byte *)(param_2 + 0x1f) = *(byte *)(param_2 + 0x1f) ^ local_50[0] << 7;
      OPENSSL_cleanse(local_108,0x40);
      uVar2 = 1;
    }
  }
  return uVar2;
}

