
void FUN_0062b2bc(long param_1,undefined8 param_2)

{
  long lVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  long *plVar7;
  undefined8 *puVar8;
  long extraout_x1;
  long extraout_x1_00;
  long extraout_x1_01;
  int iVar9;
  ulong uVar10;
  char *pcVar11;
  ulong in_x9;
  long lVar12;
  ulong uVar13;
  long unaff_x19;
  long lVar14;
  long *plVar15;
  long unaff_x21;
  int *piVar16;
  undefined8 unaff_x22;
  long unaff_x24;
  uint *puVar17;
  long unaff_x25;
  long lVar18;
  long lVar19;
  long unaff_x29;
  undefined8 in_stack_00000018;
  long *in_stack_00000028;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  
  lVar19 = (in_x9 >> 4) * param_1 + 0x18;
  _bzero(param_2,lVar19);
  *(long *)(unaff_x29 + -0x68) = unaff_x25 + lVar19;
  *(undefined8 *)(unaff_x29 + -0x88) = 0;
  *(undefined8 *)(unaff_x29 + -0x80) = 0;
  *(undefined8 *)(unaff_x29 + -0x78) = 0;
  func_0x00620f4c(unaff_x29 + -0x88);
  if ((unaff_x24 != 0) && (in_stack_00000018._4_4_ != 0)) {
    lVar19 = 0;
    lVar14 = extraout_x1;
    do {
      uVar6 = (**(code **)(*in_stack_00000028 + 0x30))(in_stack_00000028,lVar14);
      func_0x0064afc4(&uStack0000000000000038,unaff_x24,uVar6,0);
      uVar10 = *(ulong *)(unaff_x29 + -0x80);
      if (uVar10 < *(ulong *)(unaff_x29 + -0x78)) {
        func_0x005fe0b4(uVar10,&uStack0000000000000038);
        func_0x005fe0b4(uVar10 + 0x30,&uStack0000000000000068);
        *(undefined8 *)(uVar10 + 0x68) = in_stack_000000a0;
        *(undefined8 *)(uVar10 + 0x60) = in_stack_00000098;
        lVar14 = uVar10 + 0x70;
      }
      else {
        lVar14 = func_0x0064add4(unaff_x29 + -0x88,&uStack0000000000000038);
      }
      *(long *)(unaff_x29 + -0x80) = lVar14;
      uStack0000000000000068 = &UNK_009f5d60;
      uVar10 = in_stack_00000078;
      if (in_stack_00000080 <= in_stack_00000078) {
        uVar10 = in_stack_00000080;
      }
      if (in_stack_00000088 != 0) {
        if (uVar10 != 0) {
          do {
            *(undefined8 *)(in_stack_00000088 + -8 + uVar10 * 8) = 0;
            uVar10 = uVar10 - 1;
          } while (uVar10 != 0);
        }
        func_0x00611644();
      }
      uStack0000000000000038 = &UNK_009f5d60;
      uVar10 = in_stack_00000048;
      if (in_stack_00000050 <= in_stack_00000048) {
        uVar10 = in_stack_00000050;
      }
      if (in_stack_00000058 != 0) {
        if (uVar10 != 0) {
          do {
            *(undefined8 *)(in_stack_00000058 + -8 + uVar10 * 8) = 0;
            uVar10 = uVar10 - 1;
          } while (uVar10 != 0);
        }
        func_0x00611644();
      }
      func_0x006210f8(*(long *)(unaff_x29 + -0x88) + lVar19 * 0x70);
      lVar14 = *(long *)(unaff_x29 + -0x70);
      iVar9 = *(int *)(*(long *)(unaff_x29 + -0x88) + lVar19 * 0x70 + 0x60);
      uVar6 = (**(code **)(*in_stack_00000028 + 0x18))();
      plVar7 = (long *)(lVar14 + lVar19 * 0x18);
      uVar10 = 1L << ((ulong)(iVar9 - 1) & 0x3f);
      plVar15 = (long *)(lVar14 + lVar19 * 0x18 + 8);
      lVar18 = *plVar15;
      lVar12 = *plVar7;
      uVar13 = lVar18 - lVar12 >> 5;
      lVar14 = uVar10 - uVar13;
      if (uVar13 <= uVar10 && lVar14 != 0) {
        func_0x0064f3c8(plVar7,lVar14,uVar6);
        lVar14 = extraout_x1_00;
      }
      else if (uVar13 > uVar10) {
        lVar12 = lVar12 + uVar10 * 0x20;
        for (; lVar18 != lVar12; lVar18 = lVar18 + -0x20) {
          lVar1 = *(long *)(lVar18 + -8);
          uVar10 = *(ulong *)(lVar18 + -0x18);
          if (*(ulong *)(lVar18 + -0x10) <= *(ulong *)(lVar18 + -0x18)) {
            uVar10 = *(ulong *)(lVar18 + -0x10);
          }
          if (lVar1 != 0) {
            if (uVar10 != 0) {
              do {
                *(undefined8 *)(lVar1 + -8 + uVar10 * 8) = 0;
                uVar10 = uVar10 - 1;
              } while (uVar10 != 0);
            }
            func_0x00611644();
            lVar14 = extraout_x1_01;
          }
        }
        *plVar15 = lVar12;
      }
      unaff_x24 = unaff_x24 + 0x30;
      lVar19 = lVar19 + 1;
    } while (lVar19 != unaff_x21);
  }
  func_0x00675bac(&uStack0000000000000038,unaff_x22);
  if (in_stack_00000018._4_4_ != 0) {
    iVar9 = 0;
    do {
      lVar19 = 0;
      bVar4 = false;
      do {
        while( true ) {
          lVar14 = *(long *)(unaff_x29 + -0x88);
          if ((*(char *)(lVar14 + lVar19 * 0x70 + 0x6f) == '\0') &&
             (iVar9 == *(int *)(lVar14 + lVar19 * 0x70 + 100))) {
            lVar14 = lVar14 + lVar19 * 0x70;
            uVar2 = *(uint *)(lVar14 + 0x68);
            lVar18 = *(long *)(*(long *)(unaff_x29 + -0x70) + lVar19 * 0x18);
            lVar12 = *in_stack_00000028;
            if (*(char *)(lVar14 + 0x6d) == '\0') {
              puVar8 = &uStack0000000000000038;
            }
            else {
              puVar8 = (undefined8 *)
                       (**(code **)(lVar12 + 0x28))(in_stack_00000028,&uStack0000000000000038);
              lVar12 = *in_stack_00000028;
            }
            (**(code **)(lVar12 + 0x48))
                      (in_stack_00000028,lVar18 + ((ulong)uVar2 & 0xfffffffe) * 0x10,puVar8);
            lVar14 = *(long *)(unaff_x29 + -0x88);
            lVar12 = lVar14 + lVar19 * 0x70;
            iVar5 = func_0x005fe094(lVar12);
            pcVar11 = (char *)(lVar14 + lVar19 * 0x70 + 0x6e);
            if (*pcVar11 == '\0') {
              uVar10 = (ulong)*(uint *)(lVar14 + lVar19 * 0x70 + 0x60);
            }
            else {
              uVar10 = 0;
            }
            *pcVar11 = '\0';
            uVar13 = func_0x005ffe3c(lVar12,uVar10);
            if ((uVar13 & 1) == 0) {
              lVar18 = 0;
              uVar2 = (uint)uVar10;
              if ((uint)uVar10 <= (uint)(iVar5 * 0x40)) {
                uVar2 = iVar5 * 0x40;
              }
              do {
                if ((uVar10 - uVar2) + lVar18 == 0) {
                  *(undefined1 *)(lVar14 + lVar19 * 0x70 + 0x6f) = 1;
                  if (bVar4) goto code_r0x0062b6a8;
                  goto code_r0x0062b4fc;
                }
                iVar5 = func_0x005ffe3c(lVar12,uVar10 + lVar18 + 1);
                lVar18 = lVar18 + 1;
              } while (iVar5 == 0);
              uVar10 = uVar10 + lVar18;
            }
            func_0x006078e0(lVar12,uVar10);
            lVar18 = lVar14 + lVar19 * 0x70;
            puVar17 = (uint *)(lVar18 + 0x60);
            *(int *)(lVar18 + 100) = *(int *)(lVar18 + 100) + (int)uVar10;
            iVar5 = func_0x00609cf4(lVar12,1L << ((ulong)*puVar17 & 0x3f));
            lVar18 = lVar14 + lVar19 * 0x70;
            piVar16 = (int *)(lVar18 + 0x68);
            *piVar16 = iVar5;
            if ((*(char *)(lVar18 + 0x6c) == '\0') ||
               (iVar5 = func_0x005ffe3c(lVar12,*puVar17), iVar5 == 0)) {
              *(undefined1 *)(lVar14 + lVar19 * 0x70 + 0x6d) = 0;
            }
            else {
              lVar14 = lVar14 + lVar19 * 0x70;
              *(undefined1 *)(lVar14 + 0x6d) = 1;
              *piVar16 = (1 << (ulong)(*puVar17 & 0x1f)) - *piVar16;
              func_0x00603158(lVar12,lVar14 + 0x30);
            }
          }
          if (!bVar4) break;
code_r0x0062b6a8:
          lVar19 = lVar19 + 1;
          bVar4 = true;
          if (lVar19 == unaff_x21) goto code_r0x0062b6d8;
        }
code_r0x0062b4fc:
        cVar3 = *(char *)(*(long *)(unaff_x29 + -0x88) + lVar19 * 0x70 + 0x6f);
        bVar4 = cVar3 == '\0';
        lVar19 = lVar19 + 1;
      } while (lVar19 != unaff_x21);
      if (cVar3 != '\0') goto code_r0x0062b708;
code_r0x0062b6d8:
      uVar6 = (**(code **)(*in_stack_00000028 + 0x38))(in_stack_00000028,&uStack0000000000000038);
      func_0x00677180(&uStack0000000000000038,uVar6);
      iVar9 = iVar9 + 1;
    } while( true );
  }
code_r0x0062b83c:
  uVar10 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar10 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar10 != 0) {
      do {
        *(undefined8 *)((in_stack_00000050 - 8) + uVar10 * 8) = 0;
        uVar10 = uVar10 - 1;
      } while (uVar10 != 0);
    }
    func_0x00611644();
  }
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    func_0x0064b344(unaff_x29 + -0x88);
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x88));
  }
  uStack0000000000000038 = (undefined *)(unaff_x29 + -0x70);
  func_0x0064f2d8(&uStack0000000000000038);
  return;
