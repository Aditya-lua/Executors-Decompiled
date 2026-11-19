; ssl_hmac_old_final @ 009c8068
009c8068	str x19,[sp, #-0x20]!
009c806c	stp x29,x30,[sp, #0x10]
009c8070	ldr x0,[x0, #0x8]
009c8074	add x29,sp,#0x10
009c8078	mov x19,x2
009c807c	sub x2,x29,#0x4
009c8080	bl 0x00c36920
009c8084	cmp w0,#0x1
009c8088	b.lt 0x009c80a0
009c808c	cbz x19,0x009c8098
009c8090	ldur w8,[x29, #-0x4]
009c8094	str x8,[x19]
009c8098	mov w0,#0x1
009c809c	b 0x009c80a4
009c80a0	mov w0,wzr
009c80a4	ldp x29,x30,[sp, #0x10]
009c80a8	ldr x19,[sp], #0x20
009c80ac	ret
