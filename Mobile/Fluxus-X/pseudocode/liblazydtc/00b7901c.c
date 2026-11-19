/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7901c
 */

int mbedtls_md_file(long param_1,char *param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  FILE *__stream;
  size_t sVar3;
  undefined8 local_460;
  undefined8 uStack_458;
  undefined8 local_450;
  undefined1 auStack_448 [1024];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_1 == 0) {
    iVar2 = -0x5100;
  }
  else {
    __stream = fopen(param_2,"rb");
    if (__stream == (FILE *)0x0) {
      iVar2 = -0x5200;
    }
    else {
      setbuf(__stream,(char *)0x0);
      local_460 = 0;
      uStack_458 = 0;
      local_450 = 0;
      iVar2 = mbedtls_md_setup(&local_460,param_1,0);
      if (iVar2 == 0) {
        iVar2 = mbedtls_md_starts(&local_460);
        while (iVar2 == 0) {
          sVar3 = fread(auStack_448,1,0x400,__stream);
          if (sVar3 == 0) {
            iVar2 = ferror(__stream);
            if (iVar2 == 0) {
              iVar2 = mbedtls_md_finish(&local_460,param_3);
            }
            else {
              iVar2 = -0x5200;
            }
            break;
          }
          iVar2 = mbedtls_md_update(&local_460,auStack_448,sVar3);
        }
      }
      mbedtls_platform_zeroize(auStack_448,0x400);
      fclose(__stream);
      mbedtls_md_free(&local_460);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

