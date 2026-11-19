/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8eb8
 */

void async_start_func(void)

{
  undefined4 uVar1;
  long lVar2;
  long lVar3;
  
  lVar2 = CRYPTO_THREAD_get_local(&DAT_00d218e8);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/async/async.c",0x9c,"async_start_func");
    ERR_set_error(0x33,0xc0103,0);
    return;
  }
  do {
    lVar3 = *(long *)(lVar2 + 8);
    uVar1 = (**(code **)(lVar3 + 8))(*(undefined8 *)(lVar3 + 0x10));
    *(undefined4 *)(lVar3 + 0x18) = uVar1;
    *(undefined4 *)(lVar3 + 0x1c) = 3;
    ERR_new();
    ERR_set_debug("crypto/async/async.c",0xac,"async_start_func");
    ERR_set_error(0x33,0x66,0);
  } while( true );
}

