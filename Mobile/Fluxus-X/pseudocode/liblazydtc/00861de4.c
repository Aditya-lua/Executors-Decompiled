/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00861de4
 */

undefined8 FUN_00861de4(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 local_78;
  undefined8 uStack_70;
  ulong local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined1 local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  if (*(int *)(param_1 + 0x90) == 0x119) {
    uStack_58 = *(undefined8 *)(param_1 + 0x9c);
    local_60 = *(undefined8 *)(param_1 + 0x94);
    uVar6 = *(ulong *)(param_1 + 0xa8);
    FUN_00858f2c(param_1);
    local_50 = 1;
    local_68 = uVar6;
    if (*(long *)(param_1 + 0x1a8) != 0) {
      uVar5 = (uVar6 >> 4 ^ uVar6 >> 9) * -0x61c8864680b583eb >>
              ((ulong)*(byte *)(param_1 + 0x1b0) & 0x3f);
      if ((*(ulong *)(*(long *)(param_1 + 0x198) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
        do {
          if (*(ulong *)(*(long *)(param_1 + 0x180) + uVar5 * 0x10) == uVar6) {
            puVar7 = *(undefined8 **)(*(long *)(param_1 + 0x180) + uVar5 * 0x10 + 8);
            if (puVar7 != (undefined8 *)0x0) {
              uVar6 = puVar7[4];
              if (uVar6 < *(ulong *)(param_1 + 0x170)) {
                local_78 = 0;
                uStack_70 = 0;
                uVar4 = FUN_008659e8(param_1,param_1 + 0x94,&local_78,
                                     "Type function cannot reference outer local \'%s\'",*puVar7);
              }
              else {
                lVar1 = *(long *)(param_1 + 0x158);
                lVar2 = *(long *)(param_1 + 0x160);
                uVar4 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
                FUN_0084ece8(uVar4,&local_60,puVar7,uVar6 != (lVar2 - lVar1 >> 3) - 1U);
              }
              goto LAB_00861f60;
            }
            break;
          }
          uVar5 = uVar5 + 1 & *(long *)(param_1 + 0x1a0) - 1U;
        } while ((*(ulong *)(*(long *)(param_1 + 0x198) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1)
                 != 0);
      }
    }
    uVar4 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
    FUN_0084ed38(uVar4,&local_60,&local_68);
  }
  else {
    FUN_0086e040(param_1);
    lVar1 = *(long *)(param_1 + 0x1d0);
    lVar2 = *(long *)(param_1 + 0x1d8);
    local_68 = 0;
    local_60 = 0;
    uVar4 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
    FUN_0084f5e0(uVar4,param_1 + 0x94,&local_68,
                 (int)((ulong)(lVar2 - lVar1) >> 4) * -0x55555555 + -1);
  }
LAB_00861f60:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

