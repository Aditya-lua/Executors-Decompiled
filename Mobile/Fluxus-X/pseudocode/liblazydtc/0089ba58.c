/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089ba58
 */

void FUN_0089ba58(undefined8 param_1,long *param_2,undefined8 *param_3)

{
  long lVar1;
  undefined4 *puVar2;
  ulong *puVar3;
  ulong *puVar4;
  ulong uVar5;
  ulong uVar6;
  int iVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined **local_b0;
  long *plStack_a8;
  void *local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  void *local_88;
  long local_80;
  long lStack_78;
  byte local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  local_b0 = &PTR_FUN_00c4bbd8;
  local_70 = 0x40;
  uStack_98 = 0;
  local_a0 = (void *)0x0;
  local_88 = (void *)0x0;
  uStack_90 = 0;
  lStack_78 = 0;
  local_80 = 0;
                    /* try { // try from 0089bab8 to 0089bac3 has its CatchHandler @ 0089bd04 */
  plStack_a8 = param_2;
  (**(code **)*param_3)(param_3,&local_b0);
  uVar9 = param_2[2];
  if (uVar9 != 0) {
    puVar4 = (ulong *)param_2[3];
    uVar11 = *puVar4;
    if (uVar11 == 0) {
      uVar10 = 0;
      do {
        if (uVar9 - 1 == uVar10) goto LAB_0089bc88;
        uVar11 = puVar4[uVar10 + 1];
        uVar10 = uVar10 + 1;
      } while (uVar11 == 0);
    }
    else {
      uVar10 = 0;
    }
    uVar8 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
    uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
    uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
    uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
    uVar8 = LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) | uVar10 << 6;
    do {
      puVar3 = (ulong *)(*param_2 + uVar8 * 0x28);
      if (((puVar3[4] & 1) == 0) && (uVar5 = puVar3[1], uVar5 != 0)) {
        iVar7 = *(int *)(uVar5 + 8);
        while (iVar7 != DAT_00d1b080) {
          do {
            if ((iVar7 != DAT_00d1afc0) && (iVar7 != DAT_00d1b0b0)) goto LAB_0089bc24;
            uVar5 = *(ulong *)(uVar5 + 0x20);
            iVar7 = *(int *)(uVar5 + 8);
          } while (uVar5 == 0);
        }
        if (lStack_78 != 0) {
          uVar5 = *puVar3;
          uVar6 = ((ulong)(uint)((int)uVar5 << 3) + 8 ^ uVar5 >> 0x20) * -0x622015f714c7d297;
          uVar6 = (uVar5 >> 0x20 ^ uVar6 >> 0x2f ^ uVar6) * -0x622015f714c7d297;
          uVar6 = (uVar6 ^ uVar6 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)local_70 & 0x3f);
          if ((*(ulong *)((long)local_88 + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
            do {
              if (*(ulong *)((long)local_a0 + uVar6 * 8) == uVar5) goto LAB_0089bc24;
              uVar6 = uVar6 + 1 & local_80 - 1U;
            } while ((*(ulong *)((long)local_88 + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0);
          }
        }
                    /* try { // try from 0089bc18 to 0089bc1f has its CatchHandler @ 0089bd08 */
        puVar2 = (undefined4 *)FUN_0089bd34(param_1);
        *puVar2 = 0;
      }
LAB_0089bc24:
      uVar11 = uVar11 - 1 & uVar11;
      if (uVar11 == 0) {
        uVar6 = uVar10;
        uVar5 = uVar9;
        if (uVar9 <= uVar10 + 1) {
          uVar5 = uVar10 + 1;
        }
        do {
          uVar10 = uVar6 + 1;
          if (uVar9 <= uVar10) {
            uVar11 = 0;
            uVar10 = uVar5;
            goto joined_r0x0089bc80;
          }
          uVar11 = puVar4[uVar6 + 1];
          uVar6 = uVar10;
        } while (uVar11 == 0);
      }
      uVar8 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
      uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
      uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
      uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
      uVar8 = LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) | uVar10 << 6;
joined_r0x0089bc80:
    } while ((uVar10 != uVar9) || (uVar11 != 0));
  }
LAB_0089bc88:
  local_b0 = &PTR_FUN_00c4bbd8;
  if (local_a0 != (void *)0x0) {
    operator_delete(local_a0);
    local_a0 = (void *)0x0;
    operator_delete(local_88);
    uStack_98 = 0;
    uStack_90 = 0;
    local_88 = (void *)0x0;
    operator_delete((void *)0x0);
    local_80 = 0;
    local_70 = 0x40;
  }
  operator_delete(local_88);
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

