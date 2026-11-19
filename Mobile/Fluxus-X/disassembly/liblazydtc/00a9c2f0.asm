; WPACKET_allocate_bytes @ 00a9c2f0
00a9c2f0	stp x20,x19,[sp, #-0x20]!
00a9c2f4	stp x29,x30,[sp, #0x10]
00a9c2f8	add x29,sp,#0x10
00a9c2fc	mov x20,x1
00a9c300	mov x19,x0
00a9c304	bl 0x00a9c32c
00a9c308	cbz w0,0x00a9c320
00a9c30c	ldr q0,[x19, #0x10]
00a9c310	dup v1.2D,x20
00a9c314	mov w0,#0x1
00a9c318	add v0.2D,v1.2D,v0.2D
00a9c31c	str q0,[x19, #0x10]
00a9c320	ldp x29,x30,[sp, #0x10]
00a9c324	ldp x20,x19,[sp], #0x20
00a9c328	ret
