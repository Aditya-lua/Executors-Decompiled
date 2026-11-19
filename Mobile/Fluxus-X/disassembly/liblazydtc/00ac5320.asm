; ossl_sa_free_leaves @ 00ac5320
00ac5320	sub sp,sp,#0x110
00ac5324	stp x28,x25,[sp, #0xc0]
00ac5328	stp x24,x23,[sp, #0xd0]
00ac532c	stp x22,x21,[sp, #0xe0]
00ac5330	stp x20,x19,[sp, #0xf0]
00ac5334	stp x29,x30,[sp, #0x100]
00ac5338	str wzr,[sp, #0x80]
00ac533c	ldr x10,[x0, #0x18]
00ac5340	adrp x20,0x2dc000
00ac5344	mov x19,x0
00ac5348	mov w8,wzr
00ac534c	mov w9,wzr
00ac5350	mov x22,sp
00ac5354	add x23,sp,#0x80
00ac5358	add x20,x20,#0x89f
00ac535c	add x29,sp,#0x100
00ac5360	str x10,[sp]
00ac5364	b 0x00ac5370
00ac5368	sub x9,x24,#0x1
00ac536c	ldr w8,[x23, x9, LSL #0x2]
00ac5370	ldr x21,[x22, w9, SXTW #0x3]
00ac5374	sxtw x24,w9
00ac5378	sxtw x25,w8
00ac537c	cmp w25,#0x10
00ac5380	b.lt 0x00ac53b0
00ac5384	cbz x21,0x00ac5398
00ac5388	mov w2,#0x66
00ac538c	mov x0,x21
00ac5390	mov x1,x20
00ac5394	bl 0x00c32310
00ac5398	cmp w24,#0x1
00ac539c	b.ge 0x00ac5368
00ac53a0	b 0x00ac53f8
00ac53a4	add x25,x25,#0x1
00ac53a8	cmp w25,#0x10
00ac53ac	b.ge 0x00ac5384
00ac53b0	add w8,w25,#0x1
00ac53b4	str w8,[x23, x24, LSL #0x2]
00ac53b8	cbz x21,0x00ac53a4
00ac53bc	ldr x0,[x21, x25, LSL #0x3]
00ac53c0	cbz x0,0x00ac53a4
00ac53c4	ldr w8,[x19]
00ac53c8	sub w8,w8,#0x1
00ac53cc	cmp w24,w8
00ac53d0	b.lt 0x00ac53e4
00ac53d4	mov w2,#0x6b
00ac53d8	mov x1,x20
00ac53dc	bl 0x00c32310
00ac53e0	b 0x00ac53a4
00ac53e4	add x9,x24,#0x1
00ac53e8	mov w8,wzr
00ac53ec	str wzr,[x23, x9, LSL #0x2]
00ac53f0	str x0,[x22, x9, LSL #0x3]
00ac53f4	b 0x00ac5370
00ac53f8	mov x0,x19
00ac53fc	ldp x29,x30,[sp, #0x100]
00ac5400	ldp x20,x19,[sp, #0xf0]
00ac5404	ldp x22,x21,[sp, #0xe0]
00ac5408	ldp x24,x23,[sp, #0xd0]
00ac540c	ldp x28,x25,[sp, #0xc0]
00ac5410	adrp x1,0x2dc000
00ac5414	add x1,x1,#0x89f
00ac5418	mov w2,#0x79
00ac541c	add sp,sp,#0x110
00ac5420	b 0x00c32310
