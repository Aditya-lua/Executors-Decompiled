/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088e1cc
 */

void FUN_0088e1cc(undefined8 *param_1,long param_2,int param_3,ulong param_4)

{
  undefined4 uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  undefined4 uVar5;
  size_t sVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  char *pcVar10;
  undefined8 uVar11;
  long lVar12;
  
  if (0 < *(int *)((long)param_1 + 0xc)) {
    FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
  }
  lVar7 = *(long *)(param_2 + 0x20);
  if ((lVar7 == 0) || (*(int *)(lVar7 + 8) != DAT_00d1b050)) {
    if (*(int *)(lVar7 + 8) == DAT_00d1b020) {
      lVar12 = 0;
      lVar9 = lVar7;
      lVar7 = param_2;
      goto LAB_0088e278;
    }
  }
  else {
    lVar9 = *(long *)(lVar7 + 0x20);
    lVar12 = param_2;
    if (*(int *)(*(long *)(lVar7 + 0x20) + 8) == DAT_00d1b020) {
LAB_0088e278:
      if (0 < *(int *)(param_1 + 1)) {
        pcVar10 = *(char **)(lVar9 + 0x20);
        if (param_1[0x20] != 0) {
          uVar8 = ((ulong)pcVar10 >> 4 ^ (ulong)pcVar10 >> 9) * -0x61c8864680b583eb >>
                  ((ulong)*(byte *)(param_1 + 0x21) & 0x3f);
          if ((*(ulong *)(param_1[0x1e] + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0) {
            do {
              if (*(char **)(param_1[0x1b] + uVar8 * 0x10) == pcVar10) {
                if (*(int *)(param_1[0x1b] + uVar8 * 0x10 + 8) != 0) goto LAB_0088e404;
                break;
              }
              uVar8 = uVar8 + 1 & param_1[0x1f] - 1;
            } while ((*(ulong *)(param_1[0x1e] + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0);
          }
        }
        if ((DAT_00d1ec80 == '\x01') &&
           (((*(byte *)(lVar7 + 0x49) & 1) != 0 ||
            ((lVar12 != 0 && (*(char *)(lVar12 + 0x49) == '\x01')))))) {
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,"Attempt to access private field of a global");
        }
        uVar11 = *param_1;
        sVar6 = strlen(pcVar10);
        uVar2 = FUN_00875070(uVar11,pcVar10,sVar6);
        pcVar10 = *(char **)(lVar7 + 0x28);
        uVar11 = *param_1;
        sVar6 = strlen(pcVar10);
        uVar3 = FUN_00875070(uVar11,pcVar10,sVar6);
        if (lVar12 == 0) {
          iVar4 = -1;
        }
        else {
          pcVar10 = *(char **)(lVar12 + 0x28);
          uVar11 = *param_1;
          sVar6 = strlen(pcVar10);
          iVar4 = FUN_00875070(uVar11,pcVar10,sVar6);
        }
        if (((int)(uVar3 | uVar2) < 0) || (lVar12 != 0 && iVar4 < 0)) {
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
        }
        if ((((int)uVar2 < 0x400) && ((int)uVar3 < 0x400)) && (iVar4 < 0x400)) {
          if (lVar12 == 0) {
            uVar1 = FUN_00877de4(uVar2,uVar3);
          }
          else {
            uVar1 = FUN_00877df4();
          }
          uVar8 = FUN_0087515c(*param_1,uVar1);
          if ((uVar8 >> 0xf & 0x1ffff) == 0) {
            FUN_00875cac(*param_1,0xc,param_3,uVar8 & 0xffffffff);
            FUN_00875d18(*param_1,uVar1);
            return;
          }
        }
      }
    }
  }
LAB_0088e404:
  uVar1 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 0088e40c to 0088e46f has its CatchHandler @ 0088e660 */
  uVar2 = FUN_0088df20(param_1,*(undefined8 *)(param_2 + 0x20));
  if ((int)uVar2 < 0) {
    lVar7 = *(long *)(param_2 + 0x20);
    iVar4 = param_3;
    if ((param_4 & 1) == 0) {
      uVar2 = FUN_0088df20(param_1,lVar7,param_3);
      if (-1 < (int)uVar2) goto LAB_0088e474;
      iVar4 = *(int *)((long)param_1 + 0x64c);
      uVar2 = iVar4 + 1;
      if (0xff < uVar2) {
                    /* try { // try from 0088e640 to 0088e657 has its CatchHandler @ 0088e660 */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(lVar7 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                     0xff);
      }
      *(uint *)((long)param_1 + 0x64c) = uVar2;
      uVar3 = *(uint *)(param_1 + 0xca);
      if (*(uint *)(param_1 + 0xca) <= uVar2) {
        uVar3 = uVar2;
      }
      *(uint *)(param_1 + 0xca) = uVar3;
    }
    uVar2 = FUN_00891438(param_1,lVar7,iVar4,0xff);
  }
LAB_0088e474:
  if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 0088e488 to 0088e4e7 has its CatchHandler @ 0088e658 */
    FUN_00876644(*param_1,*(int *)(param_2 + 0x30) + 1);
  }
  if ((DAT_00d1ec80 == '\x01') && (*(char *)(param_2 + 0x49) == '\x01')) {
    uVar3 = FUN_008915e8(param_1,param_2 + 0x28,param_2 + 0xc);
    FUN_00875b54(*param_1,0x5d,param_3,uVar2,uVar3 >> 8 & 0xffff);
    FUN_00875d18(*param_1,uVar3 >> 8 & 0x100 | uVar3 & 0xff);
  }
  else {
    pcVar10 = *(char **)(param_2 + 0x28);
    sVar6 = strlen(pcVar10);
                    /* try { // try from 0088e500 to 0088e5b7 has its CatchHandler @ 0088e668 */
    iVar4 = FUN_00875070(*param_1,pcVar10,sVar6);
    if (iVar4 < 0) {
                    /* try { // try from 0088e610 to 0088e61f has its CatchHandler @ 0088e668 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
    }
    uVar11 = *param_1;
    uVar5 = FUN_00877e08(pcVar10,sVar6);
    FUN_00875b54(uVar11,0xf,param_3,uVar2,uVar5);
    FUN_00875d18(*param_1,iVar4);
    lVar7 = *(long *)(param_2 + 0x20);
    iVar4 = *(int *)(lVar7 + 8);
    if ((lVar7 == 0) || (iVar4 != DAT_00d1b010)) {
      lVar9 = lVar7;
      do {
        if ((iVar4 != DAT_00d1afc0) && (iVar4 != DAT_00d1b0b0)) {
          FUN_008917fc(param_1,lVar7,uVar2 & 0xff,4,2);
          break;
        }
        lVar9 = *(long *)(lVar9 + 0x20);
        iVar4 = *(int *)(lVar9 + 8);
      } while ((lVar9 == 0) || (iVar4 != DAT_00d1b010));
    }
  }
  *(undefined4 *)((long)param_1 + 0x64c) = uVar1;
  return;
}

