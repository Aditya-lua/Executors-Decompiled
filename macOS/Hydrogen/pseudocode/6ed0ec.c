
void FUN_006ed0ec(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined1 **ppuVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  ulong uVar8;
  int iVar9;
  long lVar10;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 *puVar11;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 **ppuVar12;
  undefined8 uVar13;
  undefined1 auVar14 [16];
  undefined1 *puStack_40;
  undefined8 uStack_38;
  long lStack_30;
  undefined8 uStack_28;
  undefined1 auStack_6 [6];
  
  uVar2 = func_0x006eceb0();
  uStack_28 = func_0x006fe8d4();
  lStack_30 = param_3 + 0x18;
  uVar3 = func_0x006eceb0(uVar2,"attempt to call missing method \'%s\' of %s");
  ppuVar12 = &puStack_40;
  uStack_38 = 0x6ed124;
  uVar13 = 0x6ed138;
  puStack_40 = auStack_6 + -10;
  auVar14 = func_0x006eceb0(uVar3,"attempt to modify a readonly table");
  ppuVar1 = &puStack_40;
  do {
    lVar5 = auVar14._8_8_;
    lVar4 = auVar14._0_8_;
    *(undefined8 *)((long)ppuVar1 + -0x30) = unaff_x22;
    *(long *)((long)ppuVar1 + -0x28) = unaff_x21;
    *(undefined8 *)((long)ppuVar1 + -0x20) = uVar2;
    *(long *)((long)ppuVar1 + -0x18) = param_3;
    *(undefined1 ***)((long)ppuVar1 + -0x10) = ppuVar12;
    *(undefined8 *)((long)ppuVar1 + -8) = uVar13;
    *(undefined8 *)((long)ppuVar1 + -0x38) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    unaff_x21 = *(long *)(lVar4 + 0x20);
    if ((*(int *)((long)*(long **)(unaff_x21 + 8) + 0xc) == 7) &&
       (lVar6 = **(long **)(unaff_x21 + 8), *(char *)(lVar6 + 3) == '\0')) {
      plVar7 = (long *)(*(long *)(lVar6 + 0x18) + 0x58);
      lVar6 = *plVar7 - (long)plVar7;
      uVar2 = func_0x006f4f8c((undefined1 *)((long)ppuVar1 + -0x138),0x100,lVar6 + 0x18,
                              *(undefined4 *)(lVar6 + 0x14));
      lVar10 = *(long *)(unaff_x21 + 0x18);
      lVar6 = *(long *)(**(long **)(unaff_x21 + 8) + 0x18);
      iVar9 = 0;
      if (lVar10 != 0) {
        iVar9 = 0;
        if (*(long *)(lVar6 + 0x10) != lVar10) {
          iVar9 = (int)((ulong)(lVar10 - *(long *)(lVar6 + 0x10)) >> 2) + -1;
        }
      }
      lVar10 = *(long *)(lVar6 + 0x38) - (lVar6 + 0x38);
      if (lVar10 == 0) {
        uVar8 = 0;
      }
      else {
        uVar8 = (ulong)(*(int *)((*(ulong *)(lVar6 + 0x40U) ^ lVar6 + 0x40U) +
                                (long)(iVar9 >> (*(uint *)(lVar6 + 0xa0) & 0x1f)) * 4) +
                       (uint)*(byte *)(lVar10 + iVar9));
      }
      *(ulong *)((long)ppuVar1 + -0x148) = uVar8;
      *(long *)((long)ppuVar1 + -0x140) = lVar5;
      *(undefined8 *)((long)ppuVar1 + -0x150) = uVar2;
      func_0x006f4ebc(lVar4,"%s:%d: %s");
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)ppuVar1 + -0x38)) {
        return;
      }
    }
    else if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)ppuVar1 + -0x38)) {
      *(undefined8 *)((long)ppuVar1 + -0x40) = unaff_x24;
      *(undefined8 *)((long)ppuVar1 + -0x38) = unaff_x23;
      *(undefined8 *)((long)ppuVar1 + -0x30) = *(undefined8 *)((long)ppuVar1 + -0x30);
      *(undefined8 *)((long)ppuVar1 + -0x28) = *(undefined8 *)((long)ppuVar1 + -0x28);
      *(undefined8 *)((long)ppuVar1 + -0x20) = *(undefined8 *)((long)ppuVar1 + -0x20);
      *(undefined8 *)((long)ppuVar1 + -0x18) = *(undefined8 *)((long)ppuVar1 + -0x18);
      *(undefined8 *)((long)ppuVar1 + -0x10) = *(undefined8 *)((long)ppuVar1 + -0x10);
      *(undefined8 *)((long)ppuVar1 + -8) = *(undefined8 *)((long)ppuVar1 + -8);
      if (lVar5 == 0) {
        lVar5 = *(long *)(lVar4 + 8);
        *(undefined4 *)(lVar5 + 0xc) = 0;
      }
      else {
        uVar2 = _strlen(lVar5);
        if (*(ulong *)(*(long *)(lVar4 + 0x18) + 0x40) <= *(ulong *)(*(long *)(lVar4 + 0x18) + 0x48)
           ) {
          func_0x006efe90(lVar4,1);
        }
        if ((*(byte *)(lVar4 + 1) >> 2 & 1) != 0) {
          func_0x006f0ed4(lVar4,lVar4,lVar4 + 0x68);
        }
        puVar11 = *(undefined8 **)(lVar4 + 8);
        uVar2 = func_0x006f6ef8(lVar4,lVar5,uVar2);
        *puVar11 = uVar2;
        *(undefined4 *)((long)puVar11 + 0xc) = 5;
        lVar5 = *(long *)(lVar4 + 8);
      }
      *(long *)(lVar4 + 8) = lVar5 + 0x10;
      return;
    }
    auVar14 = ___stack_chk_fail();
    *(long *)((long)ppuVar1 + -0x170) = lVar5;
    *(long *)((long)ppuVar1 + -0x168) = lVar4;
    *(undefined1 **)((long)ppuVar1 + -0x160) = (undefined1 *)((long)ppuVar1 + -0x10);
    *(undefined8 *)((long)ppuVar1 + -0x158) = 0x6ed280;
    func_0x006e188c(auVar14._0_8_,1);
    ppuVar12 = *(undefined1 ***)((long)ppuVar1 + -0x160);
    uVar13 = *(undefined8 *)((long)ppuVar1 + -0x158);
    uVar2 = *(undefined8 *)((long)ppuVar1 + -0x170);
    param_3 = *(long *)((long)ppuVar1 + -0x168);
    ppuVar1 = (undefined1 **)((long)ppuVar1 + -0x150);
  } while( true );
}

