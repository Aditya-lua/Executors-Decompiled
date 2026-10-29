/* 7ff70c8c3410 Unwind@7ff70c8c3410 */

void Unwind_7ff70c8c3410(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  undefined8 *puVar2;
  
  func_0x7ff70c7aae80(*(undefined8 *)(param_2 + 0x90));
  func_0x7ff70c8c9fe0(*(undefined8 *)(param_2 + 0x68));
  func_0x7ff70c7aae80(*(undefined8 *)(param_2 + 0x60));
  plVar1 = (longlong *)**(longlong **)(param_2 + 0x98);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != *(longlong **)(param_2 + 0x70));
    **(undefined8 **)(param_2 + 0x98) = 0;
  }
  puVar2 = *(undefined8 **)(*(longlong *)(param_2 + 0xd0) + 0x170);
  if (puVar2 != (undefined8 *)0x0) {
    (**(code **)*puVar2)(puVar2,1);
  }
  return;
}


