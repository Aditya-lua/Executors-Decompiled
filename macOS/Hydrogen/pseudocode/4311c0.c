
/* WARNING: Removing unreachable block (ram,0x00431238) */

bool FUN_004311c0(undefined8 param_1,long param_2,ulong param_3,undefined8 param_4)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined4 *unaff_x19;
  
  pcVar1 = (code *)func_0x007a1310();
  if (pcVar1 == (code *)0x0) {
    puVar3 = (undefined8 *)(param_2 + -0x10);
    lVar4 = param_3 << 4;
    do {
      if (lVar4 == 0) {
        lVar4 = _pwrite(*unaff_x19,1,0);
        goto joined_r0x004311a0;
      }
      uVar2 = puVar3[3];
      puVar3 = puVar3 + 2;
      lVar4 = lVar4 + -0x10;
    } while (uVar2 == 0);
    if (0x7ffffffd < uVar2) {
      uVar2 = 0x7ffffffe;
    }
    lVar4 = _pwrite(*unaff_x19,*puVar3,uVar2);
  }
  else {
    if (0x3ff < param_3) {
      param_3 = 0x400;
    }
    lVar4 = (*pcVar1)(*unaff_x19,param_2,param_3,param_4);
  }
joined_r0x004311a0:
  if (lVar4 == -1) {
    ___error();
  }
  return lVar4 == -1;
}

