
ulong FUN_006f9384(long param_1)

{
  long lVar1;
  char cVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  char *pcVar10;
  long lVar11;
  long in_x9;
  int in_w10;
  uint in_w11;
  uint uVar12;
  long lVar13;
  int unaff_w24;
  int unaff_w26;
  long unaff_x27;
  ulong uVar14;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar15 [12];
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
  
  for (; in_w10 != -1; in_w10 = in_w10 + -1) {
    if (in_w11 != *(byte *)(in_x9 + in_w10)) {
      func_0x006e644c();
      goto code_r0x006f93f4;
    }
  }
  func_0x006e3850((double)param_1);
  while (iVar5 = (int)unaff_x27 + unaff_w26, *uStack0000000000000028 != '\0') {
    uVar4 = func_0x006fa5c8(&uStack0000000000000030,(long)iVar5,&uStack0000000000000028,
                            (long)&uStack0000000000000018 + 4,&uStack0000000000000018);
    unaff_w26 = uStack0000000000000018._4_4_;
    if ((ulong)(in_stack_00000020 - iVar5) <
        (ulong)((long)uStack0000000000000018._4_4_ + (long)(int)uStack0000000000000018))
    goto code_r0x006f93f4;
    unaff_x27 = (long)(int)uStack0000000000000018 + (long)iVar5;
    func_0x006e6978();
    unaff_w24 = unaff_w24 + 1;
    if (uVar4 < 9) {
                    /* WARNING: Could not recover jumptable at 0x006f9044. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar7 = (*(code *)(&UNK_006f9048 + (ulong)*(byte *)(unaff_x28 + (ulong)uVar4) * 4))();
      return uVar7;
    }
  }
  func_0x006e3870();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return (ulong)(unaff_w24 + 1);
  }
code_r0x006f9430:
  auVar15 = ___stack_chk_fail();
  uVar8 = auVar15._0_8_;
  lVar9 = func_0x006e67c8(uVar8,1,&iStack_68);
  pcVar10 = (char *)func_0x006e67c8(uVar8,2,&uStack_70);
  iVar5 = func_0x006e6c08(uVar8,3,1);
  uVar4 = (iStack_68 + 1U & iVar5 >> 0x1f) + iVar5;
  iVar5 = (int)lVar9;
  if ((int)uVar4 < 1) {
    uVar4 = 1;
  }
  else if ((int)(iStack_68 + 1U) < (int)uVar4) goto code_r0x006f968c;
  if (auVar15._8_4_ == 0) {
    uVar7 = uStack_70;
code_r0x006f9584:
    uVar14 = (lVar9 + (ulong)uVar4) - 1;
    lStack_298 = lVar9;
    uStack_280 = uVar8;
    if (*pcVar10 == '^') {
      uStack_70 = uVar7 - 1;
      auStack_2a0[0] = 200;
      uStack_290 = lVar9 + CONCAT44(uStack_64,iStack_68);
      pcStack_288 = pcVar10 + uVar7;
      uStack_278 = 0;
      lVar9 = func_0x006f9748(auStack_2a0,uVar14,pcVar10 + 1);
      if (lVar9 != 0) {
joined_r0x006f96c0:
        if (auVar15._8_4_ != 0) {
          func_0x006e3870(uVar8,((int)uVar14 - iVar5) + 1);
          func_0x006e3870(uVar8,(int)lVar9 - iVar5);
          uVar4 = uStack_278;
          func_0x006e6978(uStack_280,uStack_278,"too many captures");
          if (0 < (int)uVar4) {
            uVar12 = 0;
            do {
              func_0x006fa2fc(auStack_2a0,uVar12,0,0);
              uVar12 = uVar12 + 1;
            } while (uVar4 != uVar12);
          }
          return (ulong)(uVar4 + 2);
        }
        uVar7 = (ulong)uStack_278;
        uVar4 = uStack_278;
        if (uStack_278 < 2) {
          uVar4 = 1;
        }
        func_0x006e6978(uStack_280,(ulong)uVar4,"too many captures");
        if ((int)uVar4 < 1) {
          return uVar7;
        }
        uVar12 = 0;
        do {
          func_0x006fa2fc(auStack_2a0,uVar12,uVar14,lVar9);
          uVar12 = uVar12 + 1;
        } while (uVar4 != uVar12);
        return (ulong)uVar4;
      }
    }
    else {
      auStack_2a0[0] = 200;
      uStack_290 = lVar9 + CONCAT44(uStack_64,iStack_68);
      pcStack_288 = pcVar10 + uVar7;
      do {
        uStack_278 = 0;
        lVar9 = func_0x006f9748(auStack_2a0,uVar14,pcVar10);
        if (lVar9 != 0) goto joined_r0x006f96c0;
        bVar3 = uVar14 < uStack_290;
        uVar14 = uVar14 + 1;
      } while (bVar3);
    }
  }
  else {
    iVar6 = func_0x006e2c48(uVar8,4);
    uVar7 = uStack_70;
    if (iVar6 == 0) {
      uVar14 = 0;
      do {
        lVar11 = _strpbrk(pcVar10 + uVar14,"^$*+?.([%-");
        if (lVar11 != 0) goto code_r0x006f9584;
        lVar11 = _strlen(pcVar10 + uVar14);
        uVar14 = uVar14 + lVar11 + 1;
      } while (uVar14 <= uVar7);
    }
    lVar9 = lVar9 + (ulong)uVar4 + -1;
    if (uVar7 == 0) {
code_r0x006f9720:
      iVar5 = (int)lVar9 - iVar5;
      func_0x006e3870(uVar8,iVar5 + 1);
      func_0x006e3870(uVar8,iVar5 + (int)uStack_70);
      return 2;
    }
    uVar14 = (CONCAT44(uStack_64,iStack_68) - (ulong)uVar4) + 1;
    if (uVar7 <= uVar14) {
      lVar11 = uVar14 - (uVar7 - 1);
      if (lVar11 != 0) {
        cVar2 = *pcVar10;
        lVar13 = lVar9;
        do {
          lVar9 = _memchr(lVar13,(long)cVar2,lVar11);
          if (lVar9 == 0) break;
          lVar1 = lVar9 + 1;
          iVar6 = _memcmp(lVar1,pcVar10 + 1,uVar7 - 1);
          if (iVar6 == 0) goto code_r0x006f9720;
          lVar11 = (lVar11 + lVar13) - lVar1;
          lVar13 = lVar1;
        } while (lVar11 != 0);
      }
    }
  }
code_r0x006f968c:
  func_0x006e383c(uVar8);
  return 1;
code_r0x006f93f4:
  func_0x006e63b0();
  func_0x006e63b0();
  func_0x006e63b0();
  goto code_r0x006f9430;
}

