; mbedtls_sha512_update @ 00bae2ec
00bae2ec	stp x24,x23,[sp, #-0x40]!
00bae2f0	stp x22,x21,[sp, #0x10]
00bae2f4	stp x20,x19,[sp, #0x20]
00bae2f8	stp x29,x30,[sp, #0x30]
00bae2fc	add x29,sp,#0x30
00bae300	mov x19,x2
00bae304	mov x20,x1
00bae308	mov x21,x0
00bae30c	cbz x2,0x00bae3cc
00bae310	ldr x8,[x21]
00bae314	and w24,w8,#0x7f
00bae318	adds x8,x8,x19
00bae31c	str x8,[x21]
00bae320	b.cc 0x00bae330
00bae324	ldr x8,[x21, #0x8]
00bae328	add x8,x8,#0x1
00bae32c	str x8,[x21, #0x8]
00bae330	cbz w24,0x00bae370
00bae334	mov w8,#0x80
00bae338	sub w22,w8,w24
00bae33c	cmp x22,x19
00bae340	b.hi 0x00bae370
00bae344	add x23,x21,#0x50
00bae348	add x0,x23,x24
00bae34c	mov x1,x20
00bae350	mov x2,x22
00bae354	bl 0x00c2ffd0
00bae358	mov x0,x21
00bae35c	mov x1,x23
00bae360	bl 0x00c43500
00bae364	mov w24,wzr
00bae368	add x20,x20,x22
00bae36c	sub x19,x19,x22
00bae370	cmp x19,#0x80
00bae374	b.cc 0x00bae3b4
00bae378	mov x23,x19
00bae37c	mov x22,x20
00bae380	mov x0,x21
00bae384	mov x1,x22
00bae388	bl 0x00c43500
00bae38c	sub x23,x23,#0x80
00bae390	cmp x23,#0x7f
00bae394	add x22,x22,#0x80
00bae398	b.hi 0x00bae380
00bae39c	and x8,x19,#-0x80
00bae3a0	add x20,x20,x8
00bae3a4	sub x19,x19,x8
00bae3a8	cbnz x8,0x00bae370
00bae3ac	mov w0,#0xffffffff
00bae3b0	b 0x00bae3d0
00bae3b4	cbz x19,0x00bae3cc
00bae3b8	add x8,x21,x24
00bae3bc	add x0,x8,#0x50
00bae3c0	mov x1,x20
00bae3c4	mov x2,x19
00bae3c8	bl 0x00c2ffd0
00bae3cc	mov w0,wzr
00bae3d0	ldp x29,x30,[sp, #0x30]
00bae3d4	ldp x20,x19,[sp, #0x20]
00bae3d8	ldp x22,x21,[sp, #0x10]
00bae3dc	ldp x24,x23,[sp], #0x40
00bae3e0	ret
