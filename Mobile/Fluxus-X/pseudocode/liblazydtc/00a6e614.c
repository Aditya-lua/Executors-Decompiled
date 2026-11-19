/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e614
 */

ulong FUN_00a6e614(long param_1,undefined8 param_2,int param_3,undefined4 *param_4)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  code *UNRECOVERED_JUMPTABLE;
  undefined4 local_84;
  undefined1 auStack_80 [80];
  
  if (*(long *)(param_1 + 8) == 0) {
    if (*(long *)(param_1 + 0x60) != 0) {
      if ((int)param_2 != 3) goto LAB_00a6e718;
      memset(auStack_80,0,0x50);
      uVar1 = EVP_PKEY_get_default_digest_name(param_1,auStack_80,0x50);
      if ((int)uVar1 < 1) {
        return (ulong)uVar1;
      }
      uVar4 = ossl_provider_libctx(*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x18));
      local_84 = 0;
      ERR_set_mark();
      uVar5 = EVP_MD_fetch(uVar4,auStack_80,0);
      ERR_pop_to_mark();
      uVar4 = ossl_namemap_stored(uVar4);
      EVP_MD_free(uVar5);
      iVar2 = ossl_namemap_name2num(uVar4,auStack_80);
      if ((iVar2 != 0) &&
         (iVar2 = ossl_namemap_doall_names(uVar4,iVar2,FUN_00a6fb78,&local_84), iVar2 != 0)) {
        *param_4 = local_84;
        return (ulong)uVar1;
      }
    }
    uVar3 = 0;
  }
  else {
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 8) + 0xb0);
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a6e65c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (*UNRECOVERED_JUMPTABLE)(param_1,param_2,(long)param_3,param_4);
      return uVar3;
    }
LAB_00a6e718:
    uVar3 = 0xfffffffe;
  }
  return uVar3;
}

