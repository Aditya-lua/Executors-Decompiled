/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096a698
 */

int FUN_0096a698(long param_1,int param_2,uint param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined4 *puVar4;
  char cVar5;
  byte bVar6;
  undefined8 uVar7;
  long *plVar8;
  long *plVar9;
  int iVar10;
  long lVar11;
  char local_6c [4];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if ((*(long *)(param_1 + 0x20) != 0) &&
     (plVar9 = *(long **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x248),
     plVar9 != (long *)0x0)) {
    plVar8 = plVar9;
    do {
      if ((undefined **)*plVar8 == &PTR_DAT_00cc4d20) {
        if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
            ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
           && (0 < DAT_00cc4d2c)) {
          FUN_00904ddc(param_1,plVar8,"shutdown and remove SSL, start");
        }
        FUN_009087dc(param_1,param_2,0);
        if ((*(byte *)((long)plVar8 + 0x24) >> 1 & 1) != 0) {
          iVar2 = 0;
          local_6c[0] = '\x01';
          goto LAB_0096a8d8;
        }
        lVar11 = plVar8[2];
        cVar5 = '\0';
        iVar10 = -0xb;
        uVar7 = *(undefined8 *)(lVar11 + 0x38);
        *(long *)(lVar11 + 0x38) = param_1;
        local_6c[0] = '\0';
        goto LAB_0096a7b4;
      }
      plVar8 = (long *)plVar8[1];
    } while (plVar8 != (long *)0x0);
  }
  iVar10 = 0;
  goto LAB_0096a708;
LAB_0096a7b4:
  do {
    iVar10 = iVar10 + 1;
    if (iVar10 == 0) break;
    lVar3 = FUN_00908868(plVar8[3],(int)plVar8[4],0);
    if (lVar3 < 0) {
      FUN_00904b80(param_1,"SSL shutdown timeout");
      iVar2 = 0x1c;
      goto LAB_0096a8d8;
    }
    iVar2 = (**(code **)(PTR_DAT_00cc4d08 + 0x40))(plVar8,param_1,param_3 & 1,local_6c);
    if (iVar2 != 0) goto LAB_0096a8b8;
    if (local_6c[0] != '\0') {
      cVar5 = '\x01';
      break;
    }
    cVar5 = '\0';
    if (*(int *)(lVar11 + 0x58) != 0) {
      iVar2 = FUN_00907a64(plVar8,param_1,lVar3);
      if (iVar2 < 0) {
        puVar4 = (undefined4 *)__errno();
        FUN_00904b80(param_1,"select/poll on SSL socket, errno: %d",*puVar4);
        iVar2 = 0x38;
      }
      else {
        if (iVar2 != 0) {
          cVar5 = local_6c[0];
          goto LAB_0096a828;
        }
        FUN_00904b80(param_1,"SSL shutdown timeout");
        iVar2 = 0x1c;
      }
LAB_0096a8b8:
      *(undefined8 *)(plVar8[2] + 0x38) = uVar7;
      bVar6 = 2;
      goto LAB_0096a8c8;
    }
LAB_0096a828:
  } while (cVar5 == '\0');
  iVar2 = 0;
  bVar6 = cVar5 << 1;
  *(undefined8 *)(plVar8[2] + 0x38) = uVar7;
LAB_0096a8c8:
  *(byte *)((long)plVar8 + 0x24) = *(byte *)((long)plVar8 + 0x24) & 0xfd | bVar6;
LAB_0096a8d8:
  FUN_009089bc(param_1,param_2);
  iVar10 = 0x50;
  if (iVar2 != 0 || local_6c[0] != '\0') {
    iVar10 = iVar2;
  }
  FUN_00907414(plVar9,plVar8,param_1,0);
  if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
     (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
      (0 < *(int *)(*plVar8 + 0xc))))) {
    FUN_00904ddc(param_1,plVar8,"shutdown and remove SSL, done -> %d",iVar10);
  }
LAB_0096a708:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar10;
}

