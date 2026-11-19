; std::__ndk1::__list_imp<cpr::ThreadPool::ThreadData,std::__ndk1::allocator<cpr::ThreadPool::ThreadData>>::~__list_imp @ 008fdf64
008fdf64	stp x22,x21,[sp, #-0x30]!
008fdf68	stp x20,x19,[sp, #0x10]
008fdf6c	stp x29,x30,[sp, #0x20]
008fdf70	add x29,sp,#0x20
008fdf74	ldr x8,[x0, #0x10]
008fdf78	mov x19,x0
008fdf7c	cbz x8,0x008fdff4
008fdf80	ldp x8,x20,[x19]
008fdf84	ldr x9,[x8, #0x8]
008fdf88	ldr x10,[x20]
008fdf8c	cmp x20,x19
008fdf90	str x9,[x10, #0x8]
008fdf94	ldr x8,[x8, #0x8]
008fdf98	str x10,[x8]
008fdf9c	str xzr,[x19, #0x10]
008fdfa0	b.eq 0x008fdff4
008fdfa4	ldr x21,[x20, #0x18]
008fdfa8	ldr x22,[x20, #0x8]
008fdfac	cbz x21,0x008fdfe0
008fdfb0	add x8,x21,#0x8
008fdfb4	ldaxr x9,[x8]
008fdfb8	sub x10,x9,#0x1
008fdfbc	stlxr w11,x10,[x8]
008fdfc0	cbnz w11,0x008fdfb4
008fdfc4	cbnz x9,0x008fdfe0
008fdfc8	ldr x8,[x21]
008fdfcc	mov x0,x21
008fdfd0	ldr x8,[x8, #0x10]
008fdfd4	blr x8
008fdfd8	mov x0,x21
008fdfdc	bl 0x00c2ff00
008fdfe0	mov x0,x20
008fdfe4	bl 0x00c301d0
008fdfe8	cmp x22,x19
008fdfec	mov x20,x22
008fdff0	b.ne 0x008fdfa4
008fdff4	ldp x29,x30,[sp, #0x20]
008fdff8	ldp x20,x19,[sp, #0x10]
008fdffc	ldp x22,x21,[sp], #0x30
008fe000	ret
