/* 7ff70c98fcb0 FUN_7ff70c98fcb0 */

ulonglong FUN_7ff70c98fcb0(longlong param_1)

{
  ulonglong uVar1;
  
  *(undefined8 *)(param_1 + 0xa70) = 0;
  uVar1 = FUN_7ff70c98fd10();
  if ((int)uVar1 != 0) {
    return uVar1;
  }
  if (((*(byte *)(param_1 + 0xaa4) & 0x10) == 0) && (*(char *)(param_1 + 0xbf4) == '\0')) {
    uVar1 = uVar1 & 0xffffffff;
    FUN_7ff70c95c3b0(*(undefined8 *)(param_1 + 0x1d8),&UNK_7ff70cb92381);
  }
  *(undefined4 *)(param_1 + 0xbf0) = 0;
  return uVar1;
}


