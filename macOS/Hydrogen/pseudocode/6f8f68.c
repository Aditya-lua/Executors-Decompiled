
/* WARNING: Removing unreachable block (ram,0x006f9304) */
/* WARNING: Removing unreachable block (ram,0x006f9308) */
/* WARNING: Removing unreachable block (ram,0x006f9314) */
/* WARNING: Removing unreachable block (ram,0x006f926c) */
/* WARNING: Removing unreachable block (ram,0x006f9274) */
/* WARNING: Removing unreachable block (ram,0x006f92b8) */
/* WARNING: Removing unreachable block (ram,0x006f92c0) */
/* WARNING: Removing unreachable block (ram,0x006f9194) */
/* WARNING: Removing unreachable block (ram,0x006f9198) */
/* WARNING: Removing unreachable block (ram,0x006f91a8) */
/* WARNING: Removing unreachable block (ram,0x006f91ec) */
/* WARNING: Removing unreachable block (ram,0x006f91f4) */
/* WARNING: Removing unreachable block (ram,0x006f9370) */
/* WARNING: Removing unreachable block (ram,0x006f9374) */
/* WARNING: Removing unreachable block (ram,0x006f9380) */
/* WARNING: Removing unreachable block (ram,0x006f938c) */
/* WARNING: Removing unreachable block (ram,0x006f9328) */
/* WARNING: Removing unreachable block (ram,0x006f932c) */
/* WARNING: Removing unreachable block (ram,0x006f9338) */

