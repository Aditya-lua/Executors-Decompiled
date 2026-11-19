; tls_construct_cert_status @ 009e8c80
009e8c80	stp x20,x19,[sp, #-0x20]!
009e8c84	stp x29,x30,[sp, #0x10]
009e8c88	ldrsw x8,[x0, #0xa60]
009e8c8c	mov x19,x0
009e8c90	mov x20,x1
009e8c94	mov w2,#0x1
009e8c98	mov x0,x1
009e8c9c	mov x1,x8
009e8ca0	add x29,sp,#0x10
009e8ca4	bl 0x00c343a0
009e8ca8	cbz w0,0x009e8ccc
009e8cac	ldr x1,[x19, #0xa88]
009e8cb0	ldr x2,[x19, #0xa90]
009e8cb4	orr w3,wzr,#0x3
009e8cb8	mov x0,x20
009e8cbc	bl 0x00c36f70
009e8cc0	cbz w0,0x009e8ccc
009e8cc4	mov w0,#0x1
009e8cc8	b 0x009e8d04
009e8ccc	bl 0x00c342a0
009e8cd0	adrp x0,0x2bd000
009e8cd4	adrp x2,0x2d5000
009e8cd8	add x0,x0,#0x74c
009e8cdc	add x2,x2,#0xa76
009e8ce0	mov w1,#0xfcb
009e8ce4	bl 0x00c342b0
009e8ce8	mov w2,#0x103
009e8cec	mov w1,#0x50
009e8cf0	movk w2,#0xc, LSL #16
009e8cf4	mov x0,x19
009e8cf8	mov x3,xzr
009e8cfc	bl 0x00c34410
009e8d00	mov w0,wzr
009e8d04	ldp x29,x30,[sp, #0x10]
009e8d08	ldp x20,x19,[sp], #0x20
009e8d0c	ret
