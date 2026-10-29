/* 7ff70c787550 Unwind@7ff70c787550 */

void Unwind_7ff70c787550(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  if ((*(char *)(param_2 + 0x2f7) == '\x01') &&
     (plVar1 = *(longlong **)(param_2 + 0x160), plVar1 != (longlong *)0x0)) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x128));
    *(undefined8 *)(param_2 + 0x160) = 0;
  }
  return;
}


