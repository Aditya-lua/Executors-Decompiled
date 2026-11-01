
void FUN_006cb4d8(void)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 *puVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong *puVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  ulong unaff_x19;
  ulong unaff_x20;
  ulong *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong uVar11;
  ulong unaff_x27;
  ulong *unaff_x28;
  undefined8 *in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000040;
  long in_stack_00000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  
  do {
    lVar9 = unaff_x24;
    if (unaff_x28 == unaff_x22) {
      do {
        while( true ) {
          in_stack_00000028 = in_stack_00000028 + 1;
          if (*(ulong *)(in_stack_00000020 + 0x28) <= in_stack_00000028) {
            (**(code **)*in_stack_00000018)(in_stack_00000018,&uStack0000000000000030);
            if (in_stack_00000040 != 0) {
              func_0x006bc388((long)in_stack_00000018 + 0xc,
                              "Local %s used in the repeat..until condition is undefined because continue statement on line %d jumps over it"
                             );
                    /* WARNING: Does not return */
              pcVar1 = (code *)SoftwareBreakpoint(1,0x6cb838);
              (*pcVar1)();
            }
            uStack0000000000000030 = &UNK_00a1a9d8;
            if (in_stack_00000048 != 0) {
              __ZdlPv();
            }
            return;
          }
          lVar8 = *(long *)(*(long *)(in_stack_00000020 + 0x20) + in_stack_00000028 * 8);
          if (lVar8 != 0 && *(int *)(lVar8 + 8) == iRam0000000000a27bf8) break;
          if (lVar8 != 0 && *(int *)(lVar8 + 8) == iRam0000000000a27c58) {
            if (unaff_x27 < unaff_x19 * 3 >> 2) {
code_r0x006cb4ac:
            }
            else {
              if ((unaff_x27 != 0) && (uVar11 = *(ulong *)(lVar8 + 0x20), uVar11 != 0)) {
                uVar2 = 0;
                uVar4 = uVar11 >> 4 ^ uVar11 >> 9;
                do {
                  uVar4 = uVar4 & unaff_x19 - 1;
                  uVar5 = *(ulong *)(unaff_x24 + uVar4 * 8);
                  if (uVar5 == uVar11) goto code_r0x006cb4ac;
                  uVar2 = uVar2 + 1;
                  uVar4 = uVar2 + uVar4;
                } while (uVar5 != 0 && uVar2 <= unaff_x19 - 1);
              }
              uVar11 = 0x10;
              if (unaff_x19 != 0) {
                uVar11 = unaff_x19 * 2;
              }
              if (uVar11 == 0) {
                unaff_x23 = 0;
              }
              else {
                unaff_x23 = __Znwm(uVar11 << 3);
                if (7 < uVar11) {
                  uVar2 = uVar11 & 0xfffffffffffffff8;
                  puVar3 = (undefined8 *)(unaff_x23 + 0x20);
                  uVar4 = uVar2;
                  do {
                    puVar3[-3] = 0;
                    puVar3[-4] = 0;
                    puVar3[-1] = 0;
                    puVar3[-2] = 0;
                    puVar3[1] = 0;
                    *puVar3 = 0;
                    puVar3[3] = 0;
                    puVar3[2] = 0;
                    uVar4 = uVar4 - 8;
                    puVar3 = puVar3 + 8;
                    if (uVar4 == 0) goto code_r0x006cb6f8;
                  } while( true );
                }
                uVar2 = 0;
                do {
                  *(undefined8 *)(unaff_x23 + uVar2 * 8) = 0;
                  uVar2 = uVar2 + 1;
code_r0x006cb6f8:
                } while (uVar11 != uVar2);
              }
              if (unaff_x19 != 0) {
                uVar2 = 0;
                uVar4 = unaff_x19 * 2 - 1;
                do {
                  uVar5 = *(ulong *)(unaff_x24 + uVar2 * 8);
                  if (uVar5 != 0) {
                    uVar6 = (uVar5 >> 4 ^ uVar5 >> 9) & uVar4;
                    uVar10 = *(ulong *)(unaff_x23 + uVar6 * 8);
                    if (uVar10 != 0) {
                      lVar9 = 1;
                      do {
                        if (uVar10 == uVar5) {
                          puVar7 = (ulong *)(unaff_x23 + uVar6 * 8);
                          goto code_r0x006cb718;
                        }
                        uVar6 = uVar6 + lVar9 & uVar4;
                        uVar10 = *(ulong *)(unaff_x23 + uVar6 * 8);
                        lVar9 = lVar9 + 1;
                      } while (uVar10 != 0);
                    }
                    puVar7 = (ulong *)(unaff_x23 + uVar6 * 8);
                    *puVar7 = uVar5;
code_r0x006cb718:
                    *puVar7 = uVar5;
                  }
                  uVar2 = uVar2 + 1;
                } while (uVar2 != unaff_x19);
              }
              unaff_x19 = uVar11;
              in_stack_00000048 = unaff_x23;
              in_stack_00000050 = uVar11;
              if (unaff_x24 != 0) {
                __ZdlPv(unaff_x24);
              }
            }
            uVar11 = 0;
            uVar4 = *(ulong *)(lVar8 + 0x20);
            uVar2 = uVar4 >> 4 ^ uVar4 >> 9;
            do {
              uVar2 = uVar2 & unaff_x19 - 1;
              uVar5 = *(ulong *)(unaff_x23 + uVar2 * 8);
              if (uVar5 == 0) {
                *(ulong *)(unaff_x23 + uVar2 * 8) = uVar4;
                unaff_x27 = unaff_x27 + 1;
                in_stack_00000058 = unaff_x27;
                break;
              }
              uVar11 = uVar11 + 1;
              uVar2 = uVar11 + uVar2;
            } while (uVar5 != uVar4 && uVar11 <= unaff_x19 - 1);
            unaff_x20 = unaff_x19;
            unaff_x24 = unaff_x23;
            lVar9 = unaff_x23;
          }
        }
      } while (*(long *)(lVar8 + 0x28) == 0);
      unaff_x28 = *(ulong **)(lVar8 + 0x20);
      unaff_x22 = unaff_x28 + *(long *)(lVar8 + 0x28);
    }
    uVar11 = *unaff_x28;
    if (unaff_x20 * 3 >> 2 <= unaff_x27) {
      if ((unaff_x27 != 0) && (uVar11 != 0)) {
        uVar2 = 0;
        uVar4 = uVar11 >> 4 ^ uVar11 >> 9;
        do {
          uVar4 = uVar4 & unaff_x20 - 1;
          uVar5 = *(ulong *)(lVar9 + uVar4 * 8);
          if (uVar5 == uVar11) goto LAB_006cb624;
          uVar2 = uVar2 + 1;
          uVar4 = uVar2 + uVar4;
        } while (uVar5 != 0 && uVar2 <= unaff_x20 - 1);
      }
      unaff_x19 = 0x10;
      if (unaff_x20 != 0) {
        unaff_x19 = unaff_x20 * 2;
      }
      if (unaff_x19 == 0) {
        unaff_x23 = 0;
      }
      else {
        unaff_x23 = __Znwm(unaff_x19 << 3);
        if (7 < unaff_x19) {
          uVar2 = unaff_x19 & 0xfffffffffffffff8;
          puVar3 = (undefined8 *)(unaff_x23 + 0x20);
          uVar4 = uVar2;
          do {
            puVar3[-3] = 0;
            puVar3[-4] = 0;
            puVar3[-1] = 0;
            puVar3[-2] = 0;
            puVar3[1] = 0;
            *puVar3 = 0;
            puVar3[3] = 0;
            puVar3[2] = 0;
            uVar4 = uVar4 - 8;
            puVar3 = puVar3 + 8;
            if (uVar4 == 0) goto LAB_006cb594;
          } while( true );
        }
        uVar2 = 0;
        do {
          *(undefined8 *)(unaff_x23 + uVar2 * 8) = 0;
          uVar2 = uVar2 + 1;
LAB_006cb594:
        } while (unaff_x19 != uVar2);
      }
      if (unaff_x20 != 0) {
        uVar2 = 0;
        uVar4 = unaff_x20 * 2 - 1;
        do {
          uVar5 = *(ulong *)(lVar9 + uVar2 * 8);
          if (uVar5 != 0) {
            uVar6 = (uVar5 >> 4 ^ uVar5 >> 9) & uVar4;
            uVar10 = *(ulong *)(unaff_x23 + uVar6 * 8);
            if (uVar10 != 0) {
              lVar8 = 1;
              do {
                if (uVar10 == uVar5) {
                  puVar7 = (ulong *)(unaff_x23 + uVar6 * 8);
                  goto LAB_006cb5b4;
                }
                uVar6 = uVar6 + lVar8 & uVar4;
                uVar10 = *(ulong *)(unaff_x23 + uVar6 * 8);
                lVar8 = lVar8 + 1;
              } while (uVar10 != 0);
            }
            puVar7 = (ulong *)(unaff_x23 + uVar6 * 8);
            *puVar7 = uVar5;
LAB_006cb5b4:
            *puVar7 = uVar5;
          }
          uVar2 = uVar2 + 1;
        } while (uVar2 != unaff_x20);
      }
      in_stack_00000048 = unaff_x23;
      in_stack_00000050 = unaff_x19;
      if (lVar9 != 0) {
        __ZdlPv(lVar9);
      }
      unaff_x20 = unaff_x19;
      unaff_x24 = unaff_x23;
    }
LAB_006cb624:
    uVar2 = 0;
    uVar4 = uVar11 >> 4 ^ uVar11 >> 9;
    do {
      uVar4 = uVar4 & unaff_x20 - 1;
      uVar5 = *(ulong *)(unaff_x24 + uVar4 * 8);
      if (uVar5 == 0) {
        *(ulong *)(unaff_x24 + uVar4 * 8) = uVar11;
        unaff_x27 = unaff_x27 + 1;
        in_stack_00000058 = unaff_x27;
        break;
      }
      uVar2 = uVar2 + 1;
      uVar4 = uVar2 + uVar4;
    } while (uVar5 != uVar11 && uVar2 <= unaff_x20 - 1);
    unaff_x28 = unaff_x28 + 1;
  } while( true );
}

