
void FUN_004a63d0(void)

{
  long lVar1;
  undefined8 *puVar2;
  long *extraout_x8;
  long *plVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  undefined1 uStack0000000000000080;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  long lStack_40;
  long lStack_38;
  
  func_0x004a38e0(&uStack0000000000000080);
  __Unwind_Resume();
  puVar2 = (undefined8 *)func_0x007a2668();
  plVar6 = puVar2 + 5;
  if (*plVar6 == 0) goto LAB_004a6438;
  plVar3 = (long *)puVar2[6];
  if (plVar3 == (long *)puVar2[8]) goto code_r0x004a642c;
  do {
    lStack_68 = *plVar3;
    puVar2[6] = plVar3 + 4;
    if (lStack_68 != 0) {
code_r0x004a64b0:
      lStack_58 = plVar3[2];
      lStack_60 = plVar3[1];
      lStack_50 = plVar3[3];
      (*(code *)*puVar2)(&lStack_48,&lStack_68);
      lVar5 = -0x8000000000000000;
      if (lStack_48 != -0x8000000000000000) {
        extraout_x8[2] = lStack_38;
        extraout_x8[1] = lStack_40;
        puVar2[0xd] = puVar2[0xd] + -1;
        lVar5 = lStack_48;
      }
LAB_004a651c:
      *extraout_x8 = lVar5;
      return;
    }
code_r0x004a642c:
    do {
      func_0x004b7fe4(plVar6);
      *plVar6 = 0;
LAB_004a6438:
      if ((puVar2[1] == 0) || (plVar4 = (long *)puVar2[2], plVar4 == (long *)puVar2[4])) {
code_r0x004a6484:
        plVar6 = puVar2 + 9;
        if (*plVar6 != 0) {
          plVar3 = (long *)puVar2[10];
          if (plVar3 != (long *)puVar2[0xc]) {
            lStack_68 = *plVar3;
            puVar2[10] = plVar3 + 4;
            if (lStack_68 != 0) goto code_r0x004a64b0;
          }
          func_0x004b7fe4(plVar6);
          *plVar6 = 0;
        }
        lVar5 = -0x8000000000000000;
        goto LAB_004a651c;
      }
      lVar5 = *plVar4;
      puVar2[2] = plVar4 + 3;
      if (lVar5 == -0x8000000000000000) goto code_r0x004a6484;
      plVar3 = (long *)plVar4[1];
      lVar1 = plVar4[2];
      puVar2[5] = plVar3;
      puVar2[6] = plVar3;
      puVar2[7] = lVar5;
      puVar2[8] = plVar3 + lVar1 * 4;
    } while (plVar3 == plVar3 + lVar1 * 4);
  } while( true );
}

