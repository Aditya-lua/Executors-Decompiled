; FUN_009fc30c @ 009fc30c
009fc30c	sub sp,sp,#0x40
009fc310	stp x22,x21,[sp, #0x10]
009fc314	stp x20,x19,[sp, #0x20]
009fc318	mov x19,x3
009fc31c	mov x20,x2
009fc320	mov x21,x1
009fc324	mov x22,x0
009fc328	stp x29,x30,[sp, #0x30]
009fc32c	add x29,sp,#0x30
009fc330	cbz x3,0x009fc338
009fc334	str xzr,[x19]
009fc338	cbz x22,0x009fc39c
009fc33c	ldr x8,[x22, #0x8]
009fc340	cbz x8,0x009fc368
009fc344	ldr x8,[x8, #0x10]
009fc348	cbz x8,0x009fc368
009fc34c	ldp x8,x9,[x22, #0x10]
009fc350	cbz x8,0x009fc3b8
009fc354	cbnz x9,0x009fc3bc
009fc358	lsr x9,x20,#0x1f
009fc35c	cbz x9,0x009fc4cc
009fc360	mov w6,#0xffffffff
009fc364	b 0x009fc3a0
009fc368	bl 0x00c342a0
009fc36c	adrp x0,0x2b2000
009fc370	adrp x2,0x29f000
009fc374	add x0,x0,#0x42
009fc378	add x2,x2,#0xf1d
009fc37c	mov w1,#0x15d
009fc380	bl 0x00c342b0
009fc384	mov w0,#0x20
009fc388	mov w1,#0x79
009fc38c	mov x2,xzr
009fc390	bl 0x00c342c0
009fc394	orr w6,wzr,#0xfffffffe
009fc398	b 0x009fc3a0
009fc39c	mov w6,wzr
009fc3a0	ldp x29,x30,[sp, #0x30]
009fc3a4	ldp x20,x19,[sp, #0x20]
009fc3a8	ldp x22,x21,[sp, #0x10]
009fc3ac	mov w0,w6
009fc3b0	add sp,sp,#0x40
009fc3b4	ret
009fc3b8	cbz x9,0x009fc3ec
009fc3bc	orr w1,wzr,#0x3
009fc3c0	mov w6,#0x1
009fc3c4	mov x0,x22
009fc3c8	mov x2,x21
009fc3cc	mov x3,x20
009fc3d0	mov w4,wzr
009fc3d4	mov x5,xzr
009fc3d8	mov x7,xzr
009fc3dc	blr x9
009fc3e0	mov x6,x0
009fc3e4	cmp w6,#0x1
009fc3e8	b.lt 0x009fc3a0
009fc3ec	ldr w8,[x22, #0x28]
009fc3f0	cbz w8,0x009fc460
009fc3f4	ldr x8,[x22, #0x8]
009fc3f8	add x3,sp,#0x8
009fc3fc	mov x0,x22
009fc400	mov x1,x21
009fc404	ldr x8,[x8, #0x10]
009fc408	mov x2,x20
009fc40c	blr x8
009fc410	mov w6,w0
009fc414	cmp w0,#0x1
009fc418	b.lt 0x009fc42c
009fc41c	ldr x8,[sp, #0x8]
009fc420	ldr x9,[x22, #0x68]
009fc424	add x8,x9,x8
009fc428	str x8,[x22, #0x68]
009fc42c	ldp x8,x9,[x22, #0x10]
009fc430	cbz x8,0x009fc494
009fc434	cbnz x9,0x009fc498
009fc438	lsr x9,x20,#0x1f
009fc43c	cbnz x9,0x009fc454
009fc440	cmp w6,#0x1
009fc444	b.lt 0x009fc4ec
009fc448	ldr x5,[sp, #0x8]
009fc44c	lsr x9,x5,#0x1f
009fc450	cbz x9,0x009fc4f0
009fc454	mov x6,#-0x1
009fc458	cbnz x19,0x009fc4c0
009fc45c	b 0x009fc3a0
009fc460	bl 0x00c342a0
009fc464	adrp x0,0x2b2000
009fc468	adrp x2,0x29f000
009fc46c	add x0,x0,#0x42
009fc470	add x2,x2,#0xf1d
009fc474	mov w1,#0x167
009fc478	bl 0x00c342b0
009fc47c	mov w0,#0x20
009fc480	orr w1,wzr,#0x78
009fc484	mov x2,xzr
009fc488	bl 0x00c342c0
009fc48c	mov w6,#0xffffffff
009fc490	b 0x009fc3a0
009fc494	cbz x9,0x009fc4bc
009fc498	mov w1,#0x83
009fc49c	add x7,sp,#0x8
009fc4a0	mov x0,x22
009fc4a4	mov x2,x21
009fc4a8	mov x3,x20
009fc4ac	mov w4,wzr
009fc4b0	mov x5,xzr
009fc4b4	blr x9
009fc4b8	mov x6,x0
009fc4bc	cbz x19,0x009fc3a0
009fc4c0	ldr x8,[sp, #0x8]
009fc4c4	str x8,[x19]
009fc4c8	b 0x009fc3a0
009fc4cc	orr w1,wzr,#0x3
009fc4d0	mov w5,#0x1
009fc4d4	mov x0,x22
009fc4d8	mov x2,x21
009fc4dc	mov w3,w20
009fc4e0	mov x4,xzr
009fc4e4	blr x8
009fc4e8	b 0x009fc3e0
009fc4ec	sxtw x5,w6
009fc4f0	mov w1,#0x83
009fc4f4	mov x0,x22
009fc4f8	mov x2,x21
009fc4fc	mov w3,w20
009fc500	mov x4,xzr
009fc504	blr x8
009fc508	mov x6,x0
009fc50c	cmp x0,#0x1
009fc510	b.lt 0x009fc4bc
009fc514	str x6,[sp, #0x8]
009fc518	mov w6,#0x1
009fc51c	cbnz x19,0x009fc4c0
009fc520	b 0x009fc3a0
