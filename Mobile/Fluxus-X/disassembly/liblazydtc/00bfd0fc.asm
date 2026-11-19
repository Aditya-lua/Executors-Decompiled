; std::__ndk1::ctype_byname<char>::ctype_byname @ 00bfd0fc
00bfd0fc	paciasp
00bfd100	sub sp,sp,#0x40
00bfd104	stp x29,x30,[sp, #0x20]
00bfd108	stp x20,x19,[sp, #0x30]
00bfd10c	add x29,sp,#0x20
00bfd110	adrp x8,0x78a000
00bfd114	add x8,x8,#0x8e8
00bfd118	sub x9,x2,#0x1
00bfd11c	str x8,[x0, #0x10]
00bfd120	adrp x8,0xcb5000
00bfd124	mov x20,x1
00bfd128	ldr x8,[x8, #0xe20]
00bfd12c	strb wzr,[x0, #0x18]
00bfd130	mov x19,x0
00bfd134	add x8,x8,#0x10
00bfd138	stp x8,x9,[x0]
00bfd13c	ldrb w8,[x1]
00bfd140	ldr x9,[x1, #0x10]
00bfd144	tst w8,#0x1
00bfd148	csinc x1,x9,x1,ne
00bfd14c	mov w0,#0x1fbf
00bfd150	mov x2,xzr
00bfd154	bl 0x00c43890
00bfd158	str x0,[x19, #0x20]
00bfd15c	cbz x0,0x00bfd174
00bfd160	ldp x20,x19,[sp, #0x30]
00bfd164	ldp x29,x30,[sp, #0x20]
00bfd168	add sp,sp,#0x40
00bfd16c	autiasp
00bfd170	ret
00bfd174	adrp x0,0x2c4000
00bfd178	add x0,x0,#0x99c
00bfd17c	add x8,sp,#0x8
00bfd180	mov x1,x20
00bfd184	add x20,sp,#0x8
00bfd188	bl 0x00c304a0
00bfd18c	ldrb w8,[sp, #0x8]
00bfd190	ldr x9,[sp, #0x18]
00bfd194	tst w8,#0x1
00bfd198	csinc x0,x9,x20,ne
00bfd19c	bl 0x00c43d00
00bfd1a0	ldrb w8,[sp, #0x8]
00bfd1a4	mov x20,x0
00bfd1a8	tbz w8,#0x0,0x00bfd1c8
00bfd1ac	ldr x8,[sp, #0x8]
00bfd1b0	ldr x0,[sp, #0x18]
00bfd1b4	and x1,x8,#-0x2
00bfd1b8	bl 0x00c2fe80
00bfd1bc	b 0x00bfd1c8
00bfd1c8	mov x0,x19
00bfd1cc	bl 0x00c444b0
00bfd1d0	mov x0,x20
00bfd1d4	bl 0x00c2c090
