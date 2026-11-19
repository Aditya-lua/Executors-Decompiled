; ssl_do_client_cert_cb @ 009e0d0c
009e0d0c	str x21,[sp, #-0x30]!
009e0d10	stp x20,x19,[sp, #0x10]
009e0d14	stp x29,x30,[sp, #0x20]
009e0d18	ldr x8,[x0, #0x9a8]
009e0d1c	mov x19,x2
009e0d20	mov x20,x0
009e0d24	mov x21,x1
009e0d28	ldr x9,[x8, #0x200]
009e0d2c	add x29,sp,#0x20
009e0d30	cbz x9,0x009e0d4c
009e0d34	mov x0,x20
009e0d38	mov x1,x21
009e0d3c	mov x2,x19
009e0d40	bl 0x00c36960
009e0d44	cbnz w0,0x009e0d74
009e0d48	ldr x8,[x20, #0x9a8]
009e0d4c	ldr x3,[x8, #0xc8]
009e0d50	cbz x3,0x009e0d70
009e0d54	mov x0,x20
009e0d58	mov x2,x19
009e0d5c	ldp x29,x30,[sp, #0x20]
009e0d60	ldp x20,x19,[sp, #0x10]
009e0d64	mov x1,x21
009e0d68	ldr x21,[sp], #0x30
009e0d6c	br x3
009e0d70	mov w0,wzr
009e0d74	ldp x29,x30,[sp, #0x20]
009e0d78	ldp x20,x19,[sp, #0x10]
009e0d7c	ldr x21,[sp], #0x30
009e0d80	ret
