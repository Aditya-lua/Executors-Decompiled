
void FUN_00566738(void)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  long lStack_18;
  
  __Unwind_Resume();
  auVar4 = func_0x007a2668();
  lStack_18 = auVar4._0_8_;
  switch(*(undefined8 *)(lStack_18 + 0x18)) {
  case 0xc:
    puVar1 = &UNK_008abd31;
    puVar3 = &UNK_009ee2a8;
    break;
  case 0xd:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_0089fb00;
    puVar3 = &UNK_009ee2c8;
    goto code_r0x0056691c;
  case 0xe:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abd36;
    puVar3 = &UNK_009ee2e8;
    goto code_r0x005669a8;
  case 0xf:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abd40;
    puVar3 = &UNK_009ee308;
    goto code_r0x005669d0;
  case 0x10:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abd46;
    puVar3 = &UNK_009ee328;
    uVar2 = 2;
    goto code_r0x00566a04;
  case 0x11:
    puVar1 = &UNK_008a1584;
    puVar3 = &UNK_009ee348;
code_r0x0056691c:
    uVar2 = 4;
    goto code_r0x00566a04;
  case 0x12:
    puVar1 = &UNK_008abd48;
    puVar3 = &UNK_009ee368;
    break;
  case 0x13:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abd4d;
    puVar3 = &UNK_009ee388;
    break;
  case 0x14:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abd52;
    puVar3 = &UNK_009ee3a8;
    goto code_r0x005669d0;
  default:
    puVar1 = &UNK_008abd58;
    puVar3 = &UNK_009ee3c8;
    goto code_r0x005669a8;
  case 0x16:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abd62;
    puVar3 = &UNK_009ee3e8;
    goto code_r0x005669a8;
  case 0x17:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abd6c;
    puVar3 = &UNK_009ee408;
    goto code_r0x005669a8;
  case 0x18:
    puVar1 = &UNK_008abd76;
    puVar3 = &UNK_009ee428;
    goto code_r0x00566944;
  case 0x19:
    puVar1 = &UNK_008abd84;
    puVar3 = &UNK_009ee448;
code_r0x00566944:
    lStack_18 = lStack_18 + 0x20;
    uVar2 = 0xe;
    goto code_r0x00566a04;
  case 0x1a:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abd92;
    puVar3 = &UNK_009ee468;
code_r0x005669a8:
    uVar2 = 10;
    goto code_r0x00566a04;
  case 0x1b:
    puVar1 = &UNK_008abd9c;
    puVar3 = &UNK_009ee488;
code_r0x005669d0:
    uVar2 = 6;
    goto code_r0x00566a04;
  case 0x1c:
    puVar1 = &UNK_008a1428;
    puVar3 = &UNK_009ee4a8;
    uVar2 = 8;
    goto code_r0x00566a04;
  case 0x1d:
    puVar1 = &UNK_008abda2;
    puVar3 = &UNK_009ee4c8;
    break;
  case 0x1e:
    puVar1 = &UNK_008abda7;
    puVar3 = &UNK_009ee4e8;
    break;
  case 0x1f:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008abdac;
    puVar3 = &UNK_009ee508;
    goto LAB_005669f8;
  case 0x20:
    puVar1 = &UNK_008abdb3;
    puVar3 = &UNK_009ee528;
LAB_005669f8:
    uVar2 = 7;
    goto code_r0x00566a04;
  }
  uVar2 = 5;
code_r0x00566a04:
  func_0x004699b0(auVar4._8_8_,puVar1,uVar2,&lStack_18,puVar3);
  return;
}

