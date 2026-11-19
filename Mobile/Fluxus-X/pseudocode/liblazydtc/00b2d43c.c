/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d43c
 */

undefined8
FUN_00b2d43c(long param_1,uchar *param_2,long *param_3,ulong param_4,uchar *param_5,ulong param_6)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  uchar *puVar4;
  uint uVar5;
  size_t siz;
  size_t siz_00;
  undefined8 local_78 [3];
  uchar auStack_60 [8];
  uchar auStack_58 [8];
  
  *param_3 = 0;
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  if (param_4 < param_6) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/cipher_tdes_wrap.c",0x8b,"tdes_wrap_cipher");
    ERR_set_error(0x39,0x6a,0);
    return 0;
  }
  if ((param_6 & 0xffffffffc0000007) != 0) {
    return 0;
  }
  if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) {
    if (param_6 < 0x18) {
LAB_00b2d73c:
      siz = 0xffffffff;
      goto LAB_00b2d740;
    }
    if (param_2 != (uchar *)0x0) {
      puVar4 = (uchar *)(param_1 + 0x20);
      puVar4[0] = 'J';
      puVar4[1] = 0xdd;
      puVar4[2] = 0xa2;
      puVar4[3] = ',';
      puVar4[4] = 'y';
      puVar4[5] = 0xe8;
      puVar4[6] = '!';
      puVar4[7] = '\x05';
      (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,auStack_58,param_5,8);
      if (param_2 == param_5) {
        memmove(param_2,param_2 + 8,param_6 - 8);
        param_5 = param_2 + -8;
      }
      siz_00 = param_6 - 0x10;
      (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_5 + 8,siz_00);
      (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,auStack_60,param_5 + (param_6 - 8),8);
      BUF_reverse(auStack_58,(uchar *)0x0,8);
      BUF_reverse(param_2,(uchar *)0x0,siz_00);
      BUF_reverse(puVar4,auStack_60,8);
      (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_2,siz_00);
      (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,auStack_58,auStack_58,8);
      lVar3 = ossl_sha1(param_2,siz_00,local_78);
      if (lVar3 == 0) {
        siz = 0xffffffff;
      }
      else {
        iVar1 = CRYPTO_memcmp(local_78,auStack_58,8);
        uVar5 = (uint)siz_00;
        if (iVar1 != 0) {
          uVar5 = 0xffffffff;
        }
        siz = (size_t)uVar5;
      }
      OPENSSL_cleanse(auStack_58,8);
      OPENSSL_cleanse(local_78,0x14);
      OPENSSL_cleanse(auStack_60,8);
      OPENSSL_cleanse(puVar4,0x10);
      if ((int)siz != -1) goto LAB_00b2d740;
      OPENSSL_cleanse(param_2,siz_00);
      goto LAB_00b2d73c;
    }
    uVar5 = (int)param_6 - 0x10;
    siz = (size_t)uVar5;
  }
  else {
    siz = param_6 + 0x10;
    if (param_2 != (uchar *)0x0) {
      puVar4 = param_2 + 8;
      memmove(puVar4,param_5,param_6);
      lVar3 = ossl_sha1(param_5,param_6,local_78);
      if (lVar3 == 0) {
        return 0;
      }
      *(undefined8 *)(param_2 + param_6 + 8) = local_78[0];
      OPENSSL_cleanse(local_78,0x14);
      iVar1 = RAND_bytes_ex(*(undefined8 *)(param_1 + 0xb8),param_1 + 0x20,8,0);
      if (iVar1 < 1) {
        return 0;
      }
      *(undefined8 *)param_2 = *(undefined8 *)(param_1 + 0x20);
      (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,puVar4,puVar4,param_6 + 8);
      BUF_reverse(param_2,(uchar *)0x0,siz);
      *(undefined8 *)(param_1 + 0x20) = 0x521e8792ca2dd4a;
      (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_2,siz);
      if ((int)siz < 1) {
        return 0;
      }
      goto LAB_00b2d748;
    }
LAB_00b2d740:
    uVar5 = (uint)siz;
  }
  if ((int)uVar5 < 1) {
    return 0;
  }
LAB_00b2d748:
  *param_3 = (long)(int)siz;
  return 1;
}

