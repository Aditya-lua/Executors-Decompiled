
bool FUN_0006a3e0(void)

{
  char ****ppppcVar1;
  char ****ppppcVar2;
  char ****ppppcVar3;
  long *plVar4;
  undefined8 uVar5;
  long lVar6;
  char ****ppppcVar7;
  char ****ppppcVar8;
  char ****ppppcVar9;
  long unaff_x29;
  undefined1 uStack0000000000000020;
  char acStack_60 [8];
  undefined4 uStack_58;
  undefined1 uStack_54;
  char cStack_49;
  char ****ppppcStack_48;
  ulong uStack_40;
  byte bStack_31;
  
  plVar4 = *(long **)(unaff_x29 + -0xd8);
  if (plVar4 == (long *)(unaff_x29 + -0xf0)) {
    lVar6 = 4;
    plVar4 = (long *)(unaff_x29 + -0xf0);
LAB_0006a404:
    (**(code **)(*plVar4 + lVar6 * 8))();
  }
  else if (plVar4 != (long *)0x0) {
    lVar6 = 5;
    goto LAB_0006a404;
  }
  plVar4 = *(long **)(unaff_x29 + -0xb8);
  if (plVar4 == (long *)(unaff_x29 + -0xd0)) {
    lVar6 = 4;
    plVar4 = (long *)(unaff_x29 + -0xd0);
LAB_0006a434:
    (**(code **)(*plVar4 + lVar6 * 8))();
  }
  else if (plVar4 != (long *)0x0) {
    lVar6 = 5;
    goto LAB_0006a434;
  }
  plVar4 = *(long **)(unaff_x29 + -0x98);
  if (plVar4 == (long *)(unaff_x29 + -0xb0)) {
    lVar6 = 4;
    plVar4 = (long *)(unaff_x29 + -0xb0);
  }
  else {
    if (plVar4 == (long *)0x0) goto LAB_0006a4a0;
    lVar6 = 5;
  }
  (**(code **)(*plVar4 + lVar6 * 8))();
LAB_0006a4a0:
  func_0x0006f738(&uStack0000000000000020);
  uVar5 = __Unwind_Resume();
  cStack_49 = '\f';
  uStack_58 = 0x65707954;
  acStack_60[0] = s_Content_Type_008d186c[0];
  acStack_60[1] = s_Content_Type_008d186c[1];
  acStack_60[2] = s_Content_Type_008d186c[2];
  acStack_60[3] = s_Content_Type_008d186c[3];
  acStack_60[4] = s_Content_Type_008d186c[4];
  acStack_60[5] = s_Content_Type_008d186c[5];
  acStack_60[6] = s_Content_Type_008d186c[6];
  acStack_60[7] = s_Content_Type_008d186c[7];
  uStack_54 = 0;
  func_0x0005cc80(&ppppcStack_48,uVar5,acStack_60,"",0);
  if (cStack_49 < '\0') {
    __ZdlPv(acStack_60);
  }
  ppppcVar3 = ppppcStack_48;
  if (-1 < (char)bStack_31) {
    uStack_40 = (ulong)bStack_31;
    ppppcVar3 = (char ****)&ppppcStack_48;
  }
  if (0x12 < uStack_40) {
    uStack_40 = 0x13;
  }
  ppppcVar1 = (char ****)((long)ppppcVar3 + uStack_40);
  ppppcVar9 = ppppcVar1;
  if (uStack_40 != 0) {
    ppppcVar7 = ppppcVar3;
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
                                        ppppcVar8 = (char ****)((long)ppppcVar7 + 0x12);
                                        while (ppppcVar7 = (char ****)((long)ppppcVar8 + -0x11),
                                              *(char *)((long)ppppcVar8 + -0x12) != 'm') {
                                          ppppcVar8 = (char ****)((long)ppppcVar8 + 1);
                                          if (ppppcVar7 == ppppcVar1) goto code_r0x0006a724;
                                        }
                                        if (ppppcVar7 == ppppcVar1) goto code_r0x0006a724;
                                      } while (*(char *)ppppcVar7 != 'u');
                                      if (ppppcVar8 + -2 == ppppcVar1) goto code_r0x0006a724;
                                    } while (*(char *)(ppppcVar8 + -2) != 'l');
                                    if ((char ****)((long)ppppcVar8 + -0xf) == ppppcVar1)
                                    goto code_r0x0006a724;
                                  } while (*(char *)((long)ppppcVar8 + -0xf) != 't');
                                  if ((char ****)((long)ppppcVar8 + -0xe) == ppppcVar1)
                                  goto code_r0x0006a724;
                                } while (*(char *)((long)ppppcVar8 + -0xe) != 'i');
                                if ((char ****)((long)ppppcVar8 + -0xd) == ppppcVar1)
                                goto code_r0x0006a724;
                              } while (*(char *)((long)ppppcVar8 + -0xd) != 'p');
                              if ((char ****)((long)ppppcVar8 + -0xc) == ppppcVar1)
                              goto code_r0x0006a724;
                            } while (*(char *)((long)ppppcVar8 + -0xc) != 'a');
                            if ((char ****)((long)ppppcVar8 + -0xb) == ppppcVar1)
                            goto code_r0x0006a724;
                          } while (*(char *)((long)ppppcVar8 + -0xb) != 'r');
                          if ((char ****)((long)ppppcVar8 + -10) == ppppcVar1)
                          goto code_r0x0006a724;
                        } while (*(char *)((long)ppppcVar8 + -10) != 't');
                        if ((char ****)((long)ppppcVar8 + -9) == ppppcVar1) goto code_r0x0006a724;
                      } while (*(char *)((long)ppppcVar8 + -9) != '/');
                      if (ppppcVar8 + -1 == ppppcVar1) goto code_r0x0006a724;
                    } while (*(char *)(ppppcVar8 + -1) != 'f');
                    if ((char ****)((long)ppppcVar8 + -7) == ppppcVar1) goto code_r0x0006a724;
                  } while (*(char *)((long)ppppcVar8 + -7) != 'o');
                  if ((char ****)((long)ppppcVar8 + -6) == ppppcVar1) goto code_r0x0006a724;
                } while (*(char *)((long)ppppcVar8 + -6) != 'r');
                if ((char ****)((long)ppppcVar8 + -5) == ppppcVar1) goto code_r0x0006a724;
              } while (*(char *)((long)ppppcVar8 + -5) != 'm');
              if ((char ****)((long)ppppcVar8 + -4) == ppppcVar1) goto code_r0x0006a724;
            } while (*(char *)((long)ppppcVar8 + -4) != '-');
            if ((char ****)((long)ppppcVar8 + -3) == ppppcVar1) goto code_r0x0006a724;
          } while (*(char *)((long)ppppcVar8 + -3) != 'd');
          if ((char ****)((long)ppppcVar8 + -2) == ppppcVar1) goto code_r0x0006a724;
        } while (*(char *)((long)ppppcVar8 + -2) != 'a');
        if ((char ****)((long)ppppcVar8 + -1) == ppppcVar1) goto code_r0x0006a724;
      } while (*(char *)((long)ppppcVar8 + -1) != 't');
      if (ppppcVar8 == ppppcVar1) break;
      ppppcVar2 = (char ****)((long)ppppcVar8 + -0x12);
      if (*(char *)ppppcVar8 != 'a') {
        ppppcVar2 = ppppcVar9;
      }
      ppppcVar9 = ppppcVar2;
    }
  }
code_r0x0006a724:
  if ((char)bStack_31 < '\0') {
    __ZdlPv();
  }
  return ppppcVar9 != ppppcVar1 && ppppcVar9 == ppppcVar3;
}

