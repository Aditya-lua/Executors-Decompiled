
undefined8 FUN_00662280(long *param_1,undefined8 param_2)

{
  undefined8 ****ppppuVar1;
  undefined8 uVar2;
  long *plVar3;
  char acStack_68 [8];
  undefined4 uStack_60;
  undefined1 uStack_5c;
  char cStack_51;
  undefined8 ****ppppuStack_50;
  long lStack_48;
  long lStack_40;
  
  cStack_51 = '\f';
  uStack_60 = 0x3a726574;
  acStack_68 = (char  [8])s_ThisPointer__008e5781._0_8_;
  uStack_5c = 0;
  uVar2 = _strlen(&UNK_008bdd07);
  plVar3 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                             (acStack_68,&UNK_008bdd07,uVar2);
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
  uVar2 = (**(code **)(*param_1 + 0x10))(param_1,ppppuVar1,&UNK_00a0bed8,param_2);
  if (lStack_40 < 0) {
    __ZdlPv(ppppuStack_50);
  }
  if (cStack_51 < '\0') {
    __ZdlPv(acStack_68);
    return uVar2;
  }
  s_ThisPointer__008e5781[0] = s_ThisPointer__008e5781[0];
  s_ThisPointer__008e5781[1] = s_ThisPointer__008e5781[1];
  s_ThisPointer__008e5781[2] = s_ThisPointer__008e5781[2];
  s_ThisPointer__008e5781[3] = s_ThisPointer__008e5781[3];
  s_ThisPointer__008e5781[4] = s_ThisPointer__008e5781[4];
  s_ThisPointer__008e5781[5] = s_ThisPointer__008e5781[5];
  s_ThisPointer__008e5781[6] = s_ThisPointer__008e5781[6];
  s_ThisPointer__008e5781[7] = s_ThisPointer__008e5781[7];
  return uVar2;
}

