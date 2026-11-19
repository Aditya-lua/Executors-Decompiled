; ossl_cipher_trailingdata @ 00b66340
00b66340	stp x20,x19,[sp, #-0x20]!
00b66344	stp x29,x30,[sp, #0x10]
00b66348	mov x8,x2
00b6634c	ldr x2,[x4]
00b66350	add x29,sp,#0x10
00b66354	cbz x2,0x00b663c8
00b66358	ldr x9,[x1]
00b6635c	mov x20,x1
00b66360	add x10,x9,x2
00b66364	cmp x10,x8
00b66368	b.ls 0x00b663a4
00b6636c	bl 0x00c342a0
00b66370	adrp x0,0x2a8000
00b66374	adrp x2,0x2c8000
00b66378	add x0,x0,#0xe31
00b6637c	add x2,x2,#0x7fa
00b66380	mov w1,#0x57
00b66384	bl 0x00c342b0
00b66388	mov w1,#0x103
00b6638c	mov w0,#0x39
00b66390	movk w1,#0xc, LSL #16
00b66394	mov x2,xzr
00b66398	bl 0x00c342c0
00b6639c	mov w0,wzr
00b663a0	b 0x00b663cc
00b663a4	ldr x1,[x3]
00b663a8	add x0,x0,x9
00b663ac	mov x19,x4
00b663b0	bl 0x00c2ffd0
00b663b4	ldr x8,[x19]
00b663b8	ldr x9,[x20]
00b663bc	add x8,x9,x8
00b663c0	str x8,[x20]
00b663c4	str xzr,[x19]
00b663c8	mov w0,#0x1
00b663cc	ldp x29,x30,[sp, #0x10]
00b663d0	ldp x20,x19,[sp], #0x20
00b663d4	ret
