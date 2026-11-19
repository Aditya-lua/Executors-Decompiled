; BN_GENCB_call @ 00a1a47c
00a1a47c	cbz x0,0x00a1a4cc
00a1a480	ldr w9,[x0]
00a1a484	mov x8,x0
00a1a488	cmp w9,#0x2
00a1a48c	b.eq 0x00a1a4d4
00a1a490	cmp w9,#0x1
00a1a494	mov w0,wzr
00a1a498	b.ne 0x00a1a4c8
00a1a49c	ldr x9,[x8, #0x10]
00a1a4a0	cbz x9,0x00a1a4e8
00a1a4a4	stp x29,x30,[sp, #-0x10]!
00a1a4a8	ldr x8,[x8, #0x8]
00a1a4ac	mov w0,w1
00a1a4b0	mov w1,w2
00a1a4b4	mov x29,sp
00a1a4b8	mov x2,x8
00a1a4bc	blr x9
00a1a4c0	mov w0,#0x1
00a1a4c4	ldp x29,x30,[sp], #0x10
00a1a4c8	ret
00a1a4cc	mov w0,#0x1
00a1a4d0	ret
00a1a4d4	ldr x3,[x8, #0x10]
00a1a4d8	mov w0,w1
00a1a4dc	mov w1,w2
00a1a4e0	mov x2,x8
00a1a4e4	br x3
00a1a4e8	mov w0,#0x1
00a1a4ec	ret
