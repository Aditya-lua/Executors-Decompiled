
void FUN_006ed23c(undefined8 param_1)

{
  undefined1 *puVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  int iVar8;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 uVar9;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 *puVar10;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined1 auVar11 [16];
  
  auVar11._8_8_ = unaff_x20;
  auVar11._0_8_ = unaff_x19;
  do {
    *(undefined8 *)register0x00000008 = param_1;
    func_0x006f4ebc(auVar11._0_8_,"%s:%d: %s");
    puVar10 = (undefined8 *)register0x00000008;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return;
    }
    while( true ) {
      puVar1 = (undefined1 *)puVar10;
      uVar9 = auVar11._8_8_;
      uVar2 = auVar11._0_8_;
      auVar11 = ___stack_chk_fail();
      lVar3 = auVar11._8_8_;
      lVar6 = auVar11._0_8_;
      *(undefined8 *)(puVar1 + -0x20) = uVar9;
      *(undefined8 *)(puVar1 + -0x18) = uVar2;
      *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
      *(undefined8 *)(puVar1 + -8) = 0x6ed280;
      func_0x006e188c(lVar6,1);
      register0x00000008 = (BADSPACEBASE *)(puVar1 + -0x150);
      *(undefined8 *)(puVar1 + -0x30) = unaff_x22;
      *(long *)(puVar1 + -0x28) = unaff_x21;
      *(undefined8 *)(puVar1 + -0x20) = *(undefined8 *)(puVar1 + -0x20);
      *(undefined8 *)(puVar1 + -0x18) = *(undefined8 *)(puVar1 + -0x18);
      *(undefined8 *)(puVar1 + -0x10) = *(undefined8 *)(puVar1 + -0x10);
      *(undefined8 *)(puVar1 + -8) = *(undefined8 *)(puVar1 + -8);
      unaff_x29 = puVar1 + -0x10;
      *(undefined8 *)(puVar1 + -0x38) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
      unaff_x21 = *(long *)(lVar6 + 0x20);
      if ((*(int *)((long)*(long **)(unaff_x21 + 8) + 0xc) == 7) &&
         (lVar4 = **(long **)(unaff_x21 + 8), *(char *)(lVar4 + 3) == '\0')) break;
      puVar10 = (undefined8 *)(puVar1 + -0x150);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar1 + -0x38)) {
        *(undefined8 *)(puVar1 + -0x40) = unaff_x24;
        *(undefined8 *)(puVar1 + -0x38) = unaff_x23;
        *(undefined8 *)(puVar1 + -0x30) = *(undefined8 *)(puVar1 + -0x30);
        *(undefined8 *)(puVar1 + -0x28) = *(undefined8 *)(puVar1 + -0x28);
        *(undefined8 *)(puVar1 + -0x20) = *(undefined8 *)(puVar1 + -0x20);
        *(undefined8 *)(puVar1 + -0x18) = *(undefined8 *)(puVar1 + -0x18);
        *(undefined8 *)(puVar1 + -0x10) = *(undefined8 *)(puVar1 + -0x10);
        *(undefined8 *)(puVar1 + -8) = *(undefined8 *)(puVar1 + -8);
        if (lVar3 == 0) {
          lVar3 = *(long *)(lVar6 + 8);
          *(undefined4 *)(lVar3 + 0xc) = 0;
        }
        else {
          uVar2 = _strlen(lVar3);
          if (*(ulong *)(*(long *)(lVar6 + 0x18) + 0x40) <=
              *(ulong *)(*(long *)(lVar6 + 0x18) + 0x48)) {
            func_0x006efe90(lVar6,1);
          }
          if ((*(byte *)(lVar6 + 1) >> 2 & 1) != 0) {
            func_0x006f0ed4(lVar6,lVar6,lVar6 + 0x68);
          }
          puVar10 = *(undefined8 **)(lVar6 + 8);
          uVar2 = func_0x006f6ef8(lVar6,lVar3,uVar2);
          *puVar10 = uVar2;
          *(undefined4 *)((long)puVar10 + 0xc) = 5;
          lVar3 = *(long *)(lVar6 + 8);
        }
        *(long *)(lVar6 + 8) = lVar3 + 0x10;
        return;
      }
    }
    plVar5 = (long *)(*(long *)(lVar4 + 0x18) + 0x58);
    lVar6 = *plVar5 - (long)plVar5;
    param_1 = func_0x006f4f8c(puVar1 + -0x138,0x100,lVar6 + 0x18,*(undefined4 *)(lVar6 + 0x14));
    lVar4 = *(long *)(unaff_x21 + 0x18);
    lVar6 = *(long *)(**(long **)(unaff_x21 + 8) + 0x18);
    iVar8 = 0;
    if (lVar4 != 0) {
      iVar8 = 0;
      if (*(long *)(lVar6 + 0x10) != lVar4) {
        iVar8 = (int)((ulong)(lVar4 - *(long *)(lVar6 + 0x10)) >> 2) + -1;
      }
    }
    lVar4 = *(long *)(lVar6 + 0x38) - (lVar6 + 0x38);
    if (lVar4 == 0) {
      uVar7 = 0;
    }
    else {
      uVar7 = (ulong)(*(int *)((*(ulong *)(lVar6 + 0x40U) ^ lVar6 + 0x40U) +
                              (long)(iVar8 >> (*(uint *)(lVar6 + 0xa0) & 0x1f)) * 4) +
                     (uint)*(byte *)(lVar4 + iVar8));
    }
    *(ulong *)(puVar1 + -0x148) = uVar7;
    *(long *)(puVar1 + -0x140) = lVar3;
  } while( true );
}

