/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00892774
 */

void FUN_00892774(undefined8 *param_1,int *param_2,uint param_3,ulong param_4,long param_5)

{
  undefined1 uVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  undefined4 uVar5;
  long lVar6;
  uint uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined4 uVar10;
  long lVar11;
  
  if (0 < *(int *)((long)param_1 + 0xc)) {
    FUN_00876644(*param_1,param_2[8] + 1);
  }
  iVar4 = *param_2;
  if (2 < iVar4) {
    if (iVar4 < 5) {
      if (iVar4 == 3) {
        iVar4 = FUN_00875070(*param_1,*(undefined8 *)(param_2 + 4),*(undefined8 *)(param_2 + 6));
        if (iVar4 < 0) goto LAB_00892ba4;
        uVar8 = *param_1;
        iVar2 = param_2[1];
        uVar10 = 0xf;
        if ((param_4 & 1) != 0) {
          uVar10 = 0x10;
        }
        uVar5 = FUN_00877e08(*(undefined8 *)(param_2 + 4),*(undefined8 *)(param_2 + 6));
        FUN_00875b54(uVar8,uVar10,param_3,(char)iVar2,uVar5);
        FUN_00875d18(*param_1,iVar4);
        if ((param_5 != 0) && (*(int *)(param_5 + 8) == DAT_00d1b050)) {
          lVar6 = *(long *)(param_5 + 0x20);
          uVar1 = (undefined1)param_2[1];
          iVar4 = *(int *)(lVar6 + 8);
          if ((lVar6 == 0) || (iVar4 != DAT_00d1b010)) {
            lVar11 = lVar6;
            do {
              if ((iVar4 != DAT_00d1afc0) && (iVar4 != DAT_00d1b0b0)) {
                uVar8 = 4;
                uVar9 = 2;
                goto LAB_00892b8c;
              }
              lVar11 = *(long *)(lVar11 + 0x20);
              iVar4 = *(int *)(lVar11 + 8);
            } while ((lVar11 == 0) || (iVar4 != DAT_00d1b010));
          }
        }
      }
      else if (iVar4 == 4) {
        uVar10 = 0x11;
        if ((param_4 & 1) != 0) {
          uVar10 = 0x12;
        }
        FUN_00875b54(*param_1,uVar10,param_3,(char)param_2[1],*(undefined1 *)((long)param_2 + 7));
        if ((param_5 != 0) && (*(int *)(param_5 + 8) == DAT_00d1b060)) {
          lVar6 = *(long *)(param_5 + 0x20);
          uVar1 = (undefined1)param_2[1];
          iVar4 = *(int *)(lVar6 + 8);
          if ((lVar6 == 0) || (iVar4 != DAT_00d1b010)) {
            lVar11 = lVar6;
            do {
              if ((iVar4 != DAT_00d1afc0) && (iVar4 != DAT_00d1b0b0)) {
                uVar8 = 4;
                goto LAB_00892b78;
              }
              lVar11 = *(long *)(lVar11 + 0x20);
              iVar4 = *(int *)(lVar11 + 8);
            } while ((lVar11 == 0) || (iVar4 != DAT_00d1b010));
          }
        }
      }
    }
    else if (iVar4 == 5) {
      uVar10 = 0xd;
      if ((param_4 & 1) != 0) {
        uVar10 = 0xe;
      }
      FUN_00875b54(*param_1,uVar10,param_3,(char)param_2[1],*(undefined1 *)((long)param_2 + 6));
      if ((param_5 != 0) && (*(int *)(param_5 + 8) == DAT_00d1b060)) {
        lVar6 = *(long *)(param_5 + 0x20);
        iVar4 = *(int *)(lVar6 + 8);
        if ((lVar6 == 0) || (iVar4 != DAT_00d1b010)) {
          lVar11 = lVar6;
          do {
            if ((iVar4 != DAT_00d1afc0) && (iVar4 != DAT_00d1b0b0)) {
              FUN_008917fc(param_1,lVar6,(char)param_2[1],4,1);
              break;
            }
            lVar11 = *(long *)(lVar11 + 0x20);
            iVar4 = *(int *)(lVar11 + 8);
          } while ((lVar11 == 0) || (iVar4 != DAT_00d1b010));
        }
        lVar6 = *(long *)(param_5 + 0x28);
        uVar1 = *(undefined1 *)((long)param_2 + 6);
        iVar4 = *(int *)(lVar6 + 8);
        if ((lVar6 == 0) || (iVar4 != DAT_00d1b010)) {
          lVar11 = lVar6;
          do {
            if ((iVar4 != DAT_00d1afc0) && (iVar4 != DAT_00d1b0b0)) {
              uVar8 = 2;
LAB_00892b78:
              uVar9 = 1;
LAB_00892b8c:
              FUN_008917fc(param_1,lVar6,uVar1,uVar8,uVar9);
              return;
            }
            lVar11 = *(long *)(lVar11 + 0x20);
            iVar4 = *(int *)(lVar11 + 8);
          } while ((lVar11 == 0) || (iVar4 != DAT_00d1b010));
        }
      }
    }
    else if (iVar4 == 6) {
      uVar3 = FUN_008915e8(param_1,param_2 + 2,param_2 + 8);
      if (((param_4 & 1) != 0) && ((uVar3 >> 0x10 & 1) != 0)) {
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 8,"Attempt to assign static field of a class");
      }
      uVar10 = 0x5d;
      if ((param_4 & 1) != 0) {
        uVar10 = 0x5e;
      }
      FUN_00875b54(*param_1,uVar10,param_3,(char)param_2[1],uVar3 >> 8 & 0xffff);
      uVar8 = *param_1;
      uVar3 = uVar3 & 0xff;
      goto LAB_0089292c;
    }
    return;
  }
  if (iVar4 == 0) {
    uVar8 = *param_1;
    uVar7 = (uint)*(byte *)(param_2 + 1);
    uVar10 = 6;
    uVar3 = param_3;
    if ((param_4 & 1) != 0) goto LAB_00892ad4;
  }
  else {
    if (iVar4 != 1) {
      if (iVar4 != 2) {
        return;
      }
      uVar3 = FUN_00875070(*param_1,*(undefined8 *)(param_2 + 4),*(undefined8 *)(param_2 + 6));
      if (-1 < (int)uVar3) {
        uVar8 = *param_1;
        uVar10 = 7;
        if ((param_4 & 1) != 0) {
          uVar10 = 8;
        }
        uVar5 = FUN_00877e08(*(undefined8 *)(param_2 + 4),*(undefined8 *)(param_2 + 6));
        FUN_00875b54(uVar8,uVar10,param_3,0,uVar5);
        uVar8 = *param_1;
LAB_0089292c:
        FUN_00875d18(uVar8,uVar3);
        return;
      }
LAB_00892ba4:
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 8,"Exceeded constant limit; simplify the code to compile");
    }
    uVar8 = *param_1;
    uVar7 = (uint)*(byte *)((long)param_2 + 5);
    uVar10 = 9;
    if ((param_4 & 1) != 0) {
      uVar10 = 10;
    }
  }
  uVar3 = uVar7;
  uVar7 = param_3;
LAB_00892ad4:
  FUN_00875b54(uVar8,uVar10,uVar7,uVar3,0);
  return;
}

