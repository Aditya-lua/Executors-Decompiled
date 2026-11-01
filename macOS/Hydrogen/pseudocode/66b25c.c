
ulong FUN_0066b25c(long param_1)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long in_x9;
  ulong in_x10;
  long in_x11;
  undefined8 *in_x12;
  ulong in_x13;
  long in_x14;
  ulong in_x15;
  long in_x16;
  long *unaff_x19;
  int unaff_w20;
  int unaff_w22;
  
code_r0x0066b25c:
  uVar6 = in_x14 + in_x16;
  if (in_x15 < uVar6) {
    lVar5 = in_x9;
  }
  else {
    lVar5 = 0;
    if (in_x10 <= uVar6) {
      lVar5 = uVar6 - in_x10;
    }
    unaff_x19[0xe] = in_x13 + 1;
    unaff_x19[0xf] = unaff_x19[0xf] + -1;
    if (0x153 < in_x13 + 1) {
      __ZdlPv(*in_x12);
      unaff_x19[0xb] = unaff_x19[0xb] + 8;
      unaff_x19[0xe] = unaff_x19[0xe] + -0xaa;
      param_1 = unaff_x19[0x10];
      in_x9 = unaff_x19[0x11];
      in_x10 = unaff_x19[6];
      in_x11 = unaff_x19[7];
    }
  }
  lVar4 = in_x9 - lVar5;
  unaff_x19[0x10] = param_1 + lVar5;
  unaff_x19[0x11] = lVar4;
  unaff_x19[6] = in_x10 + lVar5;
  unaff_x19[7] = in_x11 + lVar5;
  if (lVar4 == 0) goto LAB_0066b0f4;
  do {
    if ((lVar4 != 0) && (unaff_x19[0xf] != 0)) {
      lVar5 = *(long *)(unaff_x19[0xb] + ((ulong)unaff_x19[0xe] / 0xaa) * 8);
      uVar6 = (ulong)unaff_x19[0xe] % 0xaa;
      if ((*(int *)(lVar5 + uVar6 * 0x18) == *(int *)((long)unaff_x19 + 0x44)) &&
         (*(ulong *)(lVar5 + uVar6 * 0x18 + 8) < (ulong)(unaff_x19[6] + lVar4))) break;
    }
    lVar5 = unaff_x19[0x10];
    lVar4 = unaff_x19[0x11];
    iVar1 = 0;
    if (unaff_w22 != 0) {
      iVar1 = unaff_w22 + -1;
    }
    plVar3 = (long *)(**(code **)(*unaff_x19 + 0x160))();
    lVar2 = 0x138;
    if (unaff_w20 == 0) {
      lVar2 = 0x130;
    }
    lVar4 = (**(code **)(*plVar3 + lVar2))(plVar3,&UNK_008ba5c8,lVar5,lVar4,iVar1);
    *(uint *)(unaff_x19 + 5) = (uint)(lVar4 != 0) << 1;
    lVar5 = unaff_x19[0x11];
    if (lVar4 != 0) goto code_r0x0066b30c;
    unaff_x19[7] = unaff_x19[7] + lVar5;
    unaff_x19[6] = unaff_x19[6] + lVar5;
    unaff_x19[0x11] = 0;
    if (unaff_w22 != 0) {
      unaff_x19[6] = 0;
      unaff_x19[8] = CONCAT44((int)((ulong)unaff_x19[8] >> 0x20) + 1,(int)unaff_x19[8] + 1);
    }
    unaff_w22 = 0;
    lVar4 = 0;
LAB_0066b0f4:
    if (unaff_w22 == 0) {
      return 0;
    }
  } while( true );
  lVar4 = unaff_x19[0x10];
  uVar6 = *(ulong *)(*(long *)(unaff_x19[0xb] + ((ulong)unaff_x19[0xe] / 0xaa) * 8) +
                     ((ulong)unaff_x19[0xe] % 0xaa) * 0x18 + 8);
  lVar5 = 0;
  if ((ulong)unaff_x19[6] <= uVar6) {
    lVar5 = uVar6 - unaff_x19[6];
  }
  plVar3 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  lVar2 = 0x138;
  if (unaff_w20 == 0) {
    lVar2 = 0x130;
  }
  lVar4 = (**(code **)(*plVar3 + lVar2))(plVar3,&UNK_008ba5c8,lVar4,lVar5,0);
  *(uint *)(unaff_x19 + 5) = (uint)(lVar4 != 0);
  if (lVar4 != 0) {
    uVar6 = *(ulong *)(*(long *)(unaff_x19[0xb] + ((ulong)unaff_x19[0xe] / 0xaa) * 8) +
                       ((ulong)unaff_x19[0xe] % 0xaa) * 0x18 + 8);
    lVar5 = 0;
    if ((ulong)unaff_x19[6] <= uVar6) {
      lVar5 = uVar6 - unaff_x19[6];
    }
code_r0x0066b30c:
    uVar6 = lVar5 - unaff_x19[4];
    if (uVar6 < 2) {
      uVar6 = 1;
    }
    return uVar6;
  }
  lVar2 = unaff_x19[0x11];
  param_1 = unaff_x19[0x10] + lVar5;
  in_x9 = lVar2 - lVar5;
  unaff_x19[0x10] = param_1;
  unaff_x19[0x11] = in_x9;
  lVar4 = unaff_x19[6];
  in_x10 = lVar4 + lVar5;
  in_x11 = unaff_x19[7] + lVar5;
  unaff_x19[6] = in_x10;
  unaff_x19[7] = in_x11;
  in_x15 = lVar4 + lVar2;
  in_x12 = (undefined8 *)unaff_x19[0xb];
  in_x13 = unaff_x19[0xe];
  lVar5 = in_x12[in_x13 / 0xaa] + (in_x13 % 0xaa) * 0x18;
  in_x16 = *(long *)(lVar5 + 8);
  in_x14 = *(long *)(lVar5 + 0x10);
  goto code_r0x0066b25c;
}

