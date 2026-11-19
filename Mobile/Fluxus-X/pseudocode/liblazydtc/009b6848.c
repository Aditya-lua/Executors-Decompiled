/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6848
 */

void ssl_set_masks(uint *param_1)

{
  uint uVar1;
  bool bVar2;
  bool bVar3;
  bool bVar4;
  ulong uVar5;
  long lVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  
  lVar6 = *(long *)(param_1 + 0x226);
  if (lVar6 != 0) {
    if ((*(long *)(lVar6 + 8) == 0) && (*(long *)(lVar6 + 0x10) == 0)) {
      bVar4 = *(int *)(lVar6 + 0x18) != 0;
    }
    else {
      bVar4 = true;
    }
    if (*(long *)(lVar6 + 0x110) == 0) {
      bVar2 = true;
    }
    else {
      bVar2 = *(long *)(lVar6 + 0x118) == 0;
    }
    if (*(long *)(lVar6 + 0xe8) == 0) {
      bVar3 = true;
    }
    else {
      bVar3 = *(long *)(lVar6 + 0xf0) == 0;
    }
    uVar9 = 0;
    if (!(bool)(bVar2 & bVar3)) {
      uVar9 = 0x80;
    }
    uVar7 = 0;
    if (!(bool)(bVar2 & bVar3)) {
      uVar7 = 0x210;
    }
    if ((*(long *)(lVar6 + 0xc0) != 0) && (*(long *)(lVar6 + 200) != 0)) {
      uVar7 = uVar7 | 0x10;
      uVar9 = uVar9 | 0x20;
    }
    uVar7 = uVar7 | param_1[0xee] & 1;
    uVar1 = uVar7 | 2;
    if (!bVar4) {
      uVar1 = uVar7;
    }
    if (((param_1[0xee] & 1) != 0) ||
       ((((*(long *)(lVar6 + 0x48) != 0 && (*(long *)(lVar6 + 0x50) != 0)) &&
         ((*(byte *)((long)param_1 + 0x3bd) & 1) != 0)) && (*param_1 == 0x303)))) {
      uVar9 = uVar9 | 1;
    }
    uVar9 = uVar9 | (param_1[0xf0] & 1) << 1;
    uVar8 = uVar9 | 4;
    uVar7 = uVar8;
    if ((param_1[0xf1] & 1) != 0) {
      uVar5 = X509_get_key_usage(*(undefined8 *)(lVar6 + 0x98));
      uVar7 = uVar9 | 0xc;
      if (((uint)(uVar5 >> 7) & 0x1ffffff & ((byte)param_1[0xf1] & 2) >> 1) == 0) {
        uVar7 = uVar8;
      }
    }
    if ((((uVar7 >> 3 & 1) == 0) && (*(long *)(*(long *)(param_1 + 0x226) + 0x138) != 0)) &&
       ((*(long *)(*(long *)(param_1 + 0x226) + 0x140) != 0 &&
        (((*(byte *)((long)param_1 + 0x3d5) & 1) != 0 && ((*param_1 & 0xffffff00) == 0x300)))))) {
      uVar9 = uVar7 | 8;
      if (*param_1 != 0x303) {
        uVar9 = uVar7;
      }
      uVar7 = uVar9;
    }
    if (((((uVar7 >> 3 & 1) == 0) && (*(long *)(*(long *)(param_1 + 0x226) + 0x160) != 0)) &&
        (*(long *)(*(long *)(param_1 + 0x226) + 0x168) != 0)) &&
       (((*(byte *)((long)param_1 + 0x3d9) & 1) != 0 && ((*param_1 & 0xffffff00) == 0x300)))) {
      uVar9 = uVar7 | 8;
      if (*param_1 != 0x303) {
        uVar9 = uVar7;
      }
      uVar7 = uVar9;
    }
    param_1[0xf7] = uVar1 | (uVar1 & 1) << 6 | (uVar1 & 2) << 7 | 0x8c;
    param_1[0xf8] = uVar7 | 0x10;
  }
  return;
}

