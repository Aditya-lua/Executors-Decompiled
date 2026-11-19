/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00904ddc
 */

void FUN_00904ddc(long param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined1 auStack_8c0 [8];
  undefined8 local_8b8;
  undefined8 local_8b0;
  undefined8 uStack_8a8;
  undefined8 local_8a0;
  undefined8 uStack_898;
  undefined1 *local_890;
  undefined1 **ppuStack_888;
  undefined1 *local_880;
  undefined8 uStack_878;
  undefined2 auStack_84c [1026];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_8b8 = param_4;
  local_8b0 = param_5;
  uStack_8a8 = param_6;
  local_8a0 = param_7;
  uStack_898 = param_8;
  if ((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) {
    puVar5 = *(undefined8 **)(param_1 + 0x12a0);
    if (puVar5 == (undefined8 *)0x0) {
      if (param_2 == (undefined8 *)0x0) goto LAB_00904f54;
    }
    else if ((param_2 == (undefined8 *)0x0) || (*(int *)(puVar5 + 1) < 1)) goto LAB_00904f54;
    puVar6 = (undefined8 *)*param_2;
    if (0 < *(int *)((long)puVar6 + 0xc)) {
      if (puVar5 == (undefined8 *)0x0) {
        iVar3 = 0;
      }
      else {
        iVar3 = curl_msnprintf(auStack_84c,0x800,"[%s] ",*puVar5);
        puVar6 = (undefined8 *)*param_2;
      }
      lVar1 = (long)auStack_84c + (long)iVar3;
      if (*(int *)(param_2 + 4) == 0) {
        iVar4 = curl_msnprintf(lVar1,(long)(0x800 - iVar3),"[%s] ",*puVar6);
      }
      else {
        iVar4 = curl_msnprintf(lVar1,(long)(0x800 - iVar3),"[%s-%d] ",*puVar6);
      }
      local_880 = auStack_8c0;
      ppuStack_888 = &local_890;
      uStack_878 = 0xffffff80ffffffd8;
      lVar1 = (long)iVar3 + (long)iVar4;
      iVar4 = (int)lVar1;
      local_890 = (undefined1 *)register0x00000008;
      iVar3 = curl_mvsnprintf((long)auStack_84c + lVar1,(long)(0x800 - iVar4),param_3,&local_890);
      lVar1 = (long)iVar3 + (long)iVar4;
      *(undefined2 *)((long)auStack_84c + lVar1) = 10;
      FUN_00904a98(param_1,0,auStack_84c,lVar1 + 1);
    }
  }
LAB_00904f54:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

