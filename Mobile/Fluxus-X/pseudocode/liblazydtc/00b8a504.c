/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8a504
 */

int psa_verify_hash_start
              (int *param_1,undefined4 param_2,uint param_3,void *param_4,size_t param_5,
              void *param_6,size_t param_7)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  void *__dest;
  void *__dest_00;
  uint uVar5;
  long local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (*param_1 == 0) {
    if ((*(byte *)(param_1 + 2) & 1) == 0) {
      uVar1 = param_3 & 0xffffff00;
      if ((int)uVar1 < 0x6000900) {
        if (uVar1 != 0x6000200) {
          uVar5 = 0x300;
LAB_00b8a5cc:
          if ((uVar1 != (uVar5 | 0x6000000)) && ((param_3 >> 9 | 1) != 0x30003)) {
            *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
            iVar3 = -0x87;
            goto LAB_00b8a588;
          }
        }
      }
      else if (uVar1 != 0x6000900) {
        uVar5 = 0x1300;
        goto LAB_00b8a5cc;
      }
      iVar3 = FUN_00b86e5c(param_2,&local_60,0x2000);
      if (iVar3 != 0) {
        *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
        goto LAB_00b8a588;
      }
      if (param_5 == 0) {
        __dest = (void *)0x0;
        if (param_7 != 0) goto LAB_00b8a63c;
LAB_00b8a66c:
        __dest_00 = (void *)0x0;
LAB_00b8a670:
        param_1[3] = 0;
        if (0xff < *(uint *)(local_60 + 4)) {
          iVar3 = -0x87;
          goto LAB_00b8a6b0;
        }
        *param_1 = 1;
        iVar3 = -0x86;
        *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
LAB_00b8a6c4:
        *param_1 = 0;
      }
      else {
        __dest = calloc(param_5,1);
        if (__dest == (void *)0x0) {
          __dest_00 = (void *)0x0;
        }
        else {
          memcpy(__dest,param_4,param_5);
          if (param_7 == 0) goto LAB_00b8a66c;
LAB_00b8a63c:
          __dest_00 = calloc(param_7,1);
          if (__dest_00 != (void *)0x0) {
            memcpy(__dest_00,param_6,param_7);
            goto LAB_00b8a670;
          }
        }
        iVar3 = -0x8d;
LAB_00b8a6b0:
        *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
        if (*param_1 != 0) goto LAB_00b8a6c4;
      }
      iVar4 = psa_unregister_read_under_mutex(local_60);
      if (iVar4 != 0) {
        *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
      }
      free(__dest);
      free(__dest_00);
      goto LAB_00b8a588;
    }
  }
  iVar3 = -0x89;
LAB_00b8a588:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

