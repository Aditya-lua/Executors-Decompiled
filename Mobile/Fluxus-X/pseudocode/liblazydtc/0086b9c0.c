/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086b9c0
 */

void FUN_0086b9c0(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  bool bVar2;
  ulong uVar3;
  ulong uVar4;
  int *piVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  char *pcVar8;
  undefined1 auVar9 [16];
  undefined8 local_88;
  undefined8 uStack_80;
  char *local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  puVar6 = (undefined8 *)(param_1 + 0x94);
  uVar7 = *puVar6;
  local_50 = uVar7;
  FUN_00858f2c();
  if (*(int *)(param_1 + 0x90) == 0x119) {
    uStack_58 = *(undefined8 *)(param_1 + 0x9c);
    local_60 = *puVar6;
    pcVar8 = *(char **)(param_1 + 0xa8);
    FUN_00858f2c(param_1);
    local_68 = pcVar8;
  }
  else {
    FUN_0086e040(param_1,"method name");
    if ((*(int *)(param_1 + 0x90) - 0x123U < 0x15) && (*(int *)(param_1 + 0x94) == (int)uVar7)) {
      pcVar8 = *(char **)(param_1 + 0xa8);
      uStack_58 = *(undefined8 *)(param_1 + 0x9c);
      local_60 = *puVar6;
      local_68 = pcVar8;
      FUN_00858f2c(param_1);
    }
    else {
      pcVar8 = *(char **)(param_1 + 0x138);
      local_60 = *(undefined8 *)(param_1 + 0x94);
      local_68 = pcVar8;
      uStack_58 = local_60;
    }
  }
  bVar2 = false;
  uStack_80 = uStack_58;
  if ((*(char *)(param_1 + 0x178) == '\x01') && (pcVar8 != (char *)0x0)) {
    if (*pcVar8 == '_') {
      bVar2 = pcVar8[1] != '_';
    }
    else {
      bVar2 = false;
    }
  }
  local_88 = param_2;
  uVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x50);
  FUN_0084eea4(uVar7,&local_88,param_3,&local_68,&local_60,&local_50,0x3a,bVar2);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    puVar6 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
    puVar6[2] = 0;
    puVar6[3] = 0;
    *puVar6 = 0xffffffffffffffff;
    puVar6[1] = 0xffffffffffffffff;
    puVar6[4] = 0xffffffffffffffff;
    puVar6[5] = 0xffffffffffffffff;
  }
  else {
    puVar6 = (undefined8 *)0x0;
  }
  if (*(int *)(param_1 + 0x90) == 0x3c) {
    FUN_00853d20(&local_88,param_1 + 0x70);
    if ((int)local_88 == 0x3c) {
      auVar9 = FUN_0086c3dc(param_1,puVar6,0);
      goto LAB_0086bb70;
    }
  }
  auVar9 = ZEXT816(0);
LAB_0086bb70:
  uVar3 = FUN_0086bcac(param_1,uVar7,1);
  if ((*(char *)(param_1 + 0x68) == '\x01') && (*(long *)(param_1 + 0x4d8) != 0)) {
    uVar4 = ((ulong)(uint)((int)uVar3 << 3) + 8 ^ uVar3 >> 0x20) * -0x622015f714c7d297;
    uVar4 = (uVar3 >> 0x20 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
    uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x4e0) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x4c8) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*(long *)(param_1 + 0x4b0) + uVar4 * 0x10) == uVar3) {
          piVar5 = *(int **)(*(long *)(param_1 + 0x4b0) + uVar4 * 0x10 + 8);
          if (*piVar5 != DAT_00d1e970) {
            piVar5 = (int *)0x0;
          }
          *(undefined8 **)(piVar5 + 10) = puVar6;
          break;
        }
        uVar4 = uVar4 + 1 & *(long *)(param_1 + 0x4d0) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x4c8) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) !=
               0);
    }
  }
  if (*(int *)(uVar3 + 8) != DAT_00d1b040) {
    uVar3 = 0;
  }
  if ((uVar3 != 0) && (auVar9._8_8_ != 0)) {
    *(undefined1 (*) [16])(uVar3 + 0x28) = auVar9;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

