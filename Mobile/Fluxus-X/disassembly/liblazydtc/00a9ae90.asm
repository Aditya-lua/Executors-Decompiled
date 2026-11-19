; CRYPTO_secure_actual_size @ 00a9ae90
00a9ae90	stp x22,x21,[sp, #-0x30]!
00a9ae94	adrp x21,0xd22000
00a9ae98	ldr x8,[x21, #0xf8]
00a9ae9c	stp x20,x19,[sp, #0x10]
00a9aea0	mov x19,x0
00a9aea4	stp x29,x30,[sp, #0x20]
00a9aea8	mov x0,x8
00a9aeac	add x29,sp,#0x20
00a9aeb0	bl 0x00c356a0
00a9aeb4	cbz w0,0x00a9aefc
00a9aeb8	adrp x22,0xd22000
00a9aebc	add x22,x22,#0x108
00a9aec0	ldr x8,[x22, #0x10]
00a9aec4	cmp x8,x19
00a9aec8	b.hi 0x00a9af88
00a9aecc	ldr x9,[x22, #0x18]
00a9aed0	add x10,x8,x9
00a9aed4	cmp x10,x19
00a9aed8	b.ls 0x00a9af88
00a9aedc	ldp x11,x10,[x22, #0x28]
00a9aee0	add x9,x19,x9
00a9aee4	sub x8,x9,x8
00a9aee8	cmp x10,x8
00a9aeec	sub x20,x11,#0x1
00a9aef0	b.ls 0x00a9af04
00a9aef4	ldr x2,[x22, #0x38]
00a9aef8	b 0x00a9af38
00a9aefc	mov x19,xzr
00a9af00	b 0x00a9af5c
00a9af04	ldr x2,[x22, #0x38]
00a9af08	udiv x8,x8,x10
00a9af0c	mov w9,#0x1
00a9af10	lsr x10,x8,#0x3
00a9af14	ldrb w10,[x2, x10]
00a9af18	and x11,x8,#0x7
00a9af1c	lsl x11,x9,x11
00a9af20	tst x11,x10
00a9af24	b.ne 0x00a9af38
00a9af28	tbnz w8,#0x0,0x00a9af70
00a9af2c	lsr x8,x8,#0x1
00a9af30	sub x20,x20,#0x1
00a9af34	cbnz x8,0x00a9af10
00a9af38	mov x0,x19
00a9af3c	mov w1,w20
00a9af40	bl 0x00a9b18c
00a9af44	cbz w0,0x00a9afa0
00a9af48	ldr x8,[x22, #0x18]
00a9af4c	ldr x0,[x21, #0xf8]
00a9af50	and x9,x20,#0xffffffff
00a9af54	lsr x19,x8,x9
00a9af58	bl 0x00c35690
00a9af5c	mov x0,x19
00a9af60	ldp x29,x30,[sp, #0x20]
00a9af64	ldp x20,x19,[sp, #0x10]
00a9af68	ldp x22,x21,[sp], #0x30
00a9af6c	ret
00a9af70	adrp x0,0x2a4000
00a9af74	adrp x1,0x2d6000
00a9af78	add x0,x0,#0x3f8
00a9af7c	add x1,x1,#0xc
00a9af80	mov w2,#0x14c
00a9af84	bl 0x00c3c240
00a9af88	adrp x0,0x29e000
00a9af8c	adrp x1,0x2d6000
00a9af90	add x0,x0,#0x41c
00a9af94	add x1,x1,#0xc
00a9af98	mov w2,#0x2d2
00a9af9c	bl 0x00c3c240
00a9afa0	adrp x0,0x2ac000
00a9afa4	adrp x1,0x2d6000
00a9afa8	add x0,x0,#0x398
00a9afac	add x1,x1,#0xc
00a9afb0	mov w2,#0x2d6
00a9afb4	bl 0x00c3c240
