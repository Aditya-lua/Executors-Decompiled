
void FUN_006fc49c(long param_1)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  undefined4 *puVar5;
  ulong uVar6;
  ulong uVar7;
  
  uVar1 = *(uint *)(param_1 + 8);
  uVar2 = (ulong)uVar1;
  if (0 < (int)uVar1) {
    lVar4 = *(long *)(param_1 + 0x18);
    if (uVar1 < 4) {
      uVar6 = 0;
    }
    else {
      uVar6 = uVar2 & 0xfffffffc;
      puVar5 = (undefined4 *)(lVar4 + 0x2c);
      uVar7 = uVar6;
      do {
        puVar5[-8] = 0;
        puVar5[-4] = 0;
        *puVar5 = 0;
        puVar5[4] = 0;
        puVar5 = puVar5 + 0x10;
        uVar7 = uVar7 - 4;
      } while (uVar7 != 0);
      if (uVar6 == uVar2) goto LAB_006fc514;
    }
    lVar3 = uVar2 - uVar6;
    puVar5 = (undefined4 *)(lVar4 + uVar6 * 0x10 + 0xc);
    do {
      *puVar5 = 0;
      lVar3 = lVar3 + -1;
      puVar5 = puVar5 + 4;
    } while (lVar3 != 0);
  }
LAB_006fc514:
  if (*(int *)(param_1 + 0xc) < 1) {
    *(undefined4 *)(param_1 + 0xc) = 0;
  }
  lVar3 = *(long *)(param_1 + 0x20);
  lVar4 = __dyld_get_image_header(0);
  if (lVar3 != lVar4 + 0x4e8dec0) {
    uVar1 = 1 << (ulong)(*(byte *)(param_1 + 6) & 0x1f);
    *(uint *)(param_1 + 0xc) = uVar1;
    if (*(byte *)(param_1 + 6) != 0x1f) {
      lVar4 = 0;
      if ((int)uVar1 < 2) {
        uVar1 = 1;
      }
      do {
        lVar3 = *(long *)(param_1 + 0x20) + lVar4;
        *(undefined4 *)(lVar3 + 0xc) = 0;
        *(undefined4 *)(lVar3 + 0x1c) = 0;
        lVar4 = lVar4 + 0x20;
      } while ((ulong)uVar1 * 0x20 != lVar4);
    }
  }
  *(undefined1 *)(param_1 + 3) = 0xff;
  return;
}

