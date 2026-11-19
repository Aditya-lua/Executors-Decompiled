; std::__ndk1::__vector_base<std::__ndk1::unique_ptr<std::__ndk1::mutex,std::__ndk1::default_delete<std::__ndk1::mutex>>,std::__ndk1::allocator<std::__ndk1::unique_ptr<std::__ndk1::mutex,std::__ndk1::default_delete<std::__ndk1::mutex>>>>::~__vector_base @ 009a3300
009a3300	stp x22,x21,[sp, #-0x30]!
009a3304	stp x20,x19,[sp, #0x10]
009a3308	stp x29,x30,[sp, #0x20]
009a330c	add x29,sp,#0x20
009a3310	ldr x21,[x0]
009a3314	mov x19,x0
009a3318	cbz x21,0x009a3354
009a331c	ldr x22,[x19, #0x8]
009a3320	cmp x22,x21
009a3324	b.eq 0x009a3364
009a3328	ldr x20,[x22, #-0x8]!
009a332c	str xzr,[x22]
009a3330	cbz x20,0x009a3344
009a3334	mov x0,x20
009a3338	bl 0x00c2fee0
009a333c	mov x0,x20
009a3340	bl 0x00c301d0
009a3344	cmp x21,x22
009a3348	b.ne 0x009a3328
009a334c	ldr x0,[x19]
009a3350	b 0x009a3368
009a3354	ldp x29,x30,[sp, #0x20]
009a3358	ldp x20,x19,[sp, #0x10]
009a335c	ldp x22,x21,[sp], #0x30
009a3360	ret
009a3364	mov x0,x21
009a3368	str x21,[x19, #0x8]
009a336c	ldp x29,x30,[sp, #0x20]
009a3370	ldp x20,x19,[sp, #0x10]
009a3374	ldp x22,x21,[sp], #0x30
009a3378	b 0x00c301d0
