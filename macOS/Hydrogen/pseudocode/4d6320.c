
undefined8 FUN_004d6320(long param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  long in_x10;
  long lVar3;
  long unaff_x22;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  
  if (in_x10 == -0x8000000000000000) {
    uVar4 = 0xffffffff;
  }
  else {
    uVar4 = (ulong)*(uint *)(in_x9 + 0x18);
  }
  lVar1 = *(long *)(param_1 + 0x20);
  uVar2 = *(ulong *)(param_1 + 0x28);
  uVar5 = 0xffffffff;
  do {
    do {
      if (uVar4 < uVar2) {
        lVar3 = lVar1 + uVar4 * 0x30;
        uVar4 = (ulong)*(uint *)(lVar3 + 0x20);
        uVar6 = *(uint *)(lVar3 + 0x2c);
      }
      else {
        do {
          if (uVar2 <= uVar5) {
            return 1;
          }
          lVar3 = lVar1 + uVar5 * 0x30;
          uVar5 = (ulong)*(uint *)(lVar3 + 0x24);
          uVar6 = *(uint *)(lVar3 + 0x28);
        } while (uVar6 == 0xffffffff);
      }
    } while (((ulong)(uVar6 >> 5) < (ulong)param_2[5]) &&
            ((*(uint *)(param_2[4] + (ulong)(uVar6 >> 5) * 4) >> (ulong)(uVar6 & 0x1f) & 1) != 0));
    if (unaff_x22 == *param_2) {
      func_0x005bcf2c(param_2,&UNK_009e6e88);
    }
    *(uint *)(param_2[1] + unaff_x22 * 4) = uVar6;
    unaff_x22 = unaff_x22 + 1;
    param_2[2] = unaff_x22;
  } while( true );
}

