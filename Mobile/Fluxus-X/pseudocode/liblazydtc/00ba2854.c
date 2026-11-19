/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2854
 */

void FUN_00ba2854(undefined8 param_1,undefined8 *param_2,undefined8 *param_3)

{
  long lVar1;
  FILE *__stream;
  size_t sVar2;
  undefined8 uVar3;
  long local_68;
  undefined8 local_60;
  char acStack_54 [28];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  *param_3 = 0;
  snprintf(acStack_54,0x19,"%s%08x%08x%s","",(uint)((ulong)param_1 >> 0x20),(uint)param_1,".psa_its"
          );
  __stream = fopen(acStack_54,"rb");
  *param_3 = __stream;
  if (__stream == (FILE *)0x0) {
    uVar3 = 0xffffff74;
  }
  else {
    setbuf(__stream,(char *)0x0);
    sVar2 = fread(&local_68,1,0x10,(FILE *)*param_3);
    if ((sVar2 == 0x10) && (local_68 == 0x53544900415350)) {
      uVar3 = 0;
      *param_2 = local_60;
    }
    else {
      uVar3 = 0xffffff68;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

