/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c04c58
 */

byte * FUN_00c04c58(long *param_1,byte *param_2,byte *param_3,byte *param_4,long *param_5,
                   uint *param_6,ulong param_7)

{
  ulong *puVar1;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  char *__ptr;
  ulong uVar5;
  char cVar6;
  byte *pbVar7;
  byte *pbVar8;
  char *pcVar9;
  long lVar10;
  long lVar11;
  bool bVar12;
  ulong __size;
  char *pcVar13;
  char local_c4 [100];
  
  __size = ((long)param_4 - (long)param_3 >> 3) * -0x5555555555555555;
  uVar5 = param_7;
  if (100 < __size) {
    __ptr = malloc(__size);
    uVar5 = param_7 & 0xffffffff;
    pcVar13 = __ptr;
    if (__ptr != (char *)0x0) goto LAB_00c04cd4;
    std::__throw_bad_alloc();
  }
  __ptr = (char *)0x0;
  pcVar13 = local_c4;
LAB_00c04cd4:
  if (param_3 == param_4) {
    pbVar7 = (byte *)*param_1;
  }
  else {
    lVar11 = 0;
    pbVar7 = param_3;
    pcVar9 = pcVar13;
    do {
      bVar3 = *pbVar7;
      puVar1 = (ulong *)(pbVar7 + 8);
      pbVar7 = pbVar7 + 0x18;
      uVar2 = (ulong)(bVar3 >> 1);
      if ((bVar3 & 1) != 0) {
        uVar2 = *puVar1;
      }
      cVar6 = '\x01';
      if (uVar2 == 0) {
        cVar6 = '\x02';
        lVar11 = lVar11 + 1;
      }
      __size = __size - (uVar2 == 0);
      *pcVar9 = cVar6;
      pcVar9 = pcVar9 + 1;
    } while (pbVar7 != param_4);
    pbVar7 = (byte *)*param_1;
    if ((pbVar7 != param_2) && (__size != 0)) {
      lVar10 = 0;
      do {
        bVar3 = *pbVar7;
        if ((uVar5 & 1) == 0) {
                    /* try { // try from 00c04d58 to 00c04d63 has its CatchHandler @ 00c04f20 */
          bVar3 = (**(code **)(*param_5 + 0x18))(param_5);
          uVar5 = param_7 & 0xffffffff;
        }
        bVar12 = false;
        pbVar7 = param_3;
        pcVar9 = pcVar13;
        do {
          if (*pcVar9 == '\x01') {
            pbVar8 = *(byte **)(pbVar7 + 0x10);
            if ((*pbVar7 & 1) == 0) {
              pbVar8 = pbVar7 + 1;
            }
            bVar4 = pbVar8[lVar10];
            if ((uVar5 & 1) == 0) {
                    /* try { // try from 00c04dbc to 00c04dc7 has its CatchHandler @ 00c04f24 */
              bVar4 = (**(code **)(*param_5 + 0x18))(param_5);
              uVar5 = param_7 & 0xffffffff;
            }
            if (bVar3 == bVar4) {
              uVar2 = (ulong)(*pbVar7 >> 1);
              if ((*pbVar7 & 1) != 0) {
                uVar2 = *(ulong *)(pbVar7 + 8);
              }
              if (uVar2 == lVar10 + 1U) {
                __size = __size - 1;
                lVar11 = lVar11 + 1;
                *pcVar9 = '\x02';
              }
              bVar12 = true;
            }
            else {
              __size = __size - 1;
              *pcVar9 = '\0';
            }
          }
          pbVar7 = pbVar7 + 0x18;
          pcVar9 = pcVar9 + 1;
        } while (pbVar7 != param_4);
        pbVar7 = (byte *)*param_1;
        if (bVar12) {
          pbVar7 = pbVar7 + 1;
          *param_1 = (long)pbVar7;
          if (1 < lVar11 + __size) {
            pbVar8 = param_3;
            pcVar9 = pcVar13;
            do {
              if (*pcVar9 == '\x02') {
                uVar2 = (ulong)(*pbVar8 >> 1);
                if ((*pbVar8 & 1) != 0) {
                  uVar2 = *(ulong *)(pbVar8 + 8);
                }
                if (uVar2 != lVar10 + 1U) {
                  lVar11 = lVar11 + -1;
                  *pcVar9 = '\0';
                }
              }
              pbVar8 = pbVar8 + 0x18;
              pcVar9 = pcVar9 + 1;
            } while (pbVar8 != param_4);
          }
        }
      } while ((pbVar7 != param_2) && (lVar10 = lVar10 + 1, __size != 0));
    }
  }
  if (pbVar7 == param_2) {
    *param_6 = *param_6 | 2;
  }
  for (; param_3 != param_4; param_3 = param_3 + 0x18) {
    if (*pcVar13 == '\x02') goto LAB_00c04ef0;
    pcVar13 = pcVar13 + 1;
  }
  *param_6 = *param_6 | 4;
LAB_00c04ef0:
  if (__ptr != (char *)0x0) {
    free(__ptr);
  }
  return param_3;
}

