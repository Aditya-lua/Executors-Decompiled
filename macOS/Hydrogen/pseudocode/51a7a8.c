
/* WARNING: Possible PIC construction at 0x0051a808: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0051a80c) */

void FUN_0051a7a8(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined1 *puVar3;
  uint uVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  ulong uVar7;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined1 *unaff_x29;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  
  uVar7 = 8;
  func_0x00187bd4(param_1,0x18);
  unaff_x19[1] = unaff_x20;
  uVar8 = 0x51a7c0;
  auVar9 = __Unwind_Resume();
  puVar5 = auVar9._0_8_;
  puVar3 = (undefined1 *)register0x00000008;
  uVar2 = auVar9._8_8_;
  while( true ) {
    uVar6 = uVar2;
    *(undefined8 *)(puVar3 + -0x20) = unaff_x20;
    *(undefined8 **)(puVar3 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
    *(undefined8 *)(puVar3 + -8) = uVar8;
    unaff_x29 = puVar3 + -0x10;
    uVar4 = (uint)uVar7 & 0xff;
    if (uVar4 != 1 && (uVar7 & 0xff) != 0) break;
    if ((uVar7 & 0xff) != 0) goto LAB_0051a818;
    *(undefined8 *)(puVar3 + -0x28) = uVar6;
    uVar4 = func_0x00535bb4(puVar3 + -0x28,&UNK_009e9fe0);
    puVar1 = (undefined8 *)(puVar3 + -0x28);
    uVar7 = (ulong)(uVar4 & 0xff);
    uVar8 = 0x51a80c;
    puVar3 = puVar3 + -0x30;
    uVar2 = *puVar1;
    unaff_x19 = puVar5;
    unaff_x20 = uVar6;
  }
  if (uVar4 == 2) {
LAB_0051a818:
    _isatty(1);
    *puVar5 = uVar6;
    *(undefined1 *)((long)puVar5 + 0xc) = 8;
  }
  else {
    *puVar5 = uVar6;
    *(undefined4 *)(puVar5 + 1) = 0;
    *(undefined1 *)((long)puVar5 + 0xc) = 0;
    *(undefined1 *)(puVar5 + 2) = 0xc;
  }
  return;
}

