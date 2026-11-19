/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b899a0
 */

int psa_verify_hash(undefined4 param_1,uint param_2,void *param_3,size_t param_4,void *param_5,
                   size_t param_6)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  void *__dest;
  void *__dest_00;
  uint uVar5;
  ushort *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (param_4 == 0) {
    __dest = (void *)0x0;
    if (param_6 == 0) goto LAB_00b89a3c;
LAB_00b89a0c:
    __dest_00 = calloc(param_6,1);
    if (__dest_00 == (void *)0x0) goto LAB_00b89b34;
    memcpy(__dest_00,param_5,param_6);
  }
  else {
    __dest = calloc(param_4,1);
    if (__dest == (void *)0x0) {
      __dest_00 = (void *)0x0;
LAB_00b89b34:
      iVar3 = -0x8d;
      goto LAB_00b89ba0;
    }
    memcpy(__dest,param_3,param_4);
    if (param_6 != 0) goto LAB_00b89a0c;
LAB_00b89a3c:
    __dest_00 = (void *)0x0;
  }
  uVar1 = param_2 & 0xffffff00;
  if ((int)uVar1 < 0x6000900) {
    if (uVar1 != 0x6000200) {
      uVar5 = 0x300;
      goto LAB_00b89a80;
    }
  }
  else if (uVar1 != 0x6000900) {
    uVar5 = 0x1300;
LAB_00b89a80:
    if ((uVar1 != (uVar5 | 0x6000000)) && ((param_2 >> 9 | 1) != 0x30003)) {
      iVar3 = -0x87;
      goto LAB_00b89ba0;
    }
  }
  iVar3 = FUN_00b86e5c(param_1,&local_60,0x2000,param_2);
  if (iVar3 != 0) goto LAB_00b89ba0;
  if (*(uint *)(local_60 + 2) < 0x100) {
    if ((*local_60 & 0xcfff) == 0x4001) {
      if (((uVar1 == 0x6000200) || (uVar1 == 0x6001300)) || (uVar1 == 0x6000300)) {
        iVar4 = mbedtls_psa_rsa_verify_hash();
LAB_00b89b78:
        iVar3 = psa_unregister_read_under_mutex(local_60);
        if (iVar4 != 0) {
          iVar3 = iVar4;
        }
        goto LAB_00b89ba0;
      }
      goto LAB_00b89b90;
    }
    if ((*local_60 & 0xcf00) == 0x4100) {
      if (param_2 >> 9 == 0x30003) {
        iVar4 = mbedtls_psa_ecdsa_verify_hash
                          (local_60,*(undefined8 *)(local_60 + 0x14),
                           *(undefined8 *)(local_60 + 0x18),param_2,__dest,param_4,__dest_00,param_6
                          );
        goto LAB_00b89b78;
      }
      goto LAB_00b89b90;
    }
    iVar3 = -0x86;
  }
  else {
LAB_00b89b90:
    iVar3 = -0x87;
  }
  psa_unregister_read_under_mutex();
LAB_00b89ba0:
  free(__dest);
  free(__dest_00);
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

