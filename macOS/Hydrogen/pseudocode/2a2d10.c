
/* WARNING: Removing unreachable block (ram,0x002a2cb8) */
/* WARNING: Removing unreachable block (ram,0x002a2cbc) */
/* WARNING: Removing unreachable block (ram,0x002a2ccc) */
/* WARNING: Removing unreachable block (ram,0x002a2cb0) */
/* WARNING: Removing unreachable block (ram,0x002a2cb4) */

undefined8 * FUN_002a2d10(ulong param_1)

{
  uint uVar1;
  int iVar2;
  long in_x9;
  uint uVar3;
  uint uVar4;
  ulong in_x10;
  long lVar5;
  uint uVar6;
  ulong uVar7;
  long *unaff_x21;
  uint unaff_w26;
  undefined8 *puVar8;
  ulong unaff_x28;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined8 in_stack_00000000;
  uint uStack0000000000000008;
  byte bStack000000000000000c;
  
code_r0x002a2d10:
  uVar4 = (uint)in_x10 & 1;
LAB_002a2d1c:
  uVar3 = 3;
  if (uVar4 == 0) {
    uVar3 = 1;
  }
  if ((2 < unaff_w26) && (lVar5 = unaff_x28 << 0x20, 0x100000000 < lVar5)) {
    iVar2 = (int)unaff_x28;
    if ((iVar2 < 2) || (uVar7 = (ulong)(iVar2 - 2U >> 6), param_1 <= uVar7)) {
      uVar6 = 0;
    }
    else {
      uVar6 = (uint)(*(ulong *)(in_x9 + uVar7 * 8) >> ((ulong)(iVar2 - 2U) & 0x3f)) & 1;
    }
    uVar1 = 2 - uVar4;
    if (uVar6 != 0) {
      uVar4 = 2;
      uVar3 = uVar3 << (ulong)(uVar1 & 0x1f) | 1;
    }
    if ((3 < unaff_w26) && (0x200000000 < lVar5)) {
      if ((iVar2 < 3) || (uVar7 = (ulong)(iVar2 - 3U >> 6), param_1 <= uVar7)) {
        uVar6 = 0;
      }
      else {
        uVar6 = (uint)(*(ulong *)(in_x9 + uVar7 * 8) >> ((ulong)(iVar2 - 3U) & 0x3f)) & 1;
      }
      uVar1 = uVar4 ^ 3;
      if (uVar6 != 0) {
        uVar4 = 3;
        uVar3 = uVar3 << (ulong)uVar1 | 1;
      }
      if ((4 < unaff_w26) && (0x300000000 < lVar5)) {
        if ((iVar2 < 4) || (uVar7 = (ulong)(iVar2 - 4U >> 6), param_1 <= uVar7)) {
          uVar6 = 0;
        }
        else {
          uVar6 = (uint)(*(ulong *)(in_x9 + uVar7 * 8) >> ((ulong)(iVar2 - 4U) & 0x3f)) & 1;
        }
        uVar1 = 4 - uVar4;
        if (uVar6 != 0) {
          uVar4 = 4;
          uVar3 = uVar3 << (ulong)(uVar1 & 0x1f) | 1;
        }
        unaff_w26 = uStack0000000000000008;
        if ((5 < uStack0000000000000008) && (0x400000000 < lVar5)) {
          if ((iVar2 < 5) || (uVar7 = (ulong)(iVar2 - 5U >> 6), param_1 <= uVar7)) {
            uVar6 = 0;
          }
          else {
            uVar6 = (uint)(*(ulong *)(in_x9 + uVar7 * 8) >> ((ulong)(iVar2 - 5U) & 0x3f)) & 1;
          }
          uVar1 = 5 - uVar4;
          if (uVar6 != 0) {
            uVar4 = 5;
            uVar3 = uVar3 << (ulong)(uVar1 & 0x1f) | 1;
          }
        }
      }
    }
  }
LAB_002a2ea0:
  if (((bStack000000000000000c & -1 < (int)uVar4) != 0) &&
     ((iVar2 = func_0x002a3110(), iVar2 == 0 ||
      ((uVar4 != 0 &&
       ((iVar2 = func_0x002a3110(), iVar2 == 0 ||
        ((uVar4 != 1 &&
         ((iVar2 = func_0x002a3110(), iVar2 == 0 ||
          ((uVar4 != 2 &&
           ((iVar2 = func_0x002a3110(), iVar2 == 0 ||
            ((uVar4 != 3 &&
             ((iVar2 = func_0x002a3110(), iVar2 == 0 ||
              ((unaff_w26 = uStack0000000000000008, uVar4 != 4 &&
               ((iVar2 = func_0x002a3110(), iVar2 == 0 ||
                ((uVar4 != 5 &&
                 ((iVar2 = func_0x002a3110(), iVar2 == 0 ||
                  ((uVar4 != 6 && (iVar2 = func_0x002a3110(), iVar2 == 0))))))))))))))))))))))))))))
     )) goto LAB_002a3048;
  if ((uVar3 & 1) != 0) {
    if (in_stack_00000000._4_4_ <= (int)uVar3) goto LAB_002a3068;
    if ((bStack000000000000000c & 1) == 0) {
      lVar5 = func_0x0029bd80();
      if (lVar5 != 0) goto LAB_002a3024;
LAB_002a3048:
      puVar8 = (undefined8 *)0x0;
    }
    else {
      iVar2 = func_0x002a3110();
      if (iVar2 == 0) goto LAB_002a3048;
LAB_002a3024:
      if (uVar4 != (uint)unaff_x28) {
        uVar4 = (uint)unaff_x28 + ~uVar4;
        unaff_x28 = (ulong)uVar4;
        do {
          if (-1 < (int)uVar4) {
            param_1 = (ulong)(int)unaff_x21[1];
            if ((unaff_x28 >> 6 < param_1) &&
               (in_x9 = *unaff_x21,
               (*(ulong *)(in_x9 + (unaff_x28 >> 6) * 8) >> (unaff_x28 & 0x3f) & 1) != 0))
            goto code_r0x002a2cdc;
          }
          iVar2 = func_0x002a3110();
          if (iVar2 == 0) goto LAB_002a3048;
          if (unaff_x28 == 0) break;
          unaff_x28 = unaff_x28 - 1;
          uVar4 = (uint)unaff_x28;
        } while( true );
      }
      puVar8 = (undefined8 *)func_0x002a3384();
    }
    func_0x002a34e0();
    func_0x0029e4bc();
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return puVar8;
    }
    ___stack_chk_fail();
  }
  func_0x0079dc50();
