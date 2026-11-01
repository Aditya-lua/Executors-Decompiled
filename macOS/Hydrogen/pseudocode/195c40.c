
void FUN_00195c40(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  code *pcVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  undefined *puVar9;
  undefined8 uVar10;
  undefined *puVar11;
  undefined8 *extraout_x8;
  undefined1 auVar12 [16];
  
  func_0x00187bd4();
  func_0x0019fb28();
  __Unwind_Resume();
  auVar12 = func_0x007a2668();
  plVar2 = (long *)func_0x00187bd0(0x30,8);
  if (plVar2 == (long *)0x0) {
    func_0x007a1f18(8,0x30);
LAB_00195e38:
    puVar11 = &UNK_009c14e0;
    uVar10 = 0x12;
    puVar9 = &UNK_0081b8dc;
  }
  else {
    if ((*(long *)PTR__kSecClass_009b0340 == 0) || (lVar3 = _CFRetain(), lVar3 == 0)) {
      func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
      goto LAB_00195e9c;
    }
    if ((*(long *)PTR__kSecClassGenericPassword_009b0348 == 0) || (lVar4 = _CFRetain(), lVar4 == 0))
    {
      func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
      goto LAB_00195e9c;
    }
    if ((*(long *)PTR__kSecAttrService_009b0328 == 0) ||
       (lVar5 = _CFRetain(), puVar9 = PTR__kCFAllocatorDefault_009b0238, lVar5 == 0)) {
      func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
      goto LAB_00195e9c;
    }
    if (auVar12._8_8_ < 0) goto LAB_00195e38;
    lVar6 = _CFStringCreateWithBytes
                      (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,auVar12._0_8_,auVar12._8_8_,
                       0x8000100,0);
    if (lVar6 != 0) {
      if ((*(long *)PTR__kSecAttrAccount_009b02b0 == 0) || (lVar7 = _CFRetain(), lVar7 == 0)) {
        func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
      }
      else {
        if (param_4 < 0) {
          puVar11 = &UNK_009c14e0;
          uVar10 = 0x12;
          puVar9 = &UNK_0081b8dc;
        }
        else {
          lVar8 = _CFStringCreateWithBytes(*(undefined8 *)puVar9,param_3,param_4,0x8000100,0);
          if (lVar8 != 0) {
            *plVar2 = lVar3;
            plVar2[1] = lVar4;
            plVar2[2] = lVar5;
            plVar2[3] = lVar6;
            plVar2[4] = lVar7;
            plVar2[5] = lVar8;
            *extraout_x8 = 3;
            extraout_x8[1] = plVar2;
            extraout_x8[2] = 3;
            return;
          }
          puVar11 = &UNK_009c14c8;
          uVar10 = 0x22;
          puVar9 = &UNK_0081b7f0;
        }
        func_0x007a11c0(puVar9,uVar10,puVar11);
      }
      goto LAB_00195e9c;
    }
    puVar11 = &UNK_009c14c8;
    uVar10 = 0x22;
    puVar9 = &UNK_0081b7f0;
  }
  func_0x007a11c0(puVar9,uVar10,puVar11);
LAB_00195e9c:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x195ea0);
  (*pcVar1)();
}

