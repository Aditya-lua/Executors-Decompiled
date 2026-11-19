; OSSL_HTTP_adapt_proxy @ 00b1aeb4
00b1aeb4	stp x24,x23,[sp, #-0x40]!
00b1aeb8	stp x22,x21,[sp, #0x10]
00b1aebc	stp x20,x19,[sp, #0x20]
00b1aec0	mov x19,x2
00b1aec4	mov x20,x1
00b1aec8	mov x21,x0
00b1aecc	stp x29,x30,[sp, #0x30]
00b1aed0	add x29,sp,#0x30
00b1aed4	cbnz x0,0x00b1af24
00b1aed8	adrp x8,0x2d8000
00b1aedc	adrp x9,0x2d7000
00b1aee0	add x8,x8,#0xa5b
00b1aee4	add x9,x9,#0x4df
00b1aee8	cmp w3,#0x0
00b1aeec	csel x0,x9,x8,eq
00b1aef0	mov w22,w3
00b1aef4	bl 0x00c395b0
00b1aef8	mov x21,x0
00b1aefc	cbnz x0,0x00b1af24
00b1af00	adrp x8,0x2ca000
00b1af04	adrp x9,0x2b2000
00b1af08	add x8,x8,#0x6be
00b1af0c	add x9,x9,#0xe5a
00b1af10	cmp w22,#0x0
00b1af14	csel x0,x9,x8,eq
00b1af18	bl 0x00c395b0
00b1af1c	mov x21,x0
00b1af20	cbz x0,0x00b1afd8
00b1af24	cbz x19,0x00b1afd4
00b1af28	ldrb w8,[x21]
00b1af2c	mov x0,xzr
00b1af30	cbz w8,0x00b1afd8
00b1af34	mov x0,x19
00b1af38	bl 0x00c2ff50
00b1af3c	mov x22,x0
00b1af40	cbnz x20,0x00b1af6c
00b1af44	adrp x0,0x2af000
00b1af48	add x0,x0,#0x4fa
00b1af4c	bl 0x00c395b0
00b1af50	mov x20,x0
00b1af54	cbnz x0,0x00b1af6c
00b1af58	adrp x0,0x2d7000
00b1af5c	add x0,x0,#0x4d6
00b1af60	bl 0x00c395b0
00b1af64	mov x20,x0
00b1af68	cbz x0,0x00b1afcc
00b1af6c	mov x0,x20
00b1af70	mov x1,x19
00b1af74	bl 0x00c30c40
00b1af78	cbz x0,0x00b1afcc
00b1af7c	mov x24,#0x100000001
00b1af80	mov w23,#0x1
00b1af84	movk x24,#0x1001, LSL #32
00b1af88	cmp x0,x20
00b1af8c	b.eq 0x00b1afa4
00b1af90	ldurb w8,[x0, #-0x1]
00b1af94	cmp w8,#0x2c
00b1af98	b.eq 0x00b1afa4
00b1af9c	cmp w8,#0x20
00b1afa0	b.ne 0x00b1afbc
00b1afa4	ldrb w8,[x0, x22]
00b1afa8	cmp w8,#0x2c
00b1afac	b.hi 0x00b1afbc
00b1afb0	lsl x8,x23,x8
00b1afb4	tst x8,x24
00b1afb8	b.ne 0x00b1afd4
00b1afbc	add x0,x0,#0x1
00b1afc0	mov x1,x19
00b1afc4	bl 0x00c30c40
00b1afc8	cbnz x0,0x00b1af88
00b1afcc	mov x0,x21
00b1afd0	b 0x00b1afd8
00b1afd4	mov x0,xzr
00b1afd8	ldp x29,x30,[sp, #0x30]
00b1afdc	ldp x20,x19,[sp, #0x20]
00b1afe0	ldp x22,x21,[sp, #0x10]
00b1afe4	ldp x24,x23,[sp], #0x40
00b1afe8	ret
