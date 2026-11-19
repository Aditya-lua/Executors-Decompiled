/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009872c4
 */

/* ix::DNSLookup::setRes(std::__ndk1::shared_ptr<addrinfo>) */

void __thiscall ix::DNSLookup::setRes(DNSLookup *this,undefined8 *param_2)

{
  __shared_weak_count *p_Var1;
  undefined8 uVar2;
  undefined8 uVar3;
  char cVar4;
  bool bVar5;
  long lVar6;
  __shared_weak_count *this_00;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x48));
  uVar2 = *param_2;
  uVar3 = param_2[1];
  *param_2 = 0;
  param_2[1] = 0;
  this_00 = *(__shared_weak_count **)(this + 0x40);
  *(undefined8 *)(this + 0x38) = uVar2;
  *(undefined8 *)(this + 0x40) = uVar3;
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var1 = this_00 + 8;
    do {
      lVar6 = *(long *)p_Var1;
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar5) {
        *(long *)p_Var1 = lVar6 + -1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    if (lVar6 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      std::__ndk1::__shared_weak_count::__release_weak(this_00);
    }
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0x48));
  return;
}

