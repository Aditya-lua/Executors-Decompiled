; CONF_dump_fp @ 00a0d5cc
00a0d5cc	sub sp,sp,#0x60
00a0d5d0	stp x20,x19,[sp, #0x40]
00a0d5d4	mov x20,x0
00a0d5d8	mov x0,x1
00a0d5dc	mov w1,wzr
00a0d5e0	str x21,[sp, #0x30]
00a0d5e4	stp x29,x30,[sp, #0x50]
00a0d5e8	add x29,sp,#0x50
00a0d5ec	bl 0x00c37810
00a0d5f0	cbz x0,0x00a0d640
00a0d5f4	adrp x21,0xd21000
00a0d5f8	mov x19,x0
00a0d5fc	ldr x0,[x21, #0x950]
00a0d600	cbnz x0,0x00a0d60c
00a0d604	bl 0x00c39420
00a0d608	str x0,[x21, #0x950]
00a0d60c	ldr x8,[x0, #0x10]
00a0d610	mov x0,sp
00a0d614	blr x8
00a0d618	ldr x8,[sp]
00a0d61c	str x20,[sp, #0x10]
00a0d620	mov x0,sp
00a0d624	mov x1,x19
00a0d628	ldr x8,[x8, #0x30]
00a0d62c	blr x8
00a0d630	mov w20,w0
00a0d634	mov x0,x19
00a0d638	bl 0x00c31a40
00a0d63c	b 0x00a0d674
00a0d640	bl 0x00c342a0
00a0d644	adrp x0,0x2af000
00a0d648	adrp x2,0x2a2000
00a0d64c	add x0,x0,#0xd73
00a0d650	add x2,x2,#0x1d8
00a0d654	mov w1,#0x9d
00a0d658	bl 0x00c342b0
00a0d65c	mov w1,#0x7
00a0d660	orr w0,wzr,#0xe
00a0d664	movk w1,#0x8, LSL #16
00a0d668	mov x2,xzr
00a0d66c	bl 0x00c342c0
00a0d670	mov w20,wzr
00a0d674	mov w0,w20
00a0d678	ldp x29,x30,[sp, #0x50]
00a0d67c	ldp x20,x19,[sp, #0x40]
00a0d680	ldr x21,[sp, #0x30]
00a0d684	add sp,sp,#0x60
00a0d688	ret
