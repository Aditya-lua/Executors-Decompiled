/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968774
 */

int FUN_00968774(long *param_1,long param_2,undefined8 *param_3,void *param_4,size_t param_5,
                code *param_6)

{
  long lVar1;
  char *pcVar2;
  long lVar3;
  long *plVar4;
  long *plVar5;
  int iVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  undefined4 uVar10;
  long lVar11;
  long *plVar12;
  uint uVar13;
  ulong uVar14;
  long *plVar15;
  long lVar16;
  size_t local_78;
  void *pvStack_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  lVar1 = param_1[3] + 800;
  if (((*(uint *)(*param_1 + 8) ^ 0xffffffff) & 10) != 0) {
    lVar1 = param_1[3] + 0x2a0;
  }
  if (*(long *)(param_2 + 0xca8) == 0) {
LAB_00968858:
    (*param_6)(param_4,param_5);
    goto LAB_00968864;
  }
  uVar7 = FUN_009683d4(param_1,param_2,param_3,&pvStack_70,&local_78);
  if ((uVar7 & 1) == 0) {
    if ((local_78 == param_5) &&
       ((pvStack_70 == param_4 ||
        ((param_5 != 0 && (iVar6 = memcmp(pvStack_70,param_4,param_5), iVar6 == 0))))))
    goto LAB_00968858;
    if (*(ulong *)(param_2 + 0x6d0) != 0) {
      lVar8 = *(long *)(param_2 + 0xca8);
      uVar7 = 0;
      do {
        if (*(void **)(lVar8 + 0x18) == pvStack_70) {
          FUN_00968604();
          break;
        }
        uVar7 = uVar7 + 1;
        lVar8 = lVar8 + 200;
      } while (uVar7 < *(ulong *)(param_2 + 0x6d0));
    }
  }
  plVar15 = *(long **)(param_2 + 0xca8);
  lVar8 = plVar15[6];
  lVar9 = (*(code *)PTR_strdup_00cc4688)(*param_3);
  if (lVar9 == 0) {
    lVar16 = 0;
LAB_00968ae4:
    iVar6 = 0x1b;
  }
  else {
    lVar11 = param_1[3];
    uVar13 = (uint)*(undefined8 *)(lVar11 + 0x3a0);
    if ((uVar13 >> 9 & 1) == 0) {
      lVar16 = 0;
    }
    else {
      lVar16 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(lVar11 + 0x80));
      if (lVar16 == 0) goto LAB_00968ae4;
      lVar11 = param_1[3];
      uVar13 = (uint)*(undefined8 *)(lVar11 + 0x3a0);
    }
    if ((uVar13 >> 10 & 1) == 0) {
      uVar10 = 0xffffffff;
    }
    else {
      uVar10 = *(undefined4 *)(lVar11 + 0x564);
    }
    lVar11 = *(long *)(param_2 + 0xd0);
    if ((lVar11 == 0) || ((*(byte *)(lVar11 + 4) >> 4 & 1) == 0)) {
      plVar12 = (long *)(param_2 + 0xcb0);
    }
    else {
      plVar12 = (long *)(lVar11 + 0x108);
    }
    uVar7 = *(ulong *)(param_2 + 0x6d0);
    if (uVar7 < 2) {
      uVar14 = 1;
      if (uVar7 == 1) goto LAB_0096894c;
LAB_00968964:
      plVar15 = (long *)(*(long *)(param_2 + 0xca8) + uVar14 * 200);
    }
    else {
      uVar14 = 1;
      plVar4 = *(long **)(param_2 + 0xca8);
      do {
        if (plVar4[0x1c] == 0) break;
        uVar14 = uVar14 + 1;
        lVar11 = plVar4[0x1f];
        plVar5 = plVar4 + 0x19;
        if (lVar8 <= plVar4[0x1f]) {
          lVar11 = lVar8;
          plVar5 = plVar15;
        }
        plVar15 = plVar5;
        lVar8 = lVar11;
        plVar4 = plVar4 + 0x19;
      } while (uVar14 < uVar7);
      if (uVar14 != uVar7) goto LAB_00968964;
LAB_0096894c:
      FUN_00968604(plVar15);
    }
    uVar7 = FUN_00967d44(lVar1,plVar15 + 9);
    if ((uVar7 & 1) == 0) {
      (*(code *)PTR_free_00cc4678)(plVar15[9]);
      plVar15[9] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[10]);
      plVar15[10] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0xb]);
      plVar15[0xb] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0xc]);
      plVar15[0xc] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0xd]);
      plVar15[0xd] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0xe]);
      plVar15[0xe] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0xf]);
      plVar15[0xf] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0x11]);
      plVar15[0x11] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0x12]);
      plVar15[0x12] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0x13]);
      plVar15[0x13] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0x16]);
      plVar15[0x16] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0x10]);
      plVar15[0x10] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0x14]);
      plVar15[0x14] = 0;
      (*(code *)PTR_free_00cc4678)(plVar15[0x15]);
      plVar15[0x15] = 0;
      plVar15[3] = 0;
      goto LAB_00968ae4;
    }
    plVar15[3] = (long)param_4;
    plVar15[4] = param_5;
    plVar15[5] = (long)param_6;
    plVar15[6] = *plVar12;
    (*(code *)PTR_free_00cc4678)(*plVar15);
    (*(code *)PTR_free_00cc4678)(plVar15[1]);
    *plVar15 = lVar9;
    plVar15[1] = lVar16;
    iVar6 = 0;
    lVar9 = 0;
    lVar16 = 0;
    *(undefined4 *)((long)plVar15 + 0x3c) = uVar10;
    *(undefined4 *)(plVar15 + 7) = *(undefined4 *)((long)param_3 + 0x1c);
    plVar15[2] = **(long **)(param_1[3] + 0x3a8);
    *(undefined4 *)(plVar15 + 8) = *(undefined4 *)(param_3 + 4);
  }
  (*(code *)PTR_free_00cc4678)(lVar9);
  (*(code *)PTR_free_00cc4678)(lVar16);
  if (iVar6 != 0) {
    pcVar2 = "PROXY";
    if (((*(uint *)(*param_1 + 8) ^ 0xffffffff) & 10) != 0) {
      pcVar2 = "server";
    }
    FUN_00904b80(param_2,"Failed to add Session ID to cache for %s://%s:%d [%s]",plVar15[2],*plVar15
                 ,(int)plVar15[7],pcVar2);
    (*param_6)(param_4,param_5);
    goto LAB_00968b64;
  }
  if ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) goto LAB_00968b64;
  if (*(long *)(param_2 + 0x12a0) == 0) {
    if (param_1 != (long *)0x0) goto LAB_00968bbc;
  }
  else if (param_1 != (long *)0x0) {
    iVar6 = 0;
    if (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1) goto LAB_00968b64;
LAB_00968bbc:
    if (0 < *(int *)(*param_1 + 0xc)) {
      pcVar2 = "PROXY";
      if (((*(uint *)(*param_1 + 8) ^ 0xffffffff) & 10) != 0) {
        pcVar2 = "server";
      }
      FUN_00904ddc(param_2,param_1,"Added Session ID to cache for %s://%s:%d [%s]",plVar15[2],
                   *plVar15,(int)plVar15[7],pcVar2);
    }
  }
LAB_00968864:
  iVar6 = 0;
LAB_00968b64:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

