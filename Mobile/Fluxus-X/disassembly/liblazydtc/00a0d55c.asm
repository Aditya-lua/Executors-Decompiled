; CONF_free @ 00a0d55c
00a0d55c	sub sp,sp,#0x50
00a0d560	stp x20,x19,[sp, #0x30]
00a0d564	adrp x20,0xd21000
00a0d568	ldr x8,[x20, #0x950]
00a0d56c	mov x19,x0
00a0d570	stp x29,x30,[sp, #0x40]
00a0d574	add x29,sp,#0x40
00a0d578	cbnz x8,0x00a0d588
00a0d57c	bl 0x00c39420
00a0d580	mov x8,x0
00a0d584	str x0,[x20, #0x950]
00a0d588	ldr x8,[x8, #0x10]
00a0d58c	mov x0,sp
00a0d590	blr x8
00a0d594	ldr x8,[sp]
00a0d598	str x19,[sp, #0x10]
00a0d59c	mov x0,sp
00a0d5a0	ldr x8,[x8, #0x20]
00a0d5a4	blr x8
00a0d5a8	ldp x29,x30,[sp, #0x40]
00a0d5ac	ldp x20,x19,[sp, #0x30]
00a0d5b0	add sp,sp,#0x50
00a0d5b4	ret
