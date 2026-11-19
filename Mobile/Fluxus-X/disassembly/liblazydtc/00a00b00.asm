; FUN_00a00b00 @ 00a00b00
00a00b00	stp x22,x21,[sp, #-0x30]!
00a00b04	stp x20,x19,[sp, #0x10]
00a00b08	stp x29,x30,[sp, #0x20]
00a00b0c	ldr w8,[x0, #0x30]
00a00b10	ldr x9,[x0, #0x40]
00a00b14	mov x19,x1
00a00b18	orr w1,wzr,#0xf
00a00b1c	tst w8,#0x200
00a00b20	cset w8,eq
00a00b24	ldr x22,[x9, w8, UXTW #0x3]
00a00b28	add x29,sp,#0x20
00a00b2c	mov w20,w2
00a00b30	mov x21,x0
00a00b34	bl 0x00c32190
00a00b38	ldr w8,[x22]
00a00b3c	sub w9,w20,#0x1
00a00b40	cmp w8,w20
00a00b44	csel w9,w8,w9,lt
00a00b48	cmp w9,#0x0
00a00b4c	b.le 0x00a00be4
00a00b50	ldr x8,[x22, #0x8]
00a00b54	mov x20,xzr
00a00b58	sxtw x9,w9
00a00b5c	cmp x20,x9
00a00b60	b.ge 0x00a00b74
00a00b64	ldrb w10,[x8, x20]
00a00b68	add x20,x20,#0x1
00a00b6c	cmp w10,#0xa
00a00b70	b.ne 0x00a00b5c
00a00b74	ldr w8,[x21, #0x30]
00a00b78	ldr x9,[x21, #0x40]
00a00b7c	orr w1,wzr,#0xf
00a00b80	mov x0,x21
00a00b84	tst w8,#0x200
00a00b88	cset w8,eq
00a00b8c	ldr x22,[x9, w8, UXTW #0x3]
00a00b90	bl 0x00c32190
00a00b94	tbnz w20,#0x1f,0x00a00bf0
00a00b98	ldr x8,[x22]
00a00b9c	cmp x8,w20, SXTW 
00a00ba0	csel w20,w8,w20,cc
00a00ba4	cbz x19,0x00a00bf4
00a00ba8	cmp w20,#0x1
00a00bac	b.lt 0x00a00bf4
00a00bb0	ldr x1,[x22, #0x8]
00a00bb4	sxtw x21,w20
00a00bb8	mov x0,x19
00a00bbc	mov x2,x21
00a00bc0	bl 0x00c2ffd0
00a00bc4	ldp x8,x10,[x22]
00a00bc8	ldr x9,[x22, #0x10]
00a00bcc	sub x8,x8,x21
00a00bd0	sub x9,x9,x21
00a00bd4	add x10,x10,x21
00a00bd8	stp x8,x10,[x22]
00a00bdc	str x9,[x22, #0x10]
00a00be0	b 0x00a00c24
00a00be4	mov w20,wzr
00a00be8	strb wzr,[x19]
00a00bec	b 0x00a00c28
00a00bf0	ldr x8,[x22]
00a00bf4	cbz x8,0x00a00c04
00a00bf8	cmp w20,#0x1
00a00bfc	b.ge 0x00a00c20
00a00c00	b 0x00a00c28
00a00c04	ldr w20,[x21, #0x38]
00a00c08	cbz w20,0x00a00c28
00a00c0c	mov w1,#0x9
00a00c10	mov x0,x21
00a00c14	bl 0x00c322a0
00a00c18	cmp w20,#0x1
00a00c1c	b.lt 0x00a00c28
00a00c20	sxtw x21,w20
00a00c24	strb wzr,[x19, x21]
00a00c28	mov w0,w20
00a00c2c	ldp x29,x30,[sp, #0x20]
00a00c30	ldp x20,x19,[sp, #0x10]
00a00c34	ldp x22,x21,[sp], #0x30
00a00c38	ret
