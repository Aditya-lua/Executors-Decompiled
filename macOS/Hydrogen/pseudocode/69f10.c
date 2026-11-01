
/* WARNING: Possible PIC construction at 0x0006a294: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0006a298) */
/* WARNING: Removing unreachable block (ram,0x0006a2a0) */
/* WARNING: Removing unreachable block (ram,0x0006a2ac) */
/* WARNING: Removing unreachable block (ram,0x0006a2c8) */
/* WARNING: Removing unreachable block (ram,0x0006a114) */
/* WARNING: Removing unreachable block (ram,0x00069f24) */
/* WARNING: Removing unreachable block (ram,0x00069fbc) */
/* WARNING: Removing unreachable block (ram,0x00069fc8) */
/* WARNING: Removing unreachable block (ram,0x0006a3a4) */
/* WARNING: Removing unreachable block (ram,0x0006a50c) */
/* WARNING: Type propagation algorithm not settling */

bool FUN_00069f10(void)

{
  char *******pppppppcVar1;
  char *******pppppppcVar2;
  byte bVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  char *******pppppppcVar9;
  char *******pppppppcVar10;
  bool bVar11;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  char *******pppppppcVar12;
  long *unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  long unaff_x29;
  undefined1 auVar13 [12];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined1 uStack0000000000000020;
  char *******pppppppcStack_48;
  ulong uStack_40;
  byte bStack_31;
  long *plStack_30;
  long lStack_28;
  ulong uStack_20;
  long *plStack_18;
  
  func_0x0005cc80();
  uStack0000000000000008 = 0;
  in_stack_00000010 = 0;
  in_stack_00000018 = 0;
  uVar4 = func_0x0006a768(unaff_x29 + -0x68,&uStack0000000000000008);
  if ((uVar4 & 1) == 0) {
    *(undefined4 *)(unaff_x21 + 0x18) = 400;
  }
  else {
    func_0x0006aab0(&uStack0000000000000020,&uStack0000000000000008);
    puVar5 = (undefined8 *)__Znwm(0x20);
    *puVar5 = &UNK_009b8c68;
    puVar5[1] = &uStack0000000000000020;
    puVar5[2] = unaff_x24;
    puVar5[3] = unaff_x23;
    *(undefined8 **)(unaff_x29 + -0x78) = puVar5;
    func_0x0006dd48(unaff_x29 + -0x90,unaff_x29 + -0xb0);
    plVar6 = *(long **)(unaff_x29 + -0x78);
    if (plVar6 == (long *)(unaff_x29 + -0x90)) {
      (**(code **)(*(long *)(unaff_x29 + -0x90) + 0x20))();
    }
    else if (plVar6 != (long *)0x0) {
      (**(code **)(*plVar6 + 0x28))();
    }
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(uStack0000000000000008);
  }
  if ((uVar4 & 1) == 0) {
LAB_0006a2cc:
    bVar11 = false;
    plVar6 = *(long **)(unaff_x29 + -0x98);
    if (plVar6 == (long *)(unaff_x29 + -0xb0)) goto LAB_0006a300;
LAB_0006a2e0:
    if (plVar6 != (long *)0x0) {
      lVar8 = 5;
      goto LAB_0006a308;
    }
  }
  else {
    bVar3 = *(byte *)((long)unaff_x19 + 0x17);
    uVar4 = unaff_x19[1];
    if (-1 < (char)bVar3) {
      uVar4 = (ulong)bVar3;
    }
    if (uVar4 != 6) {
LAB_0006a120:
      lVar8 = unaff_x22[0xe];
      *(undefined8 *)(unaff_x29 + -0xb8) = 0;
      plVar6 = *(long **)(unaff_x29 + -0x98);
      if (plVar6 == (long *)0x0) {
        *(undefined8 *)(unaff_x29 + -0xd8) = 0;
LAB_0006a160:
        *(undefined8 *)(unaff_x29 + -0x50) = 0;
        uStack0000000000000008 = lVar8;
      }
      else {
        if (plVar6 == (long *)(unaff_x29 + -0xb0)) {
          *(long *)(unaff_x29 + -0xd8) = unaff_x29 + -0xf0;
          (**(code **)(*(long *)(unaff_x29 + -0xb0) + 0x18))(unaff_x29 + -0xb0,unaff_x29 + -0xf0);
          lVar7 = *(long *)(unaff_x29 + -0xd8);
        }
        else {
          lVar7 = (**(code **)(*plVar6 + 0x10))();
          *(long *)(unaff_x29 + -0xd8) = lVar7;
        }
        if (lVar7 == 0) goto LAB_0006a160;
        if (lVar7 == unaff_x29 + -0xf0) {
          *(long *)(unaff_x29 + -0x50) = unaff_x29 + -0x68;
          uStack0000000000000008 = lVar8;
          (**(code **)(*(long *)(unaff_x29 + -0xf0) + 0x18))(unaff_x29 + -0xf0,unaff_x29 + -0x68);
        }
        else {
          *(long *)(unaff_x29 + -0x50) = lVar7;
          *(undefined8 *)(unaff_x29 + -0xd8) = 0;
          uStack0000000000000008 = lVar8;
        }
      }
      unaff_x21 = unaff_x21 + 0x18;
      *(long **)(unaff_x29 + -0x90) = unaff_x19;
      *(ulong *)(unaff_x29 + -0x88) = unaff_x20;
      *(undefined8 **)(unaff_x29 + -0x80) = &uStack0000000000000008;
      *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xd0;
      *(long *)(unaff_x29 + -0x70) = unaff_x21;
      unaff_x22 = (long *)(unaff_x29 + -0x68);
      unaff_x20 = func_0x0006e1f8();
      plVar6 = *(long **)(unaff_x29 + -0x50);
      if (plVar6 == unaff_x22) {
        lVar8 = 4;
        plVar6 = (long *)(unaff_x29 + -0x68);
LAB_0006a220:
        (**(code **)(*plVar6 + lVar8 * 8))();
      }
      else if (plVar6 != (long *)0x0) {
        lVar8 = 5;
        goto LAB_0006a220;
      }
      plVar6 = *(long **)(unaff_x29 + -0xd8);
      if (plVar6 == (long *)(unaff_x29 + -0xf0)) {
        lVar8 = 4;
        plVar6 = (long *)(unaff_x29 + -0xf0);
LAB_0006a250:
        (**(code **)(*plVar6 + lVar8 * 8))();
      }
      else if (plVar6 != (long *)0x0) {
        lVar8 = 5;
        goto LAB_0006a250;
      }
      plVar6 = *(long **)(unaff_x29 + -0xb8);
      if (plVar6 == (long *)(unaff_x29 + -0xd0)) {
        lVar8 = 4;
        plVar6 = (long *)(unaff_x29 + -0xd0);
LAB_0006a280:
        (**(code **)(*plVar6 + lVar8 * 8))();
      }
      else if (plVar6 != (long *)0x0) {
        lVar8 = 5;
        goto LAB_0006a280;
      }
      if ((unaff_x20 & 1) != 0) goto code_r0x0006a4b0;
      goto LAB_0006a2cc;
    }
    plVar6 = (long *)*unaff_x19;
    if (-1 < (char)bVar3) {
      plVar6 = unaff_x19;
    }
    if ((int)*plVar6 != 0x454c4544 || *(short *)((long)plVar6 + 4) != 0x4554) goto LAB_0006a120;
    *(undefined1 *)(unaff_x29 + -0x79) = 0xe;
    *(ulong *)(unaff_x29 + -0x90) =
         CONCAT26(s_Content_Length_008d1a55._6_2_,s_Content_Length_008d1a55._0_6_);
    *(ulong *)(unaff_x29 + -0x8a) =
         CONCAT62(s_Content_Length_008d1a55._8_6_,s_Content_Length_008d1a55._6_2_);
    *(undefined1 *)(unaff_x29 + -0x82) = 0;
    lVar8 = func_0x00063e9c(unaff_x19 + 9,unaff_x29 + -0x90);
    if (lVar8 != 0) goto LAB_0006a120;
    bVar11 = true;
    plVar6 = *(long **)(unaff_x29 + -0x98);
    if (plVar6 != (long *)(unaff_x29 + -0xb0)) goto LAB_0006a2e0;
LAB_0006a300:
    lVar8 = 4;
    plVar6 = (long *)(unaff_x29 + -0xb0);
LAB_0006a308:
    (**(code **)(*plVar6 + lVar8 * 8))();
  }
  func_0x0006f738(&uStack0000000000000020);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return bVar11;
  }
  auVar13 = ___stack_chk_fail();
  unaff_x19 = auVar13._0_8_;
  if (auVar13._8_4_ != 0) {
    unaff_x19 = (long *)func_0x0001753c(unaff_x19);
    plVar6 = *(long **)(unaff_x29 + -0x98);
    if (plVar6 == (long *)(unaff_x29 + -0xb0)) {
      lVar8 = 4;
      plVar6 = (long *)(unaff_x29 + -0xb0);
code_r0x0006a494:
      (**(code **)(*plVar6 + lVar8 * 8))();
    }
    else if (plVar6 != (long *)0x0) {
      lVar8 = 5;
      goto code_r0x0006a494;
    }
    func_0x0006f738(&uStack0000000000000020);
  }
  __Unwind_Resume(unaff_x19);
