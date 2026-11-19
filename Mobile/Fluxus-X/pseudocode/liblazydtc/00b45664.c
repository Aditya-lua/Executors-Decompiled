/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b45664
 */

bool FUN_00b45664(long param_1,long param_2,undefined8 *param_3)

{
  bool bVar1;
  int iVar2;
  undefined1 auStack_68 [56];
  
  if (param_2 == 0) {
    iVar2 = WPACKET_init_null(auStack_68);
  }
  else {
    iVar2 = WPACKET_init_static_len(auStack_68,param_2,*param_3,0);
  }
  if (iVar2 == 0) {
    bVar1 = false;
  }
  else {
    for (; param_1 != 0; param_1 = OSSL_PARAM_locate_const(param_1 + 0x28,&DAT_0029e225)) {
      if ((*(int *)(param_1 + 8) != 5) ||
         (((*(long *)(param_1 + 0x10) != 0 && (*(long *)(param_1 + 0x18) != 0)) &&
          (iVar2 = WPACKET_memcpy(auStack_68), iVar2 == 0)))) goto LAB_00b45718;
    }
    iVar2 = WPACKET_get_total_written(auStack_68,param_3);
    if (iVar2 == 0) {
LAB_00b45718:
      bVar1 = false;
    }
    else {
      iVar2 = WPACKET_finish(auStack_68);
      bVar1 = iVar2 != 0;
    }
    WPACKET_cleanup(auStack_68);
  }
  return bVar1;
}

