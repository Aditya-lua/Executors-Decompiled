/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_180c650c0(undefined8 param_1)

{
  int iVar1;
  longlong lVar2;
  undefined8 uVar3;
  longlong lVar4;
  undefined8 uVar5;
  undefined8 uStackX_20;
  undefined8 uStack_10;
  
  uStack_10 = 0x180c650d5;
  lVar2 = FUN_180e15b20();
  lVar2 = -lVar2;
  if (_DAT_1810bdbe0 < 0) {
    *(undefined8 *)((longlong)&uStackX_20 + lVar2) = 0;
    *(undefined8 *)(&stack0x00000018 + lVar2) = 0;
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65106;
    _DAT_1810bdbe0 = FUN_180c13cc0(10,0,0,0);
    if (_DAT_1810bdbe0 < 0) {
      if (_DAT_1810cfa98 == 0) {
        *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c6511d;
        _DAT_1810cfa98 = FUN_180c153b0();
      }
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65128;
      FUN_180c14970();
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65140;
      FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65153;
      FUN_180c14bc0(_DAT_1810cfa98,0x80026,0);
      uVar5 = 0x1a3;
      goto LAB_180c654bb;
    }
    *(undefined8 *)((longlong)&uStackX_20 + lVar2) = 0;
    *(undefined8 *)(&stack0x00000018 + lVar2) = 0;
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65179;
    _DAT_1810bdbec = FUN_180c13cc0(3,0,0,0);
    *(undefined8 *)((longlong)&uStackX_20 + lVar2) = 0;
    *(undefined8 *)(&stack0x00000018 + lVar2) = 0;
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c6519b;
    _DAT_1810bdbe4 = FUN_180c13cc0(9,0,0,0);
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c651a6;
    uVar5 = func_0x000180cb2a90();
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c651b1;
    uVar3 = func_0x000180be3f80(uVar5);
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c651c0;
    iVar1 = func_0x000180cb4f60(_DAT_1810cfaa0,uVar3);
    if (iVar1 != 0) {
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c651d0;
      uVar3 = func_0x000180be3f90(uVar5);
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c651df;
      iVar1 = func_0x000180cb0b30(_DAT_1810cfaa0,uVar3);
      if (iVar1 != 0) {
        *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c651fa;
        iVar1 = func_0x000180cb0c30(_DAT_1810cfaa0,FUN_180c66430);
        if (iVar1 != 0) {
          *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65215;
          iVar1 = func_0x000180cb0e30(_DAT_1810cfaa0,FUN_180c66150);
          if (iVar1 != 0) {
            *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65225;
            uVar3 = func_0x000180c05350(uVar5);
            *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65234;
            iVar1 = func_0x000180cb0d30(_DAT_1810cfaa0,uVar3);
            if (iVar1 != 0) {
              *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65244;
              uVar5 = func_0x000180c34860(uVar5);
              *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65253;
              iVar1 = func_0x000180c17c70(_DAT_1810cfaa0,uVar5);
              if (iVar1 != 0) {
                *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c6526e;
                iVar1 = func_0x000180c17c40(_DAT_1810cfaa0,FUN_180c660c0);
                if (iVar1 != 0) {
                  *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65289;
                  iVar1 = func_0x000180c5e110(_DAT_1810cfaa0,FUN_180c664a0);
                  if (iVar1 != 0) {
                    *(undefined8 *)((longlong)&uStackX_20 + lVar2) = 0;
                    *(undefined8 *)(&stack0x00000018 + lVar2) = 0;
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c652ad;
                    _DAT_1810bdbe8 = FUN_180c13cc0(7,0,0,0);
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c652b8;
                    uVar5 = func_0x000180cb34c0();
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c652ce;
                    iVar1 = func_0x000180cb4f60(_DAT_1810cfaa8,FUN_180c63a60);
                    if (iVar1 == 0) {
LAB_180c6533a:
                      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65353;
                      FUN_180c631b0(0,0x8000a,&UNK_180f8c6a0,0x1c8);
                      return 0;
                    }
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c652da;
                    uVar3 = func_0x000180c4dab0(uVar5);
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c652e9;
                    iVar1 = func_0x000180cb0c30(_DAT_1810cfaa8,uVar3);
                    if (iVar1 == 0) goto LAB_180c6533a;
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65300;
                    iVar1 = func_0x000180c17c60(_DAT_1810cfaa8,FUN_180c63df0);
                    if (iVar1 == 0) goto LAB_180c6533a;
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c6530c;
                    uVar3 = func_0x000180c05340(uVar5);
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c6531b;
                    iVar1 = func_0x000180cb0e30(_DAT_1810cfaa8,uVar3);
                    if (iVar1 == 0) goto LAB_180c6533a;
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65327;
                    uVar5 = func_0x000180c05350(uVar5);
                    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65336;
                    iVar1 = func_0x000180cb0d30(_DAT_1810cfaa8,uVar5);
                    if (iVar1 == 0) goto LAB_180c6533a;
                    goto LAB_180c653b2;
                  }
                }
              }
            }
          }
        }
      }
    }
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65372;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c6537d;
    FUN_180c14970();
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65395;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c653a8;
    FUN_180c14bc0(_DAT_1810cfa98,0x80004,0);
    uVar5 = 0x1b8;
  }
  else {
LAB_180c653b2:
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c653c9;
    lVar4 = FUN_180c146b0(0x60,&UNK_180f8c6a0,0x660);
    iVar1 = _DAT_1810bdbe0;
    if (lVar4 != 0) {
      *(undefined8 *)(lVar4 + 0x48) = 0x180198230;
      *(undefined4 *)(lVar4 + 0x20) = 1;
      *(undefined4 *)(lVar4 + 0x40) = 3;
      *(undefined4 *)(lVar4 + 0x10) = 1;
      *(undefined4 *)(lVar4 + 0x38) = 0x1c000;
      *(undefined4 *)(lVar4 + 0x3c) = 1;
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65411;
      FUN_180c5e120(param_1,iVar1,lVar4);
      *(undefined4 *)(&stack0x00000018 + lVar2) = 0xf0000000;
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65433;
      iVar1 = CryptAcquireContextW(&stack0x00000040 + lVar2,0,&UNK_180f8c230,0x18);
      if (iVar1 != 0) {
        _DAT_1810cfab0 = 1;
        *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c6544e;
        CryptReleaseContext(*(undefined8 *)(&stack0x00000040 + lVar2),0);
      }
      return 1;
    }
    iVar1 = _DAT_1810cfa98;
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65472;
      iVar1 = FUN_180c153b0();
      _DAT_1810cfa98 = iVar1;
      if (iVar1 == 0) {
        *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c65483;
        _DAT_1810cfa98 = FUN_180c153b0();
      }
    }
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c6548e;
    FUN_180c14970();
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c654a6;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c654b6;
    FUN_180c14bc0(_DAT_1810cfa98,iVar1,0);
    uVar5 = 0x1d0;
  }
LAB_180c654bb:
  *(undefined8 *)((longlong)&uStack_10 + lVar2) = 0x180c654ca;
  FUN_180c14a90(&UNK_180f8c6a0,uVar5,0);
  return 0;
}


