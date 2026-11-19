; EVP_PKEY_missing_parameters @ 00a6c4bc
00a6c4bc	cbz x0,0x00a6c500
00a6c4c0	ldr x8,[x0, #0x60]
00a6c4c4	cbz x8,0x00a6c4e8
00a6c4c8	stp x29,x30,[sp, #-0x10]!
00a6c4cc	mov w1,#0x4
00a6c4d0	mov x29,sp
00a6c4d4	bl 0x00c37d30
00a6c4d8	cmp w0,#0x0
00a6c4dc	cset w0,eq
00a6c4e0	ldp x29,x30,[sp], #0x10
00a6c4e4	ret
00a6c4e8	ldr x8,[x0, #0x8]
00a6c4ec	cbz x8,0x00a6c4fc
00a6c4f0	ldr x1,[x8, #0x80]
00a6c4f4	cbz x1,0x00a6c4fc
00a6c4f8	br x1
00a6c4fc	mov w0,wzr
00a6c500	ret
