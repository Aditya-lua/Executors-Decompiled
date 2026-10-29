/* 7ff70c900dc0 Unwind@7ff70c900dc0 */

void Unwind_7ff70c900dc0(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(param_2 + 0x60);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x28));
  }
                    /* WARNING: Subroutine does not return */
  FUN_7ff70cb12af0();
}


