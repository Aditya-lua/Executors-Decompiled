/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4b14
 */

char * FUN_008b4b14(long param_1)

{
  char *pcVar1;
  int iVar2;
  
  iVar2 = *(int *)(param_1 + 0x10);
  if (iVar2 == 2) {
                    /* try { // try from 008b4b34 to 008b4b3f has its CatchHandler @ 008b4b7c */
    pcVar1 = (char *)FUN_008ab8a4(*(undefined8 *)(param_1 + 8),0xffffffff,0);
    if (pcVar1 != (char *)0x0) {
      return pcVar1;
    }
    iVar2 = *(int *)(param_1 + 0x10);
  }
  if (iVar2 - 2U < 4) {
    pcVar1 = &DAT_00364694 + *(int *)(&DAT_00364694 + (ulong)(iVar2 - 2U) * 4);
  }
  else {
    pcVar1 = "lua_exception: unexpected exception status";
  }
  return pcVar1;
}

