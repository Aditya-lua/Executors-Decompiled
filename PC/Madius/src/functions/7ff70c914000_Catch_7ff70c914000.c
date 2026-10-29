/* 7ff70c914000 Catch@7ff70c914000 */

undefined * Catch_7ff70c914000(undefined8 param_1,longlong param_2)

{
  undefined8 uVar1;
  
  if (**(longlong **)(param_2 + 0x78) == 0) {
    uVar1 = (**(code **)(**(longlong **)(param_2 + 0x98) + 8))();
    func_0x7ff70ca05eb0(param_2 + 0x50,uVar1);
    func_0x7ff70c8c71d0(*(undefined8 *)(param_2 + 0x88),param_2 + 0x50);
  }
  else {
    uVar1 = (**(code **)(**(longlong **)(param_2 + 0x98) + 8))();
    *(undefined8 *)(param_2 + 0x38) = uVar1;
    *(undefined **)(param_2 + 0x28) = &UNK_7ff70cb894ee;
    *(undefined8 *)(param_2 + 0x30) = 0xb;
    func_0x7ff70c8ca350(param_2 + 0x50,param_2 + 0x28,param_2 + 0x38,*(undefined8 *)(param_2 + 0x78)
                        ,*(undefined8 *)(param_2 + 0x48));
    func_0x7ff70c8c71d0(*(undefined8 *)(param_2 + 0x88),param_2 + 0x50);
  }
  func_0x7ff70c8e9fd0(param_2 + 0x50);
  return &UNK_7ff70c913f50;
}


