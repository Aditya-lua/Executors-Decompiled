; ENGINE_get_cipher @ 00a532ec
00a532ec	sub sp,sp,#0x20
00a532f0	stp x29,x30,[sp, #0x10]
00a532f4	ldr x8,[x0, #0x38]
00a532f8	add x29,sp,#0x10
00a532fc	cbz x8,0x00a5331c
00a53300	mov w3,w1
00a53304	add x1,sp,#0x8
00a53308	mov x2,xzr
00a5330c	blr x8
00a53310	cbz w0,0x00a5331c
00a53314	ldr x0,[sp, #0x8]
00a53318	b 0x00a5334c
00a5331c	bl 0x00c342a0
00a53320	adrp x0,0x2c9000
00a53324	adrp x2,0x2af000
00a53328	add x0,x0,#0x82c
00a5332c	add x2,x2,#0xef4
00a53330	mov w1,#0x4e
00a53334	bl 0x00c342b0
00a53338	mov w0,#0x26
00a5333c	mov w1,#0x92
00a53340	mov x2,xzr
00a53344	bl 0x00c342c0
00a53348	mov x0,xzr
00a5334c	ldp x29,x30,[sp, #0x10]
00a53350	add sp,sp,#0x20
00a53354	ret
