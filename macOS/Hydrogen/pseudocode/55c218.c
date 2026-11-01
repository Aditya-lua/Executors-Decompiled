
void FUN_0055c218(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long lVar2;
  long *unaff_x21;
  long *unaff_x22;
  long *plVar3;
  int unaff_w23;
  int iVar4;
  undefined1 uStack0000000000000008;
  long lStack0000000000000010;
  long lStack0000000000000018;
  
  _uStack0000000000000008 = 4;
  lVar2 = 1;
  lStack0000000000000010 = param_1;
  do {
    iVar4 = unaff_w23 + -1;
    plVar3 = unaff_x22;
    do {
      if (plVar3 == unaff_x21) {
        unaff_x19[1] = lStack0000000000000010;
        *unaff_x19 = _uStack0000000000000008;
        unaff_x19[2] = lVar2;
        return;
      }
      unaff_x22 = plVar3 + 6;
      lVar1 = *plVar3;
      unaff_w23 = unaff_w23 + 1;
      iVar4 = iVar4 + 1;
      plVar3 = unaff_x22;
    } while (lVar1 == -0x8000000000000000);
    if (lVar2 == _uStack0000000000000008) {
      lStack0000000000000018 = lVar2;
      func_0x007abb04(&uStack0000000000000008,lVar2,1,4,4);
      param_1 = lStack0000000000000010;
    }
    *(int *)(param_1 + lVar2 * 4) = iVar4;
    lVar2 = lVar2 + 1;
  } while( true );
}

