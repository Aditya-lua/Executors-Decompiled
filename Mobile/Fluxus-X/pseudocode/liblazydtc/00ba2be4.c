/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2be4
 */

void psa_its_remove(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  FILE *__stream;
  undefined4 uVar3;
  char acStack_44 [28];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  snprintf(acStack_44,0x19,"%s%08x%08x%s","",(uint)((ulong)param_1 >> 0x20),(uint)param_1,".psa_its"
          );
  __stream = fopen(acStack_44,"rb");
  if (__stream == (FILE *)0x0) {
    uVar3 = 0xffffff74;
  }
  else {
    fclose(__stream);
    iVar2 = remove(acStack_44);
    uVar3 = 0;
    if (iVar2 != 0) {
      uVar3 = 0xffffff6e;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

