/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00911488
 */

ulong FUN_00911488(long param_1,long *param_2,undefined4 param_3,char *param_4,undefined8 param_5,
                  undefined8 param_6,undefined8 param_7)

{
  ulong *puVar1;
  long *plVar2;
  char cVar3;
  long lVar4;
  int iVar5;
  size_t sVar6;
  char *pcVar7;
  long lVar8;
  ulong uVar9;
  undefined8 uVar10;
  ulong uVar11;
  long local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  local_70 = 0;
  sVar6 = strlen(param_4);
  lVar8 = 0x11;
  if (param_4[sVar6 - 1] != '.') {
    lVar8 = 0x12;
  }
  if (0x110 < lVar8 + sVar6) {
    uVar10 = 0xd;
LAB_009118c0:
    FUN_00904b80(param_1,"Failed to encode DoH packet [%d]",uVar10);
    uVar11 = 0x1b;
    goto LAB_009118e4;
  }
  *(undefined2 *)((long)param_2 + 0x16) = 0;
  *(undefined4 *)((long)param_2 + 0xc) = 0x10000;
  *(undefined2 *)(param_2 + 2) = 0x100;
  *(undefined4 *)((long)param_2 + 0x12) = 0;
  plVar2 = param_2 + 3;
  cVar3 = *param_4;
  while (cVar3 != '\0') {
    pcVar7 = strchr(param_4,0x2e);
    if (pcVar7 == (char *)0x0) {
      sVar6 = strlen(param_4);
    }
    else {
      sVar6 = (long)pcVar7 - (long)param_4;
    }
    if (0x3e < sVar6 - 1) {
      uVar10 = 1;
      param_2[0x42] = 0;
      goto LAB_009118c0;
    }
    *(char *)plVar2 = (char)sVar6;
    memcpy((undefined1 *)((long)plVar2 + 1),param_4,sVar6);
    param_4 = param_4 + sVar6;
    if (pcVar7 != (char *)0x0) {
      param_4 = param_4 + 1;
    }
    plVar2 = (long *)((undefined1 *)((long)plVar2 + 1) + sVar6);
    cVar3 = *param_4;
  }
  *(undefined1 *)plVar2 = 0;
  *(char *)((long)plVar2 + 2) = (char)param_3;
  *(undefined2 *)((long)plVar2 + 3) = 0x100;
  *(char *)((long)plVar2 + 1) = (char)((uint)param_3 >> 8);
  *(undefined4 *)(param_2 + 1) = param_3;
  param_2[0x42] = (long)((long)plVar2 + (5 - ((long)param_2 + 0xc)));
  FUN_00904528(param_2 + 0x43,3000);
  lVar8 = FUN_009086d4(param_1,0,1);
  if (lVar8 < 1) {
    uVar11 = 0x1c;
  }
  else {
    uVar9 = FUN_00946ab8(&local_70);
    uVar11 = uVar9 & 0xffffffff;
    if ((int)uVar9 == 0) {
      *(undefined ***)(local_70 + 0x12a0) = &PTR_DAT_00cc4b00;
      *(uint *)(local_70 + 0x131c) = *(uint *)(local_70 + 0x131c) | 0x40000;
      uVar9 = curl_easy_setopt(local_70,0x2712,param_5);
      uVar11 = uVar9 & 0xffffffff;
      if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
        uVar9 = curl_easy_setopt(local_70,0x27fe,"https");
        uVar11 = uVar9 & 0xffffffff;
        if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
          uVar9 = curl_easy_setopt(local_70,0x4e2b,&LAB_00912ad8);
          uVar11 = uVar9 & 0xffffffff;
          if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
            uVar9 = curl_easy_setopt(local_70,0x2711,param_2 + 0x43);
            uVar11 = uVar9 & 0xffffffff;
            if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
              uVar9 = curl_easy_setopt(local_70,0x271f,(long)param_2 + 0xc);
              uVar11 = uVar9 & 0xffffffff;
              if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
                uVar9 = curl_easy_setopt(local_70,0x3c,param_2[0x42]);
                uVar11 = uVar9 & 0xffffffff;
                if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
                  uVar9 = curl_easy_setopt(local_70,0x2727,param_7);
                  uVar11 = uVar9 & 0xffffffff;
                  if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
                    uVar9 = curl_easy_setopt(local_70,0xb5,2);
                    uVar11 = uVar9 & 0xffffffff;
                    if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
                      uVar9 = curl_easy_setopt(local_70,0x9b,lVar8);
                      uVar11 = uVar9 & 0xffffffff;
                      if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0))
                      {
                        uVar9 = curl_easy_setopt(local_70,0x2774,*(undefined8 *)(param_1 + 0xd0));
                        uVar11 = uVar9 & 0xffffffff;
                        if (((uint)uVar9 < 0x31) && ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)
                           ) {
                          if ((*(code **)(param_1 + 0x1b8) != (code *)0x0) &&
                             (*(code **)(param_1 + 0x1b8) != sched_yield)) {
                            uVar9 = curl_easy_setopt(local_70,0x2735);
                            uVar11 = uVar9 & 0xffffffff;
                            if ((0x30 < (uint)uVar9) ||
                               ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0)) goto LAB_009118dc;
                          }
                          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                             (((*(long *)(param_1 + 0x12a0) == 0 ||
                               (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
                              (0 < DAT_00cc4b08)))) {
                            uVar9 = curl_easy_setopt(local_70,0x29,1);
                            uVar11 = uVar9 & 0xffffffff;
                            if ((0x30 < (uint)uVar9) ||
                               ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0)) goto LAB_009118dc;
                          }
                          puVar1 = (ulong *)(param_1 + 0xa82);
                          if (*(int *)puVar1 < 0) {
                            uVar9 = curl_easy_setopt(local_70,99,1);
                            uVar11 = uVar9 & 0xffffffff;
                            if ((0x30 < (uint)uVar9) ||
                               ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0)) goto LAB_009118dc;
                          }
                          uVar9 = curl_easy_setopt(local_70,0x51,*puVar1 >> 0x31 & 2);
                          uVar11 = uVar9 & 0xffffffff;
                          if (((uint)uVar9 < 0x31) &&
                             ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
                            uVar9 = curl_easy_setopt(local_70,0x40,*puVar1 >> 0x31 & 1);
                            uVar11 = uVar9 & 0xffffffff;
                            if (((uint)uVar9 < 0x31) &&
                               ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
                              uVar9 = curl_easy_setopt(local_70,0xe8,*puVar1 >> 0x33 & 1);
                              uVar11 = uVar9 & 0xffffffff;
                              if (((uint)uVar9 < 0x31) &&
                                 ((1L << (uVar9 & 0x3f) & 0x1000000000011U) != 0)) {
                                if ((*(byte *)(param_1 + 0x5f0) >> 1 & 1) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0xe9,1);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 0x768) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x2751);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 0x9a0) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x9d75);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 0x760) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x2771);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 0x788) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x27b9);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if ((*(byte *)(param_1 + 0x5f0) & 1) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0xac,1);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 0x5b8) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x4e8c);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 0x5c0) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x277d);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 600) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x4e7e);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 0x1c0) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x276f);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                if (*(long *)(param_1 + 0x950) != 0) {
                                  uVar9 = curl_easy_setopt(local_70,0x283a);
                                  uVar11 = uVar9 & 0xffffffff;
                                  if ((0x30 < (uint)uVar9) ||
                                     ((1L << (uVar9 & 0x3f) & 0x1000000000011U) == 0))
                                  goto LAB_009118dc;
                                }
                                curl_easy_setopt(local_70,0xd8,*(byte *)(param_1 + 0x5f0) >> 2);
                                *(undefined1 **)(local_70 + 0xa40) = &LAB_00912b10;
                                *(long *)(local_70 + 0xa48) = param_1;
                                *param_2 = local_70;
                                iVar5 = curl_multi_add_handle(param_6);
                                if (iVar5 == 0) {
                                  uVar11 = 0;
                                  goto LAB_009118e4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
LAB_009118dc:
  FUN_00946590(&local_70);
LAB_009118e4:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar11;
}

