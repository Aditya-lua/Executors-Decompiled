
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_002804b0(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  int iVar8;
  undefined8 uVar9;
  long lVar10;
  ulong *puVar11;
  ulong *unaff_x19;
  undefined8 unaff_x21;
  long unaff_x29;
  long lStack0000000000000000;
  undefined1 uStack0000000000000008;
  
  *(undefined8 *)(unaff_x29 + -0x38) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  lStack0000000000000000 = unaff_x29 + 0x10;
  uVar9 = _vsnprintf(&uStack0000000000000008,0x100);
  if ((int)(uint)uVar9 < 0) goto LAB_00280588;
  if (0xff < (uint)uVar9) goto LAB_0028051c;
  unaff_x19 = (ulong *)func_0x0027e76c();
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
    do {
      while( true ) {
        ___stack_chk_fail();
LAB_0028051c:
        iVar8 = (int)uVar9 + 1;
        lVar10 = func_0x0036e274(iVar8);
        unaff_x21 = uVar9;
        if (lVar10 == 0) break;
        lStack0000000000000000 = unaff_x29 + 0x10;
        iVar8 = _vsnprintf(lVar10,iVar8);
        if (iVar8 != (int)uVar9) {
          puVar11 = (ulong *)func_0x0079d0bc();
          puVar11[0x1a] = 0;
          puVar11[0x17] = 0;
          puVar11[0x16] = 0;
          puVar11[0x19] = 0;
          puVar11[0x18] = 0;
          puVar11[0x13] = 0;
          puVar11[0x12] = 0;
          puVar11[0x15] = 0;
          puVar11[0x14] = 0;
          puVar11[0xf] = 0;
          puVar11[0xe] = 0;
          puVar11[0x11] = 0;
          puVar11[0x10] = 0;
          puVar11[0xb] = 0;
          puVar11[10] = 0;
          puVar11[0xd] = 0;
          puVar11[0xc] = 0;
          puVar11[7] = 0;
          puVar11[6] = 0;
          puVar11[9] = 0;
          puVar11[8] = 0;
          puVar11[3] = 0;
          puVar11[2] = 0;
          puVar11[5] = 0;
          puVar11[4] = 0;
          puVar11[1] = 0;
          *puVar11 = 0;
          uVar7 = _UNK_0082e8e8;
          uVar6 = _UNK_0082e8e0;
          uVar5 = _UNK_0082e8d0;
          uVar4 = _UNK_0082e8c8;
          uVar3 = _UNK_0082e8c0;
          uVar2 = _UNK_0082e8b8;
          uVar1 = _UNK_0082e8b0;
          puVar11[5] = _UNK_0082e8d8;
          puVar11[4] = uVar5;
          puVar11[7] = uVar7;
          puVar11[6] = uVar6;
          puVar11[1] = uVar2;
          *puVar11 = uVar1;
          puVar11[3] = uVar4;
          puVar11[2] = uVar3;
          *puVar11 = *puVar11 ^ 0x1010020;
          return puVar11;
        }
        unaff_x19 = (ulong *)func_0x0027e76c(unaff_x19,lVar10,uVar9);
        func_0x0036e3d8(lVar10);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
          return unaff_x19;
        }
      }
LAB_00280588:
      uVar9 = unaff_x21;
      unaff_x19 = (ulong *)0xffffffff;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38));
  }
  return unaff_x19;
}

