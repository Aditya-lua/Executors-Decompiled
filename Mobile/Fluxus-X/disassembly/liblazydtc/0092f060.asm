; curl_multi_assign @ 0092f060
0092f060	sub sp,sp,#0x30
0092f064	stp x20,x19,[sp, #0x10]
0092f068	stp x29,x30,[sp, #0x20]
0092f06c	add x29,sp,#0x20
0092f070	mrs x20,tpidr_el0
0092f074	ldr x8,[x20, #0x28]
0092f078	mov x19,x2
0092f07c	cmn w1,#0x1
0092f080	str x8,[sp, #0x8]
0092f084	str w1,[sp, #0x4]
0092f088	b.eq 0x0092f0b0
0092f08c	add x0,x0,#0xf8
0092f090	add x1,sp,#0x4
0092f094	mov w2,#0x4
0092f098	bl 0x009167a8
0092f09c	mov x8,x0
0092f0a0	cbz x0,0x0092f0b0
0092f0a4	mov w0,wzr
0092f0a8	str x19,[x8, #0x38]
0092f0ac	b 0x0092f0b4
0092f0b0	mov w0,#0x5
0092f0b4	ldr x8,[x20, #0x28]
0092f0b8	ldr x9,[sp, #0x8]
0092f0bc	cmp x8,x9
0092f0c0	b.ne 0x0092f0d4
0092f0c4	ldp x29,x30,[sp, #0x20]
0092f0c8	ldp x20,x19,[sp, #0x10]
0092f0cc	add sp,sp,#0x30
0092f0d0	ret
0092f0d4	bl 0x00c2fec0
