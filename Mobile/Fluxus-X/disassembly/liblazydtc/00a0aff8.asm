; BN_sqr @ 00a0aff8
00a0aff8	stp x20,x19,[sp, #-0x20]!
00a0affc	stp x29,x30,[sp, #0x10]
00a0b000	add x29,sp,#0x10
00a0b004	mov x19,x0
00a0b008	bl 0x00a0b028
00a0b00c	mov w20,w0
00a0b010	mov x0,x19
00a0b014	bl 0x00c38e40
00a0b018	ldp x29,x30,[sp, #0x10]
00a0b01c	mov w0,w20
00a0b020	ldp x20,x19,[sp], #0x20
00a0b024	ret
