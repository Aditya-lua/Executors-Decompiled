; FUN_00b25a1c @ 00b25a1c
00b25a1c	sub sp,sp,#0x30
00b25a20	stp x20,x19,[sp, #0x10]
00b25a24	stp x29,x30,[sp, #0x20]
00b25a28	add x29,sp,#0x20
00b25a2c	str wzr,[sp, #0xc]
00b25a30	cbz x1,0x00b25ae4
00b25a34	mov x20,x1
00b25a38	adrp x1,0x2c5000
00b25a3c	mov x19,x0
00b25a40	add x1,x1,#0xa75
00b25a44	mov x0,x20
00b25a48	bl 0x00c36530
00b25a4c	cbz x0,0x00b25a7c
00b25a50	ldrb w8,[x19, #0x4]
00b25a54	tbnz w8,#0x0,0x00b25ae4
00b25a58	ldr w8,[x0, #0x8]
00b25a5c	cmp w8,#0x5
00b25a60	b.ne 0x00b25aec
00b25a64	ldr x8,[x19, #0x68]
00b25a68	ldp x1,x2,[x0, #0x10]
00b25a6c	mov x0,x19
00b25a70	ldr x8,[x8, #0x18]
00b25a74	blr x8
00b25a78	cbz w0,0x00b25aec
00b25a7c	adrp x1,0x2af000
00b25a80	add x1,x1,#0xf4c
00b25a84	mov x0,x20
00b25a88	bl 0x00c36530
00b25a8c	cbz x0,0x00b25ab0
00b25a90	add x1,sp,#0xc
00b25a94	bl 0x00c36520
00b25a98	cbz w0,0x00b25b08
00b25a9c	ldr x8,[x19, #0x68]
00b25aa0	ldr w1,[sp, #0xc]
00b25aa4	mov x0,x19
00b25aa8	ldr x8,[x8, #0x10]
00b25aac	blr x8
00b25ab0	adrp x1,0x2bd000
00b25ab4	add x1,x1,#0xa97
00b25ab8	mov x0,x20
00b25abc	bl 0x00c36530
00b25ac0	cbz x0,0x00b25ae4
00b25ac4	mov x1,sp
00b25ac8	bl 0x00c3e920
00b25acc	cbz w0,0x00b25b24
00b25ad0	ldr x8,[sp]
00b25ad4	ldr x9,[x19, #0x8]
00b25ad8	mov w0,wzr
00b25adc	cmp x8,x9
00b25ae0	b.ne 0x00b25b54
00b25ae4	mov w0,#0x1
00b25ae8	b 0x00b25b54
00b25aec	bl 0x00c342a0
00b25af0	adrp x0,0x2c2000
00b25af4	adrp x2,0x2be000
00b25af8	add x0,x0,#0x99e
00b25afc	add x2,x2,#0x8b6
00b25b00	mov w1,#0xd8
00b25b04	b 0x00b25b3c
00b25b08	bl 0x00c342a0
00b25b0c	adrp x0,0x2c2000
00b25b10	adrp x2,0x2be000
00b25b14	add x0,x0,#0x99e
00b25b18	add x2,x2,#0x8b6
00b25b1c	mov w1,#0xdf
00b25b20	b 0x00b25b3c
00b25b24	bl 0x00c342a0
00b25b28	adrp x0,0x2c2000
00b25b2c	adrp x2,0x2be000
00b25b30	add x0,x0,#0x99e
00b25b34	add x2,x2,#0x8b6
00b25b38	mov w1,#0xe9
00b25b3c	bl 0x00c342b0
00b25b40	mov w0,#0x39
00b25b44	mov w1,#0x67
00b25b48	mov x2,xzr
00b25b4c	bl 0x00c342c0
00b25b50	mov w0,wzr
00b25b54	ldp x29,x30,[sp, #0x20]
00b25b58	ldp x20,x19,[sp, #0x10]
00b25b5c	add sp,sp,#0x30
00b25b60	ret
