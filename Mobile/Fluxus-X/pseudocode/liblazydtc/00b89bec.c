/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b89bec
 */

void psa_asymmetric_encrypt
               (undefined8 param_1,uint param_2,void *param_3,size_t param_4,void *param_5,
               size_t param_6,void *param_7,size_t param_8,undefined8 *param_9)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  void *__dest;
  void *__src;
  ushort *puVar5;
  size_t local_80;
  void *local_78;
  ushort *local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  *param_9 = 0;
  if (((param_2 & 0xffffff00) != 0x7000300) && (param_6 != 0)) {
    uVar4 = 0xffffff79;
    goto LAB_00b89e00;
  }
  uVar4 = FUN_00b86e5c(param_1,&local_70,0x100,param_2);
  puVar5 = local_70;
  if ((int)uVar4 != 0) goto LAB_00b89e00;
  if (((*local_70 & 0x7000) == 0x7000) || ((*local_70 & 0x7000) == 0x4000)) {
    if (param_4 == 0) {
      local_78 = (void *)0x0;
      if (param_6 != 0) goto LAB_00b89cb4;
LAB_00b89d20:
      __dest = (void *)0x0;
      if (param_8 != 0) goto LAB_00b89cdc;
LAB_00b89d28:
      __src = (void *)0x0;
      param_7 = (void *)0x0;
      local_80 = 0;
LAB_00b89d34:
      if (*(uint *)(puVar5 + 2) < 0x100) {
        uVar2 = mbedtls_psa_asymmetric_encrypt
                          (puVar5,*(undefined8 *)(puVar5 + 0x14),*(undefined8 *)(puVar5 + 0x18),
                           param_2,local_78,param_4,__dest,param_6,__src,param_8,param_9);
        puVar5 = local_70;
      }
      else {
        uVar2 = 0xffffff79;
      }
    }
    else {
      local_78 = calloc(param_4,1);
      if (local_78 == (void *)0x0) {
        local_78 = (void *)0x0;
        __dest = (void *)0x0;
        __src = (void *)0x0;
      }
      else {
        memcpy(local_78,param_3,param_4);
        if (param_6 == 0) goto LAB_00b89d20;
LAB_00b89cb4:
        __dest = calloc(param_6,1);
        if (__dest == (void *)0x0) {
          __src = (void *)0x0;
        }
        else {
          memcpy(__dest,param_5,param_6);
          if (param_8 == 0) goto LAB_00b89d28;
LAB_00b89cdc:
          __src = calloc(param_8,1);
          local_80 = param_8;
          if (__src != (void *)0x0) goto LAB_00b89d34;
        }
      }
      local_80 = 0;
      param_7 = (void *)0x0;
      uVar2 = 0xffffff73;
    }
  }
  else {
    local_78 = (void *)0x0;
    __dest = (void *)0x0;
    local_80 = 0;
    __src = (void *)0x0;
    param_7 = (void *)0x0;
    uVar2 = 0xffffff79;
  }
  uVar3 = psa_unregister_read_under_mutex(puVar5);
  free(local_78);
  free(__dest);
  if (__src != (void *)0x0) {
    if (param_7 == (void *)0x0) {
      uVar4 = 0xffffff69;
      goto LAB_00b89e00;
    }
    if (local_80 != 0) {
      memcpy(param_7,__src,local_80);
    }
    free(__src);
  }
  if (uVar2 != 0) {
    uVar3 = uVar2;
  }
  uVar4 = (ulong)uVar3;
LAB_00b89e00:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

