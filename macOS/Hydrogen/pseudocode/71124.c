
void FUN_00071124(long param_1,undefined8 param_2,long param_3)

{
  ushort *puVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x21;
  ushort *unaff_x22;
  uint unaff_w23;
  
  do {
    puVar1 = (ushort *)_memchr(param_1,param_2,param_3);
    if (puVar1 == (ushort *)0x0) {
LAB_00071178:
      puVar2 = (undefined8 *)__Znwm(0x48);
      *puVar2 = &UNK_009b9248;
      func_0x00072aa4(puVar2 + 1);
LAB_0007119c:
      *unaff_x19 = puVar2;
      return;
    }
    if (*puVar1 == unaff_w23) {
      if ((puVar1 != unaff_x22) && ((long)puVar1 - unaff_x21 != -1)) {
        puVar2 = (undefined8 *)__Znwm(0x38);
        func_0x00071434();
        goto LAB_0007119c;
      }
      goto LAB_00071178;
    }
    param_1 = (long)puVar1 + 1;
    if ((long)unaff_x22 - param_1 < 2) goto LAB_00071178;
    param_3 = ((long)unaff_x22 - param_1) + -1;
    param_2 = 0x2f;
  } while( true );
}

