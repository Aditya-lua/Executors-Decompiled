
void FUN_006ed358(long param_1)

{
  int iVar1;
  long lVar2;
  ulong unaff_x19;
  long unaff_x21;
  code *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  
  if (unaff_x26 == param_1) {
    lVar2 = func_0x006f3708();
    *(long *)(unaff_x21 + 0x68) = unaff_x26 - lVar2;
    if (0 < *(int *)(unaff_x21 + 0x88)) {
      lVar2 = 0;
      do {
        *(char *)((unaff_x26 - *(long *)(unaff_x21 + 0x68)) + lVar2) =
             (char)*(undefined4 *)(*(long *)(unaff_x21 + 0x10) + lVar2 * 4);
        lVar2 = lVar2 + 1;
      } while (lVar2 < *(int *)(unaff_x21 + 0x88));
    }
  }
  if ((unaff_x19 & 1) == 0) {
    *(undefined1 *)(*(long *)(unaff_x21 + 0x10) + unaff_x25) =
         *(undefined1 *)((unaff_x26 - *(long *)(unaff_x21 + 0x68)) + unaff_x24);
    iVar1 = *(int *)(unaff_x21 + 0x8c);
  }
  else {
    *(undefined1 *)(*(long *)(unaff_x21 + 0x10) + unaff_x25) = 1;
    if ((unaff_x23 == (code *)0x0) || (*(long *)(unaff_x21 + 0x28) == 0)) {
      iVar1 = *(int *)(unaff_x21 + 0x8c);
    }
    else {
      (*unaff_x23)();
      iVar1 = *(int *)(unaff_x21 + 0x8c);
    }
  }
  if (0 < iVar1) {
    lVar2 = 0;
    do {
      func_0x006ed2b0();
      lVar2 = lVar2 + 1;
    } while (lVar2 < *(int *)(unaff_x21 + 0x8c));
  }
  return;
}

