/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bdede4
 */

byte * FUN_00bdede4(long *param_1,long *param_2,byte *param_3,byte *param_4,long *param_5,
                   uint *param_6,uint param_7)

{
  ulong *puVar1;
  byte *pbVar2;
  ulong uVar3;
  byte bVar4;
  bool bVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  long *plVar9;
  char cVar10;
  byte *pbVar11;
  char *pcVar12;
  long lVar13;
  long lVar14;
  ulong __size;
  char *local_f0;
  char *local_e0;
  char local_c4 [100];
  
  __size = ((long)param_4 - (long)param_3 >> 3) * -0x5555555555555555;
  if (100 < __size) {
    local_f0 = malloc(__size);
    local_e0 = local_f0;
    if (local_f0 != (char *)0x0) goto LAB_00bdee64;
    std::__throw_bad_alloc();
  }
  local_e0 = local_c4;
  local_f0 = (char *)0x0;
LAB_00bdee64:
  if (param_3 == param_4) {
    __size = 0;
    lVar14 = 0;
  }
  else {
    lVar14 = 0;
    pbVar11 = param_3;
    pcVar12 = local_e0;
    do {
      bVar4 = *pbVar11;
      puVar1 = (ulong *)(pbVar11 + 8);
      pbVar11 = pbVar11 + 0x18;
      uVar3 = (ulong)(bVar4 >> 1);
      if ((bVar4 & 1) != 0) {
        uVar3 = *puVar1;
      }
      cVar10 = '\x01';
      if (uVar3 == 0) {
        cVar10 = '\x02';
        lVar14 = lVar14 + 1;
      }
      __size = __size - (uVar3 == 0);
      *pcVar12 = cVar10;
      pcVar12 = pcVar12 + 1;
    } while (pbVar11 != param_4);
  }
  lVar13 = 0;
  do {
    plVar9 = (long *)*param_1;
    if (plVar9 == (long *)0x0) {
LAB_00bdef28:
      bVar5 = true;
      if (param_2 == (long *)0x0) goto LAB_00bdef1c;
LAB_00bdef30:
      if ((int *)param_2[3] == (int *)param_2[4]) {
        iVar7 = (**(code **)(*param_2 + 0x48))(param_2);
      }
      else {
        iVar7 = *(int *)param_2[3];
      }
      bVar6 = iVar7 == -1;
      plVar9 = (long *)0x0;
      if (!bVar6) {
        plVar9 = param_2;
      }
      param_2 = plVar9;
    }
    else {
      if ((int *)plVar9[3] == (int *)plVar9[4]) {
                    /* try { // try from 00bdef00 to 00bdef53 has its CatchHandler @ 00bdf234 */
        iVar7 = (**(code **)(*plVar9 + 0x48))();
      }
      else {
        iVar7 = *(int *)plVar9[3];
      }
      if (iVar7 == -1) {
        *param_1 = 0;
        goto LAB_00bdef28;
      }
      bVar5 = *param_1 == 0;
      if (param_2 != (long *)0x0) goto LAB_00bdef30;
LAB_00bdef1c:
      bVar6 = true;
    }
    plVar9 = (long *)*param_1;
    if ((bVar5 == bVar6) || (__size == 0)) break;
    if ((int *)plVar9[3] == (int *)plVar9[4]) {
                    /* try { // try from 00bdef94 to 00bdefb7 has its CatchHandler @ 00bdf238 */
      iVar7 = (**(code **)(*plVar9 + 0x48))();
    }
    else {
      iVar7 = *(int *)plVar9[3];
    }
    if ((param_7 & 1) == 0) {
      iVar7 = (**(code **)(*param_5 + 0x38))(param_5,iVar7);
    }
    if (param_3 == param_4) {
      lVar13 = lVar13 + 1;
    }
    else {
      bVar5 = false;
      pbVar11 = param_3;
      pcVar12 = local_e0;
      do {
        if (*pcVar12 == '\x01') {
          pbVar2 = pbVar11 + 4;
          if ((*pbVar11 & 1) != 0) {
            pbVar2 = *(byte **)(pbVar11 + 0x10);
          }
          iVar8 = *(int *)(pbVar2 + lVar13 * 4);
          if ((param_7 & 1) == 0) {
                    /* try { // try from 00bdf028 to 00bdf033 has its CatchHandler @ 00bdf23c */
            iVar8 = (**(code **)(*param_5 + 0x38))(param_5);
          }
          if (iVar7 == iVar8) {
            uVar3 = (ulong)(*pbVar11 >> 1);
            if ((*pbVar11 & 1) != 0) {
              uVar3 = *(ulong *)(pbVar11 + 8);
            }
            if (uVar3 == lVar13 + 1U) {
              __size = __size - 1;
              lVar14 = lVar14 + 1;
              *pcVar12 = '\x02';
            }
            bVar5 = true;
          }
          else {
            __size = __size - 1;
            *pcVar12 = '\0';
          }
        }
        pbVar11 = pbVar11 + 0x18;
        pcVar12 = pcVar12 + 1;
      } while (pbVar11 != param_4);
      if (bVar5) {
        plVar9 = (long *)*param_1;
        if (plVar9[3] == plVar9[4]) {
                    /* try { // try from 00bdf0b0 to 00bdf0b3 has its CatchHandler @ 00bdf230 */
          (**(code **)(*plVar9 + 0x50))();
        }
        else {
          plVar9[3] = plVar9[3] + 4;
        }
        if (1 < lVar14 + __size) {
          pbVar11 = param_3;
          pcVar12 = local_e0;
          do {
            if (*pcVar12 == '\x02') {
              uVar3 = (ulong)(*pbVar11 >> 1);
              if ((*pbVar11 & 1) != 0) {
                uVar3 = *(ulong *)(pbVar11 + 8);
              }
              if (uVar3 != lVar13 + 1U) {
                lVar14 = lVar14 + -1;
                *pcVar12 = '\0';
              }
            }
            pbVar11 = pbVar11 + 0x18;
            pcVar12 = pcVar12 + 1;
          } while (pbVar11 != param_4);
        }
        lVar13 = lVar13 + 1;
      }
      else {
        lVar13 = lVar13 + 1;
      }
    }
  } while( true );
  if (plVar9 == (long *)0x0) {
joined_r0x00bdf144:
    bVar5 = true;
    if (param_2 != (long *)0x0) goto LAB_00bdf174;
LAB_00bdf148:
    if (!bVar5) goto LAB_00bdf1b4;
  }
  else {
    if ((int *)plVar9[3] == (int *)plVar9[4]) {
                    /* try { // try from 00bdf158 to 00bdf197 has its CatchHandler @ 00bdf22c */
      iVar7 = (**(code **)(*plVar9 + 0x48))();
    }
    else {
      iVar7 = *(int *)plVar9[3];
    }
    if (iVar7 == -1) {
      *param_1 = 0;
      goto joined_r0x00bdf144;
    }
    bVar5 = *param_1 == 0;
    if (param_2 == (long *)0x0) goto LAB_00bdf148;
LAB_00bdf174:
    if ((int *)param_2[3] == (int *)param_2[4]) {
      iVar7 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar7 = *(int *)param_2[3];
    }
    if (bVar5 != (iVar7 == -1)) goto LAB_00bdf1b4;
  }
  *param_6 = *param_6 | 2;
LAB_00bdf1b4:
  if (param_3 != param_4) {
    do {
      if (*local_e0 == '\x02') goto LAB_00bdf1e8;
      param_3 = param_3 + 0x18;
      local_e0 = local_e0 + 1;
    } while (param_3 != param_4);
  }
  *param_6 = *param_6 | 4;
LAB_00bdf1e8:
  if (local_f0 != (char *)0x0) {
    free(local_f0);
  }
  return param_3;
}

