/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088c464
 */

undefined8 FUN_0088c464(undefined8 *param_1,ulong param_2,undefined1 *param_3)

{
  long lVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong *puVar7;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  ulong local_58;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if ((*(byte *)(param_2 + 0x31) & 1) == 0) {
    lVar5 = param_1[0x184];
    uVar3 = 0;
    if ((param_1[0x183] == lVar5) || (param_1[0x27] == 0)) goto LAB_0088c494;
    uVar4 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar4 = (param_2 >> 0x20 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
    uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x6b622cb0470b6a63;
    uVar6 = uVar4 >> ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
    if ((*(ulong *)(param_1[0x25] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(param_1[0x22] + uVar6 * 0x28) == param_2) {
          if (param_1[0x19] == 0) goto LAB_0088c5e4;
          uVar4 = uVar4 >> ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
          if ((*(ulong *)(param_1[0x17] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) == 0)
          goto LAB_0088c5e4;
          goto LAB_0088c5b0;
        }
        uVar6 = uVar6 + 1 & param_1[0x26] - 1;
      } while ((*(ulong *)(param_1[0x25] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0);
    }
  }
LAB_0088c490:
  uVar3 = 0;
  goto LAB_0088c494;
  while (uVar4 = uVar4 + 1 & param_1[0x18] - 1,
        (*(ulong *)(param_1[0x17] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
LAB_0088c5b0:
    puVar7 = (ulong *)(param_1[0x14] + uVar4 * 0x18);
    if (*puVar7 == param_2) {
      if ((*(byte *)((long)puVar7 + 10) & 1) != 0) goto LAB_0088c490;
      break;
    }
  }
LAB_0088c5e4:
  uStack_68 = *(undefined8 *)(lVar5 + -0x18);
  local_70 = *(undefined8 *)(lVar5 + -0x20);
  local_58 = *(ulong *)(lVar5 + -8);
  uVar3 = *(undefined8 *)(lVar5 + -0x10);
  param_1[0x184] = (undefined8 *)(lVar5 + -0x20);
  uVar4 = local_58 & 0xff;
  local_60 = uVar3;
  uVar2 = FUN_008769d0(*param_1);
  FUN_00887138(param_1,uVar3,(ulong)&local_70 | 4,uVar4,uVar2);
  *param_3 = (undefined1)local_70;
  uVar3 = 1;
LAB_0088c494:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar3;
}

