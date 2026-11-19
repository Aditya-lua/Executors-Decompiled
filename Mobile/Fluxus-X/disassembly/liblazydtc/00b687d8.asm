; ossl_cipher_hw_chunked_cfb128 @ 00b687d8
00b687d8	sub sp,sp,#0x50
00b687dc	stp x24,x23,[sp, #0x10]
00b687e0	stp x22,x21,[sp, #0x20]
00b687e4	stp x20,x19,[sp, #0x30]
00b687e8	stp x29,x30,[sp, #0x40]
00b687ec	add x29,sp,#0x40
00b687f0	cbz x3,0x00b68868
00b687f4	ldr w8,[x0, #0xa0]
00b687f8	lsr x9,x3,#0x1e
00b687fc	cmp x9,#0x0
00b68800	mov w9,#0x40000000
00b68804	mov x19,x3
00b68808	mov x20,x2
00b6880c	mov x21,x1
00b68810	mov x22,x0
00b68814	csel x24,x3,x9,eq
00b68818	add x23,x0,#0x20
00b6881c	str w8,[sp, #0xc]
00b68820	ldrb w8,[x22, #0x6c]
00b68824	ldr x3,[x22, #0xb0]
00b68828	ldr x7,[x22, #0x30]
00b6882c	add x5,sp,#0xc
00b68830	ubfx w6,w8,#0x1,#0x1
00b68834	mov x0,x20
00b68838	mov x1,x21
00b6883c	mov x2,x19
00b68840	mov x4,x23
00b68844	bl 0x00c3e300
00b68848	ldr w8,[sp, #0xc]
00b6884c	sub x19,x19,x24
00b68850	cmp x19,x24
00b68854	add x20,x20,x24
00b68858	add x21,x21,x24
00b6885c	csel x24,x19,x24,cc
00b68860	str w8,[x22, #0xa0]
00b68864	cbnz x19,0x00b6881c
00b68868	ldp x29,x30,[sp, #0x40]
00b6886c	ldp x20,x19,[sp, #0x30]
00b68870	ldp x22,x21,[sp, #0x20]
00b68874	ldp x24,x23,[sp, #0x10]
00b68878	mov w0,#0x1
00b6887c	add sp,sp,#0x50
00b68880	ret
