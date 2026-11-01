
void FUN_0066bb74(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  long *unaff_x19;
  
  while( true ) {
    (**(code **)(*unaff_x19 + 0x1e0))();
    uVar4 = unaff_x19[0x10];
    if (uVar4 == 0) break;
    lVar1 = unaff_x19[0xd] + unaff_x19[0xc];
    uVar5 = lVar1 - unaff_x19[0x11];
    uVar3 = uVar4;
    if (uVar5 <= uVar4) {
      uVar3 = uVar5;
    }
    lVar2 = unaff_x19[0x11] + uVar3;
    unaff_x19[0x10] = uVar4 - uVar3;
    unaff_x19[0x11] = lVar2;
    if (uVar4 <= uVar5 || lVar2 == lVar1) {
      unaff_x19[0x11] = unaff_x19[0xd];
    }
  }
  return;
}

