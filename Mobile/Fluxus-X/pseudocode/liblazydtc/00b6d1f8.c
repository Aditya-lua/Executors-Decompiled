/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6d1f8
 */

void mbedtls_chachapoly_finish(long param_1,undefined8 param_2)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  undefined7 local_48;
  undefined1 uStack_41;
  undefined7 local_40;
  undefined1 uStack_39;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  iVar1 = *(int *)(param_1 + 0xe8);
  if (iVar1 == 0) {
    uVar4 = 0xffffffac;
    goto LAB_00b6d2b8;
  }
  if (iVar1 == 2) {
    uVar2 = *(uint *)(param_1 + 0xe0);
joined_r0x00b6d250:
    if ((uVar2 & 0xf) != 0) {
      local_40 = 0;
      local_48 = 0;
      uStack_41 = 0;
      uVar4 = mbedtls_poly1305_update(param_1 + 0x88,&local_48,0x10 - (uVar2 & 0xf));
      if ((int)uVar4 != 0) goto LAB_00b6d2b8;
    }
  }
  else if (iVar1 == 1) {
    uVar2 = *(uint *)(param_1 + 0xd8);
    goto joined_r0x00b6d250;
  }
  *(undefined4 *)(param_1 + 0xe8) = 3;
  local_48 = (undefined7)*(undefined8 *)(param_1 + 0xd8);
  uStack_41 = (undefined1)((ulong)*(undefined8 *)(param_1 + 0xd8) >> 0x38);
  local_40 = (undefined7)*(undefined8 *)(param_1 + 0xe0);
  uStack_39 = (undefined1)((ulong)*(undefined8 *)(param_1 + 0xe0) >> 0x38);
  uVar4 = mbedtls_poly1305_update(param_1 + 0x88,&local_48,0x10);
  if ((int)uVar4 == 0) {
    uVar4 = mbedtls_poly1305_finish(param_1 + 0x88,param_2);
  }
LAB_00b6d2b8:
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

