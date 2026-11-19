/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091107c
 */

void FUN_0091107c(long param_1,int param_2)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  char local_7c [4];
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  plVar3 = *(long **)(param_1 + 0x1b0);
  if (plVar3 != (long *)0x0) {
    uVar5 = *(undefined8 *)(param_1 + 0x1d8);
    *(byte *)(param_1 + 0x1d0) = *(byte *)(param_1 + 0x1d0) | 1;
    do {
      lVar4 = *plVar3;
      if ((*(int *)(lVar4 + 0x220) == param_2) || (*(int *)(lVar4 + 0x224) == param_2)) {
        FUN_0092bb60(uVar5,lVar4);
        FUN_009111d8(uVar5,lVar4,local_7c);
        FUN_0092bab8(uVar5);
        if (local_7c[0] == '\0') {
          uStack_60 = 0;
          local_68 = 0;
          uStack_70 = 0;
          local_78 = 0;
          FUN_0092bb60(uVar5,lVar4);
          FUN_00907984(uVar5,&local_78);
          FUN_0092bab8(uVar5);
          iVar2 = FUN_0092dfc0(param_1,uVar5,&local_78,(undefined8 *)(lVar4 + 0x280));
          if (iVar2 == 0) {
            *(undefined8 *)(lVar4 + 0x298) = uStack_60;
            *(undefined8 *)(lVar4 + 0x290) = local_68;
            *(undefined8 *)(lVar4 + 0x288) = uStack_70;
            *(undefined8 *)(lVar4 + 0x280) = local_78;
            break;
          }
        }
        FUN_00925d80(param_1 + 0x1b0,plVar3,0);
        FUN_009103b0(0,lVar4,param_1 + 0x158,0);
        break;
      }
      plVar3 = (long *)plVar3[2];
    } while (plVar3 != (long *)0x0);
    *(byte *)(param_1 + 0x1d0) = *(byte *)(param_1 + 0x1d0) & 0xfe;
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

