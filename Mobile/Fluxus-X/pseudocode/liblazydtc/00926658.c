/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00926658
 */

undefined4 curl_mime_filedata(long param_1,char *param_2)

{
  long lVar1;
  undefined *puVar2;
  int iVar3;
  long lVar4;
  char *__filename;
  long lVar5;
  undefined4 uVar6;
  undefined1 auStack_c8 [16];
  uint local_b8;
  __off_t local_98;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_1 == 0) {
    uVar6 = 0x2b;
  }
  else {
    if (*(code **)(param_1 + 0x30) != (code *)0x0) {
      (**(code **)(param_1 + 0x30))(*(undefined8 *)(param_1 + 0x38));
    }
    *(undefined8 *)(param_1 + 0x1b0) = 1;
    *(undefined8 *)(param_1 + 0x18) = 0;
    *(undefined8 *)(param_1 + 0x20) = 0;
    *(undefined8 *)(param_1 + 0x28) = 0;
    *(undefined8 *)(param_1 + 0x30) = 0;
    *(long *)(param_1 + 0x38) = param_1;
    *(undefined8 *)(param_1 + 0x40) = 0;
    *(undefined8 *)(param_1 + 0x70) = 0;
    *(undefined8 *)(param_1 + 0xa0) = 0;
    *(undefined8 *)(param_1 + 0xa8) = 0;
    *(undefined8 *)(param_1 + 0x98) = 0;
    *(undefined4 *)(param_1 + 0x10) = 0;
    *(uint *)(param_1 + 0x14) = *(uint *)(param_1 + 0x14) & 0xfffffffb;
    *(undefined4 *)(param_1 + 0x78) = 0;
    uVar6 = 0;
    if (param_2 != (char *)0x0) {
      iVar3 = stat(param_2,(stat *)auStack_c8);
      if (iVar3 == 0) {
        lVar4 = (*(code *)PTR_strdup_00cc4688)(param_2);
        *(long *)(param_1 + 0x18) = lVar4;
        if (lVar4 != 0) {
          *(undefined8 *)(param_1 + 0x70) = 0xffffffffffffffff;
          if ((local_b8 & 0xf000) == 0x8000) {
            *(undefined1 **)(param_1 + 0x28) = &LAB_00926d78;
            *(__off_t *)(param_1 + 0x70) = local_98;
          }
          *(undefined1 **)(param_1 + 0x20) = &LAB_00926df4;
          *(undefined1 **)(param_1 + 0x30) = &LAB_00926e74;
          *(undefined4 *)(param_1 + 0x10) = 2;
          __filename = (char *)(*(code *)PTR_strdup_00cc4688)(param_2);
          puVar2 = PTR_strdup_00cc4688;
          if (__filename != (char *)0x0) {
            basename(__filename);
            lVar4 = (*(code *)puVar2)();
            (*(code *)PTR_free_00cc4678)(__filename);
            uVar6 = 0x1b;
            if (lVar4 != 0) {
              (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x60));
              *(undefined8 *)(param_1 + 0x60) = 0;
              lVar5 = (*(code *)PTR_strdup_00cc4688)(lVar4);
              *(long *)(param_1 + 0x60) = lVar5;
              uVar6 = 0x1b;
              if (lVar5 != 0) {
                uVar6 = 0;
              }
              (*(code *)PTR_free_00cc4678)(lVar4);
            }
            goto LAB_009266e8;
          }
        }
        uVar6 = 0x1b;
      }
      else {
        uVar6 = 0x1a;
      }
    }
  }
LAB_009266e8:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar6;
}

