; tls_check_sigalg_curve @ 009c2148
009c2148	str x23,[sp, #-0x40]!
009c214c	stp x22,x21,[sp, #0x10]
009c2150	stp x20,x19,[sp, #0x20]
009c2154	stp x29,x30,[sp, #0x30]
009c2158	ldr x8,[x0, #0x898]
009c215c	mov x19,x0
009c2160	mov w20,w1
009c2164	add x29,sp,#0x30
009c2168	ldr x21,[x8, #0x198]
009c216c	cbz x21,0x009c217c
009c2170	ldr x22,[x8, #0x1a0]
009c2174	cbnz x22,0x009c2188
009c2178	b 0x009c21c4
009c217c	adrp x21,0x74c000
009c2180	add x21,x21,#0xd90
009c2184	orr w22,wzr,#0x1c
009c2188	mov x23,xzr
009c218c	ldrh w1,[x21, x23, LSL #0x1]
009c2190	mov x0,x19
009c2194	bl 0x009c21e4
009c2198	cbz x0,0x009c21b8
009c219c	ldr w8,[x0, #0x14]
009c21a0	cmp w8,#0x198
009c21a4	b.ne 0x009c21b8
009c21a8	ldr w8,[x0, #0x20]
009c21ac	cbz w8,0x009c21b8
009c21b0	cmp w8,w20
009c21b4	b.eq 0x009c21dc
009c21b8	add x23,x23,#0x1
009c21bc	cmp x23,x22
009c21c0	b.cc 0x009c218c
009c21c4	mov w0,wzr
009c21c8	ldp x29,x30,[sp, #0x30]
009c21cc	ldp x20,x19,[sp, #0x20]
009c21d0	ldp x22,x21,[sp, #0x10]
009c21d4	ldr x23,[sp], #0x40
009c21d8	ret
009c21dc	mov w0,#0x1
009c21e0	b 0x009c21c8
