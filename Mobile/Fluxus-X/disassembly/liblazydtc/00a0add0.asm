; BN_rshift @ 00a0add0
00a0add0	str x23,[sp, #-0x40]!
00a0add4	stp x22,x21,[sp, #0x10]
00a0add8	stp x20,x19,[sp, #0x20]
00a0addc	stp x29,x30,[sp, #0x30]
00a0ade0	add x29,sp,#0x30
00a0ade4	tbnz w2,#0x1f,0x00a0ae9c
00a0ade8	ldr w8,[x1, #0x8]
00a0adec	lsr w23,w2,#0x6
00a0adf0	mov w22,w2
00a0adf4	mov x20,x1
00a0adf8	mov x19,x0
00a0adfc	subs w21,w8,w23
00a0ae00	b.le 0x00a0aed0
00a0ae04	cmp x19,x20
00a0ae08	b.eq 0x00a0ae1c
00a0ae0c	mov x0,x19
00a0ae10	mov w1,w21
00a0ae14	bl 0x00c38e80
00a0ae18	cbz x0,0x00a0aefc
00a0ae1c	ldr x14,[x20]
00a0ae20	ldr x8,[x19]
00a0ae24	subs w12,w21,#0x1
00a0ae28	and w9,w22,#0x3f
00a0ae2c	ldr x10,[x14, w23, UXTW #0x3]
00a0ae30	mov x11,xzr
00a0ae34	b.le 0x00a0ae84
00a0ae38	neg w13,w22
00a0ae3c	mov w15,w23
00a0ae40	and w13,w13,#0x3f
00a0ae44	add x15,x14,x15, LSL #0x3
00a0ae48	neg x14,x13
00a0ae4c	sxtw x12,w12
00a0ae50	orr x14,x14,x14, LSR #0x8
00a0ae54	add x15,x15,#0x8
00a0ae58	lsl x17,x11,#0x3
00a0ae5c	mov x16,x10
00a0ae60	ldr x10,[x15, x17#0x0]
00a0ae64	lsr x16,x16,x9
00a0ae68	add x11,x11,#0x1
00a0ae6c	cmp x11,x12
00a0ae70	lsl x18,x10,x13
00a0ae74	and x18,x18,x14
00a0ae78	orr x16,x18,x16
00a0ae7c	str x16,[x8, x17#0x0]
00a0ae80	b.lt 0x00a0ae58
00a0ae84	lsr x9,x10,x9
00a0ae88	str x9,[x8, x11, LSL #0x3]
00a0ae8c	ldr w8,[x20, #0x10]
00a0ae90	str w21,[x19, #0x8]
00a0ae94	str w8,[x19, #0x10]
00a0ae98	b 0x00a0aed8
00a0ae9c	bl 0x00c342a0
00a0aea0	adrp x0,0x2ad000
00a0aea4	adrp x2,0x2a3000
00a0aea8	add x0,x0,#0xa3b
00a0aeac	add x2,x2,#0xe4d
00a0aeb0	mov w1,#0x9b
00a0aeb4	bl 0x00c342b0
00a0aeb8	orr w0,wzr,#0x3
00a0aebc	mov w1,#0x77
00a0aec0	mov x2,xzr
00a0aec4	bl 0x00c342c0
00a0aec8	mov w20,wzr
00a0aecc	b 0x00a0aee4
00a0aed0	mov x0,x19
00a0aed4	bl 0x00c38e00
00a0aed8	mov w20,#0x1
00a0aedc	mov x0,x19
00a0aee0	bl 0x00c38e40
00a0aee4	mov w0,w20
00a0aee8	ldp x29,x30,[sp, #0x30]
00a0aeec	ldp x20,x19,[sp, #0x20]
00a0aef0	ldp x22,x21,[sp, #0x10]
00a0aef4	ldr x23,[sp], #0x40
00a0aef8	ret
00a0aefc	mov w20,wzr
00a0af00	b 0x00a0aedc
