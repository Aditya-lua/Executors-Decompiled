/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080df10
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0080df10(void)

{
  int iVar1;
  
  if (((DAT_00d1b848 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b848), iVar1 != 0)) {
    uRam0000000000d1b810 = 0xfcd9f23f41e7beb7;
    _DAT_00d1b808 = 0xb9dcf63805b3bfb6;
    uRam0000000000d1b820 = 0xeacae63b00e5a1ac;
    _DAT_00d1b818 = 0xb9c7f4220efdb4f9;
    uRam0000000000d1b830 = 0x390efaa5b8;
    _DAT_00d1b828 = 0xf7c6e72404f7f9f9;
    uRam0000000000d1b83d = 0x5748f7f4e4fccce1;
    _DAT_00d1b835 = 0xfd8aae;
    uRam0000000000d1b838 = 0x220ee0f1f5;
    DAT_00d1b845 = 1;
    uRam0000000000d1b7f0 = 0xfccbb36d0ffcb8ad;
    _DAT_00d1b7e8 = 0xfac1e6310afcbeb1;
    uRam0000000000d1b800 = 0xf0dbf03914f5f1b7;
    _DAT_00d1b7f8 = 0xf6c6e7360ffaa5aa;
    __cxa_atexit(&LAB_0080e9d4,&DAT_00d1b7e8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b848);
    return;
  }
  return;
}

