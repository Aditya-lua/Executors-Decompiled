; X509V3_EXT_get @ 00af57ec
00af57ec	sub sp,sp,#0x90
00af57f0	str x19,[sp, #0x70]
00af57f4	stp x29,x30,[sp, #0x80]
00af57f8	add x29,sp,#0x80
00af57fc	bl 0x00c32b70
00af5800	bl 0x00c37750
00af5804	cbz w0,0x00af5844
00af5808	add x8,sp,#0x8
00af580c	stur x8,[x29, #-0x8]
00af5810	tbnz w0,#0x1f,0x00af5844
00af5814	adrp x1,0xcc9000
00af5818	adrp x4,0xaf5000
00af581c	str w0,[sp, #0x8]
00af5820	add x1,x1,#0x5d0
00af5824	add x4,x4,#0xdc4
00af5828	sub x0,x29,#0x8
00af582c	mov w2,#0x31
00af5830	mov w3,#0x8
00af5834	bl 0x00c35830
00af5838	cbz x0,0x00af5858
00af583c	ldr x0,[x0]
00af5840	b 0x00af5848
00af5844	mov x0,xzr
00af5848	ldp x29,x30,[sp, #0x80]
00af584c	ldr x19,[sp, #0x70]
00af5850	add sp,sp,#0x90
00af5854	ret
00af5858	adrp x19,0xd22000
00af585c	ldr x0,[x19, #0x7d8]
00af5860	cbz x0,0x00af5848
00af5864	add x1,sp,#0x8
00af5868	bl 0x00c34760
00af586c	ldr x8,[x19, #0x7d8]
00af5870	mov w1,w0
00af5874	mov x0,x8
00af5878	bl 0x00c32610
00af587c	b 0x00af5848
