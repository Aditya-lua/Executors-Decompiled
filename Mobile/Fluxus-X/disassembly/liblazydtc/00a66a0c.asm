; EVP_KEYMGMT_gen_settable_params @ 00a66a0c
00a66a0c	str x19,[sp, #-0x20]!
00a66a10	stp x29,x30,[sp, #0x10]
00a66a14	mov x19,x0
00a66a18	ldr x0,[x0, #0x18]
00a66a1c	add x29,sp,#0x10
00a66a20	bl 0x00c3b680
00a66a24	ldr x2,[x19, #0x78]
00a66a28	cbz x2,0x00a66a40
00a66a2c	ldp x29,x30,[sp, #0x10]
00a66a30	mov x1,x0
00a66a34	mov x0,xzr
00a66a38	ldr x19,[sp], #0x20
00a66a3c	br x2
00a66a40	ldp x29,x30,[sp, #0x10]
00a66a44	mov x0,xzr
00a66a48	ldr x19,[sp], #0x20
00a66a4c	ret
