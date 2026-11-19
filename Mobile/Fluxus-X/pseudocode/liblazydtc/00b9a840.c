/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9a840
 */

void mbedtls_psa_ecdsa_sign_hash
               (undefined2 *param_1,undefined8 param_2,undefined8 param_3,uint param_4,
               undefined8 param_5,undefined8 param_6,long param_7,ulong param_8,ulong *param_9)

{
  uint uVar1;
  long lVar2;
  void *__ptr;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  undefined1 auStack_90 [16];
  undefined1 auStack_80 [16];
  void *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_70 = (void *)0x0;
  iVar3 = mbedtls_psa_ecp_load_representation(*param_1,param_1[1],param_2,param_3,&local_70);
  __ptr = local_70;
  if (iVar3 != 0) goto LAB_00b9aa04;
  uVar5 = *(long *)((long)local_70 + 0x78) + 7U >> 3;
  mbedtls_mpi_init(auStack_80);
  mbedtls_mpi_init(auStack_90);
  if (param_8 < uVar5 * 2) {
    iVar3 = -0x4f00;
  }
  else {
    if ((param_4 >> 8 & 1) == 0) {
      iVar3 = mbedtls_ecdsa_sign(__ptr,auStack_80,auStack_90,(long)__ptr + 0xc0,param_5,param_6,
                                 mbedtls_psa_get_random,0);
    }
    else {
      uVar1 = param_4 & 0xffffff00;
      if ((int)uVar1 < 0x6000900) {
        if (uVar1 == 0x6000200) goto LAB_00b9a970;
        uVar4 = 0x300;
LAB_00b9a950:
        if ((uVar1 == (uVar4 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b9a970;
        param_4 = 0;
      }
      else {
        if (uVar1 != 0x6000900) {
          uVar4 = 0x1300;
          goto LAB_00b9a950;
        }
LAB_00b9a970:
        param_4 = param_4 & 0xff;
      }
      iVar3 = mbedtls_ecdsa_sign_det_ext
                        (__ptr,auStack_80,auStack_90,(long)__ptr + 0xc0,param_5,param_6,param_4,
                         mbedtls_psa_get_random,0);
    }
    if ((iVar3 == 0) && (iVar3 = mbedtls_mpi_write_binary(auStack_80,param_7,uVar5), iVar3 == 0)) {
      iVar3 = mbedtls_mpi_write_binary(auStack_90,param_7 + uVar5,uVar5);
    }
  }
  mbedtls_mpi_free(auStack_80);
  mbedtls_mpi_free(auStack_90);
  if (iVar3 == 0) {
    *param_9 = uVar5 * 2;
  }
  mbedtls_ecp_keypair_free(__ptr);
  free(__ptr);
  mbedtls_to_psa_error(iVar3);
LAB_00b9aa04:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

