
long FUN_0009678c(void)

{
  long lVar1;
  long *plVar2;
  long unaff_x19;
  long unaff_x21;
  long lVar3;
  long unaff_x26;
  
  _free();
  lVar1 = _strnlen();
  plVar2 = (long *)_malloc(lVar1 + 0x31);
  if (plVar2 == (long *)0x0) {
    return 0;
  }
  _memcpy(plVar2 + 5);
  *(undefined1 *)((long)(plVar2 + 5) + lVar1) = 0;
  plVar2[1] = unaff_x19;
  plVar2[2] = unaff_x26;
  lVar3 = *(long *)(unaff_x26 + 0x18);
  plVar2[3] = lVar3;
  plVar2[4] = unaff_x21;
  *(long **)(lVar3 + 0x10) = plVar2;
  *(long **)(unaff_x26 + 0x18) = plVar2;
  lVar1 = _realloc();
  if (lVar1 == 0) {
    *(long *)(lVar3 + 0x10) = plVar2[2];
    *(long *)(plVar2[2] + 0x18) = lVar3;
    _free(plVar2);
    return 0;
  }
  *plVar2 = lVar1;
  return lVar1;
}

