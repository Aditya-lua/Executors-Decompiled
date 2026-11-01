
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_006fba74(long *param_1,undefined8 param_2,long param_3)

{
  byte *in_x9;
  int in_w10;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  undefined8 uVar1;
  byte bVar5;
  int iVar6;
  int iVar7;
  
  uVar1 = *(undefined8 *)(param_3 + 4);
  iVar6 = -(uint)((int)uVar1 == -0x80000000);
  iVar7 = -(uint)((int)((ulong)uVar1 >> 0x20) == -0x80000000);
  bVar2 = (byte)((ulong)uVar1 >> 0x10) & ~(byte)((uint)iVar6 >> 0x10);
  bVar3 = (byte)((ulong)uVar1 >> 0x18) & ~(byte)((uint)iVar6 >> 0x18);
  bVar4 = (byte)((ulong)uVar1 >> 0x30) & ~(byte)((uint)iVar7 >> 0x10);
  bVar5 = (byte)((ulong)uVar1 >> 0x38) & ~(byte)((uint)iVar7 >> 0x18);
  iVar6 = CONCAT13(bVar3,CONCAT12(bVar2,CONCAT11(bVar3 >> 1 ^
                                                 (byte)((ulong)uVar1 >> 8) &
                                                 ~(byte)((uint)iVar6 >> 8),
                                                 (byte)(CONCAT11(bVar3,bVar2) >> 1) ^
                                                 (byte)uVar1 & ~(byte)iVar6)));
  return *param_1 +
         (ulong)((iVar6 * (int)_UNK_008c8450 ^ in_w10 * 0x466f45d ^
                 (int)(CONCAT17(bVar5,CONCAT16(bVar4,CONCAT15(bVar5 >> 1 ^
                                                              (byte)((ulong)uVar1 >> 0x28) &
                                                              ~(byte)((uint)iVar7 >> 8),
                                                              CONCAT14((byte)(((ulong)CONCAT11(bVar5
                                                  ,bVar4) << 0x30) >> 0x31) ^
                                                  (byte)((ulong)uVar1 >> 0x20) & ~(byte)iVar7,iVar6)
                                                  ))) >> 0x20) * (int)((ulong)_UNK_008c8450 >> 0x20)
                 ) & (-1 << (ulong)(*in_x9 & 0x1f) ^ 0xffffffffU)) * 0x20;
}

