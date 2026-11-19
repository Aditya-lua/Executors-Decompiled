; dtls1_record_bitmap_update @ 009ca64c
009ca64c	str x21,[sp, #-0x30]!
009ca650	mov w8,#0x1cf8
009ca654	stp x20,x19,[sp, #0x10]
009ca658	add x20,x0,x8
009ca65c	add x21,x1,#0x8
009ca660	mov x19,x1
009ca664	mov x0,x20
009ca668	mov x1,x21
009ca66c	stp x29,x30,[sp, #0x20]
009ca670	add x29,sp,#0x20
009ca674	bl 0x009ca5f0
009ca678	cmp w0,#0x1
009ca67c	b.lt 0x009ca69c
009ca680	cmp w0,#0x3f
009ca684	b.hi 0x009ca6c4
009ca688	ldr x8,[x19]
009ca68c	mov w9,w0
009ca690	lsl x8,x8,x9
009ca694	orr x8,x8,#0x1
009ca698	b 0x009ca6c8
009ca69c	neg w8,w0
009ca6a0	cmp w8,#0x3f
009ca6a4	b.hi 0x009ca6d4
009ca6a8	ldr x9,[x19]
009ca6ac	mov w8,w8
009ca6b0	mov w10,#0x1
009ca6b4	lsl x8,x10,x8
009ca6b8	orr x8,x9,x8
009ca6bc	str x8,[x19]
009ca6c0	b 0x009ca6d4
009ca6c4	mov w8,#0x1
009ca6c8	str x8,[x19]
009ca6cc	ldr x8,[x20]
009ca6d0	str x8,[x21]
009ca6d4	ldp x29,x30,[sp, #0x20]
009ca6d8	ldp x20,x19,[sp, #0x10]
009ca6dc	ldr x21,[sp], #0x30
009ca6e0	ret
