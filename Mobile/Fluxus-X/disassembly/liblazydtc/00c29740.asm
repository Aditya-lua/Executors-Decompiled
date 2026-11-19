; __cxa_current_exception_type @ 00c29740
00c29740	paciasp
00c29744	stp x29,x30,[sp, #-0x10]!
00c29748	mov x29,sp
00c2974c	bl 0x00c44730
00c29750	cbz x0,0x00c29784
00c29754	ldr x8,[x0]
00c29758	cbz x8,0x00c29780
00c2975c	mov x10,#0x2b2b
00c29760	ldr x9,[x8, #0x60]
00c29764	movk x10,#0x4743, LSL #16
00c29768	movk x10,#0x4c4e, LSL #32
00c2976c	movk x10,#0x43, LSL #48
00c29770	cmp x10,x9, LSR #0x8
00c29774	b.ne 0x00c29780
00c29778	ldr x0,[x8, #0x10]
00c2977c	b 0x00c29784
00c29780	mov x0,xzr
00c29784	ldp x29,x30,[sp], #0x10
00c29788	autiasp
00c2978c	ret
