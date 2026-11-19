/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aac830
 */

ulong CRYPTO_128_unwrap(undefined8 param_1,undefined8 *param_2,void *param_3,undefined8 *param_4,
                       long param_5,code *param_6)

{
  byte bVar1;
  undefined8 uVar2;
  int iVar3;
  ulong __n;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 local_68;
  
  if ((param_5 - 0x18U < 0x7ffffff1) && (__n = param_5 - 8, (__n & 7) == 0)) {
    local_70 = *param_4;
    uVar4 = (__n >> 3) * 6;
    memmove(param_3,param_4 + 1,__n);
    lVar5 = 0;
    do {
      if (__n != 0) {
        uVar6 = 0;
        puVar7 = (undefined8 *)((long)param_3 + param_5 + -0x10);
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
          uVar6 = uVar6 + 8;
          uVar4 = uVar4 - 1;
          *puVar7 = local_68;
          puVar7 = puVar7 + -1;
        } while (uVar6 < __n);
      }
      lVar5 = lVar5 + 1;
    } while (lVar5 != 6);
    local_78 = local_70;
    if (__n == 0) {
      return 0;
    }
    puVar7 = &DAT_0076ea18;
    if (param_2 != (undefined8 *)0x0) {
      puVar7 = param_2;
    }
    iVar3 = CRYPTO_memcmp(&local_78,puVar7,8);
    if (iVar3 == 0) {
      return __n;
    }
    OPENSSL_cleanse(param_3,__n);
  }
  return 0;
}

