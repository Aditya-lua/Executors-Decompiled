
/* WARNING: Removing unreachable block (ram,0x0006c86c) */

void FUN_0006c7f0(undefined8 param_1,undefined8 param_2,long param_3)

{
  long *plVar1;
  char cVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  long *plVar8;
  undefined1 auVar9 [16];
  long in_stack_000000c0;
  undefined1 uStack0000000000000138;
  undefined8 in_stack_00000140;
  long in_stack_00000150;
  long in_stack_00000158;
  
  __ZdlPv();
  if (in_stack_000000c0 != 0) {
    __ZdlPv();
  }
  func_0x00056a34(&uStack0000000000000138,in_stack_00000140);
  if (in_stack_00000150 != 0) {
    in_stack_00000158 = in_stack_00000150;
    __ZdlPv();
  }
  auVar9 = __Unwind_Resume();
  lVar3 = auVar9._0_8_;
  lVar4 = *(long *)(lVar3 + 0x108) - *(long *)(lVar3 + 0x100);
  if (lVar4 != 0 && *(long *)(lVar3 + 0x100) != 0) {
    lVar7 = 0;
    plVar1 = (long *)(lVar3 + 0xe8);
    do {
      if (*(char *)(lVar3 + 0xff) < '\0') {
        cVar2 = *(char *)(lVar3 + 0xff);
        plVar6 = (long *)*plVar1;
      }
      else {
        cVar2 = *(char *)(lVar3 + 0xff);
        plVar6 = plVar1;
      }
      plVar8 = plVar1;
      if (cVar2 < '\0') {
        plVar8 = (long *)*plVar1;
      }
      *(undefined1 *)((long)plVar8 + lVar7) =
           *(undefined1 *)((long)plVar6 + lVar7 + *(long *)(lVar3 + 0x100));
      lVar7 = lVar7 + 1;
    } while (lVar4 != lVar7);
  }
  *(undefined8 *)(lVar3 + 0x100) = 0;
  *(long *)(lVar3 + 0x108) = lVar4;
  plVar1 = (long *)(lVar3 + 0xe8);
  if ((char)*(byte *)(lVar3 + 0xff) < '\0') {
    uVar5 = *(ulong *)(lVar3 + 0xf0);
  }
  else {
    uVar5 = (ulong)*(byte *)(lVar3 + 0xff);
  }
  if (uVar5 < (ulong)(lVar4 + param_3)) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
              (plVar1,(lVar4 + param_3) - uVar5,0);
  }
  if (param_3 != 0) {
    lVar4 = 0;
    do {
      plVar6 = plVar1;
      if (*(char *)(lVar3 + 0xff) < '\0') {
        plVar6 = (long *)*plVar1;
      }
      *(undefined1 *)((long)plVar6 + lVar4 + *(long *)(lVar3 + 0x108)) =
           *(undefined1 *)(auVar9._8_8_ + lVar4);
      lVar4 = lVar4 + 1;
    } while (param_3 != lVar4);
  }
  *(long *)(lVar3 + 0x108) = *(long *)(lVar3 + 0x108) + param_3;
  return;
}

