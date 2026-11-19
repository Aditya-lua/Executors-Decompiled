/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008530cc
 */

void FUN_008530cc(long param_1,char *param_2,size_t param_3)

{
  long lVar1;
  undefined8 *puVar2;
  void *__dest;
  undefined4 uVar3;
  char *local_58;
  undefined4 local_50;
  undefined4 uStack_4c;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = (undefined4)param_3;
  uStack_4c = 0;
  local_58 = param_2;
  FUN_00855340(param_1,&local_58);
  puVar2 = (undefined8 *)FUN_0085546c(param_1,&local_58);
  if (*(int *)((long)puVar2 + 0xc) == 0) {
    __dest = (void *)FUN_0084e938(*(undefined8 *)(param_1 + 0x38),param_3 + 1);
    memcpy(__dest,param_2,param_3);
    *(undefined1 *)((long)__dest + param_3) = 0;
    *puVar2 = __dest;
    uVar3 = 0x11c;
    if (*param_2 != '@') {
      uVar3 = 0x119;
    }
    *(undefined4 *)((long)puVar2 + 0xc) = uVar3;
  }
  else {
    __dest = (void *)*puVar2;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(__dest);
  }
  return;
}

