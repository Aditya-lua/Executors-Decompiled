; BN_RECP_CTX_set @ 00a1d324
00a1d324	stp x20,x19,[sp, #-0x20]!
00a1d328	mov x19,x0
00a1d32c	mov x0,x1
00a1d330	stp x29,x30,[sp, #0x10]
00a1d334	add x29,sp,#0x10
00a1d338	mov x20,x1
00a1d33c	bl 0x00c369b0
00a1d340	mov w8,w0
00a1d344	mov w0,wzr
00a1d348	cbnz w8,0x00a1d374
00a1d34c	mov x0,x19
00a1d350	mov x1,x20
00a1d354	bl 0x00c36990
00a1d358	cbz x0,0x00a1d374
00a1d35c	add x0,x19,#0x18
00a1d360	bl 0x00c38e00
00a1d364	mov x0,x20
00a1d368	bl 0x00c322f0
00a1d36c	stp w0,wzr,[x19, #0x30]
00a1d370	mov w0,#0x1
00a1d374	ldp x29,x30,[sp, #0x10]
00a1d378	ldp x20,x19,[sp], #0x20
00a1d37c	ret
