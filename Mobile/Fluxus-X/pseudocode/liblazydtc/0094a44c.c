/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094a44c
 */

void FUN_0094a44c(undefined8 param_1,long param_2,long param_3)

{
  long lVar1;
  char *pcVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  undefined4 *puVar6;
  undefined8 uVar7;
  char *local_148;
  char *local_140;
  undefined1 auStack_138 [256];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar3 = curl_url_get(param_1,10,&local_140,0);
  if ((iVar3 == 0) && (local_140 != (char *)0x0)) {
    uVar5 = strtoul(local_140,&local_148,10);
    if ((uVar5 < 0xffffffff) && (*local_148 == '\0')) {
      *(int *)(param_3 + 0x568) = (int)uVar5;
    }
    else {
      uVar4 = if_nametoindex(local_140);
      pcVar2 = local_140;
      if (uVar4 == 0) {
        if (((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
           ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
        {
          puVar6 = (undefined4 *)__errno();
          uVar7 = FUN_00941a94(*puVar6,auStack_138,0x100);
          FUN_00904c98(param_2,"Invalid zoneid: %s; %s",pcVar2,uVar7);
        }
      }
      else {
        *(uint *)(param_3 + 0x568) = uVar4;
      }
    }
    (*(code *)PTR_free_00cc4678)(local_140);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

