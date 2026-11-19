/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925eb8
 */

void FUN_00925eb8(void *param_1)

{
  if (param_1 != (void *)0x0) {
    if (*(code **)((long)param_1 + 0x30) != (code *)0x0) {
      (**(code **)((long)param_1 + 0x30))(*(undefined8 *)((long)param_1 + 0x38));
    }
    *(undefined8 *)((long)param_1 + 0x1b0) = 1;
    *(undefined8 *)((long)param_1 + 0x18) = 0;
    *(undefined8 *)((long)param_1 + 0x20) = 0;
    *(undefined8 *)((long)param_1 + 0x28) = 0;
    *(undefined8 *)((long)param_1 + 0x30) = 0;
    *(void **)((long)param_1 + 0x38) = param_1;
    *(undefined8 *)((long)param_1 + 0x40) = 0;
    *(undefined8 *)((long)param_1 + 0x70) = 0;
    *(undefined8 *)((long)param_1 + 0xa0) = 0;
    *(undefined8 *)((long)param_1 + 0xa8) = 0;
    *(undefined4 *)((long)param_1 + 0x10) = 0;
    *(uint *)((long)param_1 + 0x14) = *(uint *)((long)param_1 + 0x14) & 0xfffffffb;
    *(undefined8 *)((long)param_1 + 0x98) = 0;
    *(undefined4 *)((long)param_1 + 0x78) = 0;
    curl_slist_free_all(*(undefined8 *)((long)param_1 + 0x48));
    if ((*(byte *)((long)param_1 + 0x14) & 1) != 0) {
      curl_slist_free_all(*(undefined8 *)((long)param_1 + 0x50));
    }
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)((long)param_1 + 0x58));
    *(undefined8 *)((long)param_1 + 0x58) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)((long)param_1 + 0x68));
    *(undefined8 *)((long)param_1 + 0x68) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)((long)param_1 + 0x60));
    memset(param_1,0,0x1b0);
    *(undefined4 *)((long)param_1 + 0x78) = 0;
    *(undefined8 *)((long)param_1 + 0x1b0) = 1;
    *(undefined8 *)((long)param_1 + 0x80) = 0;
    *(undefined8 *)((long)param_1 + 0x88) = 0;
  }
  return;
}

