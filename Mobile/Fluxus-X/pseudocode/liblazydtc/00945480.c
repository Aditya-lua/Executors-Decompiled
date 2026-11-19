/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945480
 */

void FUN_00945480(long param_1,undefined4 param_2,long *param_3,undefined4 *param_4,long *param_5)

{
  ulong uVar1;
  long lVar2;
  uint uVar3;
  long lVar4;
  void *__s;
  size_t __n;
  void *pvVar5;
  ulong uVar6;
  undefined4 *puVar7;
  undefined8 uVar8;
  long *plVar9;
  long *plVar10;
  long local_400;
  undefined1 auStack_3f4 [900];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  uVar8 = *(undefined8 *)(param_1 + 0x20);
  *param_4 = 0;
  *param_5 = 0;
  if (param_3[0x11] != 0) {
    lVar4 = FUN_00904984(param_3 + 0xc);
    FUN_00904584(param_3 + 0xc,lVar4 - param_3[0x11]);
    param_3[0x11] = 0;
  }
  if (param_3[0x10] == 0) {
    local_400 = 0;
    uVar3 = FUN_00908350(param_1,param_2,auStack_3f4,900,&local_400);
    if (uVar3 != 0) {
      uVar6 = 0;
      if (uVar3 != 0x51) {
        uVar6 = (ulong)uVar3;
      }
      goto LAB_0094566c;
    }
    if (local_400 < 1) {
      puVar7 = (undefined4 *)__errno();
      FUN_00904b80(param_1,"response reading failed (errno: %d)",*puVar7);
      uVar6 = 0x38;
      goto LAB_0094566c;
    }
    uVar6 = FUN_009045fc(param_3 + 0xc,auStack_3f4);
    if ((int)uVar6 != 0) goto LAB_0094566c;
    *(int *)(param_1 + 0x108) = *(int *)(param_1 + 0x108) + (int)local_400;
    *param_3 = *param_3 + local_400;
  }
  while( true ) {
    plVar9 = param_3 + 0xc;
    __s = (void *)FUN_00904974(plVar9);
    __n = FUN_00904984(plVar9);
    pvVar5 = memchr(__s,10,__n);
    plVar10 = param_3 + 0x10;
    if (pvVar5 == (void *)0x0) break;
    uVar1 = (long)pvVar5 + (1 - (long)__s);
    FUN_00904a98(param_1,1,__s,uVar1);
    uVar6 = FUN_00934dd0(param_1,2,__s,uVar1);
    if ((int)uVar6 != 0) goto LAB_0094566c;
    uVar6 = (*(code *)param_3[0x13])(param_1,uVar8,__s,uVar1,param_4);
    if ((uVar6 & 1) != 0) {
      param_3[0x11] = uVar1;
      uVar6 = FUN_00904984(plVar9);
      lVar4 = 0;
      if (uVar1 < uVar6) {
        lVar4 = FUN_00904984(plVar9);
        lVar4 = lVar4 - uVar1;
      }
      param_3[0x10] = lVar4;
      *param_5 = *param_3;
      plVar10 = param_3;
      break;
    }
    uVar6 = FUN_00904984(plVar9);
    if (uVar1 < uVar6) {
      lVar4 = FUN_00904984(plVar9);
      FUN_00904584(plVar9,lVar4 - uVar1);
    }
    else {
      FUN_0090456c(plVar9);
    }
  }
  uVar6 = 0;
  *plVar10 = 0;
  *(undefined1 *)(param_3 + 1) = 0;
LAB_0094566c:
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

