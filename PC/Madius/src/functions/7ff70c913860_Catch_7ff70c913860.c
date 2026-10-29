/* 7ff70c913860 Catch@7ff70c913860 */

undefined * Catch_7ff70c913860(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  longlong lVar2;
  undefined8 uVar3;
  
  lVar1 = param_2 + 0x80;
  if (*(longlong *)(*(longlong *)(param_2 + 0x78) + 0x38) == 0) {
    uVar3 = (**(code **)(**(longlong **)(param_2 + 0xb8) + 8))();
    func_0x7ff70ca05eb0(lVar1,uVar3);
    func_0x7ff70c8c71d0(*(undefined8 *)(param_2 + 0xa8),lVar1);
  }
  else {
    lVar2 = *(longlong *)(param_2 + 0x78);
    uVar3 = (**(code **)(**(longlong **)(param_2 + 0xb8) + 8))();
    *(undefined8 *)(param_2 + 0x58) = uVar3;
    *(undefined **)(param_2 + 0x48) = &UNK_7ff70cb894ee;
    *(undefined8 *)(param_2 + 0x50) = 0xb;
    func_0x7ff70c8ca350(lVar1,param_2 + 0x48,param_2 + 0x58,lVar2 + 0x38,lVar2 + 0x40);
    func_0x7ff70c8c71d0(*(undefined8 *)(param_2 + 0xa8),lVar1);
  }
  func_0x7ff70c8e9fd0(lVar1);
  return &UNK_7ff70c9137c6;
}


