; FUN_009bb060 @ 009bb060
009bb060	str x27,[sp, #-0x60]!
009bb064	stp x22,x21,[sp, #0x30]
009bb068	mov w21,w1
009bb06c	stp x26,x25,[sp, #0x10]
009bb070	stp x24,x23,[sp, #0x20]
009bb074	stp x20,x19,[sp, #0x40]
009bb078	stp x29,x30,[sp, #0x50]
009bb07c	add x29,sp,#0x50
009bb080	cbz x0,0x009bb160
009bb084	mov x19,x2
009bb088	mov x20,x0
009bb08c	cmn w21,#0x1
009bb090	b.eq 0x009bb0c0
009bb094	ldrb w8,[x20]
009bb098	cmp w8,#0x2d
009bb09c	b.eq 0x009bb0d4
009bb0a0	cmp w8,#0x2b
009bb0a4	b.ne 0x009bb0b0
009bb0a8	add x20,x20,#0x1
009bb0ac	sub w21,w21,#0x1
009bb0b0	mov w23,#0x1
009bb0b4	ldr x26,[x19, #0xa0]
009bb0b8	cbnz x26,0x009bb0e8
009bb0bc	b 0x009bb15c
009bb0c0	mov w23,#0x1
009bb0c4	mov w21,#0xffffffff
009bb0c8	ldr x26,[x19, #0xa0]
009bb0cc	cbnz x26,0x009bb0e8
009bb0d0	b 0x009bb15c
009bb0d4	mov w23,wzr
009bb0d8	add x20,x20,#0x1
009bb0dc	sub w21,w21,#0x1
009bb0e0	ldr x26,[x19, #0xa0]
009bb0e4	cbz x26,0x009bb15c
009bb0e8	ldr x8,[x19, #0x98]
009bb0ec	mov x25,xzr
009bb0f0	sxtw x22,w21
009bb0f4	add x24,x8,#0x10
009bb0f8	ldr w8,[x19]
009bb0fc	ldur w27,[x24, #-0x4]
009bb100	and w8,w8,w27
009bb104	tst w8,#0xc
009bb108	b.eq 0x009bb14c
009bb10c	cmn w21,#0x1
009bb110	b.eq 0x009bb13c
009bb114	ldur w8,[x24, #-0x8]
009bb118	cmp w8,w21
009bb11c	b.ne 0x009bb14c
009bb120	ldur x0,[x24, #-0x10]
009bb124	mov x1,x20
009bb128	mov x2,x22
009bb12c	bl 0x00c35ef0
009bb130	cbz w0,0x009bb17c
009bb134	ldr x26,[x19, #0xa0]
009bb138	b 0x009bb14c
009bb13c	ldur x0,[x24, #-0x10]
009bb140	mov x1,x20
009bb144	bl 0x00c301f0
009bb148	cbz w0,0x009bb180
009bb14c	add x25,x25,#0x1
009bb150	cmp x25,x26
009bb154	add x24,x24,#0x18
009bb158	b.cc 0x009bb0f8
009bb15c	mov w0,wzr
009bb160	ldp x29,x30,[sp, #0x50]
009bb164	ldp x20,x19,[sp, #0x40]
009bb168	ldp x22,x21,[sp, #0x30]
009bb16c	ldp x24,x23,[sp, #0x20]
009bb170	ldp x26,x25,[sp, #0x10]
009bb174	ldr x27,[sp], #0x60
009bb178	ret
009bb17c	ldur w27,[x24, #-0x4]
009bb180	ldr x10,[x19, #0x28]
009bb184	cbz x10,0x009bb1e4
009bb188	ldr x8,[x24]
009bb18c	and w9,w27,#0x1
009bb190	ands w11,w27,#0xf00
009bb194	eor w9,w9,w23
009bb198	b.eq 0x009bb1b4
009bb19c	cmp w11,#0x100
009bb1a0	b.eq 0x009bb1c4
009bb1a4	cmp w11,#0x200
009bb1a8	b.ne 0x009bb1e4
009bb1ac	mov w10,#0x80
009bb1b0	b 0x009bb1c8
009bb1b4	cbz w9,0x009bb1ec
009bb1b8	ldr x9,[x10]
009bb1bc	orr x8,x9,x8
009bb1c0	b 0x009bb1f4
009bb1c4	orr w10,wzr,#0x78
009bb1c8	ldr x10,[x19, x10#0x0]
009bb1cc	cmp w9,#0x0
009bb1d0	ldr w11,[x10]
009bb1d4	bic w9,w11,w8
009bb1d8	orr w8,w11,w8
009bb1dc	csel w8,w9,w8,eq
009bb1e0	str w8,[x10]
009bb1e4	mov w0,#0x1
009bb1e8	b 0x009bb160
009bb1ec	ldr x9,[x10]
009bb1f0	bic x8,x9,x8
009bb1f4	str x8,[x10]
009bb1f8	mov w0,#0x1
009bb1fc	b 0x009bb160
