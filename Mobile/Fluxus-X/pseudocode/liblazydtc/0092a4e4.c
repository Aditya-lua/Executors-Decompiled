/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092a4e4
 */

void curl_mvaprintf(undefined8 param_1,undefined8 *param_2)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined1 auStack_68 [32];
  undefined1 *local_48;
  char local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_48 = auStack_68;
  FUN_00904528(auStack_68,&fde_table_entry_007a1200);
  local_40 = '\0';
  uStack_78 = param_2[3];
  local_80 = param_2[2];
  uStack_88 = param_2[1];
  local_90 = *param_2;
  FUN_00929028(&local_48,&LAB_0092a464,param_1,&local_90);
  if (local_40 == '\0') {
    lVar3 = FUN_00904984(local_48);
    if (lVar3 == 0) {
      uVar2 = (*(code *)PTR_strdup_00cc4688)(&DAT_002ab32c);
    }
    else {
      uVar2 = FUN_00904974(local_48);
    }
  }
  else {
    FUN_00904534();
    uVar2 = 0;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

