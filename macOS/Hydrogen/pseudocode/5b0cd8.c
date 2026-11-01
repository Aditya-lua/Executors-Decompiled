
undefined * FUN_005b0cd8(void)

{
  long *plVar1;
  long *plVar2;
  undefined *puVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long *plStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  long lStack_50;
  
  __Unwind_Resume();
  plVar2 = (long *)func_0x007a2668();
  lVar4 = *plVar2;
  if (lVar4 < 6) {
    if (lVar4 < 3) {
      if (lVar4 == 0) {
        plStack_80 = (long *)plVar2[1];
        lVar4 = *plStack_80;
        *plStack_80 = lVar4 + -1;
        LORelease();
        if (lVar4 == 1) {
          func_0x005d2ac4(&plStack_80);
        }
        puVar3 = &UNK_008af89d;
      }
      else if (lVar4 == 1) {
        if (plVar2[1] == 0) {
          puVar3 = &UNK_008af8c5;
        }
        else {
          func_0x00187bd4(plVar2[2],plVar2[1],1);
          puVar3 = &UNK_008af8c5;
        }
      }
      else {
        func_0x005ae1bc(plVar2 + 1);
        puVar3 = &UNK_008af133;
      }
    }
    else if (lVar4 == 3) {
      func_0x005ae828(plVar2 + 1);
      puVar3 = &UNK_008af15a;
    }
    else if (lVar4 == 4) {
      puVar3 = (undefined *)0x0;
    }
    else {
      lVar4 = plVar2[1];
      plVar1 = (long *)plVar2[2];
      lVar6 = plVar2[3];
      plVar2 = plVar1;
      for (; lVar6 != 0; lVar6 = lVar6 + -1) {
        if (*plVar2 != 0xc) {
          func_0x0059ce88(plVar2);
        }
        func_0x0059ce88(plVar2 + 8);
        plVar2 = plVar2 + 0x10;
      }
      if (lVar4 != 0) {
        func_0x00187bd4(plVar1,lVar4 << 7,8);
      }
      puVar3 = &UNK_008af8ee;
    }
  }
  else if (lVar4 < 9) {
    if (lVar4 == 6) {
      lVar4 = plVar2[1];
      if ((4 < lVar4 + 0x8000000000000000U || lVar4 + 0x8000000000000000U == 3) && lVar4 != 0) {
        func_0x00187bd4(plVar2[2],lVar4,1);
      }
      puVar3 = &UNK_008af916;
    }
    else if (lVar4 == 7) {
      lStack_78 = plVar2[2];
      plStack_80 = (long *)plVar2[1];
      func_0x005ae2b8(&plStack_80);
      puVar3 = &UNK_008af940;
    }
    else {
      lVar4 = plVar2[1];
      func_0x005adc80(lVar4);
      func_0x00187bd4(lVar4,0x40,8);
      puVar3 = &UNK_008af968;
    }
  }
  else if (lVar4 == 9) {
    func_0x005ae4ac(plVar2 + 1);
    puVar3 = &UNK_008af990;
  }
  else if (lVar4 == 10) {
    lStack_78 = plVar2[2];
    plStack_80 = (long *)plVar2[1];
    lStack_68 = plVar2[4];
    lStack_70 = plVar2[3];
    func_0x005ae94c(&plStack_80);
    puVar3 = &UNK_008af9b9;
  }
  else {
    lStack_78 = plVar2[2];
    plStack_80 = (long *)plVar2[1];
    lStack_68 = plVar2[4];
    lStack_70 = plVar2[3];
    lStack_58 = plVar2[6];
    lStack_60 = plVar2[5];
    lStack_50 = plVar2[7];
    uVar5 = (ulong)plStack_80 ^ 0x8000000000000000;
    if (1 < uVar5) {
      uVar5 = 2;
    }
    if (uVar5 != 0) {
      if (uVar5 == 1) {
        func_0x005ae1bc((ulong)&plStack_80 | 8);
      }
      else {
        func_0x005ae828(plVar2 + 1);
      }
    }
    puVar3 = &UNK_008af9e3;
  }
  return puVar3;
}

