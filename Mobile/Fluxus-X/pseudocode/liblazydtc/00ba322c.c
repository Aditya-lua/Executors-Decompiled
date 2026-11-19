/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba322c
 */

void psa_get_and_lock_key_slot(undefined4 param_1,long *param_2)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  ulong uVar4;
  long lVar5;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  *param_2 = 0;
  if (DAT_00d26190 != '\x01') {
    uVar4 = 0xffffff77;
    goto LAB_00ba32f8;
  }
  uVar4 = FUN_00ba3388(param_1,param_2);
  if (((int)uVar4 != -0x8c) || (uVar4 = psa_reserve_free_key_slot(0,param_2), (int)uVar4 != 0))
  goto LAB_00ba32f8;
  lVar5 = *param_2;
  *(undefined4 *)(lVar5 + 0x14) = param_1;
  *(undefined4 *)(lVar5 + 4) = 1;
  local_48 = 0;
  uStack_40 = 0;
  uVar3 = psa_load_persistent_key(lVar5,&uStack_40,&local_48);
  if (uVar3 == 0) {
    uVar3 = psa_copy_key_material_into_slot(lVar5,uStack_40,local_48);
  }
  psa_free_persistent_key_data(uStack_40,local_48);
  lVar5 = *param_2;
  if (uVar3 == 0) {
    uVar3 = *(uint *)(lVar5 + 8);
    if ((uVar3 & 0x3000) != 0) {
      *(uint *)(lVar5 + 8) = uVar3 >> 2 & 0x400 | uVar3 | uVar3 >> 2 & 0x800;
    }
    if (*(int *)(lVar5 + 0x18) == 2) {
LAB_00ba335c:
      if (*(long *)(lVar5 + 0x20) != -1) {
        uVar4 = 0;
        *(long *)(lVar5 + 0x20) = *(long *)(lVar5 + 0x20) + 1;
        goto LAB_00ba32f8;
      }
    }
    else if (*(int *)(lVar5 + 0x18) == 1) {
      *(undefined4 *)(lVar5 + 0x18) = 2;
      goto LAB_00ba335c;
    }
    uVar4 = 0xffffff69;
  }
  else {
    psa_wipe_key_slot(lVar5);
    uVar1 = 0xffffff78;
    if (uVar3 != 0xffffff74) {
      uVar1 = uVar3;
    }
    uVar4 = (ulong)uVar1;
    if (uVar1 == 0) goto LAB_00ba32f8;
  }
  *param_2 = 0;
LAB_00ba32f8:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

