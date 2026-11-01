
int FUN_000b4bc4(undefined8 param_1)

{
  long lVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  ulong uVar4;
  undefined1 *puVar5;
  long in_x15;
  long unaff_x19;
  undefined1 *puVar6;
  int iVar7;
  long unaff_x20;
  ulong unaff_x22;
  long lVar8;
  long unaff_x25;
  long unaff_x29;
  int *in_stack_000000f0;
  int in_stack_00000160;
  undefined8 in_stack_00000168;
  
  lVar8 = (unaff_x22 / 0x1fe) * 2;
  _memset(param_1,0xff,lVar8 + 2);
  lVar8 = lVar8 + in_x15 + unaff_x19;
  puVar3 = (undefined1 *)(lVar8 + 4);
  uVar4 = unaff_x22 % 0x1fe;
  puVar2 = puVar3;
  if (0xfe < uVar4) {
    puVar2 = (undefined1 *)(lVar8 + 5);
    *puVar3 = 0xff;
    uVar4 = uVar4 - 0xff;
  }
  puVar3 = puVar2 + 1;
  *puVar2 = (char)uVar4;
  lVar8 = unaff_x25 + unaff_x20;
  puVar6 = (undefined1 *)(*(long *)(unaff_x29 + -0xb0) - lVar8);
  lVar1 = 5;
  if (in_stack_00000168._4_4_ != 2) {
    lVar1 = 0;
  }
  if ((in_stack_00000168._4_4_ != 0) &&
     (puVar5 = (undefined1 *)(*(long *)(unaff_x29 + -0x80) + lVar1),
     puVar5 < puVar3 + (long)(puVar6 + (ulong)(puVar6 + 0xf0) / 0xff + 1))) {
    if (in_stack_00000168._4_4_ == 1) {
      iVar7 = 0;
      goto LAB_000b4c80;
    }
    puVar6 = puVar5 + (~(ulong)puVar3 - ((ulong)(puVar5 + ~(ulong)puVar3 + 0xf1) >> 8));
  }
  iVar7 = (int)puVar6;
  puVar5 = puVar6 + -0xf;
  if (puVar6 < (undefined1 *)0xf) {
    *puVar3 = (char)(iVar7 << 4);
  }
  else {
    puVar2 = puVar2 + 2;
    *puVar3 = 0xf0;
    if ((undefined1 *)0xfe < puVar5) {
      uVar4 = (ulong)(puVar6 + -0x10e) / 0xff;
      _memset(puVar2,0xff,uVar4 + 1);
      puVar5 = (undefined1 *)((ulong)(puVar6 + -0x10e) % 0xff);
      puVar2 = puVar3 + uVar4 + 2;
    }
    *puVar2 = (char)puVar5;
    puVar3 = puVar2;
  }
  _memcpy(puVar3 + 1,lVar8,puVar6);
  *in_stack_000000f0 = ((int)lVar8 + iVar7) - in_stack_00000160;
  iVar7 = ((int)(puVar3 + 1) + iVar7) - (int)*(undefined8 *)(unaff_x29 + -0x100);
  if (0 < iVar7) {
    return iVar7;
  }
LAB_000b4c80:
  *(undefined1 *)(*(long *)(unaff_x29 + -0xb8) + 0x27) = 1;
  return iVar7;
}

