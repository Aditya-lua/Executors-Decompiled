/* 7ff70ca02bf6 FUN_7ff70ca02bf6 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Removing unreachable block (ram,0x7ff70d604d67) */
/* WARNING: Removing unreachable block (ram,0x7ff70d849f93) */
/* WARNING: Heritage AFTER dead removal. Example location: s0x00000018 : 0x7ff70ca02c4e */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

float FUN_7ff70ca02bf6(float param_1,undefined8 param_2,ulonglong param_3)

{
  ulonglong *puVar1;
  short sVar2;
  ulonglong uVar3;
  code **ppcVar4;
  longlong unaff_RBP;
  undefined8 unaff_RSI;
  byte bVar5;
  ulonglong unaff_R15;
  bool in_SF;
  bool bVar6;
  undefined4 uVar7;
  ulonglong uStackX_18;
  ulonglong uStackX_20;
  byte in_stack_00000038;
  longlong in_stack_00000048;
  undefined8 in_stack_00000060;
  code *pcStack_18;
  
  bVar5 = (byte)param_3;
  if (!in_SF) {
    if ((param_3 & 3) == 0) {
      puVar1 = (ulonglong *)((longlong)&uStackX_18 + (param_3 << 0x3f));
      *puVar1 = *puVar1 ^ unaff_R15;
      return param_1;
    }
    return param_1;
  }
  func_0x7ff70d96e9b0();
  LOCK();
  UNLOCK();
  (&stack0xfffffffff5fada2d)[CONCAT71((int7)((ulonglong)param_2 >> 8),(byte)param_2 ^ bVar5)] =
       -(&stack0xfffffffff5fada2d)[CONCAT71((int7)((ulonglong)param_2 >> 8),(byte)param_2 ^ bVar5)];
  func_0x7ff70cc3f6b2();
  bVar6 = in_stack_00000048 << 0x1f < 0;
  uVar7 = func_0x7ff70d654551();
  uStackX_20 = uStackX_20 | 0xa519;
  if ((char)(in_stack_00000038 ^ !bVar6) < '\x01') {
    sVar2 = (short)uStackX_20 + -0x581d;
    uVar3 = uStackX_20 >> 8;
    uStackX_20 = CONCAT71(~(uint7)uVar3,-1 < sVar2);
    func_0x7ff70d75d646();
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  ppcVar4 = (code **)&stack0xfffffffffffffff0;
  pcStack_18 = (code *)0x7ff70c8c028a;
  _DAT_7ff70cc1a448 = func_0x7ff70d721cf7(uVar7,unaff_RSI);
  pcStack_18 = (code *)0x7ff70c8c029e;
  FUN_7ff70caa4f40(&DAT_7ff70cc1a450);
  if (_DAT_7ff70cc1a448 != 0 && _DAT_7ff70cc1a458 == (code *)0x0) {
    ppcVar4 = &pcStack_18;
    pcStack_18 = _DAT_7ff70cc1a458;
    _DAT_7ff70cc1a458 = (code *)func_0x7ff70da91a14(_DAT_7ff70cc1a448,&UNK_7ff70cb83259);
  }
  if (_DAT_7ff70cc1a458 == (code *)0x0) {
    *(longlong *)((longlong)ppcVar4 + -8) = unaff_RBP;
    *(undefined8 *)((longlong)ppcVar4 + -0x10) = 0x7ff70c8c019f;
    func_0x7ff70d99c64e(0);
    *(undefined **)((longlong)ppcVar4 + -0x10) = &UNK_7ff70c8c01a7;
    func_0x7ff70da6927b();
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  *(undefined8 *)((longlong)ppcVar4 + -8) = 0x7ff70c8c0243;
  (*_DAT_7ff70cc1a458)(in_stack_00000060,0,unaff_RBP + 0xcc,unaff_RBP + 200);
  return (float)*(uint *)(unaff_RBP + 0xcc) / _DAT_7ff70cb1f31c;
}


