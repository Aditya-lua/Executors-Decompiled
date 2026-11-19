; WPACKET_start_sub_packet_len__ @ 00a9c4b4
00a9c4b4	sub sp,sp,#0x30
00a9c4b8	stp x20,x19,[sp, #0x10]
00a9c4bc	stp x29,x30,[sp, #0x20]
00a9c4c0	ldr x8,[x0, #0x28]
00a9c4c4	add x29,sp,#0x20
00a9c4c8	cbz x8,0x00a9c544
00a9c4cc	mov x19,x0
00a9c4d0	mov x20,x1
00a9c4d4	cbz x1,0x00a9c4e4
00a9c4d8	ldrb w8,[x19, #0x30]
00a9c4dc	mov w0,wzr
00a9c4e0	tbnz w8,#0x0,0x00a9c58c
00a9c4e4	adrp x1,0x2bd000
00a9c4e8	add x1,x1,#0xe31
00a9c4ec	mov w0,#0x28
00a9c4f0	mov w2,#0x162
00a9c4f4	bl 0x00c34250
00a9c4f8	cbz x0,0x00a9c54c
00a9c4fc	ldr x8,[x19, #0x28]
00a9c500	str x8,[x0]
00a9c504	ldr x8,[x19, #0x18]
00a9c508	str x0,[x19, #0x28]
00a9c50c	add x9,x8,x20
00a9c510	stp x20,x9,[x0, #0x10]
00a9c514	cbz x20,0x00a9c584
00a9c518	str x8,[x0, #0x8]
00a9c51c	add x2,sp,#0x8
00a9c520	mov x0,x19
00a9c524	mov x1,x20
00a9c528	bl 0x00a9c32c
00a9c52c	cbz w0,0x00a9c58c
00a9c530	ldr q0,[x19, #0x10]
00a9c534	dup v1.2D,x20
00a9c538	add v0.2D,v1.2D,v0.2D
00a9c53c	str q0,[x19, #0x10]
00a9c540	b 0x00a9c588
00a9c544	mov w0,wzr
00a9c548	b 0x00a9c58c
00a9c54c	bl 0x00c342a0
00a9c550	adrp x0,0x2bd000
00a9c554	adrp x2,0x2c9000
00a9c558	add x0,x0,#0xe31
00a9c55c	add x2,x2,#0xd8b
00a9c560	mov w1,#0x163
00a9c564	bl 0x00c342b0
00a9c568	mov w1,#0x100
00a9c56c	orr w0,wzr,#0xf
00a9c570	movk w1,#0xc, LSL #16
00a9c574	mov x2,xzr
00a9c578	bl 0x00c342c0
00a9c57c	mov w0,wzr
00a9c580	b 0x00a9c58c
00a9c584	str xzr,[x0, #0x8]
00a9c588	mov w0,#0x1
00a9c58c	ldp x29,x30,[sp, #0x20]
00a9c590	ldp x20,x19,[sp, #0x10]
00a9c594	add sp,sp,#0x30
00a9c598	ret