uint FUN_006f8f68(ulong param_1)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  char *pcVar8;
  uint uVar9;
  undefined1 *puVar10;
  int in_w9;
  long lVar11;
  undefined8 *puVar12;
  long lVar13;
  ulong uVar14;
  char cVar15;
  ulong uVar16;
  undefined8 unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  uint uVar17;
  ulong unaff_x26;
  ulong uVar18;
  ulong uVar19;
  undefined *unaff_x28;
  long unaff_x29;
  double dVar20;
  undefined1 auVar21 [12];
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000040;
  undefined4 auStack_2a0 [2];
  long lStack_298;
  ulong uStack_290;
  char *pcStack_288;
  undefined8 uStack_280;
  uint uStack_278;
  ulong uStack_70;
  int iStack_68;
  undefined4 uStack_64;
  undefined *puStack_60;
  ulong uStack_58;
  ulong uStack_50;
  ulong uStack_48;
  ulong uStack_40;
  ulong uStack_38;
  long lStack_30;
  char *pcStack_28;
  
  if (in_w9 < 2) {
    in_w9 = 1;
  }
  uVar18 = (ulong)(in_w9 - 1);
  uVar19 = unaff_x25;
  if (param_1 < uVar18) goto LAB_006f941c;
  uStack0000000000000030 = unaff_x19;
  if (*unaff_x21 == '\0') {
    unaff_x24 = 0;
  }
  else {
    lVar11 = unaff_x20 + -1;
    lVar7 = unaff_x20 + 8;
    unaff_x21 = "too many results";
    unaff_x28 = &UNK_008c836b;
    uVar5 = unaff_x23;
    uVar19 = 0;
    do {
      unaff_x24 = (ulong)(int)uVar18;
      unaff_x23 = func_0x006fa5c8(&uStack0000000000000030,unaff_x24,&uStack0000000000000028,
                                  (long)&uStack0000000000000018 + 4,&uStack0000000000000018);
      uVar17 = uStack0000000000000018._4_4_;
      unaff_x26 = (ulong)uStack0000000000000018._4_4_;
      unaff_x22 = (long)(int)uStack0000000000000018._4_4_;
      if (in_stack_00000020 - unaff_x24 < (ulong)(unaff_x22 + (int)uStack0000000000000018))
      goto code_r0x006f93f4;
      uVar18 = (long)(int)uStack0000000000000018 + (long)(int)uVar18;
      func_0x006e6978();
      unaff_x24 = (ulong)((int)uVar19 + 1);
      iVar3 = (int)uVar18;
      unaff_x25 = uVar19;
      uVar5 = unaff_x23;
      switch(unaff_x23 & 0xffffffff) {
      case 0:
        if ((int)uVar17 < 1) {
          uVar14 = 0;
code_r0x006f9214:
          uVar19 = 1L << ((ulong)(uVar17 * 8 - 1) & 0x3f);
          uVar14 = (uVar14 ^ uVar19) - uVar19;
        }
        else {
          uVar9 = uVar17;
          if (7 < (int)uVar17) {
            uVar9 = 8;
          }
          uVar16 = (ulong)uVar9;
          uVar14 = 0;
          do {
            uVar14 = (ulong)*(byte *)(lVar11 + uVar18 + uVar16) | uVar14 << 8;
            bVar2 = uVar16 != 0;
            uVar16 = uVar16 - 1;
          } while (bVar2 && uVar16 != 0);
          if ((int)uVar17 < 8) goto code_r0x006f9214;
          iVar3 = uVar17 - 8;
          if (iVar3 != 0) {
            cVar15 = '\0';
            if ((long)uVar14 < 0) {
              cVar15 = -1;
            }
            pcVar8 = (char *)(lVar7 + uVar18);
            do {
              if (cVar15 != *pcVar8) goto code_r0x006f93e0;
              iVar3 = iVar3 + -1;
              pcVar8 = pcVar8 + 1;
            } while (iVar3 != 0);
          }
        }
        dVar20 = (double)(long)uVar14;
        goto code_r0x006f8fb8;
      case 1:
        if ((int)uVar17 < 1) {
          uVar14 = 0;
        }
        else {
          uVar9 = uVar17;
          if (7 < (int)uVar17) {
            uVar9 = 8;
          }
          uVar16 = (ulong)uVar9;
          uVar14 = 0;
          do {
            uVar14 = (ulong)*(byte *)(lVar11 + uVar18 + uVar16) | uVar14 << 8;
            bVar2 = uVar16 != 0;
            uVar16 = uVar16 - 1;
          } while (bVar2 && uVar16 != 0);
          if (8 < (int)uVar17) {
            lVar13 = unaff_x26 - 8;
            pcVar8 = (char *)(lVar7 + uVar18);
            do {
              if (*pcVar8 != '\0') goto code_r0x006f93e0;
              lVar13 = lVar13 + -1;
              pcVar8 = pcVar8 + 1;
            } while (lVar13 != 0);
          }
        }
        dVar20 = (double)uVar14;
        goto code_r0x006f8fb8;
      case 2:
        if (uVar17 != 0) {
          puVar10 = (undefined1 *)(unaff_x20 + iVar3);
          puVar12 = &uStack0000000000000040;
          uVar19 = unaff_x26;
          do {
            *(undefined1 *)puVar12 = *puVar10;
            uVar9 = (int)uVar19 - 1;
            uVar19 = (ulong)uVar9;
            puVar10 = puVar10 + 1;
            puVar12 = (undefined8 *)((long)puVar12 + 1);
          } while (uVar9 != 0);
          if ((uVar17 != 8) && (uVar17 == 4)) {
            dVar20 = (double)(float)uStack0000000000000040;
            goto code_r0x006f8fb8;
          }
        }
        dVar20 = (double)CONCAT44(uStack0000000000000040._4_4_,(float)uStack0000000000000040);
code_r0x006f8fb8:
        func_0x006e3850(dVar20);
        break;
      case 3:
        func_0x006e38d8();
        break;
      case 4:
        if ((int)uVar17 < 1) {
          uVar5 = 0;
        }
        else {
          uVar9 = uVar17;
          if (7 < (int)uVar17) {
            uVar9 = 8;
          }
          uVar14 = (ulong)uVar9;
          uVar5 = 0;
          do {
            uVar5 = (ulong)*(byte *)(lVar11 + uVar18 + uVar14) | uVar5 << 8;
            bVar2 = uVar14 != 0;
            uVar14 = uVar14 - 1;
          } while (bVar2 && uVar14 != 0);
          if (8 < (int)uVar17) {
            lVar13 = unaff_x26 - 8;
            pcVar8 = (char *)(lVar7 + uVar18);
            do {
              if (*pcVar8 != '\0') goto code_r0x006f93e0;
              lVar13 = lVar13 + -1;
              pcVar8 = pcVar8 + 1;
            } while (lVar13 != 0);
          }
          if (in_stack_00000020 - (uVar18 + unaff_x22) < uVar5) goto code_r0x006f93f4;
        }
        func_0x006e38d8();
        uVar18 = (ulong)(uint)(iVar3 + (int)uVar5);
        unaff_x23 = uVar5;
        break;
      case 5:
        uVar19 = (ulong)iVar3;
        unaff_x22 = unaff_x20 + uVar19;
        uVar5 = _strlen(unaff_x22);
        if (uVar5 + uVar19 < in_stack_00000020) {
          func_0x006e38d8();
          uVar18 = (ulong)(iVar3 + (int)uVar5 + 1);
          unaff_x23 = uVar5;
          unaff_x25 = uVar19;
          break;
        }
        goto code_r0x006f9408;
      case 6:
      case 7:
      case 8:
        unaff_x24 = uVar19;
      }
      uVar18 = (ulong)((int)uVar18 + uVar17);
      uVar5 = unaff_x23;
      uVar19 = unaff_x24;
    } while (*uStack0000000000000028 != '\0');
  }
  func_0x006e3870();
  uVar19 = unaff_x25;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return (int)unaff_x24 + 1;
  }
  goto code_r0x006f9430;
code_r0x006f93e0:
  func_0x006e644c();
code_r0x006f93f4:
  func_0x006e63b0();
  unaff_x23 = uVar5;
code_r0x006f9408:
  func_0x006e63b0();
LAB_006f941c:
  func_0x006e63b0();
