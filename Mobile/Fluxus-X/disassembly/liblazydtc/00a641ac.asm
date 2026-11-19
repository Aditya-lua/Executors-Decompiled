; EVP_KDF_is_a @ 00a641ac
00a641ac	cbz x0,0x00a641dc
00a641b0	stp x29,x30,[sp, #-0x10]!
00a641b4	ldr x8,[x0]
00a641b8	mov x3,x1
00a641bc	ldr w1,[x0, #0x8]
00a641c0	mov x2,xzr
00a641c4	mov x0,x8
00a641c8	mov x29,sp
00a641cc	bl 0x00c3bf70
00a641d0	cmp w0,#0x0
00a641d4	cset w0,ne
00a641d8	ldp x29,x30,[sp], #0x10
00a641dc	ret
