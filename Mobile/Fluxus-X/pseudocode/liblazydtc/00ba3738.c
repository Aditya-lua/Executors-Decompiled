/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba3738
 */

int psa_purge_key(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  iVar2 = FUN_00ba3388(param_1,&local_30);
  if (iVar2 != 0) goto LAB_00ba37d4;
  if (*(char *)(local_30 + 4) == '\0') {
    if (local_30 == 0) {
      iVar2 = 0;
      goto LAB_00ba37d4;
    }
LAB_00ba3784:
    if ((*(uint *)(local_30 + 0x18) & 0xfffffffe) == 2) {
      lVar3 = *(long *)(local_30 + 0x20);
      if ((*(uint *)(local_30 + 0x18) == 3) && (lVar3 == 1)) goto LAB_00ba37a8;
      if (lVar3 != 0) {
        iVar2 = 0;
        *(long *)(local_30 + 0x20) = lVar3 + -1;
        goto LAB_00ba37d4;
      }
    }
    iVar2 = -0x97;
  }
  else {
    if (*(long *)(local_30 + 0x20) != 1) goto LAB_00ba3784;
LAB_00ba37a8:
    iVar2 = psa_wipe_key_slot();
  }
LAB_00ba37d4:
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

