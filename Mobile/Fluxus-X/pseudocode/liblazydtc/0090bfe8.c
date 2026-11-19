/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090bfe8
 */

void FUN_0090bfe8(long param_1,long param_2,int *param_3,int param_4,int *param_5)

{
  int *piVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  uint uVar5;
  int __protocol;
  int __type;
  int local_e8 [36];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  iVar3 = *(int *)(param_2 + 4);
  piVar1 = local_e8;
  if (param_3 != (int *)0x0) {
    piVar1 = param_3;
  }
  *piVar1 = iVar3;
  if (param_4 == 3) {
    __protocol = 6;
    __type = 1;
  }
  else if (param_4 == 6) {
    __protocol = 0;
    __type = 1;
  }
  else {
    __protocol = 0x11;
    __type = 2;
  }
  piVar1[1] = __type;
  piVar1[2] = __protocol;
  uVar5 = *(uint *)(param_2 + 0x10);
  if (0x7f < uVar5) {
    uVar5 = 0x80;
  }
  piVar1[3] = uVar5;
  memcpy(piVar1 + 4,*(void **)(param_2 + 0x20),(ulong)uVar5);
  if (*(long *)(param_1 + 0x278) == 0) {
    iVar3 = socket(iVar3,__type,__protocol);
    *param_5 = iVar3;
  }
  else {
    FUN_0092f198(param_1,1);
    iVar3 = (**(code **)(param_1 + 0x278))(*(undefined8 *)(param_1 + 0x280),0,piVar1);
    *param_5 = iVar3;
    FUN_0092f198(param_1,0);
    iVar3 = *param_5;
  }
  if (iVar3 == -1) {
    uVar4 = 7;
  }
  else {
    iVar3 = *(int *)(*(long *)(param_1 + 0x20) + 0x568);
    if (iVar3 == 0) {
      uVar4 = 0;
    }
    else {
      uVar4 = 0;
      if (*piVar1 == 10) {
        uVar4 = 0;
        piVar1[10] = iVar3;
      }
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

