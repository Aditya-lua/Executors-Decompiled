
void FUN_0062435c(ulong param_1)

{
  bool in_ZR;
  int iVar1;
  undefined8 uVar2;
  ulong in_x9;
  undefined1 auStack_88 [128];
  
  if ((in_ZR) ||
     (((long)(in_x9 & param_1) < 0 &&
      (iVar1 = _strcmp(in_x9 & 0x7fffffffffffffff,param_1 & 0x7fffffffffffffff), iVar1 == 0)))) {
    return;
  }
  func_0x0068026c();
  uVar2 = func_0x0067ee60(auStack_88 + 0x80,"Modulus","SubgroupGenerator",0xa8,1);
  func_0x0067f274(uVar2,"SubgroupOrder",&DAT_0067ebec,0);
  return;
}

