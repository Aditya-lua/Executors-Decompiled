
void FUN_006fc400(undefined8 param_1)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  int in_w8;
  ulong uVar5;
  long lVar6;
  undefined4 *puVar7;
  ulong uVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long lVar10;
  
  *(int *)(unaff_x20 + 0xc) = -in_w8;
  iVar1 = *(int *)(unaff_x19 + 8);
  *(int *)(unaff_x20 + 8) = iVar1;
  _memcpy(param_1,*(undefined8 *)(unaff_x19 + 0x18),(long)iVar1 << 4);
  lVar10 = *(long *)(unaff_x19 + 0x20);
  lVar3 = __dyld_get_image_header(0);
  if (lVar10 != lVar3 + unaff_x22) {
    if (*(byte *)(unaff_x19 + 6) == 0x1f) {
      lVar3 = func_0x006f36f4();
      uVar2 = *(uint *)(lVar3 + 8);
      uVar5 = (ulong)uVar2;
      if (0 < (int)uVar2) {
        lVar10 = *(long *)(lVar3 + 0x18);
        if (uVar2 < 4) {
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
      if (*(int *)(lVar3 + 0xc) < 1) {
        *(undefined4 *)(lVar3 + 0xc) = 0;
      }
      lVar6 = *(long *)(lVar3 + 0x20);
      lVar10 = __dyld_get_image_header(0);
      if (lVar6 != lVar10 + 0x4e8dec0) {
        uVar2 = 1 << (ulong)(*(byte *)(lVar3 + 6) & 0x1f);
        *(uint *)(lVar3 + 0xc) = uVar2;
        if (*(byte *)(lVar3 + 6) != 0x1f) {
          lVar10 = 0;
          if ((int)uVar2 < 2) {
            uVar2 = 1;
          }
          do {
            lVar6 = *(long *)(lVar3 + 0x20) + lVar10;
            *(undefined4 *)(lVar6 + 0xc) = 0;
            *(undefined4 *)(lVar6 + 0x1c) = 0;
            lVar10 = lVar10 + 0x20;
          } while ((ulong)uVar2 * 0x20 != lVar10);
        }
      }
      *(undefined1 *)(lVar3 + 3) = 0xff;
      return;
    }
    uVar2 = 1 << (ulong)(*(byte *)(unaff_x19 + 6) & 0x1f);
    uVar4 = func_0x006f3708();
    *(undefined8 *)(unaff_x20 + 0x20) = uVar4;
    *(undefined2 *)(unaff_x20 + 6) = *(undefined2 *)(unaff_x19 + 6);
    _memcpy(uVar4,*(undefined8 *)(unaff_x19 + 0x20),
            -(ulong)(uVar2 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar2 << 5);
    *(undefined4 *)(unaff_x20 + 0xc) = *(undefined4 *)(unaff_x19 + 0xc);
  }
  return;
}

