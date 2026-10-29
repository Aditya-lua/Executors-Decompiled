/* 7ff70c94f050 FUN_7ff70c94f050 */

undefined1 FUN_7ff70c94f050(longlong param_1)

{
  undefined1 uVar1;
  
  if ((*(longlong *)(param_1 + 0xd8) == 0) ||
     (uVar1 = 1, *(char *)(*(longlong *)(param_1 + 0xd8) + 0x1b3) == '\0')) {
    if (*(longlong *)(param_1 + 0xe0) == 0) {
      return 0;
    }
    uVar1 = *(undefined1 *)(*(longlong *)(param_1 + 0xe0) + 0x1b3);
  }
  return uVar1;
}


