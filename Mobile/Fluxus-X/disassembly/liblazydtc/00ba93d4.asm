; mbedtls_oid_get_extended_key_usage @ 00ba93d4
00ba93d4	str x19,[sp, #-0x20]!
00ba93d8	stp x29,x30,[sp, #0x10]
00ba93dc	add x29,sp,#0x10
00ba93e0	mov x19,x1
00ba93e4	cbz x0,0x00ba94d0
00ba93e8	ldr x8,[x0, #0x8]
00ba93ec	cmp x8,#0x9
00ba93f0	b.eq 0x00ba94b8
00ba93f4	cmp x8,#0x8
00ba93f8	b.ne 0x00ba94d0
00ba93fc	ldr x9,[x0, #0x10]
00ba9400	mov x10,#0x62b
00ba9404	movk x10,#0x501, LSL #16
00ba9408	movk x10,#0x705, LSL #32
00ba940c	ldr x8,[x9]
00ba9410	movk x10,#0x103, LSL #48
00ba9414	cmp x8,x10
00ba9418	adrp x8,0xcac000
00ba941c	add x8,x8,#0x18
00ba9420	b.eq 0x00ba9504
00ba9424	ldr x10,[x9]
00ba9428	mov x11,#0x62b
00ba942c	movk x11,#0x501, LSL #16
00ba9430	movk x11,#0x705, LSL #32
00ba9434	movk x11,#0x203, LSL #48
00ba9438	cmp x10,x11
00ba943c	b.eq 0x00ba94e8
00ba9440	ldr x10,[x9]
00ba9444	mov x11,#0x62b
00ba9448	movk x11,#0x501, LSL #16
00ba944c	movk x11,#0x705, LSL #32
00ba9450	movk x11,#0x303, LSL #48
00ba9454	cmp x10,x11
00ba9458	b.eq 0x00ba94f0
00ba945c	ldr x10,[x9]
00ba9460	mov x11,#0x62b
00ba9464	movk x11,#0x501, LSL #16
00ba9468	movk x11,#0x705, LSL #32
00ba946c	movk x11,#0x403, LSL #48
00ba9470	cmp x10,x11
00ba9474	b.eq 0x00ba94f8
00ba9478	ldr x10,[x9]
00ba947c	mov x11,#0x62b
00ba9480	movk x11,#0x501, LSL #16
00ba9484	movk x11,#0x705, LSL #32
00ba9488	movk x11,#0x803, LSL #48
00ba948c	cmp x10,x11
00ba9490	b.eq 0x00ba9500
00ba9494	ldr x9,[x9]
00ba9498	mov x10,#0x62b
00ba949c	movk x10,#0x501, LSL #16
00ba94a0	movk x10,#0x705, LSL #32
00ba94a4	movk x10,#0x903, LSL #48
00ba94a8	cmp x9,x10
00ba94ac	b.ne 0x00ba94d0
00ba94b0	add x8,x8,#0xa0
00ba94b4	b 0x00ba9504
00ba94b8	ldr x1,[x0, #0x10]
00ba94bc	adrp x0,0x2dd000
00ba94c0	add x0,x0,#0x16e
00ba94c4	mov w2,#0x9
00ba94c8	bl 0x00c300b0
00ba94cc	cbz w0,0x00ba94d8
00ba94d0	mov w0,#0xffffffd2
00ba94d4	b 0x00ba9510
00ba94d8	adrp x8,0xcac000
00ba94dc	add x8,x8,#0x18
00ba94e0	add x8,x8,#0xc0
00ba94e4	b 0x00ba9504
00ba94e8	add x8,x8,#0x20
00ba94ec	b 0x00ba9504
00ba94f0	add x8,x8,#0x40
00ba94f4	b 0x00ba9504
00ba94f8	add x8,x8,#0x60
00ba94fc	b 0x00ba9504
00ba9500	add x8,x8,#0x80
00ba9504	ldr x8,[x8, #0x18]
00ba9508	mov w0,wzr
00ba950c	str x8,[x19]
00ba9510	ldp x29,x30,[sp, #0x10]
00ba9514	ldr x19,[sp], #0x20
00ba9518	ret
