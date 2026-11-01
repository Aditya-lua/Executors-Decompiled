
ulong FUN_006f9144(long param_1)

{
  long lVar1;
  char cVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  undefined8 uVar7;
  char *pcVar8;
  long lVar9;
  int in_w9;
  long lVar10;
  long in_x10;
  long in_x11;
  ulong in_x12;
  uint uVar11;
  long unaff_x22;
  long lVar12;
  ulong unaff_x23;
  int unaff_w24;
  ulong unaff_x26;
  long unaff_x27;
  ulong uVar13;
  ulong uVar14;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar15 [12];
  long in_stack_00000008;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000030;
  undefined4 auStack_2a0 [2];
  long lStack_298;
  ulong uStack_290;
  char *pcStack_288;
  undefined8 uStack_280;
  uint uStack_278;
  ulong uStack_70;
  int iStack_68;
  undefined4 uStack_64;
  
  while( true ) {
    unaff_x23 = in_x12 | unaff_x23 << 8;
    bVar3 = in_x10 == 0;
    in_x10 = in_x10 + -1;
    if (bVar3 || in_x10 == 0) break;
    in_x12 = (ulong)*(byte *)(in_x11 + in_x10);
  }
  if (8 < (int)unaff_x26) {
    if (in_w9 == 0) {
      uVar13 = unaff_x26;
      do {
        if (*(char *)(param_1 + ((int)uVar13 + -9)) != '\0') goto code_r0x006f93e0;
        uVar13 = uVar13 - 1;
      } while (uVar13 != 8);
    }
    else {
      lVar10 = unaff_x26 - 8;
      pcVar8 = (char *)(in_stack_00000008 + unaff_x27);
      do {
        if (*pcVar8 != '\0') goto code_r0x006f93e0;
        lVar10 = lVar10 + -1;
        pcVar8 = pcVar8 + 1;
      } while (lVar10 != 0);
    }
  }
  if ((ulong)(in_stack_00000020 - (unaff_x27 + unaff_x22)) < unaff_x23) goto code_r0x006f93f4;
  func_0x006e38d8();
  uVar13 = (ulong)(uint)((int)unaff_x27 + (int)unaff_x23);
  while (iVar5 = (int)uVar13 + (int)unaff_x26, *uStack0000000000000028 != '\0') {
    uVar4 = func_0x006fa5c8(&uStack0000000000000030,(long)iVar5,&uStack0000000000000028,
                            (long)&uStack0000000000000018 + 4,&uStack0000000000000018);
    unaff_x26 = (ulong)uStack0000000000000018._4_4_;
    if ((ulong)(in_stack_00000020 - iVar5) <
        (ulong)((long)(int)uStack0000000000000018._4_4_ + (long)(int)uStack0000000000000018))
    goto code_r0x006f93f4;
    uVar13 = (long)(int)uStack0000000000000018 + (long)iVar5;
    func_0x006e6978();
    unaff_w24 = unaff_w24 + 1;
    if (uVar4 < 9) {
                    /* WARNING: Could not recover jumptable at 0x006f9044. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar13 = (*(code *)(&UNK_006f9048 + (ulong)*(byte *)(unaff_x28 + (ulong)uVar4) * 4))();
      return uVar13;
    }
  }
  func_0x006e3870();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return (ulong)(unaff_w24 + 1);
  }
code_r0x006f9430:
  auVar15 = ___stack_chk_fail();
  uVar7 = auVar15._0_8_;
  lVar10 = func_0x006e67c8(uVar7,1,&iStack_68);
  pcVar8 = (char *)func_0x006e67c8(uVar7,2,&uStack_70);
  iVar5 = func_0x006e6c08(uVar7,3,1);
  uVar4 = (iStack_68 + 1U & iVar5 >> 0x1f) + iVar5;
  iVar5 = (int)lVar10;
  if ((int)uVar4 < 1) {
    uVar4 = 1;
  }
  else if ((int)(iStack_68 + 1U) < (int)uVar4) goto LAB_006f968c;
  if (auVar15._8_4_ == 0) {
    uVar13 = uStack_70;
code_r0x006f9584:
    uVar14 = (lVar10 + (ulong)uVar4) - 1;
    lStack_298 = lVar10;
    uStack_280 = uVar7;
    if (*pcVar8 == '^') {
      uStack_70 = uVar13 - 1;
      auStack_2a0[0] = 200;
      uStack_290 = lVar10 + CONCAT44(uStack_64,iStack_68);
      pcStack_288 = pcVar8 + uVar13;
      uStack_278 = 0;
      lVar10 = func_0x006f9748(auStack_2a0,uVar14,pcVar8 + 1);
      if (lVar10 != 0) {
joined_r0x006f96c0:
        if (auVar15._8_4_ != 0) {
          func_0x006e3870(uVar7,((int)uVar14 - iVar5) + 1);
          func_0x006e3870(uVar7,(int)lVar10 - iVar5);
          uVar4 = uStack_278;
          func_0x006e6978(uStack_280,uStack_278,"too many captures");
          if (0 < (int)uVar4) {
            uVar11 = 0;
            do {
              func_0x006fa2fc(auStack_2a0,uVar11,0,0);
              uVar11 = uVar11 + 1;
            } while (uVar4 != uVar11);
          }
          return (ulong)(uVar4 + 2);
        }
        uVar13 = (ulong)uStack_278;
        uVar4 = uStack_278;
        if (uStack_278 < 2) {
          uVar4 = 1;
        }
        func_0x006e6978(uStack_280,(ulong)uVar4,"too many captures");
        if ((int)uVar4 < 1) {
          return uVar13;
        }
        uVar11 = 0;
        do {
          func_0x006fa2fc(auStack_2a0,uVar11,uVar14,lVar10);
          uVar11 = uVar11 + 1;
        } while (uVar4 != uVar11);
        return (ulong)uVar4;
      }
    }
    else {
      auStack_2a0[0] = 200;
      uStack_290 = lVar10 + CONCAT44(uStack_64,iStack_68);
      pcStack_288 = pcVar8 + uVar13;
      do {
        uStack_278 = 0;
        lVar10 = func_0x006f9748(auStack_2a0,uVar14,pcVar8);
        if (lVar10 != 0) goto joined_r0x006f96c0;
        bVar3 = uVar14 < uStack_290;
        uVar14 = uVar14 + 1;
      } while (bVar3);
    }
  }
  else {
    iVar6 = func_0x006e2c48(uVar7,4);
    uVar13 = uStack_70;
    if (iVar6 == 0) {
      uVar14 = 0;
      do {
        lVar9 = _strpbrk(pcVar8 + uVar14,"^$*+?.([%-");
        if (lVar9 != 0) goto code_r0x006f9584;
        lVar9 = _strlen(pcVar8 + uVar14);
        uVar14 = uVar14 + lVar9 + 1;
      } while (uVar14 <= uVar13);
    }
    lVar10 = lVar10 + (ulong)uVar4 + -1;
    if (uVar13 == 0) {
code_r0x006f9720:
      iVar5 = (int)lVar10 - iVar5;
      func_0x006e3870(uVar7,iVar5 + 1);
      func_0x006e3870(uVar7,iVar5 + (int)uStack_70);
      return 2;
    }
    uVar14 = (CONCAT44(uStack_64,iStack_68) - (ulong)uVar4) + 1;
    if (uVar13 <= uVar14) {
      lVar9 = uVar14 - (uVar13 - 1);
      if (lVar9 != 0) {
        cVar2 = *pcVar8;
        lVar12 = lVar10;
        do {
          lVar10 = _memchr(lVar12,(long)cVar2,lVar9);
          if (lVar10 == 0) break;
          lVar1 = lVar10 + 1;
          iVar6 = _memcmp(lVar1,pcVar8 + 1,uVar13 - 1);
          if (iVar6 == 0) goto code_r0x006f9720;
          lVar9 = (lVar9 + lVar12) - lVar1;
          lVar12 = lVar1;
        } while (lVar9 != 0);
      }
    }
  }
LAB_006f968c:
  func_0x006e383c(uVar7);
  return 1;
code_r0x006f93e0:
  func_0x006e644c();
code_r0x006f93f4:
  func_0x006e63b0();
  func_0x006e63b0();
  func_0x006e63b0();
  goto code_r0x006f9430;
}