code_r0x0006a4b0:
  plStack_30 = unaff_x22;
  lStack_28 = unaff_x21;
  uStack_20 = unaff_x20;
  plStack_18 = unaff_x19;
  func_0x0005cc80(&pppppppcStack_48);
  if (-1 < (char)bStack_31) {
    uStack_40 = (ulong)bStack_31;
    pppppppcStack_48 = (char *******)&pppppppcStack_48;
  }
  if (0x12 < uStack_40) {
    uStack_40 = 0x13;
  }
  pppppppcVar1 = (char *******)((long)pppppppcStack_48 + uStack_40);
  pppppppcVar12 = pppppppcVar1;
  if (uStack_40 != 0) {
    pppppppcVar9 = pppppppcStack_48;
    while( true ) {
      do {
        do {
          do {
            do {
              do {
                do {
                  do {
                    do {
                      do {
                        do {
                          do {
                            do {
                              do {
                                do {
                                  do {
                                    do {
                                      do {
                                        pppppppcVar10 = (char *******)((long)pppppppcVar9 + 0x12);
                                        while (pppppppcVar9 = (char *******)
                                                              ((long)pppppppcVar10 + -0x11),
                                              *(char *)((long)pppppppcVar10 + -0x12) != 'm') {
                                          pppppppcVar10 = (char *******)((long)pppppppcVar10 + 1);
                                          if (pppppppcVar9 == pppppppcVar1) goto code_r0x0006a724;
                                        }
                                        if (pppppppcVar9 == pppppppcVar1) goto code_r0x0006a724;
                                      } while (*(char *)pppppppcVar9 != 'u');
                                      if (pppppppcVar10 + -2 == pppppppcVar1) goto code_r0x0006a724;
                                    } while (*(char *)(pppppppcVar10 + -2) != 'l');
                                    if ((char *******)((long)pppppppcVar10 + -0xf) == pppppppcVar1)
                                    goto code_r0x0006a724;
                                  } while (*(char *)((long)pppppppcVar10 + -0xf) != 't');
                                  if ((char *******)((long)pppppppcVar10 + -0xe) == pppppppcVar1)
                                  goto code_r0x0006a724;
                                } while (*(char *)((long)pppppppcVar10 + -0xe) != 'i');
                                if ((char *******)((long)pppppppcVar10 + -0xd) == pppppppcVar1)
                                goto code_r0x0006a724;
                              } while (*(char *)((long)pppppppcVar10 + -0xd) != 'p');
                              if ((char *******)((long)pppppppcVar10 + -0xc) == pppppppcVar1)
                              goto code_r0x0006a724;
                            } while (*(char *)((long)pppppppcVar10 + -0xc) != 'a');
                            if ((char *******)((long)pppppppcVar10 + -0xb) == pppppppcVar1)
                            goto code_r0x0006a724;
                          } while (*(char *)((long)pppppppcVar10 + -0xb) != 'r');
                          if ((char *******)((long)pppppppcVar10 + -10) == pppppppcVar1)
                          goto code_r0x0006a724;
                        } while (*(char *)((long)pppppppcVar10 + -10) != 't');
                        if ((char *******)((long)pppppppcVar10 + -9) == pppppppcVar1)
                        goto code_r0x0006a724;
                      } while (*(char *)((long)pppppppcVar10 + -9) != '/');
                      if (pppppppcVar10 + -1 == pppppppcVar1) goto code_r0x0006a724;
                    } while (*(char *)(pppppppcVar10 + -1) != 'f');
                    if ((char *******)((long)pppppppcVar10 + -7) == pppppppcVar1)
                    goto code_r0x0006a724;
                  } while (*(char *)((long)pppppppcVar10 + -7) != 'o');
                  if ((char *******)((long)pppppppcVar10 + -6) == pppppppcVar1)
                  goto code_r0x0006a724;
                } while (*(char *)((long)pppppppcVar10 + -6) != 'r');
                if ((char *******)((long)pppppppcVar10 + -5) == pppppppcVar1) goto code_r0x0006a724;
              } while (*(char *)((long)pppppppcVar10 + -5) != 'm');
              if ((char *******)((long)pppppppcVar10 + -4) == pppppppcVar1) goto code_r0x0006a724;
            } while (*(char *)((long)pppppppcVar10 + -4) != '-');
            if ((char *******)((long)pppppppcVar10 + -3) == pppppppcVar1) goto code_r0x0006a724;
          } while (*(char *)((long)pppppppcVar10 + -3) != 'd');
          if ((char *******)((long)pppppppcVar10 + -2) == pppppppcVar1) goto code_r0x0006a724;
        } while (*(char *)((long)pppppppcVar10 + -2) != 'a');
        if ((char *******)((long)pppppppcVar10 + -1) == pppppppcVar1) goto code_r0x0006a724;
      } while (*(char *)((long)pppppppcVar10 + -1) != 't');
      if (pppppppcVar10 == pppppppcVar1) break;
      pppppppcVar2 = (char *******)((long)pppppppcVar10 + -0x12);
      if (*(char *)pppppppcVar10 != 'a') {
        pppppppcVar2 = pppppppcVar12;
      }
      pppppppcVar12 = pppppppcVar2;
    }
  }
code_r0x0006a724:
  if ((char)bStack_31 < '\0') {
    __ZdlPv();
  }
  return pppppppcVar12 != pppppppcVar1 && pppppppcVar12 == pppppppcStack_48;
}

