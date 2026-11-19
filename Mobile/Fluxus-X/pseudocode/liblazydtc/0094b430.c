/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094b430
 */

void FUN_0094b430(byte *param_1)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  uint uVar5;
  undefined1 auStack_68 [32];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  FUN_00904528(auStack_68,10000);
  bVar1 = *param_1;
  do {
    if (bVar1 == 0) {
      uVar4 = FUN_00904974(auStack_68);
LAB_0094b4ec:
      if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail(uVar4);
      }
      return;
    }
    uVar5 = (uint)bVar1;
    if ((((uVar5 < 0x21) ||
         (((uVar5 - 0x22 < 0x3b &&
           ((1L << ((ulong)(uVar5 - 0x22) & 0x3f) & 0x400000000000021U) != 0)) || (uVar5 == 0x7f))))
        && (iVar3 = FUN_009045fc(auStack_68,&DAT_002ab715,1), iVar3 != 0)) ||
       (iVar3 = FUN_009045fc(auStack_68,param_1,1), iVar3 != 0)) {
      uVar4 = 0;
      goto LAB_0094b4ec;
    }
    param_1 = param_1 + 1;
    bVar1 = *param_1;
  } while( true );
}

