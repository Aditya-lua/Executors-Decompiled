
void FUN_0026c314(undefined8 *param_1,long *param_2,byte param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  char cVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  
  uVar3 = param_2[1];
  uVar12 = param_2[2];
  if (uVar3 <= uVar12) goto code_r0x00263a98;
  lVar10 = *param_2;
  uVar11 = uVar12 + 1;
  param_2[2] = uVar11;
  bVar4 = *(byte *)(lVar10 + uVar12);
  if (((bVar4 ^ 0xff) & 0x1f) == 0 || uVar3 <= uVar11) goto code_r0x00263a98;
  uVar1 = uVar12 + 2;
  param_2[2] = uVar1;
  bVar9 = *(byte *)(lVar10 + uVar11);
  uVar11 = uVar1;
  if ((char)bVar9 < '\0') {
    if (bVar9 < 0x83) {
      if (bVar9 == 0x81) {
        if (uVar3 <= uVar1) goto code_r0x00263a98;
        uVar11 = uVar12 + 3;
        param_2[2] = uVar11;
        bVar9 = *(byte *)(lVar10 + uVar1);
        if (-1 < (char)bVar9) goto code_r0x00263a98;
        goto code_r0x00263a80;
      }
      if (bVar9 != 0x82 || uVar3 <= uVar1) goto code_r0x00263a98;
      uVar2 = uVar12 + 3;
      param_2[2] = uVar2;
      if (uVar3 <= uVar2) goto code_r0x00263a98;
      cVar5 = *(char *)(lVar10 + uVar1);
      uVar11 = uVar12 + 4;
      param_2[2] = uVar11;
      if (cVar5 == '\0') goto code_r0x00263a98;
      uVar12 = (ulong)CONCAT11(cVar5,*(undefined1 *)(lVar10 + uVar2));
    }
    else {
      if (bVar9 == 0x83) {
        if (uVar3 <= uVar1) goto code_r0x00263a98;
        uVar11 = uVar12 + 3;
        param_2[2] = uVar11;
        if (uVar3 <= uVar11) goto code_r0x00263a98;
        bVar9 = *(byte *)(lVar10 + uVar1);
        uVar1 = uVar12 + 4;
        param_2[2] = uVar1;
        if (uVar3 <= uVar1) goto code_r0x00263a98;
        bVar6 = *(byte *)(lVar10 + uVar11);
        uVar11 = uVar12 + 5;
        param_2[2] = uVar11;
        if (bVar9 == 0) goto code_r0x00263a98;
        bVar8 = *(byte *)(lVar10 + uVar1);
        uVar12 = (ulong)bVar9 << 0x10 | (ulong)bVar6 << 8;
      }
      else {
        if (bVar9 != 0x84 || uVar3 <= uVar1) goto code_r0x00263a98;
        uVar11 = uVar12 + 3;
        param_2[2] = uVar11;
        if (uVar3 <= uVar11) goto code_r0x00263a98;
        bVar9 = *(byte *)(lVar10 + uVar1);
        uVar1 = uVar12 + 4;
        param_2[2] = uVar1;
        if (uVar3 <= uVar1) goto code_r0x00263a98;
        bVar6 = *(byte *)(lVar10 + uVar11);
        uVar2 = uVar12 + 5;
        param_2[2] = uVar2;
        if (uVar3 <= uVar2) goto code_r0x00263a98;
        bVar7 = *(byte *)(lVar10 + uVar1);
        uVar11 = uVar12 + 6;
        param_2[2] = uVar11;
        if (bVar9 == 0) goto code_r0x00263a98;
        bVar8 = *(byte *)(lVar10 + uVar2);
        uVar12 = (ulong)bVar9 << 0x18 | (ulong)bVar6 << 0x10 | (ulong)bVar7 << 8;
      }
      uVar12 = uVar12 | bVar8;
    }
    if (0xfffe < uVar12) goto code_r0x00263a98;
  }
  else {
code_r0x00263a80:
    uVar12 = (ulong)bVar9;
  }
  if ((!CARRY8(uVar11,uVar12)) && (uVar12 + uVar11 <= uVar3)) {
    param_2[2] = uVar12 + uVar11;
    if (param_3 == bVar4) {
      param_1[1] = lVar10 + uVar11;
      param_1[2] = uVar12;
      *param_1 = 0x800000000000002c;
      return;
    }
    *param_1 = 0x8000000000000000;
    return;
  }
code_r0x00263a98:
  *param_1 = 0x8000000000000000;
  *(undefined1 *)(param_1 + 1) = 0;
  *(undefined1 *)((long)param_1 + 0xf) = 0;
  *(undefined2 *)((long)param_1 + 0xd) = 0;
  *(undefined4 *)((long)param_1 + 9) = 0;
  return;
}

