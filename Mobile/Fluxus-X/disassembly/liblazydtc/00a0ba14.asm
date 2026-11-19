; BUF_MEM_grow @ 00a0ba14
00a0ba14	stp x22,x21,[sp, #-0x30]!
00a0ba18	stp x20,x19,[sp, #0x10]
00a0ba1c	stp x29,x30,[sp, #0x20]
00a0ba20	ldr x8,[x0]
00a0ba24	mov x20,x0
00a0ba28	mov x19,x1
00a0ba2c	add x29,sp,#0x20
00a0ba30	cmp x8,x1
00a0ba34	b.cs 0x00a0bb28
00a0ba38	ldr x9,[x20, #0x10]
00a0ba3c	cmp x9,x19
00a0ba40	b.cs 0x00a0ba70
00a0ba44	mov w8,#0xfffd
00a0ba48	movk w8,#0x5fff, LSL #16
00a0ba4c	cmp x19,x8
00a0ba50	b.cc 0x00a0ba80
00a0ba54	bl 0x00c342a0
00a0ba58	adrp x0,0x29f000
00a0ba5c	adrp x2,0x2a5000
00a0ba60	add x0,x0,#0xf43
00a0ba64	add x2,x2,#0xca6
00a0ba68	mov w1,#0x5a
00a0ba6c	b 0x00a0bb58
00a0ba70	ldr x9,[x20, #0x8]
00a0ba74	cbz x9,0x00a0bb28
00a0ba78	add x0,x9,x8
00a0ba7c	b 0x00a0bb1c
00a0ba80	mov w10,#0xaaab
00a0ba84	add w8,w19,#0x3
00a0ba88	ldrb w9,[x20, #0x18]
00a0ba8c	movk w10,#0xaaaa, LSL #16
00a0ba90	umull x8,w8,w10
00a0ba94	lsr x8,x8,#0x1f
00a0ba98	and x21,x8,#0x1fffffffc
00a0ba9c	tbnz w9,#0x0,0x00a0bac0
00a0baa0	ldr x0,[x20, #0x8]
00a0baa4	adrp x2,0x29f000
00a0baa8	add x2,x2,#0xf43
00a0baac	mov w3,#0x61
00a0bab0	mov x1,x21
00a0bab4	bl 0x00c356f0
00a0bab8	mov x22,x0
00a0babc	b 0x00a0bb0c
00a0bac0	adrp x1,0x29f000
00a0bac4	add x1,x1,#0xf43
00a0bac8	orr w2,wzr,#0x3e
00a0bacc	mov x0,x21
00a0bad0	bl 0x00c39220
00a0bad4	mov x22,x0
00a0bad8	cbz x0,0x00a0bb0c
00a0badc	ldr x1,[x20, #0x8]
00a0bae0	cbz x1,0x00a0bb0c
00a0bae4	ldr x2,[x20]
00a0bae8	mov x0,x22
00a0baec	bl 0x00c2ffd0
00a0baf0	ldp x1,x0,[x20]
00a0baf4	adrp x2,0x29f000
00a0baf8	add x2,x2,#0xf43
00a0bafc	mov w3,#0x42
00a0bb00	bl 0x00c38e10
00a0bb04	str xzr,[x20, #0x8]
00a0bb08	b 0x00a0bb10
00a0bb0c	cbz x22,0x00a0bb40
00a0bb10	ldr x8,[x20]
00a0bb14	stp x22,x21,[x20, #0x8]
00a0bb18	add x0,x22,x8
00a0bb1c	sub x2,x19,x8
00a0bb20	mov w1,wzr
00a0bb24	bl 0x00c301c0
00a0bb28	str x19,[x20]
00a0bb2c	mov x0,x19
00a0bb30	ldp x29,x30,[sp, #0x20]
00a0bb34	ldp x20,x19,[sp, #0x10]
00a0bb38	ldp x22,x21,[sp], #0x30
00a0bb3c	ret
00a0bb40	bl 0x00c342a0
00a0bb44	adrp x0,0x29f000
00a0bb48	adrp x2,0x2a5000
00a0bb4c	add x0,x0,#0xf43
00a0bb50	add x2,x2,#0xca6
00a0bb54	mov w1,#0x63
00a0bb58	bl 0x00c342b0
00a0bb5c	mov w1,#0x100
00a0bb60	orr w0,wzr,#0x7
00a0bb64	movk w1,#0xc, LSL #16
00a0bb68	mov x2,xzr
00a0bb6c	bl 0x00c342c0
00a0bb70	mov x19,xzr
00a0bb74	b 0x00a0bb2c
