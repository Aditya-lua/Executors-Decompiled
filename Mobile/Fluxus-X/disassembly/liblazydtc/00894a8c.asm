; FUN_00894a8c @ 00894a8c
00894a8c	stp x29,x30,[sp, #-0x50]!
00894a90	stp x26,x25,[sp, #0x10]
00894a94	stp x24,x23,[sp, #0x20]
00894a98	stp x22,x21,[sp, #0x30]
00894a9c	stp x20,x19,[sp, #0x40]
00894aa0	mov x29,sp
00894aa4	ldp x21,x8,[x0, #0x8]
00894aa8	mov x19,x0
00894aac	sub x9,x8,x21
00894ab0	cmp x1,x9, ASR #0x4
00894ab4	b.ls 0x00894b10
00894ab8	ldr x20,[x19]
00894abc	sub x22,x21,x20
00894ac0	asr x25,x22,#0x4
00894ac4	add x9,x25,x1
00894ac8	lsr x10,x9,#0x3c
00894acc	cbnz x10,0x00894bb0
00894ad0	sub x21,x8,x20
00894ad4	orr x10,xzr,#0x7ffffffffffffff0
00894ad8	asr x8,x21,#0x3
00894adc	cmp x8,x9
00894ae0	csel x8,x8,x9,hi
00894ae4	cmp x21,x10
00894ae8	mov x9,#0xfffffffffffffff
00894aec	csel x23,x8,x9,cc
00894af0	cbz x23,0x00894b34
00894af4	lsr x8,x23,#0x3c
00894af8	cbnz x8,0x00894bb4
00894afc	lsl x0,x23,#0x4
00894b00	mov x24,x1
00894b04	bl 0x00c2fed0
00894b08	mov x1,x24
00894b0c	b 0x00894b38
00894b10	cbz x1,0x00894b2c
00894b14	lsl x20,x1,#0x4
00894b18	mov x0,x21
00894b1c	mov w1,wzr
00894b20	mov x2,x20
00894b24	bl 0x00c301c0
00894b28	add x21,x21,x20
00894b2c	str x21,[x19, #0x8]
00894b30	b 0x00894b98
00894b34	mov x0,xzr
00894b38	add x26,x0,x23, LSL #0x4
00894b3c	lsl x23,x1,#0x4
00894b40	add x24,x0,x22
00894b44	mov x0,x24
00894b48	mov w1,wzr
00894b4c	mov x2,x23
00894b50	bl 0x00c301c0
00894b54	sub x25,x24,x25, LSL #0x4
00894b58	mov x1,x20
00894b5c	mov x2,x22
00894b60	add x23,x24,x23
00894b64	mov x0,x25
00894b68	bl 0x00c2ffd0
00894b6c	stp x25,x23,[x19]
00894b70	str x26,[x19, #0x10]
00894b74	cbz x20,0x00894b98
00894b78	mov x0,x20
00894b7c	mov x1,x21
00894b80	ldp x20,x19,[sp, #0x40]
00894b84	ldp x22,x21,[sp, #0x30]
00894b88	ldp x24,x23,[sp, #0x20]
00894b8c	ldp x26,x25,[sp, #0x10]
00894b90	ldp x29,x30,[sp], #0x50
00894b94	b 0x00c2fe80
00894b98	ldp x20,x19,[sp, #0x40]
00894b9c	ldp x22,x21,[sp, #0x30]
00894ba0	ldp x24,x23,[sp, #0x20]
00894ba4	ldp x26,x25,[sp, #0x10]
00894ba8	ldp x29,x30,[sp], #0x50
00894bac	ret
00894bb0	bl 0x00894bb8
00894bb4	bl 0x007fe1b8
