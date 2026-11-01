
undefined8 FUN_00753bf0(long param_1)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  uint uVar4;
  byte *pbVar6;
  byte *pbVar5;
  long lVar7;
  undefined1 unaff_w20;
  long unaff_x21;
  long unaff_x23;
  undefined8 uVar8;
  long lVar9;
  long unaff_x26;
  long unaff_x27;
  long *unaff_x28;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  
code_r0x00753bf0:
  iVar2 = func_0x0077e76c(param_1);
  if (iVar2 == 0) {
    param_1 = unaff_x23;
    if (*(char *)(unaff_x27 + 0x928) != '\x03') goto LAB_00753d78;
    goto LAB_00753d64;
  }
LAB_00753c00:
  uVar8 = 0;
  if (unaff_x26 == 0) goto LAB_00753c1c;
LAB_00753c08:
  (*pcRam0000000000a2b5f0)(unaff_x26);
LAB_00753c1c:
  if ((int)uVar8 != 0) {
    return uVar8;
  }
LAB_00753c20:
  while( true ) {
    unaff_x28 = (long *)unaff_x28[1];
    if (unaff_x28 == (long *)0x0) {
      return 0;
    }
    lVar9 = *unaff_x28;
    lVar3 = _strchr(lVar9,0x3a);
    if (lVar3 != 0) break;
    lVar3 = _strchr(lVar9,0x3b);
    if (lVar3 != 0) {
      lVar7 = 0;
      do {
        bVar1 = *(byte *)(lVar3 + lVar7 + 1);
        if ((bVar1 != 9) && (bVar1 != 0x20)) {
          uVar4 = (uint)bVar1;
          if (uVar4 == 0) goto LAB_00753d04;
          if (3 < uVar4 - 10) goto code_r0x00753d00;
        }
        lVar7 = lVar7 + 1;
      } while( true );
    }
  }
  goto LAB_00753c40;
code_r0x00753d00:
  if (uVar4 == 0) {
LAB_00753d04:
    if (*(char *)(lVar3 + lVar7) == ';') {
      unaff_x26 = (*pcRam0000000000a2b600)(lVar9);
      if (unaff_x26 == 0) {
        func_0x00740678(in_stack_00000008);
        return 0x1b;
      }
      *(undefined1 *)((unaff_x26 - *unaff_x28) + lVar3 + lVar7) = unaff_w20;
      lVar9 = *unaff_x28;
      lVar3 = (unaff_x26 - lVar9) + lVar3 + lVar7;
      if (lVar3 == lVar9) goto LAB_00753c20;
    }
    else {
LAB_00753c40:
      unaff_x26 = 0;
      if (lVar3 == lVar9) goto LAB_00753c20;
    }
    pbVar6 = (byte *)(lVar3 + 1);
    do {
      do {
        pbVar5 = pbVar6 + 1;
        bVar1 = *pbVar6;
        pbVar6 = pbVar5;
      } while (bVar1 == 9);
    } while ((bVar1 == 0x20) || ((uVar4 = (uint)bVar1, uVar4 != 0 && (uVar4 - 10 < 4))));
    if ((unaff_x26 != 0) || (uVar4 != 0)) goto LAB_00753c7c;
  }
  goto LAB_00753c20;
LAB_00753c7c:
  param_1 = unaff_x26;
  if (unaff_x26 == 0) {
    param_1 = lVar9;
  }
  if ((*(long *)("/usr/lib/libobjc.A.dylib" + unaff_x21 + 0x10) != 0) &&
     (iVar2 = func_0x0077e76c(param_1), iVar2 != 0)) goto LAB_00753c00;
  unaff_x23 = param_1;
  if (*(char *)(unaff_x27 + 0x928) == '\x02') goto code_r0x00753bf0;
  if (*(char *)(unaff_x27 + 0x928) == '\x03') {
LAB_00753d64:
    iVar2 = func_0x0077e76c(param_1);
    unaff_x23 = param_1;
    if (iVar2 != 0) goto LAB_00753c00;
  }
LAB_00753d78:
  if ((((((*(byte *)(in_stack_00000018 + 2) >> 2 & 1) != 0) &&
        (iVar2 = func_0x0077e76c(unaff_x23,"Content-Length:",0xf), iVar2 != 0)) ||
       ((*(long *)((long)&linkedit_data_command_00001308.dataoff + unaff_x21) != 0 &&
        (iVar2 = func_0x0077e76c(unaff_x23,"Connection:",0xb), iVar2 != 0)))) ||
      ((0x13 < in_stack_00000010._4_4_ &&
       (iVar2 = func_0x0077e76c(unaff_x23,"Transfer-Encoding:",0x12), iVar2 != 0)))) ||
     (((iVar2 = func_0x0077e76c(unaff_x23,"Authorization:",0xe), iVar2 != 0 ||
       (iVar2 = func_0x0077e76c(unaff_x23,"Cookie:",7), iVar2 != 0)) &&
      (iVar2 = func_0x0079080c(), iVar2 == 0)))) goto LAB_00753c00;
  uVar8 = func_0x00740a18(in_stack_00000008,"%s\r\n");
  if (unaff_x26 != 0) goto LAB_00753c08;
  goto LAB_00753c1c;
}

