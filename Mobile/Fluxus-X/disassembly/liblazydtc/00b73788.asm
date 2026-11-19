; mbedtls_ctr_drbg_free @ 00b73788
00b73788	str x19,[sp, #-0x20]!
00b7378c	stp x29,x30,[sp, #0x10]
00b73790	add x29,sp,#0x10
00b73794	mov x19,x0
00b73798	cbz x0,0x00b737c0
00b7379c	add x0,x19,#0x28
00b737a0	bl 0x00c41910
00b737a4	mov w1,#0x158
00b737a8	mov x0,x19
00b737ac	bl 0x00c42220
00b737b0	mov w8,#0x2710
00b737b4	mov w9,#0xffffffff
00b737b8	str w8,[x19, #0x20]
00b737bc	str w9,[x19, #0x10]
00b737c0	ldp x29,x30,[sp, #0x10]
00b737c4	ldr x19,[sp], #0x20
00b737c8	ret
