
void FUN_0062b268(long *param_1)

{
  long lVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  long *plVar8;
  undefined1 *puVar9;
  long extraout_x1;
  long extraout_x1_00;
  long extraout_x1_01;
  int in_w4;
  int iVar10;
  ulong uVar11;
  char *pcVar12;
  ulong uVar13;
  long unaff_x19;
  long *unaff_x20;
  long *plVar14;
  ulong unaff_x21;
  int *piVar15;
  undefined8 unaff_x22;
  ulong uVar16;
  long unaff_x24;
  uint *puVar17;
  long lVar18;
  long lVar19;
  long unaff_x29;
  int iStack000000000000001c;
  long *plStack0000000000000028;
  undefined1 uStack0000000000000038;
  undefined1 uStack0000000000000040;
  undefined7 uStack0000000000000041;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  
  *(undefined8 *)(unaff_x29 + -0x70) = 0;
  *(undefined8 *)(unaff_x29 + -0x68) = 0;
  *(undefined8 *)(unaff_x29 + -0x60) = 0;
  _uStack0000000000000038 = (undefined *)(unaff_x29 + -0x70);
  uStack0000000000000040 = 0;
  iStack000000000000001c = in_w4;
  plStack0000000000000028 = param_1;
  if (in_w4 != 0) {
    lVar6 = __Znwm(unaff_x21 * 0x18);
    *(long *)(unaff_x29 + -0x70) = lVar6;
    *(ulong *)(unaff_x29 + -0x60) = lVar6 + (unaff_x21 & 0xffffffff) * 0x18;
    lVar19 = ((unaff_x21 * 0x18 - 0x18) / 0x18) * 0x18 + 0x18;
    _bzero(lVar6,lVar19);
    *(long *)(unaff_x29 + -0x68) = lVar6 + lVar19;
    unaff_x20 = plStack0000000000000028;
  }
  *(undefined8 *)(unaff_x29 + -0x88) = 0;
  *(undefined8 *)(unaff_x29 + -0x80) = 0;
  *(undefined8 *)(unaff_x29 + -0x78) = 0;
  func_0x00620f4c(unaff_x29 + -0x88);
  if ((unaff_x24 != 0) && (iStack000000000000001c != 0)) {
    uVar16 = 0;
    lVar6 = extraout_x1;
    do {
      uVar7 = (**(code **)(*unaff_x20 + 0x30))(unaff_x20,lVar6);
      func_0x0064afc4(&uStack0000000000000038,unaff_x24,uVar7,0);
      uVar11 = *(ulong *)(unaff_x29 + -0x80);
      if (uVar11 < *(ulong *)(unaff_x29 + -0x78)) {
        func_0x005fe0b4(uVar11,&uStack0000000000000038);
        func_0x005fe0b4(uVar11 + 0x30,&uStack0000000000000068);
        *(undefined8 *)(uVar11 + 0x68) = in_stack_000000a0;
        *(undefined8 *)(uVar11 + 0x60) = in_stack_00000098;
        lVar6 = uVar11 + 0x70;
      }
      else {
        lVar6 = func_0x0064add4(unaff_x29 + -0x88,&uStack0000000000000038);
      }
      *(long *)(unaff_x29 + -0x80) = lVar6;
      uStack0000000000000068 = &UNK_009f5d60;
      uVar11 = in_stack_00000078;
      if (in_stack_00000080 <= in_stack_00000078) {
        uVar11 = in_stack_00000080;
      }
      if (in_stack_00000088 != 0) {
        if (uVar11 != 0) {
          do {
            *(undefined8 *)(in_stack_00000088 + -8 + uVar11 * 8) = 0;
            uVar11 = uVar11 - 1;
          } while (uVar11 != 0);
        }
        func_0x00611644();
      }
      _uStack0000000000000038 = &UNK_009f5d60;
      uVar11 = in_stack_00000048;
      if (in_stack_00000050 <= in_stack_00000048) {
        uVar11 = in_stack_00000050;
      }
      if (in_stack_00000058 != 0) {
        if (uVar11 != 0) {
          do {
            *(undefined8 *)(in_stack_00000058 + -8 + uVar11 * 8) = 0;
            uVar11 = uVar11 - 1;
          } while (uVar11 != 0);
        }
        func_0x00611644();
      }
      func_0x006210f8(*(long *)(unaff_x29 + -0x88) + uVar16 * 0x70);
      lVar6 = *(long *)(unaff_x29 + -0x70);
      iVar10 = *(int *)(*(long *)(unaff_x29 + -0x88) + uVar16 * 0x70 + 0x60);
      uVar7 = (**(code **)(*plStack0000000000000028 + 0x18))();
      plVar8 = (long *)(lVar6 + uVar16 * 0x18);
      uVar11 = 1L << ((ulong)(iVar10 - 1) & 0x3f);
      plVar14 = (long *)(lVar6 + uVar16 * 0x18 + 8);
      lVar18 = *plVar14;
      lVar19 = *plVar8;
      uVar13 = lVar18 - lVar19 >> 5;
      lVar6 = uVar11 - uVar13;
      if (uVar13 <= uVar11 && lVar6 != 0) {
        func_0x0064f3c8(plVar8,lVar6,uVar7);
        lVar6 = extraout_x1_00;
      }
      else if (uVar13 > uVar11) {
        lVar19 = lVar19 + uVar11 * 0x20;
        for (; lVar18 != lVar19; lVar18 = lVar18 + -0x20) {
          lVar1 = *(long *)(lVar18 + -8);
          uVar11 = *(ulong *)(lVar18 + -0x18);
          if (*(ulong *)(lVar18 + -0x10) <= *(ulong *)(lVar18 + -0x18)) {
            uVar11 = *(ulong *)(lVar18 + -0x10);
          }
          if (lVar1 != 0) {
            if (uVar11 != 0) {
              do {
                *(undefined8 *)(lVar1 + -8 + uVar11 * 8) = 0;
                uVar11 = uVar11 - 1;
              } while (uVar11 != 0);
            }
            func_0x00611644();
            lVar6 = extraout_x1_01;
          }
        }
        *plVar14 = lVar19;
      }
      unaff_x24 = unaff_x24 + 0x30;
      uVar16 = uVar16 + 1;
      unaff_x20 = plStack0000000000000028;
    } while (uVar16 != unaff_x21);
  }
  func_0x00675bac(&uStack0000000000000038,unaff_x22);
  if (iStack000000000000001c != 0) {
    iVar10 = 0;
    do {
      uVar16 = 0;
      bVar4 = false;
      do {
        while( true ) {
          lVar6 = *(long *)(unaff_x29 + -0x88);
          if ((*(char *)(lVar6 + uVar16 * 0x70 + 0x6f) == '\0') &&
             (iVar10 == *(int *)(lVar6 + uVar16 * 0x70 + 100))) {
            lVar6 = lVar6 + uVar16 * 0x70;
            uVar2 = *(uint *)(lVar6 + 0x68);
            lVar18 = *(long *)(*(long *)(unaff_x29 + -0x70) + uVar16 * 0x18);
            lVar19 = *plStack0000000000000028;
            if (*(char *)(lVar6 + 0x6d) == '\0') {
              puVar9 = &uStack0000000000000038;
            }
            else {
              puVar9 = (undefined1 *)
                       (**(code **)(lVar19 + 0x28))(plStack0000000000000028,&uStack0000000000000038)
              ;
              lVar19 = *plStack0000000000000028;
            }
            (**(code **)(lVar19 + 0x48))
                      (plStack0000000000000028,lVar18 + ((ulong)uVar2 & 0xfffffffe) * 0x10,puVar9);
            lVar6 = *(long *)(unaff_x29 + -0x88);
            lVar19 = lVar6 + uVar16 * 0x70;
            iVar5 = func_0x005fe094(lVar19);
            pcVar12 = (char *)(lVar6 + uVar16 * 0x70 + 0x6e);
            if (*pcVar12 == '\0') {
              uVar11 = (ulong)*(uint *)(lVar6 + uVar16 * 0x70 + 0x60);
            }
            else {
              uVar11 = 0;
            }
            *pcVar12 = '\0';
            uVar13 = func_0x005ffe3c(lVar19,uVar11);
            if ((uVar13 & 1) == 0) {
              lVar18 = 0;
              uVar2 = (uint)uVar11;
              if ((uint)uVar11 <= (uint)(iVar5 * 0x40)) {
                uVar2 = iVar5 * 0x40;
              }
              do {
                if ((uVar11 - uVar2) + lVar18 == 0) {
                  *(undefined1 *)(lVar6 + uVar16 * 0x70 + 0x6f) = 1;
                  if (bVar4) goto code_r0x0062b6a8;
                  goto code_r0x0062b4fc;
                }
                iVar5 = func_0x005ffe3c(lVar19,uVar11 + lVar18 + 1);
                lVar18 = lVar18 + 1;
              } while (iVar5 == 0);
              uVar11 = uVar11 + lVar18;
            }
            func_0x006078e0(lVar19,uVar11);
            lVar18 = lVar6 + uVar16 * 0x70;
            puVar17 = (uint *)(lVar18 + 0x60);
            *(int *)(lVar18 + 100) = *(int *)(lVar18 + 100) + (int)uVar11;
            iVar5 = func_0x00609cf4(lVar19,1L << ((ulong)*puVar17 & 0x3f));
            lVar18 = lVar6 + uVar16 * 0x70;
            piVar15 = (int *)(lVar18 + 0x68);
            *piVar15 = iVar5;
            if ((*(char *)(lVar18 + 0x6c) == '\0') ||
               (iVar5 = func_0x005ffe3c(lVar19,*puVar17), iVar5 == 0)) {
              *(undefined1 *)(lVar6 + uVar16 * 0x70 + 0x6d) = 0;
            }
            else {
              lVar6 = lVar6 + uVar16 * 0x70;
              *(undefined1 *)(lVar6 + 0x6d) = 1;
              *piVar15 = (1 << (ulong)(*puVar17 & 0x1f)) - *piVar15;
              func_0x00603158(lVar19,lVar6 + 0x30);
            }
          }
          if (!bVar4) break;
code_r0x0062b6a8:
          uVar16 = uVar16 + 1;
          bVar4 = true;
          if (uVar16 == unaff_x21) goto code_r0x0062b6d8;
        }
code_r0x0062b4fc:
        plVar8 = plStack0000000000000028;
        cVar3 = *(char *)(*(long *)(unaff_x29 + -0x88) + uVar16 * 0x70 + 0x6f);
        bVar4 = cVar3 == '\0';
        uVar16 = uVar16 + 1;
      } while (uVar16 != unaff_x21);
      if (cVar3 != '\0') goto code_r0x0062b708;
code_r0x0062b6d8:
      uVar7 = (**(code **)(*plStack0000000000000028 + 0x38))
                        (plStack0000000000000028,&uStack0000000000000038);
      func_0x00677180(&uStack0000000000000038,uVar7);
      iVar10 = iVar10 + 1;
    } while( true );
  }
code_r0x0062b83c:
  uVar16 = CONCAT71(uStack0000000000000041,uStack0000000000000040);
  if (in_stack_00000048 <= CONCAT71(uStack0000000000000041,uStack0000000000000040)) {
    uVar16 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar16 != 0) {
      do {
        *(undefined8 *)((in_stack_00000050 - 8) + uVar16 * 8) = 0;
        uVar16 = uVar16 - 1;
      } while (uVar16 != 0);
    }
    func_0x00611644();
  }
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    func_0x0064b344(unaff_x29 + -0x88);
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x88));
  }
  _uStack0000000000000038 = (undefined *)(unaff_x29 + -0x70);
  func_0x0064f2d8(&uStack0000000000000038);
  return;
