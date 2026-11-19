/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8a09c
 */

int psa_sign_hash_start(int *param_1,undefined4 param_2,uint param_3,void *param_4,size_t param_5)

{
  uint uVar1;
  long lVar2;
  ushort *puVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  void *__dest;
  ushort *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (*param_1 == 0) {
    if ((*(byte *)(param_1 + 2) & 1) == 0) {
      uVar1 = param_3 & 0xffffff00;
      if ((int)uVar1 < 0x6000900) {
        if (uVar1 != 0x6000200) {
          uVar6 = 0x300;
LAB_00b8a154:
          if ((uVar1 != (uVar6 | 0x6000000)) && ((param_3 >> 9 | 1) != 0x30003)) {
            *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
            iVar4 = -0x87;
            goto LAB_00b8a114;
          }
        }
      }
      else if (uVar1 != 0x6000900) {
        uVar6 = 0x1300;
        goto LAB_00b8a154;
      }
      iVar4 = FUN_00b86e5c(param_2,&local_50,0x1000);
      puVar3 = local_50;
      if (iVar4 == 0) {
        if ((~*local_50 & 0x7000) != 0) {
          __dest = (void *)0x0;
LAB_00b8a218:
          iVar4 = -0x87;
          goto LAB_00b8a21c;
        }
        if (param_5 == 0) {
          __dest = (void *)0x0;
        }
        else {
          __dest = calloc(param_5,1);
          if (__dest == (void *)0x0) {
            iVar4 = -0x8d;
            goto LAB_00b8a21c;
          }
          memcpy(__dest,param_4,param_5);
        }
        param_1[3] = 0;
        if (0xff < *(uint *)(puVar3 + 2)) goto LAB_00b8a218;
        *param_1 = 1;
        iVar4 = -0x86;
        *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
LAB_00b8a230:
        *param_1 = 0;
      }
      else {
        __dest = (void *)0x0;
LAB_00b8a21c:
        *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
        if (*param_1 != 0) goto LAB_00b8a230;
      }
      iVar5 = psa_unregister_read_under_mutex(local_50);
      if (iVar5 != 0) {
        *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) | 1;
      }
      free(__dest);
      goto LAB_00b8a114;
    }
  }
  iVar4 = -0x89;
LAB_00b8a114:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

