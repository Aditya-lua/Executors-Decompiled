; FUN_00a73ac0 @ 00a73ac0
00a73ac0	sub sp,sp,#0xd0
00a73ac4	stp x22,x21,[sp, #0xa0]
00a73ac8	stp x20,x19,[sp, #0xb0]
00a73acc	stp x29,x30,[sp, #0xc0]
00a73ad0	ldr x8,[x2, #0x20]
00a73ad4	mov w21,w0
00a73ad8	add x29,sp,#0xc0
00a73adc	mov x19,x2
00a73ae0	mov x0,x8
00a73ae4	mov x20,x1
00a73ae8	bl 0x00c37cd0
00a73aec	cmp w0,#0x6
00a73af0	b.eq 0x00a73b08
00a73af4	ldr x0,[x19, #0x20]
00a73af8	bl 0x00c37cd0
00a73afc	cmp w0,#0x390
00a73b00	mov w0,wzr
00a73b04	b.ne 0x00a73b6c
00a73b08	ldr x0,[x19, #0x20]
00a73b0c	bl 0x00c3d8d0
00a73b10	mov x22,x0
00a73b14	bl 0x00c3db80
00a73b18	cmp w0,#0x8
00a73b1c	b.cc 0x00a73b68
00a73b20	add x1,sp,#0x50
00a73b24	mov x2,sp
00a73b28	mov x0,x22
00a73b2c	bl 0x00c3db30
00a73b30	cbz w0,0x00a73b68
00a73b34	ldr x8,[sp, #0x38]
00a73b38	cbz x8,0x00a73b68
00a73b3c	ldr x9,[x19, #0x30]
00a73b40	mov w0,wzr
00a73b44	ldr w9,[x9, #0x8]
00a73b48	cmp w9,#0x2
00a73b4c	b.ne 0x00a73b6c
00a73b50	mov w0,w21
00a73b54	mov x1,x20
00a73b58	mov x2,x19
00a73b5c	str x8,[x19, #0x20]
00a73b60	bl 0x00a6fd84
00a73b64	b 0x00a73b6c
00a73b68	mov w0,wzr
00a73b6c	ldp x29,x30,[sp, #0xc0]
00a73b70	ldp x20,x19,[sp, #0xb0]
00a73b74	ldp x22,x21,[sp, #0xa0]
00a73b78	add sp,sp,#0xd0
00a73b7c	ret
