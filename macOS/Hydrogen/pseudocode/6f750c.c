
/* WARNING: Removing unreachable block (ram,0x006f9580) */
/* WARNING: Removing unreachable block (ram,0x006f96c4) */
/* WARNING: Removing unreachable block (ram,0x006f96cc) */
/* WARNING: Removing unreachable block (ram,0x006f9714) */
/* WARNING: Removing unreachable block (ram,0x006f96ec) */
/* WARNING: Removing unreachable block (ram,0x006f96f0) */
/* WARNING: Removing unreachable block (ram,0x006f9710) */

int FUN_006f750c(undefined8 param_1)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  char cVar4;
  bool bVar5;
  int iVar6;
  uint uVar7;
  int iVar8;
  long lVar9;
  undefined8 uVar10;
  char *pcVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 uStack0000000000000008;
  undefined4 auStack_510 [2];
  long lStack_508;
  ulong uStack_500;
  char *pcStack_4f8;
  undefined8 uStack_4f0;
  int iStack_4e8;
  ulong uStack_2e0;
  int iStack_2d8;
  undefined4 uStack_2d4;
  undefined1 auStack_268 [544];
  long lStack_48;
  
  lVar9 = func_0x006e67c8(param_1,1,&uStack0000000000000008);
  iVar6 = func_0x006e6c08(param_1,2,1);
  uVar7 = ((uint)uStack0000000000000008 + 1 & iVar6 >> 0x1f) + iVar6;
  iVar6 = func_0x006e6c08(param_1,3,uVar7 & ((int)uVar7 >> 0x1f ^ 0xffffffffU));
  uVar2 = ((uint)uStack0000000000000008 + 1 & iVar6 >> 0x1f) + iVar6;
  uVar2 = uVar2 & ((int)uVar2 >> 0x1f ^ 0xffffffffU);
  if ((int)uVar7 < 2) {
    uVar7 = 1;
  }
  uVar3 = (uint)uStack0000000000000008;
  if ((ulong)uVar2 <= CONCAT44(uStack0000000000000008._4_4_,(uint)uStack0000000000000008)) {
    uVar3 = uVar2;
  }
  iVar6 = uVar3 - uVar7;
  if ((int)uVar3 < (int)uVar7) {
    return 0;
  }
  if (uVar3 != 0x7fffffff) {
    iVar8 = iVar6 + 1;
    func_0x006e6978(param_1,iVar8,"string slice too long");
    if (iVar6 < 0) {
      return iVar8;
    }
    uVar14 = (ulong)(iVar6 + 1);
    iVar6 = uVar7 - 1;
    do {
      func_0x006e3870(param_1,*(undefined1 *)(lVar9 + iVar6));
      iVar6 = iVar6 + 1;
      uVar14 = uVar14 - 1;
    } while (uVar14 != 0);
    return iVar8;
  }
  uVar10 = func_0x006e644c(param_1,"string slice too long");
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  iVar6 = func_0x006e1e34();
  lVar9 = func_0x006e726c(uVar10,auStack_268,(long)iVar6);
  if (0 < iVar6) {
    lVar12 = 0;
    do {
      uVar7 = func_0x006e6bc0(uVar10,(int)lVar12 + 1);
      if (0xff < uVar7) {
        func_0x006e63b0(uVar10,(int)lVar12 + 1,"invalid value");
        goto code_r0x006f76dc;
      }
      *(char *)(lVar9 + lVar12) = (char)uVar7;
      lVar12 = lVar12 + 1;
    } while (iVar6 != (int)lVar12);
  }
  func_0x006e7a54(auStack_268,(long)iVar6);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return 1;
  }
