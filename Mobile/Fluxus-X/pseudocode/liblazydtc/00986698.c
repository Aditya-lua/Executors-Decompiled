/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00986698
 */

/* ix::DNSLookup::~DNSLookup() */

void __thiscall ix::DNSLookup::~DNSLookup(DNSLookup *this)

{
  __shared_weak_count *p_Var1;
  DNSLookup DVar2;
  char cVar3;
  bool bVar4;
  long lVar5;
  __shared_weak_count *this_00;
  
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x88));
  if (((byte)this[0x70] & 1) != 0) {
    operator_delete(*(void **)(this + 0x80));
  }
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x48));
  this_00 = *(__shared_weak_count **)(this + 0x40);
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var1 = this_00 + 8;
    do {
      lVar5 = *(long *)p_Var1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar4) {
        *(long *)p_Var1 = lVar5 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar5 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      std::__ndk1::__shared_weak_count::__release_weak(this_00);
      DVar2 = this[0x10];
      goto joined_r0x009866ec;
    }
  }
  DVar2 = this[0x10];
joined_r0x009866ec:
  if (((byte)DVar2 & 1) != 0) {
    operator_delete(*(void **)(this + 0x20));
  }
  if (*(__shared_weak_count **)(this + 8) == (__shared_weak_count *)0x0) {
    return;
  }
  std::__ndk1::__shared_weak_count::__release_weak(*(__shared_weak_count **)(this + 8));
  return;
}

