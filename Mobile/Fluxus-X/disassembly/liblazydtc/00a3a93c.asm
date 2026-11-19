; ossl_ec_GFp_simple_invert @ 00a3a93c
00a3a93c	stp x20,x19,[sp, #-0x20]!
00a3a940	stp x29,x30,[sp, #0x10]
00a3a944	add x29,sp,#0x10
00a3a948	mov x20,x1
00a3a94c	mov x19,x0
00a3a950	bl 0x00c3ae10
00a3a954	cbnz w0,0x00a3a964
00a3a958	ldr x0,[x20, #0x18]
00a3a95c	bl 0x00c369b0
00a3a960	cbz w0,0x00a3a974
00a3a964	ldp x29,x30,[sp, #0x10]
00a3a968	mov w0,#0x1
00a3a96c	ldp x20,x19,[sp], #0x20
00a3a970	ret
00a3a974	ldr x0,[x20, #0x18]
00a3a978	ldr x1,[x19, #0x40]
00a3a97c	ldp x29,x30,[sp, #0x10]
00a3a980	mov x2,x0
00a3a984	ldp x20,x19,[sp], #0x20
00a3a988	b 0x00c388a0
