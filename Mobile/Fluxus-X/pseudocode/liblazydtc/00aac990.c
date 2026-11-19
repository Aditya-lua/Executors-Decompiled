/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aac990
 */

long CRYPTO_128_wrap_pad(undefined8 param_1,uint *param_2,ulong *param_3,void *param_4,ulong param_5
                        ,code *param_6)

{
  ulong *__dest;
  uint uVar1;
  byte bVar2;
  ulong uVar3;
  long lVar4;
  ulong __n;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 local_70;
  undefined8 local_68;
  
  lVar4 = 0;
  if (param_5 - 1 < 0x7fffffff) {
    __n = param_5 + 7 & 0xfffffffffffffff8;
    if (param_2 == (uint *)0x0) {
      uVar1 = 0xa65959a6;
    }
    else {
      uVar1 = *param_2;
    }
    if (__n == 8) {
      memmove(param_3 + 1,param_4,param_5);
      *param_3 = param_5 << 0x38 | (param_5 >> 8 & 0xff) << 0x30 | (param_5 >> 0x10 & 0xff) << 0x28
                 | (param_5 >> 0x18 & 0xff) << 0x20 | (ulong)uVar1;
      memset((void *)((long)(param_3 + 1) + param_5),0,__n - param_5);
      (*param_6)(param_3,param_3,param_1);
      lVar4 = 0x10;
    }
    else {
      memmove(param_3,param_4,param_5);
      memset((void *)((long)param_3 + param_5),0,__n - param_5);
      lVar4 = 0;
      if (__n - 0x10 < 0x7ffffff1) {
        __dest = param_3 + 1;
        memmove(__dest,param_3,__n);
        lVar4 = 0;
        local_70 = param_5 << 0x38 | (param_5 >> 8 & 0xff) << 0x30 |
                   (param_5 >> 0x10 & 0xff) << 0x28 | (param_5 >> 0x18 & 0xff) << 0x20 |
                   (ulong)uVar1;
        uVar5 = 1;
        do {
          uVar6 = 0;
          uVar7 = uVar5;
          do {
            local_68 = *(undefined8 *)((long)__dest + uVar6);
            (*param_6)(&local_70,&local_70,param_1);
            uVar3 = local_70;
            bVar2 = local_70._7_1_ ^ (byte)uVar7;
            local_70 = CONCAT17(bVar2,(undefined7)local_70);
            if (0xff < uVar7) {
              local_70._6_1_ = SUB81(uVar3,6);
              local_70._5_1_ = SUB81(uVar3,5);
              local_70._4_1_ = SUB81(uVar3,4);
              local_70._4_1_ = local_70._4_1_ ^ (byte)(uVar7 >> 0x18);
              local_70._0_4_ = (undefined4)uVar3;
              local_70 = CONCAT35(CONCAT21(CONCAT11(bVar2,local_70._6_1_ ^ (byte)(uVar7 >> 8)),
                                           local_70._5_1_ ^ (byte)(uVar7 >> 0x10)),
                                  CONCAT14(local_70._4_1_,(undefined4)local_70));
            }
            uVar7 = uVar7 + 1;
            *(undefined8 *)((long)__dest + uVar6) = local_68;
            uVar6 = uVar6 + 8;
          } while (uVar6 < __n);
          lVar4 = lVar4 + 1;
          uVar5 = (__n - 1 >> 3) + 1 + uVar5;
        } while (lVar4 != 6);
        lVar4 = (long)((__n << 0x20) + 0x800000000) >> 0x20;
        *param_3 = local_70;
      }
    }
  }
  return lVar4;
}