code_r0x0062b708:
  if (in_stack_00000018._4_4_ != 0) {
    lVar19 = 0;
    do {
      func_0x00677180(unaff_x19,*(long *)(*(long *)(unaff_x29 + -0x70) + lVar19 * 0x18 + 8) + -0x20)
      ;
      plVar7 = (long *)(*(long *)(unaff_x29 + -0x70) + lVar19 * 0x18);
      lVar14 = *plVar7;
      uVar10 = plVar7[1] - lVar14;
      if (0x20 < uVar10) {
        iVar9 = (int)(uVar10 >> 5);
        if (2 < iVar9) {
          uVar10 = (ulong)(iVar9 - 2);
          lVar14 = uVar10 + 1;
          lVar12 = uVar10 << 5;
          do {
            lVar18 = *(long *)(*(long *)(unaff_x29 + -0x70) + lVar19 * 0x18) + lVar12;
            (**(code **)(*in_stack_00000028 + 0x48))(in_stack_00000028,lVar18,lVar18 + 0x20);
            (**(code **)(*in_stack_00000028 + 0x48))
                      (in_stack_00000028,unaff_x19,
                       *(long *)(*(long *)(unaff_x29 + -0x70) + lVar19 * 0x18) + lVar12);
            lVar14 = lVar14 + -1;
            lVar12 = lVar12 + -0x20;
          } while (1 < lVar14);
          lVar14 = *(long *)(*(long *)(unaff_x29 + -0x70) + lVar19 * 0x18);
        }
        (**(code **)(*in_stack_00000028 + 0x48))(in_stack_00000028,lVar14,lVar14 + 0x20);
        uVar6 = (**(code **)(*in_stack_00000028 + 0x38))(in_stack_00000028,unaff_x19);
        uVar6 = (**(code **)(*in_stack_00000028 + 0x20))
                          (in_stack_00000028,uVar6,
                           *(undefined8 *)(*(long *)(unaff_x29 + -0x70) + lVar19 * 0x18));
        func_0x00677180(unaff_x19,uVar6);
      }
      unaff_x19 = unaff_x19 + 0x20;
      lVar19 = lVar19 + 1;
    } while (lVar19 != unaff_x21);
  }
  goto code_r0x0062b83c;
}

