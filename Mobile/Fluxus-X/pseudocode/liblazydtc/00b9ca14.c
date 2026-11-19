/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9ca14
 */

ulong mbedtls_hmac_drbg_update_seed_file(undefined8 param_1,char *param_2)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  FILE *__stream;
  size_t sVar4;
  size_t sVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  undefined1 auStack_15c [4];
  undefined1 auStack_158 [264];
  
  lVar1 = tpidr_el0;
  lVar8 = *(long *)(lVar1 + 0x28);
  __stream = fopen(param_2,"rb");
  if (__stream == (FILE *)0x0) {
    uVar9 = 0xfffffff9;
    uVar7 = 0;
  }
  else {
    setbuf(__stream,(char *)0x0);
    sVar4 = fread(auStack_158,1,0x100,__stream);
    sVar5 = fread(auStack_15c,1,1,__stream);
    if (sVar5 == 0) {
      if ((sVar4 != 0) && (iVar2 = ferror(__stream), iVar2 == 0)) {
        fclose(__stream);
        uVar6 = mbedtls_hmac_drbg_update(param_1,auStack_158,sVar4);
        uVar9 = uVar6 & 0xffffffff;
        uVar7 = mbedtls_platform_zeroize(auStack_158,0x100);
        if ((int)uVar6 == 0) {
          uVar7 = mbedtls_hmac_drbg_write_seed_file(param_1,param_2);
          uVar9 = uVar7 & 0xffffffff;
        }
        goto LAB_00b9cad4;
      }
      uVar9 = 0xfffffff9;
    }
    else {
      uVar9 = 0xfffffffb;
    }
    mbedtls_platform_zeroize(auStack_158,0x100);
    uVar3 = fclose(__stream);
    uVar7 = (ulong)uVar3;
  }
LAB_00b9cad4:
  if (*(long *)(lVar1 + 0x28) != lVar8) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return uVar9;
}

