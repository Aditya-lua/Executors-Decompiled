/* 7ff70c93cdb0 FUN_7ff70c93cdb0 */

undefined8 * FUN_7ff70c93cdb0(undefined8 *param_1,undefined8 param_2)

{
  code *pcVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  longlong lVar4;
  undefined8 *puVar5;
  ulonglong uVar6;
  
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  uVar2 = func_0x7ff70d88db32(param_2);
  if (uVar2 < 0x7fffffffffffffff) {
    uVar6 = 7;
    puVar5 = param_1;
    if (7 < uVar2) {
      uVar3 = uVar2 | 7;
      if (0x7ffffffffffffffe < uVar3) goto LAB_7ff70c93ce9d;
      uVar6 = 10;
      if (10 < uVar3) {
        uVar6 = uVar3;
      }
      if (uVar3 < 0x7ff) {
        puVar5 = (undefined8 *)FUN_7ff70ca8ff40(uVar6 * 2 + 2);
      }
      else {
        if (0x7fffffffffffffeb < uVar3) goto LAB_7ff70c93ce9d;
        lVar4 = FUN_7ff70ca8ff40(uVar6 * 2 + 0x29);
        puVar5 = (undefined8 *)(lVar4 + 0x27U & 0xffffffffffffffe0);
        puVar5[-1] = lVar4;
      }
      *param_1 = puVar5;
    }
    param_1[2] = uVar2;
    param_1[3] = uVar6;
    FUN_7ff70cb12b60(puVar5,param_2,uVar2 * 2);
    *(undefined2 *)((longlong)puVar5 + uVar2 * 2) = 0;
    return param_1;
  }
  FUN_7ff70ca00780();
LAB_7ff70c93ce9d:
  FUN_7ff70ca007a0();
  pcVar1 = (code *)swi(3);
  puVar5 = (undefined8 *)(*pcVar1)();
  return puVar5;
}


