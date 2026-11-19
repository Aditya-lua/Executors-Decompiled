/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5400
 */

/* void std::__ndk1::__call_once_proxy<std::__ndk1::tuple<void (ix::SocketOpenSSL::*&&)(),
   ix::SocketOpenSSL*&&> >(void*) */

void std::__ndk1::
     __call_once_proxy<std::__ndk1::tuple<void(ix::SocketOpenSSL::*&&)(),ix::SocketOpenSSL*&&>>
               (void *param_1)

{
  long *plVar1;
  ulong uVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  plVar1 = (long *)**(long **)param_1;
  UNRECOVERED_JUMPTABLE = (code *)*plVar1;
  uVar2 = plVar1[1];
  if ((uVar2 & 1) != 0) {
    UNRECOVERED_JUMPTABLE =
         *(code **)(UNRECOVERED_JUMPTABLE +
                   *(long *)(*(long *)(*(long **)param_1)[1] + ((long)uVar2 >> 1)));
  }
                    /* WARNING: Could not recover jumptable at 0x009a5420. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
}

