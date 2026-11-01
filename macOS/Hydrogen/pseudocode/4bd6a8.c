
void FUN_004bd6a8(void)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000030;
  long lStack_18;
  
  func_0x005d2b20(&uStack0000000000000030);
  __Unwind_Resume();
  auVar4 = func_0x007a2668();
  lStack_18 = auVar4._0_8_;
  switch(*(undefined8 *)(lStack_18 + 0x18)) {
  case 0xc:
    puVar1 = &UNK_008a208a;
    puVar3 = &UNK_009e59a0;
    break;
  case 0xd:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_0089fb00;
    puVar3 = &UNK_009e59c0;
    goto code_r0x004bd8e0;
  case 0xe:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a208f;
    puVar3 = &UNK_009e59e0;
    goto code_r0x004bd96c;
  case 0xf:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a2099;
    puVar3 = &UNK_009e5a00;
    goto code_r0x004bd994;
  case 0x10:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a209f;
    puVar3 = &UNK_009e5a20;
    uVar2 = 2;
    goto code_r0x004bd9c8;
  case 0x11:
    puVar1 = &UNK_008a1584;
    puVar3 = &UNK_009e5a40;
code_r0x004bd8e0:
    uVar2 = 4;
    goto code_r0x004bd9c8;
  case 0x12:
    puVar1 = &UNK_008a20a1;
    puVar3 = &UNK_009e5a60;
    break;
  case 0x13:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a20a6;
    puVar3 = &UNK_009e5a80;
    break;
  case 0x14:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a20ab;
    puVar3 = &UNK_009e5aa0;
    goto code_r0x004bd994;
  default:
    puVar1 = &UNK_008a20b1;
    puVar3 = &UNK_009e5ac0;
    goto code_r0x004bd96c;
  case 0x16:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a20bb;
    puVar3 = &UNK_009e5ae0;
    goto code_r0x004bd96c;
  case 0x17:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a20c5;
    puVar3 = &UNK_009e5b00;
    goto code_r0x004bd96c;
  case 0x18:
    puVar1 = &UNK_008a20cf;
    puVar3 = &UNK_009e5b20;
    goto code_r0x004bd908;
  case 0x19:
    puVar1 = &UNK_008a20dd;
    puVar3 = &UNK_009e5b40;
code_r0x004bd908:
    lStack_18 = lStack_18 + 0x20;
    uVar2 = 0xe;
    goto code_r0x004bd9c8;
  case 0x1a:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a20eb;
    puVar3 = &UNK_009e5b60;
code_r0x004bd96c:
    uVar2 = 10;
    goto code_r0x004bd9c8;
  case 0x1b:
    puVar1 = &UNK_008a20f5;
    puVar3 = &UNK_009e5b80;
code_r0x004bd994:
    uVar2 = 6;
    goto code_r0x004bd9c8;
  case 0x1c:
    puVar1 = &UNK_008a1428;
    puVar3 = &UNK_009e5ba0;
    uVar2 = 8;
    goto code_r0x004bd9c8;
  case 0x1d:
    puVar1 = &UNK_008a20fb;
    puVar3 = &UNK_009e5bc0;
    break;
  case 0x1e:
    puVar1 = &UNK_008a2100;
    puVar3 = &UNK_009e5be0;
    break;
  case 0x1f:
    lStack_18 = lStack_18 + 0x20;
    puVar1 = &UNK_008a2105;
    puVar3 = &UNK_009e5c00;
    goto code_r0x004bd9bc;
  case 0x20:
    puVar1 = &UNK_008a210c;
    puVar3 = &UNK_009e5c20;
code_r0x004bd9bc:
    uVar2 = 7;
    goto code_r0x004bd9c8;
  }
  uVar2 = 5;
code_r0x004bd9c8:
  func_0x004699b0(auVar4._8_8_,puVar1,uVar2,&lStack_18,puVar3);
  return;
}

