/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00823c6c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00823c6c(undefined8 param_1)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  undefined8 uVar4;
  char *__s1;
  
  uVar2 = FUN_007fcb88();
  if (((uVar2 & 1) != 0) && (iVar1 = FUN_008ab45c(param_1,1), iVar1 != 0)) {
    lVar3 = FUN_008abd78(param_1,1);
    if ((lVar3 == DAT_00d1ca98) && (__s1 = (char *)FUN_008abbf0(param_1,0), __s1 != (char *)0x0)) {
      if (((DAT_00d1d010 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1d010), iVar1 != 0)) {
        DAT_00d1d008 = '\x01';
        DAT_00d1d000 = 0x9b15a604336bfda5;
        __cxa_atexit(&LAB_00828454,&DAT_00d1d000,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1d010);
      }
      if (DAT_00d1d008 == '\x01') {
        DAT_00d1d008 = '\0';
        DAT_00d1d000 = DAT_00d1d000 ^ 0x9b61c343431f89ed;
      }
      iVar1 = strcmp(__s1,(char *)&DAT_00d1d000);
      if (iVar1 != 0) {
        if (((DAT_00d1d028 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1d028), iVar1 != 0)) {
          DAT_00d1d018 = 0xda15a604336bfda5;
          DAT_00d1d020 = 0x2071f09e;
          _DAT_00d1d024 = 0x143;
          __cxa_atexit(&LAB_0082845c,&DAT_00d1d018,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00d1d028);
        }
        if (DAT_00d1d025 == '\x01') {
          _DAT_00d1d024 = (ushort)(DAT_00d1d024 ^ 0x43);
          DAT_00d1d018 = DAT_00d1d018 ^ 0x9b61c343431f89ed;
          DAT_00d1d020 = DAT_00d1d020 ^ 0x431f89ed;
        }
        iVar1 = strcmp(__s1,(char *)&DAT_00d1d018);
        if (iVar1 != 0) goto LAB_00823cb0;
      }
      FUN_0082766c(param_1);
      return 1;
    }
  }
LAB_00823cb0:
                    /* WARNING: Could not recover jumptable at 0x00823cc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar4 = (*DAT_00d1caa0)(param_1);
  return uVar4;
}

