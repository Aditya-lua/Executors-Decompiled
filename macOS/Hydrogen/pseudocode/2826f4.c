
undefined8 FUN_002826f4(long param_1,long *param_2,ulong param_3)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  
  uVar2 = func_0x00281fbc();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  plVar6 = (long *)(param_1 + 0x10);
  if ((*(char *)(param_1 + 8) != '\0') && (plVar6 = (long *)*plVar6, plVar6 == (long *)0x0)) {
    return 0;
  }
  uVar4 = plVar6[1];
  uVar1 = uVar4 + param_3;
  if (CARRY8(uVar4,param_3)) {
    uVar2 = 0x51;
  }
  else {
    uVar5 = plVar6[2];
    if (uVar1 <= uVar5) {
code_r0x002827c0:
      if (param_2 != (long *)0x0) {
        *param_2 = *plVar6 + uVar4;
      }
      plVar6[1] = uVar4 + param_3;
      return 1;
    }
    if ((*(byte *)(plVar6 + 3) & 1) != 0) {
      if (uVar1 <= uVar5 << 1 && -1 < (long)uVar5) {
        uVar1 = uVar5 << 1;
      }
      lVar3 = func_0x0036e48c(*plVar6,uVar1);
      if (lVar3 != 0) {
        *plVar6 = lVar3;
        plVar6[2] = uVar1;
        uVar4 = plVar6[1];
        goto code_r0x002827c0;
      }
      goto code_r0x00282744;
    }
    uVar2 = 0x57;
  }
  func_0x0028f83c(0xe,0,0x45,"/aws-lc/crypto/bytestring/cbb.c",uVar2);
code_r0x00282744:
  *(byte *)(plVar6 + 3) = *(byte *)(plVar6 + 3) | 2;
  return 0;
}

