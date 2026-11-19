/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2948
 */

ulong psa_its_get(undefined8 param_1,uint param_2,uint param_3,void *param_4,ulong *param_5)

{
  long lVar1;
  FILE *pFVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong __n;
  uint local_68 [2];
  FILE *local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_60 = (FILE *)0x0;
  uVar4 = FUN_00ba2854(param_1,local_68,&local_60);
  pFVar2 = local_60;
  uVar5 = uVar4 & 0xffffffff;
  if ((int)uVar4 == 0) {
    if (CARRY4(param_3,param_2)) {
      uVar5 = 0xffffff79;
    }
    else if (local_68[0] < param_3 + param_2) {
      uVar5 = 0xffffff79;
    }
    else {
      uVar3 = fseek(local_60,(ulong)param_2,1);
      uVar4 = (ulong)uVar3;
      if (uVar3 == 0) {
        __n = (ulong)param_3;
        uVar4 = fread(param_4,1,__n,pFVar2);
        pFVar2 = local_60;
        if (uVar4 == __n) {
          uVar5 = 0;
          if (param_5 != (ulong *)0x0) {
            *param_5 = __n;
          }
        }
        else {
          uVar5 = 0xffffff6e;
        }
      }
      else {
        uVar5 = 0xffffff6e;
      }
    }
  }
  if (pFVar2 != (FILE *)0x0) {
    uVar3 = fclose(pFVar2);
    uVar4 = (ulong)uVar3;
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return uVar5;
}

