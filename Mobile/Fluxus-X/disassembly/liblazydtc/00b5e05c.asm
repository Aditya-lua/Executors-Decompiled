; FUN_00b5e05c @ 00b5e05c
00b5e05c	stp x20,x19,[sp, #-0x20]!
00b5e060	stp x29,x30,[sp, #0x10]
00b5e064	mov x19,x0
00b5e068	ldr x0,[x0, #0x8]
00b5e06c	adrp x20,0x2da000
00b5e070	add x20,x20,#0xc7f
00b5e074	mov w2,#0xa8
00b5e078	mov x1,x20
00b5e07c	add x29,sp,#0x10
00b5e080	bl 0x00c32310
00b5e084	ldr x0,[x19, #0x18]
00b5e088	bl 0x00c36370
00b5e08c	ldr x0,[x19, #0x10]
00b5e090	bl 0x00c41780
00b5e094	ldp x29,x30,[sp, #0x10]
00b5e098	mov w2,#0xab
00b5e09c	mov x0,x19
00b5e0a0	mov x1,x20
00b5e0a4	ldp x20,x19,[sp], #0x20
00b5e0a8	b 0x00c32310
