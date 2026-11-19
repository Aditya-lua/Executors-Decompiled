; PKCS7_SIGNER_INFO_sign @ 00ac09d0
00ac09d0	sub sp,sp,#0x50
00ac09d4	stp x23,xzr,[sp, #0x10]
00ac09d8	stp x22,x21,[sp, #0x20]
00ac09dc	stp x20,x19,[sp, #0x30]
00ac09e0	stp x29,x30,[sp, #0x40]
00ac09e4	str xzr,[sp, #0x8]
00ac09e8	ldr x8,[x0, #0x10]
00ac09ec	mov x20,x0
00ac09f0	ldr x21,[x0, #0x40]
00ac09f4	add x29,sp,#0x40
00ac09f8	ldr x0,[x8]
00ac09fc	bl 0x00c37750
00ac0a00	bl 0x00c324f0
00ac0a04	bl 0x00c35310
00ac0a08	cbz x0,0x00ac0b6c
00ac0a0c	mov x22,x0
00ac0a10	bl 0x00c31fa0
00ac0a14	mov x19,x0
00ac0a18	cbz x0,0x00ac0b1c
00ac0a1c	mov x0,x22
00ac0a20	bl 0x00c36230
00ac0a24	mov x22,x0
00ac0a28	mov x0,x21
00ac0a2c	bl 0x00c3f7d0
00ac0a30	mov x23,x0
00ac0a34	mov x0,x21
00ac0a38	bl 0x00c3f7e0
00ac0a3c	ldr x5,[x20, #0x38]
00ac0a40	mov x4,x0
00ac0a44	add x1,sp,#0x18
00ac0a48	mov x0,x19
00ac0a4c	mov x2,x22
00ac0a50	mov x3,x23
00ac0a54	mov x6,xzr
00ac0a58	bl 0x00c361d0
00ac0a5c	cmp w0,#0x1
00ac0a60	b.lt 0x00ac0b4c
00ac0a64	ldr x21,[x20, #0x18]
00ac0a68	bl 0x00c3f620
00ac0a6c	mov x2,x0
00ac0a70	add x1,sp,#0x8
00ac0a74	mov x0,x21
00ac0a78	bl 0x00c36170
00ac0a7c	ldr x1,[sp, #0x8]
00ac0a80	cbz x1,0x00ac0b4c
00ac0a84	sxtw x2,w0
00ac0a88	mov x0,x19
00ac0a8c	bl 0x00c36d90
00ac0a90	cmp w0,#0x1
00ac0a94	b.lt 0x00ac0b4c
00ac0a98	ldr x0,[sp, #0x8]
00ac0a9c	adrp x1,0x29e000
00ac0aa0	add x1,x1,#0x913
00ac0aa4	mov w2,#0x3aa
00ac0aa8	bl 0x00c32310
00ac0aac	mov x2,sp
00ac0ab0	mov x0,x19
00ac0ab4	mov x1,xzr
00ac0ab8	str xzr,[sp, #0x8]
00ac0abc	bl 0x00c36d80
00ac0ac0	cmp w0,#0x1
00ac0ac4	b.lt 0x00ac0b4c
00ac0ac8	ldr x0,[sp]
00ac0acc	adrp x1,0x29e000
00ac0ad0	add x1,x1,#0x913
00ac0ad4	mov w2,#0x3ae
00ac0ad8	bl 0x00c32320
00ac0adc	str x0,[sp, #0x8]
00ac0ae0	cbz x0,0x00ac0b4c
00ac0ae4	mov x1,x0
00ac0ae8	mov x2,sp
00ac0aec	mov x0,x19
00ac0af0	bl 0x00c36d80
00ac0af4	cmp w0,#0x1
00ac0af8	b.lt 0x00ac0b4c
00ac0afc	mov x0,x19
00ac0b00	bl 0x00c31f90
00ac0b04	ldr x0,[x20, #0x28]
00ac0b08	ldr x1,[sp, #0x8]
00ac0b0c	ldr w2,[sp]
00ac0b10	bl 0x00c37be0
00ac0b14	mov w0,#0x1
00ac0b18	b 0x00ac0b6c
00ac0b1c	bl 0x00c342a0
00ac0b20	adrp x0,0x29e000
00ac0b24	adrp x2,0x2ce000
00ac0b28	add x0,x0,#0x913
00ac0b2c	add x2,x2,#0x1b3
00ac0b30	mov w1,#0x39a
00ac0b34	bl 0x00c342b0
00ac0b38	mov w1,#0x100
00ac0b3c	mov w0,#0x21
00ac0b40	movk w1,#0xc, LSL #16
00ac0b44	mov x2,xzr
00ac0b48	bl 0x00c342c0
00ac0b4c	ldr x0,[sp, #0x8]
00ac0b50	adrp x1,0x29e000
00ac0b54	add x1,x1,#0x913
00ac0b58	mov w2,#0x3bb
00ac0b5c	bl 0x00c32310
00ac0b60	mov x0,x19
00ac0b64	bl 0x00c31f90
00ac0b68	mov w0,wzr
00ac0b6c	ldp x29,x30,[sp, #0x40]
00ac0b70	ldp x20,x19,[sp, #0x30]
00ac0b74	ldp x22,x21,[sp, #0x20]
00ac0b78	ldr x23,[sp, #0x10]
00ac0b7c	add sp,sp,#0x50
00ac0b80	ret