code_r0x0062b708:
  if (iStack000000000000001c != 0) {
    uVar16 = 0;
    do {
      func_0x00677180(unaff_x19,*(long *)(*(long *)(unaff_x29 + -0x70) + uVar16 * 0x18 + 8) + -0x20)
      ;
      plVar14 = (long *)(*(long *)(unaff_x29 + -0x70) + uVar16 * 0x18);
      lVar6 = *plVar14;
      uVar11 = plVar14[1] - lVar6;
      if (0x20 < uVar11) {
        iVar10 = (int)(uVar11 >> 5);
        if (2 < iVar10) {
          uVar11 = (ulong)(iVar10 - 2);
          lVar6 = uVar11 + 1;
          lVar19 = uVar11 << 5;
          do {
            lVar18 = *(long *)(*(long *)(unaff_x29 + -0x70) + uVar16 * 0x18) + lVar19;
            (**(code **)(*plVar8 + 0x48))(plVar8,lVar18,lVar18 + 0x20);
            (**(code **)(*plVar8 + 0x48))
                      (plVar8,unaff_x19,
                       *(long *)(*(long *)(unaff_x29 + -0x70) + uVar16 * 0x18) + lVar19);
            lVar6 = lVar6 + -1;
            lVar19 = lVar19 + -0x20;
          } while (1 < lVar6);
          lVar6 = *(long *)(*(long *)(unaff_x29 + -0x70) + uVar16 * 0x18);
        }
        (**(code **)(*plVar8 + 0x48))(plVar8,lVar6,lVar6 + 0x20);
        uVar7 = (**(code **)(*plVar8 + 0x38))(plVar8,unaff_x19);
        uVar7 = (**(code **)(*plVar8 + 0x20))
                          (plVar8,uVar7,
                           *(undefined8 *)(*(long *)(unaff_x29 + -0x70) + uVar16 * 0x18));
        func_0x00677180(unaff_x19,uVar7);
      }
      unaff_x19 = unaff_x19 + 0x20;
      uVar16 = uVar16 + 1;
    } while (uVar16 != unaff_x21);
  }
  goto code_r0x0062b83c;
}

