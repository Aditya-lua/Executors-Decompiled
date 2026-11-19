; FUN_00c28328 @ 00c28328
00c28328	paciasp
00c2832c	stp x29,x30,[sp, #-0x30]!
00c28330	stp x22,x21,[sp, #0x10]
00c28334	stp x20,x19,[sp, #0x20]
00c28338	mov x29,sp
00c2833c	ldr x22,[x0, #0x1330]
00c28340	mov x20,x2
00c28344	mov x19,x1
00c28348	ldr x8,[x22, #0x8]
00c2834c	sub x9,x8,#0xfd0
00c28350	cmn x9,#0xff1
00c28354	b.hi 0x00c28378
00c28358	mov x21,x0
00c2835c	mov w0,#0x1000
00c28360	bl 0x00c308d0
00c28364	cbz x0,0x00c283d8
00c28368	mov x8,xzr
00c2836c	stp x22,xzr,[x0]
00c28370	mov x22,x0
00c28374	str x0,[x21, #0x1330]
00c28378	add x9,x8,#0x20
00c2837c	ldr x10,[x20]
00c28380	add x0,x22,x8
00c28384	str x9,[x22, #0x8]
00c28388	adrp x8,0xcb3000
00c2838c	add x8,x8,#0xf20
00c28390	ldurh w9,[x10, #0x9]
00c28394	str x8,[x0, #0x10]!
00c28398	ldurh w8,[x0, #0x9]
00c2839c	mov w11,#0x500
00c283a0	ldr x12,[x19]
00c283a4	and w9,w9,#0xc0
00c283a8	orr w9,w9,w11
00c283ac	and w8,w8,#0xf000
00c283b0	mov w11,#0xe
00c283b4	orr w8,w9,w8
00c283b8	strb w11,[x0, #0x8]
00c283bc	sturh w8,[x0, #0x9]
00c283c0	stp x12,x10,[x0, #0x10]
00c283c4	ldp x20,x19,[sp, #0x20]
00c283c8	ldp x22,x21,[sp, #0x10]
00c283cc	ldp x29,x30,[sp], #0x30
00c283d0	autiasp
00c283d4	ret
00c283d8	bl 0x00c2fff0
