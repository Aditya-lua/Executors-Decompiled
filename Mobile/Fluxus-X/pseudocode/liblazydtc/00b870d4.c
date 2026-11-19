/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b870d4
 */

void psa_export_key(undefined8 param_1,void *param_2,size_t param_3,size_t *param_4)

{
  size_t __n;
  ushort uVar1;
  long lVar2;
  ushort *puVar3;
  uint uVar4;
  ulong uVar5;
  void *__dest;
  uint uVar6;
  ushort *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (param_3 == 0) {
    uVar5 = 0xffffff76;
    goto LAB_00b87244;
  }
  *param_4 = 0;
  uVar5 = psa_get_and_lock_key_slot(param_1,&local_60);
  puVar3 = local_60;
  if ((int)uVar5 != 0) goto LAB_00b87244;
  uVar1 = *local_60;
  if (((uint)((uVar1 & 0x7000) != 0x4000) & (*(uint *)(local_60 + 4) ^ 0xffffffff)) != 0) {
    local_60 = (ushort *)0x0;
    psa_unregister_read_under_mutex(puVar3);
    uVar5 = 0xffffff7b;
    goto LAB_00b87244;
  }
  __dest = calloc(param_3,1);
  if (__dest == (void *)0x0) {
    psa_unregister_read_under_mutex(puVar3);
    uVar5 = 0xffffff73;
    goto LAB_00b87244;
  }
  if (*(uint *)(puVar3 + 2) < 0x100) {
    __n = *(size_t *)(puVar3 + 0x18);
    if ((uVar1 & 0xcfff) != 0x4001) {
      if (((((uVar1 & 0x7000) != 0x1000) && ((uVar1 & 0x7000) != 0x2000)) &&
          ((uVar1 & 0xcf00) != 0x4200)) && ((uVar1 & 0xcf00) != 0x4100)) {
        uVar6 = 0xffffff7a;
        goto LAB_00b8720c;
      }
    }
    if (param_3 < __n) {
      uVar6 = 0xffffff76;
    }
    else {
      memcpy(__dest,*(void **)(puVar3 + 0x14),__n);
      memset((void *)((long)__dest + __n),0,param_3 - __n);
      uVar6 = 0;
      *param_4 = __n;
    }
  }
  else {
    uVar6 = 0xffffff79;
  }
LAB_00b8720c:
  uVar4 = psa_unregister_read_under_mutex(puVar3);
  if (param_2 == (void *)0x0) {
    uVar5 = 0xffffff69;
  }
  else {
    memcpy(param_2,__dest,param_3);
    free(__dest);
    if (uVar6 != 0) {
      uVar4 = uVar6;
    }
    uVar5 = (ulong)uVar4;
  }
LAB_00b87244:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

