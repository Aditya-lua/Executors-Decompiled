/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a6690
 */

ulong FUN_008a6690(long param_1,long *param_2,long *param_3,char *param_4,long *param_5,
                  undefined8 param_6,long *param_7)

{
  byte bVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  ulong uVar6;
  long *plVar7;
  long lVar8;
  ulong uVar9;
  char *__s1;
  undefined8 *puVar10;
  
  iVar3 = *(int *)(param_1 + 8);
  while ((param_1 == 0 || (iVar3 != DAT_00d1b240))) {
    if (iVar3 == DAT_00d1b250) {
      return 4;
    }
    if (iVar3 == DAT_00d1b260) {
      return 5;
    }
    if (iVar3 == DAT_00d1b290) {
      if (*(long *)(param_1 + 0x28) == 0) {
        return 0xf;
      }
      puVar10 = *(undefined8 **)(param_1 + 0x20);
      lVar8 = *(long *)(param_1 + 0x28) << 3;
      bVar1 = 0;
      uVar4 = 0x100;
      do {
        uVar2 = FUN_008a6690(*puVar10,param_2,param_3,param_4,param_5,param_6,param_7);
        if (uVar2 == 0) {
          bVar1 = 1;
        }
        else if (uVar4 == 0x100) {
          uVar4 = uVar2;
        }
        else if (uVar4 != uVar2) {
          return 0xf;
        }
        lVar8 = lVar8 + -8;
        puVar10 = puVar10 + 1;
      } while (lVar8 != 0);
      if (uVar4 == 0x100) {
        return 0xf;
      }
      uVar2 = 0x80;
      if (!(bool)(bVar1 & uVar4 != 0xf)) {
        uVar2 = 0;
      }
      return (ulong)(uVar2 | uVar4);
    }
    if (iVar3 == DAT_00d1b2a0) {
      return 0xf;
    }
    if (iVar3 != DAT_00d1b300) {
      if (iVar3 == DAT_00d1b280) {
        return 0;
      }
      if (iVar3 == DAT_00d1b2e0) {
        return 1;
      }
      uVar4 = 3;
      if (iVar3 != DAT_00d1b2f0) {
        uVar4 = 0xf;
      }
      return (ulong)uVar4;
    }
    param_1 = *(long *)(param_1 + 0x20);
    iVar3 = *(int *)(param_1 + 8);
  }
  if ((*(byte *)(param_1 + 0x28) & 1) != 0) {
    return 0xf;
  }
  __s1 = *(char **)(param_1 + 0x50);
  if (param_3[5] != 0) {
    uVar5 = ((ulong)__s1 >> 4 ^ (ulong)__s1 >> 9) * -0x61c8864680b583eb >>
            ((ulong)*(byte *)(param_3 + 6) & 0x3f);
    if ((*(ulong *)(param_3[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
      do {
        if (*(char **)(*param_3 + uVar5 * 0x10) == __s1) {
          plVar7 = (long *)(*param_3 + uVar5 * 0x10 + 8);
          lVar8 = *plVar7;
          if (lVar8 != 0) {
            if (param_7[5] != 0) {
              uVar5 = *(ulong *)(lVar8 + 0x20);
              uVar9 = (uVar5 >> 4 ^ uVar5 >> 9) * -0x61c8864680b583eb >>
                      ((ulong)*(byte *)(param_7 + 6) & 0x3f);
              if ((*(ulong *)(param_7[3] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
                do {
                  if (*(ulong *)(*param_7 + uVar9 * 8) == uVar5) {
                    return 0xf;
                  }
                  uVar9 = uVar9 + 1 & param_7[4] - 1U;
                } while ((*(ulong *)(param_7[3] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
              }
            }
            FUN_00864920(param_7);
            lVar8 = *plVar7;
            uVar5 = FUN_008a6690(*(undefined8 *)(lVar8 + 0x58),lVar8 + 0x38,param_3,param_4,param_5,
                                 param_6,param_7);
            if (param_7[5] == 0) {
              return uVar5;
            }
            uVar6 = *(ulong *)(param_1 + 0x50);
            uVar9 = (uVar6 >> 4 ^ uVar6 >> 9) * -0x61c8864680b583eb >>
                    ((ulong)*(byte *)(param_7 + 6) & 0x3f);
            if ((*(ulong *)(param_7[3] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) == 0) {
              return uVar5;
            }
            do {
              if (*(ulong *)(*param_7 + uVar9 * 8) == uVar6) {
                FUN_008a6fe4(param_7);
                return uVar5 & 0xffffffff;
              }
              uVar9 = uVar9 + 1 & param_7[4] - 1U;
            } while ((*(ulong *)(param_7[3] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
            return uVar5;
          }
          break;
        }
        uVar5 = uVar5 + 1 & param_3[4] - 1U;
      } while ((*(ulong *)(param_3[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
    }
  }
  if (param_2[1] != 0) {
    plVar7 = (long *)*param_2;
    lVar8 = param_2[1] << 3;
    do {
      if (*(char **)(*plVar7 + 0x20) == __s1) {
        return 0xf;
      }
      lVar8 = lVar8 + -8;
      plVar7 = plVar7 + 1;
    } while (lVar8 != 0);
  }
  if ((param_4 == (char *)0x0) || (__s1 == (char *)0x0)) {
    if (__s1 == (char *)0x0) goto LAB_008a6a8c;
  }
  else {
    iVar3 = strcmp(__s1,param_4);
    if (iVar3 == 0) {
      return 8;
    }
  }
  iVar3 = strcmp(__s1,"nil");
  if (iVar3 == 0) {
    return 0;
  }
  iVar3 = strcmp(__s1,"boolean");
  if (iVar3 == 0) {
    return 1;
  }
  iVar3 = strcmp(__s1,"number");
  if (iVar3 == 0) {
    return 2;
  }
  iVar3 = strcmp(__s1,"string");
  if (iVar3 == 0) {
    return 3;
  }
  iVar3 = strcmp(__s1,"thread");
  if (iVar3 == 0) {
    return 6;
  }
  iVar3 = strcmp(__s1,"buffer");
  if (iVar3 == 0) {
    return 9;
  }
  iVar3 = strcmp(__s1,"vector");
  if (iVar3 == 0) {
    return 8;
  }
  iVar3 = strcmp(__s1,"any");
  if (iVar3 == 0) {
    return 0xf;
  }
  iVar3 = strcmp(__s1,"unknown");
  if (iVar3 == 0) {
    return 0xf;
  }
LAB_008a6a8c:
  if (param_5[5] != 0) {
    uVar5 = ((ulong)__s1 >> 4 ^ (ulong)__s1 >> 9) * -0x61c8864680b583eb >>
            ((ulong)*(byte *)(param_5 + 6) & 0x3f);
    if ((*(ulong *)(param_5[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
      do {
        if (*(char **)(*param_5 + uVar5 * 0x10) == __s1) {
          lVar8 = *param_5 + uVar5 * 0x10;
          FUN_0087646c(param_6,*(undefined1 *)(lVar8 + 8));
          return (ulong)(*(byte *)(lVar8 + 8) + 0x40);
        }
        uVar5 = uVar5 + 1 & param_5[4] - 1U;
      } while ((*(ulong *)(param_5[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
      return 7;
    }
  }
  return 7;
}

