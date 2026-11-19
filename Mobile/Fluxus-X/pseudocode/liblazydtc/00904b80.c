/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00904b80
 */

void FUN_00904b80(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  int iVar2;
  undefined8 local_1c0;
  undefined8 uStack_1b8;
  undefined8 local_1b0;
  undefined8 uStack_1a8;
  undefined8 local_1a0;
  undefined8 uStack_198;
  undefined1 *local_190;
  undefined1 **ppuStack_188;
  undefined8 *puStack_180;
  undefined8 uStack_178;
  char acStack_14c [260];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_1c0 = param_3;
  uStack_1b8 = param_4;
  local_1b0 = param_5;
  uStack_1a8 = param_6;
  local_1a0 = param_7;
  uStack_198 = param_8;
  if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) || (*(long *)(param_1 + 0x1c8) != 0)) {
    puStack_180 = &local_1c0;
    ppuStack_188 = &local_190;
    uStack_178 = 0xffffff80ffffffd0;
    local_190 = (undefined1 *)register0x00000008;
    iVar2 = curl_mvsnprintf(acStack_14c,0x100,param_2,&local_190);
    if ((*(char **)(param_1 + 0x1c8) != (char *)0x0) &&
       ((*(byte *)(param_1 + 0x131c) >> 3 & 1) == 0)) {
      strcpy(*(char **)(param_1 + 0x1c8),acStack_14c);
      *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 8;
    }
    (acStack_14c + iVar2)[0] = '\n';
    (acStack_14c + iVar2)[1] = '\0';
    FUN_00904a98(param_1,0,acStack_14c,(long)iVar2 + 1);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

