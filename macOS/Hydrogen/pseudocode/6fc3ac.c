
void FUN_006fc3ac(void)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  undefined4 *puVar7;
  ulong uVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long lVar10;
  
  lVar2 = __dyld_get_image_header(0);
  *(long *)(unaff_x20 + 0x20) = lVar2 + unaff_x22;
  *(undefined4 *)(unaff_x20 + 0xc) = 0;
  if (*(int *)(unaff_x19 + 8) == 0) {
LAB_006fc41c:
    lVar10 = *(long *)(unaff_x19 + 0x20);
    lVar2 = __dyld_get_image_header(0);
    if (lVar10 == lVar2 + unaff_x22) {
      return;
    }
    if (*(byte *)(unaff_x19 + 6) != 0x1f) {
      uVar1 = 1 << (ulong)(*(byte *)(unaff_x19 + 6) & 0x1f);
      uVar3 = func_0x006f3708();
      *(undefined8 *)(unaff_x20 + 0x20) = uVar3;
      *(undefined2 *)(unaff_x20 + 6) = *(undefined2 *)(unaff_x19 + 6);
      _memcpy(uVar3,*(undefined8 *)(unaff_x19 + 0x20),
              -(ulong)(uVar1 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar1 << 5);
      *(undefined4 *)(unaff_x20 + 0xc) = *(undefined4 *)(unaff_x19 + 0xc);
      return;
    }
  }
  else if (-1 < *(int *)(unaff_x19 + 8)) {
    uVar3 = func_0x006f3708();
    *(undefined8 *)(unaff_x20 + 0x18) = uVar3;
    if (*(int *)(unaff_x20 + 0xc) < 1) {
      if (*(int *)(unaff_x19 + 0xc) < 0) {
        iVar4 = -*(int *)(unaff_x19 + 0xc);
      }
      else {
        iVar4 = *(int *)(unaff_x19 + 8);
      }
      *(int *)(unaff_x20 + 0xc) = -iVar4;
    }
    iVar4 = *(int *)(unaff_x19 + 8);
    *(int *)(unaff_x20 + 8) = iVar4;
    _memcpy(uVar3,*(undefined8 *)(unaff_x19 + 0x18),(long)iVar4 << 4);
    goto LAB_006fc41c;
  }
  lVar2 = func_0x006f36f4();
  uVar1 = *(uint *)(lVar2 + 8);
  uVar5 = (ulong)uVar1;
  if (0 < (int)uVar1) {
    lVar10 = *(long *)(lVar2 + 0x18);
    if (uVar1 < 4) {
      uVar8 = 0;
    }
    else {
      uVar8 = uVar5 & 0xfffffffc;
      puVar7 = (undefined4 *)(lVar10 + 0x2c);
      uVar9 = uVar8;
      do {
        puVar7[-8] = 0;
        puVar7[-4] = 0;
        *puVar7 = 0;
        puVar7[4] = 0;
        puVar7 = puVar7 + 0x10;
        uVar9 = uVar9 - 4;
      } while (uVar9 != 0);
      if (uVar8 == uVar5) goto code_r0x006fc514;
    }
    lVar6 = uVar5 - uVar8;
    puVar7 = (undefined4 *)(lVar10 + uVar8 * 0x10 + 0xc);
    do {
      *puVar7 = 0;
      lVar6 = lVar6 + -1;
      puVar7 = puVar7 + 4;
    } while (lVar6 != 0);
  }
code_r0x006fc514:
  if (*(int *)(lVar2 + 0xc) < 1) {
    *(undefined4 *)(lVar2 + 0xc) = 0;
  }
  lVar6 = *(long *)(lVar2 + 0x20);
  lVar10 = __dyld_get_image_header(0);
  if (lVar6 != lVar10 + 0x4e8dec0) {
    uVar1 = 1 << (ulong)(*(byte *)(lVar2 + 6) & 0x1f);
    *(uint *)(lVar2 + 0xc) = uVar1;
    if (*(byte *)(lVar2 + 6) != 0x1f) {
      lVar10 = 0;
      if ((int)uVar1 < 2) {
        uVar1 = 1;
      }
      do {
        lVar6 = *(long *)(lVar2 + 0x20) + lVar10;
        *(undefined4 *)(lVar6 + 0xc) = 0;
        *(undefined4 *)(lVar6 + 0x1c) = 0;
        lVar10 = lVar10 + 0x20;
      } while ((ulong)uVar1 * 0x20 != lVar10);
    }
  }
  *(undefined1 *)(lVar2 + 3) = 0xff;
  return;
}

