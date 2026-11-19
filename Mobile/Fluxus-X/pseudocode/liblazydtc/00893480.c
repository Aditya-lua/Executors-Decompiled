/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00893480
 */

undefined8 FUN_00893480(undefined8 *param_1,long param_2,byte param_3)

{
  ulong *puVar1;
  long lVar2;
  undefined4 uVar3;
  int iVar4;
  ulong uVar5;
  bool bVar6;
  bool bVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  ulong *puVar11;
  undefined8 uVar12;
  undefined4 uVar13;
  ulong uVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  undefined4 uVar20;
  undefined8 uVar21;
  
  uVar15 = *(ulong *)(param_2 + 0x20);
  uVar19 = *(ulong *)(param_2 + 0x28);
  uVar8 = *(uint *)(param_2 + 0x1c);
  if (param_1[0x2e] == 0) {
    bVar6 = true;
    bVar7 = (uVar8 & 0xfffffffe) != 8;
  }
  else {
    uVar14 = ((ulong)(uint)((int)uVar19 << 3) + 8 ^ uVar19 >> 0x20) * -0x622015f714c7d297;
    uVar14 = (uVar19 >> 0x20 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
    uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    lVar2 = param_1[0x2c];
    uVar17 = param_1[0x2d] - 1;
    lVar16 = param_1[0x29];
    if ((*(ulong *)(lVar2 + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0) {
      uVar18 = uVar14;
      do {
        puVar11 = (ulong *)(lVar16 + uVar18 * 0x30);
        if (*puVar11 == uVar19) {
          iVar4 = (int)puVar11[1];
          bVar7 = (uVar8 & 0xfffffffe) != 8;
          uVar18 = uVar15;
          uVar5 = uVar19;
          if ((bVar7) || (iVar4 != 0)) goto joined_r0x00893610;
          goto LAB_00893598;
        }
        uVar18 = uVar18 + 1 & uVar17;
      } while ((*(ulong *)(lVar2 + (uVar18 >> 6) * 8) >> (uVar18 & 0x3f) & 1) != 0);
    }
    if ((uVar8 & 0xfffffffe) == 8) {
LAB_00893598:
      uVar14 = ((ulong)(uint)((int)uVar15 << 3) + 8 ^ uVar15 >> 0x20) * -0x622015f714c7d297;
      uVar14 = (uVar15 >> 0x20 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
      uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
               ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
      if ((*(ulong *)(lVar2 + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) == 0) {
LAB_00893604:
        bVar7 = false;
        bVar6 = true;
      }
      else {
        uVar18 = uVar14;
LAB_008935dc:
        puVar11 = (ulong *)(lVar16 + uVar18 * 0x30);
        if (*puVar11 != uVar15) goto code_r0x008935ec;
        iVar4 = (int)puVar11[1];
        bVar7 = false;
        uVar18 = uVar19;
        uVar5 = uVar15;
joined_r0x00893610:
        if (iVar4 == 0) {
          bVar6 = true;
          goto LAB_00893680;
        }
        do {
          puVar11 = (ulong *)(lVar16 + uVar14 * 0x30);
          if (*puVar11 == uVar5) {
            bVar6 = (puVar11[1] & 0xfffffffe) == 4;
            goto LAB_0089367c;
          }
          uVar14 = uVar14 + 1 & uVar17;
        } while ((*(ulong *)(lVar2 + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0);
        bVar6 = false;
LAB_0089367c:
        uVar19 = uVar5;
        uVar15 = uVar18;
      }
    }
    else {
      bVar7 = true;
      bVar6 = true;
    }
  }
LAB_00893680:
  uVar3 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 00893684 to 008936ff has its CatchHandler @ 008939fc */
  uVar8 = FUN_0088df20(param_1,uVar15);
  if ((int)uVar8 < 0) {
    iVar4 = *(int *)((long)param_1 + 0x64c);
    uVar8 = iVar4 + 1;
    if (0xff < uVar8) {
                    /* try { // try from 0089399c to 008939b3 has its CatchHandler @ 008939fc */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(uVar15 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                  );
    }
    *(uint *)((long)param_1 + 0x64c) = uVar8;
    uVar10 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar8) {
      uVar10 = uVar8;
    }
    *(uint *)(param_1 + 0xca) = uVar10;
    uVar8 = FUN_00891438(param_1,uVar15,iVar4,0xff);
    if (!bVar7 && !bVar6) goto LAB_0089370c;
  }
  else if (!(bool)(bVar7 | bVar6)) {
LAB_0089370c:
    if (param_1[0x2e] != 0) {
      uVar15 = ((ulong)(uint)((int)uVar19 << 3) + 8 ^ uVar19 >> 0x20) * -0x622015f714c7d297;
      uVar15 = (uVar19 >> 0x20 ^ uVar15 >> 0x2f ^ uVar15) * -0x622015f714c7d297;
      uVar15 = (uVar15 ^ uVar15 >> 0x2f) * -0x6b622cb0470b6a63 >>
               ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
      if ((*(ulong *)(param_1[0x2c] + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f) & 1) != 0) {
        do {
          puVar11 = (ulong *)(param_1[0x29] + uVar15 * 0x30);
          if (*puVar11 == uVar19) goto LAB_008937b4;
          uVar15 = uVar15 + 1 & param_1[0x2d] - 1;
        } while ((*(ulong *)(param_1[0x2c] + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f) & 1) != 0);
      }
    }
    puVar11 = (ulong *)0x0;
LAB_008937b4:
    puVar1 = (ulong *)0x0;
    if (puVar11 != (ulong *)0x0) {
      puVar1 = puVar11 + 1;
    }
    iVar4 = (int)*puVar1;
    uVar10 = 0x80000000;
    if (((param_3 ^ *(int *)(param_2 + 0x1c) != 9) & 1) == 0) {
      uVar10 = 0;
    }
    if (iVar4 < 3) {
      if (iVar4 == 1) {
        uVar9 = 0;
        uVar21 = 0x4d;
      }
      else {
        if (iVar4 != 2) goto LAB_008939b4;
        uVar9 = (uint)(byte)puVar1[1];
        uVar21 = 0x4e;
      }
    }
    else {
      if (iVar4 == 3) {
        uVar9 = FUN_008868ec(param_1,uVar19);
        uVar21 = 0x4f;
      }
      else {
        if (iVar4 != 6) goto LAB_008939b4;
                    /* try { // try from 0089383c to 0089387b has its CatchHandler @ 008939dc */
        uVar9 = FUN_008868ec(param_1,uVar19);
        uVar21 = 0x50;
      }
      if ((int)uVar9 < 0) {
LAB_008939b4:
                    /* try { // try from 008939b4 to 008939c3 has its CatchHandler @ 008939dc */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
      }
    }
                    /* try { // try from 0089388c to 008938b3 has its CatchHandler @ 008939f4 */
    uVar12 = FUN_00875ec8(*param_1);
    FUN_00875cac(*param_1,uVar21,uVar8,0);
    FUN_00875d18(*param_1,uVar9 | uVar10);
    goto LAB_00893978;
  }
  iVar4 = *(int *)(param_2 + 0x1c);
  uVar20 = 0;
  if (iVar4 < 0xb) {
    if (iVar4 == 8) {
      bVar7 = (param_3 & 1) == 0;
      uVar13 = 0x1e;
      uVar20 = 0x1b;
    }
    else {
      if (iVar4 != 9) {
        if (iVar4 != 10) goto LAB_008938d8;
        goto LAB_00893854;
      }
      bVar7 = (param_3 & 1) == 0;
      uVar13 = 0x1b;
      uVar20 = 0x1e;
    }
LAB_008938d4:
    if (bVar7) {
      uVar20 = uVar13;
    }
  }
  else {
    if (iVar4 == 0xb) {
LAB_0089381c:
      bVar7 = (param_3 & 1) == 0;
      uVar13 = 0x1c;
      uVar20 = 0x1f;
      goto LAB_008938d4;
    }
    if (iVar4 == 0xc) {
LAB_00893854:
      bVar7 = (param_3 & 1) == 0;
      uVar13 = 0x1d;
      uVar20 = 0x20;
      goto LAB_008938d4;
    }
    if (iVar4 == 0xd) goto LAB_0089381c;
  }
LAB_008938d8:
                    /* try { // try from 008938d8 to 0089391f has its CatchHandler @ 008939e4 */
  uVar10 = FUN_0088df20(param_1,uVar19);
  if ((int)uVar10 < 0) {
    iVar4 = *(int *)((long)param_1 + 0x64c);
    uVar10 = iVar4 + 1;
    if (0xff < uVar10) {
                    /* try { // try from 008939c4 to 008939db has its CatchHandler @ 008939e4 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(uVar19 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                  );
    }
    *(uint *)((long)param_1 + 0x64c) = uVar10;
    uVar9 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar10) {
      uVar9 = uVar10;
    }
    *(uint *)(param_1 + 0xca) = uVar9;
    uVar10 = FUN_00891438(param_1,uVar19,iVar4,0xff);
  }
                    /* try { // try from 00893928 to 00893977 has its CatchHandler @ 008939ec */
  uVar12 = FUN_00875ec8(*param_1);
  if ((*(uint *)(param_2 + 0x1c) & 0xfffffffe) == 0xc) {
    FUN_00875cac(*param_1,uVar20,uVar10,0);
    uVar10 = uVar8;
  }
  else {
    FUN_00875cac(*param_1,uVar20,uVar8,0);
  }
  FUN_00875d18(*param_1,uVar10 & 0xff);
LAB_00893978:
  *(undefined4 *)((long)param_1 + 0x64c) = uVar3;
  return uVar12;
code_r0x008935ec:
  uVar18 = uVar18 + 1 & uVar17;
  if ((*(ulong *)(lVar2 + (uVar18 >> 6) * 8) >> (uVar18 & 0x3f) & 1) == 0) goto LAB_00893604;
  goto LAB_008935dc;
}

