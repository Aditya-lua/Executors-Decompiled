
long * FUN_007286fc(char *param_1,ulong param_2,char *param_3,ulong param_4,undefined4 param_5,
                   undefined4 param_6,undefined2 param_7,undefined2 param_8)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  
  plVar1 = (long *)(*pcRam0000000000a2b608)(1,0x50);
  if (plVar1 == (long *)0x0) {
    return (long *)0x0;
  }
  if ((param_2 != 0) && (param_4 != 0)) {
    if ((param_2 < 3) || (*param_1 != '[')) {
      uVar3 = param_2 - 1;
      if ((param_1[uVar3] == '.') && (param_2 = uVar3, uVar3 == 0)) goto code_r0x007287dc;
    }
    else {
      param_1 = param_1 + 1;
      param_2 = param_2 - 2;
    }
    if ((2 < param_4) && (*param_3 == '[')) {
      param_3 = param_3 + 1;
      param_4 = param_4 - 2;
    }
    lVar2 = func_0x0077e93c(param_1,param_2);
    *plVar1 = lVar2;
    if (lVar2 != 0) {
      lVar2 = func_0x0077e93c(param_3,param_4);
      plVar1[2] = lVar2;
      if (lVar2 != 0) {
        *(undefined4 *)((long)plVar1 + 0xc) = param_5;
        *(undefined4 *)((long)plVar1 + 0x1c) = param_6;
        *(undefined2 *)(plVar1 + 1) = param_7;
        *(undefined2 *)(plVar1 + 3) = param_8;
        return plVar1;
      }
    }
  }
code_r0x007287dc:
  (*pcRam0000000000a2b5f0)(*plVar1);
  (*pcRam0000000000a2b5f0)(plVar1[2]);
  (*pcRam0000000000a2b5f0)(plVar1);
  return (long *)0x0;
}

