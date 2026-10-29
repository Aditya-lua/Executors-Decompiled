/* 7ff70c9f4b40 Unwind@7ff70c9f4b40 */

void Unwind_7ff70c9f4b40(undefined8 param_1,longlong param_2)

{
  undefined4 uVar1;
  undefined4 *puVar2;
  
  uVar1 = *(undefined4 *)(param_2 + 0x184);
  puVar2 = *(undefined4 **)(param_2 + 0x168);
  puVar2[1] = *(undefined4 *)(param_2 + 0x188);
  *puVar2 = uVar1;
  return;
}


