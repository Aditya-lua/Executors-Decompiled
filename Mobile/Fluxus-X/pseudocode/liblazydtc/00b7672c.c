/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7672c
 */

undefined4 mbedtls_entropy_write_seed_file(undefined8 param_1,char *param_2)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  FILE *__stream;
  size_t sVar5;
  undefined4 uVar6;
  undefined1 auStack_78 [64];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = mbedtls_entropy_func(param_1,auStack_78,0x40);
  if (iVar2 == 0) {
    __stream = fopen(param_2,"wb");
    uVar6 = 0xffffffc1;
    if (__stream != (FILE *)0x0) {
      setbuf(__stream,(char *)0x0);
      sVar5 = fwrite(auStack_78,1,0x40,__stream);
      uVar6 = 0;
      if (sVar5 != 0x40) {
        uVar6 = 0xffffffc1;
      }
      mbedtls_platform_zeroize(auStack_78,0x40);
      uVar3 = fclose(__stream);
      uVar4 = (ulong)uVar3;
      goto LAB_00b767cc;
    }
  }
  else {
    uVar6 = 0xffffffc4;
  }
  uVar4 = mbedtls_platform_zeroize(auStack_78,0x40);
LAB_00b767cc:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return uVar6;
}

