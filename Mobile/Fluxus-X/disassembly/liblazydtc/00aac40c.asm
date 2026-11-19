; CRYPTO_ocb128_tag @ 00aac40c
00aac40c	sub x8,x2,#0x1
00aac410	cmp x8,#0xf
00aac414	b.ls 0x00aac420
00aac418	mov w0,#0xffffffff
00aac41c	ret
00aac420	sub sp,sp,#0x40
00aac424	str x21,[sp, #0x10]
00aac428	stp x20,x19,[sp, #0x20]
00aac42c	stp x29,x30,[sp, #0x30]
00aac430	ldp q0,q1,[x0, #0x90]
00aac434	ldur q2,[x0, #0x48]
00aac438	mov x19,x2
00aac43c	mov x20,x1
00aac440	eor v0.16B,v0.16B,v1.16B
00aac444	eor v0.16B,v0.16B,v2.16B
00aac448	str q0,[sp]
00aac44c	ldr x8,[x0]
00aac450	ldr x2,[x0, #0x10]
00aac454	mov x21,x0
00aac458	mov x0,sp
00aac45c	mov x1,sp
00aac460	add x29,sp,#0x30
00aac464	blr x8
00aac468	ldr q0,[sp]
00aac46c	ldr q1,[x21, #0x80]
00aac470	mov x1,sp
00aac474	mov x0,x20
00aac478	mov x2,x19
00aac47c	eor v0.16B,v1.16B,v0.16B
00aac480	str q0,[sp]
00aac484	bl 0x00c2ffd0
00aac488	ldp x29,x30,[sp, #0x30]
00aac48c	ldp x20,x19,[sp, #0x20]
00aac490	ldr x21,[sp, #0x10]
00aac494	mov w0,#0x1
00aac498	add sp,sp,#0x40
00aac49c	ret