LAB_002a3068:
  func_0x0079dc78();
  auVar9 = func_0x0079dca0();
  puVar8 = (undefined8 *)func_0x0036e274(0x40);
  if (puVar8 != (undefined8 *)0x0) {
    puVar8[3] = 0;
    puVar8[2] = 0;
    puVar8[5] = 0;
    puVar8[4] = 0;
    puVar8[7] = 0;
    puVar8[6] = 0;
    *puVar8 = 0;
    puVar8[1] = 0;
    puVar8[2] = 0;
    puVar8[3] = 0;
    puVar8[4] = 0;
    puVar8[5] = 0;
    iVar2 = func_0x002aa470(puVar8,auVar9._0_8_);
    if ((iVar2 != 0) && (iVar2 = func_0x002aa810(puVar8,auVar9._8_8_), iVar2 != 0)) {
      return puVar8;
    }
  }
  func_0x002a34e0(puVar8);
  return (undefined8 *)0x0;
code_r0x002a2cdc:
  bStack000000000000000c = 1;
  uVar4 = 0;
  uVar3 = 1;
  if ((unaff_w26 < 2) || (iVar2 = (int)unaff_x28, iVar2 == 0)) goto LAB_002a2ea0;
  if ((0 < iVar2) && (uVar7 = (ulong)(iVar2 - 1U >> 6), uVar7 < param_1)) goto code_r0x002a2d08;
  uVar4 = 0;
  goto LAB_002a2d1c;
code_r0x002a2d08:
  in_x10 = *(ulong *)(in_x9 + uVar7 * 8) >> ((ulong)(iVar2 - 1U) & 0x3f);
  goto code_r0x002a2d10;
}

