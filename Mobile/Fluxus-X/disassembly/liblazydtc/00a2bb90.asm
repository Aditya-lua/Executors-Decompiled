; BN_GF2m_poly2arr @ 00a2bb90
00a2bb90	str x21,[sp, #-0x30]!
00a2bb94	stp x20,x19,[sp, #0x10]
00a2bb98	stp x29,x30,[sp, #0x20]
00a2bb9c	add x29,sp,#0x20
00a2bba0	mov w20,w2
00a2bba4	mov x19,x1
00a2bba8	mov x21,x0
00a2bbac	bl 0x00c369b0
00a2bbb0	mov w8,w0
00a2bbb4	mov w0,wzr
00a2bbb8	cbnz w8,0x00a2bc38
00a2bbbc	ldrsw x8,[x21, #0x8]
00a2bbc0	cmp w8,#0x1
00a2bbc4	b.lt 0x00a2bc48
00a2bbc8	ldr x9,[x21]
00a2bbcc	mov w0,wzr
00a2bbd0	lsl w10,w8,#0x6
00a2bbd4	sub x11,x8,#0x1
00a2bbd8	ldr x12,[x9, x11, LSL #0x3]
00a2bbdc	cbz x12,0x00a2bc14
00a2bbe0	orr x13,xzr,#-0x8000000000000000
00a2bbe4	mov w14,#0xffffffff
00a2bbe8	tst x13,x12
00a2bbec	b.eq 0x00a2bc04
00a2bbf0	cmp w0,w20
00a2bbf4	b.ge 0x00a2bc00
00a2bbf8	add w15,w10,w14
00a2bbfc	str w15,[x19, w0, SXTW #0x2]
00a2bc00	add w0,w0,#0x1
00a2bc04	sub w14,w14,#0x1
00a2bc08	cmn w14,#0x41
00a2bc0c	lsr x13,x13,#0x1
00a2bc10	b.ne 0x00a2bbe8
00a2bc14	cmp x8,#0x1
00a2bc18	sub w10,w10,#0x40
00a2bc1c	mov x8,x11
00a2bc20	b.gt 0x00a2bbd4
00a2bc24	cmp w0,w20
00a2bc28	b.ge 0x00a2bc38
00a2bc2c	mov w8,#0xffffffff
00a2bc30	str w8,[x19, w0, SXTW #0x2]
00a2bc34	add w0,w0,#0x1
00a2bc38	ldp x29,x30,[sp, #0x20]
00a2bc3c	ldp x20,x19,[sp, #0x10]
00a2bc40	ldr x21,[sp], #0x30
00a2bc44	ret
00a2bc48	mov w0,wzr
00a2bc4c	cmp w0,w20
00a2bc50	b.lt 0x00a2bc2c
00a2bc54	b 0x00a2bc38
