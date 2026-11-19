; ssl_cert_set1_chain @ 009ac5f8
009ac5f8	str x21,[sp, #-0x30]!
009ac5fc	stp x20,x19,[sp, #0x10]
009ac600	mov x19,x1
009ac604	mov x20,x0
009ac608	stp x29,x30,[sp, #0x20]
009ac60c	add x29,sp,#0x20
009ac610	cbz x2,0x009ac640
009ac614	mov x0,x2
009ac618	bl 0x00c35070
009ac61c	cbz x0,0x009ac66c
009ac620	mov x21,x0
009ac624	mov x0,x20
009ac628	mov x1,x19
009ac62c	mov x2,x21
009ac630	bl 0x009ac504
009ac634	cbz w0,0x009ac658
009ac638	mov w0,#0x1
009ac63c	b 0x009ac66c
009ac640	mov x0,x20
009ac644	mov x1,x19
009ac648	ldp x29,x30,[sp, #0x20]
009ac64c	ldp x20,x19,[sp, #0x10]
009ac650	ldr x21,[sp], #0x30
009ac654	b 0x009ac504
009ac658	adrp x1,0xcb4000
009ac65c	ldr x1,[x1, #0xd88]
009ac660	mov x0,x21
009ac664	bl 0x00c32600
009ac668	mov w0,wzr
009ac66c	ldp x29,x30,[sp, #0x20]
009ac670	ldp x20,x19,[sp, #0x10]
009ac674	ldr x21,[sp], #0x30
009ac678	ret
