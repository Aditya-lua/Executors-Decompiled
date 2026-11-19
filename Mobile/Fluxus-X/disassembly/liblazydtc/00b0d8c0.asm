; X509_STORE_CTX_verify @ 00b0d8c0
00b0d8c0	str x19,[sp, #-0x20]!
00b0d8c4	stp x29,x30,[sp, #0x10]
00b0d8c8	add x29,sp,#0x10
00b0d8cc	cbz x0,0x00b0d90c
00b0d8d0	ldr x8,[x0, #0x8]
00b0d8d4	mov x19,x0
00b0d8d8	cbnz x8,0x00b0d8fc
00b0d8dc	ldr x0,[x19, #0x10]
00b0d8e0	bl 0x00c325e0
00b0d8e4	cmp w0,#0x1
00b0d8e8	b.lt 0x00b0d8fc
00b0d8ec	ldr x0,[x19, #0x10]
00b0d8f0	mov w1,wzr
00b0d8f4	bl 0x00c32610
00b0d8f8	str x0,[x19, #0x8]
00b0d8fc	ldp x29,x30,[sp, #0x10]
00b0d900	mov x0,x19
00b0d904	ldr x19,[sp], #0x20
00b0d908	b 0x00b0d94c
00b0d90c	bl 0x00c342a0
00b0d910	adrp x0,0x2a0000
00b0d914	adrp x2,0x29e000
00b0d918	add x0,x0,#0xe02
00b0d91c	add x2,x2,#0xcb6
00b0d920	mov w1,#0xfd
00b0d924	bl 0x00c342b0
00b0d928	mov w1,#0x102
00b0d92c	mov w0,#0xb
00b0d930	movk w1,#0xc, LSL #16
00b0d934	mov x2,xzr
00b0d938	bl 0x00c342c0
00b0d93c	ldp x29,x30,[sp, #0x10]
00b0d940	mov w0,#0xffffffff
00b0d944	ldr x19,[sp], #0x20
00b0d948	ret
