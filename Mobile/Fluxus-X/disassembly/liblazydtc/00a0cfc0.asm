; NCONF_load_bio @ 00a0cfc0
00a0cfc0	cbz x0,0x00a0cfd0
00a0cfc4	ldr x8,[x0]
00a0cfc8	ldr x3,[x8, #0x28]
00a0cfcc	br x3
00a0cfd0	stp x29,x30,[sp, #-0x10]!
00a0cfd4	mov x29,sp
00a0cfd8	bl 0x00c342a0
00a0cfdc	adrp x0,0x2af000
00a0cfe0	adrp x2,0x29d000
00a0cfe4	add x0,x0,#0xd73
00a0cfe8	add x2,x2,#0xfa3
00a0cfec	mov w1,#0x116
00a0cff0	bl 0x00c342b0
00a0cff4	orr w0,wzr,#0xe
00a0cff8	mov w1,#0x69
00a0cffc	mov x2,xzr
00a0d000	bl 0x00c342c0
00a0d004	mov w0,wzr
00a0d008	ldp x29,x30,[sp], #0x10
00a0d00c	ret
