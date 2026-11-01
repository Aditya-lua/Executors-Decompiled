
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0065b634(long param_1,long param_2,long param_3)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  long *unaff_x19;
  long *unaff_x21;
  long *unaff_x23;
  long *unaff_x24;
  
  *(undefined8 *)((long)unaff_x24 + *(long *)(param_1 + -0x70)) = *(undefined8 *)(param_3 + 0x28);
  lVar5 = *(long *)(param_3 + 0x18);
  *unaff_x23 = lVar5;
  *unaff_x24 = *(long *)(param_3 + 0x30);
  *(undefined8 *)((long)unaff_x23 + *(long *)(lVar5 + -0x18)) = *(undefined8 *)(param_3 + 0x38);
  lVar5 = *(long *)(param_3 + 0x10);
  *unaff_x23 = lVar5;
  *unaff_x24 = *(long *)(param_3 + 0x40);
  *(undefined8 *)((long)unaff_x23 + *(long *)(lVar5 + -0x18)) = *(undefined8 *)(param_3 + 0x48);
  lVar5 = *(long *)(param_3 + 8);
  *unaff_x23 = lVar5;
  *unaff_x24 = *(long *)(param_3 + 0x50);
  *(undefined8 *)((long)unaff_x23 + *(long *)(lVar5 + -0x18)) = *(undefined8 *)(param_3 + 0x58);
  lVar5 = param_2 + 0x18;
  *(undefined **)(param_2 + 0x20) = &UNK_00a09938;
  func_0x0064ec5c(lVar5,&UNK_00a10e68);
  uVar4 = _UNK_00a10ee8;
  lVar3 = _UNK_00a10ee0;
  lVar2 = _UNK_00a10e60;
  lVar1 = _UNK_00a10e58;
  unaff_x21[3] = _UNK_00a10e60;
  unaff_x21[4] = lVar3;
  *(undefined8 *)(lVar5 + *(long *)(lVar2 + -0x18)) = uVar4;
  uVar4 = _UNK_00a10ef8;
  lVar2 = _UNK_00a10ef0;
  unaff_x21[3] = lVar1;
  unaff_x21[4] = lVar2;
  *(undefined8 *)(lVar5 + *(long *)(lVar1 + -0x18)) = uVar4;
  unaff_x21[3] = (long)&UNK_00a10bf0;
  unaff_x21[4] = (long)&UNK_00a10d48;
  lVar5 = *unaff_x19;
  *unaff_x21 = lVar5;
  *unaff_x23 = unaff_x19[0xc];
  *unaff_x24 = unaff_x19[0xd];
  *(long *)((long)unaff_x21 + *(long *)(lVar5 + -0x18)) = unaff_x19[0xe];
  unaff_x21[0x1f] = (long)&UNK_009fa210;
  func_0x005fdd18(unaff_x21 + 0x20);
  *(undefined4 *)(unaff_x21 + 0x26) = 0;
  func_0x005fdd18(unaff_x21 + 0x27);
  unaff_x21[0x2d] = 0;
  unaff_x21[0x2e] = 0;
  unaff_x21[0x2f] = 0;
  return;
}

