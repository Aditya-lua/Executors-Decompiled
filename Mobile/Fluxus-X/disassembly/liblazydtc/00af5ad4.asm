; X509V3_get_d2i @ 00af5ad4
00af5ad4	str x25,[sp, #-0x50]!
00af5ad8	stp x20,x19,[sp, #0x30]
00af5adc	mov x20,x3
00af5ae0	mov x19,x2
00af5ae4	stp x24,x23,[sp, #0x10]
00af5ae8	stp x22,x21,[sp, #0x20]
00af5aec	stp x29,x30,[sp, #0x40]
00af5af0	add x29,sp,#0x40
00af5af4	cbz x0,0x00af5bac
00af5af8	mov w21,w1
00af5afc	mov x22,x0
00af5b00	cbz x20,0x00af5b14
00af5b04	ldr w8,[x20]
00af5b08	add w8,w8,#0x1
00af5b0c	bic w23,w8,w8, ASR #0x1f
00af5b10	b 0x00af5b18
00af5b14	mov w23,wzr
00af5b18	mov x0,x22
00af5b1c	bl 0x00c325e0
00af5b20	cmp w23,w0
00af5b24	b.ge 0x00af5bac
00af5b28	mov x25,xzr
00af5b2c	mov x0,x22
00af5b30	mov w1,w23
00af5b34	bl 0x00c32610
00af5b38	mov x24,x0
00af5b3c	bl 0x00c32b70
00af5b40	bl 0x00c37750
00af5b44	cmp w0,w21
00af5b48	b.ne 0x00af5b58
00af5b4c	cbnz x20,0x00af5ba4
00af5b50	cbz x25,0x00af5b5c
00af5b54	b 0x00af5be0
00af5b58	mov x24,x25
00af5b5c	mov x0,x22
00af5b60	add w23,w23,#0x1
00af5b64	bl 0x00c325e0
00af5b68	cmp w23,w0
00af5b6c	mov x25,x24
00af5b70	b.lt 0x00af5b2c
00af5b74	cbz x24,0x00af5bac
00af5b78	cbz x19,0x00af5b88
00af5b7c	mov x0,x24
00af5b80	bl 0x00c40890
00af5b84	str w0,[x19]
00af5b88	mov x0,x24
00af5b8c	ldp x29,x30,[sp, #0x40]
00af5b90	ldp x20,x19,[sp, #0x30]
00af5b94	ldp x22,x21,[sp, #0x20]
00af5b98	ldp x24,x23,[sp, #0x10]
00af5b9c	ldr x25,[sp], #0x50
00af5ba0	b 0x00af5a4c
00af5ba4	str w23,[x20]
00af5ba8	cbnz x24,0x00af5b78
00af5bac	cbz x20,0x00af5bb8
00af5bb0	mov w8,#0xffffffff
00af5bb4	str w8,[x20]
00af5bb8	cbz x19,0x00af5bc4
00af5bbc	mov w8,#0xffffffff
00af5bc0	str w8,[x19]
00af5bc4	ldp x29,x30,[sp, #0x40]
00af5bc8	ldp x20,x19,[sp, #0x30]
00af5bcc	ldp x22,x21,[sp, #0x20]
00af5bd0	ldp x24,x23,[sp, #0x10]
00af5bd4	mov x0,xzr
00af5bd8	ldr x25,[sp], #0x50
00af5bdc	ret
00af5be0	cbz x19,0x00af5bc4
00af5be4	orr w8,wzr,#0xfffffffe
00af5be8	b 0x00af5bc0
