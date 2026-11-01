
void FUN_0059f648(void)

{
  long lVar1;
  long unaff_x19;
  long *plVar2;
  long unaff_x21;
  long lVar3;
  
  while (unaff_x21 = unaff_x21 + -1, unaff_x21 != 0) {
    func_0x0059d298(unaff_x19);
    unaff_x19 = unaff_x19 + 0x108;
  }
  __Unwind_Resume();
  lVar1 = func_0x007a2668();
  plVar2 = *(long **)(lVar1 + 8);
  for (lVar3 = *(long *)(lVar1 + 0x10); lVar3 != 0; lVar3 = lVar3 + -1) {
    if (*plVar2 != 0xc) {
      func_0x0059ce88(plVar2);
    }
    func_0x0059ce88(plVar2 + 8);
    plVar2 = plVar2 + 0x10;
  }
  return;
}

