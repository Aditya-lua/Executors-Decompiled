
long FUN_0019f958(void)

{
  bool in_CY;
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long *unaff_x19;
  long unaff_x20;
  undefined1 auVar5 [16];
  long lStack_58;
  
  if (in_CY) {
    func_0x007a28b0();
LAB_0019f9d4:
    puVar3 = (undefined8 *)func_0x007a1f00(1);
    lVar1 = _CFURLGetString(*puVar3);
    if ((lVar1 != 0) && (lVar1 = _CFRetain(), lVar1 != 0)) {
      return lVar1;
    }
    puVar3 = (undefined8 *)func_0x007a11c0(&UNK_0081ce61,0x22,&UNK_009c2280);
    lVar1 = _CFURLCopyFileSystemPath(*puVar3);
    if (lVar1 != 0) {
      return lVar1;
    }
    puVar3 = (undefined8 *)func_0x007a11c0(&UNK_0081ce61,0x22,&UNK_009c2280);
    lVar1 = _CFURLCopyAbsoluteURL(*puVar3);
    if (lVar1 != 0) {
      return lVar1;
    }
    auVar5 = func_0x007a11c0(&UNK_0081ce61,0x22,&UNK_009c2220);
    if (*auVar5._0_8_ == 0) {
      func_0x007a11c0(&UNK_0081ce61,0x22,&UNK_009c21d8);
    }
    else {
      lVar1 = _CFRetain();
      if (lVar1 != 0) {
        lStack_58 = lVar1;
        lVar2 = func_0x0019e098(&lStack_58,auVar5._8_8_);
        _CFRelease(lVar1);
        return lVar2;
      }
    }
    uVar4 = func_0x007a11c0(&UNK_0081ce61,0x22,&UNK_009c21f0);
    _CFRelease();
    puVar3 = (undefined8 *)__Unwind_Resume(uVar4);
                    /* WARNING: Could not recover jumptable at 0x007b2170. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    lVar1 = (*(code *)PTR__CFRelease_00a241b0)(*puVar3);
    return lVar1;
  }
  if (unaff_x20 == 0) {
    lVar1 = 1;
  }
  else {
    lVar1 = func_0x00187bd0();
    if (lVar1 == 0) goto LAB_0019f9d4;
  }
  lVar2 = _memcpy(lVar1);
  *unaff_x19 = unaff_x20;
  unaff_x19[1] = lVar1;
  unaff_x19[2] = unaff_x20;
  return lVar2;
}

