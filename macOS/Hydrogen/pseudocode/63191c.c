
long * FUN_0063191c(void)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000080;
  
  uVar1 = __Unwind_Resume();
  func_0x00087574(&uStack0000000000000050);
  func_0x00087574(&uStack0000000000000080);
  plVar2 = (long *)__Unwind_Resume(uVar1);
  lVar5 = *plVar2;
  if (lVar5 != 0) {
    lVar3 = plVar2[1];
    lVar4 = lVar5;
    if (lVar3 != lVar5) {
      do {
        lVar3 = func_0x00650db0(lVar3 + -0x80);
      } while (lVar3 != lVar5);
      lVar4 = *plVar2;
    }
    plVar2[1] = lVar5;
    __ZdlPv(lVar4);
  }
  return plVar2;
}

