
void FUN_0073dc28(void)

{
  long *plVar1;
  long *unaff_x20;
  long unaff_x21;
  long lVar2;
  
  *(byte *)(unaff_x21 + 0x28) = *(byte *)(unaff_x21 + 0x28) | 2;
  plVar1 = (long *)*(long *)(unaff_x21 + 0x20);
  while (plVar1 != (long *)0x0) {
    lVar2 = *plVar1;
    func_0x00740678(plVar1 + 1);
    (*pcRam0000000000a2b5f0)(plVar1);
    *unaff_x20 = lVar2;
    plVar1 = (long *)lVar2;
  }
  return;
}

