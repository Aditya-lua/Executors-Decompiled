; EC_GROUP_set_curve @ 00a30f9c
00a30f9c	ldr x8,[x0]
00a30fa0	ldr x5,[x8, #0x28]
00a30fa4	cbz x5,0x00a30fac
00a30fa8	br x5
00a30fac	stp x29,x30,[sp, #-0x10]!
00a30fb0	mov x29,sp
00a30fb4	bl 0x00c342a0
00a30fb8	adrp x0,0x29e000
00a30fbc	adrp x2,0x2aa000
00a30fc0	add x0,x0,#0xa7
00a30fc4	add x2,x2,#0x91
00a30fc8	mov w1,#0x22f
00a30fcc	bl 0x00c342b0
00a30fd0	mov w1,#0x101
00a30fd4	mov w0,#0x10
00a30fd8	movk w1,#0xc, LSL #16
00a30fdc	mov x2,xzr
00a30fe0	bl 0x00c342c0
00a30fe4	mov w0,wzr
00a30fe8	ldp x29,x30,[sp], #0x10
00a30fec	ret
