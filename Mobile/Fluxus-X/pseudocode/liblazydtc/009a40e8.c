/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a40e8
 */

/* ix::SocketOpenSSL::openSSLServerHandshake(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&) */

void __thiscall
ix::SocketOpenSSL::openSSLServerHandshake(SocketOpenSSL *this,basic_string_conflict *param_1)

{
  long lVar1;
  int ret_code;
  uint uVar2;
  undefined4 uVar3;
  long lVar4;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  
  lVar1 = tpidr_el0;
  lVar4 = *(long *)(lVar1 + 0x28);
  do {
    if ((*(long *)(this + 0x40) == 0) || (*(long *)(this + 0x48) == 0)) {
      uVar3 = 0;
      goto LAB_009a41ac;
    }
    ERR_clear_error();
    ret_code = SSL_accept(*(SSL **)(this + 0x40));
    uVar3 = 1;
    if (ret_code == 1) goto LAB_009a41ac;
    uVar2 = SSL_get_error(*(SSL **)(this + 0x40),ret_code);
  } while ((uVar2 | 1) == 3);
  getSSLError((int)this);
  if (((byte)*param_1 & 1) == 0) {
    *(undefined2 *)param_1 = 0;
  }
  else {
    **(undefined1 **)(param_1 + 0x10) = 0;
    *(undefined8 *)(param_1 + 8) = 0;
    if (((byte)*param_1 & 1) != 0) {
      operator_delete(*(void **)(param_1 + 0x10));
      *(undefined8 *)param_1 = 0;
    }
  }
  uVar3 = 0;
  *(undefined8 *)(param_1 + 0x10) = local_40;
  *(undefined8 *)(param_1 + 8) = uStack_48;
  *(undefined8 *)param_1 = local_50;
LAB_009a41ac:
  if (*(long *)(lVar1 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

