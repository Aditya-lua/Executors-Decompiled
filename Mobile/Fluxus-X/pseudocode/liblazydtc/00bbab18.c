/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbab18
 */

byte * ZSTD_decodeSeqHeaders(long param_1,uint *param_2,byte *param_3,byte *param_4)

{
  byte *pbVar1;
  byte *pbVar2;
  long lVar3;
  byte bVar4;
  ulong uVar5;
  byte *pbVar6;
  uint uVar7;
  
  if (param_4 == (byte *)0x0) {
    return (byte *)0xffffffffffffffb8;
  }
  pbVar2 = param_3 + (long)param_4;
  pbVar6 = param_3 + 1;
  bVar4 = *param_3;
  uVar7 = (uint)bVar4;
  if ((char)bVar4 < '\0') {
    if (uVar7 == 0xff) {
      if (param_4 < (byte *)0x3) {
        return (byte *)0xffffffffffffffb8;
      }
      uVar7 = *(ushort *)(param_3 + 1) + 0x7f00;
      pbVar6 = param_3 + 3;
      *param_2 = uVar7;
      goto LAB_00bbab54;
    }
    if (param_4 == (byte *)0x1) {
      return (byte *)0xffffffffffffffb8;
    }
    pbVar6 = param_3 + 2;
    uVar7 = CONCAT11(bVar4,param_3[1]) - 0x8000;
    *param_2 = uVar7;
  }
  else {
    *param_2 = uVar7;
  }
  if (uVar7 == 0) {
    if (pbVar6 != pbVar2) {
      param_4 = (byte *)0xffffffffffffffec;
    }
    return param_4;
  }
LAB_00bbab54:
  pbVar1 = pbVar6 + 1;
  if (pbVar2 < pbVar1) {
    return (byte *)0xffffffffffffffb8;
  }
  bVar4 = *pbVar6;
  if ((bVar4 & 3) == 0) {
    lVar3 = param_1 + 0x6abc;
    uVar5 = FUN_00bbad38(param_1 + 0x20,param_1,bVar4 >> 6,0x23,9,pbVar1,(long)pbVar2 - (long)pbVar1
                         ,&DAT_007892b8,&DAT_00789348,&DAT_0078936c,
                         *(undefined4 *)(param_1 + 0x7534),*(undefined4 *)(param_1 + 0x75fc),uVar7,
                         lVar3);
    if (uVar5 < 0xffffffffffffff89) {
      pbVar1 = pbVar1 + uVar5;
      uVar5 = FUN_00bbad38(param_1 + 0x1028,param_1 + 0x10,bVar4 >> 4 & 3,0x1f,8,pbVar1,
                           (long)pbVar2 - (long)pbVar1,&DAT_00789574,&DAT_007895f4,&DAT_00789614,
                           *(undefined4 *)(param_1 + 0x7534),*(undefined4 *)(param_1 + 0x75fc),uVar7
                           ,lVar3);
      if (uVar5 < 0xffffffffffffff89) {
        pbVar1 = pbVar1 + uVar5;
        uVar5 = FUN_00bbad38(param_1 + 0x1830,param_1 + 8,bVar4 >> 2 & 3,0x34,9,pbVar1,
                             (long)pbVar2 - (long)pbVar1,&DAT_0078971c,&DAT_007897f0,&DAT_00789828,
                             *(undefined4 *)(param_1 + 0x7534),*(undefined4 *)(param_1 + 0x75fc),
                             uVar7,lVar3);
        if (uVar5 < 0xffffffffffffff89) {
          return pbVar1 + (uVar5 - (long)param_3);
        }
      }
    }
  }
  return (byte *)0xffffffffffffffec;
}

