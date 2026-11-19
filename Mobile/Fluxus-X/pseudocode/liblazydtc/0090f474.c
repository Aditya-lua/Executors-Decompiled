/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090f474
 */

long FUN_0090f474(undefined8 *param_1,uint param_2)

{
  void *__dest;
  long lVar1;
  size_t sVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  int iVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  
  if ((param_1 == (undefined8 *)0x0) ||
     (puVar9 = *(undefined8 **)param_1[3], puVar9 == (undefined8 *)0x0)) {
    lVar5 = 0;
  }
  else {
    iVar8 = *(int *)(param_1 + 2);
    lVar6 = 8;
    lVar4 = 0;
    lVar7 = 0;
    do {
      sVar2 = strlen((char *)*param_1);
      lVar1 = 0x1c;
      if (iVar8 != 10) {
        lVar1 = 0x10;
      }
      lVar3 = (*(code *)PTR_calloc_00cc4690)(1,sVar2 + lVar1 + 0x31);
      if (lVar3 == 0) {
        if (lVar4 == 0) {
          return 0;
        }
        do {
          lVar5 = *(long *)(lVar4 + 0x28);
          (*(code *)PTR_free_00cc4678)(lVar4);
          lVar4 = lVar5;
        } while (lVar5 != 0);
        return 0;
      }
      __dest = (void *)(lVar3 + 0x30 + lVar1);
      *(void **)(lVar3 + 0x18) = __dest;
      *(long *)(lVar3 + 0x20) = lVar3 + 0x30;
      memcpy(__dest,(void *)*param_1,sVar2 + 1);
      lVar5 = lVar3;
      if (lVar4 != 0) {
        lVar5 = lVar4;
      }
      if (lVar7 != 0) {
        *(long *)(lVar7 + 0x28) = lVar3;
      }
      iVar8 = *(int *)(param_1 + 2);
      *(int *)(lVar3 + 0x10) = (int)lVar1;
      *(int *)(lVar3 + 4) = iVar8;
      *(undefined4 *)(lVar3 + 8) = 1;
      if (iVar8 == 10) {
        uVar10 = *puVar9;
        *(undefined8 *)(lVar3 + 0x40) = puVar9[1];
        *(undefined8 *)(lVar3 + 0x38) = uVar10;
LAB_0090f558:
        iVar8 = *(int *)(param_1 + 2);
        *(ushort *)(lVar3 + 0x32) =
             (ushort)(param_2 >> 8) & 0xff | (ushort)((param_2 & 0xff00ff) << 8);
        *(short *)(lVar3 + 0x30) = (short)iVar8;
      }
      else if (iVar8 == 2) {
        *(undefined4 *)(lVar3 + 0x34) = *(undefined4 *)puVar9;
        goto LAB_0090f558;
      }
      puVar9 = *(undefined8 **)(param_1[3] + lVar6);
      lVar6 = lVar6 + 8;
      lVar4 = lVar5;
      lVar7 = lVar3;
    } while (puVar9 != (undefined8 *)0x0);
  }
  return lVar5;
}

