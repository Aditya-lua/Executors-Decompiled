/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00956a58
 */

void FUN_00956a58(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  char cVar2;
  long lVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined1 *local_a0;
  undefined1 **ppuStack_98;
  undefined8 *puStack_90;
  undefined8 uStack_88;
  
  lVar3 = tpidr_el0;
  lVar6 = *(long *)(lVar3 + 0x28);
  lVar7 = *(long *)(param_1 + 0x20);
  local_d0 = param_3;
  uStack_c8 = param_4;
  local_c0 = param_5;
  uStack_b8 = param_6;
  local_b0 = param_7;
  uStack_a8 = param_8;
  iVar4 = FUN_00963a68(*(long *)(lVar7 + 0x28) % 0x1a);
  cVar2 = *(char *)(lVar7 + 0x522);
  *(char *)(lVar7 + 0x522) = cVar2 + '\x01';
  curl_msnprintf(lVar7 + 0x51c,5,"%c%03d",iVar4 + 0x41,cVar2 + '\x01');
  lVar1 = lVar7 + 0x4e8;
  FUN_0090456c(lVar1);
  iVar4 = FUN_009048cc(lVar1,"%s %s",lVar7 + 0x51c,param_2);
  if (iVar4 == 0) {
    uVar5 = FUN_00904974(lVar1);
    uStack_88 = 0xffffff80ffffffd0;
    local_a0 = (undefined1 *)register0x00000008;
    ppuStack_98 = &local_a0;
    puStack_90 = &local_d0;
    FUN_00945294(param_1,lVar7 + 0x428,uVar5,&local_a0);
  }
  if (*(long *)(lVar3 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

