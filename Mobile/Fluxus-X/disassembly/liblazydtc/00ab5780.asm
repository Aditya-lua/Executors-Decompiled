; PEM_write_PUBKEY @ 00ab5780
00ab5780	sub sp,sp,#0x40
00ab5784	stp x20,x19,[sp, #0x20]
00ab5788	mov x20,x1
00ab578c	adrp x2,0x2b9000
00ab5790	adrp x3,0x2a2000
00ab5794	mov x19,x0
00ab5798	add x2,x2,#0x56f
00ab579c	add x3,x3,#0xb58
00ab57a0	mov w1,#0x86
00ab57a4	mov x0,x20
00ab57a8	mov x4,xzr
00ab57ac	str x21,[sp, #0x10]
00ab57b0	stp x29,x30,[sp, #0x30]
00ab57b4	add x29,sp,#0x30
00ab57b8	bl 0x00c3b960
00ab57bc	mov x21,x0
00ab57c0	bl 0x00c3b7d0
00ab57c4	cbz w0,0x00ab57e8
00ab57c8	mov x0,x21
00ab57cc	mov x1,x19
00ab57d0	bl 0x00c3b880
00ab57d4	mov w19,w0
00ab57d8	mov x0,x21
00ab57dc	bl 0x00c3b890
00ab57e0	mov w0,w19
00ab57e4	b 0x00ab5820
00ab57e8	mov x0,x21
00ab57ec	bl 0x00c3b890
00ab57f0	adrp x0,0xcb5000
00ab57f4	ldr x0,[x0, #0x4c0]
00ab57f8	adrp x1,0x2da000
00ab57fc	add x1,x1,#0x514
00ab5800	mov x2,x19
00ab5804	mov x3,x20
00ab5808	mov x4,xzr
00ab580c	mov x5,xzr
00ab5810	mov w6,wzr
00ab5814	mov x7,xzr
00ab5818	str xzr,[sp]
00ab581c	bl 0x00c36060
00ab5820	ldp x29,x30,[sp, #0x30]
00ab5824	ldp x20,x19,[sp, #0x20]
00ab5828	ldr x21,[sp, #0x10]
00ab582c	add sp,sp,#0x40
00ab5830	ret
