
void FUN_0074deb4(long param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  code *unaff_x20;
  ulong unaff_x25;
  
  while( true ) {
    lVar2 = func_0x00740a58(param_1 + unaff_x25 * 0x20);
    if (lVar2 != 0) {
      do {
        func_0x00156654(lVar2);
        lVar3 = func_0x006f4058(lVar2);
        iVar1 = (*unaff_x20)();
        if (iVar1 != 0) {
          func_0x0075e574(lVar2);
          unaff_x19[5] = unaff_x19[5] + -1;
        }
        lVar2 = lVar3;
      } while (lVar3 != 0);
    }
    unaff_x25 = unaff_x25 + 1;
    if ((ulong)unaff_x19[4] <= unaff_x25) break;
    param_1 = *unaff_x19;
  }
  return;
}

