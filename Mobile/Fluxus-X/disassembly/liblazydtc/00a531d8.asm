; ENGINE_register_all_ciphers @ 00a531d8
00a531d8	str x21,[sp, #-0x30]!
00a531dc	stp x20,x19,[sp, #0x10]
00a531e0	stp x29,x30,[sp, #0x20]
00a531e4	add x29,sp,#0x20
00a531e8	bl 0x00c32380
00a531ec	cbz x0,0x00a53254
00a531f0	adrp x20,0xd21000
00a531f4	adrp x21,0xa53000
00a531f8	mov x19,x0
00a531fc	add x20,x20,#0x9d8
00a53200	add x21,x21,#0x1cc
00a53204	ldr x8,[x19, #0x38]
00a53208	cbz x8,0x00a53244
00a5320c	add x2,sp,#0x8
00a53210	mov x0,x19
00a53214	mov x1,xzr
00a53218	mov w3,wzr
00a5321c	blr x8
00a53220	cmp w0,#0x0
00a53224	b.le 0x00a53244
00a53228	ldr x3,[sp, #0x8]
00a5322c	mov w4,w0
00a53230	mov x0,x20
00a53234	mov x1,x21
00a53238	mov x2,x19
00a5323c	mov w5,wzr
00a53240	bl 0x00c3bce0
00a53244	mov x0,x19
00a53248	bl 0x00c323a0
00a5324c	mov x19,x0
00a53250	cbnz x0,0x00a53204
00a53254	ldp x29,x30,[sp, #0x20]
00a53258	ldp x20,x19,[sp, #0x10]
00a5325c	ldr x21,[sp], #0x30
00a53260	ret
