
/* WARNING: Removing unreachable block (ram,0x00431238) */

undefined1  [16]
FUN_00431180(code *param_1,undefined4 *param_2,long param_3,ulong param_4,undefined8 param_5)

{
  bool in_ZR;
  ulong uVar1;
  undefined8 uVar2;
  uint *puVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined1 auVar6 [16];
  
  if (in_ZR) {
    param_1 = (code *)func_0x007a1310(0xa2a600);
    if (param_1 == (code *)0x0) {
      puVar4 = (undefined8 *)(param_3 + -0x10);
      lVar5 = param_4 << 4;
      do {
        if (lVar5 == 0) {
          uVar1 = _pwrite(*param_2,1,0,param_5);
          if (uVar1 != 0xffffffffffffffff) goto code_r0x004311a4;
          goto LAB_00431248;
        }
        uVar1 = puVar4[3];
        puVar4 = puVar4 + 2;
        lVar5 = lVar5 + -0x10;
      } while (uVar1 == 0);
      if (0x7ffffffd < uVar1) {
        uVar1 = 0x7ffffffe;
      }
      uVar1 = _pwrite(*param_2,*puVar4,uVar1,param_5);
      goto joined_r0x00431224;
    }
  }
  else {
    DataMemoryBarrier(2,1);
  }
  if (0x3ff < param_4) {
    param_4 = 0x400;
  }
  uVar1 = (*param_1)(*param_2,param_3,param_4);
joined_r0x00431224:
  if (uVar1 == 0xffffffffffffffff) {
LAB_00431248:
    puVar3 = (uint *)___error();
    uVar1 = (ulong)*puVar3 << 0x20 | 2;
    uVar2 = 1;
  }
  else {
code_r0x004311a4:
    uVar2 = 0;
  }
  auVar6._8_8_ = uVar1;
  auVar6._0_8_ = uVar2;
  return auVar6;
}

