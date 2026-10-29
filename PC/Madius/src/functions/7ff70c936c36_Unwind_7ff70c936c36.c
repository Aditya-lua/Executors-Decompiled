/* 7ff70c936c36 Unwind@7ff70c936c36 */

void Unwind_7ff70c936c36(undefined8 param_1,undefined4 param_2,int param_3)

{
  uint uVar1;
  longlong lVar2;
  ulonglong uVar3;
  longlong in_RDX;
  undefined1 uVar4;
  longlong lStack_160;
  undefined1 auStack_158 [128];
  undefined1 auStack_d8 [96];
  code *apcStack_78 [2];
  ulonglong uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_50;
  
  uVar4 = &stack0x00000000 == (undefined1 *)0x48;
  uVar3 = in_RDX + 0xb0;
  uStack_50 = 0x7ff70c936c5a;
  func_0x7ff70ca8f2f0(uVar3);
  uStack_50 = 0x7ff70c936c62;
  FUN_7ff70d6af041();
  if ((bool)uVar4) {
    return;
  }
  uStack_60 = 0xfffffffffffffffe;
  func_0x7ff70ca8ce60(&lStack_160,1);
  if (param_3 == 0x10) {
    uVar1 = func_0x7ff70d63ba2d(auStack_158 + (longlong)*(int *)(lStack_160 + 4) + -8,0x3000,0x3000)
    ;
    uVar3 = (ulonglong)uVar1;
  }
  func_0x7ff70cb12990(apcStack_78,0x11);
  (*apcStack_78[0])(auStack_158 + (longlong)*(int *)(lStack_160 + 4) + -8);
  FUN_7ff70d944b74(&lStack_160,param_2);
  func_0x7ff70c9375e0(auStack_158,uVar3);
  lVar2 = func_0x7ff70c937580(uVar3,0x2e,0);
  uStack_68 = uVar3;
  if (lVar2 == -1) {
    func_0x7ff70c91d770(uVar3,&UNK_7ff70cb8bf5b);
  }
  func_0x7ff70ca8f2f0(auStack_d8);
  func_0x7ff70d6322f0();
  return;
}


