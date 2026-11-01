
/* WARNING: Removing unreachable block (ram,0x006f9580) */
/* WARNING: Removing unreachable block (ram,0x006f96c4) */
/* WARNING: Removing unreachable block (ram,0x006f96cc) */
/* WARNING: Removing unreachable block (ram,0x006f9714) */
/* WARNING: Removing unreachable block (ram,0x006f96ec) */
/* WARNING: Removing unreachable block (ram,0x006f96f0) */
/* WARNING: Removing unreachable block (ram,0x006f9710) */

int FUN_006f7680(void)

{
  long lVar1;
  char cVar2;
  ulong uVar3;
  bool bVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  long lVar9;
  char *pcVar10;
  long lVar11;
  long unaff_x21;
  long unaff_x22;
  long lVar12;
  int unaff_w23;
  ulong uVar13;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined4 auStack_2a0 [2];
  long lStack_298;
  ulong uStack_290;
  char *pcStack_288;
  undefined8 uStack_280;
  int iStack_278;
  ulong uStack_70;
  int iStack_68;
  undefined4 uStack_64;
  
  for (; unaff_w23 != (int)unaff_x22; unaff_x22 = unaff_x22 + 1) {
    uVar5 = func_0x006e6bc0();
    if (0xff < uVar5) {
      func_0x006e63b0();
      goto LAB_006f76dc;
    }
    *(char *)(unaff_x21 + unaff_x22) = (char)uVar5;
  }
  func_0x006e7a54(&uStack0000000000000008);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return 1;
  }
LAB_006f76dc:
  uVar8 = ___stack_chk_fail();
  lVar9 = func_0x006e67c8(uVar8,1,&iStack_68);
  pcVar10 = (char *)func_0x006e67c8(uVar8,2,&uStack_70);
  iVar6 = func_0x006e6c08(uVar8,3,1);
  uVar5 = (iStack_68 + 1U & iVar6 >> 0x1f) + iVar6;
  iVar6 = (int)lVar9;
  if ((int)uVar5 < 1) {
    uVar5 = 1;
  }
  else if ((int)(iStack_68 + 1U) < (int)uVar5) goto code_r0x006f968c;
  iVar7 = func_0x006e2c48(uVar8,4);
  uVar3 = uStack_70;
  if (iVar7 == 0) {
    uVar13 = 0;
    do {
      lVar11 = _strpbrk(pcVar10 + uVar13,"^$*+?.([%-");
      if (lVar11 != 0) {
        uVar13 = (lVar9 + (ulong)uVar5) - 1;
        lStack_298 = lVar9;
        uStack_280 = uVar8;
        if (*pcVar10 == '^') {
          uStack_70 = uVar3 - 1;
          auStack_2a0[0] = 200;
          uStack_290 = lVar9 + CONCAT44(uStack_64,iStack_68);
          pcStack_288 = pcVar10 + uVar3;
          iStack_278 = 0;
          lVar9 = func_0x006f9748(auStack_2a0,uVar13,pcVar10 + 1);
          if (lVar9 != 0) goto code_r0x006f95dc;
        }
        else {
          auStack_2a0[0] = 200;
          uStack_290 = lVar9 + CONCAT44(uStack_64,iStack_68);
          pcStack_288 = pcVar10 + uVar3;
          do {
            iStack_278 = 0;
            lVar9 = func_0x006f9748(auStack_2a0,uVar13,pcVar10);
            if (lVar9 != 0) {
code_r0x006f95dc:
              func_0x006e3870(uVar8,((int)uVar13 - iVar6) + 1);
              func_0x006e3870(uVar8,(int)lVar9 - iVar6);
              iVar6 = iStack_278;
              func_0x006e6978(uStack_280,iStack_278,"too many captures");
              if (0 < iVar6) {
                iVar7 = 0;
                do {
                  func_0x006fa2fc(auStack_2a0,iVar7,0,0);
                  iVar7 = iVar7 + 1;
                } while (iVar6 != iVar7);
              }
              return iVar6 + 2;
            }
            bVar4 = uVar13 < uStack_290;
            uVar13 = uVar13 + 1;
          } while (bVar4);
        }
        goto code_r0x006f968c;
      }
      lVar11 = _strlen(pcVar10 + uVar13);
      uVar13 = uVar13 + lVar11 + 1;
    } while (uVar13 <= uVar3);
  }
  lVar9 = lVar9 + (ulong)uVar5 + -1;
  if (uVar3 == 0) {
code_r0x006f9720:
    iVar6 = (int)lVar9 - iVar6;
    func_0x006e3870(uVar8,iVar6 + 1);
    func_0x006e3870(uVar8,iVar6 + (int)uStack_70);
    return 2;
  }
  uVar13 = (CONCAT44(uStack_64,iStack_68) - (ulong)uVar5) + 1;
  if (uVar3 <= uVar13) {
    lVar11 = uVar13 - (uVar3 - 1);
    if (lVar11 != 0) {
      cVar2 = *pcVar10;
      lVar12 = lVar9;
      do {
        lVar9 = _memchr(lVar12,(long)cVar2,lVar11);
        if (lVar9 == 0) break;
        lVar1 = lVar9 + 1;
        iVar7 = _memcmp(lVar1,pcVar10 + 1,uVar3 - 1);
        if (iVar7 == 0) goto code_r0x006f9720;
        lVar11 = (lVar11 + lVar12) - lVar1;
        lVar12 = lVar1;
      } while (lVar11 != 0);
    }
  }
code_r0x006f968c:
  func_0x006e383c(uVar8);
  return 1;
}

