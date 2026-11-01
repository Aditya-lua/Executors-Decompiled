
char * FUN_006ef310(long param_1)

{
  char *pcVar1;
  int in_w8;
  
  if (in_w8 == 2) {
    pcVar1 = (char *)func_0x006e2ce4(*(undefined8 *)(param_1 + 8),0xffffffff,0);
    if (pcVar1 != (char *)0x0) {
      return pcVar1;
    }
    in_w8 = *(int *)(param_1 + 0x10);
  }
  if (in_w8 - 2U < 4) {
    return *(char **)(&UNK_00a1c460 + (long)(int)(in_w8 - 2U) * 8);
  }
  return "lua_exception: unexpected exception status";
}

