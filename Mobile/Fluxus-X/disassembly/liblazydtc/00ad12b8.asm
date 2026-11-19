; BN_BLINDING_is_current_thread @ 00ad12b8
00ad12b8	str x19,[sp, #-0x20]!
00ad12bc	stp x29,x30,[sp, #0x10]
00ad12c0	add x29,sp,#0x10
00ad12c4	mov x19,x0
00ad12c8	bl 0x00c3ecb0
00ad12cc	ldr x1,[x19, #0x20]
00ad12d0	ldp x29,x30,[sp, #0x10]
00ad12d4	ldr x19,[sp], #0x20
00ad12d8	b 0x00c3eca0
