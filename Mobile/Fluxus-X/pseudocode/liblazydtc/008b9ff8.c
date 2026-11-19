/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9ff8
 */

undefined1 * FUN_008b9ff8(long param_1,int *param_2,ulong param_3)

{
  byte bVar1;
  undefined1 uVar2;
  byte bVar3;
  ulong uVar4;
  int iVar5;
  ulong uVar6;
  uint uVar7;
  uint uVar8;
  long lVar9;
  int *piVar10;
  uint uVar11;
  ulong uVar12;
  undefined1 *puVar13;
  long lVar14;
  
  if (DAT_00d1fbd8 != '\x01') {
    if (param_3 < 0x20) {
      if (param_3 != 0) {
        lVar14 = (long)param_2 + -1;
        uVar12 = param_3 & 0xffffffff;
        uVar6 = param_3;
        goto LAB_008ba1e0;
      }
      uVar11 = 0;
    }
    else {
      uVar8 = 0;
      uVar11 = 0;
      uVar12 = param_3 & 0xffffffff;
      uVar6 = param_3;
      piVar10 = param_2;
      do {
        uVar6 = uVar6 - 0xc;
        uVar7 = piVar10[2] + (int)uVar12;
        uVar11 = (uVar7 ^ *piVar10 + uVar11) - (uVar7 >> 0xe | uVar7 * 0x40000);
        uVar8 = (uVar11 ^ piVar10[1] + uVar8) - (uVar11 >> 0xb | uVar11 * 0x200000);
        uVar12 = (ulong)((uVar8 ^ uVar7) - (uVar8 >> 0x19 | uVar8 * 0x80));
        piVar10 = piVar10 + 3;
      } while (0x1f < uVar6);
      lVar14 = (long)param_2 + ((param_3 - 0x20) / 0xc) * 0xc + 0xb;
LAB_008ba1e0:
      do {
        uVar11 = (uint)uVar12;
        uVar4 = uVar6 - 1;
        uVar11 = uVar11 * 0x20 + (uVar11 >> 2) + (uint)*(byte *)(lVar14 + uVar6) ^ uVar11;
        uVar12 = (ulong)uVar11;
        uVar6 = uVar4;
      } while (uVar4 != 0);
    }
    lVar14 = *(long *)(param_1 + 0x60);
    for (puVar13 = *(undefined1 **)
                    (*(long *)(lVar14 + 0x38) +
                    (long)(int)(*(int *)(lVar14 + 0x2c) - 1U & uVar11) * 8);
        puVar13 != (undefined1 *)0x0; puVar13 = *(undefined1 **)(puVar13 + 8)) {
      if ((param_3 == *(uint *)(puVar13 + 0x14)) &&
         (iVar5 = memcmp(param_2,puVar13 + 0x18,param_3), iVar5 == 0)) {
        bVar3 = puVar13[2];
        bVar1 = *(byte *)(lVar14 + 2);
        goto LAB_008ba274;
      }
    }
    uVar8 = 0;
    goto LAB_008ba22c;
  }
  lVar14 = *(long *)(param_1 + 0x60);
  if (param_3 < 0x20) {
    if (param_3 != 0) {
      lVar9 = (long)param_2 + -1;
      uVar12 = param_3 & 0xffffffff;
      uVar6 = param_3;
      goto LAB_008ba148;
    }
    uVar11 = 0;
  }
  else {
    uVar8 = 0;
    uVar11 = 0;
    uVar12 = param_3 & 0xffffffff;
    uVar6 = param_3;
    piVar10 = param_2;
    do {
      uVar6 = uVar6 - 0xc;
      uVar7 = piVar10[2] + (int)uVar12;
      uVar11 = (uVar7 ^ *piVar10 + uVar11) - (uVar7 >> 0xe | uVar7 * 0x40000);
      uVar8 = (uVar11 ^ piVar10[1] + uVar8) - (uVar11 >> 0xb | uVar11 * 0x200000);
      uVar12 = (ulong)((uVar8 ^ uVar7) - (uVar8 >> 0x19 | uVar8 * 0x80));
      piVar10 = piVar10 + 3;
    } while (0x1f < uVar6);
    lVar9 = (long)param_2 + ((param_3 - 0x20) / 0xc) * 0xc + 0xb;
LAB_008ba148:
    do {
      uVar11 = (uint)uVar12;
      uVar4 = uVar6 - 1;
      uVar11 = uVar11 * 0x20 + (uVar11 >> 2) + (uint)*(byte *)(lVar9 + uVar6) ^ uVar11;
      uVar12 = (ulong)uVar11;
      uVar6 = uVar4;
    } while (uVar4 != 0);
  }
  uVar8 = *(int *)(lVar14 + 0x30) + *(int *)(lVar14 + 0x28) * uVar11;
  for (puVar13 = *(undefined1 **)
                  (*(long *)(lVar14 + 0x38) +
                  (long)(int)(uVar8 >> (ulong)(*(byte *)(lVar14 + 0x44) & 0x1f)) * 8);
      puVar13 != (undefined1 *)0x0; puVar13 = *(undefined1 **)(puVar13 + 8)) {
    if ((param_3 == *(uint *)(puVar13 + 0x14)) &&
       (iVar5 = memcmp(param_2,puVar13 + 0x18,param_3), iVar5 == 0)) {
      bVar3 = puVar13[2];
      bVar1 = *(byte *)(lVar14 + 2);
LAB_008ba274:
      if ((bVar1 & 3 ^ bVar3 & 0xb) == 3) {
        puVar13[2] = bVar3 ^ 3;
      }
      return puVar13;
    }
  }
LAB_008ba22c:
  if (0x40000000 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_008b75fc(param_1);
  }
  puVar13 = (undefined1 *)FUN_008b78d0(param_1,param_3 + 0x19,*(undefined1 *)(param_1 + 4),5,0);
  lVar14 = *(long *)(param_1 + 0x60);
  uVar2 = *(undefined1 *)(param_1 + 4);
  *puVar13 = 5;
  bVar3 = *(byte *)(lVar14 + 2);
  puVar13[1] = uVar2;
  *(undefined4 *)(puVar13 + 4) = 0x8000ffff;
  *(uint *)(puVar13 + 0x10) = uVar11;
  *(int *)(puVar13 + 0x14) = (int)param_3;
  puVar13[2] = bVar3 & 3;
  memcpy(puVar13 + 0x18,param_2,param_3);
  (puVar13 + 0x18)[param_3] = 0;
  lVar14 = *(long *)(param_1 + 0x60);
  lVar9 = *(long *)(lVar14 + 0x38);
  if (DAT_00d1fbd8 == '\x01') {
    uVar8 = uVar8 >> (ulong)(*(byte *)(lVar14 + 0x44) & 0x1f);
    uVar7 = *(uint *)(lVar14 + 0x2c);
  }
  else {
    uVar7 = *(uint *)(lVar14 + 0x2c);
    uVar8 = uVar7 - 1 & uVar11;
  }
  *(undefined8 *)(puVar13 + 8) = *(undefined8 *)(lVar9 + (ulong)uVar8 * 8);
  *(undefined1 **)(lVar9 + (ulong)uVar8 * 8) = puVar13;
  uVar11 = *(int *)(lVar14 + 0x40) + 1;
  *(uint *)(lVar14 + 0x40) = uVar11;
  if ((uVar7 < uVar11) && ((int)uVar7 < 0x40000000)) {
    FUN_008b9b8c(param_1,uVar7 << 1);
  }
  return puVar13;
}

