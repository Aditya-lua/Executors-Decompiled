
long FUN_0073c738(undefined8 param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined1 (*pauVar3) [16];
  long in_x5;
  long in_x7;
  long in_x11;
  long in_x12;
  long in_x13;
  long in_x14;
  long in_x15;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 auVar4 [16];
  
  *(undefined8 *)(param_2 + 0x10) = param_1;
  *(long *)(param_2 + 0x18) = unaff_x21 + in_x11;
  *(long *)(param_2 + 0x20) = unaff_x20 + in_x15;
  *(long *)(param_2 + 0x28) = unaff_x19 + in_x14;
  *(long *)(param_2 + 0x30) = in_x7 + in_x12;
  *(long *)(param_2 + 0x38) = in_x5 + in_x13;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return param_2;
  }
  auVar4 = ___stack_chk_fail();
  lVar2 = (*pcRam0000000000a2b5e8)(8);
  pauVar3 = (undefined1 (*) [16])(*pcRam0000000000a2b5e8)(0x10);
  if (pauVar3 != (undefined1 (*) [16])0x0 && lVar2 != 0) {
    *pauVar3 = auVar4;
    iVar1 = _pthread_create(lVar2,0,&DAT_0073c838,pauVar3);
    if (iVar1 == 0) {
      return lVar2;
    }
  }
  (*pcRam0000000000a2b5f0)(lVar2);
  (*pcRam0000000000a2b5f0)(pauVar3);
  return 0;
}

