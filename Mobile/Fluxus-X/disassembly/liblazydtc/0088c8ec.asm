; FUN_0088c8ec @ 0088c8ec
0088c8ec	stp x29,x30,[sp, #-0x50]!
0088c8f0	stp x26,x25,[sp, #0x10]
0088c8f4	stp x24,x23,[sp, #0x20]
0088c8f8	stp x22,x21,[sp, #0x30]
0088c8fc	stp x20,x19,[sp, #0x40]
0088c900	mov x29,sp
0088c904	mov x19,x1
0088c908	ldr x1,[x1, #0x28]
0088c90c	mov x20,x0
0088c910	add x0,x0,#0x148
0088c914	bl 0x0089acdc
0088c918	ldr x8,[x20, #0x170]
0088c91c	mov w21,w0
0088c920	cbz x8,0x0088c9d4
0088c924	ldr x8,[x19, #0x20]
0088c928	mov x11,#0x2d69
0088c92c	movk x11,#0xeb38, LSL #16
0088c930	lsl w9,w8,#0x3
0088c934	lsr x10,x8,#0x20
0088c938	movk x11,#0xea08, LSL #32
0088c93c	movk x11,#0x9ddf, LSL #48
0088c940	add x9,x9,#0x8
0088c944	eor x9,x9,x10
0088c948	mul x9,x9,x11
0088c94c	eor x10,x10,x9, LSR #0x2f
0088c950	eor x9,x10,x9
0088c954	mov x10,#0x959d
0088c958	mul x9,x9,x11
0088c95c	movk x10,#0xb8f4, LSL #16
0088c960	movk x10,#0xd34f, LSL #32
0088c964	movk x10,#0x949d, LSL #48
0088c968	eor x9,x9,x9, LSR #0x2f
0088c96c	mul x9,x9,x10
0088c970	ldrb w10,[x20, #0x178]
0088c974	lsr x10,x9,x10
0088c978	ldr x9,[x20, #0x160]
0088c97c	lsr x11,x10,#0x6
0088c980	ldr x11,[x9, x11, LSL #0x3]
0088c984	lsr x11,x11,x10
0088c988	tbz w11,#0x0,0x0088c9d4
0088c98c	ldr x12,[x20, #0x168]
0088c990	ldr x11,[x20, #0x148]
0088c994	mov w13,#0x30
0088c998	sub x12,x12,#0x1
0088c99c	madd x14,x10,x13,x11
0088c9a0	ldr x15,[x14]
0088c9a4	cmp x15,x8
0088c9a8	b.eq 0x0088c9c8
0088c9ac	add x10,x10,#0x1
0088c9b0	and x10,x10,x12
0088c9b4	lsr x14,x10,#0x6
0088c9b8	ldr x14,[x9, x14, LSL #0x3]
0088c9bc	lsr x14,x14,x10
0088c9c0	tbnz w14,#0x0,0x0088c99c
0088c9c4	b 0x0088c9d4
0088c9c8	ldr w8,[x14, #0x8]
0088c9cc	cmp w8,#0x2
0088c9d0	b.cs 0x0088cb54
0088c9d4	mov w25,wzr
0088c9d8	ldr w22,[x20, #0x64c]
0088c9dc	add w8,w22,#0x1
0088c9e0	cmp w8,#0x100
0088c9e4	b.cs 0x0088cb68
0088c9e8	ldr w9,[x20, #0x650]
0088c9ec	ldr x24,[x20, #0x688]
0088c9f0	ldr x26,[x20, #0x680]
0088c9f4	ldr x0,[x20]
0088c9f8	str w8,[x20, #0x64c]
0088c9fc	cmp w9,w8
0088ca00	csel w8,w9,w8,hi
0088ca04	str w8,[x20, #0x650]
0088ca08	bl 0x008769d0
0088ca0c	ldr x1,[x19, #0x20]
0088ca10	mov w23,w0
0088ca14	mov x0,x20
0088ca18	mov w2,w22
0088ca1c	mov w3,#0x1
0088ca20	bl 0x0088d1d0
0088ca24	ldr x1,[x19, #0x60]
0088ca28	mov x0,x20
0088ca2c	mov w2,w22
0088ca30	mov w3,w23
0088ca34	bl 0x00884b7c
0088ca38	tbz w25,#0x0,0x0088ca44
0088ca3c	mov x23,xzr
0088ca40	b 0x0088ca64
0088ca44	ldr x0,[x20]
0088ca48	bl 0x00875ec8
0088ca4c	mov x23,x0
0088ca50	ldr x0,[x20]
0088ca54	mov w1,#0x1a
0088ca58	mov w2,w22
0088ca5c	mov w3,wzr
0088ca60	bl 0x00875cac
0088ca64	ldr x1,[x19, #0x28]
0088ca68	mov x0,x20
0088ca6c	bl 0x0088506c
0088ca70	sub x8,x24,x26
0088ca74	asr x24,x8,#0x3
0088ca78	tbnz w21,#0x0,0x0088ca88
0088ca7c	mov x0,x20
0088ca80	mov x1,x24
0088ca84	bl 0x008860c8
0088ca88	mov x0,x20
0088ca8c	mov x1,x24
0088ca90	bl 0x008862e0
0088ca94	str w22,[x20, #0x64c]
0088ca98	tbnz w25,#0x0,0x0088cb3c
0088ca9c	ldr x0,[x20]
0088caa0	ldr x24,[x19, #0x30]
0088caa4	bl 0x00875ec8
0088caa8	mov x22,x0
0088caac	cbz x24,0x0088cac0
0088cab0	tbz w21,#0x0,0x0088cad8
0088cab4	ldr x1,[x19, #0x30]
0088cab8	mov x0,x20
0088cabc	bl 0x0088506c
0088cac0	ldr x0,[x20]
0088cac4	mov x1,x23
0088cac8	mov x2,x22
0088cacc	bl 0x00875ed8
0088cad0	tbnz w0,#0x0,0x0088cb3c
0088cad4	b 0x0088cb80
0088cad8	ldr x0,[x20]
0088cadc	mov w1,#0x17
0088cae0	mov w2,wzr
0088cae4	mov w3,wzr
0088cae8	bl 0x00875cac
0088caec	ldr x0,[x20]
0088caf0	bl 0x00875ec8
0088caf4	ldr x1,[x19, #0x30]
0088caf8	mov x24,x0
0088cafc	mov x0,x20
0088cb00	bl 0x0088506c
0088cb04	ldr x0,[x20]
0088cb08	bl 0x00875ec8
0088cb0c	ldr x8,[x20]
0088cb10	mov x21,x0
0088cb14	mov x1,x23
0088cb18	mov x2,x24
0088cb1c	mov x0,x8
0088cb20	bl 0x00875ed8
0088cb24	tbz w0,#0x0,0x0088cb80
0088cb28	ldr x0,[x20]
0088cb2c	mov x1,x22
0088cb30	mov x2,x21
0088cb34	bl 0x00875ed8
0088cb38	tbz w0,#0x0,0x0088cb80
0088cb3c	ldp x20,x19,[sp, #0x40]
0088cb40	ldp x22,x21,[sp, #0x30]
0088cb44	ldp x24,x23,[sp, #0x20]
0088cb48	ldp x26,x25,[sp, #0x10]
0088cb4c	ldp x29,x30,[sp], #0x50
0088cb50	ret
0088cb54	b.ne 0x0088cb60
0088cb58	ldrb w25,[x14, #0x10]
0088cb5c	b 0x0088c9d8
0088cb60	mov w25,#0x1
0088cb64	b 0x0088c9d8
0088cb68	adrp x1,0x2d0000
0088cb6c	add x1,x1,#0xc00
0088cb70	add x0,x19,#0xc
0088cb74	mov w2,#0x1
0088cb78	mov w3,#0xff
0088cb7c	bl 0x0087fcd8
0088cb80	adrp x1,0x2ab000
0088cb84	add x1,x1,#0x47b
0088cb88	add x0,x19,#0xc
0088cb8c	bl 0x0087fcd8
