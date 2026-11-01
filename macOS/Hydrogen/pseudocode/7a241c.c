
/* WARNING: Possible PIC construction at 0x007a241c: Changing call to branch */

void FUN_007a241c(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined1 extraout_w1;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined1 *puStack_58;
  undefined8 uStack_50;
  undefined1 uStack_48;
  undefined1 uStack_47;
  undefined1 *puStack_40;
  undefined8 uStack_38;
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined2 uStack_18;
  undefined1 auStack_16 [6];
  
  uStack_18 = 1;
  uStack_28 = param_1;
  uStack_20 = param_2;
  puVar2 = (undefined8 *)func_0x0042d0e8(&uStack_28);
  puStack_58 = (undefined1 *)&uStack_90;
  uStack_38 = 0x7a2440;
  uStack_88 = puVar2[1];
  uStack_90 = *puVar2;
  uStack_78 = puVar2[3];
  uStack_80 = puVar2[2];
  uStack_68 = puVar2[5];
  uStack_70 = puVar2[4];
  uStack_48 = 0;
  uStack_50 = param_3;
  uStack_47 = extraout_w1;
  puStack_40 = auStack_16 + 6;
  func_0x0042d0e8(&puStack_58);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7a2478);
  (*pcVar1)();
}

