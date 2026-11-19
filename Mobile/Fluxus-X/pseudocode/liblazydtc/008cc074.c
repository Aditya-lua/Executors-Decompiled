/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cc074
 */

void FUN_008cc074(long param_1,ulong param_2,int param_3)

{
  long *plVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  int iVar5;
  ulong __n;
  ulong uVar6;
  long *plVar7;
  long *plVar8;
  undefined1 *puVar9;
  ulong uVar10;
  long lVar11;
  long local_280;
  undefined1 auStack_270 [512];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  do {
    lVar11 = *(long *)(param_1 + 0x70);
    plVar1 = (long *)(lVar11 + (long)param_3 * 0x10);
    if (*(int *)((long)plVar1 + -4) == 5 || *(int *)((long)plVar1 + -4) == 3) {
      if (*(int *)((long)plVar1 + 0xc) != 5) {
        if (*(int *)((long)plVar1 + 0xc) != 3) goto LAB_008cc1dc;
        lVar4 = FUN_008b8cac(*plVar1,auStack_270);
        lVar4 = FUN_008b9ff8(param_1,auStack_270,lVar4 - (long)auStack_270);
        *(undefined4 *)((long)plVar1 + 0xc) = 5;
        *plVar1 = lVar4;
      }
      uVar6 = (ulong)*(uint *)(*plVar1 + 0x14);
      if (*(uint *)(*plVar1 + 0x14) == 0) {
        if (*(int *)((long)plVar1 + -4) != 3) goto LAB_008cc228;
        lVar11 = FUN_008b8cac(plVar1[-2],auStack_270);
        lVar11 = FUN_008b9ff8(param_1,auStack_270,lVar11 - (long)auStack_270);
        *(undefined4 *)((long)plVar1 + -4) = 5;
        iVar5 = 1;
        plVar1[-2] = lVar11;
      }
      else {
        if ((int)param_2 < 2) {
          uVar10 = 1;
          if (0x1ff < uVar6) goto LAB_008cc274;
LAB_008cc1d0:
          local_280 = 0;
          puVar9 = auStack_270;
        }
        else {
          uVar10 = 1;
          plVar7 = (long *)(lVar11 + (long)param_3 * 0x10);
          do {
            plVar8 = plVar7 + -2;
            if (*(int *)((long)plVar7 + -4) != 5) {
              if (*(int *)((long)plVar7 + -4) != 3) goto LAB_008cc1c8;
              lVar4 = FUN_008b8cac(*plVar8,auStack_270);
              lVar4 = FUN_008b9ff8(param_1,auStack_270,lVar4 - (long)auStack_270);
              *(undefined4 *)((long)plVar7 + -4) = 5;
              *plVar8 = lVar4;
            }
            if (0x40000000 - uVar6 < (ulong)*(uint *)(*plVar8 + 0x14)) {
              if (*(long *)(lVar3 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
                FUN_008b39cc(param_1,"string length overflow");
              }
              goto LAB_008cc368;
            }
            uVar10 = uVar10 + 1;
            uVar6 = uVar6 + *(uint *)(*plVar8 + 0x14);
            plVar7 = plVar8;
          } while ((param_2 & 0xffffffff) != uVar10);
          uVar10 = param_2 & 0xffffffff;
LAB_008cc1c8:
          if (uVar6 < 0x200) goto LAB_008cc1d0;
LAB_008cc274:
          local_280 = FUN_008b9da0(param_1,uVar6);
          puVar9 = (undefined1 *)(local_280 + 0x18);
        }
        uVar6 = 0;
        iVar5 = (int)uVar10 + 1;
        plVar7 = (long *)(lVar11 + (uVar10 & 0xffffffff) * -0x10 + (long)param_3 * 0x10);
        do {
          plVar7 = plVar7 + 2;
          __n = (ulong)*(uint *)(*plVar7 + 0x14);
          memcpy(puVar9 + uVar6,(void *)(*plVar7 + 0x18),__n);
          iVar5 = iVar5 + -1;
          uVar6 = uVar6 + __n;
        } while (1 < iVar5);
        if (uVar6 < 0x200) {
          lVar11 = FUN_008b9ff8(param_1,puVar9,uVar6);
        }
        else {
          lVar11 = FUN_008b9e28(param_1,local_280);
        }
        plVar1[(uVar10 & 0xffffffff) * -2 + 2] = lVar11;
        *(undefined4 *)((long)(plVar1 + (uVar10 & 0xffffffff) * -2 + 2) + 0xc) = 5;
        iVar5 = (int)uVar10 + -1;
      }
    }
    else {
LAB_008cc1dc:
      plVar7 = plVar1 + -2;
      lVar11 = FUN_008be028(param_1,plVar7,0x12);
      if ((*(int *)(lVar11 + 0xc) == 0) &&
         (lVar11 = FUN_008be028(param_1,plVar1,0x12), *(int *)(lVar11 + 0xc) == 0)) {
        if (*(long *)(lVar3 + 0x28) == local_70) {
          FUN_008b3ab8(param_1,plVar7,plVar1);
        }
        goto LAB_008cc368;
      }
      FUN_008cb070(param_1,plVar7,lVar11,plVar7,plVar1);
LAB_008cc228:
      iVar5 = 1;
    }
    uVar2 = (int)param_2 - iVar5;
    param_2 = (ulong)uVar2;
    param_3 = param_3 - iVar5;
    if ((int)uVar2 < 2) {
      if (*(long *)(lVar3 + 0x28) == local_70) {
        return;
      }
LAB_008cc368:
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
  } while( true );
}

