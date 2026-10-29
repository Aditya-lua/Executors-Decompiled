/* 7ff70c7ada80 Unwind@7ff70c7ada80 */

void Unwind_7ff70c7ada80(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  longlong lVar2;
  
  lVar1 = *(longlong *)(param_2 + 0x30);
  for (lVar2 = *(longlong *)(param_2 + 0x28); lVar2 != 0; lVar2 = lVar2 + -0x90) {
    func_0x7ff70ca3dff0(lVar1);
    lVar1 = lVar1 + 0x90;
  }
  return;
}


