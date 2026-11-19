/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc424
 */

void _INIT_10(void)

{
  undefined4 uVar1;
  int iVar2;
  
  if (((DAT_00cca8e0 & 1) != 0) || (iVar2 = __cxa_guard_acquire(&DAT_00cca8e0), iVar2 == 0)) {
    return;
  }
  if (((DAT_00ccaa60 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00ccaa60), iVar2 != 0)) {
    DAT_00ccaa28 = 0xff6d28be23088645;
    DAT_00ccaa20 = 0xb8367baa7d0b935f;
    DAT_00ccaa38 = 0xf87a6fad631a9359;
    DAT_00ccaa30 = 0xf87a33bc7e0a8542;
    DAT_00ccaa5b = '\x01';
    DAT_00ccaa48._0_3_ = 0x50d707;
    DAT_00ccaa40 = 0xfa7226b76414c85a;
    DAT_00ccaa50._3_5_ = 0xe37825a958;
    DAT_00ccaa58 = 0x52;
    DAT_00ccaa59 = 0x94;
    DAT_00ccaa5a = 0x7f;
    DAT_00ccaa48._3_5_ = 0xe26134b54b;
    DAT_00ccaa50._0_3_ = 0x52bd44;
    __cxa_atexit(&LAB_007fdee0,&DAT_00ccaa20,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00ccaa60);
  }
  if (DAT_00ccaa5b == '\x01') {
    DAT_00ccaa20 = DAT_00ccaa20 ^ 0x971941d90d7fe737;
    DAT_00ccaa28 = DAT_00ccaa28 ^ 0x971941d90d7fe737;
    DAT_00ccaa30 = DAT_00ccaa30 ^ 0x971941d90d7fe737;
    DAT_00ccaa38 = DAT_00ccaa38 ^ 0x971941d90d7fe737;
    DAT_00ccaa5b = '\0';
    DAT_00ccaa58 = DAT_00ccaa58 ^ 0x37;
    DAT_00ccaa40 = DAT_00ccaa40 ^ 0x971941d90d7fe737;
    uVar1 = CONCAT13((char)DAT_00ccaa48._3_5_,(uint3)DAT_00ccaa48);
    DAT_00ccaa48._0_3_ = (uint3)DAT_00ccaa48 ^ 0x7fe737;
    DAT_00ccaa48._3_5_ =
         (uint5)(CONCAT17((char)(DAT_00ccaa48._3_5_ >> 0x20),
                          CONCAT16((char)(DAT_00ccaa48._3_5_ >> 0x18),
                                   CONCAT15((char)(DAT_00ccaa48._3_5_ >> 0x10),
                                            CONCAT14((char)(DAT_00ccaa48._3_5_ >> 8),uVar1)))) >>
                0x18) ^ 0x971941d90d;
    uVar1 = CONCAT13((char)DAT_00ccaa50._3_5_,(uint3)DAT_00ccaa50);
    DAT_00ccaa50._0_3_ = (uint3)DAT_00ccaa50 ^ 0x7fe737;
    DAT_00ccaa50._3_5_ =
         (uint5)(CONCAT17((char)(DAT_00ccaa50._3_5_ >> 0x20),
                          CONCAT16((char)(DAT_00ccaa50._3_5_ >> 0x18),
                                   CONCAT15((char)(DAT_00ccaa50._3_5_ >> 0x10),
                                            CONCAT14((char)(DAT_00ccaa50._3_5_ >> 8),uVar1)))) >>
                0x18) ^ 0x971941d90d;
    DAT_00ccaa59 = DAT_00ccaa59 ^ 0xe7;
    DAT_00ccaa5a = DAT_00ccaa5a ^ 0x7f;
  }
  DAT_00cca8d8 = &DAT_00ccaa20;
  __cxa_guard_release(&DAT_00cca8e0);
  return;
}

