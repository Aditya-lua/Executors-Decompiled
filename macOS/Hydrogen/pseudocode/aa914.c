
undefined8 FUN_000aa914(long param_1)

{
  uint *puVar1;
  uint uVar2;
  int iVar3;
  bool bVar4;
  bool bVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  undefined4 uVar9;
  code *pcVar10;
  ulong uVar11;
  ulong uVar12;
  uint *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  uint *unaff_x26;
  long unaff_x27;
  long unaff_x29;
  int *in_stack_00000008;
  long in_stack_00000030;
  long *in_stack_00000038;
  long *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 *in_stack_00000050;
  
  if (param_1 == 0) {
    return 0xfffffffffffffff7;
  }
  if (unaff_x23[0xf] == 0) {
LAB_000aa930:
    pcVar10 = (code *)*unaff_x23;
    if (pcVar10 != (code *)0x0) goto LAB_000aa938;
LAB_000aa960:
    lVar7 = _malloc();
    unaff_x23[0xf] = lVar7;
  }
  else {
    if ((code *)unaff_x23[2] != (code *)0x0) {
      (*(code *)unaff_x23[2])(unaff_x23[3]);
      goto LAB_000aa930;
    }
    _free(unaff_x23[0xf]);
    pcVar10 = (code *)*unaff_x23;
    if (pcVar10 == (code *)0x0) goto LAB_000aa960;
LAB_000aa938:
    lVar7 = (*pcVar10)(unaff_x23[3]);
    unaff_x23[0xf] = lVar7;
  }
  if (lVar7 == 0) {
    return 0xfffffffffffffff7;
  }
  unaff_x23[0xb] = unaff_x24;
  *unaff_x22 = 0;
  unaff_x22[1] = 0;
  unaff_x23[0x12] = lVar7;
  *in_stack_00000050 = 0;
  in_stack_00000050[1] = 0;
  *(undefined4 *)((long)unaff_x23 + 0x44) = 3;
  uVar11 = (long)unaff_x20 - (long)unaff_x26;
  if (uVar11 < 4) {
    unaff_x23[0xd] = 0;
    *(undefined4 *)((long)unaff_x23 + 0x44) = 4;
    uVar12 = 4 - unaff_x23[0xd];
    if (uVar11 <= uVar12) {
      uVar12 = uVar11;
    }
    _memcpy(unaff_x23[0xc] + unaff_x23[0xd]);
    puVar1 = (uint *)((long)unaff_x26 + uVar12);
    uVar12 = unaff_x23[0xd] + uVar12;
    unaff_x23[0xd] = uVar12;
    if (uVar12 < 4) {
      *(ulong *)(unaff_x29 + -0x60) = 4 - uVar12;
      iVar3 = *(int *)((long)unaff_x23 + 0x24);
      goto joined_r0x000aacc4;
    }
    uVar2 = *(uint *)unaff_x23[0xc];
  }
  else {
    puVar1 = unaff_x26 + 1;
    uVar2 = *unaff_x26;
  }
  if (uVar2 == 0) {
    uVar9 = 10;
  }
  else {
    uVar11 = (ulong)uVar2 & 0x7fffffff;
    if ((ulong)unaff_x23[10] < uVar11) {
      return 0xfffffffffffffffe;
    }
    if (-1 < (int)uVar2) {
      lVar7 = (ulong)*(uint *)((long)unaff_x23 + 0x3c) * 4 + uVar11;
      unaff_x23[0xe] = lVar7;
      *(undefined4 *)((long)unaff_x23 + 0x44) = 7;
      bVar5 = unaff_x25 != *(long *)(unaff_x29 + -0x58);
      bVar4 = bVar5 && puVar1 != unaff_x20;
      lVar8 = *(long *)(unaff_x29 + -0x60);
      if (!bVar5 || puVar1 == unaff_x20) {
        lVar8 = lVar7 + 4;
      }
      *(long *)(unaff_x29 + -0x60) = lVar8;
      goto LAB_000aa3dc;
    }
    unaff_x23[0xe] = uVar11;
    if (*(uint *)((long)unaff_x23 + 0x3c) != 0) {
      func_0x000b55d4(in_stack_00000048,0);
    }
    uVar9 = 5;
  }
  *(undefined4 *)((long)unaff_x23 + 0x44) = uVar9;
  while( true ) {
    bVar4 = true;
LAB_000aa3dc:
    if (!bVar4) break;
    if (*(uint *)((long)unaff_x23 + 0x44) < 0xf) {
                    /* WARNING: Could not recover jumptable at 0x000aa3f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar6 = (*(code *)(&UNK_000aa3fc +
                        (ulong)*(ushort *)(unaff_x21 + (ulong)*(uint *)((long)unaff_x23 + 0x44) * 2)
                        * 4))();
      return uVar6;
    }
  }
  iVar3 = *(int *)((long)unaff_x23 + 0x24);
joined_r0x000aacc4:
  if ((((iVar3 == 0) && (lVar7 = unaff_x23[0x10], lVar7 != 0)) &&
      (lVar8 = unaff_x23[0xf], lVar7 != lVar8)) &&
     (((in_stack_00000008 == (int *)0x0 || (*in_stack_00000008 == 0)) &&
      (*(int *)((long)unaff_x23 + 0x44) - 2U < 8)))) {
    if (*(int *)((long)unaff_x23 + 0x44) == 9) {
      uVar11 = 0;
      if ((undefined *)unaff_x23[0x13] < &UNK_00010001) {
        uVar11 = 0x10000 - unaff_x23[0x13];
      }
      uVar12 = unaff_x23[0x12] - lVar8;
      if (uVar12 <= uVar11) {
        uVar11 = uVar12;
      }
      _memcpy(unaff_x23[0x12] - uVar11,((lVar7 + unaff_x23[0x11]) - unaff_x23[0x14]) - uVar11);
      unaff_x23[0x10] = unaff_x23[0xf];
      unaff_x23[0x11] = unaff_x23[0x14] + uVar12;
    }
    else {
      uVar12 = unaff_x23[0x11];
      uVar11 = uVar12;
      if (0xffff < uVar12) {
        uVar11 = 0x10000;
      }
      _memcpy(lVar8,(lVar7 + uVar12) - uVar11,uVar11);
      unaff_x23[0x10] = unaff_x23[0xf];
      unaff_x23[0x11] = uVar11;
      unaff_x23[0x12] = unaff_x23[0xf] + uVar11;
    }
  }
  *in_stack_00000038 = (long)puVar1 - in_stack_00000030;
  *in_stack_00000040 = unaff_x25 - unaff_x27;
  return *(undefined8 *)(unaff_x29 + -0x60);
}

