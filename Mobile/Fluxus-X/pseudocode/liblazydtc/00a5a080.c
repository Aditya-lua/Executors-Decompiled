/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5a080
 */

long FUN_00a5a080(long param_1,long param_2,byte *param_3,int param_4)

{
  bool bVar1;
  byte *pbVar2;
  ulong uVar3;
  long lVar4;
  int iVar5;
  undefined *puVar6;
  long lVar7;
  uint uVar8;
  ulong uVar9;
  byte bVar10;
  uint uVar11;
  uint uVar12;
  
  if ((param_1 == 0) || ((*(byte *)(param_1 + 0x5c) >> 1 & 1) == 0)) {
    puVar6 = &DAT_00766154;
  }
  else {
    puVar6 = &DAT_007660d4;
  }
  iVar5 = param_4;
  if (0 < param_4) {
    do {
      param_4 = iVar5;
      if (((char)*param_3 < '\0') || (puVar6[*param_3] != -0x20)) break;
      param_4 = iVar5 + -1;
      param_3 = param_3 + 1;
      bVar1 = 0 < iVar5;
      iVar5 = param_4;
    } while (param_4 != 0 && bVar1);
  }
  uVar3 = (long)param_4;
  do {
    uVar9 = uVar3;
    if ((long)uVar9 < 4) break;
    uVar3 = uVar9 - 1;
  } while ((puVar6[param_3[uVar9 - 1]] | 0x13) == 0xf3);
  if ((uVar9 & 3) != 0) {
    return 0xffffffff;
  }
  if ((int)uVar9 < 1) {
    return 0;
  }
  lVar7 = 0;
  lVar4 = 0;
  do {
    pbVar2 = param_3 + lVar7;
    if ((char)*pbVar2 < '\0') {
      uVar8 = 0xff;
      bVar10 = pbVar2[1];
      if (-1 < (char)bVar10) goto LAB_00a5a148;
LAB_00a5a180:
      uVar11 = 0xff;
      bVar10 = pbVar2[2];
      if (-1 < (char)bVar10) goto LAB_00a5a158;
LAB_00a5a18c:
      uVar12 = 0xff;
      bVar10 = pbVar2[3];
      if (-1 < (char)bVar10) goto LAB_00a5a168;
LAB_00a5a198:
      bVar10 = 0xff;
    }
    else {
      uVar8 = (uint)(byte)puVar6[*pbVar2];
      bVar10 = pbVar2[1];
      if ((char)bVar10 < '\0') goto LAB_00a5a180;
LAB_00a5a148:
      uVar11 = (uint)(byte)puVar6[bVar10];
      bVar10 = pbVar2[2];
      if ((char)bVar10 < '\0') goto LAB_00a5a18c;
LAB_00a5a158:
      uVar12 = (uint)(byte)puVar6[bVar10];
      bVar10 = pbVar2[3];
      if ((char)bVar10 < '\0') goto LAB_00a5a198;
LAB_00a5a168:
      bVar10 = puVar6[bVar10];
    }
    if ((char)((byte)uVar11 | (byte)uVar8 | (byte)uVar12 | bVar10) < '\0') {
      return 0xffffffff;
    }
    lVar7 = lVar7 + 4;
    pbVar2 = (byte *)(param_2 + lVar4);
    lVar4 = lVar4 + 3;
    pbVar2[2] = bVar10 | (byte)(uVar12 << 6);
    *pbVar2 = (byte)((uVar11 << 0xc) >> 0x10) | (byte)((uVar8 << 0x12) >> 0x10);
    pbVar2[1] = (byte)((uVar12 << 6) >> 8) | (byte)((uVar11 << 0xc) >> 8);
    if ((int)uVar9 <= (int)lVar7) {
      return lVar4;
    }
  } while( true );
}

