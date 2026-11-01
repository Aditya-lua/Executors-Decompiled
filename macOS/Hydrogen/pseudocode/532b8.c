
void FUN_000532b8(void)

{
  int iVar1;
  long *plVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  undefined8 unaff_x19;
  undefined1 auVar6 [16];
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
    unaff_x19 = __Unwind_Resume();
    __ZNSt3__16localeD1Ev(&uStack0000000000000020);
  }
  auVar6 = __Unwind_Resume(unaff_x19);
  plVar4 = auVar6._8_8_;
  plVar2 = auVar6._0_8_;
  if (plVar4 != (long *)0x0) {
    uVar3 = (**(code **)(*plVar4 + 0x40))(plVar4);
    _printf("\n\n\n\ngetting bytecode of %s\n\n\n\n");
    iVar1 = _strcmp(uVar3,"ModuleScript");
    if (iVar1 == 0) {
      iVar1 = func_0x0005373c(plVar4 + 0x20);
      if (iVar1 != 2) {
        return;
      }
      plVar4 = plVar4 + 0x27;
      lVar5 = *plVar4;
      *plVar2 = lVar5;
    }
    else {
      iVar1 = _strcmp(uVar3,"Script");
      if ((iVar1 != 0) && (iVar1 = _strcmp(uVar3,"LocalScript"), iVar1 != 0)) {
        return;
      }
      iVar1 = func_0x0005373c(plVar4 + 0x20);
      lVar5 = 400;
      if (iVar1 != 2) {
        lVar5 = 0xd0;
      }
      plVar4 = (long *)(lVar5 + (long)plVar4);
      lVar5 = *plVar4;
      *plVar2 = lVar5;
    }
    if (lVar5 != 0) {
      *(int *)(lVar5 + 0x28) = *(int *)(lVar5 + 0x28) + 1;
    }
    lVar5 = plVar4[1];
    plVar2[1] = lVar5;
    if (lVar5 != 0) {
      *(int *)(lVar5 + 0x28) = *(int *)(lVar5 + 0x28) + 1;
    }
    plVar2[2] = plVar4[2];
    *(undefined1 *)(plVar2 + 3) = 1;
  }
  return;
}

