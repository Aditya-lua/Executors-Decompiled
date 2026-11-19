/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa19f8
 */

bool ossl_provider_init_as_child(long param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined8 *puVar2;
  long lVar3;
  long *plVar4;
  long *plVar5;
  
  if ((param_1 == 0) ||
     (puVar2 = (undefined8 *)ossl_lib_ctx_get_data(param_1,0x12,&DAT_00c6d498),
     puVar2 == (undefined8 *)0x0)) {
    return false;
  }
  plVar4 = (long *)(param_3 + 8);
  *puVar2 = param_2;
  do {
    iVar1 = (int)plVar4[-1];
    switch(iVar1) {
    case 0x69:
      plVar5 = puVar2 + 4;
      break;
    case 0x6a:
      plVar5 = puVar2 + 5;
      break;
    case 0x6b:
      plVar5 = puVar2 + 6;
      break;
    case 0x6c:
      plVar5 = puVar2 + 7;
      break;
    case 0x6d:
      plVar5 = puVar2 + 8;
      break;
    case 0x6e:
      plVar5 = puVar2 + 9;
      break;
    case 0x6f:
      plVar5 = puVar2 + 10;
      break;
    default:
      plVar5 = puVar2 + 3;
      if (iVar1 == 4) break;
      if (iVar1 == 0) {
        if ((((puVar2[3] == 0) || (puVar2[4] == 0)) || (puVar2[6] == 0)) ||
           (((puVar2[7] == 0 || (puVar2[8] == 0)) || ((puVar2[9] == 0 || (puVar2[10] == 0)))))) {
          return false;
        }
        lVar3 = CRYPTO_THREAD_lock_new();
        puVar2[2] = lVar3;
        if (lVar3 == 0) {
          return false;
        }
        iVar1 = (*(code *)puVar2[4])(*puVar2,&LAB_00aa1b64,FUN_00aa1c88,&LAB_00aa1d08,param_1);
        return iVar1 != 0;
      }
      goto LAB_00aa1a64;
    }
    *plVar5 = *plVar4;
LAB_00aa1a64:
    plVar4 = plVar4 + 2;
  } while( true );
}

