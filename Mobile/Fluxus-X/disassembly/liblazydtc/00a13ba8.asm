; SCT_new @ 00a13ba8
00a13ba8	stp x29,x30,[sp, #-0x10]!
00a13bac	adrp x1,0x2a7000
00a13bb0	add x1,x1,#0xdc3
00a13bb4	mov w0,#0x68
00a13bb8	orr w2,wzr,#0x18
00a13bbc	mov x29,sp
00a13bc0	bl 0x00c34250
00a13bc4	cbz x0,0x00a13bdc
00a13bc8	mov w8,#0xffffffff
00a13bcc	str w8,[x0, #0x58]
00a13bd0	str w8,[x0]
00a13bd4	ldp x29,x30,[sp], #0x10
00a13bd8	ret
00a13bdc	bl 0x00c342a0
00a13be0	adrp x0,0x2a7000
00a13be4	adrp x2,0x2b9000
00a13be8	add x0,x0,#0xdc3
00a13bec	add x2,x2,#0xb9f
00a13bf0	mov w1,#0x1b
00a13bf4	bl 0x00c342b0
00a13bf8	mov w1,#0x100
00a13bfc	mov w0,#0x32
00a13c00	movk w1,#0xc, LSL #16
00a13c04	mov x2,xzr
00a13c08	bl 0x00c342c0
00a13c0c	mov x0,xzr
00a13c10	ldp x29,x30,[sp], #0x10
00a13c14	ret
