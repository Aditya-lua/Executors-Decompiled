; SSL_CTX_use_certificate @ 009bbbc8
009bbbc8	str x21,[sp, #-0x30]!
009bbbcc	stp x20,x19,[sp, #0x10]
009bbbd0	stp x29,x30,[sp, #0x20]
009bbbd4	add x29,sp,#0x20
009bbbd8	cbz x1,0x009bbc1c
009bbbdc	mov x19,x1
009bbbe0	mov x21,x0
009bbbe4	mov w4,#0x1
009bbbe8	mov x0,xzr
009bbbec	mov x1,x21
009bbbf0	mov x2,x19
009bbbf4	mov w3,wzr
009bbbf8	bl 0x00c351a0
009bbbfc	cmp w0,#0x1
009bbc00	b.ne 0x009bbc48
009bbc04	ldr x0,[x21, #0x158]
009bbc08	mov x1,x19
009bbc0c	ldp x29,x30,[sp, #0x20]
009bbc10	ldp x20,x19,[sp, #0x10]
009bbc14	ldr x21,[sp], #0x30
009bbc18	b 0x009bb40c
009bbc1c	bl 0x00c342a0
009bbc20	adrp x0,0x2db000
009bbc24	adrp x2,0x2ad000
009bbc28	add x0,x0,#0xaec
009bbc2c	add x2,x2,#0x834
009bbc30	mov w1,#0xd7
009bbc34	bl 0x00c342b0
009bbc38	mov w1,#0x102
009bbc3c	mov w0,#0x14
009bbc40	movk w1,#0xc, LSL #16
009bbc44	b 0x009bbc70
009bbc48	mov w20,w0
009bbc4c	bl 0x00c342a0
009bbc50	adrp x0,0x2db000
009bbc54	adrp x2,0x2ad000
009bbc58	add x0,x0,#0xaec
009bbc5c	add x2,x2,#0x834
009bbc60	mov w1,#0xdd
009bbc64	bl 0x00c342b0
009bbc68	mov w0,#0x14
009bbc6c	mov w1,w20
009bbc70	mov x2,xzr
009bbc74	bl 0x00c342c0
009bbc78	ldp x29,x30,[sp, #0x20]
009bbc7c	ldp x20,x19,[sp, #0x10]
009bbc80	mov w0,wzr
009bbc84	ldr x21,[sp], #0x30
009bbc88	ret
