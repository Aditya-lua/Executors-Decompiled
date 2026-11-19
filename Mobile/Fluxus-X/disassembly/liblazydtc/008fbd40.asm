; cpr::CurlContainer<cpr::Parameter>::CurlContainer @ 008fbd40
008fbd40	stp x24,x23,[sp, #-0x40]!
008fbd44	stp x22,x21,[sp, #0x10]
008fbd48	stp x20,x19,[sp, #0x20]
008fbd4c	stp x29,x30,[sp, #0x30]
008fbd50	add x29,sp,#0x30
008fbd54	mov w8,#0x1
008fbd58	strb w8,[x0]
008fbd5c	ldp x21,x8,[x1]
008fbd60	mov x20,x0
008fbd64	mov x19,x0
008fbd68	str xzr,[x20, #0x8]!
008fbd6c	stp xzr,xzr,[x20, #0x8]
008fbd70	cbz x8,0x008fbdc4
008fbd74	orr x9,xzr,#0x5555555555555555
008fbd78	movk x9,#0x5556
008fbd7c	movk x9,#0x555, LSL #48
008fbd80	cmp x8,x9
008fbd84	b.cs 0x008fbdd8
008fbd88	add x8,x8,x8, LSL #0x1
008fbd8c	lsl x22,x8,#0x4
008fbd90	mov x0,x22
008fbd94	bl 0x00c2fed0
008fbd98	add x8,x0,x22
008fbd9c	stp x0,x0,[x19, #0x8]
008fbda0	str x8,[x19, #0x18]
008fbda4	mov x1,x21
008fbda8	bl 0x00c30f30
008fbdac	ldr x8,[x19, #0x10]
008fbdb0	add x21,x21,#0x30
008fbdb4	subs x22,x22,#0x30
008fbdb8	add x0,x8,#0x30
008fbdbc	str x0,[x19, #0x10]
008fbdc0	b.ne 0x008fbda4
008fbdc4	ldp x29,x30,[sp, #0x30]
008fbdc8	ldp x20,x19,[sp, #0x20]
008fbdcc	ldp x22,x21,[sp, #0x10]
008fbdd0	ldp x24,x23,[sp], #0x40
008fbdd4	ret
008fbdd8	mov x0,x20
008fbddc	bl 0x00c30bd0
