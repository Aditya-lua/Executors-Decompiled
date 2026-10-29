/* 7ff70c7ac780 Unwind@7ff70c7ac780 */

void Unwind_7ff70c7ac780(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  longlong lVar2;
  
  lVar1 = *(longlong *)(param_2 + 0x30);
  for (lVar2 = *(longlong *)(param_2 + 0x28); lVar2 != 0; lVar2 = lVar2 + -0x50) {
    func_0x7ff70c7ab140(lVar1);
    lVar1 = lVar1 + 0x50;
  }
  func_0x7ff70c7ac7d0(param_2 + 0x20);
  return;
}


