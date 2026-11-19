; SSL_SESSION_set1_ticket_appdata @ 009bedcc
009bedcc	str x21,[sp, #-0x30]!
009bedd0	stp x20,x19,[sp, #0x10]
009bedd4	stp x29,x30,[sp, #0x20]
009bedd8	mov x19,x0
009beddc	ldr x0,[x0, #0x378]
009bede0	mov x21,x1
009bede4	adrp x1,0x2db000
009bede8	mov x20,x2
009bedec	add x1,x1,#0xb17
009bedf0	mov w2,#0x565
009bedf4	add x29,sp,#0x20
009bedf8	bl 0x00c32310
009bedfc	str xzr,[x19, #0x380]
009bee00	cbz x21,0x009bee30
009bee04	cbz x20,0x009bee30
009bee08	adrp x2,0x2db000
009bee0c	add x2,x2,#0xb17
009bee10	mov w3,#0x56b
009bee14	mov x0,x21
009bee18	mov x1,x20
009bee1c	bl 0x00c345f0
009bee20	str x0,[x19, #0x378]
009bee24	cbz x0,0x009bee38
009bee28	str x20,[x19, #0x380]
009bee2c	b 0x009bee34
009bee30	str xzr,[x19, #0x378]
009bee34	mov w0,#0x1
009bee38	ldp x29,x30,[sp, #0x20]
009bee3c	ldp x20,x19,[sp, #0x10]
009bee40	ldr x21,[sp], #0x30
009bee44	ret
