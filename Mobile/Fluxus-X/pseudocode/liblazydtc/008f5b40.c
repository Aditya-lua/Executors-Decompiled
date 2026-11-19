/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f5b40
 */

/* std::__ndk1::future<cpr::Response>::future(std::__ndk1::__assoc_state<cpr::Response>*) */

void __thiscall
std::__ndk1::future<cpr::Response>::future(future<cpr::Response> *this,__assoc_state *param_1)

{
  __assoc_state *p_Var1;
  char cVar2;
  bool bVar3;
  future_error *pfVar4;
  undefined8 uVar5;
  long lVar6;
  
  *(__assoc_state **)this = param_1;
  if (((byte)param_1[0x70] >> 1 & 1) != 0) {
    pfVar4 = (future_error *)__cxa_allocate_exception(0x20);
    uVar5 = future_category();
                    /* try { // try from 008f5bac to 008f5bb7 has its CatchHandler @ 008f5bd0 */
    future_error::future_error(pfVar4,1,uVar5);
                    /* WARNING: Subroutine does not return */
    __cxa_throw(pfVar4,&future_error::typeinfo,future_error::~future_error);
  }
  p_Var1 = param_1 + 8;
  do {
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
    if (bVar3) {
      *(long *)p_Var1 = *(long *)p_Var1 + 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  lVar6 = *(long *)this;
  mutex::lock((mutex *)(lVar6 + 0x18));
  *(uint *)(lVar6 + 0x70) = *(uint *)(lVar6 + 0x70) | 2;
  mutex::unlock((mutex *)(lVar6 + 0x18));
  return;
}

