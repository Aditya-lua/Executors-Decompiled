/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc03cc
 */

void FSE_readNCount_bmi2(void *param_1,int *param_2,int *param_3,uint *param_4,ulong param_5)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  uint *puVar5;
  long lVar6;
  uint uVar7;
  int iVar8;
  long lVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint *puVar16;
  uint uVar17;
  uint *puVar18;
  uint *puVar19;
  int iVar20;
  uint uVar21;
  undefined8 local_60;
  long local_58;
  
  lVar9 = tpidr_el0;
  local_58 = *(long *)(lVar9 + 0x28);
  if (param_5 < 8) {
    local_60 = 0;
    memcpy(&local_60,param_4,param_5);
    uVar11 = FSE_readNCount_bmi2(param_1,param_2,param_3,&local_60,8);
    uVar12 = 0xffffffffffffffec;
    if (uVar11 <= param_5 || 0xffffffffffffff88 < uVar11) {
      uVar12 = uVar11;
    }
  }
  else {
    uVar1 = *param_2 + 1;
    memset(param_1,0,(ulong)uVar1 << 1);
    uVar15 = *param_4 & 0xf;
    if (uVar15 < 0xb) {
      uVar17 = 0x20 << (ulong)uVar15;
      uVar10 = *param_4 >> 4;
      uVar14 = 0;
      iVar20 = uVar15 + 6;
      *param_3 = uVar15 + 5;
      puVar18 = (uint *)((long)param_4 + (param_5 - 7));
      puVar19 = (uint *)((long)param_4 + (param_5 - 4));
      uVar15 = uVar17 | 1;
      uVar21 = 4;
      puVar16 = param_4;
LAB_00bc0588:
      uVar7 = uVar17 * 2 - 1;
      uVar13 = uVar10 & uVar7;
      uVar7 = uVar7 - uVar15;
      uVar10 = uVar10 & uVar17 - 1;
      uVar2 = 0;
      if ((int)uVar17 <= (int)uVar13) {
        uVar2 = uVar7;
      }
      iVar3 = iVar20;
      uVar13 = uVar13 - uVar2;
      if (uVar10 < uVar7) {
        iVar3 = iVar20 + -1;
        uVar13 = uVar10;
      }
      iVar8 = uVar13 - 1;
      iVar4 = 1 - uVar13;
      if ((int)uVar13 < 1) {
        iVar4 = iVar8;
      }
      uVar13 = iVar3 + uVar21;
      uVar15 = iVar4 + uVar15;
      *(short *)((long)param_1 + (ulong)uVar14 * 2) = (short)iVar8;
      uVar14 = uVar14 + 1;
      if ((int)uVar15 < (int)uVar17) {
        if ((int)uVar15 < 2) goto LAB_00bc0650;
        iVar20 = 0x20 - (uint)LZCOUNT(uVar15);
        uVar17 = 1 << (ulong)(((uint)LZCOUNT(uVar15) ^ 0x1f) & 0x1f);
      }
      if (uVar1 <= uVar14) goto LAB_00bc0650;
      lVar6 = (long)((ulong)uVar13 << 0x20) >> 0x23;
      if ((puVar18 < puVar16) && (puVar19 < (uint *)((long)puVar16 + lVar6))) {
        uVar21 = uVar13 + ((int)puVar16 - (int)puVar19) * 8 & 0x1f;
        puVar16 = puVar19;
      }
      else {
        uVar21 = uVar13 & 7;
        puVar16 = (uint *)((long)puVar16 + lVar6);
      }
      uVar10 = *puVar16 >> (ulong)uVar21;
      if (iVar8 == 0) {
        uVar13 = (~uVar10 & 0xaaaaaaaa | 0x80000000) >> 1 | (~uVar10 & 0x55555555) << 1;
        uVar13 = (uVar13 & 0xcccccccc) >> 2 | (uVar13 & 0x33333333) << 2;
        uVar13 = (uVar13 & 0xf0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f) << 4;
        uVar13 = (uVar13 & 0xff00ff00) >> 8 | (uVar13 & 0xff00ff) << 8;
        uVar12 = LZCOUNT(uVar13 >> 0x10 | uVar13 << 0x10);
        uVar13 = (uint)uVar12;
        while (0x17 < uVar13) {
          puVar5 = puVar19;
          if (puVar16 <= puVar18) {
            puVar5 = (uint *)((long)puVar16 + 3);
          }
          uVar14 = uVar14 + 0x24;
          uVar2 = uVar21 + ((int)puVar16 - (int)puVar18) * 8 & 0x1f;
          if (puVar16 <= puVar18) {
            uVar2 = uVar21;
          }
          uVar10 = *puVar5 >> (ulong)uVar2;
          uVar21 = (~uVar10 & 0xaaaaaaaa | 0x80000000) >> 1 | (~uVar10 & 0x55555555) << 1;
          uVar21 = (uVar21 & 0xcccccccc) >> 2 | (uVar21 & 0x33333333) << 2;
          uVar21 = (uVar21 & 0xf0f0f0f0) >> 4 | (uVar21 & 0xf0f0f0f) << 4;
          uVar21 = (uVar21 & 0xff00ff00) >> 8 | (uVar21 & 0xff00ff) << 8;
          uVar12 = LZCOUNT(uVar21 >> 0x10 | uVar21 << 0x10);
          puVar16 = puVar5;
          uVar21 = uVar2;
          uVar13 = (uint)uVar12;
        }
        uVar2 = (uint)uVar12 & 0x1e;
        uVar13 = uVar21 + uVar2 + 2;
        uVar14 = (int)(uVar12 >> 1) * 3 + uVar14 + (uVar10 >> (ulong)uVar2 & 3);
        if (uVar1 <= uVar14) goto LAB_00bc0650;
        if ((puVar18 < puVar16) && (puVar19 < (uint *)((long)puVar16 + (ulong)(uVar13 >> 3)))) {
          uVar21 = uVar13 + ((int)puVar16 - (int)puVar19) * 8 & 0x1f;
          puVar16 = puVar19;
        }
        else {
          uVar21 = uVar13 & 7;
          puVar16 = (uint *)((long)puVar16 + (ulong)(uVar13 >> 3));
        }
        uVar10 = *puVar16 >> (ulong)uVar21;
      }
      goto LAB_00bc0588;
    }
    uVar12 = 0xffffffffffffffd4;
  }
  goto LAB_00bc0674;
LAB_00bc0650:
  if (uVar15 == 1) {
    if (uVar1 < uVar14) {
      uVar12 = 0xffffffffffffffd0;
      goto LAB_00bc0674;
    }
    if ((int)uVar13 < 0x21) {
      *param_2 = uVar14 - 1;
      uVar12 = (long)puVar16 + ((long)((int)(uVar13 + 7) >> 3) - (long)param_4);
      goto LAB_00bc0674;
    }
  }
  uVar12 = 0xffffffffffffffec;
LAB_00bc0674:
  if (*(long *)(lVar9 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar12);
  }
  return;
}

