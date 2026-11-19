; CRYPTO_128_unwrap_pad @ 00aacb88
00aacb88	sub sp,sp,#0x90
00aacb8c	stp x26,x25,[sp, #0x40]
00aacb90	cmp x4,#0x10
00aacb94	mov x25,xzr
00aacb98	stp x28,x27,[sp, #0x30]
00aacb9c	stp x24,x23,[sp, #0x50]
00aacba0	stp x22,x21,[sp, #0x60]
00aacba4	stp x20,x19,[sp, #0x70]
00aacba8	stp x29,x30,[sp, #0x80]
00aacbac	add x29,sp,#0x80
00aacbb0	b.cc 0x00aacda0
00aacbb4	mov x19,x4
00aacbb8	and x8,x4,#-0x7ffffff9
00aacbbc	cbnz x8,0x00aacda0
00aacbc0	mov x23,x5
00aacbc4	mov x20,x2
00aacbc8	mov x22,x1
00aacbcc	mov x24,x0
00aacbd0	subs x26,x19,#0x10
00aacbd4	b.ne 0x00aacc0c
00aacbd8	add x1,sp,#0x20
00aacbdc	mov x0,x3
00aacbe0	mov x2,x24
00aacbe4	blr x23
00aacbe8	ldp x8,x9,[sp, #0x20]
00aacbec	add x0,sp,#0x20
00aacbf0	mov w1,#0x10
00aacbf4	str x8,[sp, #0x18]
00aacbf8	str x9,[x20]
00aacbfc	bl 0x00c34750
00aacc00	mov w21,#0x8
00aacc04	cbnz x22,0x00aaccfc
00aacc08	b 0x00aacd14
00aacc0c	sub x8,x19,#0x18
00aacc10	orr w9,wzr,#0x7ffffff0
00aacc14	cmp x8,x9
00aacc18	sub x21,x19,#0x8
00aacc1c	b.hi 0x00aacd84
00aacc20	and x9,x21,#0x7
00aacc24	mov x8,xzr
00aacc28	cbnz x9,0x00aaccf0
00aacc2c	str x26,[sp, #0x8]
00aacc30	ldr x8,[x3], #0x8
00aacc34	lsr x9,x21,#0x3
00aacc38	add x9,x9,x9, LSL #0x1
00aacc3c	mov x0,x20
00aacc40	mov x1,x3
00aacc44	mov x2,x21
00aacc48	lsl x25,x9,#0x1
00aacc4c	str x8,[sp, #0x20]
00aacc50	bl 0x00c2ff60
00aacc54	add x8,x20,x19
00aacc58	mov x27,xzr
00aacc5c	str x20,[sp, #0x10]
00aacc60	sub x20,x8,#0x10
00aacc64	mov x26,xzr
00aacc68	mov x28,x20
00aacc6c	ldrb w8,[sp, #0x27]
00aacc70	cmp x25,#0x100
00aacc74	eor w8,w8,w25
00aacc78	strb w8,[sp, #0x27]
00aacc7c	b.cc 0x00aacca4
00aacc80	ldrb w8,[sp, #0x26]
00aacc84	eor w8,w8,w25, LSR #0x8
00aacc88	strb w8,[sp, #0x26]
00aacc8c	ldrb w8,[sp, #0x25]
00aacc90	eor w8,w8,w25, LSR #0x10
00aacc94	strb w8,[sp, #0x25]
00aacc98	ldrb w8,[sp, #0x24]
00aacc9c	eor w8,w8,w25, LSR #0x18
00aacca0	strb w8,[sp, #0x24]
00aacca4	ldr x8,[x28]
00aacca8	add x0,sp,#0x20
00aaccac	add x1,sp,#0x20
00aaccb0	mov x2,x24
00aaccb4	str x8,[sp, #0x28]
00aaccb8	blr x23
00aaccbc	ldr x8,[sp, #0x28]
00aaccc0	add x26,x26,#0x8
00aaccc4	cmp x26,x21
00aaccc8	sub x25,x25,#0x1
00aacccc	str x8,[x28], #-0x8
00aaccd0	b.cc 0x00aacc6c
00aaccd4	add x27,x27,#0x1
00aaccd8	cmp x27,#0x6
00aaccdc	b.ne 0x00aacc64
00aacce0	ldr x8,[sp, #0x20]
00aacce4	ldp x26,x20,[sp, #0x8]
00aacce8	str x8,[sp, #0x18]
00aaccec	mov x8,x21
00aaccf0	cmp x21,x8
00aaccf4	b.ne 0x00aacd90
00aaccf8	cbz x22,0x00aacd14
00aaccfc	add x0,sp,#0x18
00aacd00	mov w2,#0x4
00aacd04	mov x1,x22
00aacd08	bl 0x00c362f0
00aacd0c	cbnz w0,0x00aacd90
00aacd10	b 0x00aacd2c
00aacd14	adrp x1,0x76e000
00aacd18	add x1,x1,#0xa20
00aacd1c	add x0,sp,#0x18
00aacd20	mov w2,#0x4
00aacd24	bl 0x00c362f0
00aacd28	cbnz w0,0x00aacd90
00aacd2c	ldrb w8,[sp, #0x1c]
00aacd30	ldrb w9,[sp, #0x1d]
00aacd34	ldrb w10,[sp, #0x1e]
00aacd38	ldrb w11,[sp, #0x1f]
00aacd3c	lsl x8,x8,#0x18
00aacd40	bfm x8,x9,#0x30,#0x7
00aacd44	bfm x8,x10,#0x38,#0x7
00aacd48	orr x25,x8,x11
00aacd4c	and x8,x26,#-0x8
00aacd50	cmp x8,x25
00aacd54	b.cs 0x00aacd90
00aacd58	sub x8,x19,#0x8
00aacd5c	and x8,x8,#-0x8
00aacd60	cmp x25,x8
00aacd64	b.hi 0x00aacd90
00aacd68	adrp x1,0xd22000
00aacd6c	sub x2,x21,x25
00aacd70	add x0,x20,x25
00aacd74	add x1,x1,#0x158
00aacd78	bl 0x00c362f0
00aacd7c	cbnz w0,0x00aacd90
00aacd80	b 0x00aacda0
00aacd84	mov x8,xzr
00aacd88	cmp x21,x8
00aacd8c	b.eq 0x00aaccf8
00aacd90	mov x0,x20
00aacd94	mov x1,x19
00aacd98	bl 0x00c34750
00aacd9c	mov x25,xzr
00aacda0	mov x0,x25
00aacda4	ldp x29,x30,[sp, #0x80]
00aacda8	ldp x20,x19,[sp, #0x70]
00aacdac	ldp x22,x21,[sp, #0x60]
00aacdb0	ldp x24,x23,[sp, #0x50]
00aacdb4	ldp x26,x25,[sp, #0x40]
00aacdb8	ldp x28,x27,[sp, #0x30]
00aacdbc	add sp,sp,#0x90
00aacdc0	ret
