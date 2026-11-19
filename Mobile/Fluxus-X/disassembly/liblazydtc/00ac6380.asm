; FUN_00ac6380 @ 00ac6380
00ac6380	stp x26,x25,[sp, #-0x50]!
00ac6384	stp x20,x19,[sp, #0x30]
00ac6388	mov x19,x0
00ac638c	mov x0,x1
00ac6390	stp x24,x23,[sp, #0x10]
00ac6394	stp x22,x21,[sp, #0x20]
00ac6398	stp x29,x30,[sp, #0x40]
00ac639c	add x29,sp,#0x40
00ac63a0	mov x20,x1
00ac63a4	bl 0x00c325e0
00ac63a8	subs w8,w0,#0x1
00ac63ac	orr w9,wzr,#0x18
00ac63b0	smull x8,w8,w9
00ac63b4	add x8,x8,#0x20
00ac63b8	mov w9,#0x20
00ac63bc	adrp x1,0x2d8000
00ac63c0	mov w22,w0
00ac63c4	csel x0,x9,x8,lt
00ac63c8	add x1,x1,#0x6ba
00ac63cc	mov w2,#0x141
00ac63d0	bl 0x00c32320
00ac63d4	mov x21,x0
00ac63d8	cbz x0,0x00ac64bc
00ac63dc	mov x0,x20
00ac63e0	bl 0x00c35350
00ac63e4	ldrb w8,[x21, #0x4]
00ac63e8	cmp w22,#0x1
00ac63ec	and w8,w8,#0xfe
00ac63f0	strb w8,[x21, #0x4]
00ac63f4	b.lt 0x00ac645c
00ac63f8	mov x24,xzr
00ac63fc	mov w23,wzr
00ac6400	sxtw x25,w22
00ac6404	add x26,x21,#0x14
00ac6408	mov x0,x20
00ac640c	mov w1,w24
00ac6410	bl 0x00c32610
00ac6414	ldr q0,[x0]
00ac6418	stur q0,[x26, #-0xc]
00ac641c	ldr x8,[x0, #0x10]
00ac6420	stur x8,[x26, #0x4]
00ac6424	ldrb w8,[x26]
00ac6428	ldrb w9,[x21, #0x4]
00ac642c	and w8,w8,#0x1
00ac6430	orr w8,w8,w9
00ac6434	strb w8,[x21, #0x4]
00ac6438	ldur w8,[x26, #-0xc]
00ac643c	cbz x24,0x00ac6448
00ac6440	cmp w8,w23
00ac6444	b.eq 0x00ac6464
00ac6448	add x24,x24,#0x1
00ac644c	cmp x24,x25
00ac6450	add x26,x26,#0x18
00ac6454	mov w23,w8
00ac6458	b.lt 0x00ac6408
00ac645c	str w22,[x21]
00ac6460	b 0x00ac64bc
00ac6464	adrp x20,0x2d8000
00ac6468	add x20,x20,#0x6ba
00ac646c	mov w2,#0x14c
00ac6470	mov x0,x21
00ac6474	mov x1,x20
00ac6478	bl 0x00c32310
00ac647c	bl 0x00c342a0
00ac6480	adrp x2,0x2c0000
00ac6484	add x2,x2,#0x46c
00ac6488	mov w1,#0x14d
00ac648c	mov x0,x20
00ac6490	bl 0x00c342b0
00ac6494	mov x0,x19
00ac6498	mov w1,w23
00ac649c	bl 0x00c3f880
00ac64a0	adrp x2,0x2d8000
00ac64a4	mov x3,x0
00ac64a8	add x2,x2,#0x6db
00ac64ac	mov w0,#0x37
00ac64b0	mov w1,#0x6c
00ac64b4	bl 0x00c342c0
00ac64b8	mov x21,xzr
00ac64bc	mov x0,x21
00ac64c0	ldp x29,x30,[sp, #0x40]
00ac64c4	ldp x20,x19,[sp, #0x30]
00ac64c8	ldp x22,x21,[sp, #0x20]
00ac64cc	ldp x24,x23,[sp, #0x10]
00ac64d0	ldp x26,x25,[sp], #0x50
00ac64d4	ret
