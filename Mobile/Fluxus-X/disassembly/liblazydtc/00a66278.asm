; evp_keymgmt_util_query_operation_name @ 00a66278
00a66278	str x19,[sp, #-0x20]!
00a6627c	stp x29,x30,[sp, #0x10]
00a66280	add x29,sp,#0x10
00a66284	cbz x0,0x00a662a0
00a66288	ldr x8,[x0, #0x98]
00a6628c	mov x19,x0
00a66290	cbz x8,0x00a662ac
00a66294	mov w0,w1
00a66298	blr x8
00a6629c	cbz x0,0x00a662ac
00a662a0	ldp x29,x30,[sp, #0x10]
00a662a4	ldr x19,[sp], #0x20
00a662a8	ret
00a662ac	ldp x29,x30,[sp, #0x10]
00a662b0	mov x0,x19
00a662b4	ldr x19,[sp], #0x20
00a662b8	b 0x00c3bf30
