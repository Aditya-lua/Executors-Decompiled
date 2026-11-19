; FUN_00a72adc @ 00a72adc
00a72adc	sub sp,sp,#0x80
00a72ae0	stp x22,x21,[sp, #0x50]
00a72ae4	stp x20,x19,[sp, #0x60]
00a72ae8	stp x29,x30,[sp, #0x70]
00a72aec	ldr x8,[x2, #0x20]
00a72af0	mov w21,w0
00a72af4	add x29,sp,#0x70
00a72af8	mov x19,x2
00a72afc	mov x0,x8
00a72b00	mov x20,x1
00a72b04	bl 0x00c37cd0
00a72b08	cmp w0,#0x6
00a72b0c	b.eq 0x00a72b24
00a72b10	ldr x0,[x19, #0x20]
00a72b14	bl 0x00c37cd0
00a72b18	cmp w0,#0x390
00a72b1c	mov w0,wzr
00a72b20	b.ne 0x00a72b84
00a72b24	ldr x0,[x19, #0x20]
00a72b28	bl 0x00c3d8d0
00a72b2c	mov x22,x0
00a72b30	bl 0x00c3db80
00a72b34	cmp w0,#0x5
00a72b38	b.cc 0x00a72b80
00a72b3c	mov x1,sp
00a72b40	mov x0,x22
00a72b44	bl 0x00c3db40
00a72b48	cbz w0,0x00a72b80
00a72b4c	ldr x8,[sp, #0x20]
00a72b50	cbz x8,0x00a72b80
00a72b54	ldr x9,[x19, #0x30]
00a72b58	mov w0,wzr
00a72b5c	ldr w9,[x9, #0x8]
00a72b60	cmp w9,#0x2
00a72b64	b.ne 0x00a72b84
00a72b68	mov w0,w21
00a72b6c	mov x1,x20
00a72b70	mov x2,x19
00a72b74	str x8,[x19, #0x20]
00a72b78	bl 0x00a6fd84
00a72b7c	b 0x00a72b84
00a72b80	mov w0,wzr
00a72b84	ldp x29,x30,[sp, #0x70]
00a72b88	ldp x20,x19,[sp, #0x60]
00a72b8c	ldp x22,x21,[sp, #0x50]
00a72b90	add sp,sp,#0x80
00a72b94	ret
