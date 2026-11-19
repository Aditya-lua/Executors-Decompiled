/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81a44
 */

undefined8 ossl_bio_init_core(undefined8 param_1,long param_2)

{
  long *plVar1;
  long *plVar2;
  
  plVar1 = (long *)ossl_lib_ctx_get_data(param_1,0x11,&DAT_00c61408);
  if (plVar1 == (long *)0x0) {
    return 0;
  }
  plVar2 = (long *)(param_2 + 8);
LAB_00a81a7c:
  switch((int)plVar2[-1]) {
  case 0:
    goto LAB_00a81b24;
  case 0x2a:
    if (*plVar1 == 0) {
      *plVar1 = *plVar2;
      plVar2 = plVar2 + 2;
      goto LAB_00a81a7c;
    }
    break;
  case 0x2b:
    if (plVar1[1] == 0) {
      plVar1[1] = *plVar2;
      plVar2 = plVar2 + 2;
      goto LAB_00a81a7c;
    }
    break;
  case 0x2c:
    if (plVar1[5] == 0) {
      plVar1[5] = *plVar2;
      plVar2 = plVar2 + 2;
      goto LAB_00a81a7c;
    }
    break;
  case 0x2d:
    if (plVar1[6] == 0) {
      plVar1[6] = *plVar2;
    }
    break;
  case 0x30:
    if (plVar1[3] == 0) {
      plVar1[3] = *plVar2;
      plVar2 = plVar2 + 2;
      goto LAB_00a81a7c;
    }
    break;
  case 0x31:
    if (plVar1[2] == 0) {
      plVar1[2] = *plVar2;
      plVar2 = plVar2 + 2;
      goto LAB_00a81a7c;
    }
    break;
  case 0x32:
    if (plVar1[4] != 0) break;
    plVar1[4] = *plVar2;
    plVar2 = plVar2 + 2;
    goto LAB_00a81a7c;
  }
  plVar2 = plVar2 + 2;
  goto LAB_00a81a7c;
LAB_00a81b24:
  return 1;
}

