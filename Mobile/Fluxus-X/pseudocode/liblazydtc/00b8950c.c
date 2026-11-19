/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8950c
 */

int psa_verify_message(undefined4 param_1,uint param_2,void *param_3,size_t param_4,void *param_5,
                      size_t param_6)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  int iVar5;
  void *__dest;
  void *__dest_00;
  long local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  if (param_4 == 0) {
    __dest = (void *)0x0;
    if (param_6 == 0) goto LAB_00b895a8;
LAB_00b89578:
    __dest_00 = calloc(param_6,1);
    if (__dest_00 == (void *)0x0) goto LAB_00b89644;
    memcpy(__dest_00,param_5,param_6);
  }
  else {
    __dest = calloc(param_4,1);
    if (__dest == (void *)0x0) {
      __dest_00 = (void *)0x0;
LAB_00b89644:
      iVar4 = -0x8d;
      goto LAB_00b896e8;
    }
    memcpy(__dest,param_3,param_4);
    if (param_6 != 0) goto LAB_00b89578;
LAB_00b895a8:
    __dest_00 = (void *)0x0;
  }
  uVar1 = param_2 & 0xffffff00;
  if (((uVar1 == 0x6000200) || (uVar1 == 0x6000300)) || (uVar1 == 0x6001300)) {
LAB_00b895e0:
    if ((param_2 & 0xff) == 0) {
LAB_00b896e4:
      iVar4 = -0x87;
      goto LAB_00b896e8;
    }
  }
  else {
    uVar2 = param_2 & 0xfffffe00;
    if (((uVar2 != 0x6000600 && uVar1 != 0x6000900) && (param_2 != 0x6000800)) &&
       (uVar2 != 0x6000400)) goto LAB_00b896e4;
    if (((uVar1 == 0x6000200) || (uVar1 == 0x6000300)) || (uVar1 == 0x6001300)) goto LAB_00b895e0;
    if (uVar1 != 0x6000900) {
      if ((uVar2 | 0x200) != 0x6000600) goto LAB_00b895e8;
      if (((uVar1 == 0x6000200) || (uVar1 == 0x6000300)) || (uVar1 == 0x6001300)) goto LAB_00b895e0;
    }
    iVar4 = -0x87;
    if (((param_2 & 0xff) == 0) ||
       (uVar2 != 0x6000400 && (uVar2 != 0x6000600 && uVar1 != 0x6000900))) goto LAB_00b896e8;
  }
LAB_00b895e8:
  iVar4 = FUN_00b86e5c(param_1,&local_60,0x800,param_2);
  if (iVar4 == 0) {
    iVar5 = psa_verify_message_builtin
                      (local_60,*(undefined8 *)(local_60 + 0x28),*(undefined8 *)(local_60 + 0x30),
                       param_2,__dest,param_4,__dest_00,param_6);
    iVar4 = psa_unregister_read_under_mutex(local_60);
    if (iVar5 != 0) {
      iVar4 = iVar5;
    }
  }
LAB_00b896e8:
  free(__dest);
  free(__dest_00);
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

