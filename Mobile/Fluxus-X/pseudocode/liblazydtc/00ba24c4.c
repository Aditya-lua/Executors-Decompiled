/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba24c4
 */

int psa_save_persistent_key(undefined2 *param_1,void *param_2,ulong param_3)

{
  size_t __size;
  undefined4 uVar1;
  long lVar2;
  int iVar3;
  undefined8 *puVar4;
  uint local_60 [2];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  iVar3 = -0x87;
  if ((param_2 == (void *)0x0) || (param_3 == 0)) goto LAB_00ba25f8;
  if (param_3 >> 0xd != 0) {
    iVar3 = -0x8e;
    goto LAB_00ba25f8;
  }
  __size = param_3 + 0x24;
  puVar4 = calloc(1,__size);
  if (puVar4 == (undefined8 *)0x0) {
    iVar3 = -0x8d;
    goto LAB_00ba25f8;
  }
  *puVar4 = 0x59454b00415350;
  *(undefined4 *)((long)puVar4 + 0xc) = *(undefined4 *)(param_1 + 2);
  *(undefined2 *)(puVar4 + 2) = *param_1;
  *(undefined2 *)((long)puVar4 + 0x12) = param_1[1];
  *(undefined8 *)((long)puVar4 + 0x14) = *(undefined8 *)(param_1 + 4);
  *(undefined4 *)((long)puVar4 + 0x1c) = *(undefined4 *)(param_1 + 8);
  *(int *)(puVar4 + 4) = (int)param_3;
  memcpy((void *)((long)puVar4 + 0x24),param_2,param_3);
  uVar1 = *(undefined4 *)(param_1 + 10);
  iVar3 = psa_its_get_info(uVar1,local_60);
  if (iVar3 == -0x8c) {
    iVar3 = psa_its_set(uVar1,__size & 0xffffffff,puVar4,0);
    if (iVar3 == 0) {
      iVar3 = psa_its_get_info(uVar1,local_60);
      if (iVar3 == 0) {
        if (__size == local_60[0]) goto LAB_00ba25ec;
        iVar3 = -0x99;
      }
      psa_its_remove(uVar1);
    }
    else {
      iVar3 = -0x99;
    }
  }
  else {
    iVar3 = -0x8b;
  }
LAB_00ba25ec:
  mbedtls_zeroize_and_free(puVar4,__size);
LAB_00ba25f8:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

