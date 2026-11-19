; FUN_00ae79ec @ 00ae79ec
00ae79ec	str x28,[sp, #-0x40]!
00ae79f0	stp x22,x21,[sp, #0x10]
00ae79f4	stp x20,x19,[sp, #0x20]
00ae79f8	stp x29,x30,[sp, #0x30]
00ae79fc	add x29,sp,#0x30
00ae7a00	sub sp,sp,#0x9d0
00ae7a04	cbz x0,0x00ae7b0c
00ae7a08	mov x21,x1
00ae7a0c	mov x19,x0
00ae7a10	bl 0x00c325e0
00ae7a14	cmp w0,#0x1
00ae7a18	b.lt 0x00ae7a54
00ae7a1c	mov w20,wzr
00ae7a20	mov x0,x19
00ae7a24	mov w1,w20
00ae7a28	bl 0x00c32610
00ae7a2c	mov x22,x0
00ae7a30	ldr x0,[x0]
00ae7a34	mov x1,x21
00ae7a38	bl 0x00c301f0
00ae7a3c	cbz w0,0x00ae7ad8
00ae7a40	mov x0,x19
00ae7a44	add w20,w20,#0x1
00ae7a48	bl 0x00c325e0
00ae7a4c	cmp w20,w0
00ae7a50	b.lt 0x00ae7a20
00ae7a54	adrp x1,0x2ce000
00ae7a58	add x1,x1,#0x365
00ae7a5c	mov w0,#0x10
00ae7a60	mov w2,#0x13c
00ae7a64	bl 0x00c32320
00ae7a68	cbz x0,0x00ae7b08
00ae7a6c	mov x20,x0
00ae7a70	add x0,sp,#0xc
00ae7a74	mov x1,x21
00ae7a78	bl 0x00ae8258
00ae7a7c	tbnz w0,#0x1f,0x00ae7af4
00ae7a80	adrp x1,0x2ce000
00ae7a84	mov w22,w0
00ae7a88	add x1,x1,#0x365
00ae7a8c	mov w2,#0x145
00ae7a90	mov x0,x21
00ae7a94	bl 0x00c34600
00ae7a98	str x0,[x20]
00ae7a9c	cbz x0,0x00ae7af4
00ae7aa0	add x0,sp,#0xc
00ae7aa4	mov w1,w22
00ae7aa8	mov x2,xzr
00ae7aac	bl 0x00c36970
00ae7ab0	str x0,[x20, #0x8]
00ae7ab4	cbz x0,0x00ae7ae0
00ae7ab8	mov x0,x19
00ae7abc	mov x1,x20
00ae7ac0	mov w2,wzr
00ae7ac4	bl 0x00c35890
00ae7ac8	cmp w0,#0x0
00ae7acc	b.le 0x00ae7b24
00ae7ad0	ldr x0,[x20, #0x8]
00ae7ad4	b 0x00ae7b0c
00ae7ad8	ldr x0,[x22, #0x8]
00ae7adc	b 0x00ae7b0c
00ae7ae0	ldr x0,[x20]
00ae7ae4	adrp x1,0x2ce000
00ae7ae8	add x1,x1,#0x365
00ae7aec	mov w2,#0x14b
00ae7af0	bl 0x00c32310
00ae7af4	adrp x1,0x2ce000
00ae7af8	add x1,x1,#0x365
00ae7afc	mov w2,#0x14d
00ae7b00	mov x0,x20
00ae7b04	bl 0x00c32310
00ae7b08	mov x0,xzr
00ae7b0c	add sp,sp,#0x9d0
00ae7b10	ldp x29,x30,[sp, #0x30]
00ae7b14	ldp x20,x19,[sp, #0x20]
00ae7b18	ldp x22,x21,[sp, #0x10]
00ae7b1c	ldr x28,[sp], #0x40
00ae7b20	ret
00ae7b24	ldr x0,[x20]
00ae7b28	adrp x19,0x2ce000
00ae7b2c	add x19,x19,#0x365
00ae7b30	mov w2,#0x155
00ae7b34	mov x1,x19
00ae7b38	bl 0x00c32310
00ae7b3c	ldr x0,[x20, #0x8]
00ae7b40	bl 0x00c36290
00ae7b44	mov w2,#0x157
00ae7b48	mov x0,x20
00ae7b4c	mov x1,x19
00ae7b50	b 0x00ae7b04
