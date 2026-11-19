/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda608
 */

byte * FUN_00bda608(long *param_1,long *param_2,byte *param_3,byte *param_4,long *param_5,
                   uint *param_6,uint param_7)

{
  ulong *puVar1;
  ulong uVar2;
  bool bVar3;
  bool bVar4;
  byte bVar5;
  byte bVar6;
  int iVar7;
  long *plVar8;
  char cVar9;
  byte *pbVar10;
  byte *pbVar11;
  char *pcVar12;
  long lVar13;
  long lVar14;
  ulong __size;
  char *local_f0;
  char *local_d8;
  char local_c4 [100];
  
  __size = ((long)param_4 - (long)param_3 >> 3) * -0x5555555555555555;
  if (100 < __size) {
    local_f0 = malloc(__size);
    local_d8 = local_f0;
    if (local_f0 != (char *)0x0) goto LAB_00bda688;
    std::__throw_bad_alloc();
  }
  local_d8 = local_c4;
  local_f0 = (char *)0x0;
LAB_00bda688:
  if (param_3 == param_4) {
    __size = 0;
    lVar14 = 0;
  }
  else {
    lVar14 = 0;
    pbVar11 = param_3;
    pcVar12 = local_d8;
    do {
      bVar5 = *pbVar11;
      puVar1 = (ulong *)(pbVar11 + 8);
      pbVar11 = pbVar11 + 0x18;
      uVar2 = (ulong)(bVar5 >> 1);
      if ((bVar5 & 1) != 0) {
        uVar2 = *puVar1;
      }
      cVar9 = '\x01';
      if (uVar2 == 0) {
        cVar9 = '\x02';
        lVar14 = lVar14 + 1;
      }
      __size = __size - (uVar2 == 0);
      *pcVar12 = cVar9;
      pcVar12 = pcVar12 + 1;
    } while (pbVar11 != param_4);
  }
  lVar13 = 0;
  plVar8 = (long *)*param_1;
  if (plVar8 != (long *)0x0) goto LAB_00bda708;
LAB_00bda750:
  bVar3 = true;
  plVar8 = param_2;
  if (param_2 == (long *)0x0) goto LAB_00bda71c;
LAB_00bda758:
  if (plVar8[3] == plVar8[4]) {
    iVar7 = (**(code **)(*plVar8 + 0x48))(plVar8);
    bVar4 = iVar7 == -1;
    param_2 = (long *)0x0;
    if (!bVar4) {
      param_2 = plVar8;
    }
  }
  else {
    bVar4 = false;
    param_2 = plVar8;
  }
  do {
    plVar8 = (long *)*param_1;
    if ((bVar3 == bVar4) || (__size == 0)) {
      if (plVar8 == (long *)0x0) {
        bVar3 = true;
joined_r0x00bda9e0:
        if (param_2 != (long *)0x0) goto LAB_00bda954;
LAB_00bda9e4:
        if (bVar3 != false) goto LAB_00bda964;
      }
      else {
        if (plVar8[3] != plVar8[4]) {
          bVar3 = false;
          goto joined_r0x00bda9e0;
        }
                    /* try { // try from 00bda9f4 to 00bdaa23 has its CatchHandler @ 00bdaa48 */
        iVar7 = (**(code **)(*plVar8 + 0x48))();
        if (iVar7 != -1) {
          bVar3 = *param_1 == 0;
          goto joined_r0x00bda9e0;
        }
        bVar3 = true;
        *param_1 = 0;
        if (param_2 == (long *)0x0) goto LAB_00bda9e4;
LAB_00bda954:
        if (param_2[3] == param_2[4]) {
          iVar7 = (**(code **)(*param_2 + 0x48))(param_2);
          if (bVar3 == (iVar7 == -1)) goto LAB_00bda964;
        }
        else if (!bVar3) {
LAB_00bda964:
          *param_6 = *param_6 | 2;
        }
      }
      if (param_3 != param_4) break;
      goto LAB_00bda998;
    }
    if ((byte *)plVar8[3] == (byte *)plVar8[4]) {
                    /* try { // try from 00bda7b4 to 00bda7d7 has its CatchHandler @ 00bdaa54 */
      bVar5 = (**(code **)(*plVar8 + 0x48))();
    }
    else {
      bVar5 = *(byte *)plVar8[3];
    }
    if ((param_7 & 1) == 0) {
      bVar5 = (**(code **)(*param_5 + 0x18))(param_5);
    }
    if (param_3 == param_4) {
LAB_00bda6fc:
      plVar8 = (long *)*param_1;
    }
    else {
      bVar3 = false;
      pbVar11 = param_3;
      pcVar12 = local_d8;
      do {
        if (*pcVar12 == '\x01') {
          pbVar10 = *(byte **)(pbVar11 + 0x10);
          if ((*pbVar11 & 1) == 0) {
            pbVar10 = pbVar11 + 1;
          }
          bVar6 = pbVar10[lVar13];
          if ((param_7 & 1) == 0) {
                    /* try { // try from 00bda844 to 00bda84f has its CatchHandler @ 00bdaa58 */
            bVar6 = (**(code **)(*param_5 + 0x18))(param_5);
          }
          if (bVar5 == bVar6) {
            uVar2 = (ulong)(*pbVar11 >> 1);
            if ((*pbVar11 & 1) != 0) {
              uVar2 = *(ulong *)(pbVar11 + 8);
            }
            if (uVar2 == lVar13 + 1U) {
              __size = __size - 1;
              lVar14 = lVar14 + 1;
              *pcVar12 = '\x02';
            }
            bVar3 = true;
          }
          else {
            __size = __size - 1;
            *pcVar12 = '\0';
          }
        }
        pbVar11 = pbVar11 + 0x18;
        pcVar12 = pcVar12 + 1;
      } while (pbVar11 != param_4);
      if (bVar3) {
        plVar8 = (long *)*param_1;
        if (plVar8[3] == plVar8[4]) {
                    /* try { // try from 00bda8d0 to 00bda8d3 has its CatchHandler @ 00bdaa4c */
          (**(code **)(*plVar8 + 0x50))();
        }
        else {
          plVar8[3] = plVar8[3] + 1;
        }
        if (1 < lVar14 + __size) {
          pbVar11 = param_3;
          pcVar12 = local_d8;
          do {
            if (*pcVar12 == '\x02') {
              uVar2 = (ulong)(*pbVar11 >> 1);
              if ((*pbVar11 & 1) != 0) {
                uVar2 = *(ulong *)(pbVar11 + 8);
              }
              if (uVar2 != lVar13 + 1U) {
                lVar14 = lVar14 + -1;
                *pcVar12 = '\0';
              }
            }
            pbVar11 = pbVar11 + 0x18;
            pcVar12 = pcVar12 + 1;
          } while (pbVar11 != param_4);
        }
        goto LAB_00bda6fc;
      }
      plVar8 = (long *)*param_1;
    }
    lVar13 = lVar13 + 1;
    if (plVar8 == (long *)0x0) goto LAB_00bda750;
LAB_00bda708:
    if (plVar8[3] == plVar8[4]) {
                    /* try { // try from 00bda72c to 00bda77b has its CatchHandler @ 00bdaa50 */
      iVar7 = (**(code **)(*plVar8 + 0x48))();
      if (iVar7 == -1) {
        *param_1 = 0;
        goto LAB_00bda750;
      }
      bVar3 = *param_1 == 0;
    }
    else {
      bVar3 = false;
    }
    plVar8 = param_2;
    if (param_2 != (long *)0x0) goto LAB_00bda758;
LAB_00bda71c:
    bVar4 = true;
  } while( true );
  while( true ) {
    param_3 = param_3 + 0x18;
    local_d8 = local_d8 + 1;
    if (param_3 == param_4) break;
    if (*local_d8 == '\x02') goto LAB_00bda9a4;
  }
LAB_00bda998:
  *param_6 = *param_6 | 4;
LAB_00bda9a4:
  if (local_f0 != (char *)0x0) {
    free(local_f0);
  }
  return param_3;
}

