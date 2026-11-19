; BN_mod_mul_montgomery @ 00a03018
00a03018	stp x20,x19,[sp, #-0x20]!
00a0301c	stp x29,x30,[sp, #0x10]
00a03020	add x29,sp,#0x10
00a03024	mov x19,x0
00a03028	bl 0x00a03048
00a0302c	mov w20,w0
00a03030	mov x0,x19
00a03034	bl 0x00c38e40
00a03038	ldp x29,x30,[sp, #0x10]
00a0303c	mov w0,w20
00a03040	ldp x20,x19,[sp], #0x20
00a03044	ret
