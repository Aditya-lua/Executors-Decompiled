/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68f3c
 */

undefined8
mbedtls_base64_encode(byte *param_1,ulong param_2,ulong *param_3,long param_4,ulong param_5)

{
  uint uVar1;
  int iVar2;
  byte bVar3;
  uint uVar4;
  char cVar5;
  char cVar6;
  byte *pbVar7;
  uint uVar8;
  byte *pbVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  byte bVar13;
  
  if (param_5 == 0) {
    *param_3 = 0;
    return 0;
  }
  uVar10 = param_5 / 3;
  uVar11 = uVar10;
  if (param_5 != uVar10 * 3) {
    uVar11 = uVar10 + 1;
  }
  if (uVar11 >> 0x3e != 0) {
    *param_3 = 0xffffffffffffffff;
    return 0xffffffd6;
  }
  uVar11 = uVar11 << 2 | 1;
  if ((param_1 == (byte *)0x0) || (param_2 < uVar11)) {
    *param_3 = uVar11;
    return 0xffffffd6;
  }
  if (uVar10 * 3 == 0) {
    uVar11 = 0;
    pbVar9 = param_1;
    lVar12 = param_4;
    if (param_5 == 0) goto LAB_00b694e8;
  }
  else {
    uVar11 = 0;
    pbVar7 = param_1;
    do {
      pbVar9 = (byte *)(param_4 + uVar11);
      bVar13 = pbVar9[2];
      bVar3 = *pbVar9 >> 2;
      uVar4 = (uint)bVar3;
      uVar8 = (uint)(pbVar9[1] >> 4) | (*pbVar9 & 3) << 4;
      uVar1 = (uint)(bVar13 >> 6) | (pbVar9[1] & 0xf) << 2;
      cVar5 = (char)uVar8;
      *pbVar7 = bVar3 + 0x47 & (((byte)(uVar4 + 0xffe6 >> 8) | (byte)(0x33 - uVar4 >> 8)) ^ 0xff) |
                bVar3 + 0x41 & ((byte)(0x19 - uVar4 >> 8) ^ 0xff) |
                bVar3 - 4 & (((byte)(uVar4 + 0xffcc >> 8) | (byte)(0x3d - uVar4 >> 8)) ^ 0xff) |
                (((byte)(uVar4 + 0xffc2 >> 8) | (byte)(0x3e - uVar4 >> 8)) ^ 0xff) & 0x2b |
                (((byte)(uVar4 + 0xffc1 >> 8) | (byte)(0x3f - uVar4 >> 8)) ^ 0xff) & 0x2f;
      cVar6 = (char)uVar1;
      pbVar7[1] = cVar5 + 0x47U & (((byte)(uVar8 + 0xffe6 >> 8) | (byte)(0x33 - uVar8 >> 8)) ^ 0xff)
                  | cVar5 + 0x41U & ((byte)(0x19 - uVar8 >> 8) ^ 0xff) |
                  cVar5 - 4U & (((byte)(uVar8 + 0xffcc >> 8) | (byte)(0x3d - uVar8 >> 8)) ^ 0xff) |
                  (((byte)(uVar8 + 0xffc2 >> 8) | (byte)(0x3e - uVar8 >> 8)) ^ 0xff) & 0x2b |
                  (((byte)(uVar8 + 0xffc1 >> 8) | (byte)(0x3f - uVar8 >> 8)) ^ 0xff) & 0x2f;
      uVar8 = bVar13 & 0x3f;
      cVar5 = (char)uVar8;
      pbVar7[2] = cVar6 + 0x47U & (((byte)(uVar1 + 0xffe6 >> 8) | (byte)(0x33 - uVar1 >> 8)) ^ 0xff)
                  | cVar6 + 0x41U & ((byte)(0x19 - uVar1 >> 8) ^ 0xff) |
                  cVar6 - 4U & (((byte)(uVar1 + 0xffcc >> 8) | (byte)(0x3d - uVar1 >> 8)) ^ 0xff) |
                  (((byte)(uVar1 + 0xffc2 >> 8) | (byte)(0x3e - uVar1 >> 8)) ^ 0xff) & 0x2b |
                  (((byte)(uVar1 + 0xffc1 >> 8) | (byte)(0x3f - uVar1 >> 8)) ^ 0xff) & 0x2f;
      pbVar9 = pbVar7 + 4;
      uVar11 = uVar11 + 3;
      pbVar7[3] = cVar5 + 0x47U & (((byte)(uVar8 + 0xffe6 >> 8) | (byte)(0x33 - uVar8 >> 8)) ^ 0xff)
                  | cVar5 + 0x41U & ((byte)(0x19 - uVar8 >> 8) ^ 0xff) |
                  cVar5 - 4U & (((byte)(uVar8 + 0xffcc >> 8) | (byte)(0x3d - uVar8 >> 8)) ^ 0xff) |
                  (((byte)(uVar8 + 0xffc2 >> 8) | (byte)(0x3e - uVar8 >> 8)) ^ 0xff) & 0x2b |
                  (((byte)(uVar8 + 0xffc1 >> 8) | (byte)(0x3f - uVar8 >> 8)) ^ 0xff) & 0x2f;
      pbVar7 = pbVar9;
    } while (uVar11 < uVar10 * 3);
    lVar12 = param_4 + uVar11;
    if (param_5 <= uVar11) goto LAB_00b694e8;
  }
  uVar10 = 0;
  if (uVar11 + 1 < param_5) {
    uVar10 = (ulong)*(byte *)(lVar12 + 1);
  }
  bVar13 = *(byte *)(param_4 + uVar11) >> 2;
  uVar1 = (uint)bVar13;
  uVar8 = (uint)(uVar10 >> 4) | (*(byte *)(param_4 + uVar11) & 3) << 4;
  cVar5 = (char)uVar8;
  *pbVar9 = bVar13 + 0x47 & (((byte)(uVar1 + 0xffe6 >> 8) | (byte)(0x33 - uVar1 >> 8)) ^ 0xff) |
            bVar13 + 0x41 & ((byte)(0x19 - uVar1 >> 8) ^ 0xff) |
            bVar13 - 4 & (((byte)(uVar1 + 0xffcc >> 8) | (byte)(0x3d - uVar1 >> 8)) ^ 0xff) |
            (((byte)(uVar1 + 0xffc2 >> 8) | (byte)(0x3e - uVar1 >> 8)) ^ 0xff) & 0x2b |
            (((byte)(uVar1 + 0xffc1 >> 8) | (byte)(0x3f - uVar1 >> 8)) ^ 0xff) & 0x2f;
  pbVar9[1] = cVar5 + 0x47U & (((byte)(uVar8 + 0xffe6 >> 8) | (byte)(0x33 - uVar8 >> 8)) ^ 0xff) |
              cVar5 + 0x41U & ((byte)(0x19 - uVar8 >> 8) ^ 0xff) |
              cVar5 - 4U & (((byte)(uVar8 + 0xffcc >> 8) | (byte)(0x3d - uVar8 >> 8)) ^ 0xff) |
              (((byte)(uVar8 + 0xffc2 >> 8) | (byte)(0x3e - uVar8 >> 8)) ^ 0xff) & 0x2b |
              (((byte)(uVar8 + 0xffc1 >> 8) | (byte)(0x3f - uVar8 >> 8)) ^ 0xff) & 0x2f;
  bVar13 = 0x3d;
  if (uVar11 + 1 < param_5) {
    uVar8 = (uint)uVar10 & 0xf;
    iVar2 = uVar8 * 4;
    bVar13 = (((byte)((uint)(iVar2 + 0xffe6) >> 8) | (byte)(uVar8 * -4 + 0x33 >> 8)) ^ 0xff) &
             (char)iVar2 + 0x47U |
             ((byte)(uVar8 * -4 + 0x19 >> 8) ^ 0xff) & ((byte)(((uint)uVar10 & 0xf) << 2) | 0x41) |
             (((byte)((uint)(iVar2 + 0xffcc) >> 8) | (byte)(uVar8 * -4 + 0x3d >> 8)) ^ 0xff) &
             (char)iVar2 - 4U |
             (((byte)((uint)(iVar2 + 0xffc2) >> 8) | (byte)(uVar8 * -4 + 0x3e >> 8)) ^ 0xff) & 0x2b
             | (((byte)((uint)(iVar2 + 0xffc1) >> 8) | (byte)(uVar8 * -4 + 0x3f >> 8)) ^ 0xff) &
               0x2f;
  }
  pbVar9[2] = bVar13;
  pbVar9[3] = 0x3d;
  pbVar9 = pbVar9 + 4;
LAB_00b694e8:
  *param_3 = (long)pbVar9 - (long)param_1;
  *pbVar9 = 0;
  return 0;
}

