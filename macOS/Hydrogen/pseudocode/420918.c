
void __ZN3std3net3tcp9TcpStream6linger17hf881709fcf521dd5E(ulong *param_1,undefined4 *param_2)

{
  int iVar1;
  uint *puVar2;
  ulong uVar3;
  undefined4 uVar4;
  undefined8 uStack_30;
  undefined4 uStack_24;
  
  uVar4 = 1000000000;
  uStack_30 = 0;
  uStack_24 = 8;
  iVar1 = _getsockopt(*param_2,0xffff,"k/Versions/A/LDAP",&uStack_30,&uStack_24);
  if (iVar1 == -1) {
    puVar2 = (uint *)___error();
    uVar3 = (ulong)*puVar2 << 0x20 | 2;
    uVar4 = 0x3b9aca01;
  }
  else {
    uVar3 = (ulong)uStack_30._4_4_;
    if ((int)uStack_30 != 0) {
      uVar4 = 0;
    }
  }
  *param_1 = uVar3;
  *(undefined4 *)(param_1 + 1) = uVar4;
  return;
}

