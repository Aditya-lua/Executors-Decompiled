; COMP_compress_block @ 00a0bec4
00a0bec4	stp x20,x19,[sp, #-0x20]!
00a0bec8	stp x29,x30,[sp, #0x10]
00a0becc	ldr x8,[x0]
00a0bed0	add x29,sp,#0x10
00a0bed4	ldr x8,[x8, #0x20]
00a0bed8	cbz x8,0x00a0bf08
00a0bedc	mov w19,w4
00a0bee0	mov x20,x0
00a0bee4	blr x8
00a0bee8	cmp w0,#0x1
00a0beec	b.lt 0x00a0bf0c
00a0bef0	ldur q0,[x20, #0x8]
00a0bef4	fmov s1,w19
00a0bef8	mov v1.S[0x1],w0
00a0befc	saddw v0.2D,v0.2D,v1.2S
00a0bf00	stur q0,[x20, #0x8]
00a0bf04	b 0x00a0bf0c
00a0bf08	mov w0,#0xffffffff
00a0bf0c	ldp x29,x30,[sp, #0x10]
00a0bf10	ldp x20,x19,[sp], #0x20
00a0bf14	ret
