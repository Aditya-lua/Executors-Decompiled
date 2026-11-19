; tls_parse_ctos_session_ticket @ 009d6e80
009d6e80	str x19,[sp, #-0x20]!
009d6e84	stp x29,x30,[sp, #0x10]
009d6e88	ldr x9,[x0, #0xae8]
009d6e8c	add x29,sp,#0x10
009d6e90	cbz x9,0x009d6eb0
009d6e94	ldr x8,[x1]
009d6e98	ldr w2,[x1, #0x8]
009d6e9c	ldr x3,[x0, #0xaf0]
009d6ea0	mov x19,x0
009d6ea4	mov x1,x8
009d6ea8	blr x9
009d6eac	cbz w0,0x009d6eb8
009d6eb0	mov w0,#0x1
009d6eb4	b 0x009d6ef0
009d6eb8	bl 0x00c342a0
009d6ebc	adrp x0,0x2d7000
009d6ec0	adrp x2,0x29d000
009d6ec4	add x0,x0,#0xae0
009d6ec8	add x2,x2,#0xebc
009d6ecc	mov w1,#0xfd
009d6ed0	bl 0x00c342b0
009d6ed4	mov w2,#0x103
009d6ed8	mov w1,#0x50
009d6edc	movk w2,#0xc, LSL #16
009d6ee0	mov x0,x19
009d6ee4	mov x3,xzr
009d6ee8	bl 0x00c34410
009d6eec	mov w0,wzr
009d6ef0	ldp x29,x30,[sp, #0x10]
009d6ef4	ldr x19,[sp], #0x20
009d6ef8	ret
