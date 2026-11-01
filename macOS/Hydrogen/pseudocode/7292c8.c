
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 thunk_FUN_007292e0(ulong param_1,undefined8 param_2,undefined8 *param_3,long *param_4)

{
  byte bVar1;
  byte bVar2;
  ulong uVar3;
  undefined1 *puVar4;
  ulong uVar5;
  long lVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  uint uVar9;
  byte *pbVar10;
  uint uVar11;
  long *unaff_x19;
  undefined8 *unaff_x20;
  byte *unaff_x21;
  ulong unaff_x22;
  int unaff_w23;
  long lVar12;
  int unaff_w25;
  long unaff_x29;
  undefined1 auVar13 [16];
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined3 uStack0000000000000028;
  undefined5 uStack000000000000002b;
  undefined3 uStack0000000000000030;
  undefined5 uStack0000000000000033;
  undefined3 uStack0000000000000038;
  undefined5 uStack000000000000003b;
  undefined3 uStack0000000000000040;
  undefined5 uStack0000000000000043;
  undefined3 uStack0000000000000048;
  undefined5 uStack000000000000004b;
  undefined3 uStack0000000000000050;
  undefined5 uStack0000000000000053;
  undefined3 uStack0000000000000058;
  undefined5 uStack000000000000005b;
  undefined3 uStack0000000000000060;
  undefined5 uStack0000000000000063;
  undefined3 uStack0000000000000068;
  undefined5 uStack000000000000006b;
  undefined3 uStack0000000000000070;
  undefined5 uStack0000000000000073;
  undefined3 uStack0000000000000078;
  undefined5 uStack000000000000007b;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  
  lVar12 = (param_1 >> 2) * 3 - unaff_x22;
  puVar4 = (undefined1 *)(*pcRam0000000000a2b5e8)(lVar12 + 1);
  if (puVar4 == (undefined1 *)0x0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return 0x1b;
    }
  }
  else {
    uStack0000000000000028 = 0xffffff;
    in_stack_00000020 = 0xffffffffffffffff;
    in_stack_000000e8 = 0xffffffffffffffff;
    in_stack_000000e0 = 0xffffffffffffffff;
    in_stack_000000f8 = 0xffffffffffffffff;
    in_stack_000000f0 = 0xffffffffffffffff;
    in_stack_000000c8 = 0xffffffffffffffff;
    in_stack_000000c0 = 0xffffffffffffffff;
    in_stack_000000d8 = 0xffffffffffffffff;
    in_stack_000000d0 = 0xffffffffffffffff;
    in_stack_000000a8 = 0xffffffffffffffff;
    in_stack_000000a0 = 0xffffffffffffffff;
    in_stack_000000b8 = 0xffffffffffffffff;
    in_stack_000000b0 = 0xffffffffffffffff;
    in_stack_00000088 = 0xffffffffffffffff;
    in_stack_00000080 = 0xffffffffffffffff;
    in_stack_00000098 = 0xffffffffffffffff;
    in_stack_00000090 = 0xffffffffffffffff;
    uStack000000000000007b = 0xffffffffff;
    in_stack_00000008 = 0xffffffffffffffff;
    uStack0000000000000000 = 0xffffffffffffffff;
    in_stack_00000018 = 0xffffffffffffffff;
    in_stack_00000010 = 0xffffffffffffffff;
    uStack0000000000000033 = (undefined5)_UNK_008ccc3e;
    uStack0000000000000038 = (undefined3)((ulong)_UNK_008ccc3e >> 0x28);
    uStack000000000000002b = (undefined5)_UNK_008ccc36;
    uStack0000000000000030 = (undefined3)((ulong)_UNK_008ccc36 >> 0x28);
    uStack0000000000000073 = (undefined5)_UNK_008ccc7e;
    uStack0000000000000078 = (undefined3)((ulong)_UNK_008ccc7e >> 0x28);
    uStack000000000000006b = (undefined5)_UNK_008ccc76;
    uStack0000000000000070 = (undefined3)((ulong)_UNK_008ccc76 >> 0x28);
    uStack0000000000000063 = (undefined5)_UNK_008ccc6e;
    uStack0000000000000068 = (undefined3)((ulong)_UNK_008ccc6e >> 0x28);
    uStack000000000000005b = (undefined5)_UNK_008ccc66;
    uStack0000000000000060 = (undefined3)((ulong)_UNK_008ccc66 >> 0x28);
    uStack0000000000000053 = (undefined5)_UNK_008ccc5e;
    uStack0000000000000058 = (undefined3)((ulong)_UNK_008ccc5e >> 0x28);
    uStack000000000000004b = (undefined5)_UNK_008ccc56;
    uStack0000000000000050 = (undefined3)((ulong)_UNK_008ccc56 >> 0x28);
    uStack0000000000000043 = (undefined5)_UNK_008ccc4e;
    uStack0000000000000048 = (undefined3)((ulong)_UNK_008ccc4e >> 0x28);
    uStack000000000000003b = (undefined5)_UNK_008ccc46;
    uStack0000000000000040 = (undefined3)((ulong)_UNK_008ccc46 >> 0x28);
    lVar6 = (param_1 >> 2) - (ulong)(unaff_w25 == 0x3d);
    puVar8 = puVar4;
    pbVar10 = unaff_x21;
    if (lVar6 != 0) {
      puVar7 = puVar4;
      do {
        pbVar10 = unaff_x21 + 4;
        bVar1 = *(byte *)((long)&uStack0000000000000000 + (ulong)*unaff_x21);
        if ((bVar1 == 0xff) ||
           (*(byte *)((long)&uStack0000000000000000 + (ulong)unaff_x21[1]) == 0xff))
        goto LAB_007294c8;
        bVar2 = *(byte *)((long)&uStack0000000000000000 + (ulong)unaff_x21[2]);
        if ((bVar2 == 0xff) ||
           (*(byte *)((long)&uStack0000000000000000 + (ulong)unaff_x21[3]) == 0xff))
        goto LAB_007294c8;
        uVar11 = (uint)*(byte *)((long)&uStack0000000000000000 + (ulong)unaff_x21[1]) << 6;
        puVar7[2] = *(byte *)((long)&uStack0000000000000000 + (ulong)unaff_x21[3]) | bVar2 << 6;
        puVar7[1] = (char)((uVar11 | bVar2) >> 2);
        puVar8 = puVar7 + 3;
        *puVar7 = (char)((uVar11 | (uint)bVar1 << 0xc) >> 10);
        unaff_x21 = unaff_x21 + 4;
        lVar6 = lVar6 + -1;
        puVar7 = puVar8;
      } while (lVar6 != 0);
    }
    if (unaff_w25 == 0x3d) {
      if ((ulong)*pbVar10 == 0x3d) {
        uVar11 = 0;
        uVar5 = 1;
        bVar1 = pbVar10[1];
joined_r0x00729468:
        if ((ulong)bVar1 == 0x3d) {
          if (uVar5 < unaff_x22) {
            uVar5 = uVar5 + 1;
LAB_00729480:
            if ((ulong)pbVar10[2] == 0x3d) {
              if (uVar5 < unaff_x22) {
                uVar11 = uVar11 << 6;
                uVar5 = uVar5 + 1;
LAB_007294b4:
                if ((ulong)pbVar10[3] == 0x3d) {
                  if (uVar5 < unaff_x22) {
LAB_00729528:
                    if (unaff_w23 != 0) {
                      puVar8[1] = (char)(uVar11 >> 2);
                    }
                    *puVar8 = (char)(uVar11 >> 10);
                    puVar8 = puVar8 + (unaff_x22 ^ 3);
                    goto LAB_00729544;
                  }
                }
                else if (*(char *)((long)&uStack0000000000000000 + (ulong)pbVar10[3]) != -1)
                goto LAB_00729528;
              }
            }
            else {
              uVar9 = (uint)*(byte *)((long)&uStack0000000000000000 + (ulong)pbVar10[2]);
              if (uVar9 != 0xff) {
                uVar11 = uVar9 | uVar11 << 6;
                goto LAB_007294b4;
              }
            }
          }
        }
        else {
          uVar9 = (uint)*(byte *)((long)&uStack0000000000000000 + (ulong)bVar1);
          if (uVar9 != 0xff) {
            uVar11 = uVar11 | uVar9;
            goto LAB_00729480;
          }
        }
      }
      else {
        bVar1 = *(byte *)((long)&uStack0000000000000000 + (ulong)*pbVar10);
        if (bVar1 != 0xff) {
          uVar5 = 0;
          uVar11 = (uint)bVar1 << 6;
          bVar1 = pbVar10[1];
          goto joined_r0x00729468;
        }
      }
LAB_007294c8:
      (*pcRam0000000000a2b5f0)();
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return 0x3d;
      }
    }
    else {
LAB_00729544:
      *puVar8 = 0;
      *unaff_x20 = puVar4;
      *unaff_x19 = lVar12;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return 0;
      }
    }
  }
  auVar13 = ___stack_chk_fail();
  uVar5 = auVar13._8_8_;
  pbVar10 = auVar13._0_8_;
  *param_3 = 0;
  *param_4 = 0;
  if (uVar5 == 0) {
    uVar5 = _strlen(pbVar10);
  }
  puVar4 = (undefined1 *)(*pcRam0000000000a2b5e8)((uVar5 + 2) / 3 << 2 | 1);
  if (puVar4 == (undefined1 *)0x0) {
    return 0x1b;
  }
  puVar8 = puVar4;
  if (2 < uVar5) {
    puVar7 = puVar4;
    do {
      *puVar7 = (&UNK_008ccc86)[*pbVar10 >> 2];
      puVar7[1] = (&UNK_008ccc86)[(ulong)(pbVar10[1] >> 4) | ((ulong)*pbVar10 & 3) << 4];
      puVar7[2] = (&UNK_008ccc86)[(ulong)(pbVar10[2] >> 6) | ((ulong)pbVar10[1] & 0xf) << 2];
      puVar8 = puVar7 + 4;
      puVar7[3] = (&UNK_008ccc86)[(ulong)pbVar10[2] & 0x3f];
      uVar5 = uVar5 - 3;
      pbVar10 = pbVar10 + 3;
      puVar7 = puVar8;
    } while (2 < uVar5);
  }
  if (uVar5 != 0) {
    *puVar8 = (&UNK_008ccc86)[*pbVar10 >> 2];
    uVar3 = ((ulong)*pbVar10 & 3) * 0x10;
    if (uVar5 == 1) {
      puVar8[1] = (&UNK_008ccc86)[uVar3];
      if (UNK_008cccc6 == '\0') {
        puVar8 = puVar8 + 2;
        goto LAB_00729720;
      }
      puVar8[2] = UNK_008cccc6;
    }
    else {
      puVar8[1] = (&UNK_008ccc86)[uVar3 | pbVar10[1] >> 4];
      puVar8[2] = (&UNK_008ccc86)[((ulong)pbVar10[1] & 0xf) * 4];
      if (UNK_008cccc6 == '\0') {
        puVar8 = puVar8 + 3;
        goto LAB_00729720;
      }
    }
    puVar8[3] = UNK_008cccc6;
    puVar8 = puVar8 + 4;
  }
LAB_00729720:
  *puVar8 = 0;
  *param_3 = puVar4;
  *param_4 = (long)puVar8 - (long)puVar4;
  return 0;
}

