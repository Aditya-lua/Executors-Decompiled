/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968fcc
 */

void FUN_00968fcc(long param_1,int param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined1 auStack_68 [32];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  FUN_00904528(auStack_68,10000);
  iVar2 = FUN_00904728(auStack_68,param_3);
  if (((iVar2 == 0) && (iVar2 = FUN_009045fc(auStack_68,&DAT_002bcda4,1), iVar2 == 0)) &&
     (iVar2 = FUN_009045fc(auStack_68,param_4,param_5), iVar2 == 0)) {
    uVar5 = *(undefined8 *)(*(long *)(param_1 + 0x1400) + (long)param_2 * 8);
    uVar3 = FUN_00904974(auStack_68);
    lVar4 = FUN_0093f6d8(uVar5,uVar3);
    uVar3 = 0;
    if (lVar4 == 0) {
      FUN_00904534(auStack_68);
      curl_slist_free_all(*(undefined8 *)(*(long *)(param_1 + 0x1400) + (long)param_2 * 8));
      uVar3 = 0x1b;
    }
    *(long *)(*(long *)(param_1 + 0x1400) + (long)param_2 * 8) = lVar4;
  }
  else {
    uVar3 = 0x1b;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

