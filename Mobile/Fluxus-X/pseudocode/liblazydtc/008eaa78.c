/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eaa78
 */

/* cpr::CurlHolder::CurlHolder() */

void __thiscall cpr::CurlHolder::CurlHolder(CurlHolder *this)

{
  int iVar1;
  undefined8 uVar2;
  
  memset(this,0,0x120);
  if (((curl_easy_init_mutex_()::curl_easy_init_mutex_ & 1) == 0) &&
     (iVar1 = __cxa_guard_acquire(&curl_easy_init_mutex_()::curl_easy_init_mutex_), iVar1 != 0)) {
    __cxa_atexit(std::__ndk1::mutex::~mutex,curl_easy_init_mutex_()::curl_easy_init_mutex_,
                 &PTR_LOOP_00c48880);
    __cxa_guard_release(&curl_easy_init_mutex_()::curl_easy_init_mutex_);
  }
  std::__ndk1::mutex::lock((mutex *)curl_easy_init_mutex_()::curl_easy_init_mutex_);
  uVar2 = curl_easy_init();
  *(undefined8 *)this = uVar2;
  if (((curl_easy_init_mutex_()::curl_easy_init_mutex_ & 1) == 0) &&
     (iVar1 = __cxa_guard_acquire(&curl_easy_init_mutex_()::curl_easy_init_mutex_), iVar1 != 0)) {
    __cxa_atexit(std::__ndk1::mutex::~mutex,curl_easy_init_mutex_()::curl_easy_init_mutex_,
                 &PTR_LOOP_00c48880);
    __cxa_guard_release(&curl_easy_init_mutex_()::curl_easy_init_mutex_);
  }
  std::__ndk1::mutex::unlock((mutex *)curl_easy_init_mutex_()::curl_easy_init_mutex_);
  return;
}

