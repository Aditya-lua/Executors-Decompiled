; RAND_priv_bytes_ex @ 00ac82e4
00ac82e4	str x23,[sp, #-0x40]!
00ac82e8	stp x22,x21,[sp, #0x10]
00ac82ec	stp x20,x19,[sp, #0x20]
00ac82f0	stp x29,x30,[sp, #0x30]
00ac82f4	add x29,sp,#0x30
00ac82f8	mov w21,w3
00ac82fc	mov x19,x2
00ac8300	mov x20,x1
00ac8304	mov x22,x0
00ac8308	bl 0x00ac7d50
00ac830c	cbz x0,0x00ac8344
00ac8310	mov x23,x0
00ac8314	bl 0x00c3e1c0
00ac8318	cmp x23,x0
00ac831c	b.eq 0x00ac8344
00ac8320	ldr x2,[x23, #0x8]
00ac8324	cbz x2,0x00ac837c
00ac8328	mov x0,x20
00ac832c	mov w1,w19
00ac8330	ldp x29,x30,[sp, #0x30]
00ac8334	ldp x20,x19,[sp, #0x20]
00ac8338	ldp x22,x21,[sp, #0x10]
00ac833c	ldr x23,[sp], #0x40
00ac8340	br x2
00ac8344	mov x0,x22
00ac8348	bl 0x00ac83c0
00ac834c	cbz x0,0x00ac83ac
00ac8350	mov x1,x20
00ac8354	mov x2,x19
00ac8358	mov w3,w21
00ac835c	ldp x29,x30,[sp, #0x30]
00ac8360	ldp x20,x19,[sp, #0x20]
00ac8364	ldp x22,x21,[sp, #0x10]
00ac8368	mov w4,wzr
00ac836c	mov x5,xzr
00ac8370	mov x6,xzr
00ac8374	ldr x23,[sp], #0x40
00ac8378	b 0x00c3d190
00ac837c	bl 0x00c342a0
00ac8380	adrp x0,0x2da000
00ac8384	adrp x2,0x2aa000
00ac8388	add x0,x0,#0x554
00ac838c	add x2,x2,#0x8d4
00ac8390	mov w1,#0x14f
00ac8394	bl 0x00c342b0
00ac8398	mov w0,#0x24
00ac839c	mov w1,#0x65
00ac83a0	mov x2,xzr
00ac83a4	bl 0x00c342c0
00ac83a8	mov w0,#0xffffffff
00ac83ac	ldp x29,x30,[sp, #0x30]
00ac83b0	ldp x20,x19,[sp, #0x20]
00ac83b4	ldp x22,x21,[sp, #0x10]
00ac83b8	ldr x23,[sp], #0x40
00ac83bc	ret
