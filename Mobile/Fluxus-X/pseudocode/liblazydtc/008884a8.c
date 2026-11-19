/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008884a8
 */

void FUN_008884a8(undefined8 *param_1,long param_2)

{
  ulong uVar1;
  bool bVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  undefined4 uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined4 uVar13;
  long lVar14;
  
  uVar8 = *(ulong *)(param_2 + 0x28);
  if (0xfe < uVar8) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,"Exceeded return count limit; simplify the code to compile");
  }
  if (((DAT_00d1f0c8 == '\x01') && (*(long *)(param_1[0xcd] + 0x98) == 0)) &&
     (param_1[0xfd] == param_1[0xfe])) {
    *(undefined1 *)((long)param_1 + 0xcfe) = 1;
    uVar13 = *(undefined4 *)((long)param_1 + 0x64c);
    if (uVar8 == 0) goto LAB_00888574;
LAB_00888508:
                    /* try { // try from 00888510 to 00888517 has its CatchHandler @ 00888848 */
    uVar4 = FUN_0088df20(param_1,**(undefined8 **)(param_2 + 0x20));
    if ((int)uVar4 < 0) goto LAB_00888574;
    if (1 < *(ulong *)(param_2 + 0x28)) {
      uVar8 = 1;
      do {
                    /* try { // try from 0088853c to 00888543 has its CatchHandler @ 00888868 */
        iVar5 = FUN_0088df20(param_1,*(undefined8 *)(*(long *)(param_2 + 0x20) + uVar8 * 8));
        if ((uVar4 & 0xff) + (int)uVar8 != iVar5) goto LAB_00888578;
        uVar8 = uVar8 + 1;
      } while (uVar8 < *(ulong *)(param_2 + 0x28));
    }
  }
  else {
    uVar13 = *(undefined4 *)((long)param_1 + 0x64c);
    if (uVar8 != 0) goto LAB_00888508;
LAB_00888574:
    uVar4 = 0;
LAB_00888578:
    uVar8 = *(ulong *)(param_2 + 0x28);
    if ((DAT_00d1f0e8 == '\x01') && (1 < uVar8)) {
      puVar11 = *(undefined8 **)(param_2 + 0x20);
      lVar14 = uVar8 << 3;
      bVar2 = true;
      do {
                    /* try { // try from 008885a4 to 008885ab has its CatchHandler @ 00888884 */
        iVar5 = FUN_0088df20(param_1,*puVar11);
        puVar11 = puVar11 + 1;
        lVar14 = lVar14 + -8;
        bVar2 = (bool)(iVar5 != -1 & bVar2);
      } while (lVar14 != 0);
      if (bVar2) {
                    /* try { // try from 008885d0 to 008885d7 has its CatchHandler @ 00888840 */
        uVar6 = FUN_0088df20(param_1,**(undefined8 **)(param_2 + 0x20));
        uVar8 = *(ulong *)(param_2 + 0x28);
        if (uVar8 < 2) {
          uVar12 = 1;
        }
        else {
          uVar12 = 1;
          do {
                    /* try { // try from 008885f8 to 008885ff has its CatchHandler @ 00888850 */
            iVar5 = FUN_0088df20(param_1,*(undefined8 *)(*(long *)(param_2 + 0x20) + uVar12 * 8));
            uVar8 = *(ulong *)(param_2 + 0x28);
            if ((uVar6 & 0xff) + (int)uVar12 != iVar5) break;
            uVar12 = uVar12 + 1;
          } while (uVar12 < uVar8);
        }
        if (uVar12 + (uVar6 & 0xff) == (ulong)*(uint *)((long)param_1 + 0x64c)) {
          iVar5 = (int)uVar8 - (int)uVar12;
          uVar4 = *(uint *)((long)param_1 + 0x64c) + iVar5;
          if (0xff < uVar4) {
                    /* try { // try from 00888820 to 00888837 has its CatchHandler @ 00888838 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(param_2 + 0xc,
                         "Out of registers when trying to allocate %d registers: exceeded limit %d",
                         iVar5,0xff);
          }
          *(uint *)((long)param_1 + 0x64c) = uVar4;
          uVar3 = *(uint *)(param_1 + 0xca);
          if (*(uint *)(param_1 + 0xca) <= uVar4) {
            uVar3 = uVar4;
          }
          *(uint *)(param_1 + 0xca) = uVar3;
          if (uVar12 < uVar8) {
            do {
              uVar10 = *param_1;
                    /* try { // try from 00888678 to 00888697 has its CatchHandler @ 00888858 */
              uVar7 = FUN_0088df20(param_1,*(undefined8 *)(*(long *)(param_2 + 0x20) + uVar12 * 8));
              FUN_00875b54(uVar10,6,(uVar6 & 0xff) + (int)uVar12,uVar7,0);
              uVar12 = uVar12 + 1;
            } while (uVar12 < *(ulong *)(param_2 + 0x28));
          }
          uVar12 = 0;
          goto LAB_008887a0;
        }
      }
      else {
        uVar8 = *(ulong *)(param_2 + 0x28);
      }
    }
    if (uVar8 == 1) {
                    /* try { // try from 008886c4 to 008886cb has its CatchHandler @ 00888860 */
      uVar8 = FUN_00892bc4(param_1,**(undefined8 **)(param_2 + 0x20));
      if ((uVar8 & 1) == 0) {
        iVar5 = *(int *)((long)param_1 + 0x64c);
        uVar4 = iVar5 + 1;
        if (0xff < uVar4) {
          uVar8 = 1;
          goto LAB_0088880c;
        }
        puVar11 = *(undefined8 **)(param_2 + 0x20);
        *(uint *)((long)param_1 + 0x64c) = uVar4;
        uVar10 = *puVar11;
        uVar6 = *(uint *)(param_1 + 0xca);
        if (*(uint *)(param_1 + 0xca) <= uVar4) {
          uVar6 = uVar4;
        }
        *(uint *)(param_1 + 0xca) = uVar6;
                    /* try { // try from 0088878c to 008887db has its CatchHandler @ 00888860 */
        uVar4 = FUN_00891438(param_1,uVar10,iVar5,0xff);
        goto LAB_0088879c;
      }
      uVar8 = *(ulong *)(param_2 + 0x28);
    }
    if (uVar8 != 0) {
      uVar6 = *(uint *)((long)param_1 + 0x64c);
      uVar4 = uVar6 + (int)uVar8;
      if (0xff < uVar4) {
LAB_0088880c:
                    /* try { // try from 0088880c to 0088881f has its CatchHandler @ 00888860 */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",
                     uVar8,0xff);
      }
      uVar12 = 0;
      *(uint *)((long)param_1 + 0x64c) = uVar4;
      uVar3 = *(uint *)(param_1 + 0xca);
      if (*(uint *)(param_1 + 0xca) <= uVar4) {
        uVar3 = uVar4;
      }
      *(uint *)(param_1 + 0xca) = uVar3;
      uVar9 = 0;
      do {
        uVar1 = uVar9 + 1;
        uVar4 = (int)uVar9 + uVar6;
        uVar10 = *(undefined8 *)(*(long *)(param_2 + 0x20) + uVar9 * 8);
        if (uVar1 == uVar8) {
                    /* try { // try from 00888750 to 00888757 has its CatchHandler @ 0088887c */
          uVar12 = FUN_00891d80(param_1);
          uVar12 = uVar12 & 0xffffffff;
        }
        else {
          uVar7 = *(undefined4 *)((long)param_1 + 0x64c);
          *(uint *)((long)param_1 + 0x64c) = (uVar4 & 0xff) + 1;
                    /* try { // try from 00888718 to 00888723 has its CatchHandler @ 00888870 */
          FUN_0088d1d0(param_1,uVar10,uVar4,1);
          *(undefined4 *)((long)param_1 + 0x64c) = uVar7;
        }
        uVar8 = *(ulong *)(param_2 + 0x28);
        uVar9 = uVar1;
      } while (uVar1 < uVar8);
      goto LAB_008887a0;
    }
  }
LAB_0088879c:
  uVar12 = 0;
  uVar6 = uVar4;
LAB_008887a0:
  FUN_008860c8(param_1,0);
  if ((uVar12 & 1) == 0) {
    iVar5 = *(byte *)(param_2 + 0x28) + 1;
  }
  else {
    iVar5 = 0;
    *(undefined1 *)((long)param_1 + 0x661) = 1;
  }
  FUN_00875b54(*param_1,0x16,uVar6,iVar5,0);
  *(undefined4 *)((long)param_1 + 0x64c) = uVar13;
  return;
}

