
/* WARNING: Removing unreachable block (ram,0x002f7570) */
/* WARNING: Removing unreachable block (ram,0x002f7574) */
/* WARNING: Removing unreachable block (ram,0x002f75a0) */
/* WARNING: Removing unreachable block (ram,0x002f75a8) */
/* WARNING: Removing unreachable block (ram,0x002f7430) */
/* WARNING: Removing unreachable block (ram,0x002f744c) */
/* WARNING: Removing unreachable block (ram,0x002f7464) */
/* WARNING: Removing unreachable block (ram,0x002f749c) */
/* WARNING: Removing unreachable block (ram,0x002f74b8) */
/* WARNING: Removing unreachable block (ram,0x002f74d4) */
/* WARNING: Removing unreachable block (ram,0x002f74dc) */
/* WARNING: Removing unreachable block (ram,0x002f74f4) */
/* WARNING: Removing unreachable block (ram,0x002f7504) */
/* WARNING: Removing unreachable block (ram,0x002f75c4) */
/* WARNING: Removing unreachable block (ram,0x002f75d4) */
/* WARNING: Removing unreachable block (ram,0x002f75e8) */
/* WARNING: Removing unreachable block (ram,0x002f7618) */
/* WARNING: Removing unreachable block (ram,0x002f7620) */
/* WARNING: Removing unreachable block (ram,0x002f75cc) */
/* WARNING: Removing unreachable block (ram,0x002f7628) */
/* WARNING: Removing unreachable block (ram,0x002f764c) */
/* WARNING: Removing unreachable block (ram,0x002f7664) */
/* WARNING: Removing unreachable block (ram,0x002f766c) */
/* WARNING: Removing unreachable block (ram,0x002f7530) */

undefined8 FUN_002f7308(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  byte *pbVar5;
  long extraout_x8;
  byte *pbVar6;
  long extraout_x9;
  uint in_w10;
  long lVar7;
  ulong in_x13;
  undefined1 *unaff_x19;
  int iVar8;
  ulong unaff_x20;
  ulong uVar9;
  long unaff_x24;
  ulong unaff_x25;
  ulong uVar10;
  
  if (param_1 < 0x100) {
    in_x13 = param_1;
  }
  uVar10 = in_x13 >> 4;
  if (in_x13 < 0x10) {
    uVar10 = in_x13;
  }
  uVar9 = uVar10 >> 2;
  if (uVar10 < 4) {
    uVar9 = uVar10;
  }
  uVar1 = in_w10 | (uint)(0xf < in_x13) << 2 | (uint)(3 < uVar10) << 1;
  if (1 < uVar9) {
    uVar1 = uVar1 + 1;
  }
  uVar2 = func_0x002f7028();
  uVar10 = (ulong)uVar2;
  if ((uVar1 - 1 & 7) == 0) {
    if (uVar2 == 0) {
      func_0x0079edc8();
      pbVar5 = (byte *)(extraout_x8 + extraout_x9);
      lVar7 = unaff_x24 - extraout_x9;
      pbVar6 = (byte *)(unaff_x20 + extraout_x9);
      do {
        pbVar5 = pbVar5 + 1;
        *pbVar5 = *pbVar5 ^ *pbVar6;
        lVar7 = lVar7 + -1;
        pbVar6 = pbVar6 + 1;
      } while (lVar7 != 0);
      unaff_x19[-1] = 0xbc;
      uVar3 = 1;
      goto code_r0x002f7398;
    }
    *unaff_x19 = 0;
    uVar10 = uVar10 - 1;
    if (uVar10 < unaff_x25 + 2) goto code_r0x002f7374;
LAB_002f728c:
    iVar8 = (int)unaff_x20;
    uVar9 = unaff_x25;
    if (iVar8 == -1) {
code_r0x002f72a8:
      if (uVar9 <= (uVar10 - unaff_x25) - 2) {
code_r0x002f73dc:
        if (uVar9 == 0) {
          unaff_x20 = 0;
        }
        else {
          unaff_x20 = func_0x0036e274(uVar9);
          if (unaff_x20 == 0) {
            uVar3 = 0;
            goto code_r0x002f7398;
          }
          func_0x002b0104(unaff_x20,uVar9,&UNK_00831b38);
        }
        func_0x002c17e0();
        func_0x0036e3d8(0);
        uVar3 = 0;
        goto code_r0x002f7398;
      }
    }
    else {
      if (iVar8 == -2) {
        uVar9 = (uVar10 - unaff_x25) - 2;
        goto code_r0x002f72a8;
      }
      if (iVar8 < 0) {
        uVar3 = 0x8a;
        uVar4 = 0x16c;
        goto code_r0x002f738c;
      }
      uVar9 = unaff_x20 & 0xffffffff;
      if (uVar9 <= (uVar10 - unaff_x25) - 2) goto code_r0x002f73dc;
    }
    uVar3 = 0x72;
    uVar4 = 0x173;
  }
  else {
    if (unaff_x25 + 2 <= uVar10) goto LAB_002f728c;
code_r0x002f7374:
    uVar3 = 0x72;
    uVar4 = 0x15e;
  }
code_r0x002f738c:
  func_0x0028f83c(4,0,uVar3,"/aws-lc/crypto/fipsmodule/rsa/padding.c",uVar4);
  uVar3 = 0;
  unaff_x20 = 0;
code_r0x002f7398:
  func_0x0036e3d8(unaff_x20);
  return uVar3;
}

