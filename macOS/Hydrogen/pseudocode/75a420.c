
undefined8 FUN_0075a420(long param_1,long param_2,long *param_3,uint *param_4)

{
  long lVar1;
  long lVar2;
  byte *unaff_x19;
  
  lVar2 = *(long *)(param_2 + 0x18);
  if ((*(byte *)(lVar2 + 0x399) & 1) == 0) {
    if (*(int *)(param_1 + 0x20) != 1) {
      lVar2 = *(long *)(lVar2 + 0x68);
      *param_3 = lVar2;
code_r0x0075a47c:
      lVar1 = *(long *)(param_1 + 0x18);
      if ((*(byte *)(lVar1 + 0x399) >> 1 & 1) != 0) {
        *param_4 = *(uint *)(lVar1 + 0x51c);
        if (lVar2 == *(long *)(lVar1 + 0x68)) goto LAB_0075a4d4;
        goto LAB_0075a49c;
      }
      *param_4 = *(uint *)(lVar1 + 0x518);
      if (lVar2 != *(long *)(lVar1 + 0x68)) goto LAB_0075a49c;
      goto LAB_0075a4d4;
    }
    lVar2 = *(long *)(lVar2 + 0x80);
    *param_3 = lVar2;
  }
  else {
    lVar2 = *(long *)(lVar2 + 0x98);
    *param_3 = lVar2;
    if (*(int *)(param_1 + 0x20) != 1) goto code_r0x0075a47c;
  }
  lVar1 = *(long *)(param_1 + 0x18);
  *param_4 = (uint)*(ushort *)(lVar1 + 0x526);
  if (lVar2 != *(long *)(lVar1 + 0x68)) {
LAB_0075a49c:
    lVar2 = _strchr(lVar2,0x3a);
    *unaff_x19 = lVar2 != 0;
    return 0;
  }
LAB_0075a4d4:
  *unaff_x19 = (byte)(*(uint *)(lVar1 + 0x398) >> 10) & 1;
  return 0;
}

