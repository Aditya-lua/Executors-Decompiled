
void FUN_00680b68(long *param_1,long param_2,uint param_3)

{
  uint uVar1;
  ulong uVar2;
  byte bVar3;
  code *pcVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  long *plVar8;
  long *plVar9;
  long lVar10;
  undefined8 uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined1 uStack0000000000000008;
  
  (**(code **)(*param_1 + 0x80))();
  plVar8 = (long *)(**(code **)(*param_1 + 0xa8))(param_1);
  uVar5 = (**(code **)(*plVar8 + 0x50))();
  if (uVar5 == 0) {
    uVar11 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(&uStack0000000000000008,
                    "HMAC: can only be used with a block-based hash function");
    func_0x0002703c(uVar11,&uStack0000000000000008);
    ___cxa_throw(uVar11,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x680de0);
    (*pcVar4)();
  }
  uVar14 = (ulong)param_3;
  plVar9 = (long *)(**(code **)(*param_1 + 0xa8))(param_1);
  iVar6 = (**(code **)(*plVar9 + 0x50))();
  plVar9 = (long *)(**(code **)(*param_1 + 0xa8))(param_1);
  iVar7 = (**(code **)(*plVar9 + 0x48))();
  uVar1 = iVar7 + iVar6 * 2;
  uVar15 = (ulong)uVar1;
  uVar13 = param_1[4];
  lVar12 = param_1[5];
  if (uVar13 == uVar15) {
    param_1[4] = uVar15;
    param_1[5] = lVar12;
    param_1[3] = -1;
    lVar10 = lVar12;
    goto joined_r0x00680c6c;
  }
  if (uVar1 == 0) {
    lVar10 = 0;
joined_r0x00680c58:
    if (lVar12 == 0) {
      param_1[4] = uVar15;
      param_1[5] = lVar10;
      param_1[3] = -1;
      goto joined_r0x00680c6c;
    }
  }
  else {
    lVar10 = func_0x006115d0(uVar15);
    if ((lVar12 == 0) || (lVar10 == 0)) goto joined_r0x00680c58;
    uVar2 = uVar15;
    if (uVar13 <= uVar15) {
      uVar2 = uVar13;
    }
    _memcpy(lVar10,lVar12,uVar2);
  }
  if (uVar13 != 0) {
    do {
      *(undefined1 *)(lVar12 + -1 + uVar13) = 0;
      uVar13 = uVar13 - 1;
    } while (uVar13 != 0);
  }
  func_0x00611644(lVar12);
  param_1[4] = uVar15;
  param_1[5] = lVar10;
  param_1[3] = -1;
joined_r0x00680c6c:
  if (uVar5 < param_3) {
    plVar9 = (long *)(**(code **)(*param_1 + 0xa8))(param_1);
    (**(code **)(*plVar9 + 0x68))(plVar9,param_1[5],param_2,uVar14);
    param_3 = (**(code **)(*plVar8 + 0x48))(plVar8);
    uVar14 = (ulong)param_3;
  }
  else if (((param_3 != 0) && (param_2 != 0)) && (lVar10 != 0)) {
    _memcpy(lVar10,param_2,uVar14);
  }
  _bzero(param_1[5] + uVar14,uVar5 - param_3);
  uVar13 = 0;
  if (uVar5 < 2) {
    uVar5 = 1;
  }
  do {
    lVar12 = param_1[5];
    bVar3 = *(byte *)(lVar12 + uVar13);
    plVar8 = (long *)(**(code **)(*param_1 + 0xa8))(param_1);
    uVar14 = (**(code **)(*plVar8 + 0x50))();
    ((byte *)(lVar12 + uVar13))[uVar14 & 0xffffffff] = bVar3 ^ 0x5c;
    *(byte *)(param_1[5] + uVar13) = *(byte *)(param_1[5] + uVar13) ^ 0x36;
    uVar13 = uVar13 + 1;
  } while (uVar5 != uVar13);
  return;
}

