; WPACKET_sub_allocate_bytes__ @ 00a9c42c
00a9c42c	str x21,[sp, #-0x30]!
00a9c430	stp x20,x19,[sp, #0x10]
00a9c434	mov x20,x1
00a9c438	mov x1,x3
00a9c43c	stp x29,x30,[sp, #0x20]
00a9c440	add x29,sp,#0x20
00a9c444	mov x21,x2
00a9c448	mov x19,x0
00a9c44c	bl 0x00a9c4b4
00a9c450	cbz w0,0x00a9c49c
00a9c454	mov x0,x19
00a9c458	mov x1,x20
00a9c45c	mov x2,x21
00a9c460	bl 0x00a9c32c
00a9c464	cbz w0,0x00a9c49c
00a9c468	ldr q0,[x19, #0x10]
00a9c46c	ldr x1,[x19, #0x28]
00a9c470	dup v1.2D,x20
00a9c474	add v0.2D,v1.2D,v0.2D
00a9c478	str q0,[x19, #0x10]
00a9c47c	cbz x1,0x00a9c49c
00a9c480	ldr x8,[x1]
00a9c484	cbz x8,0x00a9c49c
00a9c488	mov w2,#0x1
00a9c48c	mov x0,x19
00a9c490	mov w20,#0x1
00a9c494	bl 0x00a9cab8
00a9c498	cbnz w0,0x00a9c4a0
00a9c49c	mov w20,wzr
00a9c4a0	mov w0,w20
00a9c4a4	ldp x29,x30,[sp, #0x20]
00a9c4a8	ldp x20,x19,[sp, #0x10]
00a9c4ac	ldr x21,[sp], #0x30
00a9c4b0	ret
