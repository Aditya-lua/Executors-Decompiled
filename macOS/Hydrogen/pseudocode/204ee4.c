
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00204ee4(void)

{
  char cVar1;
  code *pcVar2;
  byte bVar3;
  ulong uVar4;
  long lVar5;
  byte *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  byte bVar6;
  long unaff_x29;
  undefined8 uVar7;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000030;
  
  func_0x00430010();
  if ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E & 0x7fffffffffffffff
      ) == 0) {
    bVar6 = 0;
    cVar1 = *(char *)(unaff_x21 + 1);
    in_stack_00000030 = in_stack_00000030 & 0xffffffffffffff00;
  }
  else {
    bVar3 = func_0x007a1140();
    bVar6 = bVar3 ^ 1;
    cVar1 = *(char *)(unaff_x21 + 1);
    in_stack_00000030 = CONCAT71(in_stack_00000030._1_7_,bVar3) ^ 1;
  }
  uStack0000000000000020 = (ulong)(cVar1 != '\0');
  if (cVar1 != '\0') {
    func_0x00202648(&uStack0000000000000020);
    func_0x007a23bc(&UNK_009c6290);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x204f20);
    (*pcVar2)();
  }
  if ((*unaff_x19 & 1) == 0) {
    if (*(long *)(unaff_x19 + 8) == -0x8000000000000000) {
      uVar7 = *(undefined8 *)(unaff_x19 + 8);
      *(undefined8 *)(unaff_x29 + -0x58) = *(undefined8 *)(unaff_x19 + 0x10);
      *(undefined8 *)(unaff_x29 + -0x60) = uVar7;
      in_stack_00000030 = *(ulong *)(unaff_x19 + 0x18);
    }
    else {
      func_0x0045cd08(&uStack0000000000000020);
      *(undefined8 **)(unaff_x29 + -0x58) = unaff_x21;
      *(ulong *)(unaff_x29 + -0x60) = uStack0000000000000020;
    }
    *(ulong *)(unaff_x29 + -0x50) = in_stack_00000030;
  }
  uStack0000000000000020 = *unaff_x20;
  func_0x002442d0(unaff_x21 + 2);
  if ((((bVar6 & 1) == 0) &&
      ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
       0x7fffffffffffffff) != 0)) && (uVar4 = func_0x007a1140(), (uVar4 & 1) == 0)) {
    *(undefined1 *)(unaff_x21 + 1) = 1;
  }
  func_0x00430048(*unaff_x21);
  if ((((*unaff_x19 & 1) == 0) && (lVar5 = *(long *)(unaff_x19 + 8), lVar5 != -0x8000000000000000))
     && (lVar5 != 0)) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),lVar5,1);
    return;
  }
  return;
}

