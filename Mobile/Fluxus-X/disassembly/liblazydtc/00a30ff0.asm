; EC_GROUP_get_curve @ 00a30ff0
00a30ff0	ldr x8,[x0]
00a30ff4	ldr x5,[x8, #0x30]
00a30ff8	cbz x5,0x00a31000
00a30ffc	br x5
00a31000	stp x29,x30,[sp, #-0x10]!
00a31004	mov x29,sp
00a31008	bl 0x00c342a0
00a3100c	adrp x0,0x29e000
00a31010	adrp x2,0x2c9000
00a31014	add x0,x0,#0xa7
00a31018	add x2,x2,#0x749
00a3101c	mov w1,#0x239
00a31020	bl 0x00c342b0
00a31024	mov w1,#0x101
00a31028	mov w0,#0x10
00a3102c	movk w1,#0xc, LSL #16
00a31030	mov x2,xzr
00a31034	bl 0x00c342c0
00a31038	mov w0,wzr
00a3103c	ldp x29,x30,[sp], #0x10
00a31040	ret
