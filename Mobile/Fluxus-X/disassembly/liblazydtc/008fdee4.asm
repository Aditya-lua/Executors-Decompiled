; std::__ndk1::queue<std::__ndk1::function<void()>,std::__ndk1::deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>>::~queue @ 008fdee4
008fdee4	str x21,[sp, #-0x30]!
008fdee8	stp x20,x19,[sp, #0x10]
008fdeec	stp x29,x30,[sp, #0x20]
008fdef0	add x29,sp,#0x20
008fdef4	mov x19,x0
008fdef8	bl 0x00c318d0
008fdefc	ldp x20,x21,[x19, #0x8]
008fdf00	cmp x20,x21
008fdf04	b.eq 0x008fdf3c
008fdf08	ldr x0,[x20], #0x8
008fdf0c	bl 0x00c301d0
008fdf10	cmp x21,x20
008fdf14	b.ne 0x008fdf08
008fdf18	ldp x9,x8,[x19, #0x8]
008fdf1c	cmp x8,x9
008fdf20	b.eq 0x008fdf3c
008fdf24	sub x10,x8,#0x8
008fdf28	sub x9,x10,x9
008fdf2c	mvn x9,x9
008fdf30	and x9,x9,#-0x8
008fdf34	add x8,x8,x9
008fdf38	str x8,[x19, #0x10]
008fdf3c	ldr x0,[x19]
008fdf40	cbz x0,0x008fdf54
008fdf44	ldp x29,x30,[sp, #0x20]
008fdf48	ldp x20,x19,[sp, #0x10]
008fdf4c	ldr x21,[sp], #0x30
008fdf50	b 0x00c301d0
008fdf54	ldp x29,x30,[sp, #0x20]
008fdf58	ldp x20,x19,[sp, #0x10]
008fdf5c	ldr x21,[sp], #0x30
008fdf60	ret
