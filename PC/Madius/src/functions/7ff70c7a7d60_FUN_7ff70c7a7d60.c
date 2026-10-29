/* 7ff70c7a7d60 FUN_7ff70c7a7d60 */

void FUN_7ff70c7a7d60(longlong param_1,longlong param_2)

{
  ulonglong uVar1;
  ulonglong uVar2;
  longlong lVar3;
  
  if (param_1 + 0x58 != param_2) {
    uVar1 = *(ulonglong *)(param_2 + 0x18);
    if (*(ulonglong *)(param_2 + 0x20) < 0x10) {
      param_2 = param_2 + 8;
      uVar2 = *(ulonglong *)(param_1 + 0x78);
    }
    else {
      param_2 = *(longlong *)(param_2 + 8);
      uVar2 = *(ulonglong *)(param_1 + 0x78);
    }
    if (uVar2 < uVar1) {
      FUN_7ff70ca005a0(param_1 + 0x60,uVar1);
      return;
    }
    lVar3 = param_1 + 0x60;
    if (0xf < uVar2) {
      lVar3 = *(longlong *)(param_1 + 0x60);
    }
    *(ulonglong *)(param_1 + 0x70) = uVar1;
    FUN_7ff70cb12b70(lVar3,param_2,uVar1);
    *(undefined1 *)(lVar3 + uVar1) = 0;
  }
  return;
}


