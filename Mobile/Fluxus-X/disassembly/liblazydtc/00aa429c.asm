; OSSL_PROVIDER_available @ 00aa429c
00aa429c	stp x20,x19,[sp, #-0x20]!
00aa42a0	adrp x2,0xc6d000
00aa42a4	mov x19,x1
00aa42a8	add x2,x2,#0x4c8
00aa42ac	mov w1,#0x1
00aa42b0	stp x29,x30,[sp, #0x10]
00aa42b4	add x29,sp,#0x10
00aa42b8	mov x20,x0
00aa42bc	bl 0x00c3b520
00aa42c0	cbz x0,0x00aa430c
00aa42c4	bl 0x00aa4178
00aa42c8	cbz w0,0x00aa433c
00aa42cc	mov x0,x20
00aa42d0	mov x1,x19
00aa42d4	mov w2,wzr
00aa42d8	bl 0x00aa2aa0
00aa42dc	cbz x0,0x00aa433c
00aa42e0	mov x19,x0
00aa42e4	ldr x0,[x0, #0x8]
00aa42e8	bl 0x00c35680
00aa42ec	cbz w0,0x00aa433c
00aa42f0	ldrb w8,[x19]
00aa42f4	ldr x0,[x19, #0x8]
00aa42f8	ubfx w20,w8,#0x1,#0x1
00aa42fc	bl 0x00c35690
00aa4300	mov x0,x19
00aa4304	bl 0x00aa2c44
00aa4308	b 0x00aa4340
00aa430c	bl 0x00c342a0
00aa4310	adrp x0,0x2aa000
00aa4314	adrp x2,0x2bb000
00aa4318	add x0,x0,#0x4b5
00aa431c	add x2,x2,#0xf7d
00aa4320	mov w1,#0x156
00aa4324	bl 0x00c342b0
00aa4328	mov w1,#0x103
00aa432c	orr w0,wzr,#0xf
00aa4330	movk w1,#0xc, LSL #16
00aa4334	mov x2,xzr
00aa4338	bl 0x00c342c0
00aa433c	mov w20,wzr
00aa4340	ldp x29,x30,[sp, #0x10]
00aa4344	mov w0,w20
00aa4348	ldp x20,x19,[sp], #0x20
00aa434c	ret
