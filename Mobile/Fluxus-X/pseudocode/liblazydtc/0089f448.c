/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089f448
 */

void FUN_0089f448(long param_1,long *param_2,ulong param_3,int *param_4)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong *puVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong local_78;
  ulong local_70;
  ulong local_68;
  ulong uStack_60;
  ulong local_58;
  ulong uStack_50;
  ulong local_48;
  undefined1 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_78 = param_3;
  if (*param_4 == 0) {
    if (((*(byte *)(param_1 + 0x58) & 1) == 0) && (param_2[5] != 0)) {
      uVar3 = ((ulong)(uint)((int)param_3 << 3) + 8 ^ param_3 >> 0x20) * -0x622015f714c7d297;
      uVar3 = (param_3 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
      uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >>
              ((ulong)*(byte *)(param_2 + 6) & 0x3f);
      if ((*(ulong *)(param_2[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
        do {
          puVar4 = (ulong *)(*param_2 + uVar3 * 0x30);
          if (*puVar4 == param_3) {
            if (*(long *)(param_1 + 0xb8) != 0) {
              local_48 = puVar4[5];
              uStack_50 = puVar4[4];
              local_58 = puVar4[3];
              uStack_60 = puVar4[2];
              local_68 = puVar4[1];
              local_40 = 0;
              local_70 = param_3;
              FUN_008a0018(*(long *)(param_1 + 0xb8),&local_70);
            }
            *(undefined4 *)(puVar4 + 1) = 0;
            break;
          }
          uVar3 = uVar3 + 1 & param_2[4] - 1U;
        } while ((*(ulong *)(param_2[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
      }
    }
  }
  else if (*param_4 != 7) {
    FUN_0089fedc();
    puVar2 = (undefined8 *)FUN_0089bfc4(param_2,&local_78);
    uVar6 = *(undefined8 *)(param_4 + 2);
    uVar5 = *(undefined8 *)param_4;
    uVar8 = *(undefined8 *)(param_4 + 6);
    uVar7 = *(undefined8 *)(param_4 + 4);
    puVar2[4] = *(undefined8 *)(param_4 + 8);
    puVar2[1] = uVar6;
    *puVar2 = uVar5;
    puVar2[3] = uVar8;
    puVar2[2] = uVar7;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

