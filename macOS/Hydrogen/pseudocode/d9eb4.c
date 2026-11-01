
undefined8 FUN_000d9eb4(long param_1)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  uint *in_x9;
  long lVar4;
  int in_w10;
  long in_x11;
  char *unaff_x19;
  int unaff_w22;
  long unaff_x23;
  byte *unaff_x24;
  undefined8 uVar5;
  undefined8 uVar6;
  
  if (*(int *)(in_x11 + (long)in_w10 * 0x38) == unaff_w22) {
    if ((*unaff_x24 & 1) == 0) {
      uVar1 = *in_x9;
      uVar5 = *(undefined8 *)(**(long **)(&UNK_00004b10 + param_1) + 4);
      uVar6 = *(undefined8 *)(**(long **)(&UNK_00004b10 + param_1) + 0xc);
      *(ulong *)(&UNK_00004a08 + param_1) =
           CONCAT44((float)((ulong)uVar5 >> 0x20) + (float)((ulong)uVar6 >> 0x20) * 0.5,
                    (float)uVar5 + (float)uVar6 * 0.5);
      *(undefined8 *)(&UNK_00004a10 + param_1) = 0x3f0000003f000000;
      *in_x9 = uVar1 | 1;
      in_x9[1] = 4;
    }
    iVar2 = func_0x000c9774();
    if (iVar2 != 0) {
      if ((unaff_x19 == (char *)0x0) || (*unaff_x19 != '\0')) {
        return 1;
      }
      lVar4 = *(long *)(unaff_x23 + 0x4c0);
      lVar3 = *(long *)(lVar4 + 0x4000);
      if ((*(long *)(&UNK_00004b18 + lVar4) == lVar3) &&
         (((&UNK_00004bc1)[lVar4] != '\0' && (*(int *)(&UNK_00004b68 + lVar4) == 0)))) {
        *(uint *)(&UNK_00004bc4 + lVar4) = *(uint *)(&UNK_00004bc4 + lVar4) & 0xfffffff0 | 2;
      }
      if ((*(byte *)(lVar3 + 0x17) & 1) != 0) {
        (&UNK_00003f66)[lVar4] = 1;
      }
      func_0x000cea90();
      (&UNK_00003f66)[lVar4] = 0;
      func_0x000d9868(*(undefined4 *)(unaff_x24 + 0xe8),1);
      return 0;
    }
    lVar4 = *(long *)(unaff_x23 + 0x4c0);
    unaff_x19 = &UNK_00003f66 + lVar4;
    lVar3 = *(long *)(lVar4 + 0x4000);
    if (((*(long *)(&UNK_00004b18 + lVar4) == lVar3) && ((&UNK_00004bc1)[lVar4] != '\0')) &&
       (*(int *)(&UNK_00004b68 + lVar4) == 0)) {
      *(uint *)(&UNK_00004bc4 + lVar4) = *(uint *)(&UNK_00004bc4 + lVar4) & 0xfffffff0 | 2;
    }
    if ((*(byte *)(lVar3 + 0x17) & 1) != 0) {
      *unaff_x19 = '\x01';
    }
    func_0x000cea90();
  }
  else {
    unaff_x24[0] = 0;
    unaff_x24[1] = 0;
    unaff_x24[2] = 0;
    unaff_x24[3] = 0;
    if ((unaff_x19 == (char *)0x0) || (*unaff_x19 == '\0')) {
      return 0;
    }
  }
  *unaff_x19 = '\0';
  return 0;
}

