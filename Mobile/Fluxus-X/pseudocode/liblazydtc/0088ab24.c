/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088ab24
 */

void FUN_0088ab24(undefined8 *param_1,long param_2)

{
  uint uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  uint uVar4;
  int iVar5;
  long lVar6;
  char cVar7;
  int *piVar8;
  int *piVar9;
  int iVar10;
  int *piVar11;
  long lVar12;
  undefined8 uVar13;
  ulong uVar14;
  long lVar15;
  char *pcVar16;
  ulong uVar17;
  ulong uVar18;
  long lVar19;
  int *piVar20;
  long lVar21;
  ulong uVar22;
  int *local_c0;
  int *local_b8;
  int *local_b0;
  int local_a8;
  undefined4 uStack_a4;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 *local_78;
  undefined4 local_70;
  long local_68;
  
  lVar6 = tpidr_el0;
  local_68 = *(long *)(lVar6 + 0x28);
  uVar18 = *(ulong *)(param_2 + 0x28);
  local_70 = *(undefined4 *)((long)param_1 + 0x64c);
  local_78 = param_1;
  if (uVar18 == 1) {
    if (*(long *)(param_2 + 0x38) != 1) {
LAB_0088ac74:
      local_b0 = (int *)0x0;
      local_b8 = (int *)0x0;
      local_c0 = (int *)0x0;
      local_c0 = operator_new(uVar18 * 0x38);
      local_b8 = local_c0 + uVar18 * 0xe;
      piVar11 = local_c0;
      do {
        piVar11[0xc] = 0;
        piVar11[0xd] = 0;
        piVar11[6] = 0;
        piVar11[7] = 0;
        piVar11[4] = 0;
        piVar11[5] = 0;
        piVar11[10] = 0;
        piVar11[0xb] = 0;
        piVar11[8] = 0;
        piVar11[9] = 0;
        piVar11[2] = 0;
        piVar11[3] = 0;
        piVar11[0] = 0;
        piVar11[1] = 0;
        *(undefined2 *)(piVar11 + 0xc) = 0xffff;
        piVar11 = piVar11 + 0xe;
      } while (piVar11 != local_b8);
      local_b0 = local_b8;
      if (uVar18 != 0) {
        lVar19 = 0;
        uVar18 = 0;
        do {
                    /* try { // try from 0088accc to 0088acdb has its CatchHandler @ 0088b0dc */
          FUN_00899540(&local_a8,param_1,*(undefined8 *)(*(long *)(param_2 + 0x20) + uVar18 * 8),
                       &local_78);
          uVar18 = uVar18 + 1;
          puVar3 = (undefined8 *)((long)local_c0 + lVar19);
          lVar19 = lVar19 + 0x38;
          puVar3[3] = uStack_90;
          puVar3[2] = local_98;
          puVar3[5] = uStack_80;
          puVar3[4] = local_88;
          puVar3[1] = uStack_a0;
          *puVar3 = CONCAT44(uStack_a4,local_a8);
        } while (uVar18 < *(ulong *)(param_2 + 0x28));
      }
      goto LAB_0088ad0c;
    }
                    /* try { // try from 0088ab84 to 0088ab93 has its CatchHandler @ 0088b094 */
    FUN_00899540(&local_a8,param_1,**(undefined8 **)(param_2 + 0x20),&local_78);
    lVar19 = **(long **)(param_2 + 0x30);
    if (local_a8 == 0) {
                    /* try { // try from 0088b008 to 0088b017 has its CatchHandler @ 0088b094 */
      FUN_0088d1d0(param_1,lVar19,(undefined1)uStack_a4,0);
    }
    else {
                    /* try { // try from 0088aba4 to 0088ac2f has its CatchHandler @ 0088b09c */
      iVar10 = FUN_0088df20(param_1,lVar19);
      if (iVar10 < 0) {
        iVar10 = *(int *)((long)param_1 + 0x64c);
        uVar1 = iVar10 + 1;
        if (0xff < uVar1) {
          if (*(long *)(lVar6 + 0x28) == local_68) {
                    /* try { // try from 0088b07c to 0088b093 has its CatchHandler @ 0088b09c */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(lVar19 + 0xc,
                         "Out of registers when trying to allocate %d registers: exceeded limit %d",
                         1,0xff);
          }
          goto LAB_0088b124;
        }
        *(uint *)((long)param_1 + 0x64c) = uVar1;
        uVar4 = *(uint *)(param_1 + 0xca);
        if (*(uint *)(param_1 + 0xca) <= uVar1) {
          uVar4 = uVar1;
        }
        *(uint *)(param_1 + 0xca) = uVar4;
        iVar10 = FUN_00891438(param_1,lVar19,iVar10,0xff);
      }
      if (0 < *(int *)((long)param_1 + 0xc)) {
        FUN_00876644(*param_1,*(int *)(**(long **)(param_2 + 0x20) + 0xc) + 1);
      }
      FUN_00892774(param_1,&local_a8,iVar10,1,**(undefined8 **)(param_2 + 0x20));
    }
  }
  else {
    local_c0 = (int *)0x0;
    local_b8 = (int *)0x0;
    local_b0 = (int *)0x0;
    if (uVar18 != 0) {
      if (0x492492492492492 < uVar18) {
        if (*(long *)(lVar6 + 0x28) != local_68) goto LAB_0088b124;
                    /* try { // try from 0088ac68 to 0088ac7f has its CatchHandler @ 0088b0ac */
        FUN_00899c0c();
      }
      goto LAB_0088ac74;
    }
LAB_0088ad0c:
                    /* try { // try from 0088ad0c to 0088ad1f has its CatchHandler @ 0088b0a4 */
    FUN_008998dc(param_1,param_2,&local_c0,param_2 + 0x30);
    uVar18 = *(ulong *)(param_2 + 0x28);
    if (uVar18 != 0) {
      lVar21 = 0;
      lVar19 = 0x69;
      uVar22 = 0;
      do {
        uVar14 = *(ulong *)(param_2 + 0x38);
        if (uVar14 <= uVar22) break;
        uVar2 = uVar22 + 1;
        lVar12 = *(long *)(*(long *)(param_2 + 0x30) + uVar22 * 8);
        if ((uVar2 == uVar14) && (uVar14 < uVar18)) {
          iVar5 = *(int *)((long)param_1 + 0x64c);
          iVar10 = ((int)uVar18 - (int)uVar14) + 1;
          uVar1 = iVar5 + iVar10;
          if (0xff < uVar1) {
            if (*(long *)(lVar6 + 0x28) == local_68) {
                    /* try { // try from 0088b02c to 0088b043 has its CatchHandler @ 0088b0d0 */
                    /* WARNING: Subroutine does not return */
              FUN_0087fcd8(param_2 + 0xc,
                           "Out of registers when trying to allocate %d registers: exceeded limit %d"
                           ,iVar10,0xff);
            }
            goto LAB_0088b124;
          }
          *(uint *)((long)param_1 + 0x64c) = uVar1;
          uVar4 = *(uint *)(param_1 + 0xca);
          if (*(uint *)(param_1 + 0xca) <= uVar1) {
            uVar4 = uVar1;
          }
          *(uint *)(param_1 + 0xca) = uVar4;
                    /* try { // try from 0088adb0 to 0088adbf has its CatchHandler @ 0088b0d4 */
          FUN_008956b0(param_1,lVar12,iVar5,iVar10,1);
          uVar14 = *(ulong *)(param_2 + 0x28);
          uVar18 = uVar14 - uVar22;
          if (uVar22 <= uVar14 && uVar18 != 0) {
            if (1 < uVar18) {
              uVar17 = 0;
              uVar22 = uVar22 + (uVar18 & 0xfffffffffffffffe);
              pcVar16 = (char *)((long)local_c0 + lVar19);
              do {
                cVar7 = (char)uVar17 + (char)iVar5;
                uVar17 = uVar17 + 2;
                pcVar16[-0x38] = cVar7;
                *pcVar16 = cVar7 + '\x01';
                pcVar16 = pcVar16 + 0x70;
              } while ((uVar14 + lVar21 & 0xfffffffffffffffe) != uVar17);
              if (uVar18 == (uVar18 & 0xfffffffffffffffe)) goto LAB_0088ad44;
            }
            lVar15 = uVar14 - uVar22;
            lVar12 = uVar22 + lVar21;
            pcVar16 = (char *)((long)local_c0 + uVar22 * 0x38 + 0x31);
            do {
              cVar7 = (char)lVar12;
              lVar15 = lVar15 + -1;
              lVar12 = lVar12 + 1;
              *pcVar16 = cVar7 + (char)iVar5;
              pcVar16 = pcVar16 + 0x38;
            } while (lVar15 != 0);
          }
        }
        else {
          piVar11 = local_c0 + uVar22 * 0xe;
          if (*piVar11 == 0) {
            cVar7 = (char)piVar11[1];
            if ((char)piVar11[0xc] != -1) {
              cVar7 = (char)piVar11[0xc];
            }
            *(char *)((long)piVar11 + 0x31) = cVar7;
            FUN_0088d1d0(param_1,lVar12,cVar7,0);
          }
          else {
                    /* try { // try from 0088ae50 to 0088aeb7 has its CatchHandler @ 0088b0d8 */
            iVar10 = FUN_0088df20(param_1);
            if (iVar10 < 0) {
              iVar10 = *(int *)((long)param_1 + 0x64c);
              uVar1 = iVar10 + 1;
              if (0xff < uVar1) {
                if (*(long *)(lVar6 + 0x28) == local_68) {
                    /* try { // try from 0088b054 to 0088b06b has its CatchHandler @ 0088b0a8 */
                    /* WARNING: Subroutine does not return */
                  FUN_0087fcd8(lVar12 + 0xc,
                               "Out of registers when trying to allocate %d registers: exceeded limit %d"
                               ,1,0xff);
                }
                goto LAB_0088b124;
              }
              *(uint *)((long)param_1 + 0x64c) = uVar1;
              uVar4 = *(uint *)(param_1 + 0xca);
              if (*(uint *)(param_1 + 0xca) <= uVar1) {
                uVar4 = uVar1;
              }
              *(uint *)(param_1 + 0xca) = uVar4;
              iVar10 = FUN_00891438(param_1,lVar12,iVar10,0xff);
            }
            *(char *)((long)piVar11 + 0x31) = (char)iVar10;
          }
        }
LAB_0088ad44:
        uVar18 = *(ulong *)(param_2 + 0x28);
        lVar19 = lVar19 + 0x38;
        lVar21 = lVar21 + -1;
        uVar22 = uVar2;
      } while (uVar2 < uVar18);
    }
    if (uVar18 < *(ulong *)(param_2 + 0x38)) {
      do {
                    /* try { // try from 0088aed0 to 0088aed7 has its CatchHandler @ 0088b0e0 */
        FUN_00889800(param_1,*(undefined8 *)(*(long *)(param_2 + 0x30) + uVar18 * 8));
        uVar18 = uVar18 + 1;
      } while (uVar18 < *(ulong *)(param_2 + 0x38));
    }
    piVar9 = local_b8;
    piVar11 = local_c0;
    piVar8 = local_b8;
    if (local_c0 != local_b8) {
      uVar18 = 0;
      piVar20 = local_c0;
      do {
        if (*piVar20 != 0) {
          if (0 < *(int *)((long)param_1 + 0xc)) {
            FUN_00876644(*param_1,piVar20[8] + 1);
          }
          if (uVar18 < *(ulong *)(param_2 + 0x28)) {
            uVar13 = *(undefined8 *)(*(long *)(param_2 + 0x20) + uVar18 * 8);
          }
          else {
            uVar13 = 0;
          }
                    /* try { // try from 0088af04 to 0088af4b has its CatchHandler @ 0088b0e4 */
          FUN_00892774(param_1,piVar20,*(undefined1 *)((long)piVar20 + 0x31),1,uVar13);
        }
        piVar20 = piVar20 + 0xe;
        uVar18 = uVar18 + 1;
        piVar11 = local_c0;
        piVar8 = local_b8;
      } while (piVar20 != piVar9);
    }
    for (; piVar9 = local_b8, piVar11 != local_b8; piVar11 = piVar11 + 0xe) {
      local_b8 = piVar8;
      if (*piVar11 == 0) {
        if (*(char *)((long)piVar11 + 0x31) != (char)piVar11[1]) {
                    /* try { // try from 0088af9c to 0088afa7 has its CatchHandler @ 0088b0cc */
          FUN_00875b54(*param_1,6,(char)piVar11[1],*(char *)((long)piVar11 + 0x31),0);
        }
      }
      piVar8 = local_b8;
      local_b8 = piVar9;
    }
    local_b8 = piVar8;
    if (local_c0 != (int *)0x0) {
      local_b8 = local_c0;
      operator_delete(local_c0,(long)local_b0 - (long)local_c0);
    }
  }
  *(undefined4 *)((long)local_78 + 0x64c) = local_70;
  if (*(long *)(lVar6 + 0x28) == local_68) {
    return;
  }
LAB_0088b124:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

