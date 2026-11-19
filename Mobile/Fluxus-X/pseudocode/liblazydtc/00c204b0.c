/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c204b0
 */

void FUN_00c204b0(long param_1,undefined8 *param_2)

{
  undefined4 uVar1;
  undefined4 uVar2;
  uint uVar3;
  void *pvVar4;
  long lVar5;
  size_t sVar6;
  long *plVar7;
  uint uVar8;
  long lVar9;
  
  plVar7 = *(long **)(param_1 + 0x10);
  lVar9 = param_2[1];
  uVar1 = *(undefined4 *)(param_2 + 3);
  uVar2 = *(undefined4 *)((long)param_2 + 0x1c);
  lVar5 = *plVar7;
  param_2[3] = 0xffffffffffffffff;
                    /* try { // try from 00c204f0 to 00c2051b has its CatchHandler @ 00c20658 */
  (**(code **)(lVar5 + 0x20))(plVar7);
  if ((*(ushort *)((long)plVar7 + 9) & 0xc0) != 0x40) {
    (**(code **)(*plVar7 + 0x28))(plVar7,param_2);
  }
  uVar3 = *(uint *)((long)param_2 + 0x1c);
  if (uVar3 == 0xffffffff) {
    lVar9 = param_2[1];
    pvVar4 = (void *)*param_2;
    if ((ulong)param_2[2] < lVar9 + 3U) {
      sVar6 = param_2[2] * 2;
      if (sVar6 <= lVar9 + 0x3e3U) {
        sVar6 = lVar9 + 0x3e3U;
      }
      param_2[2] = sVar6;
      pvVar4 = realloc(pvVar4,sVar6);
      *param_2 = pvVar4;
      if (pvVar4 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar9 = param_2[1];
    }
    *(undefined1 *)((undefined2 *)((long)pvVar4 + lVar9) + 1) = 0x2e;
    *(undefined2 *)((long)pvVar4 + lVar9) = 0x2e2e;
    lVar9 = param_2[1] + 3;
  }
  else if (uVar3 != 0) {
    if (1 < uVar3) {
      uVar8 = 1;
      do {
        lVar9 = param_2[1];
        pvVar4 = (void *)*param_2;
        if ((ulong)param_2[2] < lVar9 + 2U) {
          sVar6 = param_2[2] * 2;
          if (sVar6 <= lVar9 + 0x3e2U) {
            sVar6 = lVar9 + 0x3e2U;
          }
          param_2[2] = sVar6;
          pvVar4 = realloc(pvVar4,sVar6);
          *param_2 = pvVar4;
          if (pvVar4 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          lVar9 = param_2[1];
        }
        *(undefined2 *)((long)pvVar4 + lVar9) = 0x202c;
        plVar7 = *(long **)(param_1 + 0x10);
        *(uint *)(param_2 + 3) = uVar8;
        lVar9 = *plVar7;
        param_2[1] = param_2[1] + 2;
                    /* try { // try from 00c205a4 to 00c205d3 has its CatchHandler @ 00c20660 */
        (**(code **)(lVar9 + 0x20))(plVar7,param_2);
        if ((*(ushort *)((long)plVar7 + 9) & 0xc0) != 0x40) {
          (**(code **)(*plVar7 + 0x28))(plVar7,param_2);
        }
        uVar8 = uVar8 + 1;
      } while (uVar3 != uVar8);
    }
    goto LAB_00c20630;
  }
  param_2[1] = lVar9;
LAB_00c20630:
  *(undefined4 *)(param_2 + 3) = uVar1;
  *(undefined4 *)((long)param_2 + 0x1c) = uVar2;
  return;
}

