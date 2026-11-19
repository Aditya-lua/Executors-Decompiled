; cpr::ThreadPool::Stop @ 008fddd4
008fddd4	str x23,[sp, #-0x40]!
008fddd8	stp x22,x21,[sp, #0x10]
008fdddc	stp x20,x19,[sp, #0x20]
008fdde0	stp x29,x30,[sp, #0x30]
008fdde4	add x29,sp,#0x30
008fdde8	add x8,x0,#0x20
008fddec	ldar w9,[x8]
008fddf0	mov x19,x0
008fddf4	cbz w9,0x008fdecc
008fddf8	add x0,x19,#0xd0
008fddfc	stlr wzr,[x8]
008fde00	bl 0x00c315e0
008fde04	ldr x20,[x19, #0x40]
008fde08	add x22,x19,#0x38
008fde0c	cmp x22,x20
008fde10	b.ne 0x008fde24
008fde14	b 0x008fde38
008fde18	ldr x20,[x20, #0x8]
008fde1c	cmp x22,x20
008fde20	b.eq 0x008fde38
008fde24	ldr x0,[x20, #0x10]
008fde28	ldr x8,[x0]
008fde2c	cbz x8,0x008fde18
008fde30	bl 0x00c31920
008fde34	b 0x008fde18
008fde38	ldr x8,[x19, #0x48]
008fde3c	cbz x8,0x008fdeb4
008fde40	ldp x8,x20,[x19, #0x38]
008fde44	ldr x9,[x8, #0x8]
008fde48	ldr x10,[x20]
008fde4c	cmp x20,x22
008fde50	str x9,[x10, #0x8]
008fde54	ldr x8,[x8, #0x8]
008fde58	str x10,[x8]
008fde5c	str xzr,[x19, #0x48]
008fde60	b.eq 0x008fdeb4
008fde64	ldr x21,[x20, #0x18]
008fde68	ldr x23,[x20, #0x8]
008fde6c	cbz x21,0x008fdea0
008fde70	add x8,x21,#0x8
008fde74	ldaxr x9,[x8]
008fde78	sub x10,x9,#0x1
008fde7c	stlxr w11,x10,[x8]
008fde80	cbnz w11,0x008fde74
008fde84	cbnz x9,0x008fdea0
008fde88	ldr x8,[x21]
008fde8c	mov x0,x21
008fde90	ldr x8,[x8, #0x10]
008fde94	blr x8
008fde98	mov x0,x21
008fde9c	bl 0x00c2ff00
008fdea0	mov x0,x20
008fdea4	bl 0x00c301d0
008fdea8	cmp x23,x22
008fdeac	mov x20,x23
008fdeb0	b.ne 0x008fde64
008fdeb4	mov w0,wzr
008fdeb8	add x8,x19,#0x28
008fdebc	add x9,x19,#0x30
008fdec0	stlr xzr,[x8]
008fdec4	stlr xzr,[x9]
008fdec8	b 0x008fded0
008fdecc	mov w0,#0xffffffff
008fded0	ldp x29,x30,[sp, #0x30]
008fded4	ldp x20,x19,[sp, #0x20]
008fded8	ldp x22,x21,[sp, #0x10]
008fdedc	ldr x23,[sp], #0x40
008fdee0	ret
