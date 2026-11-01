
void FUN_006e5f5c(ulong param_1)

{
  uint uVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  int iVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long lVar8;
  long in_x9;
  long lVar9;
  undefined4 *puVar10;
  long *in_x10;
  ulong uVar11;
  ulong uVar12;
  undefined1 auVar13 [12];
  
  plVar3 = (long *)(in_x9 + (param_1 & 0xffffffff) * 0x10);
  if (in_x10 <= plVar3) {
    lVar2 = __dyld_get_image_header(0);
    plVar3 = (long *)(lVar2 + 0x4e8dd08);
  }
  lVar2 = *plVar3;
  if (*(char *)(lVar2 + 4) != '\0') {
    auVar13 = func_0x006ed124();
    iVar5 = auVar13._8_4_;
    lVar2 = auVar13._0_8_;
    if (iVar5 < 1) {
      if (iVar5 < -9999) {
        puVar6 = (undefined8 *)func_0x006e60a0(lVar2);
      }
      else {
        puVar6 = (undefined8 *)(*(long *)(lVar2 + 8) + (long)iVar5 * 0x10);
      }
    }
    else {
      puVar6 = (undefined8 *)(*(long *)(lVar2 + 0x10) + (ulong)(iVar5 - 1) * 0x10);
      if (*(undefined8 **)(lVar2 + 8) <= puVar6) {
        lVar9 = __dyld_get_image_header(0);
        puVar6 = (undefined8 *)(lVar9 + 0x4e8dd08);
      }
    }
    uVar4 = func_0x006fc344(lVar2,*puVar6);
    puVar6 = *(undefined8 **)(lVar2 + 8);
    *puVar6 = uVar4;
    *(undefined4 *)((long)puVar6 + 0xc) = 6;
    *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + 0x10;
    return;
  }
  uVar1 = *(uint *)(lVar2 + 8);
  uVar7 = (ulong)uVar1;
  if (0 < (int)uVar1) {
    lVar9 = *(long *)(lVar2 + 0x18);
    if (uVar1 < 4) {
      uVar11 = 0;
    }
    else {
      uVar11 = uVar7 & 0xfffffffc;
      puVar10 = (undefined4 *)(lVar9 + 0x2c);
      uVar12 = uVar11;
      do {
        puVar10[-8] = 0;
        puVar10[-4] = 0;
        *puVar10 = 0;
        puVar10[4] = 0;
        puVar10 = puVar10 + 0x10;
        uVar12 = uVar12 - 4;
      } while (uVar12 != 0);
      if (uVar11 == uVar7) goto code_r0x006fc514;
    }
    lVar8 = uVar7 - uVar11;
    puVar10 = (undefined4 *)(lVar9 + uVar11 * 0x10 + 0xc);
    do {
      *puVar10 = 0;
      lVar8 = lVar8 + -1;
      puVar10 = puVar10 + 4;
    } while (lVar8 != 0);
  }
code_r0x006fc514:
  if (*(int *)(lVar2 + 0xc) < 1) {
    *(undefined4 *)(lVar2 + 0xc) = 0;
  }
  lVar8 = *(long *)(lVar2 + 0x20);
  lVar9 = __dyld_get_image_header(0);
  if (lVar8 != lVar9 + 0x4e8dec0) {
    uVar1 = 1 << (ulong)(*(byte *)(lVar2 + 6) & 0x1f);
    *(uint *)(lVar2 + 0xc) = uVar1;
    if (*(byte *)(lVar2 + 6) != 0x1f) {
      lVar9 = 0;
      if ((int)uVar1 < 2) {
        uVar1 = 1;
      }
      do {
        lVar8 = *(long *)(lVar2 + 0x20) + lVar9;
        *(undefined4 *)(lVar8 + 0xc) = 0;
        *(undefined4 *)(lVar8 + 0x1c) = 0;
        lVar9 = lVar9 + 0x20;
      } while ((ulong)uVar1 * 0x20 != lVar9);
    }
  }
  *(undefined1 *)(lVar2 + 3) = 0xff;
  return;
}

