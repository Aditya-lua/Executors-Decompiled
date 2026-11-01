
/* WARNING: Removing unreachable block (ram,0x00431238) */

undefined1  [16] FUN_004311ec(undefined8 param_1,long param_2,long param_3)

{
  uint *puVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined1 auVar5 [16];
  
  puVar4 = (undefined8 *)(param_2 + -0x10);
  param_3 = param_3 << 4;
  do {
    if (param_3 == 0) {
      uVar3 = _pwrite(param_1,1,0);
      if (uVar3 == 0xffffffffffffffff) goto FUN_00431248;
      goto LAB_004311a4;
    }
    uVar3 = puVar4[3];
    puVar4 = puVar4 + 2;
    param_3 = param_3 + -0x10;
  } while (uVar3 == 0);
  if (0x7ffffffd < uVar3) {
    uVar3 = 0x7ffffffe;
  }
  uVar3 = _pwrite(param_1,*puVar4,uVar3);
  if (uVar3 == 0xffffffffffffffff) {
FUN_00431248:
    puVar1 = (uint *)___error();
    uVar3 = (ulong)*puVar1 << 0x20 | 2;
    uVar2 = 1;
  }
  else {
LAB_004311a4:
    uVar2 = 0;
  }
  auVar5._8_8_ = uVar3;
  auVar5._0_8_ = uVar2;
  return auVar5;
}

