; CONF_dump_bio @ 00a0d68c
00a0d68c	sub sp,sp,#0x60
00a0d690	str x21,[sp, #0x30]
00a0d694	adrp x21,0xd21000
00a0d698	ldr x8,[x21, #0x950]
00a0d69c	stp x20,x19,[sp, #0x40]
00a0d6a0	mov x19,x1
00a0d6a4	mov x20,x0
00a0d6a8	stp x29,x30,[sp, #0x50]
00a0d6ac	add x29,sp,#0x50
00a0d6b0	cbnz x8,0x00a0d6c0
00a0d6b4	bl 0x00c39420
00a0d6b8	mov x8,x0
00a0d6bc	str x0,[x21, #0x950]
00a0d6c0	ldr x8,[x8, #0x10]
00a0d6c4	mov x0,sp
00a0d6c8	blr x8
00a0d6cc	ldr x8,[sp]
00a0d6d0	str x20,[sp, #0x10]
00a0d6d4	mov x0,sp
00a0d6d8	mov x1,x19
00a0d6dc	ldr x8,[x8, #0x30]
00a0d6e0	blr x8
00a0d6e4	ldp x29,x30,[sp, #0x50]
00a0d6e8	ldp x20,x19,[sp, #0x40]
00a0d6ec	ldr x21,[sp, #0x30]
00a0d6f0	add sp,sp,#0x60
00a0d6f4	ret
