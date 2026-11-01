
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong thunk_FUN_0068d51c(void)

{
  ushort uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  ushort uVar6;
  ulong uVar7;
  long unaff_x29;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000c0;
  undefined *apuStack_70 [2];
  ulong uStack_60;
  ulong uStack_58;
  long lStack_50;
  
  func_0x00087574(&uStack0000000000000090);
  func_0x00087574(&uStack00000000000000c0);
  func_0x00087574(unaff_x29 + -0xe0);
  func_0x00087574(unaff_x29 + -0xb0);
  func_0x00087574(unaff_x29 + -0x80);
  __Unwind_Resume();
  uVar3 = func_0x0001753c();
  func_0x00087574(unaff_x29 + -0x80);
  __Unwind_Resume(uVar3);
  func_0x0001753c();
  func_0x0001753c();
  uVar3 = func_0x0001753c();
  func_0x00087574(unaff_x29 + -0xb0);
  func_0x00087574(unaff_x29 + -0x80);
  uVar3 = __Unwind_Resume(uVar3);
  func_0x00087574(unaff_x29 + -0xb0);
  func_0x00087574(&uStack00000000000000c0);
  func_0x00087574(unaff_x29 + -0xe0);
  func_0x00087574(unaff_x29 + -0x80);
  uVar3 = __Unwind_Resume(uVar3);
  func_0x00087574(unaff_x29 + -0xe0);
  func_0x00087574(unaff_x29 + -0x80);
  uVar3 = __Unwind_Resume(uVar3);
  func_0x00087574(unaff_x29 + -0x80);
  uVar3 = __Unwind_Resume(uVar3);
  func_0x00087574(unaff_x29 + -0x80);
  uVar3 = __Unwind_Resume(uVar3);
  func_0x005fe1e8(apuStack_70,&UNK_00007fcf);
  iVar2 = func_0x00609ec8(uVar3,apuStack_70);
  apuStack_70[0] = &UNK_009f5d60;
  uVar7 = uStack_60;
  if (uStack_58 <= uStack_60) {
    uVar7 = uStack_58;
  }
  if (lStack_50 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(lStack_50 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  if (iVar2 < 1) {
    uVar7 = func_0x0068b2f0(uVar3);
  }
  else {
    uVar4 = func_0x0068d87c(apuStack_70);
    iVar2 = func_0x00609ec8(uVar3,uVar4);
    uVar1 = _UNK_008c4570;
    if (iVar2 < 1) {
      uVar6 = _UNK_008c2a04;
      if (_UNK_008c2a04 < _UNK_008c4570) {
        uVar7 = 1;
        do {
          lVar5 = func_0x00609cf4(uVar3,uVar6);
          if (lVar5 == 0) goto LAB_0068d7e8;
          uVar6 = *(ushort *)(&UNK_008c2a04 + uVar7 * 2);
          uVar7 = (ulong)((int)uVar7 + 1);
        } while (uVar6 < uVar1);
      }
      if (uVar6 == uVar1) {
        lVar5 = func_0x00609cf4(uVar3,uVar1);
        uVar7 = (ulong)(lVar5 != 0);
      }
      else {
        uVar7 = 1;
      }
    }
    else {
      uVar6 = _UNK_008c2a04;
      if (_UNK_008c2a04 < _UNK_008c4570) {
        uVar7 = 1;
        do {
          lVar5 = func_0x00609cf4(uVar3,uVar6);
          if (lVar5 == 0) goto LAB_0068d7e8;
          uVar6 = *(ushort *)(&UNK_008c2a04 + uVar7 * 2);
          uVar7 = (ulong)((int)uVar7 + 1);
        } while (uVar6 < uVar1);
      }
      if ((uVar6 == uVar1) && (lVar5 = func_0x00609cf4(uVar3,uVar1), lVar5 == 0)) {
LAB_0068d7e8:
        uVar7 = 0;
      }
      else {
        func_0x005fe1e8(apuStack_70,3);
        iVar2 = func_0x0068b85c(uVar3,apuStack_70);
        if (iVar2 == 0) {
          uVar7 = 0;
        }
        else {
          uVar7 = func_0x0068cdb8(uVar3);
        }
        apuStack_70[0] = &UNK_009f5d60;
        if (uStack_58 <= uStack_60) {
          uStack_60 = uStack_58;
        }
        if (lStack_50 != 0) {
          if (uStack_60 != 0) {
            do {
              *(undefined8 *)(lStack_50 + -8 + uStack_60 * 8) = 0;
              uStack_60 = uStack_60 - 1;
            } while (uStack_60 != 0);
          }
          func_0x00611644();
        }
      }
    }
  }
  return uVar7;
}

