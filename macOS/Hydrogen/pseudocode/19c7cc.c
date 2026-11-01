
/* WARNING: Possible PIC construction at 0x0019c814: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0019c818) */

undefined1  [16] FUN_0019c7cc(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  int *piVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined *puVar7;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  long lStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_28;
  
  puVar6 = (undefined8 *)&UNK_009c1cd0;
  auVar9 = func_0x007a11c0(param_1,0x22);
  lStack_28 = 0;
  lVar2 = _SecDecryptTransformCreate(*auVar9._8_8_,&lStack_28);
  auVar10._8_8_ = lVar2;
  auVar10._0_8_ = auVar9._0_8_;
  if (lVar2 == 0) {
    if (lStack_28 != 0) {
      auVar9._8_8_ = lStack_28;
      auVar9._0_8_ = 1;
      return auVar9;
    }
    puVar7 = &UNK_009c1cd0;
    auVar10 = func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1cd0);
  }
  else {
    puVar7 = (undefined *)*puVar6;
  }
  uVar5 = auVar10._8_8_;
  piVar3 = auVar10._0_8_;
  if (*piVar3 == 1) {
    if ((*(long *)PTR__kSecPaddingKey_009b03d8 == 0) || (lVar2 = _CFRetain(), lVar2 == 0))
    goto LAB_0019ca88;
    lStack_78 = lVar2;
    if ((*(long *)(piVar3 + 2) == 0) || (lVar4 = _CFRetain(), lVar4 == 0)) {
      func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
      goto code_r0x0019caf4;
    }
    lStack_68 = 0;
    lStack_70 = lVar4;
    _SecTransformSetAttribute(uVar5,lVar2,lVar4,&lStack_68);
    lVar2 = lStack_68;
    if (lStack_68 == 0) {
      func_0x0019fb28(&lStack_70);
      func_0x0019fb28(&lStack_78);
      goto LAB_0019c8f0;
    }
    func_0x0019fb28(&lStack_70);
    func_0x0019fb28(&lStack_78);
  }
  else {
LAB_0019c8f0:
    if ((piVar3[4] & 1U) != 0) {
      if ((*(long *)PTR__kSecEncryptionMode_009b0368 == 0) || (lVar2 = _CFRetain(), lVar2 == 0))
      goto LAB_0019ca88;
      lStack_78 = lVar2;
      if ((*(long *)(piVar3 + 6) == 0) || (lVar2 = _CFRetain(), lVar2 == 0)) {
        func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
        goto code_r0x0019caf4;
      }
      lStack_68 = 0;
      lStack_70 = lVar2;
      _SecTransformSetAttribute(uVar5,lStack_78,lVar2,&lStack_68);
      lVar2 = lStack_68;
      if (lStack_68 != 0) {
        func_0x0019fb28(&lStack_70);
        func_0x0019fb28(&lStack_78);
        goto code_r0x0019ca00;
      }
      func_0x0019fb28(&lStack_70);
      func_0x0019fb28(&lStack_78);
    }
    if ((piVar3[8] & 1U) != 0) {
      if ((*(long *)PTR__kSecIVKey_009b0380 == 0) || (lVar2 = _CFRetain(), lVar2 == 0))
      goto LAB_0019ca88;
      lStack_68 = 0;
      lStack_70 = lVar2;
      _SecTransformSetAttribute(uVar5,lVar2,*(undefined8 *)(piVar3 + 10),&lStack_68);
      lVar2 = lStack_68;
      if (lStack_68 != 0) {
        func_0x0019fb28(&lStack_70);
        goto code_r0x0019ca00;
      }
      func_0x0019fb28(&lStack_70);
    }
    if ((*(long *)PTR__kSecTransformInputAttributeName_009b0420 == 0) ||
       (lVar2 = _CFRetain(), lVar2 == 0)) {
LAB_0019ca88:
      func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
code_r0x0019caf4:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x19caf8);
      (*pcVar1)();
    }
    lStack_68 = 0;
    lStack_78 = lVar2;
    _SecTransformSetAttribute(uVar5,lVar2,puVar7,&lStack_68);
    if (lStack_68 == 0) {
      lStack_68 = 0;
      lVar2 = _SecTransformExecute(uVar5,&lStack_68);
      if (lVar2 != 0) {
        lStack_70 = lVar2;
        lVar2 = _CFRetain();
        if (lVar2 == 0) {
          func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c88);
          goto code_r0x0019caf4;
        }
        func_0x0019e6a4(&lStack_70);
        func_0x0019fb28(&lStack_78);
        uVar8 = 0;
        goto code_r0x0019ca04;
      }
      if (lStack_68 == 0) {
        func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c15f0);
        goto code_r0x0019caf4;
      }
    }
    lVar2 = lStack_68;
    func_0x0019fb28(&lStack_78);
  }
code_r0x0019ca00:
  uVar8 = 1;
code_r0x0019ca04:
  _CFRelease(uVar5);
  auVar11._8_8_ = lVar2;
  auVar11._0_8_ = uVar8;
  return auVar11;
}

