/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6d0d0
 */

void mbedtls_chachapoly_update(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  undefined7 uStack_58;
  undefined1 local_51;
  undefined7 uStack_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (*(int *)(param_1 + 0xe8) - 1U < 2) {
    if (*(int *)(param_1 + 0xe8) == 1) {
      *(undefined4 *)(param_1 + 0xe8) = 2;
      uVar1 = *(uint *)(param_1 + 0xd8) & 0xf;
      if (uVar1 != 0) {
        uStack_50 = 0;
        uStack_58 = 0;
        local_51 = 0;
        uVar4 = mbedtls_poly1305_update(param_1 + 0x88,&uStack_58,0x10 - uVar1);
        if ((int)uVar4 != 0) goto LAB_00b6d198;
      }
    }
    *(long *)(param_1 + 0xe0) = *(long *)(param_1 + 0xe0) + param_2;
    if (*(int *)(param_1 + 0xec) == 0) {
      uVar4 = mbedtls_chacha20_update(param_1,param_2,param_3,param_4);
      if ((int)uVar4 != 0) goto LAB_00b6d198;
      uVar4 = mbedtls_poly1305_update(param_1 + 0x88,param_4,param_2);
      iVar3 = (int)uVar4;
    }
    else {
      uVar4 = mbedtls_poly1305_update(param_1 + 0x88,param_3,param_2);
      if ((int)uVar4 != 0) goto LAB_00b6d198;
      uVar4 = mbedtls_chacha20_update(param_1,param_2,param_3,param_4);
      iVar3 = (int)uVar4;
    }
    if (iVar3 == 0) {
      uVar4 = 0;
    }
  }
  else {
    uVar4 = 0xffffffac;
  }
LAB_00b6d198:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

