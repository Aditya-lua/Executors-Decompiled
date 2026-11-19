/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2ec4
 */

long FUN_009f2ec4(byte *param_1,uint *param_2,byte *param_3,long param_4)

{
  byte bVar1;
  ulong uVar2;
  long lVar3;
  undefined8 uVar4;
  uint uVar5;
  byte bVar6;
  long lVar7;
  ulong uVar8;
  byte bVar9;
  byte *pbVar10;
  long lVar11;
  ulong uVar12;
  
  if (param_4 == 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_int.c",0xa0,"c2i_ibuf");
    uVar4 = 0xde;
    goto LAB_009f2f24;
  }
  bVar1 = *param_3;
  if (param_2 != (uint *)0x0) {
    *param_2 = bVar1 & 0x80;
  }
  uVar2 = param_4 - 1;
  if (uVar2 == 0) {
    if (param_1 == (byte *)0x0) {
      return 1;
    }
    if ((bVar1 & 0x80) == 0) {
      *param_1 = *param_3;
      return 1;
    }
    *param_1 = -*param_3;
    return 1;
  }
  if (*param_3 == 0) {
LAB_009f2fcc:
    if ((bVar1 & 0x80) == (param_3[1] & 0x80)) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_int.c",0xc1,"c2i_ibuf");
      uVar4 = 0xdd;
LAB_009f2f24:
      ERR_set_error(0xd,uVar4,0);
      return 0;
    }
    lVar7 = 1;
  }
  else {
    lVar7 = 0;
    if (*param_3 == 0xff) {
      if (uVar2 < 2) {
        bVar6 = 0;
        uVar8 = 1;
LAB_009f2fb0:
        lVar7 = param_4 - uVar8;
        pbVar10 = param_3 + uVar8;
        do {
          lVar7 = lVar7 + -1;
          bVar6 = bVar6 | *pbVar10;
          pbVar10 = pbVar10 + 1;
        } while (lVar7 != 0);
      }
      else {
        bVar9 = 0;
        bVar6 = 0;
        uVar8 = uVar2 | 1;
        uVar12 = uVar2 & 0xfffffffffffffffe;
        pbVar10 = param_3;
        do {
          uVar12 = uVar12 - 2;
          bVar9 = bVar9 | pbVar10[1];
          bVar6 = bVar6 | pbVar10[2];
          pbVar10 = pbVar10 + 2;
        } while (uVar12 != 0);
        bVar6 = bVar6 | bVar9;
        if (uVar2 != (uVar2 & 0xfffffffffffffffe)) goto LAB_009f2fb0;
      }
      lVar7 = param_4;
      if (bVar6 == 0) goto joined_r0x009f300c;
      goto LAB_009f2fcc;
    }
  }
  lVar7 = param_4 - lVar7;
joined_r0x009f300c:
  if ((param_1 != (byte *)0x0) && (lVar7 != 0)) {
    param_3 = param_3 + param_4;
    uVar5 = (uint)(bVar1 >> 7);
    lVar11 = lVar7;
    do {
      param_3 = param_3 + -1;
      lVar3 = lVar11 + -1;
      uVar5 = uVar5 + ((uint)*param_3 ^ -(uint)(bVar1 >> 7) & 0xff);
      param_1[lVar11 + -1] = (byte)uVar5;
      uVar5 = uVar5 >> 8;
      lVar11 = lVar3;
    } while (lVar3 != 0);
  }
  return lVar7;
}

