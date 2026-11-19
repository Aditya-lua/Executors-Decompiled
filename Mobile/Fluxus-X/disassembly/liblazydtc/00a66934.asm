; evp_keymgmt_newdata @ 00a66934
00a66934	str x19,[sp, #-0x20]!
00a66938	stp x29,x30,[sp, #0x10]
00a6693c	mov x19,x0
00a66940	ldr x0,[x0, #0x18]
00a66944	add x29,sp,#0x10
00a66948	bl 0x00c3b680
00a6694c	ldr x1,[x19, #0x30]
00a66950	cbz x1,0x00a66960
00a66954	ldp x29,x30,[sp, #0x10]
00a66958	ldr x19,[sp], #0x20
00a6695c	br x1
00a66960	ldp x29,x30,[sp, #0x10]
00a66964	mov x0,xzr
00a66968	ldr x19,[sp], #0x20
00a6696c	ret
