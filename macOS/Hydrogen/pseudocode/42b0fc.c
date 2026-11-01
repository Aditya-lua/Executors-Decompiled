
/* WARNING: Removing unreachable block (ram,0x0042b108) */

void FUN_0042b0fc(ulong param_1)

{
  char cVar1;
  undefined2 *unaff_x19;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uStack0000000000000008;
  
  uVar3 = param_1 & 3;
  uStack0000000000000008 = param_1;
  if (uVar3 < 2) {
    if (uVar3 == 0) {
      if (*(char *)(param_1 + 0x10) != '\0') goto LAB_0042b23c;
LAB_0042b1d0:
      *unaff_x19 = 0;
      if (uVar3 != 1) {
        return;
      }
    }
    else {
      if (*(char *)(param_1 + 0xf) != '\0') goto LAB_0042b23c;
      *unaff_x19 = 0;
    }
    uVar2 = *(undefined8 *)(param_1 - 1);
    puVar4 = *(undefined8 **)(param_1 + 7);
    if ((code *)*puVar4 != (code *)0x0) {
      (*(code *)*puVar4)(uVar2);
    }
    if (puVar4[1] != 0) {
      func_0x00187bd4(uVar2,puVar4[1],puVar4[2]);
    }
    func_0x00187bd4((undefined8 *)(param_1 - 1),0x18,8);
  }
  else {
    if (uVar3 == 2) {
      cVar1 = func_0x004307b8(param_1 >> 0x20);
      if (cVar1 == '\0') goto LAB_0042b1d0;
    }
    else if (param_1 >> 0x20 == 0) {
      *unaff_x19 = 0;
      return;
    }
LAB_0042b23c:
    *(ulong *)(unaff_x19 + 4) = param_1;
    *(undefined1 *)unaff_x19 = 1;
  }
  return;
}

