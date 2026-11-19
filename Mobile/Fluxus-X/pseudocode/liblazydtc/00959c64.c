/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00959c64
 */

int FUN_00959c64(undefined8 param_1,undefined8 *param_2,long param_3,long *param_4,int *param_5)

{
  int iVar1;
  long lVar2;
  int iVar3;
  time_t tVar4;
  undefined8 *puVar5;
  uint uVar6;
  ulong uVar7;
  undefined8 local_78;
  undefined8 uStack_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  tVar4 = time((time_t *)0x0);
  iVar1 = *(int *)(param_3 + 0xc) + 0x30;
  puVar5 = (undefined8 *)(*(code *)PTR_calloc_00cc4690)(1,iVar1);
  if (puVar5 == (undefined8 *)0x0) {
    iVar3 = 0x1b;
  }
  else {
    uVar7 = tVar4 * 10000000 + 0x19db1ded53e8000;
    uVar6 = (uint)uVar7;
    curl_msnprintf(puVar5 + 2,*(int *)(param_3 + 0xc) + 0x20,"%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c",1,1,
                   0,0,0,0,0,0,(int)(uVar7 & 0xff00000080),uVar6 >> 8 & 0xff,uVar6 >> 0x10 & 0xff,
                   uVar6 >> 0x18,(int)((uVar7 & 0xff00000080) >> 0x20),(uint)(uVar7 >> 0x28) & 0xff,
                   (ushort)(uVar7 >> 0x30) & 0xff,(char)(uVar7 >> 0x38));
    puVar5[4] = *param_2;
    if (*(uint *)(param_3 + 0xc) != 0) {
      memcpy((void *)((long)puVar5 + 0x2c),*(void **)(param_3 + 0x10),
             (ulong)*(uint *)(param_3 + 0xc));
    }
    puVar5[1] = *(undefined8 *)(param_3 + 4);
    iVar3 = FUN_00923334(&PTR_LAB_00c502e0,param_1,0x10,puVar5 + 1,*(int *)(param_3 + 0xc) + 0x28,
                         &local_78);
    if (iVar3 == 0) {
      puVar5[1] = uStack_70;
      *puVar5 = local_78;
      *param_4 = (long)puVar5;
      *param_5 = iVar1;
    }
    else {
      (*(code *)PTR_free_00cc4678)(puVar5);
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

