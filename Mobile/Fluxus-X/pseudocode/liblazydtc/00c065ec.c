/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c065ec
 */

byte * FUN_00c065ec(long *param_1,int *param_2,byte *param_3,byte *param_4,long *param_5,
                   uint *param_6,ulong param_7)

{
  ulong *puVar1;
  byte *pbVar2;
  ulong uVar3;
  byte bVar4;
  int iVar5;
  int iVar6;
  char *__ptr;
  ulong uVar7;
  char cVar8;
  int *piVar9;
  byte *pbVar10;
  char *pcVar11;
  long lVar12;
  long lVar13;
  bool bVar14;
  ulong __size;
  char *local_d8;
  char local_c4 [100];
  
  __size = ((long)param_4 - (long)param_3 >> 3) * -0x5555555555555555;
  uVar7 = param_7;
  if (100 < __size) {
    __ptr = malloc(__size);
    uVar7 = param_7 & 0xffffffff;
    local_d8 = __ptr;
    if (__ptr != (char *)0x0) goto LAB_00c0666c;
    std::__throw_bad_alloc();
  }
  local_d8 = local_c4;
  __ptr = (char *)0x0;
LAB_00c0666c:
  if (param_3 == param_4) {
    piVar9 = (int *)*param_1;
  }
  else {
    lVar12 = 0;
    pbVar10 = param_3;
    pcVar11 = local_d8;
    do {
      bVar4 = *pbVar10;
      puVar1 = (ulong *)(pbVar10 + 8);
      pbVar10 = pbVar10 + 0x18;
      uVar3 = (ulong)(bVar4 >> 1);
      if ((bVar4 & 1) != 0) {
        uVar3 = *puVar1;
      }
      cVar8 = '\x01';
      if (uVar3 == 0) {
        cVar8 = '\x02';
        lVar12 = lVar12 + 1;
      }
      __size = __size - (uVar3 == 0);
      *pcVar11 = cVar8;
      pcVar11 = pcVar11 + 1;
    } while (pbVar10 != param_4);
    piVar9 = (int *)*param_1;
    if ((piVar9 != param_2) && (__size != 0)) {
      lVar13 = 0;
      do {
        iVar5 = *piVar9;
        if ((uVar7 & 1) == 0) {
                    /* try { // try from 00c066f0 to 00c066fb has its CatchHandler @ 00c068c0 */
          iVar5 = (**(code **)(*param_5 + 0x38))(param_5,iVar5);
          uVar7 = param_7 & 0xffffffff;
        }
        bVar14 = false;
        pbVar10 = param_3;
        pcVar11 = local_d8;
        do {
          if (*pcVar11 == '\x01') {
            pbVar2 = pbVar10 + 4;
            if ((*pbVar10 & 1) != 0) {
              pbVar2 = *(byte **)(pbVar10 + 0x10);
            }
            iVar6 = *(int *)(pbVar2 + lVar13 * 4);
            if ((uVar7 & 1) == 0) {
                    /* try { // try from 00c06758 to 00c06763 has its CatchHandler @ 00c068c4 */
              iVar6 = (**(code **)(*param_5 + 0x38))(param_5);
              uVar7 = param_7 & 0xffffffff;
            }
            if (iVar5 == iVar6) {
              uVar3 = (ulong)(*pbVar10 >> 1);
              if ((*pbVar10 & 1) != 0) {
                uVar3 = *(ulong *)(pbVar10 + 8);
              }
              if (uVar3 == lVar13 + 1U) {
                __size = __size - 1;
                lVar12 = lVar12 + 1;
                *pcVar11 = '\x02';
              }
              bVar14 = true;
            }
            else {
              __size = __size - 1;
              *pcVar11 = '\0';
            }
          }
          pbVar10 = pbVar10 + 0x18;
          pcVar11 = pcVar11 + 1;
        } while (pbVar10 != param_4);
        piVar9 = (int *)*param_1;
        if (bVar14) {
          piVar9 = piVar9 + 1;
          *param_1 = (long)piVar9;
          if (1 < lVar12 + __size) {
            pbVar10 = param_3;
            pcVar11 = local_d8;
            do {
              if (*pcVar11 == '\x02') {
                uVar3 = (ulong)(*pbVar10 >> 1);
                if ((*pbVar10 & 1) != 0) {
                  uVar3 = *(ulong *)(pbVar10 + 8);
                }
                if (uVar3 != lVar13 + 1U) {
                  lVar12 = lVar12 + -1;
                  *pcVar11 = '\0';
                }
              }
              pbVar10 = pbVar10 + 0x18;
              pcVar11 = pcVar11 + 1;
            } while (pbVar10 != param_4);
          }
        }
      } while ((piVar9 != param_2) && (lVar13 = lVar13 + 1, __size != 0));
    }
  }
  if (piVar9 == param_2) {
    *param_6 = *param_6 | 2;
  }
  for (; param_3 != param_4; param_3 = param_3 + 0x18) {
    if (*local_d8 == '\x02') goto LAB_00c06890;
    local_d8 = local_d8 + 1;
  }
  *param_6 = *param_6 | 4;
LAB_00c06890:
  if (__ptr != (char *)0x0) {
    free(__ptr);
  }
  return param_3;
}

