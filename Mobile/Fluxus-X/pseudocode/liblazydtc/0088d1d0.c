/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088d1d0
 */

void FUN_0088d1d0(undefined8 *param_1,ulong param_2,uint param_3,uint param_4)

{
  int iVar1;
  uint uVar2;
  undefined4 uVar3;
  ulong uVar4;
  size_t sVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong *puVar9;
  long *plVar10;
  char *__s;
  
  do {
    if (0 < *(int *)((long)param_1 + 0xc)) {
      FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
    }
    if (((1 < *(int *)((long)param_1 + 0x14)) && (*(int *)(param_2 + 8) != DAT_00d1b0f0)) &&
       (*(int *)(param_2 + 8) != DAT_00d1b1e0)) {
      FUN_00875b54(*param_1,0x45,0,0,0);
    }
    if (param_1[0x2e] != 0) {
      uVar8 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
      uVar8 = (param_2 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
      uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x6b622cb0470b6a63 >>
              ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
      if ((*(ulong *)(param_1[0x2c] + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0) {
        do {
          puVar9 = (ulong *)(param_1[0x29] + uVar8 * 0x30);
          if (*puVar9 == param_2) {
            if ((int)puVar9[1] != 0) {
              FUN_0088d98c(param_1,param_2,puVar9 + 1,param_3);
              return;
            }
            break;
          }
          uVar8 = uVar8 + 1 & param_1[0x2d] - 1;
        } while ((*(ulong *)(param_1[0x2c] + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0);
      }
    }
    iVar1 = *(int *)(param_2 + 8);
    if ((param_2 == 0) || (iVar1 != DAT_00d1afc0)) {
      if (iVar1 == DAT_00d1afd0) {
        uVar7 = *param_1;
        uVar6 = 2;
        uVar2 = 0;
LAB_0088d874:
        FUN_00875b54(uVar7,uVar6,param_3,uVar2,0);
        return;
      }
      if ((param_2 != 0) && (iVar1 == DAT_00d1afe0)) {
        uVar7 = *param_1;
        uVar2 = (uint)*(byte *)(param_2 + 0x1c);
        uVar6 = 3;
        goto LAB_0088d874;
      }
      if ((param_2 == 0) || (iVar1 != DAT_00d1aff0)) {
        if ((param_2 == 0) || (iVar1 != DAT_00d1b000)) {
          if ((param_2 != 0) && (iVar1 == DAT_00d1b010)) {
            if ((((DAT_00d1ec40 != '\x01') ||
                 (plVar10 = (long *)(param_2 + 0x20), *(char *)(*plVar10 + 0x31) != '\x01')) ||
                (uVar8 = FUN_0088db44(param_1 + 0x18e,plVar10), (uVar8 & 1) != 0)) ||
               ((DAT_00d1f0a8 == '\x01' &&
                (uVar8 = FUN_0088dbf8(param_1 + 0x195,plVar10), (uVar8 & 1) != 0)))) {
              uVar2 = FUN_0088df20(param_1,param_2);
              if ((int)uVar2 < 0) {
                uVar2 = FUN_0088dd6c(param_1,*(undefined8 *)(param_2 + 0x20));
                uVar7 = *param_1;
                uVar6 = 9;
              }
              else {
                if ((uVar2 == (param_3 & 0xff)) && (*(int *)(param_1 + 1) != 0)) {
                  return;
                }
                uVar7 = *param_1;
                uVar6 = 6;
              }
              goto LAB_0088d874;
            }
            __s = *(char **)*plVar10;
            sVar5 = strlen(__s);
            uVar2 = FUN_00875070(*param_1,__s,sVar5);
            if ((int)uVar2 < 0) goto LAB_0088d97c;
            uVar8 = (ulong)uVar2;
            uVar2 = FUN_0088dca8(param_1,param_1 + 0x186);
            if ((int)uVar2 < 0) {
              uVar3 = FUN_0088dd6c(param_1,param_1 + 0x186);
              FUN_00875b54(*param_1,9,param_3,uVar3,0);
              uVar7 = *param_1;
              uVar3 = FUN_00877e08(__s,sVar5);
              uVar2 = param_3;
            }
            else {
              uVar7 = *param_1;
              uVar3 = FUN_00877e08(__s,sVar5);
            }
            FUN_00875b54(uVar7,0xf,param_3,uVar2,uVar3);
            goto LAB_0088d530;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b020)) {
            FUN_0088e034(param_1,param_2,param_3);
            return;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b030)) {
            if (0 < *(int *)((long)param_1 + 0xc)) {
              FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
            }
            uVar7 = *param_1;
            uVar6 = 0x3f;
            uVar2 = 2;
            goto LAB_0088d874;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b040)) {
            if (((param_4 & 1) == 0) || (*(int *)((long)param_1 + 0x64c) - 1U != (param_3 & 0xff)))
            {
              uVar7 = 0;
            }
            else {
              uVar7 = 1;
            }
            FUN_0088888c(param_1,param_2,param_3,1,uVar7,0);
            return;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b050)) {
            FUN_0088e1cc(param_1,param_2,param_3,param_4 & 1);
            return;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b060)) {
            FUN_0088e670(param_1,param_2,param_3);
            return;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b070)) {
            FUN_0088b9a0(param_1,param_2,param_3,0xff);
            return;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b080)) {
            FUN_0088ebf4(param_1,param_2,param_3,param_4 & 1,0xff);
            return;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b090)) {
            FUN_0088f7d0(param_1,param_2,param_3);
            return;
          }
          if ((param_2 != 0) && (iVar1 == DAT_00d1b0a0)) {
            FUN_0088f898(param_1,param_2,param_3,param_4 & 1);
            return;
          }
          if ((param_2 == 0) || (iVar1 != DAT_00d1b0b0)) {
            if ((param_2 != 0) && (iVar1 == DAT_00d1b0c0)) {
              FUN_00890298(param_1,param_2,param_3,param_4 & 1);
              return;
            }
            if ((param_2 != 0) && (iVar1 == DAT_00d1b0d0)) {
              FUN_008907f4(param_1,param_2,param_3,param_4 & 1);
              return;
            }
            if (param_2 == 0) {
              return;
            }
            if (iVar1 != DAT_00d1b0e0) {
              return;
            }
          }
          goto LAB_0088d238;
        }
        uVar4 = FUN_00875070(*param_1,*(undefined8 *)(param_2 + 0x20),
                             *(undefined8 *)(param_2 + 0x28));
        iVar1 = (int)uVar4;
      }
      else {
        uVar4 = FUN_00874f18(*(undefined8 *)(param_2 + 0x20),*param_1);
        iVar1 = (int)uVar4;
      }
      if (iVar1 < 0) {
LAB_0088d97c:
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
      }
      uVar8 = uVar4 & 0xffffffff;
      if ((uVar4 >> 0xf & 0x1ffff) == 0) {
        FUN_00875cac(*param_1,5,param_3,uVar8);
        return;
      }
      FUN_00875cac(*param_1,0x42,param_3,0);
LAB_0088d530:
      FUN_00875d18(*param_1,uVar8);
      return;
    }
LAB_0088d238:
    param_2 = *(ulong *)(param_2 + 0x20);
  } while( true );
}

