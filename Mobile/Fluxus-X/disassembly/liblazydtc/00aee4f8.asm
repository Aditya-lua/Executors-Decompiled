; UI_construct_prompt @ 00aee4f8
00aee4f8	sub sp,sp,#0x50
00aee4fc	stp x20,x19,[sp, #0x30]
00aee500	mov x19,x2
00aee504	mov x20,x1
00aee508	stp x22,x21,[sp, #0x20]
00aee50c	stp x29,x30,[sp, #0x40]
00aee510	add x29,sp,#0x40
00aee514	cbz x0,0x00aee544
00aee518	ldr x8,[x0]
00aee51c	cbz x8,0x00aee544
00aee520	ldr x3,[x8, #0x40]
00aee524	cbz x3,0x00aee544
00aee528	mov x1,x20
00aee52c	mov x2,x19
00aee530	ldp x29,x30,[sp, #0x40]
00aee534	ldp x20,x19,[sp, #0x30]
00aee538	ldp x22,x21,[sp, #0x20]
00aee53c	add sp,sp,#0x50
00aee540	br x3
00aee544	mov w9,#0x6e45
00aee548	mov w11,#0x6620
00aee54c	mov w8,#0x2072
00aee550	movk w9,#0x6574, LSL #16
00aee554	mov w10,#0x20
00aee558	movk w11,#0x726f, LSL #16
00aee55c	mov w12,#0x3a
00aee560	strb wzr,[sp, #0x1e]
00aee564	strh w8,[sp, #0x1c]
00aee568	str w9,[sp, #0x18]
00aee56c	strh w10,[sp, #0x14]
00aee570	str w11,[sp, #0x10]
00aee574	strh w12,[sp, #0xc]
00aee578	cbz x20,0x00aee650
00aee57c	mov x0,x20
00aee580	bl 0x00c2ff50
00aee584	mov x21,x0
00aee588	cbz x19,0x00aee5a0
00aee58c	mov x0,x19
00aee590	bl 0x00c2ff50
00aee594	add x8,x21,x0
00aee598	add x8,x8,#0xb
00aee59c	b 0x00aee5a4
00aee5a0	add x8,x21,#0x6
00aee5a4	orr x9,xzr,#0x200000000
00aee5a8	add x8,x9,x8, LSL #0x20
00aee5ac	asr x21,x8,#0x20
00aee5b0	adrp x1,0x2a0000
00aee5b4	add x1,x1,#0xc2f
00aee5b8	mov w2,#0x178
00aee5bc	mov x0,x21
00aee5c0	bl 0x00c32320
00aee5c4	cbz x0,0x00aee620
00aee5c8	add x1,sp,#0x18
00aee5cc	mov x2,x21
00aee5d0	mov x22,x0
00aee5d4	bl 0x00c387f0
00aee5d8	mov x0,x22
00aee5dc	mov x1,x20
00aee5e0	mov x2,x21
00aee5e4	bl 0x00c395d0
00aee5e8	cbz x19,0x00aee60c
00aee5ec	add x1,sp,#0x10
00aee5f0	mov x0,x22
00aee5f4	mov x2,x21
00aee5f8	bl 0x00c395d0
00aee5fc	mov x0,x22
00aee600	mov x1,x19
00aee604	mov x2,x21
00aee608	bl 0x00c395d0
00aee60c	add x1,sp,#0xc
00aee610	mov x0,x22
00aee614	mov x2,x21
00aee618	bl 0x00c395d0
00aee61c	b 0x00aee654
00aee620	bl 0x00c342a0
00aee624	adrp x0,0x2a0000
00aee628	adrp x2,0x2a2000
00aee62c	add x0,x0,#0xc2f
00aee630	add x2,x2,#0xcfb
00aee634	mov w1,#0x179
00aee638	bl 0x00c342b0
00aee63c	mov w1,#0x100
00aee640	mov w0,#0x28
00aee644	movk w1,#0xc, LSL #16
00aee648	mov x2,xzr
00aee64c	bl 0x00c342c0
00aee650	mov x22,xzr
00aee654	mov x0,x22
00aee658	ldp x29,x30,[sp, #0x40]
00aee65c	ldp x20,x19,[sp, #0x30]
00aee660	ldp x22,x21,[sp, #0x20]
00aee664	add sp,sp,#0x50
00aee668	ret
