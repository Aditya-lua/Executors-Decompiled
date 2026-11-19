/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095ed98
 */

void FUN_0095ed98(long param_1,undefined1 *param_2)

{
  undefined4 uVar1;
  long lVar2;
  int iVar3;
  undefined4 *puVar4;
  long lVar5;
  undefined8 uVar6;
  int iVar7;
  long lVar8;
  undefined1 auStack_168 [256];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  lVar8 = *(long *)(param_1 + 0x20);
  puVar4 = (undefined4 *)(*(code *)PTR_calloc_00cc4690)(1,0x158);
  *(undefined4 **)(lVar8 + 0x428) = puVar4;
  if (puVar4 == (undefined4 *)0x0) {
LAB_0095eee4:
    uVar6 = 0x1b;
  }
  else {
    iVar3 = 0x200;
    if (*(long *)(param_1 + 0x308) != 0) {
      iVar3 = (int)*(long *)(param_1 + 0x308);
    }
    iVar7 = iVar3;
    if (iVar3 < 0x201) {
      iVar7 = 0x200;
    }
    if (*(long *)(puVar4 + 0x52) == 0) {
      lVar5 = (*(code *)PTR_calloc_00cc4690)(1,iVar7 + 4);
      *(long *)(puVar4 + 0x52) = lVar5;
      if (lVar5 == 0) goto LAB_0095eee4;
    }
    if (*(long *)(puVar4 + 0x54) == 0) {
      lVar5 = (*(code *)PTR_calloc_00cc4690)(1,iVar7 + 4);
      *(long *)(puVar4 + 0x54) = lVar5;
      if (lVar5 == 0) goto LAB_0095eee4;
    }
    FUN_00908c4c(lVar8,1);
    *(long *)(puVar4 + 4) = param_1;
    uVar1 = *(undefined4 *)(lVar8 + 0x220);
    *puVar4 = 0;
    puVar4[2] = 0xffffff9c;
    puVar4[0x4f] = 0x200;
    puVar4[6] = uVar1;
    puVar4[0x50] = iVar3;
    *(short *)(puVar4 + 0xc) = (short)**(undefined4 **)(lVar8 + 0x38);
    FUN_0095f5d8(puVar4);
    if ((*(byte *)(lVar8 + 0x3a2) >> 5 & 1) == 0) {
      iVar3 = bind(puVar4[6],(sockaddr *)(puVar4 + 0xc),
                   *(socklen_t *)(*(long *)(lVar8 + 0x38) + 0xc));
      if (iVar3 != 0) {
        puVar4 = (undefined4 *)__errno();
        uVar6 = FUN_00941a94(*puVar4,auStack_168,0x100);
        FUN_00904b80(param_1,"bind() failed; %s",uVar6);
        uVar6 = 7;
        goto LAB_0095ef08;
      }
      *(ulong *)(lVar8 + 0x3a0) = *(ulong *)(lVar8 + 0x3a0) | 0x200000;
    }
    FUN_00931de4(param_1);
    uVar6 = 0;
    *param_2 = 1;
  }
LAB_0095ef08:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

