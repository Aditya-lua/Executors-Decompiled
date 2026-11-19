; FUN_00b44a48 @ 00b44a48
00b44a48	sub sp,sp,#0xb0
00b44a4c	stp x28,x27,[sp, #0x50]
00b44a50	stp x26,x25,[sp, #0x60]
00b44a54	stp x24,x23,[sp, #0x70]
00b44a58	stp x22,x21,[sp, #0x80]
00b44a5c	stp x20,x19,[sp, #0x90]
00b44a60	stp x29,x30,[sp, #0xa0]
00b44a64	mov x24,x0
00b44a68	ldr x0,[x0]
00b44a6c	add x29,sp,#0xa0
00b44a70	mov x22,x3
00b44a74	mov x19,x2
00b44a78	mov x20,x1
00b44a7c	bl 0x00c41210
00b44a80	mov x21,x0
00b44a84	bl 0x00c41000
00b44a88	cbz w0,0x00b44b58
00b44a8c	mov x0,x24
00b44a90	mov x1,x22
00b44a94	bl 0x00b44c74
00b44a98	cbz w0,0x00b44b58
00b44a9c	add x0,x24,#0x10
00b44aa0	bl 0x00c41160
00b44aa4	cbz x0,0x00b44b04
00b44aa8	ldr x23,[x24, #0x38]
00b44aac	cbz x23,0x00b44b2c
00b44ab0	cbz x19,0x00b44b80
00b44ab4	ldr w8,[x24, #0x8]
00b44ab8	mov x22,x0
00b44abc	cmp w8,#0x1
00b44ac0	b.eq 0x00b44bb0
00b44ac4	cmp w8,#0x2
00b44ac8	b.ne 0x00b44bec
00b44acc	ldr x2,[x24, #0x40]
00b44ad0	ldp x3,x4,[x24, #0x78]
00b44ad4	mov x0,x22
00b44ad8	mov x1,x23
00b44adc	mov x5,x20
00b44ae0	mov x6,x19
00b44ae4	ldp x29,x30,[sp, #0xa0]
00b44ae8	ldp x20,x19,[sp, #0x90]
00b44aec	ldp x22,x21,[sp, #0x80]
00b44af0	ldp x24,x23,[sp, #0x70]
00b44af4	ldp x26,x25,[sp, #0x60]
00b44af8	ldp x28,x27,[sp, #0x50]
00b44afc	add sp,sp,#0xb0
00b44b00	b 0x00b452cc
00b44b04	bl 0x00c342a0
00b44b08	adrp x0,0x2be000
00b44b0c	adrp x2,0x2cc000
00b44b10	add x0,x0,#0xa28
00b44b14	add x2,x2,#0x6ef
00b44b18	mov w1,#0xa1
00b44b1c	bl 0x00c342b0
00b44b20	mov w0,#0x39
00b44b24	mov w1,#0x81
00b44b28	b 0x00b44b50
00b44b2c	bl 0x00c342a0
00b44b30	adrp x0,0x2be000
00b44b34	adrp x2,0x2cc000
00b44b38	add x0,x0,#0xa28
00b44b3c	add x2,x2,#0x6ef
00b44b40	mov w1,#0xa5
00b44b44	bl 0x00c342b0
00b44b48	mov w0,#0x39
00b44b4c	mov w1,#0x80
00b44b50	mov x2,xzr
00b44b54	bl 0x00c342c0
00b44b58	mov w19,wzr
00b44b5c	mov w0,w19
00b44b60	ldp x29,x30,[sp, #0xa0]
00b44b64	ldp x20,x19,[sp, #0x90]
00b44b68	ldp x22,x21,[sp, #0x80]
00b44b6c	ldp x24,x23,[sp, #0x70]
00b44b70	ldp x26,x25,[sp, #0x60]
00b44b74	ldp x28,x27,[sp, #0x50]
00b44b78	add sp,sp,#0xb0
00b44b7c	ret
00b44b80	bl 0x00c342a0
00b44b84	adrp x0,0x2be000
00b44b88	adrp x2,0x2cc000
00b44b8c	add x0,x0,#0xa28
00b44b90	add x2,x2,#0x6ef
00b44b94	mov w1,#0xa9
00b44b98	bl 0x00c342b0
00b44b9c	mov w0,#0x39
00b44ba0	mov w1,#0x69
00b44ba4	mov x2,xzr
00b44ba8	bl 0x00c342c0
00b44bac	b 0x00b44b5c
00b44bb0	ldp x2,x3,[x24, #0x28]
00b44bb4	ldr x5,[x24, #0x40]
00b44bb8	mov x0,x21
00b44bbc	mov x1,x22
00b44bc0	mov x4,x23
00b44bc4	mov x6,x20
00b44bc8	mov x7,x19
00b44bcc	ldp x29,x30,[sp, #0xa0]
00b44bd0	ldp x20,x19,[sp, #0x90]
00b44bd4	ldp x22,x21,[sp, #0x80]
00b44bd8	ldp x24,x23,[sp, #0x70]
00b44bdc	ldp x26,x25,[sp, #0x60]
00b44be0	ldp x28,x27,[sp, #0x50]
00b44be4	add sp,sp,#0xb0
00b44be8	b 0x00b451d8
00b44bec	ldp x26,x27,[x24, #0x28]
00b44bf0	ldr x28,[x24, #0x40]
00b44bf4	ldp x25,x24,[x24, #0x78]
00b44bf8	mov x0,x22
00b44bfc	bl 0x00c34c20
00b44c00	tbnz w0,#0x1f,0x00b44b58
00b44c04	str x24,[sp, #0x8]
00b44c08	sxtw x24,w0
00b44c0c	add x6,sp,#0x10
00b44c10	mov x0,x21
00b44c14	mov x1,x22
00b44c18	mov x2,x26
00b44c1c	mov x3,x27
00b44c20	mov x4,x23
00b44c24	mov x5,x28
00b44c28	mov x7,x24
00b44c2c	bl 0x00b451d8
00b44c30	cbz w0,0x00b44b58
00b44c34	ldr x4,[sp, #0x8]
00b44c38	add x1,sp,#0x10
00b44c3c	mov x0,x22
00b44c40	mov x2,x24
00b44c44	mov x3,x25
00b44c48	mov x5,x20
00b44c4c	mov x6,x19
00b44c50	bl 0x00b452cc
00b44c54	mov w19,w0
00b44c58	add x0,sp,#0x10
00b44c5c	mov w1,#0x40
00b44c60	bl 0x00c34750
00b44c64	b 0x00b44b5c
