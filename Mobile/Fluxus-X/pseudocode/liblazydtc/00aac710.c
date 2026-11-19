/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aac710
 */

long CRYPTO_128_wrap(undefined8 param_1,undefined8 *param_2,undefined8 *param_3,void *param_4,
                    ulong param_5,code *param_6)

{
  undefined8 *__dest;
  undefined8 *puVar1;
  byte bVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 local_60;
  undefined8 local_58;
  
  lVar4 = 0;
  if ((param_5 - 0x10 < 0x7ffffff1) && ((param_5 & 7) == 0)) {
    __dest = param_3 + 1;
    memmove(__dest,param_4,param_5);
    puVar1 = &DAT_0076ea18;
    if (param_2 != (undefined8 *)0x0) {
      puVar1 = param_2;
    }
    local_60 = *puVar1;
    lVar4 = 0;
    uVar5 = 1;
    do {
      uVar6 = 0;
      do {
        local_58 = *(undefined8 *)((long)__dest + uVar6);
        (*param_6)(&local_60,&local_60,param_1);
        uVar3 = local_60;
        bVar2 = local_60._7_1_ ^ (byte)uVar5;
        local_60 = CONCAT17(bVar2,(undefined7)local_60);
        if (0xff < uVar5) {
          local_60._6_1_ = SUB81(uVar3,6);
          local_60._5_1_ = SUB81(uVar3,5);
          local_60._4_1_ = SUB81(uVar3,4);
          local_60._4_1_ = local_60._4_1_ ^ (byte)(uVar5 >> 0x18);
          local_60._0_4_ = (undefined4)uVar3;
          local_60 = CONCAT35(CONCAT21(CONCAT11(bVar2,local_60._6_1_ ^ (byte)(uVar5 >> 8)),
                                       local_60._5_1_ ^ (byte)(uVar5 >> 0x10)),
                              CONCAT14(local_60._4_1_,(undefined4)local_60));
        }
        uVar5 = uVar5 + 1;
        *(undefined8 *)((long)__dest + uVar6) = local_58;
        uVar6 = uVar6 + 8;
      } while (uVar6 < param_5);
      lVar4 = lVar4 + 1;
    } while (lVar4 != 6);
    lVar4 = param_5 + 8;
    *param_3 = local_60;
  }
  return lVar4;
}

