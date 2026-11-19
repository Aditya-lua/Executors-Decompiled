; SSL_set_srp_server_param_pw @ 009c86c4
009c86c4	stp x24,x23,[sp, #-0x40]!
009c86c8	stp x22,x21,[sp, #0x10]
009c86cc	mov x22,x0
009c86d0	mov x0,x3
009c86d4	stp x20,x19,[sp, #0x20]
009c86d8	stp x29,x30,[sp, #0x30]
009c86dc	add x29,sp,#0x30
009c86e0	mov x20,x2
009c86e4	mov x21,x1
009c86e8	bl 0x00c36a70
009c86ec	mov w19,#0xffffffff
009c86f0	cbz x0,0x009c8764
009c86f4	mov x23,x0
009c86f8	ldr x0,[x0, #0x10]
009c86fc	bl 0x00c369a0
009c8700	str x0,[x22, #0xbf8]
009c8704	ldr x0,[x23, #0x8]
009c8708	bl 0x00c369a0
009c870c	ldr x8,[x22, #0xc30]
009c8710	str x0,[x22, #0xc00]
009c8714	add x23,x22,#0xc30
009c8718	mov x0,x8
009c871c	bl 0x00c322e0
009c8720	ldr x0,[x22, #0xc08]
009c8724	str xzr,[x22, #0xc30]
009c8728	add x24,x22,#0xc08
009c872c	bl 0x00c322e0
009c8730	ldr x8,[x22, #0x9a8]
009c8734	str xzr,[x22, #0xc08]
009c8738	ldr x4,[x22, #0xbf8]
009c873c	ldr x5,[x22, #0xc00]
009c8740	ldr x6,[x8]
009c8744	ldr x7,[x8, #0x440]
009c8748	mov x0,x21
009c874c	mov x1,x20
009c8750	mov x2,x24
009c8754	mov x3,x23
009c8758	bl 0x00c36a60
009c875c	cmp w0,#0x0
009c8760	cneg w19,w19,ne
009c8764	mov w0,w19
009c8768	ldp x29,x30,[sp, #0x30]
009c876c	ldp x20,x19,[sp, #0x20]
009c8770	ldp x22,x21,[sp, #0x10]
009c8774	ldp x24,x23,[sp], #0x40
009c8778	ret
