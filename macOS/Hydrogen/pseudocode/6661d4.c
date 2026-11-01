
void FUN_006661d4(code *param_1,undefined8 param_2,undefined1 *param_3)

{
  undefined1 *puVar1;
  int iVar2;
  ulong uVar3;
  long *plVar4;
  undefined *puVar5;
  undefined1 uVar6;
  long *unaff_x19;
  long *plVar7;
  long *unaff_x20;
  long *unaff_x21;
  long *plVar8;
  long *unaff_x22;
  long *plVar9;
  undefined *unaff_x23;
  undefined *puVar10;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined1 auVar11 [16];
  
  do {
    (*param_1)(unaff_x19,param_3,1,0,1);
    uVar3 = func_0x0060bcf4(unaff_x21[2]);
    plVar4 = (long *)(uVar3 & 0xffffffff);
    puVar5 = (undefined *)0x0;
    func_0x00602604(unaff_x20,unaff_x19);
    puVar1 = (undefined1 *)register0x00000008;
    plVar7 = unaff_x19;
    plVar8 = unaff_x21;
    plVar9 = unaff_x22;
    puVar10 = unaff_x23;
    while( true ) {
      while( true ) {
        unaff_x23 = puVar5;
        unaff_x22 = plVar4;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar1 + 0x38)) {
          return;
        }
        ___stack_chk_fail();
        auVar11 = __Unwind_Resume();
        unaff_x19 = auVar11._8_8_;
        unaff_x21 = (long *)(auVar11._0_8_ + -8);
        register0x00000008 = (BADSPACEBASE *)(puVar1 + -0x80);
        *(undefined8 *)(puVar1 + -0x40) = unaff_x24;
        *(undefined **)(puVar1 + -0x38) = puVar10;
        *(long **)(puVar1 + -0x30) = plVar9;
        *(long **)(puVar1 + -0x28) = plVar8;
        *(long **)(puVar1 + -0x20) = unaff_x20;
        *(long **)(puVar1 + -0x18) = plVar7;
        *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
        *(undefined8 *)(puVar1 + -8) = 0x6662a0;
        unaff_x29 = puVar1 + -0x10;
        *(undefined8 *)(puVar1 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
        plVar7 = unaff_x19;
        puVar10 = unaff_x23;
        if ((char)unaff_x22[0xd] == '\0') break;
        func_0x005edf2c(puVar1 + -0x70,0);
        *(undefined4 *)(puVar1 + -0x58) = 0xffffffff;
        puVar1[-0x54] = 0;
        *(undefined **)(puVar1 + -0x70) = &UNK_00a0e938;
        *(undefined **)(puVar1 + -0x68) = &UNK_00a0ead0;
        *(undefined8 *)(puVar1 + -0x50) = 0xffffffffffffffff;
        uVar3 = (**(code **)(*unaff_x21 + 0x78))(unaff_x21,unaff_x23);
        *(ulong *)(puVar1 + -0x78) = uVar3 & 0xffffffff;
        puVar5 = &UNK_008ba5c8;
        plVar4 = (long *)(puVar1 + -0x78);
        (**(code **)(*(long *)(puVar1 + -0x70) + 0x118))
                  (puVar1 + -0x70,unaff_x19,plVar4,&UNK_008ba5c8,1);
        puVar1 = puVar1 + -0x80;
        plVar8 = unaff_x21;
      }
      unaff_x20 = unaff_x22 + 1;
      if ((int)unaff_x23 != 0) break;
      uVar3 = func_0x0060bcf4(*(undefined8 *)(auVar11._0_8_ + 8));
      puVar1[-0x70] = 4;
      (**(code **)(*unaff_x19 + 0x38))(unaff_x19,puVar1 + -0x70,1,0,1);
      plVar8 = (long *)(uVar3 & 0xffffffff);
      func_0x00602604(unaff_x20,unaff_x19,plVar8,0);
      puVar5 = (undefined *)0x0;
      plVar4 = plVar8;
      func_0x00602604(unaff_x22 + 7,unaff_x19);
      puVar1 = puVar1 + -0x80;
      plVar9 = unaff_x22;
    }
    iVar2 = func_0x005ffe3c(unaff_x22 + 7,0);
    uVar6 = 2;
    if (iVar2 != 0) {
      uVar6 = 3;
    }
    puVar1[-0x70] = uVar6;
    param_1 = *(code **)(*unaff_x19 + 0x38);
    param_3 = puVar1 + -0x70;
  } while( true );
}

