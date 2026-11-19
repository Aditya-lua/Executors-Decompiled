/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00904c98
 */

void FUN_00904c98(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  undefined8 local_8e0;
  undefined8 uStack_8d8;
  undefined8 local_8d0;
  undefined8 uStack_8c8;
  undefined8 local_8c0;
  undefined8 uStack_8b8;
  undefined1 *local_8b0;
  undefined1 **ppuStack_8a8;
  undefined8 *puStack_8a0;
  undefined8 uStack_898;
  undefined1 *local_870;
  undefined1 **ppuStack_868;
  undefined8 *puStack_860;
  undefined8 uStack_858;
  undefined1 auStack_84c [2052];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_8e0 = param_3;
  uStack_8d8 = param_4;
  local_8d0 = param_5;
  uStack_8c8 = param_6;
  local_8c0 = param_7;
  uStack_8b8 = param_8;
  if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
     ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    puStack_8a0 = &local_8e0;
    ppuStack_8a8 = &local_8b0;
    uStack_898 = 0xffffff80ffffffd0;
    local_8b0 = (undefined1 *)register0x00000008;
    if (*(undefined8 **)(param_1 + 0x12a0) == (undefined8 *)0x0) {
      iVar3 = 0;
    }
    else {
      iVar3 = curl_msnprintf(auStack_84c,0x800,"[%s] ",**(undefined8 **)(param_1 + 0x12a0));
    }
    ppuStack_868 = ppuStack_8a8;
    local_870 = local_8b0;
    uStack_858 = uStack_898;
    puStack_860 = puStack_8a0;
    iVar4 = curl_mvsnprintf(auStack_84c + iVar3,(long)(0x800 - iVar3),param_2,&local_870);
    lVar1 = (long)iVar3 + (long)iVar4;
    auStack_84c[lVar1] = 10;
    auStack_84c[(long)(int)lVar1 + 1] = 0;
    FUN_00904a98(param_1,0,auStack_84c);
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

