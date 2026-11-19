/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094b518
 */

int FUN_0094b518(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  int iVar2;
  char *__s;
  size_t sVar3;
  char *pcVar4;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined1 *local_a0;
  undefined1 **ppuStack_98;
  undefined8 *puStack_90;
  undefined8 uStack_88;
  long local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  puStack_90 = &local_d0;
  ppuStack_98 = &local_a0;
  uStack_88 = 0xffffff80ffffffd0;
  local_d0 = param_3;
  uStack_c8 = param_4;
  local_c0 = param_5;
  uStack_b8 = param_6;
  local_b0 = param_7;
  uStack_a8 = param_8;
  local_a0 = (undefined1 *)register0x00000008;
  __s = (char *)curl_mvaprintf(param_2,&local_a0);
  if (__s == (char *)0x0) {
    iVar2 = 0x1b;
  }
  else {
    local_60 = 0;
    sVar3 = strlen(__s);
    iVar2 = FUN_009434ec(param_1,__s,sVar3,&local_60);
    if (iVar2 == 0) {
      pcVar4 = __s;
      do {
        FUN_00904a98(param_1,4,pcVar4,local_60);
        sVar3 = sVar3 - local_60;
        if (sVar3 == 0) {
          iVar2 = 0;
          break;
        }
        pcVar4 = pcVar4 + local_60;
        iVar2 = FUN_009434ec(param_1,pcVar4,sVar3,&local_60);
      } while (iVar2 == 0);
    }
    (*(code *)PTR_free_00cc4678)(__s);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

