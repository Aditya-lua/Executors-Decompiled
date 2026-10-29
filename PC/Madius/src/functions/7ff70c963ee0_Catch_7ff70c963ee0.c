/* 7ff70c963ee0 Catch@7ff70c963ee0 */

undefined1 * Catch_7ff70c963ee0(undefined8 param_1,longlong param_2)

{
  undefined8 *puVar1;
  char cVar2;
  undefined8 uVar3;
  
  puVar1 = *(undefined8 **)(param_2 + 0x30);
  cVar2 = func_0x7ff70c9a46a0();
  if (cVar2 == '\0') {
    uVar3 = (**(code **)(**(longlong **)(param_2 + 0x40) + 8))();
    *(undefined8 *)(param_2 + 0x28) = uVar3;
    func_0x7ff70c964ab0(&UNK_7ff70cb7f4b7,param_2 + 0x28);
  }
  *puVar1 = 0;
  puVar1[1] = 0;
  puVar1[2] = 0;
  return &LAB_7ff70c963ed0;
}


