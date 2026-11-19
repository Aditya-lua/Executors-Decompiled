/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088f898
 */

void FUN_0088f898(undefined8 *param_1,ulong param_2,undefined4 param_3,uint param_4)

{
  uint uVar1;
  long *plVar2;
  uint uVar3;
  uint uVar4;
  undefined4 uVar5;
  undefined8 uVar6;
  long *__dest;
  void *pvVar7;
  long lVar8;
  long *plVar9;
  int iVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  long *__src;
  size_t __n;
  ulong unaff_x24;
  undefined8 uVar14;
  long *plVar15;
  int iVar16;
  long *plVar17;
  long lVar18;
  undefined8 *local_78;
  int local_70;
  long local_68;
  
  plVar2 = (long *)tpidr_el0;
  local_68 = plVar2[5];
  uVar3 = *(uint *)(param_2 + 0x1c);
  iVar16 = *(int *)((long)param_1 + 0x64c);
  local_78 = param_1;
  local_70 = iVar16;
  if ((int)uVar3 < 8) {
    if (uVar3 < 7) {
                    /* try { // try from 0088f8f0 to 0088f8f7 has its CatchHandler @ 00890228 */
      uVar3 = FUN_008932d0(param_1,*(undefined8 *)(param_2 + 0x28));
      if (uVar3 < 0x100) {
        unaff_x24 = *(ulong *)(param_2 + 0x20);
                    /* try { // try from 0088f908 to 0088f94f has its CatchHandler @ 0089025c */
        uVar4 = FUN_0088df20(param_1,unaff_x24);
        if ((int)uVar4 < 0) {
          iVar10 = *(int *)((long)param_1 + 0x64c);
          uVar4 = iVar10 + 1;
          plVar15 = plVar2;
          if (0xff < uVar4) {
LAB_00890124:
            if (plVar15[5] == local_68) {
                    /* try { // try from 00890134 to 0089014b has its CatchHandler @ 0089025c */
                    /* WARNING: Subroutine does not return */
              FUN_0087fcd8(unaff_x24 + 0xc,
                           "Out of registers when trying to allocate %d registers: exceeded limit %d"
                           ,1,0xff);
            }
            goto LAB_00890294;
          }
          *(uint *)((long)param_1 + 0x64c) = uVar4;
          uVar1 = *(uint *)(param_1 + 0xca);
          if (*(uint *)(param_1 + 0xca) <= uVar4) {
            uVar1 = uVar4;
          }
          *(uint *)(param_1 + 0xca) = uVar1;
          uVar4 = FUN_00891438(param_1,unaff_x24,iVar10,0xff);
        }
        if (*(uint *)(param_2 + 0x1c) < 7) {
          uVar5 = *(undefined4 *)(&DAT_003644fc + (ulong)*(uint *)(param_2 + 0x1c) * 4);
        }
        else {
          uVar5 = 0;
        }
                    /* try { // try from 0088fb20 to 0088fb2f has its CatchHandler @ 0089025c */
        FUN_00875b54(*param_1,uVar5,param_3,uVar4,uVar3);
        lVar8 = *(long *)(param_2 + 0x20);
        iVar10 = *(int *)(lVar8 + 8);
        if ((lVar8 == 0) || (iVar10 != DAT_00d1b010)) {
          lVar12 = lVar8;
          do {
            if ((iVar10 != DAT_00d1afc0) && (iVar10 != DAT_00d1b0b0)) {
                    /* try { // try from 0088fd78 to 0088fd8b has its CatchHandler @ 0089025c */
              FUN_008917fc(param_1,lVar8,uVar4 & 0xff,2,1);
              break;
            }
            lVar12 = *(long *)(lVar12 + 0x20);
            iVar10 = *(int *)(lVar12 + 8);
          } while ((lVar12 == 0) || (iVar10 != DAT_00d1b010));
        }
      }
      else {
        uVar3 = *(uint *)(param_2 + 0x1c);
        if ((uVar3 | 2) == 3) {
                    /* try { // try from 0088fa18 to 0088fa1f has its CatchHandler @ 0089021c */
          uVar3 = FUN_008932d0(param_1,*(undefined8 *)(param_2 + 0x20));
          if (uVar3 < 0x100) {
            lVar8 = *(long *)(param_2 + 0x28);
                    /* try { // try from 0088fa30 to 0088fa77 has its CatchHandler @ 00890218 */
            uVar4 = FUN_0088df20(param_1,lVar8);
            if ((int)uVar4 < 0) {
              iVar10 = *(int *)((long)param_1 + 0x64c);
              uVar4 = iVar10 + 1;
              if (0xff < uVar4) {
                if (plVar2[5] == local_68) {
                    /* try { // try from 008901d4 to 008901eb has its CatchHandler @ 00890218 */
                    /* WARNING: Subroutine does not return */
                  FUN_0087fcd8(lVar8 + 0xc,
                               "Out of registers when trying to allocate %d registers: exceeded limit %d"
                               ,1,0xff);
                }
                goto LAB_00890294;
              }
              *(uint *)((long)param_1 + 0x64c) = uVar4;
              uVar1 = *(uint *)(param_1 + 0xca);
              if (*(uint *)(param_1 + 0xca) <= uVar4) {
                uVar1 = uVar4;
              }
              *(uint *)(param_1 + 0xca) = uVar1;
              uVar4 = FUN_00891438(param_1,lVar8,iVar10,0xff);
            }
            uVar5 = 0x47;
            if (*(int *)(param_2 + 0x1c) != 1) {
              uVar5 = 0x48;
            }
                    /* try { // try from 0088fa90 to 0088fa9f has its CatchHandler @ 0089020c */
            FUN_00875b54(*param_1,uVar5,param_3,uVar3,uVar4);
            lVar8 = *(long *)(param_2 + 0x28);
            iVar10 = *(int *)(lVar8 + 8);
            if ((lVar8 == 0) || (iVar10 != DAT_00d1b010)) {
              lVar12 = lVar8;
              do {
                if ((iVar10 != DAT_00d1afc0) && (iVar10 != DAT_00d1b0b0)) {
                    /* try { // try from 0088fe60 to 0088fe73 has its CatchHandler @ 0089020c */
                  FUN_008917fc(param_1,lVar8,uVar4 & 0xff,2,1);
                  break;
                }
                lVar12 = *(long *)(lVar12 + 0x20);
                iVar10 = *(int *)(lVar12 + 8);
              } while ((lVar12 == 0) || (iVar10 != DAT_00d1b010));
            }
            goto LAB_00890058;
          }
        }
        else if (((1 < *(int *)(param_1 + 1)) && ((uVar3 | 2) == 2)) && (param_1[0x66] != 0)) {
          uVar11 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
          uVar11 = (param_2 >> 0x20 ^ uVar11 >> 0x2f ^ uVar11) * -0x622015f714c7d297;
          uVar11 = (uVar11 ^ uVar11 >> 0x2f) * -0x6b622cb0470b6a63 >>
                   ((ulong)*(byte *)(param_1 + 0x67) & 0x3f);
          if ((*(ulong *)(param_1[100] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0) {
            do {
              if (*(ulong *)(param_1[0x61] + uVar11 * 0x10) == param_2) {
                iVar10 = *(int *)(param_1[0x61] + uVar11 * 0x10 + 8);
                if ((iVar10 == 2) || ((iVar10 == 8 && (uVar3 == 2)))) {
                    /* try { // try from 0088fe9c to 0088fea3 has its CatchHandler @ 008901ec */
                  uVar3 = FUN_008932d0(param_1,*(undefined8 *)(param_2 + 0x20));
                  if (uVar3 < 0x100) {
                    /* try { // try from 00890090 to 008900e3 has its CatchHandler @ 008901f0 */
                    uVar4 = FUN_00891514(param_1,*(undefined8 *)(param_2 + 0x28),&local_78);
                    uVar14 = *param_1;
                    uVar5 = FUN_008933c4(param_1,*(undefined4 *)(param_2 + 0x1c),1);
                    FUN_00875b54(uVar14,uVar5,param_3,uVar4,uVar3);
                    FUN_00891590(param_1,*(undefined8 *)(param_2 + 0x28),uVar4 & 0xff,2,1);
                    param_1 = local_78;
                    iVar16 = local_70;
                    goto LAB_00890058;
                  }
                }
                break;
              }
              uVar11 = uVar11 + 1 & param_1[0x65] - 1;
            } while ((*(ulong *)(param_1[100] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0);
          }
        }
        lVar8 = *(long *)(param_2 + 0x20);
                    /* try { // try from 0088feb4 to 0088fefb has its CatchHandler @ 00890224 */
        uVar3 = FUN_0088df20(param_1,lVar8);
        if ((int)uVar3 < 0) {
          iVar10 = *(int *)((long)param_1 + 0x64c);
          uVar3 = iVar10 + 1;
          if (0xff < uVar3) {
            if (plVar2[5] == local_68) {
                    /* try { // try from 00890184 to 0089019b has its CatchHandler @ 00890224 */
                    /* WARNING: Subroutine does not return */
              FUN_0087fcd8(lVar8 + 0xc,
                           "Out of registers when trying to allocate %d registers: exceeded limit %d"
                           ,1,0xff);
            }
            goto LAB_00890294;
          }
          *(uint *)((long)param_1 + 0x64c) = uVar3;
          uVar4 = *(uint *)(param_1 + 0xca);
          if (*(uint *)(param_1 + 0xca) <= uVar3) {
            uVar4 = uVar3;
          }
          *(uint *)(param_1 + 0xca) = uVar4;
          uVar3 = FUN_00891438(param_1,lVar8,iVar10,0xff);
        }
        lVar8 = *(long *)(param_2 + 0x28);
                    /* try { // try from 0088ff04 to 00890057 has its CatchHandler @ 0089022c */
        uVar4 = FUN_0088df20(param_1,lVar8);
        if ((int)uVar4 < 0) {
          iVar10 = *(int *)((long)param_1 + 0x64c);
          uVar4 = iVar10 + 1;
          if (0xff < uVar4) {
            if (plVar2[5] == local_68) {
                    /* try { // try from 008901ac to 008901c3 has its CatchHandler @ 0089022c */
                    /* WARNING: Subroutine does not return */
              FUN_0087fcd8(lVar8 + 0xc,
                           "Out of registers when trying to allocate %d registers: exceeded limit %d"
                           ,1,0xff);
            }
            goto LAB_00890294;
          }
          *(uint *)((long)param_1 + 0x64c) = uVar4;
          uVar1 = *(uint *)(param_1 + 0xca);
          if (*(uint *)(param_1 + 0xca) <= uVar4) {
            uVar1 = uVar4;
          }
          *(uint *)(param_1 + 0xca) = uVar1;
          uVar4 = FUN_00891438(param_1,lVar8,iVar10,0xff);
        }
        if (*(uint *)(param_2 + 0x1c) < 7) {
          uVar5 = *(undefined4 *)(&DAT_00364518 + (ulong)*(uint *)(param_2 + 0x1c) * 4);
        }
        else {
          uVar5 = 0;
        }
        FUN_00875b54(*param_1,uVar5,param_3,uVar3,uVar4);
        lVar8 = *(long *)(param_2 + 0x20);
        iVar10 = *(int *)(lVar8 + 8);
        if ((lVar8 == 0) || (iVar10 != DAT_00d1b010)) {
          lVar12 = lVar8;
          do {
            if ((iVar10 != DAT_00d1afc0) && (iVar10 != DAT_00d1b0b0)) {
              FUN_008917fc(param_1,lVar8,uVar3 & 0xff,2,1);
              break;
            }
            lVar12 = *(long *)(lVar12 + 0x20);
            iVar10 = *(int *)(lVar12 + 8);
          } while ((lVar12 == 0) || (iVar10 != DAT_00d1b010));
        }
        lVar8 = *(long *)(param_2 + 0x28);
        iVar10 = *(int *)(lVar8 + 8);
        if ((lVar8 == 0) || (iVar10 != DAT_00d1b010)) {
          lVar12 = lVar8;
          do {
            if ((iVar10 != DAT_00d1afc0) && (iVar10 != DAT_00d1b0b0)) {
              FUN_008917fc(param_1,lVar8,uVar4 & 0xff,2,1);
              break;
            }
            lVar12 = *(long *)(lVar12 + 0x20);
            iVar10 = *(int *)(lVar12 + 8);
          } while ((lVar12 == 0) || (iVar10 != DAT_00d1b010));
        }
      }
    }
    else if (uVar3 == 7) {
      lVar8 = *(long *)(param_2 + 0x28);
      lVar18 = *(long *)(param_2 + 0x28);
      lVar12 = *(long *)(param_2 + 0x20);
                    /* try { // try from 0088fba0 to 0088fbab has its CatchHandler @ 00890204 */
      __dest = operator_new(0x10);
      plVar9 = __dest + 2;
      __dest[1] = lVar18;
      *__dest = lVar12;
      plVar15 = plVar9;
      if ((lVar8 == 0) || (iVar10 = *(int *)(lVar8 + 8), iVar10 != DAT_00d1b0a0)) {
        iVar10 = iVar16;
      }
      else {
        plVar17 = __dest + 1;
        __src = __dest;
        while (__dest = __src, *(int *)(lVar8 + 0x1c) == 7) {
          *plVar17 = *(long *)(lVar8 + 0x20);
          if (plVar9 < plVar15) {
            *plVar9 = *(long *)(lVar8 + 0x28);
            plVar17 = plVar9;
          }
          else {
            __n = (long)plVar9 - (long)__src;
            uVar11 = ((long)__n >> 3) + 1;
            if (uVar11 >> 0x3d != 0) {
              if (plVar2[5] != local_68) goto LAB_00890294;
              FUN_0086f7dc();
              goto LAB_00890124;
            }
            unaff_x24 = (long)plVar15 - (long)__src;
            uVar13 = (long)unaff_x24 >> 2;
            if ((ulong)((long)unaff_x24 >> 2) <= uVar11) {
              uVar13 = uVar11;
            }
            if (0x7ffffffffffffff7 < unaff_x24) {
              uVar13 = 0x1fffffffffffffff;
            }
            if (uVar13 >> 0x3d != 0) {
              if (plVar2[5] == local_68) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00890104 to 00890123 has its CatchHandler @ 00890230 */
                FUN_007fe1b8();
              }
              goto LAB_00890294;
            }
                    /* try { // try from 0088fc50 to 0088fc53 has its CatchHandler @ 00890220 */
            pvVar7 = operator_new(uVar13 << 3);
            plVar17 = (long *)((long)pvVar7 + __n);
            __dest = plVar17 + -((long)__n >> 3);
            *plVar17 = *(long *)(lVar8 + 0x28);
            memcpy(__dest,__src,__n);
            plVar15 = (long *)((long)pvVar7 + uVar13 * 8);
            operator_delete(__src,unaff_x24);
            iVar10 = DAT_00d1b0a0;
          }
          plVar9 = plVar17 + 1;
          lVar8 = *plVar17;
          if ((lVar8 == 0) || (__src = __dest, *(int *)(lVar8 + 8) != iVar10)) break;
        }
        iVar10 = *(int *)((long)param_1 + 0x64c);
      }
      uVar11 = (long)plVar9 - (long)__dest >> 3;
      uVar3 = iVar10 + (int)uVar11;
      if (0xff < uVar3) {
        if (plVar2[5] == local_68) {
                    /* try { // try from 00890160 to 00890173 has its CatchHandler @ 00890210 */
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,
                       "Out of registers when trying to allocate %d registers: exceeded limit %d",
                       uVar11,0xff);
        }
        goto LAB_00890294;
      }
      *(uint *)((long)param_1 + 0x64c) = uVar3;
      uVar4 = *(uint *)(param_1 + 0xca);
      if (*(uint *)(param_1 + 0xca) <= uVar3) {
        uVar4 = uVar3;
      }
      *(uint *)(param_1 + 0xca) = uVar4;
      if (plVar9 != __dest) {
        uVar13 = 0;
        if (uVar11 < 2) {
          uVar11 = 1;
        }
        do {
          lVar8 = __dest[uVar13];
          uVar3 = (int)uVar13 + iVar10;
          if (DAT_00d1f068 == '\x01') {
            uVar5 = *(undefined4 *)((long)param_1 + 0x64c);
            *(uint *)((long)param_1 + 0x64c) = (uVar3 & 0xff) + 1;
                    /* try { // try from 0088fe18 to 0088fe23 has its CatchHandler @ 00890240 */
            FUN_0088d1d0(param_1,lVar8,uVar3,1);
            *(undefined4 *)((long)param_1 + 0x64c) = uVar5;
          }
          else {
                    /* try { // try from 0088fddc to 0088fde7 has its CatchHandler @ 00890234 */
            FUN_0088d1d0(param_1,lVar8,uVar3,1);
          }
          uVar13 = uVar13 + 1;
        } while (uVar11 != uVar13);
      }
                    /* try { // try from 0088fe3c to 0088fe4b has its CatchHandler @ 00890210 */
      FUN_00875b54(*param_1,0x31,param_3,iVar10,
                   iVar10 + (int)((ulong)((long)plVar9 - (long)__dest) >> 3) + -1);
      operator_delete(__dest,(long)plVar15 - (long)__dest);
    }
  }
  else if (uVar3 - 8 < 6) {
                    /* try { // try from 0088f980 to 0088f9ab has its CatchHandler @ 00890260 */
    uVar14 = FUN_00893480(param_1,param_2,0);
    FUN_00875b54(*param_1,3,param_3,0,1);
                    /* try { // try from 0088f9b0 to 0088fa03 has its CatchHandler @ 00890264 */
    uVar6 = FUN_00875ec8(*param_1);
    FUN_00875b54(*param_1,3,param_3,1,0);
    uVar11 = FUN_00875ed8(*param_1,uVar14,uVar6);
    if ((uVar11 & 1) == 0) {
      if (plVar2[5] == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
      }
      goto LAB_00890294;
    }
  }
  else if (uVar3 - 0xe < 2) {
                    /* try { // try from 0088fb04 to 0088fb17 has its CatchHandler @ 00890214 */
    FUN_00893a04(param_1,param_2,param_3,param_4 & 1);
  }
LAB_00890058:
  *(int *)((long)param_1 + 0x64c) = iVar16;
  if (plVar2[5] == local_68) {
    return;
  }
LAB_00890294:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

