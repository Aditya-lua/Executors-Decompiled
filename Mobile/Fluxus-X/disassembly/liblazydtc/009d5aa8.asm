; FUN_009d5aa8 @ 009d5aa8
009d5aa8	str x27,[sp, #-0x60]!
009d5aac	stp x26,x25,[sp, #0x10]
009d5ab0	stp x24,x23,[sp, #0x20]
009d5ab4	stp x22,x21,[sp, #0x30]
009d5ab8	stp x20,x19,[sp, #0x40]
009d5abc	stp x29,x30,[sp, #0x50]
009d5ac0	add x29,sp,#0x50
009d5ac4	mov x20,x1
009d5ac8	mov x21,x0
009d5acc	bl 0x00c34780
009d5ad0	cbz x0,0x009d5bc4
009d5ad4	adrp x27,0xcc8000
009d5ad8	mov x19,x0
009d5adc	adrp x26,0xcc8000
009d5ae0	add x27,x27,#0x518
009d5ae4	mov w1,#0x3a
009d5ae8	mov x0,x21
009d5aec	bl 0x00c30890
009d5af0	mov x22,x0
009d5af4	cbz x0,0x009d5b08
009d5af8	sub x23,x22,x21
009d5afc	ldr x25,[x26, #0x518]
009d5b00	cbnz x25,0x009d5b1c
009d5b04	b 0x009d5b8c
009d5b08	mov x0,x21
009d5b0c	bl 0x00c2ff50
009d5b10	mov x23,x0
009d5b14	ldr x25,[x26, #0x518]
009d5b18	cbz x25,0x009d5b8c
009d5b1c	mov x24,x27
009d5b20	mov x0,x25
009d5b24	bl 0x00c2ff50
009d5b28	cmp x0,x23
009d5b2c	b.ne 0x009d5b44
009d5b30	mov x0,x25
009d5b34	mov x1,x21
009d5b38	mov x2,x23
009d5b3c	bl 0x00c31bb0
009d5b40	cbz w0,0x009d5b50
009d5b44	ldr x25,[x24, #0x10]!
009d5b48	cbnz x25,0x009d5b20
009d5b4c	b 0x009d5b8c
009d5b50	mov x0,x19
009d5b54	mov x1,x24
009d5b58	bl 0x00c34760
009d5b5c	tbz w0,#0x1f,0x009d5c10
009d5b60	mov x0,x19
009d5b64	mov x1,x24
009d5b68	bl 0x00c347a0
009d5b6c	cbz w0,0x009d5c38
009d5b70	add x21,x22,#0x1
009d5b74	cbnz x22,0x009d5ae4
009d5b78	ldr x0,[x20]
009d5b7c	bl 0x00c34770
009d5b80	mov w0,wzr
009d5b84	str x19,[x20]
009d5b88	b 0x009d5bf4
009d5b8c	bl 0x00c342a0
009d5b90	adrp x0,0x2b9000
009d5b94	adrp x2,0x2ab000
009d5b98	add x0,x0,#0xa56
009d5b9c	add x2,x2,#0xd72
009d5ba0	mov w1,#0x5a
009d5ba4	bl 0x00c342b0
009d5ba8	mov w0,#0x14
009d5bac	mov w1,#0x16c
009d5bb0	mov x2,xzr
009d5bb4	bl 0x00c342c0
009d5bb8	mov x0,x19
009d5bbc	bl 0x00c34770
009d5bc0	b 0x009d5bf0
009d5bc4	bl 0x00c342a0
009d5bc8	adrp x0,0x2b9000
009d5bcc	adrp x2,0x2ab000
009d5bd0	add x0,x0,#0xa56
009d5bd4	add x2,x2,#0xd72
009d5bd8	mov w1,#0x47
009d5bdc	bl 0x00c342b0
009d5be0	mov w0,#0x14
009d5be4	mov w1,#0x16a
009d5be8	mov x2,xzr
009d5bec	bl 0x00c342c0
009d5bf0	mov w0,#0x1
009d5bf4	ldp x29,x30,[sp, #0x50]
009d5bf8	ldp x20,x19,[sp, #0x40]
009d5bfc	ldp x22,x21,[sp, #0x30]
009d5c00	ldp x24,x23,[sp, #0x20]
009d5c04	ldp x26,x25,[sp, #0x10]
009d5c08	ldr x27,[sp], #0x60
009d5c0c	ret
009d5c10	bl 0x00c342a0
009d5c14	adrp x0,0x2b9000
009d5c18	adrp x2,0x2ab000
009d5c1c	add x0,x0,#0xa56
009d5c20	add x2,x2,#0xd72
009d5c24	mov w1,#0x51
009d5c28	bl 0x00c342b0
009d5c2c	mov w0,#0x14
009d5c30	mov w1,#0x161
009d5c34	b 0x009d5bb0
009d5c38	bl 0x00c342a0
009d5c3c	adrp x0,0x2b9000
009d5c40	adrp x2,0x2ab000
009d5c44	add x0,x0,#0xa56
009d5c48	add x2,x2,#0xd72
009d5c4c	mov w1,#0x56
009d5c50	bl 0x00c342b0
009d5c54	mov w0,#0x14
009d5c58	mov w1,#0x16a
009d5c5c	b 0x009d5bb0
