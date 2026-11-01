
undefined8 FUN_006f57dc(undefined8 param_1)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  undefined8 uVar7;
  long unaff_x23;
  long lVar8;
  undefined *puVar9;
  
  func_0x006e1d54(param_1,0xfffffffe);
  func_0x006e3e04();
  iVar3 = func_0x006e2400();
  if (iVar3 == 0) {
    lVar8 = 0;
  }
  else {
    iVar3 = func_0x006e2ab8();
    lVar8 = (long)iVar3 * 0x3c;
  }
  func_0x006e1d54();
  func_0x006e3e04();
  iVar3 = func_0x006e2400();
  if (iVar3 == 0) {
    puVar9 = &UNK_0000a8c0;
  }
  else {
    iVar3 = func_0x006e2ab8();
    puVar9 = (undefined *)((long)iVar3 * 0xe10);
  }
  func_0x006e1d54();
  func_0x006e3e04();
  iVar3 = func_0x006e2400();
  if (iVar3 == 0) {
    func_0x006e644c();
  }
  else {
    iVar3 = func_0x006e2ab8();
    func_0x006e1d54();
    func_0x006e3e04();
    iVar4 = func_0x006e2400();
    if (iVar4 != 0) {
      iVar4 = func_0x006e2ab8();
      func_0x006e1d54();
      func_0x006e3e04();
      iVar5 = func_0x006e2400();
      if (iVar5 != 0) {
        iVar5 = func_0x006e2ab8();
        func_0x006e1d54();
        func_0x006e3e04();
        iVar6 = func_0x006e21f8();
        if (iVar6 != 0) {
          func_0x006e2c48();
        }
        func_0x006e1d54();
        iVar6 = (int)((ulong)((long)(iVar4 + -1) * -0x2aaaaaab) >> 0x20);
        iVar6 = (iVar6 >> 1) - (iVar6 >> 0x1f);
        if ((iVar4 + -1) % 0xc < 2) {
          iVar6 = iVar6 + 1;
        }
        iVar1 = (iVar5 - iVar6) + 0x12c0;
        iVar5 = (iVar5 - iVar6) + 0x12c3;
        if (-1 < iVar1) {
          iVar5 = iVar1;
        }
        iVar2 = (int)((ulong)((long)iVar1 * -0x51eb851f) >> 0x20);
        iVar3 = ((iVar4 + iVar6 * 0xc) * 0x99 + -0x1c9) / 5 + iVar3 + iVar1 * 0x16d + (iVar5 >> 2) +
                ((iVar2 >> 5) - (iVar2 >> 0x1f)) + iVar1 / 400;
        if (iVar3 < 0x25bab9 ||
            (long)(puVar9 + (ulong)(iVar3 - 0x7d2d) * 0x15180 + lVar8 + unaff_x23) < 0x3118a41200) {
          func_0x006e383c();
        }
        else {
          func_0x006e3850((double)(long)(puVar9 + (ulong)(iVar3 - 0x7d2d) * 0x15180 +
                                                  lVar8 + unaff_x23 + -0x3118a41200));
        }
        return 1;
      }
      goto LAB_006f5b14;
    }
  }
  func_0x006e644c();
LAB_006f5b14:
  uVar7 = func_0x006e644c();
  if (((bRam0000000000a278d0 & 1) != 0) || (uVar7 = ___cxa_guard_acquire(0xa278d0), (int)uVar7 == 0)
     ) {
    return uVar7;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar3 = ___cxa_guard_acquire(0xa28b60), iVar3 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar7 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar7;
}

