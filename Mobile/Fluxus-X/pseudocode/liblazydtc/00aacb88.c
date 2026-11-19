/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aacb88
 */

ulong CRYPTO_128_unwrap_pad
                (undefined8 param_1,void *param_2,undefined8 *param_3,ulong *param_4,ulong param_5,
                code *param_6)

{
  byte bVar1;
  ulong uVar2;
  int iVar3;
  ulong __n;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong local_78;
  undefined8 local_70;
  undefined8 local_68;
  
  if (param_5 < 0x10) {
    return 0;
  }
  if ((param_5 & 0xffffffff80000007) != 0) {
    return 0;
  }
  if (param_5 - 0x10 == 0) {
    (*param_6)(param_4,&local_70,param_1);
    local_78 = local_70;
    *param_3 = local_68;
    OPENSSL_cleanse(&local_70,0x10);
    __n = 8;
  }
  else {
    __n = param_5 - 8;
    if (param_5 - 0x18 < 0x7ffffff1) {
      uVar4 = 0;
      if ((__n & 7) == 0) {
        local_70 = *param_4;
        uVar4 = (__n >> 3) * 6;
        memmove(param_3,param_4 + 1,__n);
        lVar6 = 0;
        do {
          uVar5 = 0;
          puVar7 = (undefined8 *)((long)param_3 + (param_5 - 0x10));
          do {
            uVar2 = local_70;
            bVar1 = local_70._7_1_ ^ (byte)uVar4;
            local_70 = CONCAT17(bVar1,(undefined7)local_70);
            if (0xff < uVar4) {
              local_70._6_1_ = SUB81(uVar2,6);
              local_70._5_1_ = SUB81(uVar2,5);
              local_70._4_1_ = SUB81(uVar2,4);
              local_70._4_1_ = local_70._4_1_ ^ (byte)(uVar4 >> 0x18);
              local_70._0_4_ = (undefined4)uVar2;
              local_70 = CONCAT35(CONCAT21(CONCAT11(bVar1,local_70._6_1_ ^ (byte)(uVar4 >> 8)),
                                           local_70._5_1_ ^ (byte)(uVar4 >> 0x10)),
                                  CONCAT14(local_70._4_1_,(undefined4)local_70));
            }
            local_68 = *puVar7;
            (*param_6)(&local_70,&local_70,param_1);
            uVar5 = uVar5 + 8;
            uVar4 = uVar4 - 1;
            *puVar7 = local_68;
            puVar7 = puVar7 + -1;
          } while (uVar5 < __n);
          lVar6 = lVar6 + 1;
        } while (lVar6 != 6);
        local_78 = local_70;
        uVar4 = __n;
      }
      if (__n != uVar4) goto LAB_00aacd90;
    }
    else if (__n != 0) goto LAB_00aacd90;
  }
  if (param_2 == (void *)0x0) {
    iVar3 = CRYPTO_memcmp(&local_78,&DAT_0076ea20,4);
  }
  else {
    iVar3 = CRYPTO_memcmp(&local_78,param_2,4);
  }
  if ((((iVar3 == 0) &&
       (uVar4 = (local_78 >> 0x20 & 0xff) << 0x18 | (local_78 >> 0x28 & 0xff) << 0x10 |
                (local_78 >> 0x30 & 0xff) << 8 | local_78 >> 0x38,
       (param_5 - 0x10 & 0xfffffffffffffff8) < uVar4)) &&
      (uVar4 <= (param_5 - 8 & 0xfffffffffffffff8))) &&
     (iVar3 = CRYPTO_memcmp((void *)((long)param_3 + uVar4),&DAT_00d22158,__n - uVar4), iVar3 == 0))
  {
    return uVar4;
  }
LAB_00aacd90:
  OPENSSL_cleanse(param_3,param_5);
  return 0;
}