code_r0x006f9430:
  auVar21 = ___stack_chk_fail();
  uVar6 = auVar21._0_8_;
  puStack_60 = unaff_x28;
  uStack_58 = uVar18;
  uStack_50 = unaff_x26;
  uStack_48 = uVar19;
  uStack_40 = unaff_x24;
  uStack_38 = unaff_x23;
  lStack_30 = unaff_x22;
  pcStack_28 = unaff_x21;
  lVar7 = func_0x006e67c8(uVar6,1,&iStack_68);
  pcVar8 = (char *)func_0x006e67c8(uVar6,2,&uStack_70);
  iVar3 = func_0x006e6c08(uVar6,3,1);
  uVar17 = (iStack_68 + 1U & iVar3 >> 0x1f) + iVar3;
  iVar3 = (int)lVar7;
  if ((int)uVar17 < 1) {
    uVar17 = 1;
  }
  else if ((int)(iStack_68 + 1U) < (int)uVar17) goto LAB_006f968c;
  if (auVar21._8_4_ == 0) {
    uVar18 = uStack_70;
code_r0x006f9584:
    uVar19 = (lVar7 + (ulong)uVar17) - 1;
    lStack_298 = lVar7;
    uStack_280 = uVar6;
    if (*pcVar8 == '^') {
      uStack_70 = uVar18 - 1;
      auStack_2a0[0] = 200;
      uStack_290 = lVar7 + CONCAT44(uStack_64,iStack_68);
      pcStack_288 = pcVar8 + uVar18;
      uStack_278 = 0;
      lVar7 = func_0x006f9748(auStack_2a0,uVar19,pcVar8 + 1);
      uVar17 = uStack_278;
      if (lVar7 != 0) {
joined_r0x006f96c0:
        uStack_278 = uVar17;
        if (auVar21._8_4_ != 0) {
          func_0x006e3870(uVar6,((int)uVar19 - iVar3) + 1);
          func_0x006e3870(uVar6,(int)lVar7 - iVar3);
          uVar17 = uStack_278;
          func_0x006e6978(uStack_280,uStack_278,"too many captures");
          if (0 < (int)uVar17) {
            uVar9 = 0;
            do {
              func_0x006fa2fc(auStack_2a0,uVar9,0,0);
              uVar9 = uVar9 + 1;
            } while (uVar17 != uVar9);
          }
          return uVar17 + 2;
        }
        uVar9 = uVar17;
        if (uVar17 < 2) {
          uVar9 = 1;
        }
        func_0x006e6978(uStack_280,uVar9,"too many captures");
        if ((int)uVar9 < 1) {
          return uVar17;
        }
        uVar17 = 0;
        do {
          func_0x006fa2fc(auStack_2a0,uVar17,uVar19,lVar7);
          uVar17 = uVar17 + 1;
        } while (uVar9 != uVar17);
        return uVar9;
      }
    }
    else {
      auStack_2a0[0] = 200;
      uStack_290 = lVar7 + CONCAT44(uStack_64,iStack_68);
      pcStack_288 = pcVar8 + uVar18;
      do {
        uStack_278 = 0;
        lVar7 = func_0x006f9748(auStack_2a0,uVar19,pcVar8);
        uVar17 = uStack_278;
        if (lVar7 != 0) goto joined_r0x006f96c0;
        bVar2 = uVar19 < uStack_290;
        uVar19 = uVar19 + 1;
      } while (bVar2);
    }
  }
  else {
    iVar4 = func_0x006e2c48(uVar6,4);
    uVar18 = uStack_70;
    if (iVar4 == 0) {
      uVar19 = 0;
      do {
        lVar11 = _strpbrk(pcVar8 + uVar19,"^$*+?.([%-");
        if (lVar11 != 0) goto code_r0x006f9584;
        lVar11 = _strlen(pcVar8 + uVar19);
        uVar19 = uVar19 + lVar11 + 1;
      } while (uVar19 <= uVar18);
    }
    lVar7 = lVar7 + (ulong)uVar17 + -1;
    if (uVar18 == 0) {
code_r0x006f9720:
      iVar3 = (int)lVar7 - iVar3;
      func_0x006e3870(uVar6,iVar3 + 1);
      func_0x006e3870(uVar6,iVar3 + (int)uStack_70);
      return 2;
    }
    uVar19 = (CONCAT44(uStack_64,iStack_68) - (ulong)uVar17) + 1;
    if (uVar18 <= uVar19) {
      lVar11 = uVar19 - (uVar18 - 1);
      if (lVar11 != 0) {
        cVar15 = *pcVar8;
        lVar13 = lVar7;
        do {
          lVar7 = _memchr(lVar13,(long)cVar15,lVar11);
          if (lVar7 == 0) break;
          lVar1 = lVar7 + 1;
          iVar4 = _memcmp(lVar1,pcVar8 + 1,uVar18 - 1);
          if (iVar4 == 0) goto code_r0x006f9720;
          lVar11 = (lVar11 + lVar13) - lVar1;
          lVar13 = lVar1;
        } while (lVar11 != 0);
      }
    }
  }
LAB_006f968c:
  func_0x006e383c(uVar6);
  return 1;
}

