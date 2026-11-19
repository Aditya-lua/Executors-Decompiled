/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cb374
 */

void FUN_008cb374(long param_1,long *param_2,undefined8 param_3,long *param_4)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  long *plVar4;
  double *pdVar5;
  undefined8 uVar6;
  long lVar7;
  long unaff_x22;
  long lVar8;
  long local_70;
  undefined8 uStack_68;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (*(int *)((long)param_2 + 0xc) == 6) {
    lVar8 = *param_2;
    plVar3 = (long *)FUN_008bb604(lVar8,param_3);
    if (*(int *)((long)plVar3 + 0xc) != 0) {
LAB_008cb3d0:
      unaff_x22 = lVar8;
      if (*(char *)(lVar8 + 7) != '\0') goto LAB_008cb6b8;
      *(undefined1 *)(lVar8 + 6) = 0;
      param_2 = (long *)&DAT_00d1f000;
      if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008cb6d0;
      goto LAB_008cb3f0;
    }
    lVar7 = *(long *)(lVar8 + 0x10);
    if ((lVar7 == 0) || ((*(byte *)(lVar7 + 6) >> 1 & 1) != 0)) goto LAB_008cb3d0;
    unaff_x22 = lVar8;
    if ((*(byte *)(lVar7 + 7) >> 1 & 1) == 0) {
      plVar4 = (long *)FUN_008bdfe0(lVar7,1,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x340));
      if (plVar4 == (long *)0x0) goto LAB_008cb3d0;
    }
    else {
      plVar4 = (long *)(*(long *)(lVar7 + 0x20) + -0x20);
    }
LAB_008cb494:
    if (*(int *)((long)plVar4 + 0xc) != 7) {
      iVar2 = 99;
      uStack_68 = plVar4[1];
      local_70 = *plVar4;
      do {
        lVar8 = local_70;
        if (uStack_68._4_4_ == 6) {
          plVar3 = (long *)FUN_008bb604(local_70,param_3);
          if (*(int *)((long)plVar3 + 0xc) != 0) goto LAB_008cb3d0;
          lVar7 = *(long *)(lVar8 + 0x10);
          if ((lVar7 == 0) || ((*(byte *)(lVar7 + 6) >> 1 & 1) != 0)) goto LAB_008cb3d0;
          unaff_x22 = lVar8;
          if ((*(byte *)(lVar7 + 7) >> 1 & 1) == 0) {
            plVar4 = (long *)FUN_008bdfe0(lVar7,1,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x340)
                                         );
            param_2 = plVar3;
            if (plVar4 == (long *)0x0) goto LAB_008cb3d0;
          }
          else {
            plVar4 = (long *)(*(long *)(lVar7 + 0x20) + -0x20);
          }
        }
        else {
          if ((uStack_68._4_4_ == 0xc) && ((DAT_00d1fdd0 & 1) != 0)) {
            param_2 = &local_70;
            goto LAB_008cb624;
          }
          plVar4 = (long *)FUN_008be028(param_1,&local_70,1);
          param_2 = &local_70;
          if (*(int *)((long)plVar4 + 0xc) == 0) goto LAB_008cb698;
          param_2 = &local_70;
        }
        if (*(int *)((long)plVar4 + 0xc) == 7) {
          param_2 = &local_70;
          goto LAB_008cb5d4;
        }
        iVar2 = iVar2 + -1;
        uStack_68 = plVar4[1];
        local_70 = *plVar4;
      } while (iVar2 != 0);
      if (*(long *)(lVar1 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
        FUN_008b39cc(param_1,"\'__newindex\' chain too long; possible loop");
      }
      goto LAB_008cb75c;
    }
LAB_008cb5d4:
    FUN_008cb760(param_1,plVar4,param_2,param_3,param_4);
  }
  else {
    if ((*(int *)((long)param_2 + 0xc) == 0xc) && ((DAT_00d1fdd0 & 1) != 0)) {
LAB_008cb624:
      unaff_x22 = *param_2;
      pdVar5 = (double *)FUN_008bb604(*(undefined8 *)(*(long *)(unaff_x22 + 0x10) + 0x38),param_3);
      if (*(int *)((long)pdVar5 + 0xc) == 0) {
        if (*(long *)(lVar1 + 0x28) == local_58) {
          uVar6 = FUN_008b3c58(param_1,param_2,param_3);
                    /* catch() { ... } // from try @ 008cb6f8 with catch @ 008cb734 */
          __cxa_guard_abort(&DAT_00d1f1e0);
          if (*(long *)(lVar1 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
            FUN_00c2c090(uVar6);
          }
        }
        goto LAB_008cb75c;
      }
      if ((uint)(int)*pdVar5 < *(uint *)(*(long *)(unaff_x22 + 0x10) + 0x58)) {
        lVar8 = *param_4;
        plVar4 = (long *)(*(long *)(unaff_x22 + 0x20) + (ulong)(uint)(int)*pdVar5 * 0x10);
        plVar4[1] = param_4[1];
        *plVar4 = lVar8;
        if (((4 < *(int *)((long)param_4 + 0xc)) && ((*(byte *)(unaff_x22 + 2) >> 2 & 1) != 0)) &&
           ((*(byte *)(*param_4 + 2) & 3) != 0)) {
          FUN_008b6188(param_1,unaff_x22);
        }
        goto LAB_008cb5e8;
      }
    }
    else {
      plVar4 = (long *)FUN_008be028(param_1,param_2,1);
      if (*(int *)((long)plVar4 + 0xc) != 0) goto LAB_008cb494;
    }
LAB_008cb698:
    if (*(long *)(lVar1 + 0x28) != local_58) goto LAB_008cb75c;
    FUN_008b3be4(param_1,param_2,param_3);
LAB_008cb6b8:
    if (*(long *)(lVar1 + 0x28) != local_58) goto LAB_008cb75c;
    plVar3 = (long *)FUN_008b3cec(param_1);
LAB_008cb6d0:
    iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar2 != 0) {
                    /* try { // try from 008cb6f8 to 008cb6fb has its CatchHandler @ 008cb734 */
      lVar8 = FUN_007fe1ec(DAT_00cca8c8);
      param_2[0x3b] = lVar8;
      __cxa_guard_release(&DAT_00d1f1e0);
    }
LAB_008cb3f0:
    if (plVar3 == (long *)((long)&DWORD_007f2ef0 + param_2[0x3b])) {
      plVar3 = (long *)FUN_008bbddc(param_1,unaff_x22,param_3);
    }
    *(int *)(param_1 + 0x2c) = (int)((ulong)((long)plVar3 - *(long *)(unaff_x22 + 0x28)) >> 5);
    lVar8 = *param_4;
    plVar3[1] = param_4[1];
    *plVar3 = lVar8;
    if (((4 < *(int *)((long)param_4 + 0xc)) && ((*(byte *)(unaff_x22 + 2) >> 2 & 1) != 0)) &&
       ((*(byte *)(*param_4 + 2) & 3) != 0)) {
      FUN_008b6370(param_1,unaff_x22);
    }
  }
LAB_008cb5e8:
  if (*(long *)(lVar1 + 0x28) == local_58) {
    return;
  }
LAB_008cb75c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

