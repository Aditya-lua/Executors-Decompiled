/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00384
 */

size_t FUN_00a00384(long param_1,void *param_2,int param_3)

{
  uint uVar1;
  size_t sVar2;
  undefined4 *puVar3;
  
  sVar2 = 0;
  if (((param_2 != (void *)0x0) && (*(int *)(param_1 + 0x28) != 0)) &&
     (sVar2 = fread(param_2,1,(long)param_3,*(FILE **)(param_1 + 0x40)), (int)sVar2 == 0)) {
    uVar1 = ferror(*(FILE **)(param_1 + 0x40));
    sVar2 = (size_t)uVar1;
    if (uVar1 != 0) {
      ERR_new();
      ERR_set_debug("crypto/bio/bss_file.c",0x94,"file_read");
      puVar3 = (undefined4 *)__errno();
      ERR_set_error(2,*puVar3,"calling fread()");
      ERR_new();
      ERR_set_debug("crypto/bio/bss_file.c",0x96,"file_read");
      ERR_set_error(0x20,0x80002,0);
      sVar2 = 0xffffffff;
    }
  }
  return sVar2;
}

