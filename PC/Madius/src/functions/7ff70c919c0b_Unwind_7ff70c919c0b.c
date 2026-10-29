/* 7ff70c919c0b Unwind@7ff70c919c0b */

void Unwind_7ff70c919c0b(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  longlong lVar2;
  
  lVar2 = *(longlong *)(param_2 + 0x298);
  if ((param_2 + 0xb8 != *(longlong *)(param_2 + 0x298) & *(byte *)(param_2 + 0x2e5)) == 1) {
    do {
      lVar1 = lVar2 + -0x28;
      func_0x7ff70c91d040(lVar2 + -0x20);
      lVar2 = lVar1;
    } while (lVar1 != param_2 + 0xb8);
  }
  return;
}


