/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946444
 */

void FUN_00946444(long param_1)

{
  uint uVar1;
  long lVar2;
  
  lVar2 = 0;
  do {
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x738 + lVar2));
    *(undefined8 *)(param_1 + 0x738 + lVar2) = 0;
    lVar2 = lVar2 + 8;
  } while (lVar2 != 0x250);
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x988));
  *(undefined8 *)(param_1 + 0x988) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x990));
  *(undefined8 *)(param_1 + 0x990) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x998));
  *(undefined8 *)(param_1 + 0x998) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9a0));
  *(undefined8 *)(param_1 + 0x9a0) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9a8));
  *(undefined8 *)(param_1 + 0x9a8) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9b0));
  *(undefined8 *)(param_1 + 0x9b0) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9b8));
  *(undefined8 *)(param_1 + 0x9b8) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x9c0));
  uVar1 = *(uint *)(param_1 + 0x131c);
  *(undefined8 *)(param_1 + 0x9c0) = 0;
  if ((uVar1 >> 0xf & 1) == 0) {
    *(undefined8 *)(param_1 + 0x11c0) = 0;
  }
  else {
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11c0));
    *(undefined8 *)(param_1 + 0x11c0) = 0;
    uVar1 = *(uint *)(param_1 + 0x131c) & 0xffff7fff;
    *(uint *)(param_1 + 0x131c) = uVar1;
    *(undefined8 *)(param_1 + 0x11c0) = 0;
  }
  if ((uVar1 >> 0xe & 1) != 0) {
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11b8));
    *(undefined8 *)(param_1 + 0x11b8) = 0;
    *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) & 0xffffbfff;
  }
  *(undefined8 *)(param_1 + 0x11b8) = 0;
  FUN_00925eb8(param_1 + 0x350);
  curl_slist_free_all(*(undefined8 *)(param_1 + 0x1298));
  *(undefined8 *)(param_1 + 0x1298) = 0;
  return;
}

