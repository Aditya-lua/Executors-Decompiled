/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b78d0
 */

undefined8 *
FUN_008b78d0(long param_1,long param_2,undefined4 param_3,undefined4 param_4,undefined4 param_5)

{
  long lVar1;
  uint uVar2;
  char cVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  long lVar6;
  code *pcVar7;
  long lVar8;
  int iVar9;
  ulong uVar10;
  long lVar11;
  
  lVar11 = *(long *)(param_1 + 0x60);
  if ((0x3ff < param_2 - 1U) || (uVar10 = (ulong)(char)(&DAT_00d1f6d8)[param_2], (long)uVar10 < 0))
  {
    iVar9 = (int)param_2;
    puVar4 = (undefined8 *)
             (**(code **)(lVar11 + 0x48))(*(undefined8 *)(lVar11 + 0x50),0,0,(long)(iVar9 + 0x40));
    cVar3 = DAT_00d1f618;
    if (puVar4 == (undefined8 *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_008b3f9c(param_1,4);
    }
    *(int *)(puVar4 + 4) = iVar9 + 0x40;
    *(int *)((long)puVar4 + 0x24) = iVar9;
    puVar4[5] = 0;
    puVar4[6] = 0;
    puVar4[1] = 0;
    *puVar4 = 0;
    puVar4[3] = 0;
    puVar4[2] = 0;
    if (cVar3 == '\x01') {
      *(undefined4 *)(puVar4 + 7) = 0;
    }
    puVar5 = *(undefined8 **)(lVar11 + 0x330);
    puVar4[1] = puVar5;
    if (puVar5 != (undefined8 *)0x0) {
      *puVar5 = puVar4;
    }
    puVar5 = puVar4 + 8;
    *(undefined8 **)(lVar11 + 0x330) = puVar4;
    *(int *)(puVar4 + 6) = -iVar9;
    *(undefined4 *)((long)puVar4 + 0x34) = 1;
    goto LAB_008b79d0;
  }
  lVar1 = lVar11 + 0x1f0;
  lVar6 = *(long *)(lVar1 + uVar10 * 8);
  if (lVar6 == 0) {
    lVar6 = FUN_008b8a8c(param_1,lVar1,lVar11 + 0x330,uVar10 & 0xffffffff,0);
    uVar2 = *(uint *)(lVar6 + 0x30);
    if (-1 < (int)uVar2) goto LAB_008b7934;
LAB_008b7a30:
    puVar5 = *(undefined8 **)(lVar6 + 0x28);
    lVar8 = puVar5[1];
    *(int *)(lVar6 + 0x34) = *(int *)(lVar6 + 0x34) + 1;
    *(long *)(lVar6 + 0x28) = lVar8;
    if (lVar8 != 0) goto LAB_008b79d0;
  }
  else {
    uVar2 = *(uint *)(lVar6 + 0x30);
    if ((int)uVar2 < 0) goto LAB_008b7a30;
LAB_008b7934:
    iVar9 = uVar2 - *(int *)(lVar6 + 0x24);
    puVar5 = (undefined8 *)(lVar6 + (ulong)uVar2 + 0x40);
    *(int *)(lVar6 + 0x30) = iVar9;
    *(int *)(lVar6 + 0x34) = *(int *)(lVar6 + 0x34) + 1;
    if ((*(long *)(lVar6 + 0x28) != 0) || (-1 < iVar9)) goto LAB_008b79d0;
  }
  lVar8 = *(long *)(lVar6 + 0x18);
  *(long *)(lVar1 + uVar10 * 8) = lVar8;
  if (lVar8 != 0) {
    *(undefined8 *)(lVar8 + 0x10) = 0;
  }
  *(undefined8 *)(lVar6 + 0x18) = 0;
LAB_008b79d0:
  lVar1 = lVar11 + (ulong)(byte)param_3 * 8;
  lVar6 = *(long *)(lVar1 + 0x3848);
  pcVar7 = *(code **)(lVar11 + 0x658);
  *(long *)(lVar11 + 0x10) = *(long *)(lVar11 + 0x10) + param_2;
  *(long *)(lVar1 + 0x3848) = lVar6 + param_2;
  if (pcVar7 != (code *)0x0) {
    (*pcVar7)(param_1,puVar5,0,param_2,param_3,param_4,param_5);
  }
  return puVar5;
}

