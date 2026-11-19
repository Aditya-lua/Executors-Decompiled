/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68dc4
 */

undefined8
tls1_cbc_remove_padding_and_mac
          (ulong *param_1,undefined8 param_2,long param_3,undefined8 param_4,undefined8 param_5,
          long param_6,ulong param_7,int param_8)

{
  long lVar1;
  ulong uVar2;
  byte bVar3;
  long lVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong uVar7;
  byte bVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  byte *pbVar14;
  ulong uVar15;
  
  uVar6 = *param_1;
  uVar9 = param_7;
  if (param_6 != 1) {
    uVar9 = param_7 + 1;
  }
  if (uVar6 < uVar9) {
    return 0;
  }
  if (param_6 == 1) goto LAB_00b68f2c;
  lVar11 = uVar6 - 1;
  bVar3 = *(byte *)(param_3 + lVar11);
  uVar7 = (ulong)bVar3;
  if (param_8 != 0) {
    *param_1 = (uVar6 + ~param_7) - uVar7;
    return 1;
  }
  uVar9 = uVar9 + uVar7;
  uVar2 = uVar6;
  if (0xff < uVar6) {
    uVar2 = 0x100;
  }
  uVar9 = (long)((uVar6 - uVar9 ^ uVar9 | uVar9 ^ uVar6) ^ uVar6) >> 0x3f ^ 0xffffffffffffffff;
  bVar8 = (byte)uVar9;
  if ((uVar2 & 0x1ff) != 0) {
    if (((uint)uVar2 & 0x1ff) == 1) {
      uVar10 = 0;
    }
    else {
      uVar10 = uVar2 & 0x1fe;
      lVar12 = uVar7 - 1;
      pbVar14 = (byte *)(param_3 + lVar11);
      uVar13 = 0xffffffffffffffff;
      uVar15 = uVar10;
      do {
        lVar1 = lVar12 + 1;
        lVar4 = lVar12 >> 0x3f;
        lVar12 = lVar12 + -2;
        uVar15 = uVar15 - 2;
        uVar9 = uVar9 & ~((uint)(*pbVar14 ^ bVar3) & ((uint)(lVar1 >> 0x3f) ^ 0xffffffff));
        uVar13 = uVar13 & ~((uint)(pbVar14[-1] ^ bVar3) & ((uint)lVar4 ^ 0xffffffff));
        pbVar14 = pbVar14 + -2;
      } while (uVar15 != 0);
      uVar9 = uVar13 & uVar9;
      bVar8 = (byte)uVar9;
      if (uVar2 == uVar10) goto LAB_00b68f10;
    }
    lVar12 = uVar7 - uVar10;
    pbVar14 = (byte *)(param_3 + (lVar11 - uVar10));
    do {
      uVar10 = uVar10 + 1;
      uVar9 = uVar9 & ~((uint)(*pbVar14 ^ bVar3) & ((uint)(lVar12 >> 0x3f) ^ 0xffffffff));
      bVar8 = (byte)uVar9;
      lVar12 = lVar12 + -1;
      pbVar14 = pbVar14 + -1;
    } while (uVar10 < uVar2);
  }
LAB_00b68f10:
  *param_1 = uVar6 - ((long)(0xfe - (ulong)bVar8) >> 0x3f & uVar7 + 1);
LAB_00b68f2c:
  uVar5 = FUN_00b68b58();
  return uVar5;
}

