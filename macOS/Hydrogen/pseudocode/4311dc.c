
/* WARNING: Removing unreachable block (ram,0x00431238) */

bool FUN_004311dc(code *param_1,long param_2,ulong param_3)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined4 *unaff_x19;
  
  if (param_1 == (code *)0x0) {
    puVar2 = (undefined8 *)(param_2 + -0x10);
    lVar3 = param_3 << 4;
    do {
      if (lVar3 == 0) {
        lVar3 = _pwrite(*unaff_x19,1,0);
        goto joined_r0x004311a0;
      }
      uVar1 = puVar2[3];
      puVar2 = puVar2 + 2;
      lVar3 = lVar3 + -0x10;
    } while (uVar1 == 0);
    if (0x7ffffffd < uVar1) {
      uVar1 = 0x7ffffffe;
    }
    lVar3 = _pwrite(*unaff_x19,*puVar2,uVar1);
  }
  else {
    if (0x3ff < param_3) {
      param_3 = 0x400;
    }
    lVar3 = (*param_1)(*unaff_x19,param_2,param_3);
  }
joined_r0x004311a0:
  if (lVar3 == -1) {
    ___error();
  }
  return lVar3 == -1;
}

