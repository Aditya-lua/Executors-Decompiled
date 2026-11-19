/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b767f8
 */

int mbedtls_entropy_update_seed_file(undefined8 param_1,char *param_2)

{
  long lVar1;
  int iVar2;
  FILE *__stream;
  size_t __n;
  size_t sVar3;
  undefined1 auStack_448 [1024];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  __stream = fopen(param_2,"rb");
  if (__stream == (FILE *)0x0) {
    iVar2 = -0x3f;
  }
  else {
    setbuf(__stream,(char *)0x0);
    fseek(__stream,0,2);
    __n = ftell(__stream);
    fseek(__stream,0,0);
    if (0x3ff < __n) {
      __n = 0x400;
    }
    sVar3 = fread(auStack_448,1,__n,__stream);
    if (sVar3 == __n) {
      iVar2 = FUN_00b762e0(param_1,0x14,auStack_448,__n);
    }
    else {
      iVar2 = -0x3f;
    }
    fclose(__stream);
    mbedtls_platform_zeroize(auStack_448,0x400);
    if (iVar2 == 0) {
      iVar2 = mbedtls_entropy_write_seed_file(param_1,param_2);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

