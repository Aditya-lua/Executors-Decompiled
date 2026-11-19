; FUN_008a7944 @ 008a7944
008a7944	ldr x8,[x0, #0x108]
008a7948	cbz x8,0x008a79e4
008a794c	lsl w8,w1,#0x3
008a7950	mov x10,#0x2d69
008a7954	lsr x9,x1,#0x20
008a7958	movk x10,#0xeb38, LSL #16
008a795c	add x8,x8,#0x8
008a7960	movk x10,#0xea08, LSL #32
008a7964	eor x8,x8,x9
008a7968	movk x10,#0x9ddf, LSL #48
008a796c	mul x8,x8,x10
008a7970	eor x9,x9,x8, LSR #0x2f
008a7974	eor x8,x9,x8
008a7978	mov x9,#0x959d
008a797c	mul x8,x8,x10
008a7980	movk x9,#0xb8f4, LSL #16
008a7984	movk x9,#0xd34f, LSL #32
008a7988	movk x9,#0x949d, LSL #48
008a798c	eor x8,x8,x8, LSR #0x2f
008a7990	mul x8,x8,x9
008a7994	ldrb w9,[x0, #0x110]
008a7998	lsr x8,x8,x9
008a799c	ldr x9,[x0, #0xf8]
008a79a0	lsr x10,x8,#0x6
008a79a4	ldr x10,[x9, x10, LSL #0x3]
008a79a8	lsr x10,x10,x8
008a79ac	tbz w10,#0x0,0x008a79e4
008a79b0	ldr x11,[x0, #0x100]
008a79b4	ldr x10,[x0, #0xe0]
008a79b8	sub x11,x11,#0x1
008a79bc	lsl x12,x8,#0x4
008a79c0	ldr x12,[x10, x12#0x0]
008a79c4	cmp x12,x1
008a79c8	b.eq 0x008a79ec
008a79cc	add x8,x8,#0x1
008a79d0	and x8,x8,x11
008a79d4	lsr x12,x8,#0x6
008a79d8	ldr x12,[x9, x12, LSL #0x3]
008a79dc	lsr x12,x12,x8
008a79e0	tbnz w12,#0x0,0x008a79bc
008a79e4	mov x0,xzr
008a79e8	ret
008a79ec	add x8,x10,x8, LSL #0x4
008a79f0	mov x0,xzr
008a79f4	ldr x8,[x8, #0x8]
008a79f8	cbz x8,0x008a79e8
008a79fc	adrp x9,0xd1b000
008a7a00	ldr w10,[x8, #0x8]
008a7a04	ldr w9,[x9, #0x250]
008a7a08	cmp w10,w9
008a7a0c	b.ne 0x008a79e8
008a7a10	ldr x0,[x8, #0x30]
008a7a14	ret
