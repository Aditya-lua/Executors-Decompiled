/* 7ff70c8c7060 Catch@7ff70c8c7060 */

undefined * Catch_7ff70c8c7060(undefined8 param_1,longlong param_2)

{
  undefined8 uVar1;
  
  if (**(longlong **)(param_2 + 0x80) == 0) {
    uVar1 = (**(code **)(**(longlong **)(param_2 + 0xa0) + 8))();
    func_0x7ff70ca05eb0(param_2 + 0x60,uVar1);
    func_0x7ff70c8c71d0(*(undefined8 *)(param_2 + 0x90),param_2 + 0x60);
  }
  else {
    uVar1 = (**(code **)(**(longlong **)(param_2 + 0xa0) + 8))();
    *(undefined8 *)(param_2 + 0x40) = uVar1;
    *(undefined **)(param_2 + 0x30) = &UNK_7ff70cb894ee;
    *(undefined8 *)(param_2 + 0x38) = 0xb;
    func_0x7ff70c8ca350(param_2 + 0x60,param_2 + 0x30,param_2 + 0x40,*(undefined8 *)(param_2 + 0x80)
                        ,*(undefined8 *)(param_2 + 0x58));
    func_0x7ff70c8c71d0(*(undefined8 *)(param_2 + 0x90),param_2 + 0x60);
  }
  func_0x7ff70c8e9fd0(param_2 + 0x60);
  return &UNK_7ff70c8c6fc0;
}


