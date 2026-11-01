
/* WARNING: Possible PIC construction at 0x00079bdc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00079be0) */

void FUN_00079bd8(void)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined8 *in_stack_00000000;
  char in_stack_00000008;
  
  if (in_stack_00000008 == '\0') {
    puVar1 = (undefined1 *)*in_stack_00000000;
    if (puVar1 != (undefined1 *)0x0) {
      puVar2 = (undefined1 *)in_stack_00000000[1];
      while (puVar2 != puVar1) {
        func_0x00078220(puVar2 + -8,puVar2[-0x10]);
        puVar2 = puVar2 + -0x10;
      }
      in_stack_00000000[1] = puVar1;
      __ZdlPv(*in_stack_00000000);
      return;
    }
  }
  return;
}

