
void FUN_00028104(ulong param_1)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  long *plVar4;
  ulong uVar5;
  long *unaff_x19;
  ulong unaff_x20;
  
  unaff_x19[1] = unaff_x20;
  do {
    *(undefined8 *)(*unaff_x19 + param_1 * 8) = 0;
    param_1 = param_1 + 1;
  } while (unaff_x20 != param_1);
  plVar4 = unaff_x19 + 2;
  plVar1 = (long *)*plVar4;
  if (plVar1 != (long *)0x0) {
    uVar2 = plVar1[1];
    uVar3 = unaff_x20 - 1;
    if ((unaff_x20 & uVar3) != 0) {
      if (unaff_x20 <= uVar2) {
        uVar3 = 0;
        if (unaff_x20 != 0) {
          uVar3 = uVar2 / unaff_x20;
        }
        uVar2 = uVar2 - uVar3 * unaff_x20;
      }
      *(long **)(*unaff_x19 + uVar2 * 8) = plVar4;
      plVar4 = (long *)*plVar1;
joined_r0x000281e8:
      if (plVar4 == (long *)0x0) {
        return;
      }
      do {
        uVar3 = plVar4[1];
        if (unaff_x20 <= uVar3) {
          uVar5 = 0;
          if (unaff_x20 != 0) {
            uVar5 = uVar3 / unaff_x20;
          }
          uVar3 = uVar3 - uVar5 * unaff_x20;
        }
        if (uVar3 != uVar2) {
          if (*(long *)(*unaff_x19 + uVar3 * 8) == 0) goto code_r0x00028254;
          *plVar1 = *plVar4;
          *plVar4 = **(long **)(*unaff_x19 + uVar3 * 8);
          **(undefined8 **)(*unaff_x19 + uVar3 * 8) = plVar4;
          plVar4 = plVar1;
        }
        plVar1 = plVar4;
        plVar4 = (long *)*plVar1;
        if (plVar4 == (long *)0x0) {
          return;
        }
      } while( true );
    }
    *(long **)(*unaff_x19 + (uVar2 & uVar3) * 8) = plVar4;
    uVar2 = uVar2 & uVar3;
    while (plVar4 = (long *)*plVar1, plVar4 != (long *)0x0) {
      uVar5 = plVar4[1] & uVar3;
      if (uVar5 == uVar2) {
        plVar1 = plVar4;
      }
      else if (*(long *)(*unaff_x19 + uVar5 * 8) == 0) {
        *(long **)(*unaff_x19 + uVar5 * 8) = plVar1;
        plVar1 = plVar4;
        uVar2 = uVar5;
      }
      else {
        *plVar1 = *plVar4;
        *plVar4 = **(long **)(*unaff_x19 + uVar5 * 8);
        **(undefined8 **)(*unaff_x19 + uVar5 * 8) = plVar4;
      }
    }
  }
  return;
code_r0x00028254:
  *(long **)(*unaff_x19 + uVar3 * 8) = plVar1;
  plVar1 = plVar4;
  plVar4 = (long *)*plVar4;
  uVar2 = uVar3;
  goto joined_r0x000281e8;
}

