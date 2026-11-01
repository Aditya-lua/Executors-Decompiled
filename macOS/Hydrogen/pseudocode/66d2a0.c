
void FUN_0066d2a0(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  uint unaff_w21;
  undefined2 uVar4;
  uint uVar5;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  
  __ZdlPv(in_stack_00000018);
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if ((unaff_w21 & 1) != 0) {
    ___cxa_free_exception();
  }
  lVar3 = __Unwind_Resume();
  uVar1 = *(uint *)(lVar3 + 200);
  uVar5 = CONCAT13(POPCOUNT((char)(uVar1 >> 0x18)),
                   CONCAT12(POPCOUNT((char)(uVar1 >> 0x10)),
                            CONCAT11(POPCOUNT((char)(uVar1 >> 8)),POPCOUNT((char)uVar1))));
  uVar4 = NEON_uaddlv((ulong)uVar5,1);
  uVar2 = 0;
  if (uVar1 != 0) {
    uVar2 = 0x1000 / uVar1;
  }
  uVar2 = uVar2 * uVar1;
  if (CONCAT22((short)(uVar5 >> 0x10),uVar4) == 1) {
    uVar2 = -uVar1 & 0x1000;
  }
  if (uVar1 <= uVar2) {
    uVar1 = uVar2;
  }
  *(uint *)(lVar3 + 200) = uVar1;
  return;
}

