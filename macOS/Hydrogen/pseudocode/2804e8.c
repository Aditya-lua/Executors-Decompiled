
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_002804e8(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  bool in_ZR;
  bool in_CY;
  int iVar8;
  long lVar9;
  ulong *puVar10;
  ulong *unaff_x19;
  int unaff_w21;
  long unaff_x29;
  
  if (in_CY && !in_ZR) goto LAB_0028051c;
  unaff_x19 = (ulong *)func_0x0027e76c();
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
    do {
      while( true ) {
        ___stack_chk_fail();
LAB_0028051c:
        lVar9 = func_0x0036e274(unaff_w21 + 1);
        if (lVar9 == 0) break;
        iVar8 = _vsnprintf(lVar9,unaff_w21 + 1);
        if (iVar8 != unaff_w21) {
          puVar10 = (ulong *)func_0x0079d0bc();
          puVar10[0x1a] = 0;
          puVar10[0x17] = 0;
          puVar10[0x16] = 0;
          puVar10[0x19] = 0;
          puVar10[0x18] = 0;
          puVar10[0x13] = 0;
          puVar10[0x12] = 0;
          puVar10[0x15] = 0;
          puVar10[0x14] = 0;
          puVar10[0xf] = 0;
          puVar10[0xe] = 0;
          puVar10[0x11] = 0;
          puVar10[0x10] = 0;
          puVar10[0xb] = 0;
          puVar10[10] = 0;
          puVar10[0xd] = 0;
          puVar10[0xc] = 0;
          puVar10[7] = 0;
          puVar10[6] = 0;
          puVar10[9] = 0;
          puVar10[8] = 0;
          puVar10[3] = 0;
          puVar10[2] = 0;
          puVar10[5] = 0;
          puVar10[4] = 0;
          puVar10[1] = 0;
          *puVar10 = 0;
          uVar7 = _UNK_0082e8e8;
          uVar6 = _UNK_0082e8e0;
          uVar5 = _UNK_0082e8d0;
          uVar4 = _UNK_0082e8c8;
          uVar3 = _UNK_0082e8c0;
          uVar2 = _UNK_0082e8b8;
          uVar1 = _UNK_0082e8b0;
          puVar10[5] = _UNK_0082e8d8;
          puVar10[4] = uVar5;
          puVar10[7] = uVar7;
          puVar10[6] = uVar6;
          puVar10[1] = uVar2;
          *puVar10 = uVar1;
          puVar10[3] = uVar4;
          puVar10[2] = uVar3;
          *puVar10 = *puVar10 ^ 0x1010020;
          return puVar10;
        }
        unaff_x19 = (ulong *)func_0x0027e76c(unaff_x19,lVar9);
        func_0x0036e3d8(lVar9);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
          return unaff_x19;
        }
      }
      unaff_x19 = (ulong *)0xffffffff;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38));
  }
  return unaff_x19;
}