code_r0x006f76dc:
  uVar10 = ___stack_chk_fail();
  lVar9 = func_0x006e67c8(uVar10,1,&iStack_2d8);
  pcVar11 = (char *)func_0x006e67c8(uVar10,2,&uStack_2e0);
  iVar6 = func_0x006e6c08(uVar10,3,1);
  uVar7 = (iStack_2d8 + 1U & iVar6 >> 0x1f) + iVar6;
  iVar6 = (int)lVar9;
  if ((int)uVar7 < 1) {
    uVar7 = 1;
  }
  else if ((int)(iStack_2d8 + 1U) < (int)uVar7) goto LAB_006f968c;
  iVar8 = func_0x006e2c48(uVar10,4);
  uVar14 = uStack_2e0;
  if (iVar8 == 0) {
    uVar15 = 0;
    do {
      lVar12 = _strpbrk(pcVar11 + uVar15,"^$*+?.([%-");
      if (lVar12 != 0) {
        uVar15 = (lVar9 + (ulong)uVar7) - 1;
        lStack_508 = lVar9;
        uStack_4f0 = uVar10;
        if (*pcVar11 == '^') {
          uStack_2e0 = uVar14 - 1;
          auStack_510[0] = 200;
          uStack_500 = lVar9 + CONCAT44(uStack_2d4,iStack_2d8);
          pcStack_4f8 = pcVar11 + uVar14;
          iStack_4e8 = 0;
          lVar9 = func_0x006f9748(auStack_510,uVar15,pcVar11 + 1);
          if (lVar9 != 0) goto LAB_006f95dc;
        }
        else {
          auStack_510[0] = 200;
          uStack_500 = lVar9 + CONCAT44(uStack_2d4,iStack_2d8);
          pcStack_4f8 = pcVar11 + uVar14;
          do {
            iStack_4e8 = 0;
            lVar9 = func_0x006f9748(auStack_510,uVar15,pcVar11);
            if (lVar9 != 0) {
LAB_006f95dc:
              func_0x006e3870(uVar10,((int)uVar15 - iVar6) + 1);
              func_0x006e3870(uVar10,(int)lVar9 - iVar6);
              iVar6 = iStack_4e8;
              func_0x006e6978(uStack_4f0,iStack_4e8,"too many captures");
              if (0 < iVar6) {
                iVar8 = 0;
                do {
                  func_0x006fa2fc(auStack_510,iVar8,0,0);
                  iVar8 = iVar8 + 1;
                } while (iVar6 != iVar8);
              }
              return iVar6 + 2;
            }
            bVar5 = uVar15 < uStack_500;
            uVar15 = uVar15 + 1;
          } while (bVar5);
        }
        goto LAB_006f968c;
      }
      lVar12 = _strlen(pcVar11 + uVar15);
      uVar15 = uVar15 + lVar12 + 1;
    } while (uVar15 <= uVar14);
  }
  lVar9 = lVar9 + (ulong)uVar7 + -1;
  if (uVar14 == 0) {
code_r0x006f9720:
    iVar6 = (int)lVar9 - iVar6;
    func_0x006e3870(uVar10,iVar6 + 1);
    func_0x006e3870(uVar10,iVar6 + (int)uStack_2e0);
    return 2;
  }
  uVar15 = (CONCAT44(uStack_2d4,iStack_2d8) - (ulong)uVar7) + 1;
  if (uVar14 <= uVar15) {
    lVar12 = uVar15 - (uVar14 - 1);
    if (lVar12 != 0) {
      cVar4 = *pcVar11;
      lVar13 = lVar9;
      do {
        lVar9 = _memchr(lVar13,(long)cVar4,lVar12);
        if (lVar9 == 0) break;
        lVar1 = lVar9 + 1;
        iVar8 = _memcmp(lVar1,pcVar11 + 1,uVar14 - 1);
        if (iVar8 == 0) goto code_r0x006f9720;
        lVar12 = (lVar12 + lVar13) - lVar1;
        lVar13 = lVar1;
      } while (lVar12 != 0);
    }
  }
LAB_006f968c:
  func_0x006e383c(uVar10);
  return 1;
}

