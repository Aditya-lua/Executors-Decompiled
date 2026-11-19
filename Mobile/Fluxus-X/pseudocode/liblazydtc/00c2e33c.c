/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2e33c
 */

/* WARNING: Type propagation algorithm not settling */

undefined8 * FUN_00c2e33c(undefined8 param_1,long *param_2,ulong *param_3,uint param_4,long param_5)

{
  uint uVar1;
  byte bVar2;
  undefined8 *puVar3;
  ulong uVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong *puVar9;
  
  uVar1 = param_4 & 0xf;
  puVar9 = (ulong *)*param_2;
  if (uVar1 < 4) {
    if (uVar1 < 2) {
      if ((param_4 & 0xf) == 0) goto LAB_00c2e488;
      if (uVar1 != 1) {
LAB_00c2e694:
        fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getEncodedP","unknown pointer encoding")
        ;
        fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
        abort();
      }
      puVar3 = (undefined8 *)FUN_00c2e6c8(param_2,param_3);
    }
    else if (uVar1 == 2) {
      puVar3 = (undefined8 *)(ulong)(ushort)*puVar9;
      *param_2 = (long)puVar9 + 2;
    }
    else {
      if (uVar1 != 3) goto LAB_00c2e694;
      puVar3 = (undefined8 *)(ulong)(uint)*puVar9;
      *param_2 = (long)((long)puVar9 + 4);
    }
  }
  else if (uVar1 < 10) {
    if (uVar1 == 4) {
LAB_00c2e488:
      puVar3 = (undefined8 *)*puVar9;
      *param_2 = (long)(puVar9 + 1);
    }
    else {
      if (uVar1 != 9) goto LAB_00c2e694;
      uVar4 = 0;
      uVar6 = 0xfffffffffffffff9;
      puVar5 = puVar9;
      puVar7 = puVar9;
      do {
        if (puVar7 == param_3) {
          fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                  "truncated sleb128 expression");
          fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
          abort();
        }
        bVar2 = (byte)*puVar7;
        uVar6 = uVar6 + 7;
        puVar5 = (ulong *)((long)puVar5 + 1);
        uVar4 = ((ulong)bVar2 & 0x7f) << (uVar6 & 0x3f) | uVar4;
        puVar7 = (ulong *)((long)puVar7 + 1);
      } while ((char)bVar2 < '\0');
      uVar8 = -1L << ((ulong)((int)uVar6 + 7) & 0x3f);
      *param_2 = (long)puVar5;
      if (0x38 < uVar6 || bVar2 < 0x40) {
        uVar8 = 0;
      }
      puVar3 = (undefined8 *)(uVar4 | uVar8);
    }
  }
  else if (uVar1 == 10) {
    puVar3 = (undefined8 *)(long)(short)*puVar9;
    *param_2 = (long)puVar9 + 2;
  }
  else {
    if (uVar1 != 0xb) {
      if (uVar1 != 0xc) goto LAB_00c2e694;
      goto LAB_00c2e488;
    }
    puVar3 = (undefined8 *)(long)(int)(uint)*puVar9;
    *param_2 = (long)((long)puVar9 + 4);
  }
  uVar1 = (param_4 & 0xff) >> 4 & 7;
  if (uVar1 < 2) {
    if (uVar1 != 0) {
      if (uVar1 != 1) goto LAB_00c2e660;
      puVar3 = (undefined8 *)((long)puVar3 + (long)puVar9);
    }
LAB_00c2e514:
    if ((param_4 >> 7 & 1) == 0) {
      return puVar3;
    }
    return (undefined8 *)*puVar3;
  }
  if (uVar1 < 4) {
    if (uVar1 == 3) {
      if (param_5 == 0) {
        fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getEncodedP",
                "DW_EH_PE_datarel is invalid with a datarelBase of 0");
        fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
        abort();
      }
      puVar3 = (undefined8 *)((long)puVar3 + param_5);
      goto LAB_00c2e514;
    }
    if (uVar1 == 2) {
      fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getEncodedP",
              "DW_EH_PE_textrel pointer encoding not supported");
      fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
      abort();
    }
  }
  else {
    if (uVar1 == 4) {
      fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getEncodedP",
              "DW_EH_PE_funcrel pointer encoding not supported");
      fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if (uVar1 == 5) {
      fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getEncodedP",
              "DW_EH_PE_aligned pointer encoding not supported");
      fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
      abort();
    }
  }
LAB_00c2e660:
  fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getEncodedP","unknown pointer encoding");
  fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
  abort();
}

