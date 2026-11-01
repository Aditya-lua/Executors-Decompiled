
/* WARNING: Possible PIC construction at 0x00655910: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00655994: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00655914) */
/* WARNING: Removing unreachable block (ram,0x00655998) */

undefined8 *
FUN_00655830(long param_1,undefined8 *param_2,undefined8 param_3,long param_4,undefined8 *param_5)

{
  long lVar1;
  bool in_CY;
  long extraout_x1;
  undefined8 *puVar2;
  long in_x9;
  ulong uVar3;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  long lVar4;
  ulong unaff_x24;
  long lVar5;
  
  if (in_CY) {
    puVar2 = (undefined8 *)unaff_x19[1];
    uVar3 = ((long)puVar2 - (long)unaff_x21 >> 4) * in_x9;
    if (unaff_x24 <= uVar3) {
      if (unaff_x22 != unaff_x20) {
        lVar5 = 0;
        do {
          lVar4 = unaff_x22 + lVar5;
          func_0x005ffccc((long)unaff_x21 + lVar5 + 8,lVar4 + 8);
          param_2 = (undefined8 *)func_0x005ffccc((long)unaff_x21 + lVar5 + 0x38,lVar4 + 0x38);
          *(undefined1 *)((long)unaff_x21 + lVar5 + 0x68) = *(undefined1 *)(lVar4 + 0x68);
          lVar5 = lVar5 + 0x70;
        } while (unaff_x22 + lVar5 != unaff_x20);
        puVar2 = (undefined8 *)unaff_x19[1];
        unaff_x21 = (undefined8 *)((long)unaff_x21 + lVar5);
      }
      while (puVar2 != unaff_x21) {
        puVar2 = puVar2 + -0xe;
        param_2 = (undefined8 *)(**(code **)*puVar2)(puVar2);
      }
      unaff_x19[1] = (long)unaff_x21;
      return param_2;
    }
    lVar5 = unaff_x22 + uVar3 * 0x70;
    param_5 = unaff_x21;
    if (puVar2 != unaff_x21) {
      lVar4 = 0;
      do {
        lVar1 = unaff_x22 + lVar4;
        func_0x005ffccc((long)unaff_x21 + lVar4 + 8,lVar1 + 8);
        func_0x005ffccc((long)unaff_x21 + lVar4 + 0x38,lVar1 + 0x38);
        *(undefined1 *)((long)unaff_x21 + lVar4 + 0x68) = *(undefined1 *)(lVar1 + 0x68);
        lVar4 = lVar4 + 0x70;
      } while (uVar3 * 0x70 != lVar4);
      param_5 = (undefined8 *)unaff_x19[1];
    }
  }
  else {
    if (unaff_x21 != (undefined8 *)0x0) {
      puVar2 = (undefined8 *)unaff_x19[1];
      while (puVar2 != unaff_x21) {
        puVar2 = puVar2 + -0xe;
        (**(code **)*puVar2)(puVar2);
      }
      unaff_x19[1] = (long)unaff_x21;
      __ZdlPv();
      param_1 = 0;
      *unaff_x19 = 0;
      unaff_x19[1] = 0;
      unaff_x19[2] = 0;
    }
    if (unaff_x24 < 0x24924924924924a) {
      uVar3 = (param_1 >> 4) * -0x2492492492492492;
      if (uVar3 <= unaff_x24) {
        uVar3 = unaff_x24;
      }
      if (0x124924924924923 < (ulong)((param_1 >> 4) * 0x6db6db6db6db6db7)) {
        uVar3 = 0x249249249249249;
      }
      if (uVar3 < 0x24924924924924a) {
        param_5 = (undefined8 *)__Znwm(uVar3 * 0x70);
        *unaff_x19 = (long)param_5;
        unaff_x19[1] = (long)param_5;
        unaff_x19[2] = (long)(param_5 + uVar3 * 0xe);
        lVar5 = unaff_x22;
        goto SUB_00655a50;
      }
    }
    func_0x00017f90();
    unaff_x19[1] = (long)unaff_x21;
    __Unwind_Resume();
    unaff_x19[1] = (long)unaff_x21;
    __Unwind_Resume();
    lVar5 = extraout_x1;
    unaff_x20 = param_4;
  }
SUB_00655a50:
  if (lVar5 != unaff_x20) {
    lVar4 = 0;
    do {
      puVar2 = (undefined8 *)((long)param_5 + lVar4);
      *puVar2 = &UNK_00a09a40;
      func_0x005fe0b4(puVar2 + 1,lVar5 + lVar4 + 8);
      func_0x005fe0b4(puVar2 + 7,lVar5 + lVar4 + 0x38);
      *(undefined1 *)((long)param_5 + lVar4 + 0x68) = *(undefined1 *)(lVar5 + lVar4 + 0x68);
      lVar4 = lVar4 + 0x70;
    } while (lVar5 + lVar4 != unaff_x20);
    param_5 = (undefined8 *)((long)param_5 + lVar4);
  }
  return param_5;
}

