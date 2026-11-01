
/* WARNING: Type propagation algorithm not settling */

long * FUN_00086f10(undefined8 param_1,undefined8 param_2,long param_3,long param_4,long param_5,
                   undefined8 param_6)

{
  ulong uVar1;
  long lVar2;
  undefined8 *******pppppppuVar3;
  ulong uVar4;
  undefined8 uVar5;
  long *plVar6;
  long lVar7;
  undefined1 auVar8 [16];
  undefined8 *******pppppppuStack_68;
  ulong uStack_60;
  undefined8 uStack_58;
  
  __Unwind_Resume();
  auVar8 = func_0x0001753c();
  lVar2 = auVar8._8_8_;
  plVar6 = auVar8._0_8_;
  if (plVar6 == (long *)0x0) {
    return (long *)0x0;
  }
  uVar1 = *(long *)(param_5 + 0x18) - (param_4 - lVar2);
  if (uVar1 == 0 || *(long *)(param_5 + 0x18) < param_4 - lVar2) {
    uVar1 = 0;
  }
  lVar7 = param_3 - lVar2;
  if ((lVar7 < 1) || (lVar2 = (**(code **)(*plVar6 + 0x60))(plVar6,lVar2,lVar7), lVar2 == lVar7)) {
    if (0 < (long)uVar1) {
      if (0x7ffffffffffffff7 < uVar1) {
        uVar5 = func_0x0001748c(&pppppppuStack_68);
        if ((long)uStack_58 < 0) {
          __ZdlPv(pppppppuStack_68);
        }
        plVar6 = (long *)__Unwind_Resume(uVar5);
        *(undefined2 *)((long)plVar6 + 4) = 0;
        *(undefined4 *)plVar6 = 0;
        return plVar6;
      }
      if (uVar1 < 0x17) {
        uStack_58 = CONCAT17((char)uVar1,(undefined7)uStack_58);
        pppppppuVar3 = &pppppppuStack_68;
      }
      else {
        uVar4 = (uVar1 & 0xfffffffffffffff8) + 8;
        if ((uVar1 | 7) != 0x17) {
          uVar4 = uVar1 | 7;
        }
        pppppppuVar3 = (undefined8 *******)__Znwm(uVar4 + 1);
        uStack_58 = uVar4 + 1 | 0x8000000000000000;
        pppppppuStack_68 = pppppppuVar3;
        uStack_60 = uVar1;
      }
      _memset(pppppppuVar3,param_6,uVar1);
      *(undefined1 *)((long)pppppppuVar3 + uVar1) = 0;
      pppppppuVar3 = pppppppuStack_68;
      if (-1 < (long)uStack_58) {
        pppppppuVar3 = &pppppppuStack_68;
      }
      uVar4 = (**(code **)(*plVar6 + 0x60))(plVar6,pppppppuVar3,uVar1);
      if ((long)uStack_58 < 0) {
        __ZdlPv(pppppppuStack_68);
      }
      if (uVar4 != uVar1) {
        return (long *)0x0;
      }
    }
    param_4 = param_4 - param_3;
    if ((param_4 < 1) ||
       (lVar2 = (**(code **)(*plVar6 + 0x60))(plVar6,param_3,param_4), lVar2 == param_4)) {
      *(undefined8 *)(param_5 + 0x18) = 0;
      return plVar6;
    }
  }
  return (long *)0x0;
}

