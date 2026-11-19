; BIO_write_ex @ 009fc524
009fc524	stp x20,x19,[sp, #-0x20]!
009fc528	stp x29,x30,[sp, #0x10]
009fc52c	add x29,sp,#0x10
009fc530	mov x19,x2
009fc534	mov x20,x0
009fc538	bl 0x009fc30c
009fc53c	cmp w0,#0x0
009fc540	b.le 0x009fc54c
009fc544	mov w0,#0x1
009fc548	b 0x009fc560
009fc54c	cmp x20,#0x0
009fc550	cset w8,ne
009fc554	cmp x19,#0x0
009fc558	cset w9,eq
009fc55c	and w0,w8,w9
009fc560	ldp x29,x30,[sp, #0x10]
009fc564	ldp x20,x19,[sp], #0x20
009fc568	ret
