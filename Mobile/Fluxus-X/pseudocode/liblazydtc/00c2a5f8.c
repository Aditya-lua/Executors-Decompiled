/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2a5f8
 */

/* WARNING: Type propagation algorithm not settling */

ulong * FUN_00c2a5f8(undefined8 *param_1,uint param_2,long param_3)

{
  uint uVar1;
  byte bVar2;
  ulong uVar3;
  ulong *puVar4;
  uint *puVar5;
  uint *puVar6;
  uint *puVar7;
  ulong uVar8;
  ulong uVar9;
  
  if ((param_2 & 0xff) == 0xff) {
    return (ulong *)0x0;
  }
  uVar1 = param_2 & 0xf;
  puVar5 = (uint *)*param_1;
  if (uVar1 < 4) {
    if (uVar1 < 2) {
      if (uVar1 == 0) goto LAB_00c2a708;
      if (uVar1 != 1) goto LAB_00c2a79c;
      uVar8 = 0;
      puVar4 = (ulong *)0x0;
      puVar6 = puVar5;
      do {
        puVar7 = (uint *)((long)puVar6 + 1);
        uVar1 = *puVar6;
        uVar3 = uVar8 & 0x3f;
        uVar8 = uVar8 + 7;
        puVar4 = (ulong *)(((ulong)(byte)uVar1 & 0x7f) << uVar3 | (ulong)puVar4);
        puVar6 = puVar7;
      } while ((char)(byte)uVar1 < '\0');
    }
    else if (uVar1 == 2) {
      puVar7 = (uint *)((long)puVar5 + 2);
      puVar4 = (ulong *)(ulong)(ushort)*puVar5;
    }
    else {
      if (uVar1 != 3) {
LAB_00c2a79c:
                    /* WARNING: Subroutine does not return */
        abort();
      }
      puVar7 = puVar5 + 1;
      puVar4 = (ulong *)(ulong)*puVar5;
    }
  }
  else if (uVar1 < 10) {
    if (uVar1 == 4) {
LAB_00c2a708:
      puVar7 = puVar5 + 2;
      puVar4 = *(ulong **)puVar5;
    }
    else {
      if (uVar1 != 9) goto LAB_00c2a79c;
      uVar8 = 0;
      uVar3 = 0;
      puVar6 = puVar5;
      do {
        puVar7 = (uint *)((long)puVar6 + 1);
        bVar2 = (byte)*puVar6;
        uVar9 = uVar8 & 0x3f;
        uVar8 = uVar8 + 7;
        uVar3 = ((ulong)bVar2 & 0x7f) << uVar9 | uVar3;
        puVar6 = puVar7;
      } while ((char)bVar2 < '\0');
      uVar9 = -1L << (uVar8 & 0x3f);
      if (0x3f < uVar8 || bVar2 < 0x40) {
        uVar9 = 0;
      }
      puVar4 = (ulong *)(uVar3 | uVar9);
    }
  }
  else if (uVar1 == 10) {
    puVar7 = (uint *)((long)puVar5 + 2);
    puVar4 = (ulong *)(long)(short)*puVar5;
  }
  else {
    if (uVar1 != 0xb) {
      if (uVar1 != 0xc) goto LAB_00c2a79c;
      goto LAB_00c2a708;
    }
    puVar7 = puVar5 + 1;
    puVar4 = (ulong *)(long)(int)*puVar5;
  }
  uVar1 = (param_2 & 0xff) >> 4 & 7;
  if (uVar1 != 0) {
    if (uVar1 == 3) {
      if (puVar4 == (ulong *)0x0) goto LAB_00c2a770;
      puVar4 = (ulong *)((long)puVar4 + param_3);
    }
    else {
      if (uVar1 != 1) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (puVar4 == (ulong *)0x0) goto LAB_00c2a770;
      puVar4 = (ulong *)((long)puVar4 + (long)puVar5);
    }
  }
  if ((puVar4 != (ulong *)0x0) && ((param_2 >> 7 & 1) != 0)) {
    puVar4 = (ulong *)*puVar4;
  }
LAB_00c2a770:
  *param_1 = puVar7;
  return puVar4;
}

