/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2a70
 */

int psa_its_set(long param_1,uint param_2,void *param_3,undefined4 param_4)

{
  long lVar1;
  int iVar2;
  int iVar3;
  FILE *__stream;
  size_t sVar4;
  int iVar5;
  undefined8 local_78;
  uint local_70;
  undefined4 uStack_6c;
  char acStack_64 [28];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_1 == 0) {
    iVar5 = -0x88;
    iVar3 = 0;
  }
  else {
    local_78 = 0x53544900415350;
    local_70 = param_2;
    uStack_6c = param_4;
    snprintf(acStack_64,0x19,"%s%08x%08x%s","",(uint)((ulong)param_1 >> 0x20),(uint)param_1,
             ".psa_its");
    __stream = fopen("tempfile.psa_its","wb");
    if (__stream == (FILE *)0x0) {
      iVar5 = -0x92;
    }
    else {
      setbuf(__stream,(char *)0x0);
      sVar4 = fwrite(&local_78,1,0x10,__stream);
      iVar3 = -0x8e;
      if (sVar4 == 0x10) {
        if ((param_2 == 0) || (sVar4 = fwrite(param_3,1,(ulong)param_2,__stream), sVar4 == param_2))
        {
          iVar3 = 0;
        }
        else {
          iVar3 = -0x8e;
        }
      }
      iVar2 = fclose(__stream);
      iVar5 = -0x8e;
      if (iVar2 == 0 || iVar3 != 0) {
        iVar5 = iVar3;
      }
      if (iVar2 == 0 && iVar3 == 0) {
        iVar3 = rename("tempfile.psa_its",acStack_64);
        iVar5 = 0;
        if (iVar3 != 0) {
          iVar5 = -0x92;
        }
      }
    }
    iVar3 = remove("tempfile.psa_its");
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar3);
  }
  return iVar5;
}

