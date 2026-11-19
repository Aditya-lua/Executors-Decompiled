; X509V3_EXT_get_nid @ 00af5764
00af5764	sub sp,sp,#0x90
00af5768	stp x29,x30,[sp, #0x80]
00af576c	add x29,sp,#0x80
00af5770	add x8,sp,#0x8
00af5774	str x19,[sp, #0x70]
00af5778	stur x8,[x29, #-0x8]
00af577c	tbnz w0,#0x1f,0x00af57b0
00af5780	adrp x1,0xcc9000
00af5784	adrp x4,0xaf5000
00af5788	str w0,[sp, #0x8]
00af578c	add x1,x1,#0x5d0
00af5790	add x4,x4,#0xdc4
00af5794	sub x0,x29,#0x8
00af5798	mov w2,#0x31
00af579c	mov w3,#0x8
00af57a0	bl 0x00c35830
00af57a4	cbz x0,0x00af57b8
00af57a8	ldr x0,[x0]
00af57ac	b 0x00af57dc
00af57b0	mov x0,xzr
00af57b4	b 0x00af57dc
00af57b8	adrp x19,0xd22000
00af57bc	ldr x0,[x19, #0x7d8]
00af57c0	cbz x0,0x00af57dc
00af57c4	add x1,sp,#0x8
00af57c8	bl 0x00c34760
00af57cc	ldr x8,[x19, #0x7d8]
00af57d0	mov w1,w0
00af57d4	mov x0,x8
00af57d8	bl 0x00c32610
00af57dc	ldp x29,x30,[sp, #0x80]
00af57e0	ldr x19,[sp, #0x70]
00af57e4	add sp,sp,#0x90
00af57e8	ret
