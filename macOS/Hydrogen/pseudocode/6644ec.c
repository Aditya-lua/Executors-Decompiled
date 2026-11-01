
void FUN_006644ec(ulong param_1)

{
  uint uVar1;
  undefined1 *puVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  long *plVar6;
  long *in_x3;
  undefined1 uVar7;
  long *unaff_x19;
  long *plVar8;
  long *plVar9;
  long *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long *plVar10;
  undefined1 *unaff_x29;
  undefined1 auVar11 [16];
  
  do {
    plVar6 = (long *)(param_1 + 7 >> 3);
    func_0x00676cb8(unaff_x21,unaff_x19);
    puVar2 = (undefined1 *)register0x00000008;
    plVar8 = unaff_x19;
    plVar9 = unaff_x20;
    plVar10 = unaff_x22;
    while( true ) {
      while( true ) {
        unaff_x22 = plVar6;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
          return;
        }
        ___stack_chk_fail();
        auVar11 = __Unwind_Resume();
        unaff_x19 = auVar11._8_8_;
        lVar5 = auVar11._0_8_;
        unaff_x20 = (long *)(lVar5 + -8);
        register0x00000008 = (BADSPACEBASE *)(puVar2 + -0x70);
        *(long **)(puVar2 + -0x30) = plVar10;
        *(long **)(puVar2 + -0x28) = unaff_x21;
        *(long **)(puVar2 + -0x20) = plVar9;
        *(long **)(puVar2 + -0x18) = plVar8;
        *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
        *(undefined8 *)(puVar2 + -8) = 0x664534;
        unaff_x29 = puVar2 + -0x10;
        *(undefined8 *)(puVar2 + -0x38) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
        plVar8 = unaff_x19;
        unaff_x21 = in_x3;
        if ((char)unaff_x22[9] == '\0') break;
        func_0x005edf2c(puVar2 + -0x60,0);
        *(undefined4 *)(puVar2 + -0x48) = 0xffffffff;
        puVar2[-0x44] = 0;
        *(undefined **)(puVar2 + -0x60) = &UNK_00a0e938;
        *(undefined **)(puVar2 + -0x58) = &UNK_00a0ead0;
        *(undefined8 *)(puVar2 + -0x40) = 0xffffffffffffffff;
        uVar3 = (**(code **)(*unaff_x20 + 0x78))(unaff_x20,in_x3);
        *(ulong *)(puVar2 + -0x68) = uVar3 & 0xffffffff;
        in_x3 = (long *)&UNK_008ba5c8;
        plVar6 = (long *)(puVar2 + -0x68);
        (**(code **)(*(long *)(puVar2 + -0x60) + 0x118))
                  (puVar2 + -0x60,unaff_x19,plVar6,&UNK_008ba5c8,1);
        puVar2 = puVar2 + -0x70;
        plVar9 = unaff_x20;
      }
      if ((int)in_x3 != 0) break;
      uVar1 = *(uint *)(*(long *)(lVar5 + 8) + 0x90);
      puVar2[-0x60] = 4;
      in_x3 = (long *)0x0;
      (**(code **)(*unaff_x19 + 0x38))(unaff_x19,puVar2 + -0x60,1,0,1);
      plVar9 = (long *)((ulong)uVar1 + 7 >> 3);
      func_0x00676cb8(unaff_x22 + 1,unaff_x19,plVar9);
      plVar6 = plVar9;
      func_0x00676cb8(unaff_x22 + 5,unaff_x19);
      puVar2 = puVar2 + -0x70;
      plVar10 = unaff_x22;
    }
    unaff_x21 = unaff_x22 + 1;
    uVar3 = func_0x006787a4(unaff_x21);
    if ((uVar3 & 1) == 0) {
      lVar4 = (**(code **)(**(long **)(lVar5 + 8) + 0x98))
                        (*(long **)(lVar5 + 8),unaff_x22 + 5,unaff_x21);
      uVar7 = 2;
      if ((*(long *)(lVar4 + 0x10) != 0) && (uVar7 = 2, (**(ulong **)(lVar4 + 0x18) & 1) != 0)) {
        uVar7 = 3;
      }
    }
    else {
      uVar7 = 2;
    }
    puVar2[-0x60] = uVar7;
    in_x3 = (long *)0x0;
    (**(code **)(*unaff_x19 + 0x38))(unaff_x19,puVar2 + -0x60,1,0,1);
    param_1 = (ulong)*(uint *)(*(long *)(lVar5 + 8) + 0x90);
  } while( true );
}

