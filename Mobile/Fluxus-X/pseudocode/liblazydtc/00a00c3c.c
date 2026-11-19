/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00c3c
 */

ulong FUN_00a00c3c(long param_1,int param_2,ulong param_3,ulong *param_4)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  uint uVar4;
  bool bVar5;
  ulong uVar6;
  BUF_MEM *a;
  void *__src;
  ulong *puVar7;
  long *plVar8;
  ulong uVar9;
  ulong uVar10;
  undefined4 uVar11;
  ulong *puVar12;
  ulong uVar13;
  
  uVar4 = *(uint *)(param_1 + 0x30);
  puVar12 = *(ulong **)(param_1 + 0x40);
  bVar5 = (uVar4 & 0x200) == 0;
  lVar1 = 0;
  if (!bVar5) {
    lVar1 = 8;
  }
  puVar7 = (ulong *)puVar12[bVar5];
  plVar8 = *(long **)((long)puVar12 + lVar1);
  uVar9 = plVar8[1];
  uVar6 = puVar7[1] - uVar9;
  uVar13 = 0;
  if (uVar6 != 0) {
    uVar13 = uVar6;
  }
  if (0x84 < param_2 - 1U) {
switchD_00a00cac_caseD_85:
    return 0;
  }
  uVar10 = *puVar7;
  uVar11 = (undefined4)param_3;
  uVar6 = uVar13;
  switch(param_2) {
  case 1:
    param_4 = (ulong *)*puVar12;
    if ((void *)param_4[1] == (void *)0x0) goto switchD_00a00cac_caseD_b;
    if ((uVar4 >> 9 & 1) != 0) {
      puVar12 = (ulong *)puVar12[1];
      uVar13 = puVar12[2];
      param_4[3] = puVar12[3];
      param_4[2] = uVar13;
      uVar13 = *puVar12;
      param_4[1] = puVar12[1];
      *param_4 = uVar13;
      return 1;
    }
    if ((uVar4 >> 10 & 1) == 0) {
      memset((void *)param_4[1],0,param_4[2]);
      *param_4 = 0;
      param_4 = (ulong *)*puVar12;
    }
    goto LAB_00a00d48;
  case 2:
    uVar6 = (ulong)(uVar10 == 0);
    break;
  case 3:
    if (param_4 != (ulong *)0x0) {
      *param_4 = puVar7[1];
      return uVar10;
    }
  case 10:
    uVar6 = uVar10;
    break;
  default:
    goto switchD_00a00cac_caseD_85;
  case 8:
    uVar6 = (ulong)*(int *)(param_1 + 0x2c);
    break;
  case 9:
    *(undefined4 *)(param_1 + 0x2c) = uVar11;
    uVar6 = 1;
    break;
  case 0xb:
  case 0xc:
    goto switchD_00a00cac_caseD_b;
  case 0x72:
    if (((*(int *)(param_1 + 0x2c) != 0) && (*(int *)(param_1 + 0x28) != 0)) &&
       (puVar12 != (ulong *)0x0)) {
      a = (BUF_MEM *)*puVar12;
      if ((uVar4 >> 9 & 1) != 0) {
        a->data = (char *)0x0;
      }
      BUF_MEM_free(a);
    }
    *(undefined4 *)(param_1 + 0x2c) = uVar11;
    *puVar12 = (ulong)param_4;
LAB_00a00d48:
    puVar12 = (ulong *)puVar12[1];
    uVar13 = param_4[2];
    puVar12[3] = param_4[3];
    puVar12[2] = uVar13;
    uVar13 = *param_4;
    puVar12[1] = param_4[1];
    *puVar12 = uVar13;
    uVar6 = 1;
    break;
  case 0x73:
    if (param_4 != (ulong *)0x0) {
      if ((((uVar4 >> 9 & 1) == 0) && (*(int *)(param_1 + 0x28) != 0)) && (puVar12 != (ulong *)0x0))
      {
        __src = (void *)((size_t *)puVar12[1])[1];
        if (__src != *(void **)(*puVar12 + 8)) {
          memmove(*(void **)(*puVar12 + 8),__src,*(size_t *)puVar12[1]);
          puVar2 = (undefined8 *)*puVar12;
          puVar3 = (undefined8 *)puVar12[1];
          *puVar2 = *puVar3;
          puVar3[1] = puVar2[1];
        }
      }
      *param_4 = *puVar12;
      return 1;
    }
    goto switchD_00a00cac_caseD_b;
  case 0x80:
    uVar6 = 0xffffffffffffffff;
    if ((-1 < (long)param_3) && ((long)param_3 <= (long)(uVar13 + uVar10))) {
      if (param_3 != 0) {
        uVar9 = uVar9 + param_3;
      }
      puVar7[1] = uVar9;
      *puVar7 = *plVar8 - param_3;
      puVar7[2] = plVar8[2] - param_3;
      uVar6 = param_3;
    }
    break;
  case 0x82:
    *(undefined4 *)(param_1 + 0x38) = uVar11;
switchD_00a00cac_caseD_b:
    uVar6 = 1;
    break;
  case 0x85:
    break;
  }
  return uVar6;
}

