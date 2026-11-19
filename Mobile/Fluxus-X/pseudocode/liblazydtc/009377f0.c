/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009377f0
 */

void FUN_009377f0(long param_1,undefined8 param_2,undefined8 *param_3,uint param_4)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  long *plVar7;
  long *plVar8;
  long local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  plVar8 = (long *)*param_3;
  if (plVar8 != (long *)0x0) {
    uVar2 = 0;
    if ((*(byte *)(param_1 + 0x28) & 1) != 0) goto LAB_00937880;
    do {
      if ((long *)*plVar8 == (long *)0x0) {
        plVar6 = plVar8 + 1;
        lVar3 = FUN_00904984(plVar6);
        if (lVar3 != 0) {
          lVar3 = plVar8[5];
          uVar2 = FUN_00904974(plVar6);
          uVar4 = FUN_00904984(plVar6);
          uVar2 = FUN_00937978(param_1,param_2,(int)lVar3,param_4 & 1,uVar2,uVar4,&local_70);
          if ((int)uVar2 != 0) goto LAB_00937880;
          if (local_70 != 0) {
            lVar3 = FUN_00904984(plVar6);
            if (local_70 == lVar3) {
              FUN_00904534(plVar6);
            }
            else {
              lVar3 = FUN_00904984(plVar6);
              uVar2 = FUN_00904584(plVar6,lVar3 - local_70);
              if ((int)uVar2 != 0) goto LAB_00937880;
            }
          }
        }
        lVar3 = FUN_00904984(plVar6);
        uVar2 = 0;
        if (lVar3 == 0) {
          FUN_00904534(plVar6);
          (*(code *)PTR_free_00cc4678)(plVar8);
          uVar2 = 0;
          *param_3 = 0;
        }
        goto LAB_00937880;
      }
      plVar6 = (long *)*plVar8;
      plVar5 = plVar8;
      do {
        plVar7 = plVar5;
        plVar5 = plVar6;
        plVar6 = (long *)*plVar5;
      } while (plVar6 != (long *)0x0);
      uVar2 = FUN_009377f0(param_1,param_2,plVar7,param_4 & 1);
      if ((int)uVar2 != 0) goto LAB_00937880;
    } while (*plVar7 == 0);
  }
  uVar2 = 0;
LAB_00937880:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

