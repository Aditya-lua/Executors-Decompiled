/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090fcf0
 */

undefined8 FUN_0090fcf0(long param_1)

{
  long lVar1;
  undefined4 *puVar2;
  size_t sVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  char acStack_c8 [128];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  lVar7 = *(long *)(param_1 + 0x20);
  lVar6 = *(long *)(param_1 + 0xc38);
  puVar2 = (undefined4 *)FUN_0090fc08(param_1,lVar7,lVar6);
  if (puVar2 == (undefined4 *)0x0) {
    puVar2 = (undefined4 *)(*(code *)PTR_malloc_00cc4670)(0x30);
    if (puVar2 != (undefined4 *)0x0) {
      *(undefined8 *)(puVar2 + 2) = 0;
      *puVar2 = 0;
      FUN_00925c98(puVar2 + 4,0);
      if ((*(ulong *)(lVar7 + 0x3a0) & 9) == 1) {
        lVar4 = (long)*(int *)(lVar7 + 0x15c);
        puVar5 = (undefined8 *)(lVar7 + 0xd8);
      }
      else {
        lVar4 = (long)*(int *)(lVar7 + 0x560);
        if (((uint)*(ulong *)(lVar7 + 0x3a0) >> 9 & 1) == 0) {
          puVar5 = (undefined8 *)(lVar7 + 0x50);
        }
        else {
          puVar5 = (undefined8 *)(lVar7 + 0x80);
        }
      }
      curl_msnprintf(acStack_c8,0x80,"%u/%ld/%s",*(undefined4 *)(lVar7 + 0x568),lVar4,*puVar5);
      FUN_00941848(acStack_c8,acStack_c8,0x80);
      uVar8 = *(undefined8 *)(param_1 + 0xc38);
      sVar3 = strlen(acStack_c8);
      lVar4 = FUN_009166f4(uVar8,acStack_c8,sVar3,puVar2);
      if (lVar4 != 0) goto LAB_0090fd34;
      (*(code *)PTR_free_00cc4678)(puVar2);
    }
    uVar8 = 0x1b;
    lVar6 = *(long *)(param_1 + 0xd0);
  }
  else {
LAB_0090fd34:
    FUN_00925d10(puVar2 + 4,lVar7,lVar7);
    *(undefined4 **)(lVar7 + 0x540) = puVar2;
    uVar8 = 0;
    *(long *)(puVar2 + 2) = *(long *)(puVar2 + 2) + 1;
    lVar4 = *(long *)(lVar6 + 0x38);
    *(long *)(lVar6 + 0x38) = lVar4 + 1;
    *(long *)(lVar7 + 0x28) = lVar4;
    *(long *)(lVar6 + 0x30) = *(long *)(lVar6 + 0x30) + 1;
    lVar6 = *(long *)(param_1 + 0xd0);
  }
  if (lVar6 != 0) {
    FUN_0093f680(param_1,5);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar8;
}

