; CRYPTO_ocb128_finish @ 00aac37c
00aac37c	sub x8,x2,#0x1
00aac380	cmp x8,#0xf
00aac384	b.ls 0x00aac390
00aac388	mov w0,#0xffffffff
00aac38c	ret
00aac390	sub sp,sp,#0x40
00aac394	str x21,[sp, #0x10]
00aac398	stp x20,x19,[sp, #0x20]
00aac39c	stp x29,x30,[sp, #0x30]
00aac3a0	ldp q0,q1,[x0, #0x90]
00aac3a4	ldur q2,[x0, #0x48]
00aac3a8	mov x19,x2
00aac3ac	mov x20,x1
00aac3b0	eor v0.16B,v0.16B,v1.16B
00aac3b4	eor v0.16B,v0.16B,v2.16B
00aac3b8	str q0,[sp]
00aac3bc	ldr x8,[x0]
00aac3c0	ldr x2,[x0, #0x10]
00aac3c4	mov x21,x0
00aac3c8	mov x0,sp
00aac3cc	mov x1,sp
00aac3d0	add x29,sp,#0x30
00aac3d4	blr x8
00aac3d8	ldr q0,[sp]
00aac3dc	ldr q1,[x21, #0x80]
00aac3e0	mov x0,sp
00aac3e4	mov x1,x20
00aac3e8	mov x2,x19
00aac3ec	eor v0.16B,v1.16B,v0.16B
00aac3f0	str q0,[sp]
00aac3f4	bl 0x00c362f0
00aac3f8	ldp x29,x30,[sp, #0x30]
00aac3fc	ldp x20,x19,[sp, #0x20]
00aac400	ldr x21,[sp, #0x10]
00aac404	add sp,sp,#0x40
00aac408	ret
