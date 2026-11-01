
void FUN_00053330(void)

{
  long *plVar1;
  int iVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  
  iVar2 = _strcmp();
  if (iVar2 == 0) {
    iVar2 = func_0x0005373c(unaff_x20 + 0x100);
    if (iVar2 != 2) {
      return;
    }
    plVar1 = (long *)(unaff_x20 + 0x138);
    lVar3 = *plVar1;
    *unaff_x19 = lVar3;
  }
  else {
    iVar2 = _strcmp();
    if ((iVar2 != 0) && (iVar2 = _strcmp(), iVar2 != 0)) {
      return;
    }
    iVar2 = func_0x0005373c(unaff_x20 + 0x100);
    lVar3 = 400;
    if (iVar2 != 2) {
      lVar3 = 0xd0;
    }
    plVar1 = (long *)(lVar3 + unaff_x20);
    lVar3 = *plVar1;
    *unaff_x19 = lVar3;
  }
  if (lVar3 != 0) {
    *(int *)(lVar3 + 0x28) = *(int *)(lVar3 + 0x28) + 1;
  }
  lVar3 = plVar1[1];
  unaff_x19[1] = lVar3;
  if (lVar3 != 0) {
    *(int *)(lVar3 + 0x28) = *(int *)(lVar3 + 0x28) + 1;
  }
  unaff_x19[2] = plVar1[2];
  *(undefined1 *)(unaff_x19 + 3) = 1;
  return;
}

