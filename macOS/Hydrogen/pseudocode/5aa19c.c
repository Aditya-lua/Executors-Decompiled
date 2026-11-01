
/* WARNING: Type propagation algorithm not settling */

char * FUN_005aa19c(char *param_1)

{
  int iVar1;
  char *pcVar2;
  undefined8 uVar3;
  long lVar4;
  ulong *puVar5;
  long extraout_x8;
  long in_x9;
  ulong uVar6;
  long lVar7;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  undefined8 *puVar8;
  long unaff_x22;
  long *unaff_x23;
  char *unaff_x24;
  char *unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  char *unaff_x28;
  char in_wzr;
  double unaff_d8;
  undefined1 auVar9 [16];
  char cStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined *in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  long *in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined *in_stack_00000058;
  undefined8 *in_stack_00000060;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  
code_r0x005aa19c:
  if (in_x9 == 0xf) {
    if ((param_1[0x50] & 1U) != 0) goto LAB_005a9afc;
    if (*(long *)(param_1 + 0x30) != 0) {
      if (**(long **)(param_1 + 0x28) != -0x7ffffffffffffffe) goto LAB_005a9afc;
      puVar5 = (ulong *)(*(long **)(param_1 + 0x28))[1];
      do {
        uVar6 = *puVar5;
        if (1 < uVar6 && uVar6 != 7) {
          if (uVar6 == 0xb) {
            uVar6 = puVar5[1] ^ 0x8000000000000000;
            if (1 < uVar6) {
              uVar6 = 2;
            }
            if (uVar6 - 1 < 2) goto LAB_005a9afc;
          }
          uVar6 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                            (*(undefined8 *)*unaff_x19,&UNK_008aec99,1);
          if ((uVar6 & 1) != 0) {
code_r0x005aa2d4:
            return (char *)((long)&MACH_HEADER.magic + 1);
          }
        }
LAB_005a9afc:
        do {
          do {
            pcVar2 = unaff_x25;
            unaff_x25 = pcVar2 + 0x108;
            unaff_x27 = unaff_x27 + 1;
            unaff_x22 = unaff_x22 + -0x108;
            if (unaff_x25 == unaff_x24) {
              return (char *)0x0;
            }
            if ((unaff_x27 != 0) &&
               (uVar6 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                                  (*(undefined8 *)*unaff_x19,&UNK_008aec7a,1), (uVar6 & 1) != 0))
            goto code_r0x005aa2d4;
            _cStack0000000000000010 = unaff_x25;
            uVar6 = func_0x005a9610(*(undefined1 *)(unaff_x19 + 2),
                                    *(undefined1 *)((long)unaff_x19 + 0x11));
            unaff_x28 = _cStack0000000000000010;
            if ((uVar6 & 1) != 0) goto code_r0x005aa2a8;
            lVar4 = *(long *)(_cStack0000000000000010 + 0x18);
            if (lVar4 < 0x13) {
              if (lVar4 < 0xf) {
                if (lVar4 == 0xd) {
                  uVar6 = func_0x005ac5c0();
                }
                else {
                  if (lVar4 != 0xe) {
code_r0x005a9f28:
                    uStack0000000000000038 = &cStack0000000000000010;
                    in_stack_00000040 = (long *)&DAT_005adc28;
                    unaff_x28 = (char *)((long)&MACH_HEADER.magic + 1);
                    uStack0000000000000050 = &UNK_007fc120;
                    in_stack_00000058 = (undefined *)0x1;
                    in_stack_00000068 = 1;
                    in_stack_00000070 = 0;
                    in_stack_00000060 = &uStack0000000000000038;
                    uVar6 = func_0x0046849c(*(undefined8 *)*unaff_x19,((undefined8 *)*unaff_x19)[1],
                                            &uStack0000000000000050);
                    if ((uVar6 & 1) != 0) {
                      return unaff_x28;
                    }
                    goto code_r0x005aa054;
                  }
                  uVar6 = func_0x005ac6e0();
                }
              }
              else if (lVar4 == 0xf) {
                uVar6 = func_0x005acb9c();
              }
              else {
                if (lVar4 != 0x10) goto code_r0x005a9f28;
                uVar6 = func_0x005ac850();
              }
joined_r0x005a9c70:
              if ((uVar6 & 1) != 0) {
code_r0x005aa2a8:
                return (char *)((long)&MACH_HEADER.magic + 1);
              }
            }
            else {
              if (lVar4 < 0x17) {
                if (lVar4 == 0x13) {
                  uVar6 = func_0x005ad300();
                }
                else {
                  if (lVar4 != 0x14) goto code_r0x005a9f28;
                  uVar6 = func_0x005ad4cc();
                }
                goto joined_r0x005a9c70;
              }
              if (lVar4 == 0x17) {
                uStack0000000000000038 = _cStack0000000000000010 + 0xe0;
                in_stack_00000040 =
                     (long *)&
                             __ZN58__LT_ast__local__RcLocal_u20_as_u20_core__fmt__Display_GT_3fmt17h099d73c3b4845c4bE
                ;
                uStack0000000000000050 = &UNK_009f2080;
                in_stack_00000058 = (undefined *)0x2;
                in_stack_00000060 = &uStack0000000000000038;
                in_stack_00000068 = 1;
                in_stack_00000070 = 0;
                iVar1 = func_0x0046849c(*(undefined8 *)*unaff_x19,((undefined8 *)*unaff_x19)[1],
                                        &uStack0000000000000050);
                if (((((iVar1 != 0) || (uVar6 = func_0x005ab01c(), (uVar6 & 1) != 0)) ||
                     (uVar6 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                                        (*(undefined8 *)*unaff_x19,&UNK_008aec76,2),
                     (uVar6 & 1) != 0)) || (uVar6 = func_0x005ab01c(), (uVar6 & 1) != 0)) ||
                   ((((unaff_x23 = (long *)(unaff_x28 + 0xa0), *unaff_x23 != 6 ||
                      (*(long *)(unaff_x28 + 0xa8) != -0x7ffffffffffffffe)) ||
                     (*(double *)(unaff_x28 + 0xb0) != unaff_d8)) &&
                    ((uVar6 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                                        (*(undefined8 *)*unaff_x19,&UNK_008aec76,2),
                     (uVar6 & 1) != 0 || (uVar6 = func_0x005ab01c(), (uVar6 & 1) != 0))))))
                goto code_r0x005aa2a8;
                auVar9 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                                   (*(undefined8 *)*unaff_x19,&UNK_008aed88,4);
                if ((auVar9._0_8_ & 1) != 0) goto code_r0x005aa2a8;
                unaff_x28 = (char *)(*(long *)(unaff_x28 + 0xe8) + 8);
                if (*unaff_x28 == '\0') {
                  *unaff_x28 = '\x01';
                }
                else {
                  func_0x007aff64(unaff_x28,auVar9._8_8_,1000000000);
                }
                unaff_x19[1] = unaff_x19[1] + 1;
                uVar6 = func_0x005a9a80();
code_r0x005a9fe0:
                if ((uVar6 & 1) != 0) {
                  if (*unaff_x28 == '\x01') {
                    *unaff_x28 = in_wzr;
                  }
                  else {
                    func_0x007b05dc(unaff_x28,0);
                  }
                  goto code_r0x005aa2a8;
                }
                unaff_x19[1] = unaff_x19[1] + -1;
                if (*unaff_x28 == '\x01') {
                  *unaff_x28 = in_wzr;
                }
                else {
                  func_0x007b05dc(unaff_x28,0);
                }
                puVar8 = (undefined8 *)*unaff_x19;
                uVar6 = (**(code **)(puVar8[1] + 0x18))(*puVar8,&UNK_008aec7a,1);
                if (((uVar6 & 1) != 0) ||
                   (uVar6 = func_0x005a9610(*(undefined1 *)(unaff_x19 + 2),
                                            *(undefined1 *)((long)unaff_x19 + 0x11)),
                   (uVar6 & 1) != 0)) goto code_r0x005aa2a8;
                uVar6 = (**(code **)(puVar8[1] + 0x18))(*puVar8,&UNK_008aecd0,3);
                goto joined_r0x005a9c70;
              }
              if (lVar4 == 0x1a) {
                puVar8 = (undefined8 *)*unaff_x19;
                uStack0000000000000028 = *(long *)(_cStack0000000000000010 + 0x28);
                in_stack_00000030 =
                     uStack0000000000000028 + *(long *)(_cStack0000000000000010 + 0x30) * 8;
                func_0x005bd894(&uStack0000000000000038,&uStack0000000000000028,&UNK_008aec76,2);
                uStack0000000000000018 = &uStack0000000000000038;
                in_stack_00000020 = &DAT_005a9590;
                uStack0000000000000050 = &UNK_009f20a0;
                in_stack_00000058 = (undefined *)0x2;
                in_stack_00000060 = &uStack0000000000000018;
                in_stack_00000068 = 1;
                in_stack_00000070 = 0;
                uVar6 = func_0x0046849c(*puVar8,puVar8[1],&uStack0000000000000050);
                if ((uVar6 & 1) != 0) {
                  if (uStack0000000000000038 == (char *)0x0) goto code_r0x005aa2a8;
                  uVar3 = 1;
                  unaff_x23 = in_stack_00000040;
                  pcVar2 = uStack0000000000000038;
code_r0x005aa2a4:
                  func_0x00187bd4(unaff_x23,pcVar2,uVar3);
                  goto code_r0x005aa2a8;
                }
                if (uStack0000000000000038 != (char *)0x0) {
                  func_0x00187bd4(in_stack_00000040,uStack0000000000000038,1);
                }
                uStack0000000000000050 = *(undefined **)(unaff_x28 + 0x40);
                in_stack_00000058 = uStack0000000000000050 + *(long *)(unaff_x28 + 0x48) * 0x40;
                in_stack_00000060 = (undefined8 *)0x0;
                in_stack_00000068 = in_stack_00000068 & 0xffffffffffffff00;
                func_0x005a505c(&uStack0000000000000038,&uStack0000000000000050,&UNK_009f1ca0);
                lVar4 = in_stack_00000048;
                unaff_x23 = in_stack_00000040;
                if (in_stack_00000048 != 0) {
                  uVar6 = func_0x005ab01c();
                  if ((uVar6 & 1) != 0) {
code_r0x005aa290:
                    if (uStack0000000000000038 == (char *)0x0) goto code_r0x005aa2a8;
                    uVar3 = 8;
                    pcVar2 = (char *)((long)uStack0000000000000038 << 3);
                    goto code_r0x005aa2a4;
                  }
                  lVar4 = lVar4 << 3;
                  while (lVar4 = lVar4 + -8, lVar4 != 0) {
                    uVar6 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                                      (*(undefined8 *)*unaff_x19,&UNK_008aec76,2);
                    if (((uVar6 & 1) != 0) || (iVar1 = func_0x005ab01c(), iVar1 != 0))
                    goto code_r0x005aa290;
                  }
                }
                if (uStack0000000000000038 != (char *)0x0) {
                  func_0x00187bd4(unaff_x23,(long)uStack0000000000000038 << 3,8);
                }
                auVar9 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                                   (*(undefined8 *)*unaff_x19,&UNK_008aed88,4);
                if ((auVar9._0_8_ & 1) != 0) goto code_r0x005aa2a8;
                unaff_x28 = (char *)(*(long *)(unaff_x28 + 0x50) + 8);
                if (*unaff_x28 == '\0') {
                  *unaff_x28 = '\x01';
                }
                else {
                  func_0x007aff64(unaff_x28,auVar9._8_8_,1000000000);
                }
                unaff_x19[1] = unaff_x19[1] + 1;
                uVar6 = func_0x005a9a80();
                goto code_r0x005a9fe0;
              }
              if (lVar4 != 0x1b) goto code_r0x005a9f28;
              unaff_x23 = (long *)*unaff_x19;
              uVar6 = (**(code **)(unaff_x23[1] + 0x18))(*unaff_x23,&UNK_008aed17,6);
              if ((uVar6 & 1) != 0) goto code_r0x005aa2a8;
              lVar4 = *(long *)(unaff_x28 + 0x10);
              if (lVar4 != 0) {
                unaff_x28 = *(char **)(unaff_x28 + 8);
                uVar6 = (**(code **)(unaff_x23[1] + 0x18))(*unaff_x23,&UNK_008aec74,1);
                if (((uVar6 & 1) != 0) || (uVar6 = func_0x005ab01c(), (uVar6 & 1) != 0))
                goto code_r0x005aa2a8;
                unaff_x23 = (long *)(lVar4 * 0x40);
                while( true ) {
                  unaff_x28 = unaff_x28 + 0x40;
                  unaff_x23 = unaff_x23 + -8;
                  if (unaff_x23 == (long *)0x0) break;
                  uVar6 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                                    (*(undefined8 *)*unaff_x19,&UNK_008aec76,2);
                  if (((uVar6 & 1) != 0) || (uVar6 = func_0x005ab01c(), (uVar6 & 1) != 0))
                  goto code_r0x005aa2a8;
                }
              }
            }
code_r0x005aa054:
          } while (unaff_x20 <= unaff_x27);
          lVar4 = unaff_x26 + unaff_x27 * 0x108;
          param_1 = unaff_x25;
          lVar7 = unaff_x22;
          do {
            if (lVar7 == 0) goto LAB_005a9afc;
            in_x9 = *(long *)(lVar4 + 0x18);
            lVar4 = lVar4 + 0x108;
            param_1 = param_1 + 0x108;
            lVar7 = lVar7 + -0x108;
          } while (in_x9 == 0x20);
          lVar4 = *(long *)(pcVar2 + 0x120);
          if (lVar4 < 0x14) {
            if (1 < lVar4 - 0xdU) {
              if (lVar4 == 0xf) {
                lVar4 = *(long *)(pcVar2 + 0x150);
                pcVar2 = pcVar2 + 0x140;
                if (lVar4 == 0) goto LAB_005a9afc;
code_r0x005aa0ec:
                puVar5 = (ulong *)(*(long *)(pcVar2 + 8) + lVar4 * 0x40 + -0x40);
                if (puVar5 == (ulong *)0x0) goto LAB_005a9afc;
                uVar6 = *puVar5;
                while (uVar6 == 9) {
                  puVar5 = (ulong *)puVar5[2];
                  uVar6 = *puVar5;
                }
                if (3 < uVar6 && uVar6 != 7) {
                  if (uVar6 != 0xb) goto LAB_005a9afc;
                  uVar6 = puVar5[1] ^ 0x8000000000000000;
                  if (1 < uVar6) {
                    uVar6 = 2;
                  }
joined_r0x005aa248:
                  if (1 < uVar6 - 1) goto LAB_005a9afc;
                }
              }
              else if (lVar4 != 0x11) goto LAB_005a9afc;
            }
          }
          else if (1 < lVar4 - 0x1cU) {
            if (lVar4 != 0x14) {
              if ((lVar4 == 0x1b) &&
                 (lVar4 = *(long *)(pcVar2 + 0x118), pcVar2 = unaff_x25, lVar4 != 0))
              goto code_r0x005aa0ec;
              goto LAB_005a9afc;
            }
            puVar5 = (ulong *)(pcVar2 + 0x128);
            uVar6 = *puVar5;
            while (uVar6 == 9) {
              puVar5 = (ulong *)puVar5[2];
              uVar6 = *puVar5;
            }
            if (3 < uVar6 && uVar6 != 7) {
              if (uVar6 == 0xb) {
                uVar6 = puVar5[1] ^ 0x8000000000000000;
                if (1 < uVar6) {
                  uVar6 = 2;
                }
                goto joined_r0x005aa248;
              }
              goto LAB_005a9afc;
            }
          }
          if (0xe < in_x9) goto code_r0x005aa19c;
          if (in_x9 == 0xd) {
            lVar4 = 0x38;
            goto code_r0x005aa1d8;
          }
        } while (in_x9 != 0xe);
        lVar4 = 0x50;
code_r0x005aa1d8:
        puVar5 = *(ulong **)(param_1 + lVar4);
      } while( true );
    }
  }
  else {
    if (in_x9 != 0x20) goto LAB_005a9afc;
    func_0x007a247c(&UNK_008aec9a,0xf,&UNK_009f1db8);
  }
  uVar3 = func_0x007a2570(0,0,&UNK_009f1da0);
  if (*unaff_x28 == '\x01') {
    *unaff_x28 = in_wzr;
  }
  else {
    func_0x007b05dc(unaff_x28,0);
  }
  __Unwind_Resume(uVar3);
  func_0x00187bd4(unaff_x23,extraout_x8 << 3,8);
  puVar5 = (ulong *)__Unwind_Resume(uVar3);
  uVar6 = *puVar5;
  while (uVar6 == 9) {
    puVar5 = (ulong *)puVar5[2];
    uVar6 = *puVar5;
  }
  if (3 < uVar6) {
    if (uVar6 == 0xb) {
      uVar6 = puVar5[1] ^ 0x8000000000000000;
      if (1 < uVar6) {
        uVar6 = 2;
      }
      if (1 < uVar6 - 1) {
        return (char *)0x0;
      }
    }
    else if (uVar6 != 7) {
      return (char *)0x0;
    }
  }
  return (char *)((long)&MACH_HEADER.magic + 1);
}

