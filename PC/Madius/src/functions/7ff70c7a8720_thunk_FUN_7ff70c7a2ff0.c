/* 7ff70c7a8720 thunk_FUN_7ff70c7a2ff0 */

void thunk_FUN_7ff70c7a2ff0(longlong param_1,undefined8 *param_2)

{
  code *pcVar1;
  ulonglong uVar2;
  undefined8 **ppuVar3;
  ulonglong uVar4;
  longlong *plVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulonglong uVar8;
  undefined8 ***pppuVar9;
  undefined8 **ppuStack_80;
  ulonglong uStack_78;
  undefined8 uStack_70;
  undefined8 **ppuStack_68;
  longlong lStack_60;
  ulonglong uStack_58;
  ulonglong uStack_50;
  undefined8 uStack_40;
  
  uStack_40 = 0xfffffffffffffffe;
  if (param_2[2] != 0) {
    puVar6 = param_2;
    if (0xf < (ulonglong)param_2[3]) {
      puVar6 = (undefined8 *)*param_2;
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2729,puVar6);
    if (param_2[6] != 0) {
      if ((ulonglong)param_2[7] < 0x10) {
        puVar6 = param_2 + 4;
      }
      else {
        puVar6 = (undefined8 *)param_2[4];
      }
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2766,puVar6);
    }
  }
  if (param_2[10] == 0) {
    uVar4 = param_2[0xe];
    if (uVar4 != 0) {
      uStack_58 = 0;
      uStack_50 = 0;
      ppuStack_68 = (undefined8 ***)0x0;
      lStack_60 = 0;
      if ((ulonglong)param_2[0xf] < 0x10) {
        plVar5 = param_2 + 0xc;
      }
      else {
        plVar5 = (longlong *)param_2[0xc];
      }
      if ((longlong)uVar4 < 0) {
        FUN_7ff70ca00780();
LAB_7ff70c7a348e:
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      if (uVar4 < 0x10) {
        uStack_50 = 0xf;
        ppuStack_68 = (undefined8 **)*plVar5;
        lStack_60 = plVar5[1];
        pppuVar9 = &ppuStack_68;
        uStack_58 = uVar4;
      }
      else {
        uVar2 = uVar4 | 0xf;
        uVar8 = 0x16;
        if (0x16 < uVar2) {
          uVar8 = uVar2;
        }
        if (uVar2 < 0xfff) {
          pppuVar9 = (undefined8 ***)FUN_7ff70ca8ff40(uVar8 + 1);
        }
        else {
          ppuVar3 = (undefined8 **)FUN_7ff70ca8ff40(uVar8 + 0x28);
          pppuVar9 = (undefined8 ***)((longlong)ppuVar3 + 0x27U & 0xffffffffffffffe0);
          pppuVar9[-1] = ppuVar3;
        }
        ppuStack_68 = pppuVar9;
        uStack_58 = uVar4;
        uStack_50 = uVar8;
        FUN_7ff70cb12b60(pppuVar9,plVar5,uVar4 + 1);
      }
      uStack_70 = 0;
      ppuStack_80 = pppuVar9;
      uStack_78 = uVar4;
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x9d64,&ppuStack_80);
      if (param_2[0x12] != 0) {
        if ((ulonglong)param_2[0x13] < 0x10) {
          puVar6 = param_2 + 0x10;
        }
        else {
          puVar6 = (undefined8 *)param_2[0x10];
        }
        FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2768,puVar6);
      }
      if (param_2[0x16] != 0) {
        if ((ulonglong)param_2[0x17] < 0x10) {
          puVar6 = param_2 + 0x14;
        }
        else {
          puVar6 = (undefined8 *)param_2[0x14];
        }
        FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x272a,puVar6);
      }
      if (0xf < uStack_50) {
        uVar4 = uStack_50 + 1;
        pppuVar9 = (undefined8 ***)ppuStack_68;
        if (0xfff < uVar4) {
          pppuVar9 = (undefined8 ***)ppuStack_68[-1];
          if (0x1f < (ulonglong)((longlong)ppuStack_68 + (-8 - (longlong)pppuVar9)))
          goto LAB_7ff70c7a348e;
          uVar4 = uStack_50 + 0x28;
        }
        thunk_FUN_7ff70ca90250(pppuVar9,uVar4);
      }
    }
  }
  else {
    if ((ulonglong)param_2[0xb] < 0x10) {
      puVar6 = param_2 + 8;
    }
    else {
      puVar6 = (undefined8 *)param_2[8];
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2767,puVar6);
    if (param_2[0x12] != 0) {
      if ((ulonglong)param_2[0x13] < 0x10) {
        puVar6 = param_2 + 0x10;
      }
      else {
        puVar6 = (undefined8 *)param_2[0x10];
      }
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2768,puVar6);
    }
    if (param_2[0x16] != 0) {
      if ((ulonglong)param_2[0x17] < 0x10) {
        puVar6 = param_2 + 0x14;
      }
      else {
        puVar6 = (undefined8 *)param_2[0x14];
      }
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x272a,puVar6);
    }
  }
  if (param_2[0x1a] != 0) {
    if ((ulonglong)param_2[0x1b] < 0x10) {
      puVar6 = param_2 + 0x18;
    }
    else {
      puVar6 = (undefined8 *)param_2[0x18];
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x27f6,puVar6);
  }
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0xe2,*(undefined1 *)(param_2 + 0x1c));
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x40,*(undefined1 *)((longlong)param_2 + 0xe2))
  ;
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x51,
                   (uint)*(byte *)((longlong)param_2 + 0xe1) * 2);
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0xe8,*(undefined1 *)((longlong)param_2 + 0xe3))
  ;
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x20,
                   *(uint *)((longlong)param_2 + 0xec) | *(uint *)((longlong)param_2 + 0xe4));
  if (*(char *)(param_2 + 0x1d) == '\x01') {
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0xd8,2);
  }
  if (param_2[0x20] != 0) {
    if ((ulonglong)param_2[0x21] < 0x10) {
      puVar6 = param_2 + 0x1e;
    }
    else {
      puVar6 = (undefined8 *)param_2[0x1e];
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2751,puVar6);
  }
  if (param_2[0x24] != 0) {
    if ((ulonglong)param_2[0x25] < 0x10) {
      puVar6 = param_2 + 0x22;
    }
    else {
      puVar6 = (undefined8 *)param_2[0x22];
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2771,puVar6);
  }
  if (param_2[0x2c] != 0) {
    if ((ulonglong)param_2[0x2d] < 0x10) {
      puVar6 = param_2 + 0x2a;
    }
    else {
      puVar6 = (undefined8 *)param_2[0x2a];
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x27b9,puVar6);
  }
  puVar6 = param_2 + 0x2e;
  if (param_2[0x30] != 0) {
    puVar7 = puVar6;
    if (0xf < (ulonglong)param_2[0x31]) {
      puVar7 = (undefined8 *)param_2[0x2e];
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2763,puVar7);
  }
  if (param_2[0x34] != 0) {
    if (0xf < (ulonglong)param_2[0x31]) {
      puVar6 = (undefined8 *)param_2[0x2e];
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2824,puVar6);
  }
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x96,*(undefined1 *)(param_2 + 0x36));
  return;
}


