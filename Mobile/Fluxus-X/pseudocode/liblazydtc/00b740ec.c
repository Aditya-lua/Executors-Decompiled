/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b740ec
 */

int mbedtls_ctr_drbg_write_seed_file(undefined8 param_1,char *param_2)

{
  long lVar1;
  int iVar2;
  int iVar3;
  FILE *__stream;
  size_t sVar4;
  undefined1 auStack_138 [256];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  __stream = fopen(param_2,"wb");
  if (__stream == (FILE *)0x0) {
    iVar2 = -0x3a;
    iVar3 = 0;
  }
  else {
    setbuf(__stream,(char *)0x0);
    iVar2 = mbedtls_ctr_drbg_random_with_add(param_1,auStack_138,0x100,0,0);
    if (iVar2 == 0) {
      sVar4 = fwrite(auStack_138,1,0x100,__stream);
      iVar2 = 0;
      if (sVar4 != 0x100) {
        iVar2 = -0x3a;
      }
    }
    mbedtls_platform_zeroize(auStack_138,0x100);
    iVar3 = fclose(__stream);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar3);
  }
  return iVar2;
}

