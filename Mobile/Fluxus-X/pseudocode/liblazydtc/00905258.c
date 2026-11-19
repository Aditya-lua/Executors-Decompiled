/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00905258
 */

void FUN_00905258(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  undefined8 local_8f0;
  undefined8 uStack_8e8;
  undefined8 local_8e0;
  undefined8 uStack_8d8;
  undefined8 local_8d0;
  undefined8 uStack_8c8;
  undefined1 *local_8c0;
  undefined1 **ppuStack_8b8;
  undefined8 *puStack_8b0;
  undefined8 uStack_8a8;
  undefined1 *local_880;
  undefined1 **ppuStack_878;
  undefined8 *puStack_870;
  undefined8 uStack_868;
  undefined1 auStack_85c [2052];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_8f0 = param_3;
  uStack_8e8 = param_4;
  local_8e0 = param_5;
  uStack_8d8 = param_6;
  local_8d0 = param_7;
  uStack_8c8 = param_8;
  if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46c0)) {
    puStack_8b0 = &local_8f0;
    ppuStack_8b8 = &local_8c0;
    uStack_8a8 = 0xffffff80ffffffd0;
    local_8c0 = (undefined1 *)register0x00000008;
    iVar3 = curl_msnprintf(auStack_85c,0x800,"[%s] ",PTR_DAT_00cc46b8);
    ppuStack_878 = ppuStack_8b8;
    local_880 = local_8c0;
    uStack_868 = uStack_8a8;
    puStack_870 = puStack_8b0;
    iVar4 = curl_mvsnprintf(auStack_85c + iVar3,(long)(0x800 - iVar3),param_2,&local_880);
    lVar1 = (long)iVar3 + (long)iVar4;
    auStack_85c[lVar1] = 10;
    auStack_85c[(long)(int)lVar1 + 1] = 0;
    FUN_00904a98(param_1,0,auStack_85c);
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

