; EC_GROUP_check_discriminant @ 00a311e8
00a311e8	ldr x8,[x0]
00a311ec	ldr x2,[x8, #0x48]
00a311f0	cbz x2,0x00a311f8
00a311f4	br x2
00a311f8	stp x29,x30,[sp, #-0x10]!
00a311fc	mov x29,sp
00a31200	bl 0x00c342a0
00a31204	adrp x0,0x29e000
00a31208	adrp x2,0x2b9000
00a3120c	add x0,x0,#0xa7
00a31210	add x2,x2,#0xc65
00a31214	mov w1,#0x267
00a31218	bl 0x00c342b0
00a3121c	mov w1,#0x101
00a31220	mov w0,#0x10
00a31224	movk w1,#0xc, LSL #16
00a31228	mov x2,xzr
00a3122c	bl 0x00c342c0
00a31230	mov w0,wzr
00a31234	ldp x29,x30,[sp], #0x10
00a31238	ret
