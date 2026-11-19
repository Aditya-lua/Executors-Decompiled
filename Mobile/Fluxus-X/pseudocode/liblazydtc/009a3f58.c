/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3f58
 */

/* ix::SocketOpenSSL::openSSLClientHandshake(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&,
   std::__ndk1::function<bool ()> const&) */

void __thiscall
ix::SocketOpenSSL::openSSLClientHandshake
          (SocketOpenSSL *this,basic_string_conflict *param_1,basic_string_conflict *param_2,
          function *param_3)

{
  long lVar1;
  int ret_code;
  uint uVar2;
  ulong uVar3;
  undefined8 uVar4;
  X509 *a;
  undefined8 *puVar5;
  char *pcVar6;
  long lVar7;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  
  lVar1 = tpidr_el0;
  lVar7 = *(long *)(lVar1 + 0x28);
  do {
    if ((*(long *)(this + 0x40) == 0) || (*(long *)(this + 0x48) == 0)) {
      uVar4 = 0;
      goto LAB_009a4068;
    }
    if (*(long **)(param_3 + 0x20) == (long *)0x0) {
      puVar5 = (undefined8 *)__cxa_allocate_exception(8);
      *puVar5 = &PTR__bad_function_call_00cac7b8;
                    /* WARNING: Subroutine does not return */
      __cxa_throw(puVar5,&std::__ndk1::bad_function_call::typeinfo,
                  std::bad_exception::~bad_exception);
    }
    uVar3 = (**(code **)(**(long **)(param_3 + 0x20) + 0x30))();
    if ((uVar3 & 1) != 0) {
      pcVar6 = "Cancellation requested";
      uVar3 = 0x16;
LAB_009a4014:
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             param_2,pcVar6,uVar3);
      uVar4 = 0;
      goto LAB_009a4068;
    }
    ERR_clear_error();
    ret_code = SSL_connect(*(SSL **)(this + 0x40));
    if (ret_code == 1) {
      if (this[0xb9] == (SocketOpenSSL)0x0) {
        a = (X509 *)SSL_get1_peer_certificate(*(undefined8 *)(this + 0x40));
        if (a == (X509 *)0x0) {
          pcVar6 = "OpenSSL failed - peer didn\'t present a X509 certificate.";
          uVar3 = 0x38;
          goto LAB_009a4014;
        }
        X509_free(a);
        uVar4 = 1;
      }
      else {
        uVar4 = 1;
      }
      goto LAB_009a4068;
    }
    uVar2 = SSL_get_error(*(SSL **)(this + 0x40),ret_code);
  } while ((uVar2 | 1) == 3);
  getSSLError((int)this);
  if (((byte)*param_2 & 1) == 0) {
    *(undefined2 *)param_2 = 0;
  }
  else {
    **(undefined1 **)(param_2 + 0x10) = 0;
    *(undefined8 *)(param_2 + 8) = 0;
    if (((byte)*param_2 & 1) != 0) {
      operator_delete(*(void **)(param_2 + 0x10));
      *(undefined8 *)param_2 = 0;
    }
  }
  uVar4 = 0;
  *(undefined8 *)(param_2 + 0x10) = local_50;
  *(undefined8 *)(param_2 + 8) = uStack_58;
  *(undefined8 *)param_2 = local_60;
LAB_009a4068:
  if (*(long *)(lVar1 + 0x28) != lVar7) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

