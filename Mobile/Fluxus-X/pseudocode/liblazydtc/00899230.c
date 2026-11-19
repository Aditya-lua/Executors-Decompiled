/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00899230
 */

void FUN_00899230(double param_1,double param_2,undefined8 *param_3,long param_4,uint param_5)

{
  long lVar1;
  char cVar2;
  undefined4 *puVar3;
  long lVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  uint uVar13;
  double dVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  long local_a8;
  long lStack_a0;
  undefined8 local_98;
  undefined8 local_90;
  long local_88;
  
  lVar1 = tpidr_el0;
  local_88 = *(long *)(lVar1 + 0x28);
  local_90 = *(undefined8 *)(param_4 + 0x20);
  local_98 = 0;
  lVar9 = param_3[0xf8];
  local_a8 = (long)(param_3[0xd1] - param_3[0xd0]) >> 3;
  lVar7 = param_3[0xf7];
  lStack_a0 = local_a8;
  FUN_008948a4(param_3 + 0xfa,&local_a8);
  param_3[0x77] = param_3[0x76];
  param_3[0x7a] = param_3[0x79];
  if (0 < (int)param_5) {
    uVar13 = 0;
    do {
      puVar3 = (undefined4 *)FUN_008984e0(param_3 + 0x30,&local_90);
      cVar2 = DAT_00d1f128;
      *puVar3 = 3;
      if (cVar2 == '\x01') {
        dVar14 = param_1;
        if (uVar13 != 0) {
          dVar14 = param_1 + param_2 * (double)uVar13;
        }
      }
      else {
        dVar14 = param_1 + param_2 * (double)uVar13;
      }
      lVar4 = FUN_008984e0(param_3 + 0x30,&local_90);
      *(double *)(lVar4 + 8) = dVar14;
      if (uVar13 == 0) {
        puVar15 = param_3 + 0x76;
        puVar16 = param_3 + 0x79;
      }
      else {
        puVar15 = (undefined8 *)0x0;
        puVar16 = (undefined8 *)0x0;
      }
      FUN_0089c2cc(param_3 + 0x29,param_3 + 0x22,param_3 + 0x30,param_3[200],
                   *(undefined1 *)(param_3 + 0xc9),*(int *)(param_3 + 6) == 1,param_3[0xb],param_4,
                   param_3[199],param_3 + 0x37,puVar15,puVar16);
      uVar10 = param_3[0xf8] - param_3[0xf7];
      FUN_0088506c(param_3,*(undefined8 *)(param_4 + 0x40));
      uVar5 = FUN_00875ec8(*param_3);
      lVar4 = param_3[0xf8];
      lVar8 = param_3[0xf7];
      if (uVar10 < (ulong)(lVar4 - lVar8)) {
        uVar12 = (long)uVar10 >> 4;
        do {
          if (*(int *)(lVar8 + uVar10) == 1) {
            uVar6 = FUN_00875ed8(*param_3,*(undefined8 *)(lVar8 + uVar10 + 8),uVar5);
            if ((uVar6 & 1) == 0) goto LAB_00899518;
            lVar4 = param_3[0xf8];
            lVar8 = param_3[0xf7];
          }
          uVar12 = uVar12 + 1;
          uVar10 = uVar10 + 0x10;
        } while (uVar12 < (ulong)(lVar4 - lVar8 >> 4));
      }
      uVar13 = uVar13 + 1;
    } while (uVar13 != param_5);
  }
  uVar12 = lVar9 - lVar7 >> 4;
  uVar5 = FUN_00875ec8(*param_3);
  lVar8 = param_3[0xf8];
  lVar4 = param_3[0xf7];
  uVar10 = lVar8 - lVar4 >> 4;
  if (uVar12 < uVar10) {
    lVar11 = uVar12 << 4;
    uVar6 = uVar12;
    do {
      if (*(int *)(lVar4 + lVar11) == 0) {
        uVar10 = FUN_00875ed8(*param_3,*(undefined8 *)(lVar4 + lVar11 + 8),uVar5);
        if ((uVar10 & 1) == 0) goto LAB_00899518;
        lVar8 = param_3[0xf8];
        lVar4 = param_3[0xf7];
      }
      uVar6 = uVar6 + 1;
      lVar11 = lVar11 + 0x10;
      uVar10 = lVar8 - lVar4 >> 4;
    } while (uVar6 < uVar10);
  }
  if (uVar12 < uVar10 || uVar12 - uVar10 == 0) {
    if (uVar12 < uVar10) {
      param_3[0xf8] = lVar4 + (lVar9 - lVar7);
    }
  }
  else {
    FUN_00894a8c(param_3 + 0xf7,uVar12 - uVar10);
  }
  param_3[0xfb] = param_3[0xfb] + -0x18;
  puVar3 = (undefined4 *)FUN_008984e0(param_3 + 0x30,&local_90);
  *puVar3 = 0;
  FUN_0089be8c(param_3 + 0x29,param_3 + 0x76);
  FUN_0089c0d8(param_3 + 0x30,param_3 + 0x79);
  if (*(long *)(lVar1 + 0x28) == local_88) {
    return;
  }
LAB_0089953c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
LAB_00899518:
  if (*(long *)(lVar1 + 0x28) == local_88) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_4 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
  }
  goto LAB_0089953c;
}

