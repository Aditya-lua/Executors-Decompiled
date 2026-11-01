
void FUN_006ed044(char *param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  undefined1 ***pppuVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  int iVar10;
  char *in_x9;
  long lVar11;
  int unaff_w19;
  undefined8 unaff_x22;
  undefined8 *puVar12;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 ***pppuVar13;
  undefined *puVar14;
  undefined1 auVar15 [16];
  char *pcStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 **ppuStack_80;
  undefined *puStack_78;
  long *plStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined1 *puStack_50;
  undefined *puStack_48;
  undefined8 uStack_40;
  long lStack_38;
  undefined1 auStack_6 [6];
  
  if (unaff_w19 != 0x11) {
    in_x9 = param_1;
  }
  pcStack0000000000000008 = "<";
  if (unaff_w19 != 0x10) {
    pcStack0000000000000008 = in_x9;
  }
  uStack0000000000000010 = param_2;
  uVar2 = func_0x006eceb0();
  plVar8 = param_4;
  uVar3 = func_0x006fe8d4();
  lStack_38 = func_0x006fe8d4(uVar2,param_4);
  if (((*(int *)((long)param_4 + 0xc) == 5) && (lVar6 = *param_4, lVar6 != 0)) &&
     (*(uint *)(lVar6 + 0x14) < 0x41)) {
    lStack_38 = lVar6 + 0x18;
    uStack_40 = uVar3;
    lStack_38 = func_0x006eceb0(uVar2,"attempt to index %s with \'%s\'");
  }
  uStack_40 = uVar3;
  uVar4 = func_0x006eceb0(uVar2,"attempt to index %s with %s");
  puStack_48 = &DAT_006ed0f0;
  uStack_60 = uVar3;
  uStack_58 = uVar2;
  puStack_50 = auStack_6 + -10;
  uStack_68 = func_0x006fe8d4();
  plStack_70 = plVar8 + 3;
  uVar2 = func_0x006eceb0(uVar4,"attempt to call missing method \'%s\' of %s");
  pppuVar13 = &ppuStack_80;
  puStack_78 = &SUB_006ed124;
  puVar14 = &DAT_006ed138;
  ppuStack_80 = &puStack_50;
  auVar15 = func_0x006eceb0(uVar2,"attempt to modify a readonly table");
  pppuVar1 = &ppuStack_80;
  do {
    lVar5 = auVar15._8_8_;
    lVar6 = auVar15._0_8_;
    *(undefined8 *)((long)pppuVar1 + -0x30) = unaff_x22;
    *(long **)((long)pppuVar1 + -0x28) = param_4;
    *(undefined8 *)((long)pppuVar1 + -0x20) = uVar4;
    *(long **)((long)pppuVar1 + -0x18) = plVar8;
    *(undefined1 ****)((long)pppuVar1 + -0x10) = pppuVar13;
    *(undefined **)((long)pppuVar1 + -8) = puVar14;
    *(undefined8 *)((long)pppuVar1 + -0x38) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    param_4 = *(long **)(lVar6 + 0x20);
    if ((*(int *)(param_4[1] + 0xc) == 7) &&
       (lVar7 = *(long *)param_4[1], *(char *)(lVar7 + 3) == '\0')) {
      plVar8 = (long *)(*(long *)(lVar7 + 0x18) + 0x58);
      lVar7 = *plVar8 - (long)plVar8;
      uVar2 = func_0x006f4f8c((undefined1 *)((long)pppuVar1 + -0x138),0x100,lVar7 + 0x18,
                              *(undefined4 *)(lVar7 + 0x14));
      lVar11 = param_4[3];
      lVar7 = *(long *)(*(long *)param_4[1] + 0x18);
      iVar10 = 0;
      if (lVar11 != 0) {
        iVar10 = 0;
        if (*(long *)(lVar7 + 0x10) != lVar11) {
          iVar10 = (int)((ulong)(lVar11 - *(long *)(lVar7 + 0x10)) >> 2) + -1;
        }
      }
      lVar11 = *(long *)(lVar7 + 0x38) - (lVar7 + 0x38);
      if (lVar11 == 0) {
        uVar9 = 0;
      }
      else {
        uVar9 = (ulong)(*(int *)((*(ulong *)(lVar7 + 0x40U) ^ lVar7 + 0x40U) +
                                (long)(iVar10 >> (*(uint *)(lVar7 + 0xa0) & 0x1f)) * 4) +
                       (uint)*(byte *)(lVar11 + iVar10));
      }
      *(ulong *)((long)pppuVar1 + -0x148) = uVar9;
      *(long *)((long)pppuVar1 + -0x140) = lVar5;
      *(undefined8 *)((long)pppuVar1 + -0x150) = uVar2;
      func_0x006f4ebc(lVar6,"%s:%d: %s");
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)pppuVar1 + -0x38)) {
        return;
      }
    }
    else if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)pppuVar1 + -0x38)) {
      *(undefined8 *)((long)pppuVar1 + -0x40) = unaff_x24;
      *(undefined8 *)((long)pppuVar1 + -0x38) = unaff_x23;
      *(undefined8 *)((long)pppuVar1 + -0x30) = *(undefined8 *)((long)pppuVar1 + -0x30);
      *(undefined8 *)((long)pppuVar1 + -0x28) = *(undefined8 *)((long)pppuVar1 + -0x28);
      *(undefined8 *)((long)pppuVar1 + -0x20) = *(undefined8 *)((long)pppuVar1 + -0x20);
      *(undefined8 *)((long)pppuVar1 + -0x18) = *(undefined8 *)((long)pppuVar1 + -0x18);
      *(undefined8 *)((long)pppuVar1 + -0x10) = *(undefined8 *)((long)pppuVar1 + -0x10);
      *(undefined8 *)((long)pppuVar1 + -8) = *(undefined8 *)((long)pppuVar1 + -8);
      if (lVar5 == 0) {
        lVar5 = *(long *)(lVar6 + 8);
        *(undefined4 *)(lVar5 + 0xc) = 0;
      }
      else {
        uVar2 = _strlen(lVar5);
        if (*(ulong *)(*(long *)(lVar6 + 0x18) + 0x40) <= *(ulong *)(*(long *)(lVar6 + 0x18) + 0x48)
           ) {
          func_0x006efe90(lVar6,1);
        }
        if ((*(byte *)(lVar6 + 1) >> 2 & 1) != 0) {
          func_0x006f0ed4(lVar6,lVar6,lVar6 + 0x68);
        }
        puVar12 = *(undefined8 **)(lVar6 + 8);
        uVar2 = func_0x006f6ef8(lVar6,lVar5,uVar2);
        *puVar12 = uVar2;
        *(undefined4 *)((long)puVar12 + 0xc) = 5;
        lVar5 = *(long *)(lVar6 + 8);
      }
      *(long *)(lVar6 + 8) = lVar5 + 0x10;
      return;
    }
    auVar15 = ___stack_chk_fail();
    *(long *)((long)pppuVar1 + -0x170) = lVar5;
    *(long *)((long)pppuVar1 + -0x168) = lVar6;
    *(undefined1 **)((long)pppuVar1 + -0x160) = (undefined1 *)((long)pppuVar1 + -0x10);
    *(undefined **)((long)pppuVar1 + -0x158) = &DAT_006ed280;
    func_0x006e188c(auVar15._0_8_,1);
    pppuVar13 = *(undefined1 ****)((long)pppuVar1 + -0x160);
    puVar14 = *(undefined **)((long)pppuVar1 + -0x158);
    uVar4 = *(undefined8 *)((long)pppuVar1 + -0x170);
    plVar8 = *(long **)((long)pppuVar1 + -0x168);
    pppuVar1 = (undefined1 ***)((long)pppuVar1 + -0x150);
  } while( true );
}

