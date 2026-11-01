
undefined * FUN_000dc110(long param_1,uint param_2)

{
  uint *puVar1;
  int iVar2;
  long lVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  float fVar7;
  
  lVar3 = lRam0000000000a334c0;
  puVar1 = (uint *)(&UNK_00004d50 + lRam0000000000a334c0);
  if (param_1 != 0) {
    if (*(int *)(&UNK_00004d74 + lRam0000000000a334c0) == -1) {
      return (undefined *)0x0;
    }
    iVar5 = _strcmp(param_1,&UNK_00004d78 + lRam0000000000a334c0);
    if (iVar5 != 0) {
      return (undefined *)0x0;
    }
  }
  iVar5 = *(int *)(&UNK_00004dd0 + lVar3);
  iVar2 = *(int *)(&UNK_00004dc0 + lVar3);
  fVar7 = ((float)*(undefined8 *)(&UNK_00004da8 + lVar3) -
          (float)*(undefined8 *)(&UNK_00004da0 + lVar3)) *
          ((float)((ulong)*(undefined8 *)(&UNK_00004da8 + lVar3) >> 0x20) -
          (float)((ulong)*(undefined8 *)(&UNK_00004da0 + lVar3) >> 0x20));
  if (*(float *)(&UNK_00004dc8 + lVar3) < fVar7) {
    return (undefined *)0x0;
  }
  *(uint *)(&UNK_00004dc4 + lVar3) = param_2;
  *(int *)(&UNK_00004dcc + lVar3) = iVar2;
  *(float *)(&UNK_00004dc8 + lVar3) = fVar7;
  (&UNK_00004d99)[lVar3] = iVar5 == iVar2;
  if ((((*puVar1 | param_2) >> 0xb & 1) == 0) && (iVar5 == iVar2)) {
    func_0x000dc314();
  }
  *(undefined4 *)(&UNK_00004dd4 + lVar3) = *(undefined4 *)(&UNK_00003f58 + lVar3);
  if (iVar5 != iVar2) {
    (&UNK_00004d9a)[lVar3] = 0;
    if ((param_2 >> 10 & 1) == 0) {
      return (undefined *)0x0;
    }
    goto LAB_000dc2f4;
  }
  iVar5 = *(int *)(&UNK_00004d58 + lVar3);
  bVar4 = false;
  if (*(char *)(lRam0000000000a334c0 + iVar5 + 0xe48) == '\0') goto LAB_000dc2c8;
  if (iVar5 + 0x8fU < 0x9a) {
LAB_000dc22c:
    uVar6 = iVar5 + 0x28f;
    if ((uVar6 & 0xf800) != 0) {
      if (iVar5 < 0x1d71) {
        if (iVar5 == 0x571) {
          uVar6 = 0x296;
          if (*(char *)(lRam0000000000a334c0 + 0x59) != '\0') {
            uVar6 = 0x299;
          }
        }
        else if (iVar5 == 0xd71) {
          uVar6 = 0x296;
        }
      }
      else if (iVar5 == 0x7d71) {
        uVar6 = 0x299;
      }
      else if (iVar5 == 0x3d71) {
        uVar6 = 0x298;
      }
      else if (iVar5 == 0x1d71) {
        uVar6 = 0x297;
      }
    }
    bVar4 = (&UNK_000040dc)[lRam0000000000a334c0 + (ulong)(uVar6 - 0x200) * 0xc] == '\0';
  }
  else {
    bVar4 = true;
    if (iVar5 < 0x1d71) {
      if ((iVar5 == 0x571) || (iVar5 == 0xd71)) goto LAB_000dc22c;
    }
    else if ((iVar5 == 0x1d71 || iVar5 == 0x7d71) || iVar5 == 0x3d71) goto LAB_000dc22c;
  }
LAB_000dc2c8:
  (&UNK_00004d9a)[lVar3] = bVar4 ^ 1;
  if (((param_2 >> 10 & 1) == 0) && (bVar4 != false)) {
    return (undefined *)0x0;
  }
LAB_000dc2f4:
  return &UNK_00004d60 + lVar3;
}

