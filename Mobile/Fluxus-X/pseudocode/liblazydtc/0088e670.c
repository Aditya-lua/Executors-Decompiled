/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088e670
 */

void FUN_0088e670(undefined8 *param_1,long param_2,undefined4 param_3)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  bool bVar7;
  int iVar8;
  undefined4 uVar9;
  uint uVar10;
  uint uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong *puVar14;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  double dVar18;
  
  uVar2 = *(undefined4 *)((long)param_1 + 0x64c);
  if (param_1[0x2e] != 0) {
    uVar12 = *(ulong *)(param_2 + 0x28);
    uVar13 = ((ulong)(uint)((int)uVar12 << 3) + 8 ^ uVar12 >> 0x20) * -0x622015f714c7d297;
    uVar13 = (uVar12 >> 0x20 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
    uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
      do {
        puVar14 = (ulong *)(param_1[0x29] + uVar13 * 0x30);
        if (*puVar14 == uVar12) {
          dVar18 = (double)puVar14[2];
          bVar4 = true;
          bVar7 = false;
          if ((int)puVar14[1] == 3) {
            bVar4 = false;
            bVar7 = true;
            if (!NAN(dVar18)) {
              bVar4 = dVar18 < 1.0;
              bVar7 = false;
            }
          }
          bVar5 = false;
          bVar6 = true;
          if (bVar4 == bVar7) {
            bVar5 = false;
            bVar6 = true;
            if (!NAN(dVar18)) {
              bVar5 = dVar18 == 256.0;
              bVar6 = 256.0 <= dVar18;
            }
          }
          if (bVar6 && !bVar5) {
            if ((int)puVar14[1] == 6) {
              uVar9 = *(undefined4 *)((long)puVar14 + 0xc);
                    /* try { // try from 0088e780 to 0088e78b has its CatchHandler @ 0088ebcc */
              iVar8 = FUN_00875070(*param_1,dVar18,uVar9);
              if (iVar8 < 0) {
                    /* try { // try from 0088eb8c to 0088eb9b has its CatchHandler @ 0088ebcc */
                    /* WARNING: Subroutine does not return */
                FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
              }
              lVar16 = *(long *)(param_2 + 0x20);
                    /* try { // try from 0088e798 to 0088e837 has its CatchHandler @ 0088ebdc */
              uVar10 = FUN_0088df20(param_1,lVar16);
              if ((int)uVar10 < 0) {
                iVar3 = *(int *)((long)param_1 + 0x64c);
                uVar10 = iVar3 + 1;
                if (0xff < uVar10) {
                    /* try { // try from 0088ebb4 to 0088ebcb has its CatchHandler @ 0088ebdc */
                    /* WARNING: Subroutine does not return */
                  FUN_0087fcd8(lVar16 + 0xc,
                               "Out of registers when trying to allocate %d registers: exceeded limit %d"
                               ,1,0xff);
                }
                *(uint *)((long)param_1 + 0x64c) = uVar10;
                uVar11 = *(uint *)(param_1 + 0xca);
                if (*(uint *)(param_1 + 0xca) <= uVar10) {
                  uVar11 = uVar10;
                }
                *(uint *)(param_1 + 0xca) = uVar11;
                uVar10 = FUN_00891438(param_1,lVar16,iVar3,0xff);
              }
              if (0 < *(int *)((long)param_1 + 0xc)) {
                FUN_00876644(*param_1,*(int *)(*(long *)(param_2 + 0x28) + 0xc) + 1);
              }
              uVar17 = *param_1;
              uVar9 = FUN_00877e08(dVar18,uVar9);
              FUN_00875b54(uVar17,0xf,param_3,uVar10,uVar9);
              FUN_00875d18(*param_1,iVar8);
              lVar16 = *(long *)(param_2 + 0x20);
              iVar8 = *(int *)(lVar16 + 8);
              if ((lVar16 != 0) && (iVar8 == DAT_00d1b010)) goto LAB_0088eb0c;
              lVar15 = lVar16;
              goto LAB_0088e868;
            }
          }
          else if (dVar18 == (double)(int)dVar18) {
            lVar16 = *(long *)(param_2 + 0x20);
                    /* try { // try from 0088e8a4 to 0088e927 has its CatchHandler @ 0088ebd4 */
            uVar10 = FUN_0088df20(param_1,lVar16);
            if ((int)uVar10 < 0) {
              iVar8 = *(int *)((long)param_1 + 0x64c);
              uVar10 = iVar8 + 1;
              if (0xff < uVar10) {
                    /* try { // try from 0088eb9c to 0088ebb3 has its CatchHandler @ 0088ebd4 */
                    /* WARNING: Subroutine does not return */
                FUN_0087fcd8(lVar16 + 0xc,
                             "Out of registers when trying to allocate %d registers: exceeded limit %d"
                             ,1,0xff);
              }
              *(uint *)((long)param_1 + 0x64c) = uVar10;
              uVar11 = *(uint *)(param_1 + 0xca);
              if (*(uint *)(param_1 + 0xca) <= uVar10) {
                uVar11 = uVar10;
              }
              *(uint *)(param_1 + 0xca) = uVar11;
              uVar10 = FUN_00891438(param_1,lVar16,iVar8,0xff);
            }
            if (0 < *(int *)((long)param_1 + 0xc)) {
              FUN_00876644(*param_1,*(int *)(*(long *)(param_2 + 0x28) + 0xc) + 1);
            }
            FUN_00875b54(*param_1,0x11,param_3,uVar10,(int)dVar18 + -1);
            lVar16 = *(long *)(param_2 + 0x20);
            iVar8 = *(int *)(lVar16 + 8);
            if ((lVar16 != 0) && (iVar8 == DAT_00d1b010)) goto LAB_0088eb0c;
            lVar15 = lVar16;
            goto LAB_0088e958;
          }
          break;
        }
        uVar13 = uVar13 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
    }
  }
  lVar16 = *(long *)(param_2 + 0x20);
                    /* try { // try from 0088e984 to 0088e9cb has its CatchHandler @ 0088ebe4 */
  uVar10 = FUN_0088df20(param_1,lVar16);
  if ((int)uVar10 < 0) {
    iVar8 = *(int *)((long)param_1 + 0x64c);
    uVar10 = iVar8 + 1;
    if (0xff < uVar10) {
                    /* try { // try from 0088eb5c to 0088eb73 has its CatchHandler @ 0088ebe4 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(lVar16 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                  );
    }
    *(uint *)((long)param_1 + 0x64c) = uVar10;
    uVar11 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar10) {
      uVar11 = uVar10;
    }
    *(uint *)(param_1 + 0xca) = uVar11;
    uVar10 = FUN_00891438(param_1,lVar16,iVar8,0xff);
  }
  lVar16 = *(long *)(param_2 + 0x28);
                    /* try { // try from 0088e9d4 to 0088eb0b has its CatchHandler @ 0088ebec */
  uVar11 = FUN_0088df20(param_1,lVar16);
  if ((int)uVar11 < 0) {
    iVar8 = *(int *)((long)param_1 + 0x64c);
    uVar11 = iVar8 + 1;
    if (0xff < uVar11) {
                    /* try { // try from 0088eb74 to 0088eb8b has its CatchHandler @ 0088ebec */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(lVar16 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                  );
    }
    *(uint *)((long)param_1 + 0x64c) = uVar11;
    uVar1 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar11) {
      uVar1 = uVar11;
    }
    *(uint *)(param_1 + 0xca) = uVar1;
    uVar11 = FUN_00891438(param_1,lVar16,iVar8,0xff);
  }
  FUN_00875b54(*param_1,0xd,param_3,uVar10,uVar11);
  lVar16 = *(long *)(param_2 + 0x20);
  iVar8 = *(int *)(lVar16 + 8);
  if ((lVar16 == 0) || (iVar8 != DAT_00d1b010)) {
    lVar15 = lVar16;
    do {
      if ((iVar8 != DAT_00d1afc0) && (iVar8 != DAT_00d1b0b0)) {
        FUN_008917fc(param_1,lVar16,uVar10 & 0xff,4,1);
        break;
      }
      lVar15 = *(long *)(lVar15 + 0x20);
      iVar8 = *(int *)(lVar15 + 8);
    } while ((lVar15 == 0) || (iVar8 != DAT_00d1b010));
  }
  lVar16 = *(long *)(param_2 + 0x28);
  iVar8 = *(int *)(lVar16 + 8);
  if ((lVar16 == 0) || (iVar8 != DAT_00d1b010)) {
    lVar15 = lVar16;
    do {
      if ((iVar8 != DAT_00d1afc0) && (iVar8 != DAT_00d1b0b0)) {
        FUN_008917fc(param_1,lVar16,uVar11 & 0xff,2,1);
        break;
      }
      lVar15 = *(long *)(lVar15 + 0x20);
      iVar8 = *(int *)(lVar15 + 8);
    } while ((lVar15 == 0) || (iVar8 != DAT_00d1b010));
  }
LAB_0088eb0c:
  *(undefined4 *)((long)param_1 + 0x64c) = uVar2;
  return;
  while( true ) {
    lVar15 = *(long *)(lVar15 + 0x20);
    iVar8 = *(int *)(lVar15 + 8);
    if ((lVar15 != 0) && (iVar8 == DAT_00d1b010)) break;
LAB_0088e868:
    if ((iVar8 != DAT_00d1afc0) && (iVar8 != DAT_00d1b0b0)) {
                    /* try { // try from 0088eb44 to 0088eb57 has its CatchHandler @ 0088ebdc */
      FUN_008917fc(param_1,lVar16,uVar10 & 0xff,4,2);
      break;
    }
  }
  goto LAB_0088eb0c;
  while( true ) {
    lVar15 = *(long *)(lVar15 + 0x20);
    iVar8 = *(int *)(lVar15 + 8);
    if ((lVar15 != 0) && (iVar8 == DAT_00d1b010)) break;
LAB_0088e958:
    if ((iVar8 != DAT_00d1afc0) && (iVar8 != DAT_00d1b0b0)) {
                    /* try { // try from 0088eb2c to 0088eb3f has its CatchHandler @ 0088ebd4 */
      FUN_008917fc(param_1,lVar16,uVar10 & 0xff,4,1);
      break;
    }
  }
  goto LAB_0088eb0c;
}

