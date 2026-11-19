/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090a724
 */

void FUN_0090a724(long *param_1,long param_2,undefined8 *param_3,long param_4)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  int iVar5;
  long lVar6;
  undefined1 auVar7 [16];
  long local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  *(undefined4 *)(param_3 + 0xc) = 0;
  *(byte *)((long)param_3 + 100) = *(byte *)((long)param_3 + 100) & 0xf7 | 2;
  if (param_3[2] == 0) {
LAB_0090a8f4:
    *(byte *)((long)param_3 + 100) = *(byte *)((long)param_3 + 100) | 4;
LAB_0090a900:
    if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return;
  }
  lVar2 = param_4;
  if (param_4 < 0) {
    lVar2 = param_4 + 1;
  }
  plVar1 = param_3 + 5;
  lVar2 = lVar2 >> 1;
  if (param_4 < 0x259) {
    lVar2 = param_4;
  }
  do {
    auVar7 = FUN_00941cb8();
    *(undefined1 (*) [16])(param_3 + 8) = auVar7;
    lVar6 = param_3[2];
    do {
      if ((lVar6 == 0) || (lVar6 = *(long *)(lVar6 + 0x28), lVar6 == 0)) {
        lVar6 = param_4;
        goto LAB_0090a7d8;
      }
    } while (*(int *)(lVar6 + 4) != *(int *)(param_3 + 3));
    lVar6 = lVar2;
LAB_0090a7d8:
    lVar3 = param_3[5];
    param_3[10] = lVar6;
    local_70 = lVar3;
    iVar5 = (*(code *)param_3[4])(plVar1,param_2,param_1[3],param_3[2],*(undefined4 *)param_1[2]);
    if (iVar5 == 0) {
      for (lVar6 = *plVar1; lVar6 != 0; lVar6 = *(long *)(lVar6 + 8)) {
        *(long *)(lVar6 + 0x18) = param_1[3];
        *(int *)(lVar6 + 0x20) = (int)param_1[4];
      }
      lVar6 = param_3[2];
      do {
        if ((lVar6 == 0) || (lVar6 = *(long *)(lVar6 + 0x28), lVar6 == 0)) goto joined_r0x0090a8b4;
      } while (*(int *)(lVar6 + 4) != *(int *)(param_3 + 3));
      FUN_0092aff8(param_2,param_3[10],*(undefined4 *)(param_3 + 0xb));
    }
    else {
      if ((((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
          ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
         && (0 < *(int *)(*param_1 + 0xc))) {
        FUN_00904ddc(param_2,param_1,"%s failed",*param_3);
      }
      if (*plVar1 != 0) {
        FUN_00906ef0(plVar1,param_2);
      }
    }
joined_r0x0090a8b4:
    if (lVar3 != 0) {
      FUN_00906ef0(&local_70,param_2);
    }
    lVar6 = param_3[2];
    *(int *)((long)param_3 + 0x5c) = iVar5;
    if (iVar5 == 0) {
      if (lVar6 == 0) goto LAB_0090a8f4;
      goto LAB_0090a900;
    }
    do {
      if ((lVar6 == 0) || (lVar6 = *(long *)(lVar6 + 0x28), lVar6 == 0)) {
        param_3[2] = 0;
        goto LAB_0090a8f4;
      }
    } while (*(int *)(lVar6 + 4) != *(int *)(param_3 + 3));
    param_3[2] = lVar6;
  } while( true );
}

