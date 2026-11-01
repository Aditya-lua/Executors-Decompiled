
undefined8 FUN_0066c0d8(code *param_1)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long *unaff_x19;
  int unaff_w20;
  long unaff_x21;
  long lVar5;
  long in_stack_00000018;
  
  (*param_1)();
  *(undefined1 *)(unaff_x19 + 9) = 0;
  lVar5 = unaff_x19[6];
  lVar4 = unaff_x19[0xc];
  lVar2 = unaff_x19[0xd];
  if (lVar4 != lVar5) {
    if (lVar2 != 0) {
      if (lVar4 != 0) {
        do {
          *(undefined1 *)(lVar2 + -1 + lVar4) = 0;
          lVar4 = lVar4 + -1;
        } while (lVar4 != 0);
      }
      func_0x00611644();
    }
    if (lVar5 == 0) {
      lVar2 = 0;
    }
    else {
      lVar2 = func_0x006115d0(lVar5);
    }
  }
  unaff_x19[0xb] = -1;
  unaff_x19[0xc] = lVar5;
  unaff_x19[0xd] = lVar2;
  unaff_x19[0xe] = 1;
  unaff_x19[0xf] = lVar5;
  unaff_x19[0x10] = 0;
  unaff_x19[0x11] = lVar2;
  plVar3 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  iVar1 = 0;
  if (unaff_w20 != 0) {
    iVar1 = unaff_w20 + -1;
  }
  lVar4 = (**(code **)(*plVar3 + 0x130))(plVar3,&UNK_008ba5c8,0,0,iVar1,1);
  *(uint *)(unaff_x19 + 5) = (uint)(lVar4 != 0);
  if (in_stack_00000018 != 0) {
    if (unaff_x21 != 0) {
      do {
        *(undefined1 *)(in_stack_00000018 + -1 + unaff_x21) = 0;
        unaff_x21 = unaff_x21 + -1;
      } while (unaff_x21 != 0);
    }
    func_0x00611644();
  }
  return 0;
}

