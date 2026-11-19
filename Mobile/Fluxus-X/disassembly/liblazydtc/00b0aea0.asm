; X509_STORE_add_crl @ 00b0aea0
00b0aea0	str x19,[sp, #-0x20]!
00b0aea4	mov w2,#0x1
00b0aea8	stp x29,x30,[sp, #0x10]
00b0aeac	add x29,sp,#0x10
00b0aeb0	mov w19,#0x1
00b0aeb4	bl 0x00b0ad24
00b0aeb8	cbnz w0,0x00b0aef0
00b0aebc	bl 0x00c342a0
00b0aec0	adrp x0,0x2aa000
00b0aec4	adrp x2,0x2d0000
00b0aec8	add x0,x0,#0xba3
00b0aecc	add x2,x2,#0x588
00b0aed0	mov w1,#0x198
00b0aed4	bl 0x00c342b0
00b0aed8	mov w1,#0x100
00b0aedc	mov w0,#0xb
00b0aee0	movk w1,#0xc, LSL #16
00b0aee4	mov x2,xzr
00b0aee8	bl 0x00c342c0
00b0aeec	mov w19,wzr
00b0aef0	ldp x29,x30,[sp, #0x10]
00b0aef4	mov w0,w19
00b0aef8	ldr x19,[sp], #0x20
00b0aefc	ret
