
undefined8 FUN_0075a438(long param_1,undefined8 param_2,long *param_3,uint *param_4)

{
  long lVar1;
  long lVar2;
  long in_x9;
  byte *unaff_x19;
  
  lVar1 = *(long *)(in_x9 + 0x80);
  *param_3 = lVar1;
  lVar2 = *(long *)(param_1 + 0x18);
  *param_4 = (uint)*(ushort *)(lVar2 + 0x526);
  if (lVar1 == *(long *)(lVar2 + 0x68)) {
    *unaff_x19 = (byte)(*(uint *)(lVar2 + 0x398) >> 10) & 1;
    return 0;
  }
  lVar1 = _strchr(lVar1,0x3a);
  *unaff_x19 = lVar1 != 0;
  return 0;
}

