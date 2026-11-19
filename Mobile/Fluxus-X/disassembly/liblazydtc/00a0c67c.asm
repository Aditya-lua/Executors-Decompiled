; CONF_get1_default_config_file @ 00a0c67c
00a0c67c	str x21,[sp, #-0x30]!
00a0c680	adrp x0,0x2bb000
00a0c684	add x0,x0,#0xa1f
00a0c688	stp x20,x19,[sp, #0x10]
00a0c68c	stp x29,x30,[sp, #0x20]
00a0c690	add x29,sp,#0x20
00a0c694	bl 0x00c395b0
00a0c698	cbz x0,0x00a0c6b8
00a0c69c	ldp x29,x30,[sp, #0x20]
00a0c6a0	ldp x20,x19,[sp, #0x10]
00a0c6a4	adrp x1,0x2c9000
00a0c6a8	add x1,x1,#0x604
00a0c6ac	mov w2,#0x27e
00a0c6b0	ldr x21,[sp], #0x30
00a0c6b4	b 0x00c34600
00a0c6b8	bl 0x00c39590
00a0c6bc	mov x19,x0
00a0c6c0	bl 0x00c2ff50
00a0c6c4	add x21,x0,#0xd
00a0c6c8	adrp x1,0x2c9000
00a0c6cc	add x1,x1,#0x604
00a0c6d0	mov w2,#0x285
00a0c6d4	mov x0,x21
00a0c6d8	bl 0x00c32320
00a0c6dc	mov x20,x0
00a0c6e0	cbz x0,0x00a0c70c
00a0c6e4	adrp x2,0x2cf000
00a0c6e8	adrp x4,0x2a9000
00a0c6ec	adrp x5,0x2bd000
00a0c6f0	add x2,x2,#0x237
00a0c6f4	add x4,x4,#0x1de
00a0c6f8	add x5,x5,#0x81d
00a0c6fc	mov x0,x20
00a0c700	mov x1,x21
00a0c704	mov x3,x19
00a0c708	bl 0x00c34d30
00a0c70c	mov x0,x20
00a0c710	ldp x29,x30,[sp, #0x20]
00a0c714	ldp x20,x19,[sp, #0x10]
00a0c718	ldr x21,[sp], #0x30
00a0c71c	ret
