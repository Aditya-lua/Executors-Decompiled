/* 7ff70c9321e0 FUN_7ff70c9321e0 */

undefined8 *
FUN_7ff70c9321e0(undefined8 *param_1,undefined8 param_2,undefined4 *param_3,undefined8 param_4)

{
  code *pcVar1;
  longlong lVar2;
  ulonglong uVar3;
  longlong lVar4;
  undefined8 *puVar5;
  longlong lVar6;
  undefined8 uVar7;
  
  uVar7 = 0xfffffffffffffffe;
  *param_1 = param_2;
  param_1[1] = 0;
  lVar2 = FUN_7ff70ca8ff40(0x30);
  param_1[1] = lVar2;
  *(undefined4 *)(lVar2 + 0x10) = *param_3;
  *(undefined8 *)(lVar2 + 0x18) = 0;
  *(undefined8 *)(lVar2 + 0x20) = 0;
  *(undefined8 *)(lVar2 + 0x28) = 0;
  lVar6 = *(longlong *)(param_3 + 4) - *(longlong *)(param_3 + 2);
  if (lVar6 != 0) {
    uVar3 = *(longlong *)(param_3 + 4) - *(longlong *)(param_3 + 2) >> 4;
    if (uVar3 >> 0x3c != 0) {
      FUN_7ff70c7ac850();
      pcVar1 = (code *)swi(3);
      puVar5 = (undefined8 *)(*pcVar1)();
      return puVar5;
    }
    if (uVar3 < 0x100) {
      uVar3 = FUN_7ff70ca8ff40(lVar6);
    }
    else {
      lVar4 = FUN_7ff70ca8ff40(lVar6 + 0x27);
      uVar3 = lVar4 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar3 - 8) = lVar4;
    }
    *(ulonglong *)(lVar2 + 0x18) = uVar3;
    *(ulonglong *)(lVar2 + 0x20) = uVar3;
    *(ulonglong *)(lVar2 + 0x28) = lVar6 + uVar3;
    lVar6 = *(longlong *)(param_3 + 4) - *(longlong *)(param_3 + 2);
    FUN_7ff70cb12b60(uVar3,*(longlong *)(param_3 + 2),lVar6,param_4,param_1,uVar7);
    *(ulonglong *)(lVar2 + 0x20) = lVar6 + uVar3;
  }
  return param_1;
}


