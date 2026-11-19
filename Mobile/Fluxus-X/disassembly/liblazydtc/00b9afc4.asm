; mbedtls_ecdh_free @ 00b9afc4
00b9afc4	str x19,[sp, #-0x20]!
00b9afc8	stp x29,x30,[sp, #0x10]
00b9afcc	add x29,sp,#0x10
00b9afd0	mov x19,x0
00b9afd4	cbz x0,0x00b9b014
00b9afd8	ldr w8,[x19, #0x8]
00b9afdc	cmp w8,#0x1
00b9afe0	b.ne 0x00b9b00c
00b9afe4	add x0,x19,#0x10
00b9afe8	bl 0x00c426b0
00b9afec	add x0,x19,#0xd0
00b9aff0	bl 0x00c41bb0
00b9aff4	add x0,x19,#0xe0
00b9aff8	bl 0x00c42750
00b9affc	add x0,x19,#0x110
00b9b000	bl 0x00c42750
00b9b004	add x0,x19,#0x140
00b9b008	bl 0x00c41bb0
00b9b00c	strb wzr,[x19]
00b9b010	stp wzr,wzr,[x19, #0x4]
00b9b014	ldp x29,x30,[sp, #0x10]
00b9b018	ldr x19,[sp], #0x20
00b9b01c	ret
