
long FUN_005f1270(code *param_1)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  uint *unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  uint unaff_w24;
  
  while( true ) {
    lVar3 = (*param_1)();
    if (lVar3 != 0) {
      return 1;
    }
    (**(code **)(*unaff_x23 + 0xe8))();
    uVar1 = *unaff_x21;
    *unaff_x21 = uVar1 + 1;
    if ((unaff_w24 <= uVar1 + 1) || (iVar2 = (**(code **)(*unaff_x23 + 0xe0))(), iVar2 == 0)) break;
    while( true ) {
      iVar2 = (**(code **)(*unaff_x23 + 0xa0))();
      if (iVar2 == 0) break;
      (**(code **)(*unaff_x23 + 0x98))();
      lVar3 = (**(code **)(*unaff_x23 + 0x118))();
      if (lVar3 != 0) {
        return lVar3;
      }
    }
    (**(code **)(*unaff_x23 + 0x90))();
    param_1 = *(code **)(*unaff_x22 + 0x130);
  }
  return 0;
}

