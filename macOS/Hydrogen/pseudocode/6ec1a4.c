
ulong FUN_006ec1a4(void)

{
  byte bVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  int unaff_w23;
  char *unaff_x24;
  long unaff_x26;
  undefined1 unaff_w27;
  long unaff_x28;
  long unaff_x29;
  ulong in_stack_00000000;
  byte bStack_3c9;
  long lStack_3c8;
  undefined8 uStack_3c0;
  long lStack_3b8;
  undefined8 uStack_3b0;
  uint uStack_3a4;
  undefined1 *puStack_290;
  undefined1 *puStack_288;
  long lStack_70;
  
  func_0x006e3870();
  func_0x006e3c24();
  if (*unaff_x24 == '\0') {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return (ulong)(unaff_w23 + 2);
    }
    goto code_r0x006ec280;
  }
  uVar9 = (int)*unaff_x24 - 0x61;
  uVar10 = (ulong)uVar9;
  if (uVar9 < 0x1a) {
    if (*(char *)(unaff_x26 + uVar10) == '\0') {
      *(undefined1 *)(unaff_x26 + uVar10) = unaff_w27;
      goto code_r0x006ec18c;
    }
    if ((in_stack_00000000 & 0x100000000) == 0) {
      func_0x006e1d54();
    }
    func_0x006e63b0();
  }
  else {
code_r0x006ec18c:
    if (uVar9 < 0x13) {
                    /* WARNING: Could not recover jumptable at 0x006ec1a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar10 = (*(code *)(&UNK_006ec154 + (ulong)*(byte *)(unaff_x28 + uVar10) * 4))();
      return uVar10;
    }
  }
  if ((in_stack_00000000 & 0x100000000) == 0) {
    func_0x006e1d54();
  }
  func_0x006e63b0();
code_r0x006ec280:
  ___stack_chk_fail();
  func_0x006e63b0();
  lVar4 = func_0x006e63b0();
  lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
  iVar3 = func_0x006e21f8(lVar4,1);
  if (iVar3 != 9) {
    lVar5 = lVar4;
  }
  else {
    lVar5 = func_0x006e3658(lVar4,1);
  }
  bVar2 = iVar3 == 9;
  lVar6 = func_0x006e671c(lVar4,bVar2 + '\x01',0,0);
  bVar1 = bVar2 | 2;
  uVar10 = func_0x006e6c08(lVar4,bVar1,lVar5 == lVar4);
  if ((int)uVar10 < 0) {
    func_0x006e63b0(lVar4,bVar1,"level can\'t be negative");
  }
  else {
    func_0x006e7258(lVar4,&puStack_290);
    if (lVar6 != 0) {
      uVar7 = _strlen(lVar6);
      func_0x006e7378(&puStack_290,lVar6,uVar7);
      func_0x006e7378(&puStack_290,"\n",1);
    }
    iVar3 = func_0x006ecb14(lVar5,uVar10,"sln",&lStack_3c8);
    while (iVar3 != 0) {
      iVar3 = _strcmp(uStack_3c0,"C");
      uVar7 = uStack_3b0;
      if (iVar3 != 0) {
        if (lStack_3b8 != 0) {
          uVar8 = _strlen(uStack_3b0);
          func_0x006e7378(&puStack_290,uVar7,uVar8);
        }
        if (0 < (int)uStack_3a4) {
          uVar11 = (ulong)uStack_3a4;
          lVar4 = 0;
          do {
            lVar6 = lVar4;
            uVar9 = (uint)uVar11;
            (&bStack_3c9)[lVar6] = (char)uVar11 + (char)(uVar11 / 10) * -10 | 0x30;
            uVar11 = uVar11 / 10;
            lVar4 = lVar6 + -1;
          } while (9 < uVar9);
          if (puStack_288 <= puStack_290) {
            func_0x006e7288(&puStack_290,1);
          }
          *puStack_290 = 0x3a;
          puStack_290 = puStack_290 + 1;
          func_0x006e7378(&puStack_290,&bStack_3c9 + lVar6,-(lVar6 + -1));
        }
        if (lStack_3c8 != 0) {
          func_0x006e7378(&puStack_290," function ",10);
          lVar4 = lStack_3c8;
          uVar7 = _strlen(lStack_3c8);
          func_0x006e7378(&puStack_290,lVar4,uVar7);
        }
        if (puStack_288 <= puStack_290) {
          func_0x006e7288(&puStack_290,1);
        }
        *puStack_290 = 10;
        puStack_290 = puStack_290 + 1;
      }
      uVar10 = (ulong)((int)uVar10 + 1);
      iVar3 = func_0x006ecb14(lVar5,uVar10,"sln",&lStack_3c8);
    }
    func_0x006e79b0(&puStack_290);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
      return 1;
    }
  }
  uVar10 = ___stack_chk_fail();
  if (((bRam0000000000a278d0 & 1) != 0) ||
     (uVar10 = ___cxa_guard_acquire(0xa278d0), (int)uVar10 == 0)) {
    return uVar10;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar3 = ___cxa_guard_acquire(0xa28b60), iVar3 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar10 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar10;
}

