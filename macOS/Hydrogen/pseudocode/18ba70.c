
void FUN_0018ba70(void)

{
  undefined1 *puVar1;
  long lVar2;
  long unaff_x19;
  long lVar3;
  long *plVar4;
  long unaff_x21;
  
  while (unaff_x21 = unaff_x21 + -1, unaff_x21 != 0) {
    func_0x0019fb28(unaff_x19);
    unaff_x19 = unaff_x19 + 8;
  }
  __Unwind_Resume();
  lVar2 = func_0x007a2668();
  lVar3 = *(long *)(lVar2 + 0x10);
  if (lVar3 != 0) {
    plVar4 = (long *)(*(long *)(lVar2 + 8) + 8);
    do {
      puVar1 = (undefined1 *)plVar4[-1];
      lVar2 = *plVar4;
      *puVar1 = 0;
      if (lVar2 != 0) {
        func_0x00187bd4(puVar1,lVar2,1);
      }
      plVar4 = plVar4 + 2;
      lVar3 = lVar3 + -1;
    } while (lVar3 != 0);
  }
  return;
}

