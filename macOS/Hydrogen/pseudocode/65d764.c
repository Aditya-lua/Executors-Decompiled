
undefined8 FUN_0065d764(long *param_1,undefined8 param_2)

{
  undefined8 ****ppppuVar1;
  undefined8 uVar2;
  long *plVar3;
  undefined7 uStack_68;
  undefined4 uStack_61;
  undefined1 uStack_5d;
  char cStack_51;
  undefined8 ****ppppuStack_50;
  long lStack_48;
  long lStack_40;
  
  cStack_51 = '\v';
  uStack_68 = s_ThisObject__008e578e._0_7_;
  uStack_61._0_1_ = s_ThisObject__008e578e[7];
  uStack_61 = CONCAT31(0x3a7463,(char)uStack_61);
  uStack_5d = 0;
  uVar2 = _strlen(&UNK_008be401);
  plVar3 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                             (&uStack_68,&UNK_008be401,uVar2);
  lStack_48 = plVar3[1];
  ppppuStack_50 = (undefined8 ****)*plVar3;
  lStack_40 = plVar3[2];
  plVar3[1] = 0;
  plVar3[2] = 0;
  *plVar3 = 0;
  ppppuVar1 = ppppuStack_50;
  if (-1 < lStack_40) {
    ppppuVar1 = &ppppuStack_50;
  }
  uVar2 = (**(code **)(*param_1 + 0x10))(param_1,ppppuVar1,&UNK_00a02158,param_2);
  if (lStack_40 < 0) {
    __ZdlPv(ppppuStack_50);
  }
  if (cStack_51 < '\0') {
    __ZdlPv(CONCAT17((char)uStack_61,uStack_68));
    return uVar2;
  }
  s_ThisObject__008e578e[0] = s_ThisObject__008e578e[0];
  s_ThisObject__008e578e[1] = s_ThisObject__008e578e[1];
  s_ThisObject__008e578e[2] = s_ThisObject__008e578e[2];
  s_ThisObject__008e578e[3] = s_ThisObject__008e578e[3];
  s_ThisObject__008e578e[4] = s_ThisObject__008e578e[4];
  s_ThisObject__008e578e[5] = s_ThisObject__008e578e[5];
  s_ThisObject__008e578e[6] = s_ThisObject__008e578e[6];
  s_ThisObject__008e578e[7] = s_ThisObject__008e578e[7];
  return uVar2;
}

