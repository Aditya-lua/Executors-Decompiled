; EVP_KEYMGMT_is_a @ 00a668b4
00a668b4	cbz x0,0x00a668e4
00a668b8	stp x29,x30,[sp, #-0x10]!
00a668bc	ldr x8,[x0, #0x18]
00a668c0	mov x3,x1
00a668c4	ldr w1,[x0, #0x4]
00a668c8	mov x2,xzr
00a668cc	mov x0,x8
00a668d0	mov x29,sp
00a668d4	bl 0x00c3bf70
00a668d8	cmp w0,#0x0
00a668dc	cset w0,ne
00a668e0	ldp x29,x30,[sp], #0x10
00a668e4	ret
