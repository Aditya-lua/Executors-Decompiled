/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00961354
 */

long * curl_url_dup(long *param_1)

{
  byte bVar1;
  byte bVar2;
  long *plVar3;
  long lVar4;
  
  plVar3 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x58);
  if (plVar3 == (long *)0x0) {
    return (long *)0x0;
  }
  if (*param_1 == 0) {
LAB_009613a4:
    if (param_1[1] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[1] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    if (param_1[2] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[2] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    if (param_1[3] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[3] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    if (param_1[4] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[4] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    if (param_1[6] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[6] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    if (param_1[7] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[7] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    if (param_1[8] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[8] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    if (param_1[9] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[9] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    if (param_1[5] != 0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)();
      plVar3[5] = lVar4;
      if (lVar4 == 0) goto LAB_009614f0;
    }
    *(short *)(plVar3 + 10) = (short)param_1[10];
    bVar1 = (*(byte *)((long)param_1 + 0x52) >> 1 & 1) << 1;
    bVar2 = *(byte *)((long)plVar3 + 0x52) & 0xfc;
    *(byte *)((long)plVar3 + 0x52) = bVar2 | *(byte *)((long)plVar3 + 0x52) & 1 | bVar1;
    *(byte *)((long)plVar3 + 0x52) = bVar2 | bVar1 | *(byte *)((long)param_1 + 0x52) & 1;
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    *plVar3 = lVar4;
    if (lVar4 != 0) goto LAB_009613a4;
LAB_009614f0:
    (*(code *)PTR_free_00cc4678)(*plVar3);
    (*(code *)PTR_free_00cc4678)(plVar3[1]);
    (*(code *)PTR_free_00cc4678)(plVar3[2]);
    (*(code *)PTR_free_00cc4678)(plVar3[3]);
    (*(code *)PTR_free_00cc4678)(plVar3[4]);
    (*(code *)PTR_free_00cc4678)(plVar3[5]);
    (*(code *)PTR_free_00cc4678)(plVar3[6]);
    (*(code *)PTR_free_00cc4678)(plVar3[7]);
    (*(code *)PTR_free_00cc4678)(plVar3[8]);
    (*(code *)PTR_free_00cc4678)(plVar3[9]);
    (*(code *)PTR_free_00cc4678)(plVar3);
    plVar3 = (long *)0x0;
  }
  return plVar3;
}

